package herencia;

public class TCredito {
	private String numero;
	private String nombre;
	private String banco;
	private double balance;
	private double limite;
	
	public TCredito(String vnumero, String vnombre, String vbanco, double vbalance, double vlimite) {
		numero = vbanco;
		nombre = vnombre;
		banco = vbanco;
		balance = vbalance;
		limite = vlimite;
	}

	public String getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}

	public String getBanco() {
		return banco;
	}

	public double getBalance() {
		return balance;
	}

	public double getLimite() {
		return limite;
	}
	
	public boolean puedoComprar(double vprecio) {
		if (vprecio+balance> limite) {
			return false;
		} else {
			balance+= vprecio;
			return true;
		}
	}
	
	public void pagarTarjeta(double vmonto) {
		balance-= vmonto;
	}
	
	public void muestraDatos() {
		System.out.println("numero = "+ getNumero());
		System.out.println("nombre = "+ getNombre());
	}
}

