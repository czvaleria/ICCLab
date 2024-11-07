import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;

/**
 * La clase Matricula simula una base de datos de alumnos de la UNAM. 
 * En la clase Matricula se puede agregar, consultar y modificar alumnos a través de un menú.
 * Los alumnos son almacenados en un HashMap, donde la clave es su matrícula (Integer) 
 * y el valor es un objeto de la clase Alumno.
 */
public class Matricula {
    /** 
     * HashMap que almacena los alumnos registrados, donde la clave es la matrícula del alumno 
     * y el valor es un objeto Alumno.
     */
    static HashMap<Integer, Alumno> matriculaAlumnos = new HashMap<>();
    
    static Scanner entrada = new Scanner(System.in);

    /**
     * Método principal que imprime el menú de opciones. Permite al usuario agregar, consultar 
     * o modificar alumnos.
     */
    public static void main(String[] args) {
        int opcion = 0;

        /*
         * Este do-while es para mostrar el menú mientras. Segun la opcion seleccionada, se
         * lleva a cabo el método. 
         */
        do {
            try{
                System.out.println("Seleccione la opción que desee realizar:");
                System.out.println("1. Agregar alumno." +
                        "\n2. Consultar alumno." +
                        "\n3. Modificar alumno." +
                        "\n4. Salir.");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        agregar();
                        break;

                    case 2:
                        consultar();
                        break;

                    case 3:
                        modificar();
                        break;

                    case 4:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                        break;
                }
            } catch(InputMismatchException ime){
                System.out.println("Error. Ingresar un número para seleccionar una opción del menú.");
                entrada.nextLine();
            } // Fin try-catch
        }while (opcion != 4);
    }// Fin de main

    /**
     * Este método es para agregar un nuevo alumno al sistema de matrícula.
     * Pide al usuario ingresar la matrícula, nombre, carrera y promedio del alumno,
     * y almacena esta información en el HashMap.
     */
    public static void agregar() {
        System.out.println("Seleccionaste 1. Agregar alumno.");
        try {
            System.out.println("Introduzca la matrícula del alumno:");
            int matricula = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Introduzca el nombre del alumno:");
            String nombre = entrada.nextLine();

            System.out.println("Introduzca la carrera:");
            String carrera = entrada.nextLine();

            System.out.println("Introduzca el promedio del alumno:");
            float promedio = entrada.nextFloat();

            Alumno alumno = new Alumno(nombre, carrera, promedio);
            matriculaAlumnos.put(matricula, alumno);

            System.out.println("Se ha agregado al alumno: " + nombre +
                    ", con matrícula " + matricula + " de la carrera " + carrera +
                    " con promedio de " + promedio);
        } catch (InputMismatchException ime) {
            System.out.println("Error: debes ingresar la matrícula y el promedio con números. Inténtalo de nuevo.");
            entrada.nextLine();
        } // Fin try-catch
    }// Fin de agregar()

    /**
     * Este método es para consultar un alumno en el sistema.
     * Pide al usuario ingresar la matrícula y busca al alumno en el HashMap.
     * Si el alumno existe, imprime su información, de lo contrario, le indica que no se encontró.
     */
    public static void consultar() {
        System.out.println("Seleccionaste 2. Consultar alumno.");
        try {
            System.out.println("Introduzca la matrícula del alumno:");
            int matricula = entrada.nextInt();

            if (matriculaAlumnos.containsKey(matricula)) {
                Alumno alumno = matriculaAlumnos.get(matricula);
                System.out.println("Aquí está el alumno buscado:");
                System.out.println("Nombre: " + alumno.nombre);
                System.out.println("Carrera: " + alumno.carrera);
                System.out.println("Promedio: " + alumno.promedio);
            } else {
                System.out.println("No se encontró al alumno.");
            }
        } catch (InputMismatchException ime) {
            System.out.println("Error: la matrícula debe ser un número. Inténtalo de nuevo.");
            entrada.nextLine();
        } // Fin try-catch
    }// Fin de consultar

    /**
     * Método para modificar la información de un alumno.
     * Pide al usuario ingresar la matrícula del alumno y permite modificar su nombre,
     * carrera o promedio, actualizando el HashMap con la nueva información.
     */
    public static void modificar() {
        System.out.println("Seleccionaste 3. Modificar alumno.");
        try {
            System.out.println("Introduzca la matrícula del alumno:");
            int matricula = entrada.nextInt();

            if (matriculaAlumnos.containsKey(matricula)) {
                Alumno alumno = matriculaAlumnos.get(matricula);

                System.out.println("Seleccione la opción que desee modificar:");
                System.out.println("1. Nombre." +
                        "\n2. Carrera." +
                        "\n3. Promedio.");
                int opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa el nuevo nombre:");
                        String nuevoNombre = entrada.nextLine();
                        alumno.nombre = nuevoNombre;
                        break;
                    case 2:
                        System.out.println("Ingresa la nueva carrera:");
                        String nuevaCarrera = entrada.nextLine();
                        alumno.carrera = nuevaCarrera;
                        break;
                    case 3:
                        System.out.println("Ingresa el nuevo promedio:");
                        float nuevoPromedio = entrada.nextFloat();
                        alumno.promedio = nuevoPromedio;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
                matriculaAlumnos.put(matricula, alumno);
                System.out.println("Se han guardado los cambios.");
            } else {
                System.out.println("No se encontró al alumno.");
            }
        } catch (InputMismatchException ime) {
            System.out.println("Error: debes ingresar la matrícula y el promedio con números. Inténtalo de nuevo.");
            entrada.nextLine();
        } // Fin de try-catch
    }//Fin de modificar()
}//Fin de clase Matricula

/**
 * La clase Alumno representa a un estudiante con un nombre, carrera y promedio.
 */
class Alumno {
    String nombre;
    String carrera;
    float promedio;

    /**
     * Metodo constructor de la clase Alumno.
     * @param nombre   es el nombre del alumno.
     * @param carrera  es la carrera en la que está inscrito el alumno.
     * @param promedio es el promedio del alumno.
     */
    public Alumno(String nombre, String carrera, float promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }
}// Fin de Alumno