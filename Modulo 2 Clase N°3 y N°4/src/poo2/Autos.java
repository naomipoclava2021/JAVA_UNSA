package poo2;

public class Autos {
    
    // ATRIBUTOS
    private int cant_ruedas;
    private int modelo;
    private int cant_puertas;
    private String marca;
    private String tipo_motor;
    private String cant_asientos;
    private boolean levanta_cristales;
    private String patente;
    private int cap_combustible;
    private String color; 
    
    public Autos() {
        
    }
    
    public Autos(int modelo, String tipo_motor, String marca, String color) {
        this.modelo = modelo;
        this.tipo_motor = tipo_motor;
        this.marca = marca;
        this.color = color;
    }
    
    public Autos(Autos autos) {
    	this.modelo = autos.modelo;
    	this.tipo_motor = autos.tipo_motor;
    	this.marca = autos.marca;
    	this.color = autos.color;
    }
    
    
    
    public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo_motor() {
		return tipo_motor;
	}

	public void setTipo_motor(String tipo_motor) {
		this.tipo_motor = tipo_motor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void mostrar() {
        System.out.println("Los Datos de este Auto son: ");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tipo de motor: " + getTipo_motor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Color: " + getColor());
    }
    
        
    public static void main(String args[]) {
        Autos Clio = new Autos(2000, "1.4", "Renault Clio", "Gris");
        
        Clio.mostrar();
        
        System.out.println();
        
        Autos Clio2001 = new Autos(Clio);
        Clio2001.mostrar();
        
        
    }
    
}