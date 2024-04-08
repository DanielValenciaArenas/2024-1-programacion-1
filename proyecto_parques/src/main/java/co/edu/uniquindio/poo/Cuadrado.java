package co.edu.uniquindio.poo;

public class Cuadrado extends FiguraGeometrica {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
}
