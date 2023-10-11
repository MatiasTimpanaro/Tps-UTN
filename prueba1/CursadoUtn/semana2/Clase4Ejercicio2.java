package semana2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;


public class Clase4Ejercicio2 {
	public static void main(String[] args) {
		
		
		//		2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
		//		contener números. El programa debe escribir por consola la suma de esos números
//		
		
//		String archivo = "numeros.txt" ;
//		
//		try {
//			for (String linea : Files.readAllLines(Paths.get(archivo))){
//							
//		String [] numerosStrings = linea.split(" ");
//		int [] numeros = new int [numerosStrings.length];
//		int sumatoria = 0;
//		
//		for (int i = 0; i < numerosStrings.length; i++) {
//		    numeros[i] = Integer.parseInt(numerosStrings[i]);
//		    sumatoria = (sumatoria + numeros[i]);		
//	
//		}
//		System.out.println(sumatoria);
//}
//		} catch (IOException e) {
//			System.out.println("todo lo que pudo haber fallado, falló");
//		}
		
				
				
				//a. Al programa anterior agreguele un parámetro para que la operación pueda ser
				//suma o multiplicación.
		
		
		
//		String archivo = "numeros.txt" ;
//		Scanner scn = new Scanner (System.in);
//		
//		System.out.println("Elija la operacion, presione \"s\" para suma o \"m\" para multiplicacion");
//		String operacion = scn.nextLine();
//		
//		try {
//			for (String linea : Files.readAllLines(Paths.get(archivo))){
//							
//		String [] numerosStrings = linea.split(" ");
//		int [] numeros = new int [numerosStrings.length];
//		int contadorSuma = 0;
//		int contadorMultiplicacion = 1;
//		for (int i = 0; i < numerosStrings.length; i++) {
//		    numeros[i] = Integer.parseInt(numerosStrings[i]);
//		    if (operacion.contains("s")) {
//		    	contadorSuma = (contadorSuma + numeros[i]);		
//		    }
//		    else if (operacion.contains("m")){
//		    	contadorMultiplicacion = (contadorMultiplicacion * numeros [i]);
//			}
//	
//		}
//		if (operacion.contains("s")) {
//			System.out.println(contadorSuma);
//		} else if (operacion.contains("m")) {
//				System.out.println(contadorMultiplicacion);
//			
//		}
//}
//		} catch (IOException e) {
//			System.out.println("todo lo que pudo haber fallado, falló");
//		}
		

	}
}
