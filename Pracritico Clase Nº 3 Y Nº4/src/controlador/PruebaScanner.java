
package controlador;

import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);
		String variable = lectura.next();
		System.out.println("Ingrease su nombre");
		variable = lectura.next();
		System.out.println(variable);
	}

}
