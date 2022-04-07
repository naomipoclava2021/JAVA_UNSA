package controlar;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio16 Crear un metodo que reciba una opciono si la opcicion es 1
		 * devolver "inicio" si es 2 "dashboard" si es 3 devolver "home" si es 4
		 * devolver "panel", sino es ninguna devolver "error". La opcion es ingresada en
		 * el main.
		 */

		int opcion;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Nuestras opciones : 1)INICIO - 2)DASHBOARD- 3)HOME - 4)PANEL: ");
		System.out.println("Ingresar un numero: ");
		opcion = entrada.nextInt();

		if (opcion == 1) {
			System.out.println("INICIO");
		} else if (opcion == 2) {
			System.out.println("DESHBOARD");
		} else if (opcion == 3) {
			System.out.println("HOME");
		} else if (opcion == 4) {
			System.out.println("PANEL");
		} else {
			System.out.println("No ingreso el numero correcto");
		}
		entrada.close();
	}

}
