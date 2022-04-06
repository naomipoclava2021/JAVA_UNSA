package controlar;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio1 Crea un array de 10 numeros enteros, con valores solicitados por
		 * teclado. Mostrar por consola en indice y el valor de cada elemento. Realizar
		 * dos metodos, uno para el ingreso de datos y otro para la salida de datos.
		 * 
		 * 
		 */

		int[] vector = new int[10];
		cargar(vector);
		mostrar(vector);

	}

	public static void cargar(int[] vector) {
		Scanner ingreso = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("ingrese el numero   " + (i + 1) + ": ");
			vector[i] = ingreso.nextInt();
		}
		System.out.println("Vector carcada");
		ingreso.close();
	}

	public static void mostrar(int[] vector) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + vector[i]);
		}
	}

}
