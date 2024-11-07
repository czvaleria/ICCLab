/**
 * Clase que representa al Jinete Sin Cabeza, un espectro que monta un caballo
 * y busca su propia cabeza. Hereda de la clase Monstruo y es conocido por su
 * apariencia aterradora y su historia trágica.
 */
public class JineteSinCabeza extends Monstruo {

    /**
     * Constructor que inicializa al Jinete Sin Cabeza con el nombre "Jinete Sin Cabeza".
     */
    public JineteSinCabeza() {
        super("Jinete Sin Cabeza");
    } 

    /**
     * Imprime la descripción del Jinete Sin Cabeza, destacando su
     * apariencia como un espectro que monta un caballo y su búsqueda
     * incesante de su cabeza.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Es un espectro que monta un caballo y, en lugar de una cabeza, usa una calabaza iluminada. Su historia básicamente es la búsqueda de su cabeza.");
    }

    /**
     * Imprime la locación típica del Jinete Sin Cabeza, mencionando su
     * origen en Sleepy Hollow, Nueva York, y la existencia de versiones
     * en leyendas irlandesas y escocesas.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Originario de Sleepy Hollow, Nueva York, pero también hay versiones en leyendas irlandesas y escocesas.");
    }

    /**
     * Imprime la debilidad del Jinete Sin Cabeza, indicando que no se sabe
     * sobre alguna debilidad específica.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: No se sabe.");
    }

    /**
     * Imprime el nivel de hostilidad del Jinete Sin Cabeza, que es alto,
     * describiendo su naturaleza aterradora y su tendencia a asustar a
     * quienes se cruzan en su camino.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Alta. El Jinete Sin Cabeza es un espectro aterrador que asusta a quienes se cruzan en su camino.");
    }

    /**
     * Imprime información sobre la presa del Jinete Sin Cabeza, indicando
     * que busca humanos y, específicamente, su propia cabeza, pero tomará
     * cualquier cabeza que encuentre si no puede localizar la suya.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: Humanos, especificamente busca su propia cabeza y si no puede encontrarla, tomará cualquier cabeza que encuentre.");
    }      

    /**
     * Imprime el efecto de la mordida del Jinete Sin Cabeza, indicando que
     * no aplica, ya que no tiene una mordida.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: No aplica.");
    }
        
    /**
     * Imprime el proceso de generación de nuevos ejemplares del Jinete Sin
     * Cabeza, señalando que no se reproduce.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: No se reproduce.");
    }

    /**
     * Imprime un dato histórico sobre el Jinete Sin Cabeza, explicando su
     * popularidad en América y su conexión con la Batalla de White Plains en
     * 1776, así como su adaptación por el autor Washington Irving en su obra
     * "The Legend of Sleepy Hollow".
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: La leyenda más popular del Jinete Sin Cabeza proviene de América entre 1776 y 1820. Durante la Batalla de White Plains en 1776, un soldado fue decapitado, y su historia fue recogida por el autor Washington Irving en The Legend of Sleepy Hollow en 1820, que popularizó esta figura.");
    }

    /**
     * Imprime un mensaje que describe cómo el Jinete Sin Cabeza aparece
     * de entre la niebla, aterrorizando a todos a su paso.
     */
    public void aparecerse() {
        System.out.println("   -  El jinete sin cabeza sale de entre la niebla, aterrorizando a todos a su paso.");
    }
    
    /**
     * Imprime un mensaje que describe cómo el Jinete Sin Cabeza toma la
     * cabeza de alguien más.
     */
    public void tomarCabeza() {
        System.out.println("   -  El jinete sin cabeza toma la cabeza de alguien más.");
    }
}
