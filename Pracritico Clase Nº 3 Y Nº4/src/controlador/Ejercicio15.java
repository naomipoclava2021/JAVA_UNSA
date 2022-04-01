package controlador;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio15
		// Dado un numero natural N. Determianr si este es primo.

		int N = (int) (Math.random() * 100);
		System.out.println(N);
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d - es par \n", i);
			}
		}

		System.out.println("FIN DEL PROGRAMA");

	}

}
