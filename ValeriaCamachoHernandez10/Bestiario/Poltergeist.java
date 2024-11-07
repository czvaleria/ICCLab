/**
 * Clase que representa a un Poltergeist, que hereda de la clase Monstruo.
 * Un Poltergeist es un tipo de espíritu que suele parecerse a fantasmas,
 * pero a menudo es invisible. Se caracteriza por causar ruidos fuertes,
 * mover objetos y generar disturbios en su entorno.
 */
public class Poltergeist extends Monstruo {

    /**
     * Constructor que inicializa un Poltergeist con el nombre "Poltergeist".
     */
    public Poltergeist() {
        super("Poltergeist");
    }

    /**
     * Imprime la descripción del Poltergeist, incluyendo sus características
     * y comportamientos típicos.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Suelen parecerse a fantasmas, pero a menudo son invisibles. Se caracterizan por causar ruidos fuertes, mover objetos, y generar disturbios en el entorno.");
    }

    /**
     * Imprime la locación típica donde pueden aparecer los Poltergeists.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Pueden aparecer en cualquier entorno donde cierta persona se encuentre.");
    }

    /**
     * Imprime la debilidad del Poltergeist, mencionando los métodos que
     * pueden ser utilizados para neutralizarlos.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Pueden ser rituales de purificación o la presencia de objetos sagrados.");
    }

    /**
     * Imprime el nivel de hostilidad del Poltergeist hacia los seres vivos.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Baja. Generalmente son considerados como traviesos, aunque su comportamiento puede ser perjudicial y causar miedo, pero no necesariamente buscan hacer daño directo.");
    }

    /**
     * Imprime información sobre la presa del Poltergeist, aunque no tienen
     * una presa específica.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: No tienen una presa específica, pero suelen afectar a las personas que les atraen o a las que están cerca de ellos.");
    }      

    /**
     * Imprime el efecto de la mordedura del Poltergeist en una víctima,
     * aunque se desconoce su efecto real.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: Se desconoce.");
    }
        
    /**
     * Imprime el proceso de generación de nuevos ejemplares de Poltergeist,
     * aunque se desconoce cómo se generan.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: Se desconoce, aunque no son seres biológicos.");
    }

    /**
     * Imprime un dato histórico sobre la existencia de Poltergeists en la
     * cultura popular y su etimología.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: Aparece en el siglo XVII, cuando comenzaron a documentarse incidentes en Europa. El término poltergeist proviene del alemán, donde poltern significa hacer ruido y geist significa fantasma o espíritu. También lo hemos visto en la serie de Harry Potter, con Peeves.");
    }

    /**
     * Imprime un mensaje indicando que el Poltergeist mueve objetos a su
     * alrededor, creando un caos espeluznante.
     */
    public void moverObjetos() {
        System.out.println("   - El poltergeist mueve objetos a su alrededor, creando un caos espeluznante.");
    }
    
    /**
     * Imprime un mensaje indicando que el Poltergeist emite un ruido
     * escalofriante que hace temblar a los presentes.
     */
    public void hacerRuido() {
        System.out.println("   - El poltergeist emite un ruido escalofriante que hace temblar a los presentes.");
    }
}
