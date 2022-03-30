package controlador;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int calificacion = (int) (Math.random() * 11);
		 * System.out.println(calificacion); String mensaje = calificacion > 5 ?
		 * "APROBADO" : "DESAPROBADO"; System.out.println(mensaje);
		 */

		int esMayorDeEdad = (int) (Math.random() * 25);
		System.out.println(esMayorDeEdad);
		String boliche = esMayorDeEdad >= 18 ? "PUEDE PASAR" : "RAJA DE ACA PENDEJO";
		System.out.println(boliche);
	}

}
