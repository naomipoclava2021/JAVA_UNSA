package ejemplo_teoria;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;



public class Ficheros {
	public static File Constructor_1() {
		//Crea un Objeto File asociado al fichero "fichero.txt" que se encuentra en el directorio
		//de trabajo:
		
		File fichero = new File("archivos/fichero.txt");//"fichero.txt" se llama Ruta Relativa
//		En este caso no se indeca el path. Se supone que el fichero se encuentra en el directorio
//		actual de trabajo.
		return fichero;
	}
	
	public static File Constructor_2() {
//		Crea un Objeto File asociado al fichero "fichero.txt" que se encuentra en el directorio Ficheros dentro del directorio actual:
		File fichero = new File("archivos", "fichero.txt");//indica ruta, indica nombre del archivo.
//		En este caso se indica la ruta relativa tomando como base el directorio actual de trabajo.
//		MOSTRAR EJEMPLO DE RUTA ABSOLUTA
		return fichero;
	}
	
	public static File Constructor_3() {
//		Crea un Objeto File asociado al fichero persona.dat que se encuentra en el directorio ficheros dentro del directorio actual:
		File ruta = new File("archivos");
		File fichero = new File(ruta,"fichero.txt");
//		En este caso se indica la ruta relativa tomando como base el directorio actual de trabajo.
//		MOSTRAR EJEMPLO DE RUTA ABSOLUTA
		return fichero;
	}
	
	
	public static void leer(String direccion) throws Exception {
//		LEER FICHERO
		FileReader archivo = null;
		BufferedReader texto= null;
		try {
			//var "direccion contiene el path de donde esta almacenado el archivo"
			archivo = new FileReader(direccion);
			texto = new BufferedReader(archivo);
			String lectura= "";
			System.out.println("El path del archivo es: "+ direccion);
			System.out.println("Contenido del archivo: ");
			while((lectura=texto.readLine()) != null) {
				System.out.println(lectura);//Muestra linea por linea del archivo
			}
		} catch (FileNotFoundException e) {
			System.out.println("archivo no encontrado");//muestra un msj de error si no encuentra el archivo
			
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error! "+ e.getMessage()); //muestra un msj de error si no puede abrir el archivo
		} finally {
			try {//cerramos los flujos abiertos
				texto.close();
				archivo.close();
				
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("Error! "+ e.getMessage());
			}
		}
	}
	
	
	public static void escribir(String direccion) throws Exception {
		FileWriter archivo = null;
		BufferedWriter texto = null;
		try {
			archivo = new FileWriter(direccion);
			texto = new BufferedWriter(archivo);
			texto.write("Modificando el archivo");
			texto.newLine();//salto de linea
			texto.write("Salto de linea");
			texto.flush(); //guarda las modificaciones
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Archivo no encontrado");//muestra un msj de error si no encuentra el archivo
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error! "+ e.getMessage());//muestra un msj de error si no puede abrir el archivo
		}finally {
			try {//cerramos los flujos abiertos
				texto.close();
				archivo.close();
				
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("Error! "+ e.getMessage());
			}
		}
		
		leer(direccion);
		
	}
	
	
	
	
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File fichero = Constructor_1();
//		File fichero = Constructor_2();
//		File fichero = Constructor_3();
		
//		Debemos tener en cuenta que crear un objeto File nos significa que deba existir el fichero o el directorio o que el path sea
//		correcto. Si no existen no se lanzara ningun tipo de exception ni tampoco seran creados.
		
		if (!fichero.exists()) {
			System.out.println("El fichero: "+ fichero.getName()+ " no existe");
			//exists(): comprueba si el fichero existe
			//getName(): devuelve el nombre del fichero que tiene asociado el objeto Fichero
//			CREAR FICHERO
			System.out.println("Creando fichero.txt");
			if (fichero.createNewFile()) {
				//Crea un fichero sin datos
				System.out.println(fichero.getName()+ " creado con existo!!!");
			} else {
				System.out.println("No se ha podido crear " + fichero.getName());
			}
//			Devuelve true si se ha podido crear.
//			Para poder crearlo el fichero NO DEBE EXISTIR.
//			Lanza una exception del tipo IOException
			
		}
		
//		Lectura de un archivo
		leer(fichero.getAbsolutePath());
		
//		Escritura de un archivo
//		borrar (//) para poder ejecutar la funcion ESCRIBIR
//		escribir(fichero.getAbsolutePath());

	}

}
