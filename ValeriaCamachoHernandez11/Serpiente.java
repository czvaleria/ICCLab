import java.util.Random;

/**
 * La clase Serpiente representa a una serpiente en un ecosistema.
 * Implementa las interfaces {@link Depredador}, {@link Presa} y {@link SerVivo}.
*/
public class Serpiente implements Depredador, Presa, SerVivo {

    Random rdm = new Random();

    /**
     * Método que simula el comportamiento de caza de la serpiente.
     */
    @Override
    public void cazar(){
        System.out.print("\n - Veamoslo en acción... ");
        int probabilidad = rdm.nextInt(2); 
        if(probabilidad == 1){
            System.out.print("La serpiente atrapó a su presa. Ahora se está comiendo un insecto.");
        } else {
            System.out.print("La serpiente no logró atrapar a su presa.");
        }
    }
    
    /**
     * Método cuando es presa.
     */
    @Override
    public void serPresa(){
        System.out.println("\n... Oh no, se han comido a la serpiente");
    }

    /*
     * Método que dice su alimentación
     */
    @Override
    public void comer(){
        System.out.println("- Alimentación: Comen ratones. ");
    }

    /**
     * Método que describe cómo la serpiente caza a su presa.
     */
    @Override
    public void comoCome(){
        System.out.println("- Método de caza: Usan su veneno.");
    }

    /**
     * Método que describe la apariencia y adaptaciones físicas de la serpiente.
     */
    @Override
    public void descripcion(){
        System.out.println("- Descripción: Tienen cuerpos largos, delgados y son de colores que  "
            + "los esconden entre las rocas o la arena.");
    }

} // Fin de la clase Serpiente
