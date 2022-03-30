package controlador;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio4
		// Declarar dos variables, asignar un valor cualquiera y realizar las siguientes
		// operaciones:
		// Mostrar la suma
		// Mostrar la multiplicacion
		// Mostrar las resta
		// Mostrar Division

		int valor1 = 12;
		int valor2 = 2;

		int suma = valor1 + valor2;
		int resta = valor1 - valor2;
		int multiplicacion = valor1 * valor2;

		System.out.printf("el resultado de la suma es %s\n", suma);
		System.out.printf("el resultado de la resta es: %s\n", resta);
		System.out.printf("el resultado de la mutiplicacion es %s\n", multiplicacion);

		if (valor2 != 0) {
			System.out.println("el resultado de la division es: " + (valor1 / valor2));
		} else {
			System.out.println("No se puede dividir por cero");
		}

	}

}
