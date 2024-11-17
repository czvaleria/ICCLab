import java.util.Random;

/**
 * La clase Halcon representa a un halcón como un depredador en un desierto.
 * Implementa la interfaz {@link Depredador}, {@link Presa} y la interfaz {@link SerVivo} y 
 * define cómo caza, cómo se alimenta y una descripción general del halcón. 
 */
public class Halcon implements Depredador, Presa, SerVivo{
    
    Random rdm = new Random();

    /**
     * Método que simula la acción de cazar del halcón. La probabilidad de éxito
     * de la caza es aleatoria. Si el halcón tiene éxito, se indica que ha atrapado
     * a su presa y está comiendo. Si no tiene éxito, se indica que no logró cazar
     * y se menciona que el halcón se alimenta de otras cosas.
     */
    @Override
    public void cazar(){
        System.out.print("\n - Veámoslo en acción... ");
        int probabilidad = rdm.nextInt(2); 
        if(probabilidad == 1){
            System.out.print("El halcón atrapó a su presa. Ahora está comiendo una serpiente");
        } else {
            System.out.print("El halcón no logró atrapar a su presa.");
        }
    }

    /**
     * Método cuando es presa.
     */
    @Override
    public void serPresa(){
        System.out.println("\n... Oh no, se han comido al halcón");
    }

    /*
     * Método que dice su alimentación
     */
    @Override
    public void comer(){
        System.out.println("- Alimentación: Comen serpientes. ");
    }


    /**
     * Método que describe el estilo de caza del halcón.
     */
    @Override
    public void comoCome(){
        System.out.println("- Método de caza: Usan su velocidad para atrapar a sus presas "
            + "mientras vuelan");
    }

    /**
     * Método que proporciona una descripción general del halcón.
     */
    @Override
    public void descripcion(){
        System.out.println("- Descripción: Un halcón es un ave muy rápida "
            + "y fuerte. Tiene un pico afilado y garras muy fuertes para "
            + "atrapar a sus presas.");
    }

} // Fin de Halcon
