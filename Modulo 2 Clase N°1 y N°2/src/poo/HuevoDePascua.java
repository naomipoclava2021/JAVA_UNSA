package poo;

public class HuevoDePascua {
	private String forma;
	private int numeracion;
	private float gramos;
	private String chocolate;
	private String decolacion;
	private boolean sorpresa;

public HuevoDePascua() {
	
}

public HuevoDePascua(String diseño, int numeracion, float gramos, String chocolate) {
	this.forma = diseño;
	this.numeracion = numeracion;
	this.gramos = gramos;
	this.chocolate = chocolate;
	
}

public void mostrar() {
	System.out.println("EL diseño es en forma de: "+ this.forma);
	System.out.println("Molde N°: "+ this.numeracion);
	System.out.println("Gramos: "+ this.gramos);
	System.out.println("Chocolate: "+ this.chocolate);
}

public static void main (String arg[]) {
	HuevoDePascua huevoConejo = new HuevoDePascua("Conejo", 5, 25, "negro" );
	huevoConejo.mostrar();
	
	String forma = huevoConejo.forma;
	System.out.println(forma);
	
	HuevoDePascua huevoKinder = new HuevoDePascua("Huevo", 12, 200, "Negro");
	huevoKinder.mostrar();
	
	HuevoDePascua cisne = new HuevoDePascua("Cisne", 15, 300, "Blanco");
	cisne.mostrar();
	
}

}
