package semana2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4Ejercicio3 {
public static void main(String[] args) {
	
	
//	3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
//	codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
//	otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
//	resultados deben estar en el archivo de salida
	
	
	String operacion = "codificar"; // si se quiere decodificar, escribir "decodificar"
	int desplazamiento = 1;
	String archivoEntrada = "encode.txt";    //si se quiere decodificar, reemplazar por "salidaTexto.txt";
	String archivoSalida = "salidaTexto.txt";
	String resultado = "";
	String resultadoOperacion = "la operacion fue exitosa";
	
	try {
		for (String linea :Files.readAllLines(Paths.get(archivoEntrada))) {
			if (operacion.equals("codificar")) {
				resultado =  codificar(linea, desplazamiento);
									
			}
			else if (operacion.equals("decodificar")) {
				resultado =  decodificar(linea, desplazamiento);
			}
		}
		
		
	} catch (Exception e) {
		System.out.println("todo lo que pudo haber fallado, falló");
	}
	
	try {
		Files.writeString(Paths.get(archivoSalida), resultado);
	} catch (IOException e) {
		System.out.println("fallo");
	}
	System.out.println(resultadoOperacion);
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
