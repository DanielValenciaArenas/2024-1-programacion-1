/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PedidoTest {
    private static final Logger LOG = Logger.getLogger(PedidoTest.class.getName());

    /**
     * Rigorous Test :-)
     */

    @Test
    public void testPedidoConProductoSinStock() {
        Stock inventarioDrogueria = new Stock();

        ProductoHogar producto1 = new ProductoHogar("1GJ2", "Cepillo", "objeto para la boca", 2000, inventarioDrogueria, "Amazon", 2, "Se usa para los dientes");
        Medicamento producto2 = new Medicamento("2IKY", "Acetaminofén", "pasta medicinal", 500, inventarioDrogueria, "SaludDelCafé", 4, 1.50);
        
        inventarioDrogueria.agregarProducto(producto1, 10); // Hay 10 unidades en el stock
        inventarioDrogueria.agregarProducto(producto2, 0); // No hay unidades en el stock

        Cliente cliente1 = new Cliente("Mario", "Arzuza", "10203214", "Plaza Bolivar", "317420550");
        Collection<Producto> productosPedido = new LinkedList<>();
        productosPedido.add(producto1);
        productosPedido.add(producto2);

        LocalDate fechaPedido = LocalDate.of(2024, 4, 28);
        Pedido pedido = new Pedido(fechaPedido, 1, productosPedido, cliente1);

        assertEquals(true, pedido.pedidoConProductoSinStock(productosPedido));
    }

    @Test
    public void testPedidoConProductosMayoresA100() {
        Stock inventarioDrogueria = new Stock();

        CuidadoPersonal producto1 = new CuidadoPersonal("1GJ2", "Jabon", "objeto para limpiarse la cara y curar acné", 2000, inventarioDrogueria, "Amazon", 2, "limón y savila");
        Medicamento producto2 = new Medicamento("T3KNV", "Loratadina", "pasta medicinal", 500, inventarioDrogueria, "SaludDelCafé", 4, 2.20);
        ProductoHogar producto3 = new ProductoHogar("5KBN", "Cepillo", "objeto para la boca", 4700, inventarioDrogueria, "Exito", 2, "Se usa para los dientes");

        inventarioDrogueria.agregarProducto(producto1, 20); 
        inventarioDrogueria.agregarProducto(producto2, 101);
        inventarioDrogueria.agregarProducto(producto3, 32); 

        Cliente cliente1 = new Cliente("Martina", "Gonzales", "4445678", "Laureles", "32086743");

        Collection<Producto> productosPedido = new LinkedList<>();
        productosPedido.add(producto1);
        productosPedido.add(producto2);
        productosPedido.add(producto3);

        LocalDate fechaPedido = LocalDate.of(2024, 4, 28);
        Pedido pedido = new Pedido(fechaPedido, 1, productosPedido, cliente1);

        assertEquals(1, pedido.productosConStockMayorA100().size());
    }

    @Test
    public void testCalcularCostoTotalPedido() {
    Stock stock = new Stock();
    Medicamento producto1 = new Medicamento("1", "Acetaminofén", "droga medicinal", 500, stock, "avivas", 5, 4.60 );
    Medicamento producto2 = new Medicamento("2", "Fenofibrato", "droga medicinal", 5200, stock, "avivas", 3, 5.80);
    Medicamento producto3 = new Medicamento("3", "Leotiroxina", "droga medicinal", 12000, stock, "avivas", 1, 1.25);

    Collection<Producto> productosPedido = new LinkedList<>();
    productosPedido.add(producto1);
    productosPedido.add(producto2);
    productosPedido.add(producto3);

    Cliente cliente = new Cliente("Arlon", "Andés", "123456789", "La patria", "7782134");

    LocalDate fechaPedido = LocalDate.now();
    Pedido pedido = new Pedido(fechaPedido, 3, productosPedido, cliente);

    double costoTotalEsperado = ((producto1.getPrecio()*producto1.getCantidadSolicitada())+
                                 (producto2.getPrecio()*producto2.getCantidadSolicitada())+
                                 (producto3.getPrecio()*producto3.getCantidadSolicitada())) * 3;

    assertEquals(costoTotalEsperado, pedido.calcularCostoTotalPedido(), 0.01);
    }





}
