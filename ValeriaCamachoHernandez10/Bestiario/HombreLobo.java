/**
 * Clase que representa a un Hombre Lobo, que hereda de la clase Monstruo.
 * Un Hombre Lobo es un ser que se transforma de humano a lobo durante
 * la luna llena, combinando características de ambos.
 */
public class HombreLobo extends Monstruo {

    /**
     * Constructor que inicializa un Hombre Lobo con el nombre "Hombre Lobo".
     */
    public HombreLobo() {
        super("Hombre Lobo");
    }

    /**
     * Imprime la descripción del Hombre Lobo, destacando su naturaleza
     * como ser mitad humano y mitad lobo, y sus habilidades físicas.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Humano que se convierte en un ser mitad humano, mitad lobo durante la luna llena. Los hombres lobo son grandes, increíblemente fuertes y rápidos.");
    }

    /**
     * Imprime la locación típica donde se pueden encontrar Hombres Lobo,
     * señalando su preferencia por áreas boscosas y su aparición en
     * diversas ubicaciones durante la luna llena.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Generalmente en áreas boscosas o lugares apartados, aunque pueden aparecer en cualquier sitio durante la luna llena.");
    }

    /**
     * Imprime la debilidad del Hombre Lobo, mencionando los elementos que
     * pueden dañarlo.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Cruces, plata, ajo y estacas de madera al corazón, además, la luz solar quema su piel.");
    }

    /**
     * Imprime el nivel de hostilidad del Hombre Lobo hacia los seres vivos,
     * describiendo su comportamiento agresivo en la búsqueda de alimento.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Alta. Atacan para alimentarse y pueden ser muy peligrosos, especialmente por su fuerza y habilidades sobrenaturale.");
    }

    /**
     * Imprime información sobre la presa del Hombre Lobo, que incluye
     * humanos y otros seres vivos.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: Humanos y otros seres vivos.");
    }      

    /**
     * Imprime el efecto de la mordida del Hombre Lobo en una víctima,
     * que puede resultar en la transmisión de la maldición del Hombre Lobo.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: Transmite la maldición del hombre lobo, convirtiendo a la víctima en uno de ellos cuando está en su forma de hombre lobo.");
    }
        
    /**
     * Imprime el proceso de generación de nuevos Hombres Lobo,
     * que ocurre cuando uno muerde a alguien.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: Cuando muerde a alguien.");
    }

    /**
     * Imprime un dato histórico sobre la creencia en los Hombres Lobo,
     * mencionando su origen en la antigüedad y referencias en mitologías
     * europeas.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: La creencia en los hombres lobo se remonta a la antigüedad, con menciones en mitologías europeas. En particular, la historia de Licaón en la mitología griega, quien fue transformado en un lobo por Zeus, es una de las primeras referencias conocidas, que data de alrededor del siglo III a.C ");
    }

    /**
     * Imprime un mensaje indicando que el Hombre Lobo es muy veloz.
     */
    public void serVeloz() {
        System.out.println("   - El hombre lobo es muy veloz.");
    }    
    
    /**
     * Imprime un mensaje indicando que el Hombre Lobo aulla hacia la luna llena.
     */
    public void aullar() {
        System.out.println("   - El hombre lobo aulla hacia la luna llena.");
    }
}
