package modelo;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Libro> libros = new ArrayList<Libro>(); 
	ArrayList<Socio> socios = new ArrayList<Socio>();
	int numeroMaximoLibros; 
	
	 public Biblioteca(	int numeroMaximoLibros) {
		 this.numeroMaximoLibros = numeroMaximoLibros; 
	}
	
	public int addLibro(String isbn, String titulo){
		Libro lb = new Libro(); 
		lb.setIsbn(isbn);
		lb.setTitulo(titulo);
		lb.setDisponible(true);
		
		
		boolean encontrado= false; 
		for (Libro libro : libros) {
			if(libro.getIsbn().equals(lb.getIsbn())) {
				encontrado = true;
					break;
			}
		}
		if(encontrado == false) {
		libros.add(lb); 
		return 0;
		}else {
			return -1;
		}
	}
	
	public int addSocio(String dni, String nombre, String contraseña) {
		Socio sc = new Socio(dni, nombre, contraseña);
		boolean encontrado= false; 
		for (Socio socio : socios) {
			if(socio.getDni().equals(sc.getDni())) {
				encontrado = true;
					break;
			}
		}
		if(encontrado == false) {
		socios.add(sc); 
		return 0;
		}else {
			return -2;
		}
	}
	
	public void sacarLibro(String dni, String contraseña, String isbn){
	
		//Autenticar al usaurio
		int comprobrUser= comprobarUsuario(dni, contraseña);
		if(comprobrUser==0) {
			
			//Comprobar numero limito de socios
			
			
		}else {
			if(comprobrUser==-3) 
				System.out.println("No hay un socio identificado con ese DNI");
			if(comprobrUser==-4)
				System.out.println("No coincide la contraseña del usuario");
		}
		
	}
	
	public int comprobarUsuario(String dni, String contraseña) {
			boolean encontrado=false;
			boolean user = false;
	
			for (Socio socio : socios) {
				if(socio.getDni().equals(dni)) {
					encontrado = true;
						if(socio.getPassword().equals(contraseña)) {
							user = true;
							break; 
						}
				}
			}
			if(user == false)
				return  -4;
			if(encontrado == true)
				return 0;
			if(encontrado == false)
				return -3;
			
			return 0;
		}
	
	public void comprobarLimiteUsers() {
		
	}
	
}
