package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {
    private final double ancho;
    private final double alto;

    public Rectangulo(String nombre, double ancho, double alto){
        super(nombre);
        this.ancho = ancho;
        this. alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double calcularArea() {
        double areaRectangulo = 0;
        areaRectangulo = alto * ancho;
        return areaRectangulo;
    }

    
}
