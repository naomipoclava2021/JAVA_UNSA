package controlador;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio11
		// Dado 3 numeros naturales que representan los lados de un triangulo, se pide
		// determinar si
		// el triangulo es Isosceles, Escaleno o Equilatero.
		// info
		// Tipos de triangulo segun la longuitud de sus lados, los triangulos pueden
		// clasificarse en:
		// 1.Equilatero: Todos sus lados son iguales.
		// 2.Isosceles: Dos de sus tres lados son de igual longitud.
		// 3.Escaleno: Todos sus lados son de diferente longuitud.

		int num1 = 2;
		int num2 = 1;
		int num3 = 10;

		if (num1 == num2 && num1 == num3) { // TODOS SUS LADOS SON IGUALES
			System.out.println("Equilatero");
		} else if (num1 == num2 || num1 == num3 || num2 == num3) { // DOS DE SUS TRES LADOS SON IGUALES
			System.out.println("Isoceles");
		} else if (num1 != num2 && num1 != num3) { // TODOS SUS LADOS SON DIFERENTES
			System.out.println("Escaleno");
		}

	}

}
