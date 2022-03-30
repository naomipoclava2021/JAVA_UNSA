package controlador;

public class PruebaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lenguajes[] = { "Java", "CSharp", "Python", "kotlin", "Perl", "Scala" };
		System.out.println(lenguajes);

		for (String elemento : lenguajes) {
			System.out.printf("Lenguaje de programacion: %s \n", elemento);

		}
		System.out.println("fin de programa");
	}

}
