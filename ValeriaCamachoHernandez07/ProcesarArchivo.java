/*
 * Hola Ricardo, buen día, espero estés muy bien.
 * No pude completar el ejercicio de archivos, 
 * te añadí en el archivo cómo pensaba hacerlo. 
 * ¿Crees que me puedas ayudar guiandome, por favor?
 * Por tiempo ya no te pude escribir antes, me tarde
 * mucho intendandolo pero al final no le encontré 
 * como. Me confundí. 
 * Gracias. 
 */
import java.io.FileReader;
import java.io.IOException;

public class ProcesarArchivo{
    public static void main(String[] args){

        /*
         * Primeramente se comprueba que se haya pasado un archivo, 
         * en la línea de comandos,con el que trabajar.
         */
        if (args.length < 1) {
            System.out.println("ERROR, añade el nombre del archivo.");
            return;
        }

        /*
         * Luego se lee el archivo.
         */
        try(FileReader fr = new FileReader(args[0]));
            int contenido;
        
            /*
             * Para almacenar el contenido en arreglos, se 
             * inicialza un arreglo vacio
             */
            int[] numeros = new int[0];

            /*
             * Este ciclo guarda en arreglos cada elemento que tiene el archivo.
             * Lo que hace es leer el archivo hasta que no haya más datos. Así
             * se asegura que lea todos. El ciclo se repite mientras el contenido 
             * leído sea diferente a cero, osea mientras el archivo tenga contenido.
             * Para eso esté el contador inicializado en cero. Tambén, el arreglo contenido
             * se le añadirá 1
             * 
             * Nota: No supe cómo poner las variables para que también se contara según las comas,
             * osea que por cada coma que se encontrara, lo tomara como un elemento, pero no supe 
             * cómo hacerlo. Encontré si uno le daba los numeros por terminal, pero no desde un 
             * archivo. Luego, una vez cada número guardado en un arreglo, modificarlo para añadir
             * el último (la suma).
             */
            int contador = 0;
            while((contenido = fr.read()) != 0){
                int[] nuevoValor = new int[contenido + 1];                
            }
            for(i = 0; i < cantidad.lenght; i++ ){
                int[] nuevoValor = new int[contenido + 1];                
            }
        }catch (IOException e){
            System.out.println("ERRORRRR");
        }
    }