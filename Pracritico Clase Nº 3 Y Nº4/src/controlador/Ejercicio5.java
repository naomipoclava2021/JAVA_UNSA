package controlador;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio5
		// Declare una variable de tipo entero y asigne un valor cualquiera, determine
		// si el nuemero
		// es par o impara y muestre un mensaje con esa informacion. mesaje: "El
		// numero... es(par o impar)"

		int num = (int) (Math.random() * 10);
		System.out.println(num);

		if (num % 2 == 1) {
			System.out.println("impar");
		} else {
			System.out.println("es par");
		}

	}

}
