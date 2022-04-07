package controlar;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio1 Crea un array de 10 numeros enteros, con valores solicitados por
		 * teclado. Mostrar por consola en indice y el valor de cada elemento. Realizar
		 * dos metodos, uno para el ingreso de datos y otro para la salida de datos.
		 */
		int vector[] = new int[10];
		IngresarDatos(vector);
		MostrarDatos(vector);

	}

	public static void IngresarDatos(int arreglo[]) {
		Scanner entrada = new Scanner(System.in);
		for (int posicion = 0; posicion < arreglo.length; posicion++) {
			System.out.println("Ingresa un valor numerico: ");
			int valor = entrada.nextInt();
			arreglo[posicion] = valor;

		}
		entrada.close();
	}

	public static void MostrarDatos(int arreglo[]) {
		for (int posicion = 0; posicion < arreglo.length; posicion++) {
			System.out.println("En la posicion: " + (posicion + 1) + " se encuentra el valor: " + arreglo[posicion]);
		}
	}

}
