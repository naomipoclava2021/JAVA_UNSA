package controlador;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EJERCICIO 14
		// Conversion de tipos. Realizar un programa que muestre la conversion de tipo
		// uppcasting y downcating.
		// Usar tipos enteros y decimales.

		double fareheit;
		fareheit = 23;
		double centigrados = ((fareheit - 32.0) * 5.0) / 9.0;
		System.out.println("El resultado de convertir Fahrenheit a Centigrados es: " + centigrados);

		double ladoA = 2;
		double ladoB = 4;
		double perimetro = 2 * ladoA + 2 * ladoB;
		System.out.println("El perimetro de un rectagulo es: " + perimetro);

		int temperatura = (int) centigrados;
		System.out.println("Coversion de double a int el resultador es: " + temperatura);

		float perimetroHaDecimal = (float) perimetro;
		System.out.println("El resultado de convetir double a float es: " + perimetroHaDecimal);

	}

}
