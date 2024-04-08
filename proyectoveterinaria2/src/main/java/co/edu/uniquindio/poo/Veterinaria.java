package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> mascotas;

    public Veterinaria(String nombre) {
        assert nombre != null : "El nombre de la Veterinaria no puede ser null";
        this.nombre = nombre;
        mascotas = new LinkedList<>();
    }
// Metodo para obtener el nombre del curso
    public String getNombre() {
        return nombre;
    }
//Metodo para obtener mascota según ID
    public Mascota getMascotas(String id) {
        Mascota mascotaInteres = null;

        for (Mascota mascota : mascotas) {
            if (mascota.id().equals(id)) {
                mascotaInteres = mascota;
            }
        }
        return mascotaInteres;
    }
//Metodo para obtener la colección NO modificable

    public Collection<Mascota> getMascotas() {
        return Collections.unmodifiableCollection(mascotas);
    }

// Función/metodo para agregar las mascotas con IDs únicos

    public void registrarMascotaConIdUnico(Mascota mascota) {
        assert verificarId (mascota.id()) == false : "El ID ingresado ya existe, intente denuevo";
        mascotas.add(mascota);

    }

    private boolean verificarId(String id) {
            boolean existe = false;
            for (Mascota mascota : mascotas) {

                if (mascota.id().equals(id)) {
                    existe= true;
                }
            }
            return existe;
        }
    
    //Función/metodo para obtener mascotas > 10 años

    public void obtenerMascotasMayoresde10(Mascota mascotaParametro) {
        
        LinkedList<Mascota> mascotasMayoresDe10 = new LinkedList<>();
        for (Mascota mascota : mascotas) {
            if (mascota.edades() > 10) {
            mascotasMayoresDe10.add(mascota);
        }
    }

    }

}
