package biblioteca.util;

public class ContadorItems {
	private static int ItemBiblioteca;
	
	//Getter y Setter de ItemBiblioteca para poder acceder al atributo
	public static int getItemBiblioteca() {
		return ItemBiblioteca;
	}


	public static void setItemBiblioteca(int itemBiblioteca) {
		ItemBiblioteca = itemBiblioteca;
	}

	//Metodo estático para obtener el total de items
	public static int getTotalItems() {
		return ItemBiblioteca;
	}
}
