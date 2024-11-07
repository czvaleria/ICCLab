/**
 * Clase que representa a Frankenstein, un ser humanoide creado a partir de partes de cuerpos humanos.
 * Hereda de la clase Monstruo.
 */
public class Frankenstein extends Monstruo {

    /**
     * Constructor que inicializa a Frankenstein con el nombre "Frankenstein".
     */
    public Frankenstein() {
        super("Frankenstein");
    }

    /**
     * Imprime la descripción de Frankenstein, destacando su origen como
     * creación de Victor Frankenstein y su lucha por la aceptación en
     * una sociedad que lo rechaza.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción:  Es un ser humanoide creado por Victor Frankenstein a partir de diferentes partes de cuerpos humanos recolectadas de cementerios. Luego fue animado mediante procesos científicos. El monstruo posee una inteligencia y sensibilidad sorprendentes, pero su aspecto espantoso provoca rechazo y miedo. En su búsqueda de aceptación y cariño, sufre el abandono de su creador y el odio de la sociedad, lo que lo lleva a una vida de soledad y, eventualmente, a un deseo de venganza.");
    }

    /**
     * Imprime la locación típica donde se puede encontrar a Frankenstein,
     * indicando su tendencia a evitar a las personas y buscar áreas aisladas.
     */
    @Override
    public void locacion() {
        System.out.println("- Locacion: Principalmente en áreas aisladas, ya que el monstruo evita a las personas.");
    }

    /**
     * Imprime la debilidad de Frankenstein, mencionando las limitaciones
     * físicas del cuerpo humano y su fuerza sobrehumana.
     */
    @Override
    public void debilidad() {
        System.out.println("- Debilidad: Sufre las limitaciones físicas propias del cuerpo humano, aunque tiene una fuerza y resistencia sobrehumanas.");
    }

    /**
     * Imprime el nivel de hostilidad de Frankenstein, que surge del abandono
     * y el rechazo que ha experimentado, llevándolo a comportamientos vengativos.
     */
    @Override
    public void hostilidad() {
        System.out.println("- Hostilidad: Media a alta. Su hostilidad surge del abandono y rechazo, lo que lo vuelve vengativo.");
    }

    /**
     * Imprime información sobre la presa de Frankenstein, que no tiene
     * un objetivo específico.
     */
    @Override
    public void presa() {
        System.out.println("- Presa: No tiene.");
    }      

    /**
     * Imprime el efecto de la mordida de Frankenstein, indicando que no
     * muerde.
     */
    @Override
    public void mordida() {
        System.out.println("- Mordedura y su efecto: No muerde.");
    }
        
    /**
     * Imprime el proceso de generación de nuevos ejemplares de Frankenstein,
     * señalando que es único y no puede reproducirse.
     */
    @Override
    public void generar() {
        System.out.println("- Generación de ejemplares: No puede reproducirse. Es único en su especie, creado mediante experimentos y partes humanas.");
    }

    /**
     * Imprime un dato histórico sobre la novela "Frankenstein" de Mary Shelley,
     * su publicación en 1818 y su relevancia en el contexto de la ciencia ficción.
     */
    @Override
    public void datoHistorico() {
        System.out.println("- Dato Historico: La novela “Frankenstein” de Mary Shelley fue publicada en 1818 y es considerada una de las primeras obras de ciencia ficción. Se inspiró en la Revolución Industrial y los debates sobre la ética de la ciencia y la creación de vida.");
    }

    /**
     * Imprime un mensaje indicando que Frankenstein genera miedo y rechazo
     * debido a su apariencia y tamaño.
     */
    public void presencia() {
        System.out.println("   - Frankenstein genera miedo y rechazo debido a su apariencia rara y tamaño grande.");
    }    
    
    /**
     * Imprime un mensaje indicando que Frankenstein busca aceptación y compañía.
     */
    public void busca() {
        System.out.println("   - Frankenstein aceptación y compañía.");
    }
}
