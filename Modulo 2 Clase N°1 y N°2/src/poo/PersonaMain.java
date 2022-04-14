package poo;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Cristian", "Cruz", "23233", "Democracia");
		persona1.mostrar();
		
		System.out.println();
		
		persona1.setDomicilio("Juan calchaqui");
		persona1.mostrar();

	}

}
