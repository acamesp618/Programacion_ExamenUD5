package biblioteca.model;

public class Autor {
	protected String nombre;
	protected String nacionalidad;
	
	//Constructor
	public Autor(String nombre, String nacionalidad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	
	//Getter y Setter de Nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Getter y Setter de Nacionalidad
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	
	
}
