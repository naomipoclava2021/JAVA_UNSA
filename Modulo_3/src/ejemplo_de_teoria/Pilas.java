package ejemplo_de_teoria;
import java.util.Stack;

public class Pilas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pila();

	}
	
	public static void pila() {
		Stack<Integer> pila = new Stack<>();
		System.out.println("Agregando valores");
		for (int i = 0; i < 5; i++) {
			pila.push(i);
			System.out.println("Valor: "+ i);
		}
		System.out.println("\nTamaño Inicial de la pila: "+ pila.size());
		System.out.println("\nRetirando valores");
		while (!pila.isEmpty()) {
			System.out.println("Valor: "+ pila.pop());
			System.out.println("Tamaño actual de la pila: "+ pila.size());
		}
		System.out.println("Tamaño final de la pila: "+ pila.size());
	}

}
