package AutonumericoCode;

public class AutonumericCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Empleado emp1 = new Empleado(),
	                 emp2 = new Empleado(),
	                 emp3 = new Empleado();
	 
	        emp1.mostrarID();
	        emp2.mostrarID();
	        emp3.mostrarID();
	
	}
}

class Empleado {
    public static int id = 1;
    int idEmpleado;
 
    public Empleado() {
        idEmpleado = Empleado.id++;
    }
 
    public void mostrarID() {
        System.out.println("idEmpleado = " + idEmpleado);
    }
}


