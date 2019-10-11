package arrays_work_objects;

public class Alumno {
	
	private int numeroClase; 
	private int notaBasesDatos;
	private int notaProgramación;
	

	public Alumno(int numeroClase, int notaBasesDatos, int notaProgramación) {
		super();
		this.numeroClase = numeroClase;
		this.notaBasesDatos = notaBasesDatos;
		this.notaProgramación = notaProgramación;
	}
	
	public Alumno() {
		super();
		this.notaBasesDatos = -1;
		this.notaProgramación = -1;
	}

	public int getNumeroClase() {
		return numeroClase;
	}
	public void setNumeroClase(int numeroClase) {
		this.numeroClase = numeroClase;
	}
	public int getNotaBasesDatos() {
		return notaBasesDatos;
	}
	public void setNotaBasesDatos(int notaBasesDatos) {
		this.notaBasesDatos = notaBasesDatos;
	}
	public int getNotaProgramación() {
		return notaProgramación;
	}
	public void setNotaProgramación(int notaProgramación) {
		this.notaProgramación = notaProgramación;
	} 
	
	

}
