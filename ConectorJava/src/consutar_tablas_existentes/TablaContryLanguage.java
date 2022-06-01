package consutar_tablas_existentes;
import java.sql.*;

public class TablaContryLanguage {
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
			 
			 
			 sql = "SELECT * FROM countrylanguage;";
			 ResultSet rs = stmt.executeQuery(sql);
			 
			 sql = "SELECT * FROM countrylanguage;";
			 ResultSet rs2 = stmt2.executeQuery(sql);
			 
			 //STEP 5: Extraer datos del ResultSet
			 while(rs.next()){
			 //Recibir por tipo de columna
				 String CountryCode = rs.getString("CountryCode");
				 String Language = rs.getString("Language");
				 String IsOfficial = rs.getString("IsOfficial");
				 Double Percentage = rs.getDouble("Percentage");
//	
			 //Mostrar Valores
			 System.out.print("ContryCode:" + CountryCode + " ");
			 System.out.print("Language:" + Language + " ");
			 System.out.print("IsOficial:" + IsOfficial +" " );
			 System.out.print("Percentage:"+ Percentage +" " );
			 System.out.println();
			 }
			 
			//STEP 5: Extraer datos del ResultSet
			 while(rs2.next()){
			 //Recibir por tipo de columna
				 Double Percentage = rs2.getDouble("Percentage");
				 
			 //Mostrar Valores
			 System.out.print("Porcentaje: " + Percentage+ " ");
			 System.out.println();
			 }
			 
			 //PASO6: Entorno de Limpieza
			 rs.close();
//			 rs2.close();
			 stmt.close();
//			 stmt2.close();
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
