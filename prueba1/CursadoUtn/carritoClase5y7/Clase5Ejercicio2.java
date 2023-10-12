package carritoClase5y7;

import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.io.IOException;
import java.nio.file.Files;

public class Clase5Ejercicio2 {
public static void main(String[] args) {
	
	//2. En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una lista
	//de productos, arme los objetos correspondientes y con el método de carrito

	String listaDeProductos = "listaDeProductos.txt";
	Producto p1 = new Producto ("", "", 0);
	Producto p2 = new Producto ("", "", 0);
	Producto p3 = new Producto ("", "", 0);
	int contador = 0;
	
	 
	try {
		for (String linea : Files.readAllLines(Paths.get(listaDeProductos))) {
			String[] datos = linea.split(", ");
		
			if (datos.length == 3) {
			
            String nombre = datos[0];
            String codigo = datos[1];
            float precio = Float.parseFloat(datos[2]);
           
           
            if (contador == 0) {
                p1 = new Producto(nombre, codigo, precio);
            } else if (contador == 1) {
                p2 = new Producto(nombre, codigo, precio);
            } else if (contador == 2) {
                p3 = new Producto(nombre, codigo, precio);
            }
                       
            contador++; 
		}	
	}
		Carrito c1 = new Carrito (p1, p2, p3, LocalDateTime.of(2023,10,06,20,18,00));
				
				
		System.out.println("Estas llevando estos productos:");
		System.out.println(p1.getNombreProducto() + ", " + p2.getNombreProducto() + ", "+p3.getNombreProducto() +".");
		System.out.println("Los codigos de son: \n" + p1.getCodigoProducto() + ", " + p2.getCodigoProducto() + ", " + p3.getCodigoProducto());
		System.out.println("Valen lo siguiente: \n$" + p1.PrecioFinalProducto() + ", $" + p2.PrecioFinalProducto() + ", $" + p3.PrecioFinalProducto());
		System.out.println("El valor total de todos los productos es de: $" + c1.CostoFinalCarrito());
	}
	 catch (IOException e) {
		System.out.println("TODO LO QUE PUDO HABER FALLADO, FALLó");
	}
	
}
}