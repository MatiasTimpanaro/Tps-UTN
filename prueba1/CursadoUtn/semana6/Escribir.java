package semana6;

import java.util.Scanner;

public class Escribir {
	
		public void getEscritura() {
		Scanner scn = new Scanner(System.in);
		String opcion = "0";
		String mensaje;
		String nombre;
		Chat chat = new Chat ();
		
		System.out.println("\t ¡Bienvenido! ¿Chateamos?");
		System.out.println("Escriba su nombre:");
		nombre = scn.nextLine();
		
		while (opcion.equals("0")) {
			
			System.out.println("\n SELECCIONE OPCION:\n Para escribir mensaje presione 1\n Para recibir mensajes presione 2 \n Para finalizar presione 3");
			opcion = scn.nextLine();
			
				if (opcion.equals("1")) {
					System.out.println("\n Escriba su mensaje:");
					mensaje = scn.nextLine();
					chat.setChat(nombre + ": " + mensaje);
					opcion="0";
					
				}else if (opcion.equals("2")) {
					System.out.println("\n \t Sus mensajes:");
					chat.getChat();
					opcion="0";
					
				}else if(opcion.equals("3")){
					System.out.println("\n Programa finalizado");
					break;
				}
				else {
					System.out.println("\n OPCION INCORRECTA, SELECCIONE UNA OPCION VALIDA");
					opcion="0";
				}
		}
			scn.close();
	}
}
