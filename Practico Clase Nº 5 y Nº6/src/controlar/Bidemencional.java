package controlar;

public class Bidemencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1 = 2;
		double numero2 = 2;

		System.out.println(suma(numero1, numero2));
		System.out.println(resto(numero1, numero2));

	}

	public static double suma(double num1, double num2) {
		double suma;
		suma = num1 + num2;
		return suma;
	}

	public static double resto(double num1, double num2) {
		double resto = num1 % num2;
		return resto;
	}

}
