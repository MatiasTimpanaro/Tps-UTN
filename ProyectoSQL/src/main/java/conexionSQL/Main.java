package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List <Persona> personas = new ArrayList <>();
		Connection conexion = null;
		java.sql.Statement consulta = null;
		
		try {
		//ABRIR LA CONEXION
			System.out.println("ESTABLECIENDO CONEXION");
												//URL			- 		USUARIO		   -  CONTRASEÑA  - SE LLAMA A LA CLASE CONECTOR
			conexion = DriverManager.getConnection(ConectorSql.DB_URL,ConectorSql.USER,ConectorSql.PASS);
			
			// Ejecutar una consulta
			System.out.println("\tcreando statment...\n");
			
			consulta = conexion.createStatement();
			String sql;
			
			sql = "SELECT * FROM clientes";
			
			 //En la variable resultado obtendremos las distintas filas que nos devolvió la base
			ResultSet resultado = consulta.executeQuery(sql);
			
						
			 // Obtener las distintas filas de la consulta
			while (resultado.next()) {
				 // Obtener el valor de cada columna (tiene que ser el nombre exacto de la columna)
				String codigoPersona = resultado.getString("id");
				String nombrePersona = resultado.getString("nombre");
				String apellidoPersona = resultado.getString("apellido");
				int dniPersona = resultado.getInt("dni");
				
				// Mostrar los valores obtenidos
				System.out.println("ID persona: " + codigoPersona);
				System.out.println("Nombre: " + nombrePersona);
				System.out.println("Apellido: " + apellidoPersona);
				System.out.println("DNI: " + dniPersona + "\n");
				
				personas.add(new Persona(codigoPersona, nombrePersona, apellidoPersona, dniPersona));
			}
			
		     // Esto se utiliza par cerrar la conexión con la base de datos (HACER SIEMPRE, RECORDAR!!)
			// SE PUEDE HACER UN METODO!!
			resultado.close();
			consulta.close();
			conexion.close();
						
		}
		catch (SQLException e) {
		  
			e.printStackTrace();
		}
		
		finally {
            // Esta sentencia es para que ante un problema con la base igual se cierren las conexiones
            try {
                if (consulta != null)
                    consulta.close();
            } catch (SQLException se2) {
            }
            try {
                if (conexion != null)
                    conexion.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
		
		System.out.println(personas);
        System.out.println("\n\tFin de la ejecucción");
        
//		//Agregar datos a la DB
		
//		String sqlInsert = "INSERT INTO clientes (id, nombre, dni) VALUES (?,?,?)";
//		
//		try (PreparedStatement statement = conexion.prepareStatement(sqlInsert)){
//			statement.setInt(1, 4);
//			statement.setString(2, "Robarto");
//			statement.setInt (3, 18636832);
//			int filasInsertadas = statement.executeUpdate();
//			
//			System.out.println("\tFilas insertadas= " + filasInsertadas);
//		}
//		
	}

}
