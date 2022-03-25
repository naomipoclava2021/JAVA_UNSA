package controlador;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EJERCICIO 12
		// Realizar un programa que muestre el uso del operador logico. Pruebe al menos
		// 5 ejemplos.

		boolean logico1 = true && true;
		boolean logico2 = false || true || false;
		boolean logico3 = false && true || false;
		boolean logico4 = true || false && true;
		boolean logico5 = 2 > 5 || 20 <= 2;
		System.out.println("Operador and el resultado es: " + logico1);
		System.out.println("Operador or el resultado es: " + logico2);
		System.out.println("Primero evalua and y luego el or el resultado es: " + logico3);
		System.out.println("Simpre evaluara primero el and no importa el orden, el resultado es: " + logico4);
		System.out.println("si las dos condiciones son falsa es resultado es:" + logico5);

	}

}
