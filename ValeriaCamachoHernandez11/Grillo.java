import java.util.Random;

/**
 * La clase Grillo representa a un grillo en el desierto.
 * Implementa las interfaces {@link Depredador}, {@link Presa} y {@link SerVivo}.
 * 
 * El grillo es tanto un depredador como una presa. Como depredador, se alimenta de plantas,
 * y como ser vivo, tiene una descripción física y un método para comer.
 */
public class Grillo implements Depredador, Presa, SerVivo {

    Random rdm = new Random();

    /**
     * Método que simula el comportamiento de caza del grillo.
     */
    @Override
    public void cazar(){
        System.out.print("\n - Veamoslo en acción... ");
        int probabilidad = rdm.nextInt(2); 
        if(probabilidad == 1){
            System.out.print("El grillo se está comiendo a la planta.");
        } else {
            System.out.print("El grillo no se está comiendo a la planta.");
        }
    }

    /**
     * Método cuando es presa y se lo comen
     */
    @Override
    public void serPresa(){
        System.out.println("\n... Oh no, se han comido al grillo.");
    }

    /*
     * Método que dice su alimentación
     */
    @Override
    public void comer(){
        System.out.println("- Alimentación: Comen plantas. ");
    }

    /**
     * Método que describe cómo el grillo caza.
     */
    @Override
    public void comoCome(){
        System.out.println("- Método de caza: Salta hasta llegar a la planta, lol.");
    }

    /**
     * Método que describe físicamente al grillo.
     */
    @Override
    public void descripcion(){
        System.out.println("- Descripción: Los grillos son pequeños con un "
            + "exoesqueleto duro que los protege del calor y la deshidratación.");
    }

} // Fin de la clase Grillo
