import java.util.Random;

/**
 * La clase Coyote representa un coyote en el desierto, que actúa como depredador
 * dentro de una cadena alimenticia. Esta clase implementa las interfaces 
 * {@link Depredador} y {@link SerVivo}, y proporciona métodos para simular su 
 * comportamiento de caza y alimentación, así como una descripción de su apariencia.
 */
public class Coyote implements Depredador, SerVivo {
    Random rdm = new Random();

    /**
     * Simula el comportamiento de caza del coyote. El coyote intenta cazar a su presa con una
     * probabilidad de éxito del 50%. Si tiene éxito, el coyote se está comiendo un halcón, de lo contrario,
     * no logra capturar a su presa.
     */
    @Override
    public void cazar(){
        System.out.print("\n - Veamoslo en acción... ");
        int probabilidad = rdm.nextInt(2);
        if(probabilidad == 1){
            System.out.print("El coyote atrapó a su presa. Se está comiendo a un halcón");
        } else {
            System.out.print("El coyote no está comiendo. El coyote dice: 'Tengo hambre :()");
        }
    }

    /**
     * Proporciona el método de caza del coyote.
     */
    @Override
    public void comoCome(){
        System.out.println("- Método de caza: Lo hace de manera solitaria o en pequeños "
            + "grupos, utilizando su agudo sentido del oído y la vista para localizar a sus presas.");
    }

    /**
     * Proporciona una descripción del coyote, incluyendo su apariencia física.
     */
    @Override
    public void descripcion(){
        System.out.println("- Descripción: Tiene un pelaje gris con amarillo.");
    }
} // Fin de Coyote
