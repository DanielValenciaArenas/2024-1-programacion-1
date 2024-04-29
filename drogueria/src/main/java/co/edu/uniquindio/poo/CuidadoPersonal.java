package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto {
    private final String ingredientes;

    public CuidadoPersonal(String codigoProducto, String nombre, String descripcion, double precio, Stock stock, 
                            String proveedor, int cantidadSolicitada, String ingredientes){
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor, cantidadSolicitada);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    
}
