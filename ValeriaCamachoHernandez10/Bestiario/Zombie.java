/**
 * Clase que representa a un Zombie, que hereda de la clase Monstruo.
 * Un Zombie es un cuerpo reanimado que muestra una apariencia robótica y torpe,
 * pero posee una fuerza inesperada. Esta clase proporciona detalles sobre su 
 * descripción, locación, debilidades, mordedura, métodos de generación y datos históricos.
 */
public class Zombie extends Monstruo {

    /**
     * Constructor que inicializa un Zombie con el nombre "Zombie".
     */
    public Zombie() {
        super("Zombie");
    }

    /**
     * Imprime la descripción del Zombie, incluyendo su apariencia y comportamiento.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Cuerpo reanimado sin vida real, que muestra una apariencia robótica y torpe al moverse, pero posee una fuerza inesperada. A menudo se cree que fueron enterrados vivos y “resucitaron” de sus tumbas, lo que les da una apariencia aterradora y descompuesta.");
    }

    /**
     * Imprime la locación típica donde se pueden encontrar Zombies.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Usualmente en cementerios pero también en áreas de práctica de vudú, pero pueden aparecer en cualquier lugar una vez reanimados.");
    }

    /**
     * Imprime la debilidad del Zombie, que es el daño directo al cerebro.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Daño directo al cerebro, ya que esto puede detener su reanimación y “matar” al zombie de forma definitiva.");
    }

    /**
     * Imprime el efecto de la mordedura del Zombie en una víctima.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: Una mordedura puede convertir a la víctima en otro zombie.");
    }

    /**
     * Imprime el proceso de generación de nuevos ejemplares de Zombie.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: Cuando muerde a alguien o son creados por un sacerdote vudú mediante una mezcla de sustancias.");
    }

    /**
     * Imprime un dato histórico sobre la existencia de Zombies en la cultura popular.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: Las primeras menciones registradas de zombies datan del siglo XVII, pero la popularidad moderna de los zombies comenzó en el siglo XX, particularmente con películas como “Night of the Living Dead” (1968).");
    }

    /**
     * Imprime un mensaje indicando que el Zombie se pudre lentamente.
     */
    public void pudrirse() {
        System.out.println("   - El Zombie se pudre lentamente.");
    }

    /**
     * Imprime un mensaje indicando que el Zombie emite un gruñido aterrador.
     */
    public void gruñir() {
        System.out.println("   - El Zombie emite un gruñido aterrador.");
    }
} // Fin de Zombie