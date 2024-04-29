package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    private final Collection<Producto> productos;
    private final Cliente clientePedido;

    public Pedido(LocalDate fecha, int cantidad, Collection<Producto> productos, Cliente clientePedido) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.productos = new LinkedList<>();
        this.clientePedido = clientePedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Collection<Producto> getProductos() {
        return productos;
    }

    public Cliente getClientePedido() {
        return clientePedido;
    }
    

    public boolean pedidoConProductoSinStock(Collection<Producto> productos) {
        boolean stockInsuficiente = false;
        for (Producto producto : productos) {
            if (producto.getStock().obtenerCantidadEnStock(producto) <= 0) {
                stockInsuficiente = true;
            }
        }
        return stockInsuficiente;
    }

    public Collection<Producto> productosConStockMayorA100 () {
        Collection<Producto> productosConStockMayorA100 = new LinkedList<>();
        for(Producto producto : productos) {
            if(producto.getStock().obtenerCantidadEnStock(producto) > 100){
                productosConStockMayorA100.add(producto);
            }
        }
        return productosConStockMayorA100;
    }

    public double calcularCostoTotalPedido(){
        double costoTotal = 0.0;
        for(Producto producto : productos){
            costoTotal += producto.getCantidadSolicitada() * producto.getPrecio();
        }
    return costoTotal * cantidad;
    }

}


