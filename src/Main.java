import java.util.*;

public class Main {

    public static void main(String[] args) {
        datosHoteles();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Aplicación Booking Hoteles\n");
        System.out.println("1. Buscar hoteles");
        System.out.println("2. Confirmar habitaciones disponibles");
        System.out.println("3. Reservar");
        System.out.println("4. Actualizar reserva");
        System.out.println("5. Salir");

        System.out.print("Elige una opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    buscarHoteles(scanner);
                    break;
                case 2:
                    confirmarHabitaciones(scanner);
                    break;
                case 3:
                    realizarReserva(scanner);
                    break;
                case 4:
                    actualizarReserva(scanner);
                    break;
                case 5:
                    System.out.println("Gracias por usar la aplicación Booking Hoteles");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

            System.out.println("Aplicación Booking Hoteles");
            System.out.println("1. -- Buscar hoteles --");
            System.out.println("2. -- Confirmar habitaciones disponibles  --");
            System.out.println("3. -- Reservar --");
            System.out.println("4. -- Actualizar reserva --");
            System.out.println("5. -- Salir --");

            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
        }

        scanner.close();
    }


}
