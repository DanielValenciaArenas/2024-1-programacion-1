package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica {
    private final double ancho;
    private final double alto;

    public Rectangulo(double ancho, double alto){
        assert ancho > 0 && alto > 0;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
    
}
