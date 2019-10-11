package read_write_files;

import java.io.Serializable;

public class personas implements Serializable, Comparable<personas>{
	
	// cada vez que haya que guardar datos por caracteres hay que crear un tostring. clic derecho > source > genrate ToString
	@Override
	public String toString() {
		return nombre + "," + apellido1 + "," + apellido2 + "," + edad +
				"," + telefono;
	}

	// ATRIBUTOS
	private String nombre, apellido1, apellido2;
	private int edad, telefono;
	
	// CONSTRUCTORES
	public personas() {
		
	}

	public personas(String nom, String ape1, String ape2, int ed, int tlf) {
		super();
		this.nombre = nom;
		this.apellido1 = ape1;
		this.apellido2 = ape2;
		this.edad = ed;
		this.telefono = tlf;
	}

	
	// GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public int compareTo(personas p) {
		if(this.getEdad()>p.getEdad())
			return -1; 
		else if(this.getEdad()==p.getEdad())
				return 0;
		else
			return 1; 
	}
	
}
