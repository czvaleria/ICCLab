/**
 * Clase MonstruoPantano.
 * Representa a un monstruo que hereda de la clase Monstruo.
 * Esta clase proporciona información específica sobre la apariencia, debilidades, 
 * hostilidad y otros aspectos relacionados con los monstruos del pantano.
 * También incluye métodos específicos para sus habilidades únicas.
 */
public class MonstruoPantano extends Monstruo {

    /**
     * Constructor de MonstruoPantano.
     * Inicializa un nuevo objeto de tipo MonstruoPantano con el nombre "Monstruo del Pantano".
     */
    public MonstruoPantano() {
        super("Monstruo del Pantano");
    } 

    /**
     * Proporciona una descripción del monstruo del pantano.
     * Esta descripción incluye detalles sobre su apariencia física y características.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Son criaturas que tienen una apariencia humanoide pero presentan características de animales acuáticos, "
                + "como manos y pies con forma de pescado, branquias y grandes ojos amarillos.");
    }

    /**
     * Proporciona la debilidad del monstruo del pantano.
     * Se menciona que su debilidad es el fuego.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Fuego.");
    }

    /**
     * Describe el comportamiento hostil del monstruo del pantano.
     * Indica que son criaturas agresivas que atacan a quienes consideran una amenaza o presa.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Alta. Los monstruos del pantano son criaturas agresivas que atacan a quienes consideran una amenaza o presa.");
    }

    /**
     * Describe la presa del monstruo del pantano.
     * Indica que suelen atacar a niños desobedientes y a cualquier ser vivo que se aventure en su territorio.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: Niños desobedientes y, en general, cualquier ser vivo que se aventure en su territorio.");
    }      

    /**
     * Describe el efecto de la mordida del monstruo del pantano.
     * Indica que se desconoce el efecto de su mordedura.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: Se desconoce.");
    }
        
    /**
     * Describe la generación de ejemplares del monstruo del pantano.
     * Indica que no se sabe cómo se reproduce.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: No se sabe.");
    }

    /**
     * Proporciona un dato histórico sobre el monstruo del pantano.
     * Indica que la creencia en esta criatura se ha transmitido a lo largo de generaciones.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: La creencia en esta criatura se ha transmitido a lo largo de generaciones.");
    }

    /**
     * Permite al monstruo del pantano ocultarse.
     * Describe cómo el monstruo se oculta bajo la superficie del agua.
     */
    public void ocultarse() {
        System.out.println("   - El monstruo del pantano se oculta bajo la superficie del agua, esperando a su presa.");
    }
    
    /**
     * Permite al monstruo del pantano nadar.
     * Describe cómo nada rápidamente.
     */
    public void nadar() {
        System.out.println("   - Nada rápidamente.");
    }
}
