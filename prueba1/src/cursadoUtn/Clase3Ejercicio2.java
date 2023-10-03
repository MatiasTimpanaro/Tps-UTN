package cursadoUtn;

public class Clase3Ejercicio2 {
	public static void main(String[] args) {
		
		//2. Genere una clase que tenga los métodos para realizar la codificación y decodificación
		//de un string, dado un número de desplazamiento.
	
		String palabra = "hola como estas?";
		int desplazar = 1; //indicar cuanto se quiere desplazar
		
		String encode = codificar (palabra, desplazar);
		String decode = decodificar (encode, desplazar);
		System.out.println("el encode quedo: \"" + encode + "\" . al decodificarlo queda: \"" + decode + "\"");
		
}
	
public static String codificar (String texto, int desplazamiento) {  //ENCODING
	
	char [] arreglo = texto.toCharArray();
	 	
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo [i] != 'z') {
			arreglo [i] = (char) (arreglo [i] + (char) desplazamiento);
			}
			else {
				arreglo[i] = (char) (arreglo[i] - (26 - desplazamiento)); //si es 'z', vuelve a 'a'
			}															  //si sube "desplazar" va cambiando a la par

		}
		String encoding = String.valueOf(arreglo);
		return encoding;
	}

public static String decodificar (String texto, int desplazamiento) {  //DECODING
	
	char [] arreglo = texto.toCharArray();
	
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo [i] != 'a') {
			arreglo [i] = (char) (arreglo [i] - (char) desplazamiento);
			}
			else {
				arreglo[i] = (char) (arreglo[i] + (26 - desplazamiento)); //si es 'a', vuelve a 'z'
			}															  //si sube "desplazar" va cambiando a la par

		}
		String decoding = String.valueOf(arreglo);
		return decoding;
	}
}

