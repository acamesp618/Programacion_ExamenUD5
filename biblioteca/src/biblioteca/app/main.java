package biblioteca.app;
import biblioteca.*;
import biblioteca.model.Autor;
import biblioteca.model.Libro;


public class main {

	public static void main(String[] args) {
		
		Autor cervantes = new Autor("Cervantes", "Español");
		Autor anonimo = new Autor("Anonimo", "Anonimo");
		
		Libro libro1 = new Libro ("22345D", "Don Quijote de la Mancha", 1845, cervantes, 968);
		Libro libro2 = new Libro ("25645D", "Biblia", 1302, anonimo, 1635);
		libro1.obtenerDescripcion();
		
		System.out.println("Total items creados: " + getItemBiblioteca());
		
		
	}

}
