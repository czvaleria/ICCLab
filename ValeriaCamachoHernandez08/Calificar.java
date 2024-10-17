import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase Calificar permite ingresar calificaciones de alumnos,
 * calcular su promedio y modificar calificaciones existentes.
 */
public class Calificar {

    /**
     * El método principal que ejecuta el programa.
     * Permite al usuario ingresar calificaciones, calcular el promedio
     * o modificar una calificación existente.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Se crea un ArrayList vacío para almacenar las calificaciones
        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.println("PROMEDIAR CALIFICACIONES DE ALUMNOS");

        /*
         * En este ciclo while se ingresan las calificaciones. Termina el ingreso
         * de calificaciones cuando ingrese una negativa, osea menor a cero. Ade-
         * más, se las añade al ArrayList de calificaciones.
         */
        while (true) {
            System.out.println("Ingrese la calificación (para indicar que ya terminó de ingresar todas las calificaciones ingrese un número negativo):");
            double numero = entrada.nextDouble();
            if (numero < 0) {
                break; 
            }
            calificaciones.add(numero);
        }

        // Verificación si el ArrayList no está vacío
        if (calificaciones.size() > 0) {
            System.out.println("Las calificaciones son: " + calificaciones);
        } else {
            System.out.println("No has ingresado ninguna calificación.");
            return; 
        }

        entrada.nextLine(); 
        System.out.println("¿Estás list@ para obtener el promedio o deseas modificar una calificación? Introduce 's' para sí o 'n' para no:");
        String decision = entrada.nextLine();
        
        if (decision.equalsIgnoreCase("s")) {
            double suma = 0;
            for (double calificacion : calificaciones) {
                suma += calificacion; 
            }
            double promedio = suma / calificaciones.size(); 
            System.out.println("El promedio de las calificaciones es: " + promedio);
        } else {
            System.out.println("¿En qué posición está la calificación a modificar?");
            int posicion = entrada.nextInt();
            posicion -= 1; // Restar 1 para ajustar la posición a 0, por lo que la posicion inicia en 1

            if (posicion >= 0 && posicion < calificaciones.size()) {
                System.out.println("Introduce la nueva calificación:");
                double nuevaCalificacion = entrada.nextDouble();
                calificaciones.set(posicion, nuevaCalificacion); 
                System.out.println("La calificación en la posición " + (posicion + 1) + " ha sido modificada.");

                //Aquí se calcula y muestra el nuevo promedio con la modificación
                double suma = 0;
                for (double calificacion : calificaciones) {
                    suma += calificacion; 
                }
                double promedio = suma / calificaciones.size(); 
                System.out.print("Ahora el promedio es de: " + promedio);
            } else {
                System.out.println("Posición inválida. Intentelo de nuevo");
            }
        }
    } // Fin de main
} // Fin de Calificar
