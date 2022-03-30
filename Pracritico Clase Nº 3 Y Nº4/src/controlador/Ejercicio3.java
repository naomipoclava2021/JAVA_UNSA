package controlador;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio3
		// Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar
		// el mayor
		// y el menor.
		int num1 = 12;
		int num2 = 8;
		int num3 = 24;

		System.out.println("el mayor es " + Math.max(num1, Math.max(num2, num3)));
		System.out.println("el menor es " + Math.min(num1, Math.min(num2, num3)));

	}

}
