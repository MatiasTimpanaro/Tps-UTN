package semana7y8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LectorSql {

	private List<Categoria> leerCategorias; 
	private List <Clientes> leerClientes;
	private List <Productos> leerProductos;
	private List <Ventas> leerVentas;
	
	
	
	public LectorSql() {
		
		this.leerCategorias = new ArrayList<Categoria>();
		this.leerClientes = new ArrayList <Clientes>();
		this.leerProductos = new ArrayList <Productos>();
		this.leerVentas = new ArrayList <Ventas>();
	}

	public List<Categoria> getLeerCategorias (){

		Connection conexion = null;
		java.sql.Statement consulta = null;
		
		try {
			
			conexion = DriverManager.getConnection(ConectorSql.DB_URL,ConectorSql.USER,ConectorSql.PASS);
			
			consulta = conexion.createStatement();
			String sql;
			
			sql = "SELECT * FROM categorias";
			
			ResultSet resultado = consulta.executeQuery(sql);
			
				 // Obtener las distintas filas de la consulta
			while (resultado.next()) {
				 // Obtener el valor de cada columna (tiene que ser el nombre exacto de la columna)
				int id_categoria = resultado.getInt("id_categoria");
				String nombre_categoria = resultado.getString("nombre_categoria");
					
				this.leerCategorias.add(new Categoria(id_categoria, nombre_categoria));
			}
			
			resultado.close();
			consulta.close();
			conexion.close();
						
		}
		catch (SQLException e) {
		  
			e.printStackTrace();
		}
		
		finally {
	 
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
			
	return leerCategorias;
  }

	
	public List<Clientes> getLeerClientes() {
		
		Connection conexion = null;
		java.sql.Statement consulta = null;
		
		try {
			
			conexion = DriverManager.getConnection(ConectorSql.DB_URL,ConectorSql.USER,ConectorSql.PASS);
			
			consulta = conexion.createStatement();
			String sql;
			
			sql = "SELECT * FROM clientes";
			
			ResultSet resultado = consulta.executeQuery(sql);
			
				 // Obtener las distintas filas de la consulta
			while (resultado.next()) {
				 // Obtener el valor de cada columna (tiene que ser el nombre exacto de la columna)
				int idCliente = resultado.getInt("id_cliente");
				String nombre = resultado.getString("nombre");
				String apellido = resultado.getString("apellido");
				String email = resultado.getString("email");
				String telefono = resultado.getString("telefono");
				
				this.leerClientes.add(new Clientes(idCliente, nombre,apellido,email,telefono));
			}
			
			resultado.close();
			consulta.close();
			conexion.close();
						
		}
		catch (SQLException e) {
		  
			e.printStackTrace();
		}
		
		finally {
	 
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
		return leerClientes;
	}

	
	public List<Productos> getLeerProductos() {
		
		Connection conexion = null;
		java.sql.Statement consulta = null;
		
		try {
			
			conexion = DriverManager.getConnection(ConectorSql.DB_URL,ConectorSql.USER,ConectorSql.PASS);
			
			consulta = conexion.createStatement();
			String sql;
			
			sql = "SELECT * FROM productos";
			
			ResultSet resultado = consulta.executeQuery(sql);
			
				 // Obtener las distintas filas de la consulta
			while (resultado.next()) {
				 // Obtener el valor de cada columna (tiene que ser el nombre exacto de la columna)
				int idProducto = resultado.getInt("id_producto");
				String nombreProducto = resultado.getString("nombre_Producto");
				Double precio = resultado.getDouble("precio");
				int stock = resultado.getInt("stock");
				int idCategoria = resultado.getInt("id_categoria");
				
				this.leerProductos.add(new Productos(idProducto, nombreProducto,precio,stock,idCategoria));
			}
			
			resultado.close();
			consulta.close();
			conexion.close();
						
		}
		catch (SQLException e) {
		  
			e.printStackTrace();
		}
		
		finally {
	 
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
		return leerProductos;
	}

	public List<Ventas> getLeerVentas() {
		
		Connection conexion = null;
		java.sql.Statement consulta = null;
		
		try {
			
			conexion = DriverManager.getConnection(ConectorSql.DB_URL,ConectorSql.USER,ConectorSql.PASS);
			
			consulta = conexion.createStatement();
			String sql;
			
			sql = "SELECT * FROM ventas";
			
			ResultSet resultado = consulta.executeQuery(sql);
			
				 // Obtener las distintas filas de la consulta
			while (resultado.next()) {
				 // Obtener el valor de cada columna (tiene que ser el nombre exacto de la columna)
				int idVenta = resultado.getInt("id_venta");
				int idCliente= resultado.getInt("id_cliente");
				int idProducto= resultado.getInt("id_producto");
				String fecha = resultado.getString ("fecha");
				double total = resultado.getDouble("total");
				
				this.leerVentas.add(new Ventas(idVenta, idCliente,idProducto,fecha,total));
			}
			
			resultado.close();
			consulta.close();
			conexion.close();
						
		}
		catch (SQLException e) {
		  
			e.printStackTrace();
		}
		
		finally {
	 
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
		return leerVentas;
	}
	
	

}

