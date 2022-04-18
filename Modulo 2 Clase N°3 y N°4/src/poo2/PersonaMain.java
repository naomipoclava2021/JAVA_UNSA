package poo2;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Naomi", "Poclava", 22);
		p1.mostrar();
		System.out.println();
		p1.setNombre("Mauro");
		p1.setApellido("Serrano");
		p1.setEdad(21);
		
		p1.mostrar();
		
		System.out.println();
		Persona p2 = new Persona();
		p2.mostrar();
		System.out.println();
		p2.setNombre("Micaela");
		p2.setApellido("Suarez");
		p2.setEdad(24);
		p2.mostrar();
		System.out.println();
		
		Persona p3 = new Persona(p1);
		p3.mostrar();

	}

}
