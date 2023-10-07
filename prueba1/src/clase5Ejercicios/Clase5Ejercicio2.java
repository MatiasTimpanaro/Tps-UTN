package clase5Ejercicios;

import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.io.IOException;
import java.nio.file.Files;

public class Clase5Ejercicio2 {
public static void main(String[] args) {
	
	//2. En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una lista
	//de productos, arme los objetos correspondientes y con el método de carrito

	String listaDeProductos = "listaDeProductos.txt";
	Clase5Producto p1 = new Clase5Producto ("", "", "", 0);
	Clase5Producto p2 = new Clase5Producto ("", "", "", 0);
	Clase5Producto p3 = new Clase5Producto ("", "", "", 0);
	Clase5Carrito c1 = new Clase5Carrito ("", "", "", LocalDateTime.of(2023,10,06,20,18,00), 0);	
	int contador = 0;
	float precioFinalContador = 0;
	 
	 
	try {
		for (String linea : Files.readAllLines(Paths.get(listaDeProductos))) {
			String[] datos = linea.split(", ");
		
			if (datos.length == 3) {
			
            String nombre = datos[0];
            String codigo = datos[1];
            String precio = datos[2];
            float precioFinal = Float.parseFloat(datos[2]);
           
            if (contador == 0) {
                p1 = new Clase5Producto(nombre, codigo, precio, precioFinal);
            } else if (contador == 1) {
                p2 = new Clase5Producto(nombre, codigo, precio, precioFinal);
            } else if (contador == 2) {
                p3 = new Clase5Producto(nombre, codigo, precio, precioFinal);
            }
            precioFinalContador = precioFinalContador + precioFinal;
           
            c1.setCostoFinalCarrito(precioFinalContador);
            
            contador++; 
		}	
	}
		
		c1.setProducto1Carrito(p1.getNombreProducto());
		c1.setProducto2Carrito(p2.getNombreProducto());
		c1.setProducto3Carrito(p3.getNombreProducto());
				
		System.out.println("Estas llevando estos productos:");
		System.out.println(p1.getNombreProducto() + ", " + p2.getNombreProducto() + ", "+p3.getNombreProducto() +".");
		System.out.println("Los codigos de son: \n" + p1.getCodigoProducto() + ", " + p2.getCodigoProducto() + ", " + p3.getCodigoProducto());
		System.out.println("Valen lo siguiente: \n$" + p1.getPrecioFinalProducto() + ", $" + p2.getPrecioFinalProducto() + ", $" + p3.getPrecioFinalProducto());
		System.out.println("El valor total de todos los productos es de: $" + c1.getCostoFinalCarrito());
	}
	 catch (IOException e) {
		System.out.println("TODO LO QUE PUDO HABER FALLADO, FALLó");
	}
	
}
}