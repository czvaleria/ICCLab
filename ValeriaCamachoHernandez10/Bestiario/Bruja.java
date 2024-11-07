/**
 * Clase que representa a una Bruja, un ser femenino que domina el arte de la magia.
 * Hereda de la clase Monstruo y se caracteriza por su capacidad para realizar
 * magia, la elaboración de pociones y el uso de hierbas en sus prácticas.
 */
public class Bruja extends Monstruo {

    /**
     * Constructor que inicializa a la Bruja con el nombre "Bruja".
     */
    public Bruja() {
        super("Bruja");
    }

    /**
     * Imprime la descripción de la Bruja, destacando su dominio de la magia,
     * su apariencia variable y sus prácticas mágicas.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Son mujeres que dominan el arte de la magia, y su apariencia ha cambiado con el tiempo. Tradicionalmente, se las representaba como ancianas con nariz aguileña, mientras que en la actualidad pueden ser de cualquier edad y aspecto, desde lo ordinario hasta lo encantador. Sus prácticas pueden incluir la elaboración de pociones, el uso de hierbas y rituales mágicos.");
    }

    /**
     * Imprime la locación típica donde se puede encontrar a la Bruja,
     * que puede estar en cualquier lugar, a menudo asociada con lugares remotos
     * o bosques oscuros.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Pueden encontrarse en cualquier lugar, a menudo asociadas con lugares remotos o bosques oscuros, así como en comunidades donde practican su magia.");
    }

    /**
     * Imprime la debilidad de la Bruja, indicando que es el fuego.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Fuego.");
    }

    /**
     * Imprime el nivel de hostilidad de la Bruja, que varía,
     * dependiendo de su personalidad y situación.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Varía. Algunas brujas pueden ser hostiles, especialmente si sienten que son amenazadas, mientras que otras son amables y utilizan su magia para el bien.");
    }

    /**
     * Imprime información sobre la presa de la Bruja, que varía
     * dependiendo de su intención.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: Varía dependiendo de su intención.");
    }      

    /**
     * Imprime el efecto de la mordida de la Bruja, indicando que no
     * aplica, ya que no suelen morder como forma de ataque.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: No aplica. Las brujas no suelen morder como forma de ataque.");
    }
        
    /**
     * Imprime el proceso de generación de nuevos ejemplares de Bruja,
     * señalando que no se reproducen.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: No se reproduce.");
    }

    /**
     * Imprime un dato histórico sobre las Brujas, explicando su presencia
     * en diversas culturas y mencionando los juicios de brujas de Salem
     * como un episodio notable de la persecución de brujas.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: La figura de la bruja ha estado presente en diversas culturas a lo largo de la historia. Los juicios de brujas de Salem (1692-1693) en Massachusetts son uno de los episodios más notorios de la persecución de brujas, donde muchas mujeres fueron acusadas de brujería y ejecutadas.");
    }

    /**
     * Imprime un mensaje que indica que las brujas pueden usar sus poderes
     * para ayudar a otros, pero también pueden causar daño o maldiciones
     * a aquellos que consideran malos.
     */
    public void ataque() {
        System.out.println("   - Pueden usar sus poderes para ayudar a otros, pero también pueden causar daño o maldiciones a aquellos que consideran malos.");
    }    
    
    /**
     * Imprime un mensaje indicando que las brujas pueden transmitir
     * sus conocimientos y habilidades a través de la enseñanza a
     * otras mujeres interesadas en la magia.
     */
    public void esparcirConocimiento() {
        System.out.println("   - Pueden transmitir sus conocimientos y habilidades a través de la enseñanza a otras mujeres interesadas en la magia.");
    }
}
