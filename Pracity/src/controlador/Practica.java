package controlador;

import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		/*
		 * Programa que lee por teclado el nombre, la edad y la dirrecion de una persona
		 * y lo muestra por pantalla.
		 */

		Scanner entrada = new Scanner(System.in);
		String nombre, direccion;
		int edad;

		System.out.println("Itroduce nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Introduce direccion: ");
		direccion = entrada.nextLine();
		System.out.println("Introduce edad: ");
		edad = entrada.nextInt();

		System.out.println("Datos introducidos");
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Edad: " + edad);

		entrada.close();
	}

}
