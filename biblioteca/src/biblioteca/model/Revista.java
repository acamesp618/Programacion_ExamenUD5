package biblioteca.model;

public class Revista extends ItemBiblioteca {
	//Atributos
	private int numero;
	private String periodicidad;
	
	//Constructor con atributos del padre y los suyos
	public Revista(String id, String titulo, int anioPublicacion, int numero, String periodicidad) {
		//Para acceder a los atributos del padre utilizamos super
		super(id, titulo, anioPublicacion);
		this.numero = numero;
		this.periodicidad = periodicidad;
	}
	
	//Metdodo con contenido obligatorio
	public String obtenerDescripcion() {
		return "Id: " + getId() + ", Titulo: " + getTitulo() + ", Año de publicacion: " + getAnioPublicacion() + ", Numero: " + numero + ", Periodicidad: " + periodicidad;
	}
	
	
	
}
