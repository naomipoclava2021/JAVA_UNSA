package practica;

public class Persona{
	private String nombre;
	
	public Persona(String nombre) {
		this.setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludar () {
		System.out.println("Hola");
	}
	
	
	public class Alumno extends Persona {
		public Alumno (String nombre) {
			super (nombre);
		}
		
		public void saludar() {
			System.out.println("Hola soy alumno");
			
		}
	}
	
	public class Profesor extends Persona{
		public Profesor (String nombre) {
			super (nombre);
		}
		
		public void saludar() {
			System.out.println("Hola soy un profesor");
		}
	}
	
	
	public class Empleado extends Persona{
		public Empleado (String nombre) {
			super (nombre);
		}
		
		public void saludar() {
			System.out.println("Soy un empleado");
		}
	}
	
	
	
}


	

	
	
	
	
