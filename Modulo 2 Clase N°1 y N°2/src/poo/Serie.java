package poo;

public class Serie {

	private String Titulo;
	private int Temporada;
	private String Genero;
	private String Creador;
	
	
	//constructor por defecto
	
	public Serie() {
		
	}
	
	//constructor de copia
	public Serie(Serie serie) {
		this.Titulo = serie.Titulo;
		this.Temporada = serie.Temporada;
		this.Genero = serie.Genero;
		this.Creador = serie.Creador;
	}
	
	//Constructor Normal
	
	public Serie(String titulo, int temporada, String genero, String creador) {
		this.Titulo = titulo;
		this.Temporada = temporada;
		this.Genero = genero;
		this.Creador = creador;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public int getTemporada() {
		return Temporada;
	}

	public void setTemporada(int temporada) {
		Temporada = temporada;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getCreador() {
		return Creador;
	}

	public void setCreador(String creador) {
		Creador = creador;
	}
	
	public void mostrar() {
		System.out.println(getTitulo());
		System.out.println(getTemporada());
		System.out.println(getGenero());
		System.out.println(getCreador());
	}
	
	public static void main(String [] arg) {
		Serie serie1 = new Serie("La casa de papel", 4, "Terror", "Linuz");
		serie1.mostrar();
	}

}
