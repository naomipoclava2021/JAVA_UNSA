package controlar;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio4 Generar 20 numeros enteros entre 1 y 100 de forma aleatoria y
		 * contar cuantos de esos numeros enteros son divisibles entre 5.
		 */
		int vector[] = new int[20];
		int contador = 0;

		for (int posicion = 0; posicion < vector.length; posicion++) {
			vector[posicion] = (int) (Math.random() * 100) + 1;
		}

		for (int posicion = 0; posicion < vector.length; posicion++) {
			System.out.print(vector[posicion] + " - ");
		}
		System.out.println();

		for (int posicion = 0; posicion < vector.length; posicion++) {
			if (vector[posicion] % 5 == 0) {
				System.out.println("Encontre un numero divisible por 5 en la posicion " + posicion + " su valor es: "
						+ vector[posicion]);
				contador++;
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println("Tu arreglo tiene " + contador + " numeros divisibles entre 5");

	}
}
