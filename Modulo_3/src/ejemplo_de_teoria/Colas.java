package ejemplo_de_teoria;
import java.util.LinkedList;
import java.util.Queue;

public class Colas {
	
	public static void cola() {
		Queue<Integer> cola = new LinkedList<>();
		System.out.println("Agregando valores");
		for (int i = 0; i < 5; i++) {
			cola.add(i);
			System.out.println("Valor: "+ i);
		}
		System.out.println("\nTamaño Inicial de la cola: "+ cola.size());
		System.out.println("\nRetirando valores");
		while (cola.peek()!= null) {
			System.out.println("Valor: "+ cola.poll());
			System.out.println("Tamaño actual de la cola: "+ cola.size());
		}
		
		System.out.println("Tamaño final de cola: "+ cola.size());
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		cola();

	}

}
