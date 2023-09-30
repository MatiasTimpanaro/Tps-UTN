package cursadoUtn;

import java.util.Arrays;

public class EjerciciosSemana2 {
	public static void main(String[] args) {
		
		/* 
		1-a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
		el String

		
		String palabra = "banana";
		char letra = 'a';
		int contador = 0;
		
		for (int i= 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == letra) {
				contador++;
			}
				
		}
		System.out.println("La palabra es " + palabra + " y tiene " + contador + " letras a");	
		
		1-b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
		mismos y los retorne en un vector de 3

		
		int n1 = 3;
		int n2 = 49;
		int n3= 20;
		String orden = "ascendente"; //si se quiere descentente, escribir "descendente"
		
	    int [] numeros  = new int [3];
	    numeros [0] = n1;
	    numeros [1] = n2;
	    numeros [2] = n3;
	    int contador = 0;

	    for (int i = 0; i < numeros.length; i++) {
	        for (int j = 1; j < (numeros.length - i); j++) {
	            if (numeros[j - 1] > numeros[j] && orden.contains("ascendente")) {
	            	contador = numeros[j - 1];
	                numeros[j - 1] = numeros[j];
	                numeros[j] = contador;
	            }
	            else if ( numeros[j - 1] < numeros[j] && orden.contains("descendente")) {
		            	contador = numeros[j - 1];
		                numeros[j - 1] = numeros[j];
		                numeros[j] = contador;
		            }
		        
		        }
		    }
		    System.out.println(Arrays.toString(numeros));
		}		
}
	*/
	