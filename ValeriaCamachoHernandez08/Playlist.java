import java.util.Scanner;

/**
 * La clase Cancion representa un nodo en una lista ligada de canciones.
 * Contiene el nombre de la canción y una referencia al siguiente nodo en la lista.
 * Por lo que aquí se define la estructura del nodo.
 */
class Cancion{
    String nombre; //Es el dato almacenado en el nodo: nombre de la canción
    Cancion siguiente;  // Siguiente nodo en la lista: hace referencia al siguiente nodo de la lista

    /**
     * Este metodo constructor es de la clase Cancion. Es para para inicializar el nodo.
     * @param nombre es el nombre de la canción.
     */
    public Cancion(String nombre){
        this.nombre = nombre;
        this.siguiente = null; //Se declara como null porque en este momento no hay siguiente nodo, además, la cola es vacía
    }
}

/**
 * La clase Lista maneja una lista ligada de objetos Cancion.
 * Proporciona métodos para agregar canciones a la lista, reproducir la siguiente canción,
 * buscar una canción y mostrar todas las canciones de la lista.
 */
class Lista{
    Cancion cabeza; //La cabeza es el primer nodo de la lista
    Cancion cola;
    Cancion actual = cabeza; //Empezamos desde la cabeza

    /**
     * Este metodo agrega una nueva canción al inicio (cabeza) de la lista.
     * @param nombre El nombre de la canción a agregar.
     */
    public void agregarCabeza(String nombre){
        Cancion nuevaCancion = new Cancion(nombre); //Crear un nuevo nodo (objeto) con el dato ingresado (el que le paso es la variable nombre)
        if (cabeza == null) { //Si la lista está vacía
            cabeza = nuevaCancion; //La nueva canción es la cabeza
            cola = nuevaCancion;   //Y también la cola (único elemento)
        } else {
            nuevaCancion.siguiente = cabeza; //El nuevo nodo apunta a la antigua cabeza
            cabeza = nuevaCancion;           //Ahora la nueva canción es la nueva cabeza
        }
    }//Fin de agregarCabeza

    /**
     * Este metodo agrega una nueva canción al final (cola) de la lista.
     * @param nombre El nombre de la canción a agregar.
     */
    public void agregarCola(String nombre){
        Cancion nuevaCancion = new Cancion (nombre);
        if (cola == null) { //Si la lista está vacía
            cabeza = nuevaCancion; //La nueva canción es la cabeza
            cola = nuevaCancion;   //Y también la cola
        } else {
            cola.siguiente = nuevaCancion; //La antigua cola apunta al nuevo nodo
            cola = nuevaCancion; //Ahora la nueva canción es la cola
        }
    }//Fin de agregarCola

    /**
     * Este metodo es para reproducir la siguiente canción de la lista.
     * Avanza la referencia de la canción actual al siguiente nodo en la lista.
     */
    public void reproducirSiguiente() {
        if (actual == null) {
            System.out.println("Ya no quedan más canciones por reproducir.");
            } else {
            System.out.println("Ahora se reproducirá: " + actual.nombre);
            actual = actual.siguiente; // Avanzar al siguiente nodo
            }
    }//Fin de reproducirSiguiente
        
    /**
     * Este metodo verifica si una canción específica está en la lista.
     * @param cancion es el nombre de la canción a buscar.
     * @return true si la canción está en la lista, false en caso contrario.
     */
    public boolean contenerCancion(String cancion){
        Cancion actual = cabeza; 
        while (actual != null) {
            if (actual.nombre.equalsIgnoreCase(cancion)) { // Comparamos el nombre de la canción
                return true; // Si coincide, la canción está en la lista
            }
            actual = actual.siguiente; //Avanzar al siguiente nodo
        }
        return false; //Si no se encontra la canción buscada, retornamos false
    }//Fin de contenerCancion

    /**
     * Metod que muestra todas las canciones en la lista.
     * Si la lista está vacía, imprime un mensaje indicándolo.
     */
    public void mostrarPlaylist(){
        if (cabeza == null) {
            System.out.println("La playlist está vacía. Añade canciones seleccionando 1.");
            return; // Termina si la lista está vacía
        }
        Cancion actual = cabeza; //Empezamos desde la cabeza
        while (actual != null) {
            System.out.println(actual.nombre); // Imprimimos el nombre de la canción
            actual = actual.siguiente; // Avanzamos al siguiente nodo
        }//Fin while
    }//Fin mostrar
}//Fin de clase Lista 

/**
 * La clase Playlist contiene el método principal para trabajar con la lista de canciones, es decir, 
 * la (playlist). Contiene el menú para agregar, buscar, reproducir y mostrar canciones, 
 * usando los métodos de la clase Lista.
 */
public class Playlist{

    /**
     * Método principal que ejecuta el programa. Aquí está el menú para trabajar con la playlist.
     */
    public static void main(String[] args){
        String cancion;
        int seleccion;
        Scanner entrada = new Scanner(System.in);
        Lista lista = new Lista(); //Crear una lista vacía
        boolean continuar = true; //Con este boolean puedo controlar el ciclo

        System.out.println("BIENVENIDO A MiMUSICA");
        System.out.println("Empieza introduciendo el nombre de una canción para crear una playlist");
        cancion = entrada.nextLine(); 
        lista.agregarCabeza(cancion); //Agregar la entrada del usuario como nueva cabeza de la lista
        System.out.println("¡No esperes más, escuchala ahora!");
        System.out.println("Reproduciendo: " + cancion);
        System.out.println(" ");

        // El ciclo es para seguir agregando, buscando o mostrando canciones
        while (continuar){
            System.out.println("Selecciona que más quieres hacer: \n [1] Agregar una canción a la playlist " 
                                + "\n [2] Buscar una canción a la playlist \n [3] Reproducir siguiente canción de la playlist "
                                + "\n [4] Mostrar la playlist \n [5] Salir de la playlist");
            seleccion = entrada.nextInt();        
            entrada.nextLine();

            switch (seleccion) {
                case 1:
                    System.out.println("Introduce el nombre de la canción que quieres agregar a la playlist:");
                    cancion = entrada.nextLine();
                    lista.agregarCola(cancion); //Agregar la entrada del usuario como la nueva cola
                    break;

                case 2:
                    System.out.println("Introduce el nombre de la canción para buscarla:");
                    String buscarCancion = entrada.nextLine();
                    if(lista.contenerCancion(buscarCancion)){
                        System.out.println("¡La canción " + buscarCancion + " SI está en tu playlist!");
                    } else{
                        System.out.println("¡La canción " + buscarCancion + " NO está en tu playlist!");
                    }
                    break;
    
                case 3:
                    lista.reproducirSiguiente();
                    break;
                    
                case 4:
                    System.out.println("Wow... así quedó tu playlist:");
                    lista.mostrarPlaylist();
                    break;

                case 5:
                    System.out.println("¡No te vayas!... aún hay más música por escuchar. ");
                    continuar = false;
                    break;
    
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }//Fin de switch
        }//Fin de while
    }//Fin de main
}//Fin de Playlist