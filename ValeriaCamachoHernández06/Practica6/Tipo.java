package Practica6;

/**
 * La clase Tipo representa el tipo de un Pokémon, incluyendo sus debilidades y fortalezas.
 * 
 * @author Valeria Camacho Hernández
 */
public class Tipo {
    
    /** Es el tipo del Pokémon (por ejemplo, fuego, agua, planta, etc.) */
    String tipo;
    
    /** Es la debilidad del tipo del Pokémon */
    String deb;
    
    /** Es la fortaleza del tipo del Pokémon */
    String fort;

    /**
     * Método constructor que inicializa un tipo de Pokémon con su debilidad y fortaleza.
     * @param tipo El tipo del Pokémon.
     * @param deb La debilidad del tipo del Pokémon.
     * @param fort La fortaleza del tipo del Pokémon.
     */
    public Tipo(String tipo, String deb, String fort) {
        this.tipo = tipo;
        this.deb = deb;
        this.fort = fort;
    }

    /**
     * Obtiene la debilidad del tipo del Pokémon.
     * @return Retorna la debilidad del tipo del Pokémon.
     */
    public String getDeb() {
        return deb;
    }

    /**
     * Obtiene la fortaleza del tipo del Pokémon.
     * @return Retorna la fortaleza del tipo del Pokémon.
     */
    public String getFort() {
        return fort;
    }
}//Fin de Tipo