package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    //Math.PI da el valor de π
    //Math.pow() se utiliza para elevar un número a una potencia 

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
