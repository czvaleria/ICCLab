/**
 * Clase que representa a La Parca, una figura esquelética que simboliza
 * la muerte y la recolección de almas. Hereda de la clase Monstruo y
 * se caracteriza por su naturaleza guiadora en el más allá.
 */
public class LaParca extends Monstruo {

    /**
     * Constructor que inicializa a La Parca con el nombre "La Parca".
     */
    public LaParca() {
        super("La Parca");
    }

    /**
     * Imprime la descripción de La Parca, destacando su apariencia
     * esquelética, su capa negra y su guadaña, así como su función
     * de recoger almas.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Figura esquelética vestida con una capa negra con capucha, y usualmente lleva una guadaña, símbolo de la cosecha de almas. Se le asocia con la muerte, pero su función no es causar el fallecimiento, sino recoger el alma del fallecido.");
    }

    /**
     * Imprime la locación típica donde se puede encontrar a La Parca,
     * en lugares cercanos a la muerte, como cementerios y hospitales.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Lugares cercanos a la muerte, como cementerios, hospitales, o simplemente donde alguien esté por fallecer.");
    }

    /**
     * Imprime la debilidad de La Parca, indicando que no tiene ninguna.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad:  Ninguna.");
    }

    /**
     * Imprime el nivel de hostilidad de La Parca, que es baja, ya que
     * su propósito no es dañar, sino guiar a los muertos a su destino.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Baja. Aunque es una figura intimidante, su propósito no es dañar sino guiar a los muertos a su destino en el más allá.");
    }

    /**
     * Imprime información sobre la presa de La Parca, que son las almas
     * de los recién fallecidos.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: Las almas de los recién fallecidos.");
    }      

    /**
     * Imprime el efecto de la mordida de La Parca, indicando que no
     * muerde.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: No muerde.");
    }
        
    /**
     * Imprime el proceso de generación de nuevos ejemplares de La Parca,
     * señalando que es una entidad única y eterna, la personificación
     * de la muerte en la cultura occidental.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: No se reproduce. Es una entidad única y eterna, sino que  la personificación de la muerte en la cultura occidental.");
    }

    /**
     * Imprime un dato histórico sobre La Parca, explicando su origen
     * y su representación por la peste negra.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: Apareció en Europa en el siglo XIV cuando la peste negra (1347-1351) causaba la muerte de millones de personas. La imagen de un esqueleto vestido de negro se popularizó como una representación visual de la muerte que no hacía distinción entre clases o condiciones sociales. La guadaña se inspiró en el trabajo del segador, simbolizando que la muerte, como un segador, recoge vidas de la misma forma en que se cosecha el trigo.");
    }

    /**
     * Imprime un mensaje que indica que la aparición de La Parca
     * suele infundir miedo, ya que representa la muerte.
     */
    public void presencia() {
        System.out.println("   - Su aparición suele infundir miedo, pues representa la muerte.");
    }    
    
    /**
     * Imprime un mensaje indicando que ver a La Parca en una
     * situación delicada es considerado un mal presagio.
     */
    public void presagio() {
        System.out.println("   - Verla en una situación delicada es considerado un mal presagio.");
    }
}
