package controlador;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*este es un comentario
		 *varios comentario
		 *hola mundo
		 */
		
		System.out.println("hola este es mi nombre");
		
		byte edad; //tiene un rango de numeros
		edad = 10;
		System.out.println(edad);
		
		char caracter;
		caracter = '@';
		System.out.println(caracter);
		
		// identificadores vailidos
		int numero = 5;
		double atura = 1.3;
		String nombreDelChico = "ramiro";
		
		//indentificadore no validos
		/*int 5sum = 4; //no pude comenzar con un numero
		*String #nombre = "ramiro"; //no puede iniciar con un caracter
		*double peso-altura = 60; //para unir debo usar _
		*/
		
		String nombre = "naomi";
		System.out.println("Bienvenido a mil programadores "+ nombre);
		

		int x = 10;
		System.out.println(x);
		x++;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(x);
		
		int a = 2;
		int b = 2;
		double suma = a+b;
		double resta = a-b;
		double multiplicacion = a*b;
		double division = a/b;
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(division);
		System.out.println("hola");

	}

}
