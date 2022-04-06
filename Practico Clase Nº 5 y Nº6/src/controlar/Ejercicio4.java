package controlar;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio4 Generar 20 numeros enteros entre 1 y 100 de forma aleatoria y
		 * contar cuantos de esos numeros enteros son divisibles entre 5.
		 */
		int vector[] = new int[10];

		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i] + " - ");
		}
		System.out.println();
		for (int i = 0; i < vector.length; i++) {
			int num = (int) (Math.random() * 100);
			vector[i] = num;
		}

		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i] + " - ");
		}
		System.out.println();

		int contador = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 5 == 0) {
				contador++;
			}
		}
		System.out.println("En tu lista tienes: " + contador + "numeros divisibles por 5");

	}

}
