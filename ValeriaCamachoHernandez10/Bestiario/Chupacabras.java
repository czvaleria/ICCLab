/**
 * Clase que representa al Chupacabras, una criatura mítica de aspecto
 * reptiliano o canino, conocida por su alimentación de la sangre de
 * animales de granja. Hereda de la clase Monstruo y es famosa por
 * su misteriosa naturaleza y comportamiento depredador.
 */
public class Chupacabras extends Monstruo {

    /**
     * Constructor que inicializa al Chupacabras con el nombre "Chupacabras".
     */
    public Chupacabras() {
        super("Chupacabras");
    } 

    /**
     * Imprime la descripción del Chupacabras, destacando su aspecto
     * reptiliano o canino, con ojos rojos brillantes y colmillos afilados,
     * así como su costumbre de alimentarse de la sangre de animales de granja.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Criatura de aspecto reptiliano o canino, con ojos rojos brillantes y colmillos afilados. Se dice que se alimenta de la sangre de animales de granja, dejando marcas de mordida en sus víctimas.");
    }

    /**
     * Imprime la locación típica del Chupacabras, indicando que se le
     * encuentra en México o zonas áridas.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: México o zonas áridas.");
    } 

    /**
     * Imprime la debilidad del Chupacabras, que incluye luz intensa y
     * sonidos fuertes, ya que prefiere la oscuridad y el silencio.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Luz intensa y sonidos fuertes, ya que prefiere la oscuridad y el silencio.");
    }

    /**
     * Imprime información sobre la generación de ejemplares del Chupacabras,
     * indicando que su método de reproducción es desconocido y que algunos
     * creen que es una criatura única, mientras que otros piensan que forma
     * parte de una especie aún no descubierta.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: Su método de reproducción es desconocido. Algunos creen que es una criatura única, otros piensan que es parte de una especie aún no descubierta.");
    }

    /**
     * Imprime un dato histórico sobre el Chupacabras, mencionando que las
     * primeras apariciones se reportaron en Puerto Rico en la década de
     * 1990, cuando los lugareños encontraron animales de granja muertos
     * con extrañas marcas de mordida y sin sangre.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Histórico: Las primeras apariciones del Chupacabras se reportaron en Puerto Rico en la década de 1990, donde los lugareños encontraron animales de granja muertos con extrañas marcas de mordida y sin sangre.");
    }

    /**
     * Imprime un mensaje que describe la acción del Chupacabras al drenar
     * la sangre de sus presas.
     */
    public void succionarSangre() {
        System.out.println("   - Succión de sangre: El Chupacabras drena la sangre de sus presas.");
    }

    /**
     * Imprime un mensaje que describe el sonido aterrador que emite el
     * Chupacabras, el cual es agudo y aterrador, paralizando a sus presas
     * antes de atacar.
     */
    public void emitirSonido() {
        System.out.println("   - Sonido aterrador: Emite un sonido agudo y aterrador que paraliza a sus presas antes de atacar.");
    }
}
