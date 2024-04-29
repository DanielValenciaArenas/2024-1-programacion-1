package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Drogueria {
    private final String nombre;
    private final Collection<Producto> productos;
    private final Collection<Pedido> pedidos;
    private final Collection<Cliente> clientes;
    private final Collection<Empleado> empleados;

    public Drogueria(String nombre){
        this.nombre = nombre;
        this.productos = new LinkedList<>();
        this.pedidos = new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.empleados = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Producto> getProductos() {
        return productos;
    }

    public Collection<Pedido> getPedidos() {
        return pedidos;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

}
