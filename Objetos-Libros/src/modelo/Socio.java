package modelo;

import java.util.ArrayList;

public class Socio {
	
	String dni; 
	String nombre; 
	String password;
	ArrayList<Libro> librosPrestados = new ArrayList<Libro>(); 
	
	public Socio(String dni, String nombre, String password) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.password = password;
	}
	public Socio() {
		super();
	} 
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public ArrayList<Libro> getLibrosPrestados() {
		return librosPrestados;
	}
	
	public int countLibrosPrestaos() {
		return librosPrestados.size(); 
	}
	
	public void addLibroPrestado(Libro libro) {
		librosPrestados.add(libro); 
	}
	
	public void removeLibroPrestado(Libro libro) {
		librosPrestados.remove(libro);
	}
	
	

	
	

}
