
package fundamentos.de.programacion.menuaeropuerto;

import java.util.Random;


public class Avion {
    int id;
    int cantidadMaxAsientos;
    int cantidadActualPasajeros;
    boolean estadoAvion;

    public Avion(int id, int cantidadMaxAsientos, int cantidadActualPasajeros, boolean estadoAvion) {
        this.id = id;
        this.cantidadMaxAsientos = cantidadMaxAsientos;
        this.cantidadActualPasajeros = cantidadActualPasajeros;
        this.estadoAvion = estadoAvion;
    }
    
    public Avion(){
        Random rd = new Random();
        this.id = rd.nextInt(100)+1;
        this.cantidadMaxAsientos = rd.nextInt(18)+162;
        this.cantidadActualPasajeros = rd.nextInt(this.cantidadMaxAsientos + 1);
        this.estadoAvion = true;
        
    //debo intertar los getters y setters.    
        
        
        
        
        
    }
    
}
