package controlador;

import java.util.List;

public class PruebaBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lenguajes = List.of("Java", "CSharp", "Kotlin", "Scala", "Python");
		for (String elemento : lenguajes) {
			System.out.printf("El lenguaje de programacion es: %s\n", elemento);
			if (elemento.startsWith("C")) {
				System.out.printf("se encontro la coicidencia es: %s\n", elemento);
				break;
			}
		}

	}

}
