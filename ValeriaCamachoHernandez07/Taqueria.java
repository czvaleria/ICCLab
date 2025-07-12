import java.util.Scanner;

/**
 * Taqueria es la clase principal (y única) que gestiona el pedido de tacos, pide y
 * cuántos van a ser y de qué, y además, calcula dice el costo total.
 */


public class Taqueria{
    /**
     * @param arg
     */
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);

        //Bienvenida
        System.out.println("TAQUERÍA EL TACO FELIZ. Un taco digno de usted.\n");

        System.out.println("Buenas. Dígame, ¿cuántos tacos van a ser? ");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); 

        // Crear un arreglo de Strings con el tamaño proporcionado por el usuario
        String[] entradas = new String[cantidad];

        /**
         * Este ciclo for toma la orden del cliente, solicitando el tipo de taco para cada elemento.
         * @param i es el indice del taco actual a registrar.
         */
        for(int i = 0; i < cantidad; i++){
            System.out.print("El #" + (i + 1) + " taco ¿de que va a ser? ");
            entradas[i] = entrada.nextLine(); 
        }//Fin del for
        
        /**
         * Este ciclo for muestra la orden completa del usuario en consola.
         */
        System.out.println("\nSalen: ");
        for (int i = 0; i < cantidad; i++){
            System.out.println("Taco #" + (i+1) + " es de " + entradas[i]);
        }//Fin del for

        /**
         * Calcular e imprimir el total a pagar según la cantidad de tacos que se pidieron
         */
        System.out.println("\nPor sus "+ cantidad + " tacos va a ser $" + (25*cantidad) + " pesos");
        System.out.println("Vuelva pronto :D");
    }//Fin de main
}//Fin de taqueria