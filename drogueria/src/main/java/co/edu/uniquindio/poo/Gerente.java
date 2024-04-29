package co.edu.uniquindio.poo;

public class Gerente extends Empleado {

    public Gerente(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
    }

    public void agregarProductoAlStock(Stock stock, Producto producto, int cantidad){
        stock.agregarProducto(producto, cantidad);
    }

    public void eliminarProductoDelStock(Stock stock, Producto producto) {
        stock.eliminarProducto(producto);
    }


}
