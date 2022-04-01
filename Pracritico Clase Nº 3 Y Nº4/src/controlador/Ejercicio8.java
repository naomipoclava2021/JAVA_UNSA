package controlador;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio8
		// Calcular la cantidad de minutos que hay existen en una cantidad de segundos
		// ingresada
		// por el usuario.

		Scanner captura = new Scanner(System.in);
		System.out.println("Ingresa de sus segundos:");

		double segundos = captura.nextDouble();

		double resul = (double) segundos / 60;

		System.out.println("Tiene " + resul + " minutos");

		captura.close();

	}

}
