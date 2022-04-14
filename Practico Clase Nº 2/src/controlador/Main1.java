package controlador;

public class Main1 {

	public static void main(String[] args) {

		// EJERCIO 1
		// Crea un programa en Java en donde se muestre la estructura basica del mismo

		// Definicion de clase
		// Definicion de un metodo
		// Sentencia
		System.out.println("Esto es una sentencia");

		// EJERCIO 2
		// Crea un program en donde se muestren los diferentes tipos de comentarios que
		// hay en Java

		/*
		 * Este programa Main1 se utiliza para aplicar los metodo Sytem.out.println()
		 */

		/**
		 * Pragrama Main1
		 * 
		 * @author milag
		 * @version 1.0
		 * @see Referencias
		 */

		// El motodo System.out.println() imprime por pantalla

		// EJERCIO 3
		// Crea un programa en donde se declaren, al menos 3 identificadores validos y 3
		// invalidos,
		// a estos poner comentarios el porque son incorrectas.

		String miNombre;
		int num10;
		float numeros_flotantes;

		/*
		 * char #caracter; // no debe comenzar con caracter byte 23chicos; // no deben
		 * comenzar con numeros boolean es-verdadero; //no debe tener - guion medidio
		 */

		// EJERCICIO 4
		// Declarar 5 variables de cada tipo de datos que utiliza Java. Dar formato al
		// codigo mediante comentarios.
		String saludar; // cadena de texto
		char caracteres; // ocupa un solo espacio
		boolean botton; // valores booleano true o false
		int nuemerosPares; // valores enteros
		double harina; // tiene una parte dicimal

		// EJERCICIO 5
		// Realizar un programa en donde se muestren los diferentes operadores que
		// existen en Java.
		// Utilizar bloques de comentarios para estructurar el mismo.
		/*
		 * +5, -2 Operacion unitarios 2+3, 10-2 Operacion aditiva 2*3, 20/4, 21%2
		 * Operacion multiplicativa ++numero, numero++, --numero, numero-- Incremento y
		 * Decremento en 1 >,<,<=,>= Operador relacional == Operador de igualdad =, +=,
		 * -=,*=, /=, %= Operador de asignacion
		 */

		// EJERCICIO 6
		// Utilizar el tipo de dato entero para crear al menos 5 variables con numeros
		// octales y hexadecimales.

		int octal = 012;
		System.out.println("Octal: " + octal);

		int hexadecimal = 0x10;
		System.out.println("Hexadecimal: " + hexadecimal);

		// EJERCICIO 7
		// Declarar variables de tipo cadena de caracteres y mostrarlas por pantalla.
		String mesajeDeWhatApp;
		mesajeDeWhatApp = "¿Como estuvo la clase de hoy?";
		System.out.println(mesajeDeWhatApp);

		// EJERCICIO 8
		// Realizar un programa que realice las operaciones basicas de suma, resta,
		// producto y division de dos numeros.
		// Hacer con numeros enteros, y decimales.
		double num1 = 40.50;
		double num2 = 4;
		System.out.println("Suma: " + (num1 + num2));
		System.out.println("Resta: " + (num1 - num2));
		System.out.println("Multiplicacion: " + (num1 * num2));
		System.out.println("Division: " + (num1 / num2));

		// EJERCICIO 9
		// Siguiendo el ejercicio anterior, mezclar sumas con numeros enteros y
		// decimales, que sucede?
		// Describal el resultado mediante comentarios.
		double sumar = 29 + 12.3;
		System.out.println(sumar); // toma en cuenta la parte decimal

		// EJERCICIO 10
		// Muestre en un ejemplo como se usan los operadores incremento y decremento.
		int cartas = 9;
		System.out.println(cartas);
		cartas++;
		System.out.println(cartas);
		System.out.println(++cartas);
		System.out.println(++cartas);
		System.out.println(++cartas);
		System.out.println(cartas++);
		System.out.println(cartas++);
		System.out.println(cartas--);
		System.out.println(cartas--);
		System.out.println(--cartas);
		System.out.println(--cartas);
		System.out.println(cartas--);
		System.out.println(--cartas);

		// EJERCICIO 11
		// Realizar un programa que muestre el uso del operador racional. Pruebe al
		// menos 5 ejemplos.
		boolean esMayor = 20 > 3;
		System.out.println(esMayor);

		boolean esMayor2 = 2 > 22;
		System.out.println(esMayor2);

		boolean esMenor = 30 < 50;
		System.out.println(esMenor);

		boolean menorIgual = 18 <= 0;
		System.out.println(menorIgual);

		boolean mayorIgual = 18 >= 0;
		System.out.println(mayorIgual);

		// EJERCICIO 12
		// Realizar un programa que muestre el uso del operador logico. Pruebe al menos
		// 5 ejemplos.

		boolean logico1 = true && true;
		boolean logico2 = false || true || false;
		boolean logico3 = false && true || false;
		boolean logico4 = true || false && true;
		boolean logico5 = 2 > 5 || 20 <= 2;
		System.out.println("Operador and el resultado es: " + logico1);
		System.out.println("Operador or el resultado es: " + logico2);
		System.out.println("Primero evalua and y luego el or el resultado es: " + logico3);
		System.out.println("Simpre evaluara primero el and no importa el orden, el resultado es: " + logico4);
		System.out.println("si las dos condiciones son falsa es resultado es:" + logico5);

		// EJERCICIO 13
		// Realizar un programa que calcule el resultado de una expresion algebraica,
		// use distintos operadores.
		// Realizar al menos 3 expresiones algebraicas.
		double sueldo_final = 20000 + (50000 * 0.20);
		System.out.println("El sueldo de una persona + el %20 de la venta es: " + sueldo_final);

		double fareheit;
		fareheit = 23;
		double centigrados = ((fareheit - 32.0) * 5.0) / 9.0;
		System.out.println("El resultado de convertir Fahrenheit a Centigrados es: " + centigrados);

		double ladoA = 2;
		double ladoB = 4;
		double perimetro = 2 * ladoA + 2 * ladoB;
		System.out.println("El perimetro de un rectagulo es: " + perimetro);

		// EJERCICIO 14
		// Conversion de tipos. Realizar un programa que muestre la conversion de tipo
		// uppcasting y downcating.
		// Usar tipos enteros y decimales.

		int temperatura = (int) centigrados;
		System.out.println("Coversion de double a int el resultador es: " + temperatura);

		float perimetroHaDecimal = (float) perimetro;
		System.out.println("El resultado de convetir double a float es: " + perimetroHaDecimal);

		// EJERCICIO 15
		// Sera posible almacenar un tipo de dato char en un tipo entero? De ser posible
		// explique con comentarios el porque.
		int tipoEntero = '#';
		System.out.println(tipoEntero);
		// si se puede te devulven valores numericos

		// TODO Auto-generated method stub
		/*
		 * este es un comentario varios comentario hola mundo
		 */

		System.out.println("hola este es mi nombre");

		byte edad; // tiene un rango de numeros
		edad = 10;
		System.out.println(edad);

		char caracter;
		caracter = '@';
		System.out.println(caracter);

		// identificadores vailidos
		int numero = 5;
		double atura = 1.3;
		String nombreDelChico = "ramiro";

		// indentificadore no validos
		/*
		 * int 5sum = 4; //no pude comenzar con un numero String #nombre = "ramiro";
		 * //no puede iniciar con un caracter double peso-altura = 60; //para unir debo
		 * usar _
		 */

		String nombre = "naomi";
		System.out.println("Bienvenido a mil programadores " + nombre);

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
		double suma = a + b;
		double resta = a - b;
		double multiplicacion = a * b;
		double division = a / b;
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(division);
		System.out.println("hola");

	}

}
