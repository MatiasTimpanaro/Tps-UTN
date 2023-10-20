package carritoClase5y7;

import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;

public class Clase5Ejercicio2 {
public static void main(String[] args) {
	
	//2. En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una lista
	//de productos, arme los objetos correspondientes y con el método de carrito

	String listaDeProductos = "listaDeProductos.txt";
	Carrito c1 = new Carrito ( null , LocalDateTime.of(2023,10,06,20,18,00));
	
	int contador = 0;
	
	try {
		for (String linea : Files.readAllLines(Paths.get(listaDeProductos))) {
			String[] datos = linea.split(", ");
		
			if (contador < datos.length) {
			
            String nombre = datos[0];
            String codigo = datos[1];
            float precio = Float.parseFloat(datos[2]);
                             
    	   c1.agregarProducto(new Producto(nombre, codigo, precio));
    	 
            contador++; 
            
		}	
	}
		
	Descuento desFijo = new DescuentoFijo(690);	//Descuento fijo de $690
	Descuento desPorcentaje = new DescuentoPorcentaje ((float) 0.50); //Descuento por porcentaje del 50%
	Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope (0.40f); //Tope de descuento, pasado este porcentaje, no se aplica el descuento
	desPorcentajeConTope.setValorDesc(0.30f);//valor actual del descuento con tope

		
	System.out.println("El valor total de todos los productos es de: $" + c1.CostoFinalCarrito(desFijo)); //En "c1.CostoFinalCarrito())" colocar que tipo 
																										//de descuento es (desPorcentaje) - (desFijo) -
																										//(desPorcentajeConTope)
	}																									   
																								   		  
	catch (IOException e
			 ) {																						
		System.out.println("TODO LO QUE PUDO HABER FALLADO, FALLó");
	}
	
}
}