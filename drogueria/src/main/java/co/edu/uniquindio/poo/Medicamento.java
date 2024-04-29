package co.edu.uniquindio.poo;

public class Medicamento extends Producto {
    private final double dosis;

    public Medicamento (String codigoProducto, String nombre, String descripcion, double precio, Stock stock, 
                        String proveedor, int cantidadSolicitada, double dosis){
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor, cantidadSolicitada);
        this.dosis = dosis;
        
    }

    public double getDosis() {
        return dosis;
    }

    
}
