package semana2;

import java.util.Scanner;
import java.util.Arrays;

public class Clase4Ejercicio1 {
	public static void main(String[] args) {
		
		
				//a. haga un main, donde por parámetro ponga 3 números y una letra que
				//represente ascendente o descendente y los muestre ordenados por tal criterio
		
		
//		int n1 = 3;
//		int n2 = 49;
//		int n3= 20;
//		String orden = "ascendente"; //si se quiere descentente, escribir "descendente"
//		
//	    int [] numeros  = new int [3];
//	    numeros [0] = n1;
//	    numeros [1] = n2;
//	    numeros [2] = n3;
//	    int contador = 0;
//
//	    for (int i = 0; i < numeros.length; i++) {
//	        for (int j = 1; j < (numeros.length - i); j++) {
//	            if (numeros[j - 1] > numeros[j] && orden.contains("ascendente")) {
//	            	contador = numeros[j - 1];
//	                numeros[j - 1] = numeros[j];
//	                numeros[j] = contador;
//	            }
//	            else if ( numeros[j - 1] < numeros[j] && orden.contains("descendente")) {
//		            	contador = numeros[j - 1];
//		                numeros[j - 1] = numeros[j];
//		                numeros[j] = contador;
//		            }
//		        
//		        }
//		    }
//		    System.out.println(Arrays.toString(numeros));
		
		    
		
//		    		b. haga lo mismo, pero solicitando los parámetros de a uno por consola
//		    
		
		
//			Scanner scn = new Scanner (System.in);
//			
//		    System.out.println("ingrese el primero numero: ");
//		    String n1 = scn.nextLine();
//		    
//		    System.out.println("ingrese el segundo numero: ");
//		    String n2 = scn.nextLine();
//		    
//		    System.out.println("ingrese el tercer numero: ");
//		    String n3= scn.nextLine();
//		    
//		    System.out.println("ingrese el orden (\"a\" para ascendente - \"d\" para descendente): ");
//			String orden = scn.nextLine(); // "a" para ascendente - "d" para descendente
//			
//		    int [] numeros  = new int [3];
//		    numeros [0] = Integer.parseInt(n1);
//		    numeros [1] = Integer.parseInt(n2);
//		    numeros [2] = Integer.parseInt(n3);
//		    int contador = 0;
//
//		    for (int i = 0; i < numeros.length; i++) {
//		        for (int j = 1; j < (numeros.length - i); j++) {
//		            if (numeros[j - 1] > numeros[j] && orden.contains("a")) {
//		            	contador = numeros[j - 1];
//		                numeros[j - 1] = numeros[j];
//		                numeros[j] = contador;
//		            	}
//		            else if ( numeros[j - 1] < numeros[j] && orden.contains("d")) {
//			            	contador = numeros[j - 1];
//			                numeros[j - 1] = numeros[j];
//			                numeros[j] = contador;
//			            }
//			        
//			        }
//			    }
//			    System.out.println(Arrays.toString(numeros));
			    
		
		
				   //c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b) 
				   //si no detecta ninguno. Vea si con una función puede evitar repetir código. 
			 
		
//		Scanner scn = new Scanner (System.in);
//				
//			    
//			    String n1 = "44";
//			   
//			    String n2 = "0";
//			    
//			    String n3= "10";
//			    
//			    
//			    int [] numeros  = new int [3];
//			    numeros [0] = Integer.parseInt(n1);
//			    numeros [1] = Integer.parseInt(n2);
//			    numeros [2] = Integer.parseInt(n3);
//			    			    
//			    for (int i = 0; i < numeros.length; i++) {
//					if (numeros[i] == 0) {
//						System.out.println("falta el valor del string nro " + (i+1) + " ,ingreselo:");
//						String faltante = scn.nextLine();
//						numeros [i] = Integer.parseInt(faltante);
//						
//					}
//				}
//			    System.out.println("ingrese el orden (\"a\" para ascendente - \"d\" para descendente): ");
//				String orden = scn.nextLine(); // "a" para ascendente - "d" para descendente
//				
//			    int contador = 0;
//
//			    for (int i = 0; i < numeros.length; i++) {
//			        for (int j = 1; j < (numeros.length - i); j++) {
//			            if (numeros[j - 1] > numeros[j] && orden.contains("a")) {
//			            	contador = numeros[j - 1];
//			                numeros[j - 1] = numeros[j];
//			                numeros[j] = contador;
//			            	}
//			            else if ( numeros[j - 1] < numeros[j] && orden.contains("d")) {
//				            	contador = numeros[j - 1];
//				                numeros[j - 1] = numeros[j];
//				                numeros[j] = contador;
//				            }
//				        
//				        }
//				    }
//				    System.out.println(Arrays.toString(numeros));
	}
}
