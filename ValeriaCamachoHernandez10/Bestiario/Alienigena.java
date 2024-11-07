/**
 * Clase Alienigena.
 * Representa a un alienígena que hereda de la clase Monstruo.
 * Esta clase proporciona información específica sobre la apariencia, localización, 
 * debilidades, hostilidad y otros aspectos relacionados con los alienígenas.
 * También incluye métodos específicos para sus habilidades únicas.
 */
public class Alienigena extends Monstruo {

    /**
     * Constructor de Alienigena.
     * Inicializa un nuevo objeto de tipo Alienigena con el nombre "Alienígena".
     */
    public Alienigena() {
        super("Alienígena");
    }

    /**
     * Proporciona una descripción del alienígena.
     * Esta descripción incluye detalles sobre su apariencia física.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Son seres humanoides altos y delgados con rostros ovalados y ojos grandes, "
                + "y pueden ser similares a calamares gigantes y hasta verdes o morados.");
    }

    /**
     * Proporciona la ubicación típica del alienígena.
     * Indica que suelen encontrarse fuera de la Tierra, principalmente en otros planetas o naves espaciales.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Fuera de la Tierra, principalmente en otros planetas o en naves espaciales.");
    }

    /**
     * Proporciona la debilidad del alienígena.
     * Se menciona que su debilidad es el papel aluminio.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Papel aluminio.");
    }

    /**
     * Describe el comportamiento hostil del alienígena.
     * Indica que su hostilidad varía entre invasores hostiles y seres pacíficos.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Varía. Algunas veces son invasores hostiles, mientras que otras son seres pacíficos.");
    }

    /**
     * Describe la presa del alienígena.
     * Indica que pueden intentar capturar humanos o seres vivos de la Tierra.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: Pueden intentar capturar humanos o seres vivos de la Tierra (como vacas).");
    }

    /**
     * Describe el efecto de la mordida del alienígena.
     * Indica que no aplica, ya que no suelen morder como forma de ataque.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: No aplica. Las brujas no suelen morder como forma de ataque.");
    }

    /**
     * Describe la generación de ejemplares del alienígena.
     * Indica que no se reproduce.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: No se reproduce.");
    }

    /**
     * Proporciona un dato histórico sobre los alienígenas.
     * Indica menciones de alienígenas desde el siglo IV en China hasta avistamientos modernos.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: Su mención se remonta al menos al siglo IV en China, donde se habló de un barco lunar "
                + "que sobrevolaba el país cada 12 años. Las primeras menciones modernas de extraterrestres en la ciencia ficción "
                + "ocurrieron en la década de 1950 con el auge del fenómeno de los platillos voladores. También hay avistamientos "
                + "registrados de OVNIs en el 214 a.C. en Roma y en Alemania en 1561, lo que muestra que la creencia en seres de "
                + "otros mundos ha existido a lo largo de la historia humana.");
    }

    /**
     * Analiza la psicología de los humanos.
     * Utiliza inteligencia sobrenatural para comprender la mente humana.
     */
    public void analizarHumano() {
        System.out.println("   -  El alienígena usa su inteligencia sobrenatural para analizar la psicología de los humanos.");
    }

    /**
     * Permite al alienígena teletransportarse.
     * Describe cómo el alienígena se desvanece y reaparece en otro lugar instantáneamente.
     */
    public void teletransportarse() {
        System.out.println("   -  El alienígena se desvanece y reaparece en otro lugar en un abrir y cerrar de ojos.");
    }

}
