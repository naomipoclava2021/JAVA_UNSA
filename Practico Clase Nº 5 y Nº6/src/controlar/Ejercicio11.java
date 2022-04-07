package controlar;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio11 Crea un metodo que reciba dos numeros reales este metodo debe
		 * devolver la mutiplicacion entre esos dos numeros. Los numeros para probar
		 * este metodo deben ser ingresados en el main.
		 */

		double numero1 = 2;
		double numero2 = 3;

		double resultado = multiplicacion(numero1, numero2);

		System.out
				.println("El resultado de la multiplicacion entre " + numero1 + " y " + numero2 + " es: " + resultado);

	}

	public static double multiplicacion(double num1, double num2) {
		double resultado = num1 * num2;
		return resultado;
	}

}
