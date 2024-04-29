package co.edu.uniquindio.poo;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public abstract double calcularArea();
    
    
}
