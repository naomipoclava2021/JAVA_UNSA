package controlador;

import java.util.List;

public class PruebaContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lenguajes = List.of("Java", "CSharp", "Kotlin", "Scala", "Python");

		for (String elemento : lenguajes) {
			if (elemento.startsWith("K"))
				continue;
			System.out.printf("Lenguaje de programacion es: %s\n", elemento);
		}
		System.out.println("Fin del programa");
	}

}
