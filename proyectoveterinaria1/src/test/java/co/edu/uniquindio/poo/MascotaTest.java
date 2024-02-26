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
    public void mismaEspecie() {
        Mascota mascota1 = new Mascota("Godzilla", "Reptil", "Iguana Marina", 1, "Macho", 5.7);
        Mascota mascota2 = new Mascota("Puppy", "Roedor", "Hamster ruso", 2, "Hembra", 1.0);

        assertEquals(mascota1.especie(),mascota2.especie());
    }

    @Test
    public void edadBebe() {
        Mascota mascota3 = new Mascota("Lucas", "Canino", "Frenchpuddle", 6, "Macho", 7.3);
    }

    @Test
    public void generos() {
        Mascota mascota4 = new Mascota("Pancho", "mono", "mono sureño", 0.9, "arbol", 13.2);
    }

    @Test
    public void animalGrande() {
        Mascota mascota5 = new Mascota("Lila", "cetáceo", "Ballena azul", 2.7, "Hembra", 2500.0);
    }

    @Test
    public void MascotaApta() {
        Mascota mascota5 = new Mascota("Bimbim", "Aves", "Loro", 2.7, "Macho", 4.5);
    }

}
