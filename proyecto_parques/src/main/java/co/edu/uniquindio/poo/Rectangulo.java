package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica {
    private final double ancho;
    private final double alto;

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
    
}
