package poo2;

public class Raices {
	//Atributos
	private double a;
	private double b;
	private double c;
	
	
   //Constructores
	
	public Raices() {
		
	}
	
	//Constructor normal
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//Constructor de copia
	
	public Raices(Raices raices) {
		this.a = raices.a;
		this.b = raices.b;
		this.c = raices.c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	

}
