package co.edu.uniquindio.poo;

public abstract class Producto {

    private final String codigoProducto;
    private final String nombre;
    private final String descripcion;
    private final double precio;
    private final Stock stock;
    private final String proveedor;
    private int cantidadSolicitada;

    public Producto(String codigoProducto, String nombre, String descripcion, double precio, Stock stock,
                    String proveedor, int cantidadSolicitada) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
        this.cantidadSolicitada = 0;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public Stock getStock() {
        return stock;
    }

    public String getProveedor() {
        return proveedor;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }



    
}
