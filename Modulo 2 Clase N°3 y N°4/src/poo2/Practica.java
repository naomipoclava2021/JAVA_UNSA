package poo2;


import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int numeroElementos;
		
		System.out.println("Ingrese la cantidad de elementos: ");

		numeroElementos = entrada.nextInt();

		int[] letra = new int[numeroElementos];

		System.out.println("Digite los elementos del arreglo: ");

		for (int i = 0; i < numeroElementos; i++) {
			System.out.print((i + 1) + " Digite un caracter: ");
			letra[i] = entrada.nextInt();
		}
		System.out.println();

		System.out.println("\nEl los elementos son: ");
		for (int i = 0; i < numeroElementos; i++) {
			System.out.print(letra[i] + " ");
		}

		entrada.close();
	}

}