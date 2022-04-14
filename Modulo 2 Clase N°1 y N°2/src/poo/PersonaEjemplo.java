package poo;

public class PersonaEjemplo {

	// Atributp
	private String nombre;
	private String apellido;
	private int edad;
	private float altura;
	private int dni;

	public PersonaEjemplo() {

	}

	public PersonaEjemplo(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public PersonaEjemplo(String nombre, String apellido, int edad, float altura, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.dni = dni;
	}

	public void mostrar() {
		System.out.println(this.nombre);
		System.out.println(this.apellido);
		System.out.println(this.edad);
		System.out.println(this.altura);
		System.out.println(this.dni);
	}

	public static void main(String arg[]) {
		PersonaEjemplo naomi = new PersonaEjemplo("naomi", "poclava", 22);
		PersonaEjemplo matias = new PersonaEjemplo("matias", "cisnero", 24, 32, 3221243);

		naomi.mostrar();
		matias.mostrar();
	}

}
