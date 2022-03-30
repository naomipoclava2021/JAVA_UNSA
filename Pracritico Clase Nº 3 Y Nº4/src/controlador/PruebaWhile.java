package controlador;

public class PruebaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() * 10);
		while (num <= 10) {
			System.out.printf("%d - este es el numero de iteracion\n", num);
			num++;
		}
		System.out.println("FIN DEL PROGRAMA");

	}

}
