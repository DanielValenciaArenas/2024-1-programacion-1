package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;


public class Proyecto {
    private final String nombre;
    private final double costoTotal;
    public final Collection<ParqueInfantil> parques;

    public Proyecto (String nombre, double costoTotal){
        this.nombre = nombre;
        this.costoTotal = costoTotal;
        this.parques = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
    
}
