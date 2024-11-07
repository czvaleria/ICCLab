/**
 * Clase que representa a una Momia, que hereda de la clase Monstruo.
 * Una Momia es un cadáver preservado mediante el proceso de momificación,
 * generalmente asociado a las antiguas culturas egipcias.
 */
public class Momia extends Monstruo {

    /**
     * Constructor que inicializa una Momia con el nombre "Momia".
     */
    public Momia() {
        super("Momia");
    }

    /**
     * Imprime la descripción de la Momia, incluyendo sus características
     * y el proceso de momificación.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Cadáver preservado mediante el proceso de momificación con vendajes antiguos.");
    }

    /**
     * Imprime la locación típica donde se pueden encontrar Momias.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Antiguas tumbas, especialmente en Egipto. Suelen encontrarse en sepulcros llenos de riquezas y cositas antiguos.");
    }

    /**
     * Imprime la debilidad de la Momia, mencionando el elemento que puede
     * causarles daño.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Fuego.");
    }

    /**
     * Imprime el nivel de hostilidad de la Momia hacia los seres vivos,
     * describiendo su comportamiento defensivo.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Alta. Atacan con el objetivo de defender su tumba y vengarse de quienes quieren robar.");
    }

    /**
     * Imprime información sobre la presa de la Momia, que son aquellos
     * que perturban su descanso.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: Todo intrusos o cazadores de tesoros que perturban su descanso o intentan robar sus pertenencias..");
    }      

    /**
     * Imprime el efecto de la mordida de la Momia en una víctima,
     * aunque indica que las Momias no muerden.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: No muerden.");
    }
        
    /**
     * Imprime el proceso de generación de nuevas Momias, indicando que
     * no se reproducen ni convierten a otros en Momias.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: Las momias no se reproducen ni convierten a otros en momias, sino que son individuos específicos preservados mediante momificación en tiempos antiguos.");
    }

    /**
     * Imprime un dato histórico sobre la momificación en el antiguo Egipto,
     * mencionando su origen y propósito.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: La momificación en el antiguo Egipto comenzó alrededor del 2600 a.C. como parte de rituales funerarios para preservar los cuerpos de los muertos para la vida después de la muerte.");
    }

    /**
     * Imprime un mensaje indicando que la Momia lanza una maldición
     * sobre aquellos que intentan robar de su tumba.
     */
    public void maldecir() {
        System.out.println("   - La momia lanza una maldición sobre aquellos que quieren robar cosas de su tumba.");
    }
    
    /**
     * Imprime un mensaje indicando que la Momia renueva sus vendajes
     * antiguos.
     */
    public void renovarVendajes() {
        System.out.println("   - La momia renueva sus vendajes antiguos.");
    }
}
