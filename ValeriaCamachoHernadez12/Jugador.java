import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Representa un jugador con un nombre y un puntaje.
 * Esta clase implementa Serializable para que los objetos puedan
 * ser almacenados en un archivo.
 */
class Jugador implements Serializable {
    // Versión de la serialización
    private static final long serialVersionUID = 1L;

    // Nombre del jugador
    private String nombre;

    // Puntaje del jugador
    private int puntaje;

    /**
     * Crea un nuevo jugador con un nombre y un puntaje.
     * @param nombre  El nombre del jugador.
     * @param puntaje El puntaje del jugador.
     */
    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    /**
     * Obtiene el nombre del jugador.
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el puntaje del jugador.
     * @return El puntaje del jugador.
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Devuelve una representación en cadena del objeto jugador.
     * @return Una cadena que describe al jugador y su puntaje.
     */
    @Override
    public String toString() {
        return "Jugador: " + nombre +
                " Puntuación: " + puntaje;
    }
} // Fin de Jugador