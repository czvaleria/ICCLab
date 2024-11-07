/**
 * Clase Troll.
 * Representa a un troll que hereda de la clase Monstruo.
 * Esta clase proporciona información específica sobre la apariencia, localización, 
 * debilidades, hostilidad y otros aspectos relacionados con los trolls.
 * También incluye métodos específicos para sus habilidades únicas.
 */
public class Troll extends Monstruo {

    /**
     * Constructor de Troll.
     * Inicializa un nuevo objeto de tipo Troll con el nombre "Troll".
     */
    public Troll() {
        super("Troll");
    }

    /**
     * Proporciona una descripción del troll.
     * Esta descripción incluye detalles sobre su apariencia física y características.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Son criaturas de aspecto humanoide, pero más fuertes y generalmente más feos. "
                + "Pueden ser tanto similares a los humanos en apariencia como enormes y torpes.");
    }

    /**
     * Proporciona la ubicación típica del troll.
     * Indica que suelen encontrarse en montañas, cuevas o áreas rocosas de Escandinavia.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Se encuentran en montañas, cuevas o áreas rocosas de Escandinavia.");
    }

    /**
     * Proporciona la debilidad del troll.
     * Se menciona que su debilidad es la luz solar, ya que se convierten en piedra al ser expuestos a ella.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: La luz solar. Los trolls se convierten en piedra si están expuestos a la luz del sol.");
    }

    /**
     * Describe el comportamiento hostil del troll.
     * Indica que los trolls son generalmente hostiles hacia los humanos y pueden ser peligrosos.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Alta. Los trolls son generalmente hostiles hacia los humanos y pueden ser bastante peligrosos, "
                + "especialmente los más grandes y fuertes.");
    }

    /**
     * Describe la presa del troll.
     * Indica que suelen atacar humanos, especialmente a aquellos que se aventuran en su territorio.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: Humanos, especialmente aquellos que se aventuran en su territorio.");
    }

    /**
     * Describe el efecto de la mordida del troll.
     * Indica que sus mordeduras son letales, ya que son carnívoros y devoran a sus víctimas.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: Como son carnívoros y se sabe que devoran a sus víctimas, "
                + "lo que implica que sus mordeduras son letales.");
    }

    /**
     * Describe la generación de ejemplares del troll.
     * Indica que pueden reproducirse y que suelen vivir en familias.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: Puede reproducirse. Se sabe que viven en familias.");
    }

    /**
     * Proporciona un dato histórico sobre los trolls.
     * Indica que tienen su origen en la mitología nórdica.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: Tienen su origen en la mitología nórdica.");
    }

    /**
     * Permite al troll lanzar rocas.
     * Describe cómo el troll lanza una roca gigantesca hacia su objetivo.
     */
    public void lanzarRocas() {
        System.out.println("   - El troll lanza una roca gigantesca hacia su objetivo.");
    }

    /**
     * Permite al troll romper objetos.
     * Describe cómo el troll puede romper objetos grandes y pesados, como piedras o árboles.
     */
    public void romperCosas() {
        System.out.println("   - El troll puede romper objetos muy grandes y pesados, como piedras o árboles.");
    }
}
