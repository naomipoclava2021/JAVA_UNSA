package ejemplo_de_teoria;
import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm= new HashMap<String,String>();
		
//		Añadir elementos
		hm.put("1", "Argentina");
		hm.put("3", "Chile");
		hm.put("2", "Bolivia");
		
		System.out.println(hm);
		
		System.out.println("\nAcceso a un elemento");
		System.out.println(hm.get("3"));
		System.out.println();
		
//		eleminar un elemento
		hm.remove("2");
		System.out.println(hm);
		
//		HasMap - Tamaño
		System.out.println("\nTamaño");
		System.out.println(hm.size());
		
		System.out.println("\nAcceso claves");
		for(String i: hm.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("\nAcceso a valor");
		for(String i: hm.values()) {
			System.out.println(i);
		}
		
		System.out.println("\nAcceso a clave y valor");
		for (String i: hm.keySet()) {
			System.out.println(i+ " "+ hm.get(i));
		}
		
		System.out.println("\nEliminar todo");
		hm.clear();
		System.out.println(hm);
		
		
		

	}

}
