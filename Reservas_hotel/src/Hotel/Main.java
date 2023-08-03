package Hotel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creación de un objeto Hotel
        Hotel hotel = new Hotel();

        // Creación de habitaciones
        Habitacion habitacion1 = new Habitacion(101, "Individual", 100.0);
        Habitacion habitacion2 = new Habitacion(201, "Doble", 150.0);
        
     // Establecer disponibilidad en true para ambas habitaciones
        habitacion1.setDisponibilidad(true);
        habitacion2.setDisponibilidad(true);
        
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);

        // Variable para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Menú de opciones
            System.out.println("\n--- GESTIÓN DE RESERVAS HOTEL ---");
            System.out.println("1. Realizar reserva");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Mostrar reservas por huésped");
            System.out.println("4. Mostrar habitaciones disponibles");
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de reserva: ");
                    int numReserva = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después de leer el número

                    System.out.print("Ingrese la fecha de check-in (formato yyyy-MM-dd): ");
                    String fechaCheckIn = scanner.nextLine();

                    System.out.print("Ingrese la fecha de check-out (formato yyyy-MM-dd): ");
                    String fechaCheckOut = scanner.nextLine();

                    System.out.print("Ingrese el número de habitación: ");
                    int numHabitacion = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después de leer el número

                    System.out.print("Ingrese el nombre del huésped: ");
                    String nombreHuesped = scanner.nextLine();

                    System.out.print("Ingrese el apellido del huésped: ");
                    String apellidoHuesped = scanner.nextLine();

                    System.out.print("Ingrese el teléfono del huésped: ");
                    String telefonoHuesped = scanner.nextLine();

                    Huesped huesped = new Huesped(nombreHuesped, apellidoHuesped, telefonoHuesped);
                    Reserva reserva = new Reserva(numReserva, fechaCheckIn, fechaCheckOut, numHabitacion, huesped);
                    hotel.agregarReserva(reserva);
                    System.out.println("Reserva realizada correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el número de reserva a cancelar: ");
                    int numReservaCancelar = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después de leer el número
                    hotel.cancelarReserva(numReservaCancelar);
                    System.out.println("Reserva cancelada correctamente.");
                    break;
                case 3:
                    System.out.println("Ingrese el teléfono del huésped: ");
                    String telefonoBusqueda = scanner.nextLine();
                    System.out.println("Reservas realizadas por el huésped con teléfono " + telefonoBusqueda + ":");
                    for (Reserva r : hotel.buscarReservasPorHuesped(telefonoBusqueda)) {
                        System.out.println("Número de reserva: " + r.getNum_reserva() + ", Habitación: " + r.getNum_habitacion() +
                                ", Check-in: " + r.getFecha_check_in() + ", Check-out: " + r.getFecha_check_out());
                    }
                    break;
                case 4:
                    System.out.println("Habitaciones disponibles:");
                    for (Habitacion habitacion : hotel.getHabitaciones()) {
                        if (habitacion.isDisponibilidad()) {
                            System.out.println("Número de habitación: " + habitacion.getNum_habitacion() +
                                    ", Tipo: " + habitacion.getTipo_habitacion() + ", Precio: " + habitacion.getPrecio());
                        }
                    }
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        // Cerramos el Scanner antes de finalizar el programa
        scanner.close();
    }
}
