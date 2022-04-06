package controlar;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio2 Crea un vector de 20 numeros reales correspondientes a los pesos
		 * de 20 personas. Obtener el peso mayor, el menor, el peso medio y visualizar
		 * un mensaje si hay alguna persona con un peso mayor de 100kg.
		 */

		double[] vector = new double[20];

		vector[0] = 49;
		vector[1] = 21;
		vector[2] = 58;
		vector[3] = 67;
		vector[4] = 88;
		vector[5] = 90;
		vector[6] = 120;
		vector[7] = 32;
		vector[8] = 23;
		vector[9] = 12;
		vector[10] = 25;
		vector[11] = 47;
		vector[12] = 28;
		vector[13] = 91;
		vector[14] = 64;
		vector[15] = 81;
		vector[16] = 93;
		vector[17] = 14;
		vector[18] = 97;
		vector[19] = 32;

		System.out.println("el peso menor es: " + peso_menor(vector));

	}

	public static double peso_mayor(double[] vector) {
		double mayor = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
		}

	public static double peso_menor(double[] vector) {
		double menor = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] < menor) {
				menor = vector[i];
			}
		}
	}

}
