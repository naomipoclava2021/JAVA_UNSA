
package consutar_tablas_existentes;

import java.sql.*;
public class TablaCity {
//  Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
		 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		 static final String DB_URL = "jdbc:mysql://localhost:3306/world";
	 // Credenciales de la BDD
		 static final String USER = "root";
		 static final String PASS = "lasonrriza";
		 
		 public static void main(String args[]) {
			 Connection conn = null;
			 Statement stmt = null;
			 Statement stmt2 = null;
			 
			 
			 try{
			 //PASO 2: Registrar JDBC driver
			 Class.forName(JDBC_DRIVER);
			 
			 //PASO3: Abrir una Conexion
			 System.out.println("Connecting to database...");
			 conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 
			 //PASO 4: Ejecutar una consulta SQL
			 System.out.println("Creating statement...");
			 stmt = conn.createStatement();
			 System.out.println("Creating statement...");
			 stmt2 = conn.createStatement();
			 String sql;
			 
			 
			 sql = "SELECT ID, Name, Population FROM city;\n";
			 ResultSet rs = stmt.executeQuery(sql);
			 
			 sql = "SELECT ID, District FROM city;";
			 ResultSet rs2 = stmt2.executeQuery(sql);
			 
			 //STEP 5: Extraer datos del ResultSet
			 while(rs.next()){
			 //Recibir por tipo de columna
				 
			 	int ID = rs.getInt("ID");
			 	String Name = rs.getString("Name");
			 	int Population = rs.getInt("Population");
			 
			 //Mostrar Valores
			 	System.out.print("ID:" + ID+ "  ");
			 	System.out.print("Name:" + Name+ "  ");
			 	System.out.print("Population:" + Population+ "  ");
			 	System.out.println();
			 }
			 
//			//STEP 5: Extraer datos del ResultSet
//			 while(rs2.next()){
//			 //Recibir por tipo de columna
//				 int ID = rs2.getInt("ID");
//				 String District = rs2.getString("District");
//			 //Mostrar Valores
//			 System.out.print("ID: " + ID+ " ");
//			 System.out.print("District: " + District+" " );
//			 System.out.println();
//			 }
			 
			 //PASO6: Entorno de Limpieza
			 rs.close();
			 rs2.close();
			 stmt.close();
			 stmt2.close();
			 conn.close();
			 }catch(SQLException se){
				 // Resolver errores para JDBC
				 se.printStackTrace();
			 }catch(Exception e){
				 // Resolver errores para Class.forName
				 e.printStackTrace();
			 }finally{
			 // Bloque finalmente utilizado para cerrar recursos
			 try{
				 if(stmt!=null)
					 stmt.close();
			 }catch(SQLException se2){
			 }// Nada que podamos hacer
			 try{
				 if(conn!=null)
					 conn.close();
			 }catch(SQLException se){
			 se.printStackTrace();
			 	} //cierra finally try
			 } //cierra try
			 System.out.println("Goodbye!");
		 }

}
