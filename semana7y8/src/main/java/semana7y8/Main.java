package semana7y8;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		LectorSql lectorSql = new LectorSql();
		Scanner scn = new Scanner(System.in);
		String opcion= "0";
		
		while(opcion.equals("0")) {
			System.out.println("\t SELECCIONE UNA OPCION:");
			System.out.println("Para obtener datos de las categorias presione 1 \nPara obtener datos de clientes presione 2");
			System.out.println("Para obtener datos de productos presione 3 \nPara obtener datos de ventas presione 4");
			System.out.println("para salir presion 5");
			
			opcion = scn.nextLine();
			
			if (opcion.equals("1")) {
				for (Categoria linea : lectorSql.getLeerCategorias()) {
					System.out.println(linea);
					}
				System.out.println();
				opcion="0";
				
			}else if (opcion.equals("2")) {
				for (Clientes linea : lectorSql.getLeerClientes()) {
					System.out.println(linea);
					}
				System.out.println();
				opcion="0";
				
			}else if(opcion.equals("3")){
				for (Productos linea : lectorSql.getLeerProductos()) {
					System.out.println(linea);
					}
				System.out.println();
				opcion="0";
			}
			else if (opcion.equals("4")){
				for (Ventas linea : lectorSql.getLeerVentas()) {
					System.out.println(linea);
					}
				System.out.println();
				opcion="0";
			}
			else if(opcion.equals("5")) {
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
