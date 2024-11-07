/**
 * Clase que representa a un Vampiro, que hereda de la clase Monstruo.
 * Un Vampiro es una criatura no-muerta que parece humana, pero carece de vida real.
 * Posee colmillos afilados y habilidades sobrenaturales, así como otras debilidades.
 */
public class Vampiro extends Monstruo {

    /**
     * Constructor que inicializa un Vampiro con el nombre "Vampiro".
     */
    public Vampiro() {
        super("Vampiro");
    }

    /**
     * Imprime la descripción del Vampiro, incluyendo su apariencia y habilidades.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Criatura no-muerta que parece humana pero carece de vida real. Posee colmillos afilados y habilidades sobrenaturales.");
    }

    /**
     * Imprime la locación típica donde se pueden encontrar Vampiros.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Lugares oscuros o con poca luz, como tumbas o cuevas, activos en noches o días nublados.");
    }

    /**
     * Imprime la debilidad del Vampiro, incluyendo los elementos que pueden dañarlo.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Cruces, plata, ajo y estacas de madera al corazón, además, la luz solar quema su piel.");
    }

    /**
     * Imprime el nivel de hostilidad del Vampiro hacia otros seres vivos.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Alta. Atacan para alimentarse y pueden ser muy peligrosos, especialmente por su fuerza y habilidades sobrenaturales.");
    }

    /**
     * Imprime información sobre la presa del Vampiro.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: Humanos y otros seres vivos, de los cuales drenan su fluido vital, principalmente sangre.");
    }      

    /**
     * Imprime el efecto de la mordedura del Vampiro en una víctima.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: Drena la sangre de la víctima, debilitándola o incluso causándole la muerte.");
    }
        
    /**
     * Imprime el proceso de generación de nuevos ejemplares de Vampiro.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: Cuando muerde a alguien, son creados por ritual o son hijos de vampiros.");
    }

    /**
     * Imprime un dato histórico sobre la existencia de Vampiros en la cultura popular.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: Las leyendas sobre vampiros vienen desde la antigua Grecia, Roma y el folklore del este de Europa. Vlad el Empalador inspiró a Drácula de Bram Stoker.");
    }

    /**
     * Imprime un mensaje indicando que el Vampiro se transforma en un murciélago y se pierde en la oscuridad.
     */
    public void transformarseEnMurcielago() {
        System.out.println("   - El vampiro se transforma en un murciélago y se pierde en la oscuridad.");
    }

    /**
     * Imprime un mensaje indicando que el Vampiro hipnotiza a su víctima, dejándola inmóvil.
     */
    public void hipnotizarVictima() {
        System.out.println("   - El vampiro hipnotiza a su víctima, dejándola inmóvil.");
    }
}
