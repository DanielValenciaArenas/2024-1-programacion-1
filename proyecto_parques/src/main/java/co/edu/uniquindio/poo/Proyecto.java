package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Comparator;

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

    public void agregarParqueInfantil(ParqueInfantil parque) {
        parques.add(parque);
    }

    public ParqueInfantil obtenerParquePorNombre(String nombre) {
        for (ParqueInfantil parque : parques) {
            if (parque.getNombre().equals(nombre)) {
                return parque;
            }
        }
        return null; 
    }

    public Collection<ParqueInfantil> obtenerParquesPorMunicipio(Municipio municipio) {
        Collection<ParqueInfantil> parquesEnMunicipio = new LinkedList<>();
        for (ParqueInfantil parque : parques) {
            if (parque.getMunicipio().equals(municipio)) {
                parquesEnMunicipio.add(parque);
            }
        }
        return parquesEnMunicipio;
    }

    private double calcularCostoTotalParque(ParqueInfantil parque) {
        double costoTotalParque = 0.0;
        
        for (Zona zona : parque.getZonas()) {
            Material material = zona.getMaterial();
            costoTotalParque += material.getPrecio();
        }
        Municipio municipio = parque.getMunicipio();
        costoTotalParque += municipio.getSobreCosto();
        
        return costoTotalParque;
    }

    public Collection<ParqueInfantil> listarParquesDiseñadosOrdenadosPorCostoTotalAscendente() {
        LinkedList<ParqueInfantil> parquesOrdenados = new LinkedList<>();
        parquesOrdenados.sort(Comparator.comparingDouble(this::calcularCostoTotalParque));
        
        return parquesOrdenados;
    }

    public double calcularCostoTotalProyecto() {
        double costoTotalProyecto = 0.0;

        for (ParqueInfantil parque : parques) {
            costoTotalProyecto += calcularCostoTotalParque(parque);
        }

        return costoTotalProyecto;
    }
    
}
