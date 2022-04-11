package poo;

public class Autos {

	// Atributos

	private int cantidad_ruedas;
	private int modelos;
	private int cantidad_puertas;
	private String marca;
	private String tipo_motor;
	private String cantidad_asientos;
	private boolean levanta_cristales;
	private String patente;
	private int cap_combustible;
	private String color;

	public Autos() {

	}

	public Autos(int modelo, String tipomotor, String marca, String color) {
		this.modelos = modelo;
		this.tipo_motor = tipomotor;
		this.marca = marca;
		this.color = color;
	}

	public void mostrar() {
		System.out.println(this.modelos);
		System.out.println(this.tipo_motor);
		System.out.println(this.marca);
		System.out.println(this.color);
	}

	public static void main(String arg[]) {
			Autos Clio = new Autos(2000, "1.4", "Renult", "GRIS");
			
			Clio.mostrar();
			
			String marca = Clio.marca;
			System.out.println(marca);
			
			
	}

}
