package Almacen;

import java.util.ArrayList;

public class Pedido {
	
	public static int  id=0; 
	private int idPedido=0; 
	private boolean estado; 
	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public int getIdPedido() {
		return idPedido;
	}
	public Pedido() {
		super();
		this.idPedido = Pedido.id++; 
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	} 
	
	
	
	
	
	

}
