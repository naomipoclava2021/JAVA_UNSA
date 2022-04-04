package controlar;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> palabra = new ArrayList<String>();

		palabra.add("lunes");
		palabra.add("mircoles");
		palabra.add("jueves");

		palabra.add(1, "martes");
		System.out.println(palabra);

		System.out.println(palabra.get(3));

		palabra.set(0, "lunez");
		System.out.println(palabra);

		System.out.println(palabra.size());

		System.out.println(palabra.toString());

		System.out.println(palabra);

		/*
		 * palabra.clear(); System.out.println(palabra);
		 * 
		 * palabra.remove("miercoles"); System.out.println(palabra);
		 */

	}

}
