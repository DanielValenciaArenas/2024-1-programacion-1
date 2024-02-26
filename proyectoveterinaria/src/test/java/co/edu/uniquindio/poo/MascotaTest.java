/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void edadBebe() {
        Mascota mascota = new Mascota("Lucas", "Canino", "Frenchpuddle", 0.8, "Macho", 1.7);
        
    }

    @Test
    public void razasIguales() {
        Mascota mascota1 = new Mascota("Lucas", "Canino", "Frenchpuddle", 0.8, "Macho", 1.7);
        Mascota mascota2 = new Mascota("Luna", "Canina", "Frenchpuddle", 3, "Hembra", 4.0);

        assertEquals(mascota1.raza(),mascota2.raza());
    }


}
