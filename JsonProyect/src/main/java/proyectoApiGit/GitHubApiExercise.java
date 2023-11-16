	package proyectoApiGit;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GitHubApiExercise {

	public static void main(String[] args) {
		
		// URL de la API de GitHub para obtener información de un repositorio público
        String apiUrl = "https://api.github.com/repos/octocat/hello-world";
        
        // Realizar la solicitud HTTP utilizando HttpClient
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();
        
         try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			ObjectMapper objectMapper = new ObjectMapper ();
			
			RepositoryInfo repositoryInfo = null;
			repositoryInfo = objectMapper.readValue(response.body(), RepositoryInfo.class);
			
			System.out.println("Name: " + repositoryInfo.getName());
			System.out.println("Description: " + repositoryInfo.getDescription());
			System.out.println("Html url: " + repositoryInfo.getHtml_url());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         //string response.body()
		
		
	}
}
