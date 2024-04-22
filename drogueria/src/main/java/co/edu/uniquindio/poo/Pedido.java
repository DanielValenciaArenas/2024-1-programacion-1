package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    private final Producto productoPedido;
    private final Cliente clientePedido;

    public Pedido(LocalDate fecha, int cantidad, Producto productoPedido, Cliente clientePedido) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.productoPedido = productoPedido;
        this.clientePedido = clientePedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProductoPedido() {
        return productoPedido;
    }

    public Cliente getClientePedido() {
        return clientePedido;
    }
    

}
