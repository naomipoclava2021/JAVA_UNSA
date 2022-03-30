package controlador;

public class PruebaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia = (int) (Math.random() * 7);
		System.out.println(dia);
		PruebaSwitch prog = new PruebaSwitch();
		// prog.seleccionaDia(dia);
		// prog.clasificaDia(dia);
		String mensaje = prog.expresion(dia);
		System.out.println(mensaje);
	}

	/*
	 * private void clasificaDia(int dia) { switch (dia) { case 0, 1, 2, 3, 4:
	 * System.out.println("ES DIA LABORAL"); break; case 5, 6:
	 * System.out.println("ES FIN DE SAMANA"); break; default:
	 * System.out.println("es numero de dia no encuentra en el rango"); break; } }
	 */

	/*
	 * private void seleccionaDia(int dia) { // int, string, enums switch (dia) {
	 * case 0: System.out.println("es lunes"); System.out.println("es dia laboral");
	 * break; case 1: System.out.println("es martes");
	 * System.out.println("es dia laboral"); break; case 2:
	 * System.out.println("es miercoles"); System.out.println("es dia laboral");
	 * break; case 3: System.out.println("es jueves");
	 * System.out.println("es dia laboral"); break; case 4:
	 * System.out.println("es viernes"); System.out.println("es dia laboral");
	 * break; case 5: System.out.println("es sabado");
	 * System.out.println("es fin de semana"); break; case 6:
	 * System.out.println("es domingo"); System.out.println("es fin de semana");
	 * break; default: System.out.println("no es ninguno"); break; }
	 * 
	 * System.out.println("FIN DEL PROGRAMA"); }
	 */

	private String expresion(int dia) {
		String cadenaDia = switch (dia) {
		case 0 -> "Lunes";
		case 1 -> "Martes";
		case 2 -> "Mircoles";
		case 3 -> "Jueves";
		case 4 -> "Viernes";
		case 5 -> "Sabado";
		case 6 -> "Domingo";
		default -> "No es un dia";
		};
		return "El dia de hoy es %s".formatted(cadenaDia);
	}

}
