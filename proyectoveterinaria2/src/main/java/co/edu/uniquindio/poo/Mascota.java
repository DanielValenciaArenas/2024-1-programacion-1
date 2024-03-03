package co.edu.uniquindio.poo;


public record Mascota(String id, String nombres, String especies, String razas, int edades, String generos, String colores, double pesos) {

    public Mascota {
        assert id != null && !id.isBlank() : "El ID debe ser diferente de null";
        assert nombres != null && !nombres.isBlank() : "El nombre debe ser diferente de null";
        assert especies != null && !especies.isBlank() : "La especie debe ser diferente de null";
        assert razas != null && !razas.isBlank() : "La raza debe ser diferente de null";
        assert colores != null && !colores.isBlank() : "El color debe ser diferente de null";
        assert generos != null && !generos.isBlank() : "El genero debe ser diferente de null";

        assert edades > 0;
        assert pesos > 0;

        assert generos=="Macho" || generos=="Hembra" : "El género no coincide con Macho o Hembra";
       }
    }


