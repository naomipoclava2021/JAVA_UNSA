package controlador;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EJERCICIO 13
		// Realizar un programa que calcule el resultado de una expresion algebraica,
		// use distintos operadores.
		// Realizar al menos 3 expresiones algebraicas.
		double sueldo_final = 20000 + (50000 * 0.20);
		System.out.println("El sueldo de una persona + el %20 de la venta es: " + sueldo_final);

		double fareheit;
		fareheit = 23;
		double centigrados = ((fareheit - 32.0) * 5.0) / 9.0;
		System.out.println("El resultado de convertir Fahrenheit a Centigrados es: " + centigrados);

		double ladoA = 2;
		double ladoB = 4;
		double perimetro = 2 * ladoA + 2 * ladoB;
		System.out.println("El perimetro de un rectagulo es: " + perimetro);

	}

}
