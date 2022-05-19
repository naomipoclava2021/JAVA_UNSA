package practica;

import java.io.IOException;

public class ejercicio_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int num=0;
		
		do {
			System.out.println("Ingrese un valor entero: ");
			num= System.in.read();
		} while (num<48 || num>=58);
		
		System.out.println("El numero es: "+ (char) num);

	}

}
