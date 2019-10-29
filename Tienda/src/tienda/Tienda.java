package tienda;

public class Tienda {
	
	private Producto listadoproductos[]; //Cree un lista de productos
	
	public Tienda() {
		listadoproductos= new Producto[100];
	}

	public Producto[] getListadoproductos() {
		return listadoproductos;
	}

	public void setListadoproductos(Producto[] listadoproductos) {
		this.listadoproductos = listadoproductos;
	}
	
	public void addProducto(String nombre, float precio, String tipo,int codigo ) {
		Producto p = new Producto(); //Creando un nuevo producto
		p.setNombre(nombre); //Dandole valor a  los atributos
		p.setCodigo(codigo);
		p.setPrecio(precio);
		p.setTipo(tipo);
	
		boolean encontrado = false; 
		
		for (int i = 0; i < listadoproductos.length; i++) {
			if(listadoproductos[i]!=null) {
			if(listadoproductos[i].getCodigo()== codigo) {
				System.out.println("Producto ya existe");
				encontrado = true; 
				break;
			}
			}
		}
			
		if(encontrado == false) {
			for (int i = 0; i < listadoproductos.length; i++) {
				if(listadoproductos[i]== null) {
				listadoproductos[i]= p; 
				break; 
				}
			}
		}
		
	}
	
	
	

}
