package ejemplo_de_teoria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		System.out.println(list);
		
		System.out.println(	list.isEmpty());
		
		list.add("Marta");
		list.add("Naomi");
		list.add("Mauro");
		
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
	
	

	}

}
