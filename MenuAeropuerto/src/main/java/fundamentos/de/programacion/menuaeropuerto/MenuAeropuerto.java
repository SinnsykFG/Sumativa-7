
package fundamentos.de.programacion.menuaeropuerto;

import java.util.Scanner;


public class MenuAeropuerto {
    
    public static void main(String[] args) {
       while (true){ 
        Scanner input = new Scanner(System.in);
        System.out.println("Menú: Aeropueto Diego Aracena");
        System.out.println("1.- Listar el ID de todos los aviones.");
        System.out.println("2.- Mostar cantidad de pasajeros actuales por avión.");
        System.out.println("3.- Mostrar la cantidad de asientos disponibles por avión.");
        System.out.println("4.- Información del avión (buscar avión por ID).");
        System.out.println("5.- Subir pasajeros");
        System.out.println("6.-Bajar pasajeros");
        System.out.println("7.- Salir.");
        
        int opcion = input.nextInt();
        
        if (opcion==7){
            System.out.println("Hasta luego.");
            System.out.println("Ha salido del programa.");
            break;
        }
        if (opcion<1 || opcion>7){
            System.out.println("Opción no válida, por favor ingresa una opción válida");
            continue;
        }
        
        switch (opcion){
            
        }
    }
}
}