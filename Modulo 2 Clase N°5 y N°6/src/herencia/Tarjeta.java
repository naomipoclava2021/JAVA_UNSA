package herencia;

public class Tarjeta {

	public static void main(String[] args) {
		TCredito JPTarjeta = new TCredito("666", "JPerez", "BcoPatagonia", 2000, 10000);
		TCredito DMTarjeta = new TCredito("777", "DMartin", "BcoGalicia", 5000, 10000);
		JPTarjeta.muestraDatos();
	}

}
