package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, double edad, String genero, double peso) {

    public Mascota {
        assert edad>0 && edad<3;
        assert genero=="Macho" || genero=="Hembra";
        assert peso>0 && peso<50.0;
    }
}
