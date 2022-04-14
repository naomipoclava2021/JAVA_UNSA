package controlador;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio9
		// Dado tres numeros, mostrarlos ordenados ascendentemente.

		Scanner ingreso = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("ingresa el primer valor: ");
		num1 = ingreso.nextInt();
		System.out.println("ingresa el segundo valor: ");
		num2 = ingreso.nextInt();
		System.out.println("Ingresa el tercer valor: ");
		num3 = ingreso.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.println(num1 + "-" + num2 + "-" + num3);
		} else if (num1 < num3 & num3 < num2) {
			System.out.println(num1 + "-" + num3 + "-" + num2);
		} else if (num2 < num1 && num1 < num3) {
			System.out.println(num2 + "-" + num1 + "-" + num3);
		} else if (num2 < num3 && num3 < num1) {
			System.out.println(num2 + "-" + num3 + "-" + num1);
		} else if (num3 < num1 && num1 < num2) {
			System.out.println(num3 + "-" + num1 + "-" + num2);
		} else if (num3 < num1 && num2 < num1) {
			System.out.println(num3 + "-" + num2 + "-" + num1);
		} else {
			System.out.println("hay numero iguales");
		}
		ingreso.close();

	}

}
