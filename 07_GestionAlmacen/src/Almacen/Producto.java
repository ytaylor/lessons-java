package Almacen;

public class Producto {
	
	private String Codigo; 
	private String Nombre; 
	private int Cantidad;
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public Producto() {
		super();
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	} 
	

}
