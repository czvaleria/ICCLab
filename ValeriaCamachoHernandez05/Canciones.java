import java.util.Scanner;
import java.util.Random;

public class Canciones {
    // Atributos
    String nombre, genero, artista, album, duracion;
    short lanzamiento;

    /**
     * Método Constructor de la clase Canciones
     *
     * @param nombre      El nombre de la canción
     * @param genero      El género musical de la canción
     * @param artista     El artista que interpreta la canción
     * @param album       El álbum en el que se incluye la canción
     * @param duracion    La duración de la canción
     * @param lanzamiento El año de lanzamiento de la canción
     */

    public Canciones(String nombre, String genero, String artista, String album, String duracion, short lanzamiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
        this.lanzamiento = lanzamiento;
    }

    /**
     * Método para mostrar la información básica de la canción
     * Imprime el nombre, el artista y la duración de la canción
     */
    public void MostrarBasicos() {
        System.out.println("Reproduciendo: " + nombre);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracion);
    }

    /**
     * Método para mostrar los detalles adicionales de la canción.
     * Imprime el álbum, el género y el año de lanzamiento.
     */
    public void MostrarDetalles() {
        System.out.println("-- Detalles adicionales --");
        System.out.println("Álbum: " + album);
        System.out.println("Género: " + genero);
        System.out.println("Año de lanzamiento: " + lanzamiento);
    }

    /**
     * Método principal que va a seleccionar una canción al azar y muestra su información
     */
    public static void main(String[] args) {

        //Bienvenida al programa
        System.out.println("PLAYLIST PARA LAS FIESTAS PATRIAS EN MODO SHUFFLE");
        // Crear un objeto random
        Random rand = new Random();

        // Crear las 10 canciones
        Canciones cancion1 = new Canciones("Son De La Negra", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Las Canciones Mexicanas Que El Mundo Canta", "3:01", (short) 1997);
        Canciones cancion2 = new Canciones("Viva México", "Regional mexicano", "Mariachi Real De México", "Viva México", "1:55", (short) 1997);
        Canciones cancion3 = new Canciones("Cielito Lindo", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Las Canciones Mexicanas Que El Mundo Canta", "4:02", (short) 1997);
        Canciones cancion4 = new Canciones("El Jarabe Tapatío", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Las Canciones Mexicanas Que El Mundo Canta", "2:24", (short) 1997);
        Canciones cancion5 = new Canciones("La Bikina", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Las Canciones Mexicanas Que El Mundo Canta", "2:34", (short) 1997);
        Canciones cancion6 = new Canciones("El Mariachi Loco", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Viva México Y Sus Canciones", "3:00", (short) 2013);
        Canciones cancion7 = new Canciones("Sabes Una Cosa", "Regional mexicano", "Luis Miguel", "México En La Piel", "3:30", (short) 2004);
        Canciones cancion8 = new Canciones("México En La Piel", "Regional mexicano", "Luis Miguel", "México En La Piel", "3:30", (short) 2004);
        Canciones cancion9 = new Canciones("Cucurrucucú Paloma", "Regional mexicano", "Lola Beltrán", "A 10 años.. Un Recuerdo Permanente", "3:59", (short) 2006);
        Canciones cancion10 = new Canciones("Yo Soy El Aventurero", "Regional mexicano", "Pedro Fernández", "Treinta Años, Vol. 2", "3:45", (short) 2009);

        // Generar un número aleatorio entre 1 y 10, y delimitarlo con 10 + 1 para que no de cero
        int randNumero = rand.nextInt(10) + 1;

        // Seleccionar la canción con base en el número aleatorio usando un switch
        switch (randNumero) {
            case 1:
                cancion1.MostrarBasicos();
                cancion1.MostrarDetalles();
                break;
            case 2:
                cancion2.MostrarBasicos();
                cancion2.MostrarDetalles();
                break;
            case 3:
                cancion3.MostrarBasicos();
                cancion3.MostrarDetalles();
                break;
            case 4:
                cancion4.MostrarBasicos();
                cancion4.MostrarDetalles();
                break;
            case 5:
                cancion5.MostrarBasicos();
                cancion5.MostrarDetalles();
                break;
            case 6:
                cancion6.MostrarBasicos();
                cancion6.MostrarDetalles();
                break;
            case 7:
                cancion7.MostrarBasicos();
                cancion7.MostrarDetalles();
                break;
            case 8:
                cancion8.MostrarBasicos();
                cancion8.MostrarDetalles();
                break;
            case 9:
                cancion9.MostrarBasicos();
                cancion9.MostrarDetalles();
                break;
            case 10:
                cancion10.MostrarBasicos();
                cancion10.MostrarDetalles();
                break;
                
            default:
                System.out.println("Viva México.");
                break;
        }
    }
}
