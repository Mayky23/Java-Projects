package Hotel;

public class Reserva {

	int num_reserva ; 
	
	String fecha_check_in ; 
	
	String fecha_check_out ; 
	
	int num_habitacion ; 
	
	Huesped huesped ;
	
	public Reserva(int num_reserva, String fecha_check_in, String fecha_check_out, int num_habitacion, Huesped huesped3) {
		super();
		this.num_reserva = num_reserva;
		this.fecha_check_in = fecha_check_in;
		this.fecha_check_out = fecha_check_out;
		this.num_habitacion = num_habitacion;
		this.huesped = huesped3;
	} 

	public int getNum_reserva() {
		return num_reserva;
	}

	public void setNum_reserva(int num_reserva) {
		this.num_reserva = num_reserva;
	}

	public String getFecha_check_in() {
		return fecha_check_in;
	}

	public void setFecha_check_in(String fecha_check_in) {
		this.fecha_check_in = fecha_check_in;
	}

	public String getFecha_check_out() {
		return fecha_check_out;
	}

	public void setFecha_check_out(String fecha_check_out) {
		this.fecha_check_out = fecha_check_out;
	}

	public int getNum_habitacion() {
		return num_habitacion;
	}

	public void setNum_habitacion(int num_habitacion) {
		this.num_habitacion = num_habitacion;
	}

	public Huesped getHuesped() {
		return huesped;
	}

	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}

	
}
