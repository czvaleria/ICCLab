import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class Juego {
    // Para tener el top 10 declaramos top10 fuera de cualquier método para que sea accesible en toda la clase
    static ArrayList<Jugador> top10 = new ArrayList<Jugador>();

     /**
     * Método principal que ejecuta el juego.
     * Este juego permite al usuario seleccionar una dificultad y deletrear palabras en el menor tiempo posible.
     * @param args argumentos de la línea de comandos (no los utilizamos en este programa).
     */
    public static void main(String[] args){    
        boolean principal = true;
        Scanner entrada = new Scanner(System.in);   
        int seleccion = 0; 
        String nombre;
        char dificultad = ' ';

        // Para dar los resultados de cada jugada al jugador
        ArrayList<Resultado> resultados = new ArrayList<>();

        // Decks
        String[] aFacil = {"amor", "roma", "azul", "luz", "hola", "perro", 
                            "gato", "no", "playa", "arroz", "auto", "flor", 
                            "pera", "leche", "pies", "mano", "feliz", "triste", 
                            "adiós", "mamá"};

        String[] bNormal = {"vestido", "arrachera", "hamburguesa", "compilable",
                            "tonotos", "cientifícos", "amante", "felicidades",
                            "cumpleaños", "destrucción", "huracán", "computadora",
                            "servidor", "fotografía", "superior", "estrella", 
                            "programación", "navidad", "caracoles", "sopita"};

        String[] cDificil = {"deletreador", "alcahuete", "difícilmente",
                            "padrisímo", "sorprendente", "totalmente",
                           "perfectisímo", "otorrinolaringológico",
                           "electrocardiográficamente", "anticonstitucionalidad",
                           "cochambroso", "proposicional", "deserializable", "tlahuizcalpan",
                           "tepetlaoxtoc", "chimalhuacán"};

        int puntajeTotal = 0;
        double tiempoTotal = 0;
         
        System.out.println("        JUEGO DE DELETREO");
        System.out.println("El rey de Deletreo se quiere deletrear," 
                            + "\n    el que lo deletre mas rápido, "
                            + "\n       un buen deletreador será");

        while (principal){
            System.out.println("\n" + 
                                "Tenemos las siguientes opciones: "
                                + "\n [1] Iniciar el deletreo "
                                + "\n [2] Ver mejores deletreadores "
                                + "\n [3] Salir de la diversión"
                                + "\n");

            // Boolean para controlar excepciones
            boolean entradaValida = false;

            // Entrada del menú 
            while(!entradaValida) {
                System.out.print("Ingresa que deseas hacer: ");
                try {
                    seleccion = entrada.nextInt();
                    entrada.nextLine();
                    if (seleccion < 1 || seleccion > 3) {
                        System.out.println("Opción no válida. Ingresa un número: 1, 2 ó 3.");
                    } else {
                        // Si la entrada es válida, se termina este while
                        entradaValida = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Opción no válida. Ingresa un número: 1, 2 ó 3.");
                    entrada.nextLine();
                } // Fin del try - catch
            } // Fin del while
 
            // Boolean para controlar excepciones
            boolean charValido = false;
            switch (seleccion) {
                case 1:
                    System.out.println("INICIANDO DELETREO... \n");
                    System.out.print("Ingresa tu nombre: ");
                    nombre = entrada.nextLine();

                    // Entrada del menú de opciones para 1
                    while(!charValido) {
                        System.out.println("Tenemos las siguientes dificultades: "
                        + "\n [a] Con los ojos cerrados (fácil)"
                        + "\n [b] Normal (medio)"
                        + "\n [c] Muy potente (dificil)");
                        System.out.print(nombre + ", selecciona la dificultad: ");
                        try {
                            dificultad = entrada.next().charAt(0); 
                            entrada.nextLine();
                            if (dificultad == 'a' || dificultad == 'b' || dificultad == 'c' || dificultad == 'A' || dificultad == 'B' || dificultad == 'C' ) {
                                charValido = true;
                            } else {
                                System.out.println("Opción no válida. Ingresa una letra: a, b ó c.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Opción no válida. Ingresa un número: 1, 2 ó 3.");
                            entrada.nextLine();
                        } // Fin del try-catch
                    } // Fin del while 
                    
                    
                        // Submenú de opción 1
                        switch (dificultad) {
                            case 'a':
                                System.out.println("¡Bienvenido, "+ nombre +"!, que gane el deletrador con los ojos más cerrados de todos los deletradores de Deletreo...");
                                mezclarDeck(aFacil);
                                
                                for (int j = 0; j < 8; j++) {
                                    String palabra = aFacil[j];
                                    clearScreen(); 
                                    System.out.println("Escribe la palabra: " + palabra);
                                    // Se empieza a contar el tiempo
                                    Date inicio = new Date();
                                    String respuesta = entrada.nextLine();
                                    Date fin = new Date();
                                    // Calculamos el tiempo en segundos
                                    long tiempoMilisegundos = fin.getTime() - inicio.getTime();
                                    double tiempoPalabra = tiempoMilisegundos / 1000.0;
                                    // Se evalua si la palabra ingresada por el jugador (la respuesta) es correcta y se van acumulando puntos
                                    int puntaje = evaluar(palabra, respuesta);
                                    // Asignamos su tiempo y puntuaje
                                    puntajeTotal += puntaje;
                                    tiempoTotal += tiempoPalabra;
                                    resultados.add(new Resultado(palabra, tiempoPalabra, puntaje));
                                }
                                clearScreen();
                                System.out.println("Resultados de tu partida: ");
                                for(int i = 0; i < resultados.size(); i++) {
                                    System.out.println(resultados.get(i));
                                }
                                // Mostramos resultados finales
                                System.out.println("\n RESULTADOS para " + nombre);
                                System.out.println("  - Tu puntaje total es: " + puntajeTotal);
                                System.out.println("  - Te tardaste un total de: " + tiempoTotal + " segundos.");
                                
                                // Serializamos
                                Jugador aJugador = new Jugador(nombre, puntajeTotal);
                                top10.add(aJugador);
                                ordenarJugadores();
                                actualizarTop();
                                serializar(top10, "archivo.ser");
                                break;
                                            
                            case 'b':
                                System.out.println("¡Bienvenido!");
                                mezclarDeck(bNormal);
    
                                for (int j = 0; j < 8; j++) {
                                    String palabra = bNormal[j];
                                    clearScreen(); 
                                    System.out.println("Escribe la palabra: " + palabra);
                                    // Se empieza a contar el tiempo
                                    Date inicio = new Date();
                                    String respuesta = entrada.nextLine();
                                    Date fin = new Date();
                                    // Calculamos el tiempo en segundos
                                    long tiempoMilisegundos = fin.getTime() - inicio.getTime();
                                    double tiempoPalabra = tiempoMilisegundos / 1000.0;
                                    // Se evalua si la palabra ingresada por el jugador (la respuesta) es correcta y se van acumulando puntos
                                    int puntaje = evaluar(palabra, respuesta);
                                    // Asignamos su tiempo y puntuaje
                                    puntajeTotal += puntaje;
                                    tiempoTotal += tiempoPalabra;
                                }
                                clearScreen();
                                System.out.println("Resultados de tu partida: ");
                                for(int i = 0; i < resultados.size(); i++) {
                                    System.out.println(resultados.get(i));
                                }
                                // Mostramos resultados finales
                                System.out.println("\n RESULTADOS para " + nombre);
                                System.out.println("  - Tu puntaje total es: " + puntajeTotal);
                                System.out.println("  - Te tardaste un total de: " + tiempoTotal + " segundos.");
                                
                                // Serializamos
                                Jugador bJugador = new Jugador(nombre, puntajeTotal);
                                top10.add(bJugador);
                                ordenarJugadores();
                                actualizarTop();
                                serializar(top10, "archivo.ser");
                                break;
                                       
                            case 'c':
                                System.out.println("¡Bienvenido!, que gane el deletrador más veloz de todos los deletradores de Deletreo...");
                                mezclarDeck(cDificil);
    
                                for (int j = 0; j < 8; j++) {
                                    String palabra = cDificil[j];
                                    clearScreen(); 
                                    System.out.println("Escribe la palabra: " + palabra);
                                    // Se empieza a contar el tiempo
                                    Date inicio = new Date();
                                    String respuesta = entrada.nextLine();
                                    Date fin = new Date();
                                    // Calculamos el tiempo en segundos
                                    long tiempoMilisegundos = fin.getTime() - inicio.getTime();
                                    double tiempoPalabra = tiempoMilisegundos / 1000.0;
                                    // Se evalua si la palabra ingresada por el jugador (la respuesta) es correcta y se van acumulando puntos
                                    int puntaje = evaluar(palabra, respuesta);
                                    // Asignamos su tiempo y puntuaje
                                    puntajeTotal += puntaje;
                                    tiempoTotal += tiempoPalabra;
                                }
                                clearScreen();
                                System.out.println("Resultados de tu partida: ");
                                for(int i = 0; i < resultados.size(); i++) {
                                    System.out.println(resultados.get(i));
                                }
                                // Mostramos resultados finales
                                System.out.println("\n RESULTADOS para " + nombre);
                                System.out.println("  - Tu puntaje total es: " + puntajeTotal);
                                System.out.println("  - Te tardaste un total de: " + tiempoTotal + " segundos.");
                                
                                // Serializamos
                                Jugador cJugador = new Jugador(nombre, puntajeTotal);
                                top10.add(cJugador);
                                ordenarJugadores();
                                actualizarTop();
                                serializar(top10, "archivo.ser");
                                break;
                    
                            default:
                                System.out.println("Alguien no es muy bueno leyendo. Opción no válida");
                                break;
                        }  // Fin de dificultad
                    break;
    
                case 2:
                    System.out.println("PREPÁRATE PARA VER A ESTAS LEYENDAS");
                    mostrarTop();
                    break;
            
                case 3:
                    System.out.println("SALIENDO... ");
                    principal = false;
                    break;
    
                default:
                   System.out.println("Alguien no es muy bueno leyendo. Opción no válida");
                    break;
            } // Fin de switch de selección    

        } // Fin de while
    
    } // Fin de main

        /*
         * Metodo para mezclar aleatoriamente el deck
         */
        public static void mezclarDeck(String[] deck){
            Random rdm = new Random();   
            for (int i = deck.length - 1; i > 0; i--) {
                int j = rdm.nextInt(i + 1);
                // Intercambia aFacilDeck[i] con aFacilDeck[j]
                String k = deck[i];
                deck[i] = deck[j];
                deck[j] = k;
            }
        }

        /*
         * Metodo para limpiar la pantalla de la terminal
         */
        public static void clearScreen() {
            System.out.print("\033[H\033[2J");  
            System.out.flush();
        }        

    /**
     * Método para evaluar si la respuesta ingresada por el jugador es correcta.
     * @param respuesta La palabra escrita por el jugador.
     * @param palabra La palabra correcta que se debe escribir.
     * @return El puntaje obtenido: 100 si es correcta, -100 si no lo es.
     */
    public static int evaluar(String respuesta, String palabra) {
            int puntaje = 0; 
            // Comprobamos si la palabra ingresada es igual a la correcta
            if (respuesta.equalsIgnoreCase(palabra)) {
                puntaje = 100;
            } else {
                puntaje = -100;
            }
            return puntaje;
        }

    // Para seleccion 2
    /**
     * Método para ordenar la lista de jugadores en el top 10 según su puntaje 
     * en orden de mayor a menor.
     */
    public static void ordenarJugadores() {
            for (int i = 0; i < top10.size() - 1; i++) {
                for (int j = 0; j < top10.size() - i - 1; j++) {
                    if (top10.get(j).getPuntaje() < top10.get(j + 1).getPuntaje()) {
                        // Intercambiar posiciones
                        Jugador aux = top10.get(j);
                        top10.set(j, top10.get(j + 1));
                        top10.set(j + 1, aux);
                    }
                }
            }
        }


    /**
     * Método para actualizar la lista de jugadores para mantener solo los 
     * primeros 10 con mayor puntación. Si hay más de 10 jugadores, elimina 
     * a los que no entran en el rango.
     */
    public static void actualizarTop() {
            ordenarJugadores();
            if (top10.size() > 10) {
                // Mantener solo los primeros 10 jugadores
                top10 = new ArrayList<>(top10.subList(0, 10));
            }
        }

    /**
     * Método para mostrar el top 10 de jugadores en la consola.
     */
    public static void mostrarTop() {
            for (int i = 0; i < top10.size(); i++){
                System.out.println(top10.get(i));
            }
        }  

    /*
     * Metodo para serializar.
     * Le paso el arreglo jugadores que contiene a los objetos jugador y el nombre del 
     * archvio donde van a guardar el flujo de bytes correspondientes a los objetos.
     * El metodo va a crear un flujo de salida para que podamos escribir los bytes
     * al archivo, luego, para convertir el flujo de bytes a mis objetos, envuelvo 
     * el FileOutputStream en un ObjectOutputStream y se escriben en el archivo que le pase
     * con el método out.writeObject. Si todo va bien, muestra un mensaje confirmando 
     * que los jugadores fueron guardados correctamente
     * 
     * @param jugadores Lista de jugadores a serializar.
     * @param archivo Nombre del archivo donde se guardará la lista.

     */
    public static void serializar (ArrayList<Jugador> jugadores, String archivo){
        try (FileOutputStream pasar = new FileOutputStream(archivo);
            ObjectOutputStream out = new ObjectOutputStream(pasar)) {
                out.writeObject(jugadores);
                System.out.println("La lista del top 10 de deletreadores ha sigo guardada");
            } catch (IOException e) {
                System.out.println("La lista del top 10 de deletreadores no se ha podido guardar");
            }
    }

    /*
     * Metodo para deserealizar la lista de jugadores desde un archivo.
     * El metodo recibe el nombre del archivo y me devuelve la lista del top 10
     * Primero crea un objeto File que representa es donde se guardaron los jugadores.
     * Luego, verifica si existe el archivo o no. En caso de que no, para que no haya pro-
     * blemas, devuelve un ArrayList vacío. En caso de que si, intenta leer el archivo y 
     * cre un flijo de entrada para leer los bytes del archivo con ObjectInputStream y hace
     * un cast de bytes a objeto. 
     * 
     * @param archivo Nombre del archivo donde está guardada la lista.
     * @return Una lista de jugadores deserializada o una lista vacía si no se encuentra el archivo.

     */
    public static ArrayList<Jugador> deserializar (String archivo) {
        File archivoTop = new File(archivo);
        if (archivoTop.exists()) {
            try(FileInputStream recibir = new FileInputStream(archivoTop);
                ObjectInputStream in = new ObjectInputStream(recibir)) {
                    return (ArrayList<Jugador>) in.readObject();
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("El archivo no se ha podido cargar");
                }
        } else {
            System.out.println("No se encontró el archivo previo. Entonces vamos a comenzar con una lista vacía.");
        }
        return new ArrayList<>();
    }

} // Fin de Juego