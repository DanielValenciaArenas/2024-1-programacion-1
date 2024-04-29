package co.edu.uniquindio.poo;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    private Map <Producto, Integer> stock;

    public Stock () {
        this.stock = new HashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad){
        stock.put(producto, cantidad);
    }

    public void eliminarProducto(Producto producto){
        stock.remove(producto);
    }

    public int obtenerCantidadEnStock(Producto producto){
        return stock.getOrDefault(producto,0);
    }
    
    
}
