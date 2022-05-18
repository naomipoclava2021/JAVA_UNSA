package ejemplo_teoria;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class LecturaDeLinea2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String c;
		System.out.println("se lee hasta encontrar el fin de linea: ");
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		c = teclado.readLine();
		System.err.println("Contados "+ c.length()+ " bytes en total");
		

	}

}
