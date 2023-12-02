package semana6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Chat {

	private String chat;

	public Chat() {
		
		this.chat = chat;
	}

	public void getChat() {
				
		try {			
			String mensajes = "chat.txt";
			
			for (String linea : Files.readAllLines(Paths.get(mensajes))) {
				System.out.println(linea);
			}
						
			} catch (IOException e) {
		e.printStackTrace();
		}
	}

	public void setChat(String nuevosMensajes) {
		try {
			String mensajes = "chat.txt";
			BufferedWriter guardarMensajes = new BufferedWriter(new FileWriter(mensajes, true));
			if (Files.readAllLines(Paths.get(mensajes)).isEmpty()) {
				guardarMensajes.write(nuevosMensajes);
				guardarMensajes.newLine();
			}
			for (String linea : Files.readAllLines(Paths.get(mensajes))) {
				guardarMensajes.write(linea);
				guardarMensajes.newLine();
				guardarMensajes.write(nuevosMensajes);
				guardarMensajes.newLine();
				

			}
						guardarMensajes.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
