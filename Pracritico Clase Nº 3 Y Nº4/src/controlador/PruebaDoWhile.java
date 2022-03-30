package controlador;

public class PruebaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() * 10);
		System.out.println(num);

		do {
			System.out.printf("%d - este es el numero de iteracion\n", num);
			num++;
		} while (num <= 10);
		System.out.println("Fin del programa");

	}
}
