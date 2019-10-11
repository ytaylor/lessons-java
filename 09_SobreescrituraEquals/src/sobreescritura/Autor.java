package sobreescritura;

public class Autor {
	
	private String nombre; 
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	protected Object clone(){
		Autor autor = new Autor(); 
		autor.setNombre(this.nombre);
		return autor;
	}
	
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if((o instanceof Autor) && (((Autor)o).getNombre()== this.nombre))
		{
			return true;
		}else{
			
			return false;
		}
	}
}
