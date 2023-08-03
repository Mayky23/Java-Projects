package Hotel;

public class Habitacion {

	int num_habitacion ; 
	
	String tipo_habitacion ; 
	
	boolean disponibilidad ;
	
	double precio ;
	
	public Habitacion(int num_habitacion, String tipo_habitacion, boolean disponibilidad, int precio) {
		super();
		this.num_habitacion = num_habitacion;
		this.tipo_habitacion = tipo_habitacion;
		this.disponibilidad = disponibilidad;
		this.precio = precio;
	} 

	public Habitacion(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}

	public int getNum_habitacion() {
		return num_habitacion;
	}

	public void setNum_habitacion(int num_habitacion) {
		this.num_habitacion = num_habitacion;
	}

	public String getTipo_habitacion() {
		return tipo_habitacion;
	}

	public void setTipo_habitacion(String tipo_habitacion) {
		this.tipo_habitacion = tipo_habitacion;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
