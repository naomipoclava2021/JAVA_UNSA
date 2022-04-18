package poo2;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona() {
		
	}
	
	public Persona(String nom, String app, int edad) {
		this.nombre = nom;
		this.apellido = app;
		this.edad = edad;
	}
	
	public Persona(Persona persona) {
		this.nombre = persona.nombre;
		this.apellido = persona.apellido;
		this.edad = persona.edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println(getNombre());
		System.out.println(getApellido());
		System.out.println(getEdad());
	}
	
	
}
