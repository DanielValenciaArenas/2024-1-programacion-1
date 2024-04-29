package co.edu.uniquindio.poo;

public class ProductoHogar extends Producto {
    private final String indicaciones;

    public ProductoHogar(String codigoProducto, String nombre, String descripcion, double precio, Stock stock, 
                        String proveedor, int cantidadSolicitada, String indicaciones){
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor, cantidadSolicitada);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    
    
}
