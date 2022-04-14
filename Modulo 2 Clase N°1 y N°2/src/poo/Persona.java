package poo;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private String domicilio;
	
	//constructor por defecto
	public Persona() {
		
	}
	
	//consturtor de copia
	public Persona (Persona persona) {
		this.nombre = persona.nombre;
		this.apellido = persona.apellido;
		this.dni = persona.dni;
		this.domicilio = persona.domicilio;
	}

	//constructor normal
	public Persona(String nom, String app, String dni, String dom){
		this.nombre = nom;
		this.apellido =app;
		this.dni = dni;
		this.domicilio = dom;
	}
	
	
	
	
	
	
	
	
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}
	
	

	//mostrar
	public void mostrar() {
		System.out.println(getNombre());
		System.out.println(getApellido());
		System.out.println(getDni());
		System.out.println(getDomicilio());
		
	}
	
	public static void main(String args[]) {
		Persona persona1 = new Persona("Cristian", "Cruz", "23233", "Democracia");
		persona1.mostrar();
	}
}
