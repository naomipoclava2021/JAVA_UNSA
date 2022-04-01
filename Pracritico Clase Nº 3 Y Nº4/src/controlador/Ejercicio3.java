package controlador;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio3
		// Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar
		// el mayor
		// y el menor.
		/*
		 * int num1 = 12; System.out.println("el mayor es " + Math.max(num1,
		 * Math.max(num2, num3))); System.out.println("el menor es " + Math.min(num1,
		 * Math.min(num2, num3))); int num2 = 8; int num3 = 24;
		 * 
		 */

		int num1 = 20, num2 = 22, num3 = 23;

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 es el mayor y el valor es: " + num1); // num1 es el mayor
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 es el mayor y el valor es: " + num2);// num2 es el mayor
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("num3 es el mayor y el valor es: " + num3); // num3 es el mayor
		} else {
			System.out.println("hay numeros que son iguales");
		}

		if (num1 < num2 && num1 < num3) {
			System.out.println("num1 es el menor y el valor es: " + num1); // num1 es el mayor
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("num2 es el menor y el valor es: " + num2);// num2 es el mayor
		} else if (num3 < num1 && num3 < num2) {
			System.out.println("num3 es el menor y el valor es: " + num3); // num3 es el mayor
		} else {
			System.out.println("hay numeros que son iguales");
		}

	}

}
