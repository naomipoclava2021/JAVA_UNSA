package controlador;

public class PruebaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() * 100);
		System.out.println(num);
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d - es par \n", i);
			}
		}

		System.out.println("FIN DEL PROGRAMA");
	}

}
