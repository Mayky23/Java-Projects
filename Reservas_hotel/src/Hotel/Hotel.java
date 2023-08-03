package Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Reserva> reservas;
    private List<Habitacion> habitaciones;

    public Hotel() {
        reservas = new ArrayList<>();
        habitaciones = new ArrayList<>();
    }

    // Métodos para gestionar las reservas
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void cancelarReserva(int numeroReserva) {
        Reserva reserva = buscarReserva(numeroReserva);
        if (reserva != null) {
            reservas.remove(reserva);
            liberarHabitacion(reserva.getNum_habitacion());
        }
    }

    public Reserva buscarReserva(int numeroReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getNum_reserva() == numeroReserva) {
                return reserva;
            }
        }
        return null; // No se encontró la reserva con ese número
    }

    public List<Reserva> buscarReservasPorHuesped(String telefono) {
        List<Reserva> reservasHuesped = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getHuesped().getTelefono().equals(telefono)) {
                reservasHuesped.add(reserva);
            }
        }
        return reservasHuesped;
    }

    // Métodos para gestionar las habitaciones
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void liberarHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNum_habitacion() == numeroHabitacion) {
                habitacion.setDisponibilidad(true);
                return;
            }
        }
    }

    public Habitacion buscarHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNum_habitacion() == numeroHabitacion) {
                return habitacion;
            }
        }
        return null; // No se encontró la habitación con ese número
    }


    // Getters para obtener la lista de reservas y habitaciones
    public List<Reserva> getReservas() {
        return reservas;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    // Método para obtener las habitaciones disponibles
    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> habitacionesDisponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponibilidad()) {
                habitacionesDisponibles.add(habitacion);
            }
        }
        return habitacionesDisponibles;
    }
}
