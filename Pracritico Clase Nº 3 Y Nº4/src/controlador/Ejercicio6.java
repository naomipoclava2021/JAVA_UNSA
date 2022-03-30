package controlador;

import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio6
		// Declare dos variables de tipo flotante, asigne un valor a cada uno, calcule
		// el promedio y
		// muestrelo por consola.

		float num1 = new Random().nextFloat();
		System.out.println(String.format("%.2f", num1));
		float num2 = new Random().nextFloat();
		System.out.println(String.format("%.2f", num2));

		float promedio = (num1 + num2) / 2;
		System.out.println("El promedio es " + String.format("%.2f", promedio));

	}

}
