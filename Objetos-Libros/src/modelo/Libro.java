package modelo;

public class Libro {
	String isbn; 
	String titulo; 
	boolean disponible;
	Socio socio;
	
	public Libro() {
		super();
	}
	public Libro(String isbn, String titulo, boolean disponible, Socio socio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.disponible = disponible;
		this.socio = socio;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	} 

	
	
}
