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
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());



// Prueba DATOS COMPLETOS:
 @Test
    public void datosCompletos() {
        LOG.info("Inicio datosCompletos");

        Mascota mascota = new Mascota("10085497", " ", "Canino", "Pincher", 7, "Macho", "Negro", 8.9);

        LOG.info("Finalización datosCompletos");
    }

//Prueba AGREGAR UNA MASCOTA:
@Test
    public void agregarUnaMascota() {
        LOG.info("Inicio agregarUnaMascota");

        var veterinaria = new Veterinaria("Amigos Peludos");
        Mascota mascota = new Mascota("11113452", "Lupe", "Canino", "Chihuaha", 11, "Hembra", "Cafe", 6.7);

        veterinaria.registrarMascotaConIdUnico(mascota);

        LOG.info("Finalización agregarUnaMascota");
    }

//Prueba AGREGAR UNA VETERINARIA NULA
 @Test
    public void agregarUnaVeterinariaNula() {
        LOG.info("Inicio agregarUnaVeterinariaNula");

        var veterinaria = new Veterinaria(null);
        
        LOG.info("Finalización agregarUnaVeterinariaNula");
    }

//Prueba AGREGAR UNA MASCOTA REPETIDA
@Test
    public void agregarUnaMascotaRepetida() {
        LOG.info("Inicio agregarUnaMascotaRepetida");
        var veterinaria = new Veterinaria("Amigos Peludos");
        Mascota mascota1 = new Mascota("422389", "Dalta","Felino", "Sphynx", 12, "Hembra", "Piel", 12.6);
        Mascota mascota2 = new Mascota("422389", "Nutella","Felino", "atigrado", 4, "Hembra", "Amarillo", 5.2);

        veterinaria.registrarMascotaConIdUnico(mascota1);
        veterinaria.registrarMascotaConIdUnico(mascota2);

        LOG.info("Finalización agregarUnaMascotaRepetida");
    }


}