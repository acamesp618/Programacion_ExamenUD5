package biblioteca.model;


public abstract class ItemBiblioteca {
	//Atributos
	//Añadimos la visibilidad privada para más privacidad
	protected String id;
	protected String titulo;
	protected int anioPublicacion;
	
	
	//Constructor
	public ItemBiblioteca(String id, String titulo, int anioPublicacion) {
		this.id = id; //El .this hace referencia al atributo de la clase
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		
		setItemBilioteca() +=1;
	}
	
	//Getter y Setter de Id
	// Al ser atributos privados, necesitamos llegar hasta ellos a través de Getter y Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	//Getter y Setter de Titulo
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//Getter y Setter de AnioPublicacion
	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	//Metodo toString()
	@Override //Añadimos Override para saber que vamos a sobreescribir el metodo
	public String toString() {
        return "Id: " + id + "Titulo: " + titulo;
	}
	
	//Método
	//Al ser abstract no lleva contenido
	//Pero sus clases hijas tienen como obligación llevar contenido
	public abstract String obtenerDescripcion();
	
	
	
}
