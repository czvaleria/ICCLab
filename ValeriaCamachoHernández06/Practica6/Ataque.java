package Practica6;

/**
 * La clase Ataque representa un ataque en el contexto del juego Pokémon.
 * Cada ataque tiene un nombre y está asociado a un tipo.
 * 
 * @author Diego Alexander Cisneros Tenorio
 */
public class Ataque {
    // Nombre del ataque.
    String nombre;
    String tipo;

    /**
     * Constructor que inicializa un objeto Ataque con un nombre y un tipo.
     * @param nombre ES el nombre del ataque.
     * @param tipo Es el tipo del ataque.
     */
    public Ataque(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Devuelve el nombre del ataque.
     * @return El nombre del ataque.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Devuelve el tipo del ataque.
     * @return El tipo del ataque.
     */
    public String getTipo(){
        return tipo;
    }
}
