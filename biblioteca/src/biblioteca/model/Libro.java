package biblioteca.model;

public class Libro extends ItemBiblioteca {
	//Atributos
	protected Autor autor; //Composicion (tiene un)
	protected int numeroPaginas;
	
	//Constructor con atributos del padre y los suyos
	public Libro(String id, String titulo, int anioPublicacion, Autor autor, int numeroPaginas) {
		//Para acceder a los atributos del padre utilizamos super
		super(id, titulo, anioPublicacion);
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	//Metdodo con contenido obligatorio
	public String obtenerDescripcion() {
		return "Id: " + id + ", Titulo: " + getTitulo() + ", Año de publicacion: " + getAnioPublicacion() + ", Autor: " + autor + ", Numero de paginas: " + numeroPaginas;
	}
	
	
}
