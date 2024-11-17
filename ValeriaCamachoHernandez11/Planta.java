import java.util.Random;

/**
 * La clase representa una planta en un desierto.
 * Implementa la interfaz {@link Presa} y {@link SerVivo}, ya que las plantas 
 * son presas en la cadena alimenticia.
 */
public class Planta implements Presa, SerVivo{

    Random rdm = new Random();

    /**
     * Método que simula el proceso de alimentación de la planta.
     */
    @Override
    public void comer() {
        System.out.print("\n- Veamoslo en acción... ");
        int probabilidad = rdm.nextInt(2);  
        if (probabilidad == 1) {
            System.out.print("La planta hace fotosíntesis.");
        } else {
            System.out.print("La planta no recibió luz solar ni agua.");
        }
    }

    /*
     * Método cuando es presa.
     */
    @Override
    public void serPresa(){
        System.out.println("\n...Oh no, se han comido a la planta");
    }

    /**
     * Método que describe cómo la planta obtiene su alimentación.
     */
    @Override
    public void comoCome() {
        System.out.println("- Método de alimentación: Son autótrofas.");
    }

    /**
     * Método que muestra la descripción de la planta.
     */
    @Override
    public void descripcion() {
        System.out.println("- Descripción: Tienen hojas pequeñas o espinas para evitar la "
            + "pérdida de agua y raíces profundas que les permiten llegar al agua subterránea.");
    }
} // Fin de la clase Planta
