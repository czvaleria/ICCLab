import java.util.Random;
import java.util.Scanner;

/**
 * Clase que representa a un jugador del juego de dados.
 */
public class Jugador {
    // Atributos
    private String nombre;
    private int dinero;

    /**
     * Método constructor para crear a un jugador con su nombre y dinero inicial.
     * @param nombre Nombre del jugador.
     * @param dineroInicial Cantidad de dinero inicial del jugador.
     */
    public Jugador(String nombre, int dineroInicial) {
        this.nombre = nombre;
        this.dinero = dineroInicial;
    }

    /**
     * Método para obtener el nombre del jugador.
     * @return Nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la cantidad de dinero del jugador.
     * @return Cantidad de dinero del jugador.
     */
    public int getDinero() {
        return dinero;
    }

    /**
     * Método para actualizar la cantidad de dinero del jugador.
     * @param dinero Nueva cantidad de dinero.
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    /**
     * Método para operar el dinero: Duplicar la cantidad de dinero del jugador.
     */
    public void duplicarDinero() {
        this.dinero *= 2;
    }

    /**
     *Método para operar el dinero: Dividir en dos la cantidad de dinero del jugador.
     */
    public void dividirDinero() {
        this.dinero /= 2;
    }

    /**
     * Método para operar el dinero: Agrega la cantidad pasada de dinero al jugador que le toca en turno.
     * @param cantidad Cantidad de dinero a agregar.
     */
    public void agregarDinero(int cantidad) {
        this.dinero += cantidad;
    }

    /**
     * Método para operar el dinero: Restarle dinero al jugador.
     * @param cantidad Cantidad de dinero a restar.
     */
    public void restarDinero(int cantidad) {
        this.dinero -= cantidad;
    }

    /**
     * Método para mostrar la cantidad actual de dinero del jugador en consola.
     */
    public void mostrarDinero() {
        System.out.println(nombre + " tiene $" + dinero);
    }

/**
 * Clase principal.
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        //Descripción y presentación del juego
        System.out.println("JUEGO DE DADOS");
        System.out.println("En este juego de dados, dos jugadores se turnan para lanzar un par de dados. Cada jugador, al presionar Enter, tira los dados y el resultado determina su suerte: ");
        System.out.println("Si sale 2, el jugador pierde y su dinero es transferido al oponente, si sale 12 el jugador gana $5000 adicionales, si sale 10 el dinero del jugador se duplica y el del oponente se divide a la mitad, si sale 7 el dinero del jugador se divide a la mitad y el del oponente se duplica.");
        System.out.println("El juego continúa hasta que uno de los jugadores alcanza $10,000 o se queda sin dinero.");
        System.out.println(" ");

        // Crear los objetos pidiéndoles sus nombres
        System.out.println("Jugador 1, ingrese su nombre:");
        String nombreJugador1 = entrada.nextLine();
        Jugador jugador1 = new Jugador(nombreJugador1, 5000);

        System.out.println("Jugador 2, ingrese su nombre:");
        String nombreJugador2 = entrada.nextLine();
        Jugador jugador2 = new Jugador(nombreJugador2, 5000);

        Jugador jugadorActual;
        Jugador oponente;
        boolean turnoJugador1 = true;

        /** 
         * Ciclo principal
         */
        while (jugador1.getDinero() > 0 && jugador2.getDinero() > 0 &&
               jugador1.getDinero() < 10000 && jugador2.getDinero() < 10000) {

            /**
             * Seleccionar jugador actual y oponente
             */
            if (turnoJugador1) {
                jugadorActual = jugador1;
                oponente = jugador2;
            } else {
                jugadorActual = jugador2;
                oponente = jugador1;
            }

            /**
             * Comienza el turno
             */
            System.out.println("Presiona Enter para tirar los dados o '-' para salir.");
            String enter = entrada.nextLine();

            if (enter.equals("-")) {
                System.out.println("Fin del juego. Bye");
                break;
            }

            /**
             * Generar los valores de los dados
             */
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int total = dado1 + dado2;

            /**
             * Mostrar el resultado de los dados
             */
            System.out.println(jugadorActual.getNombre() + ", tus dados son: " + dado1 + " y " + dado2 + ".");

            // Evaluar el resultado del total de los dados
            switch (total) {
                case 2:
                    System.out.println(jugadorActual.getNombre() + ", ¡has perdido! Salió un " + total + " y tu apuesta será transferida a tu oponente.");
                    oponente.agregarDinero(jugadorActual.getDinero());
                    jugadorActual.setDinero(0);
                    break;

                case 12:
                    jugadorActual.agregarDinero(5000);
                    System.out.println("¡Enhorabuena " + jugadorActual.getNombre() + "! Salió un " + total + " y has ganado +$5000. Ahora tienes $" + jugadorActual.getDinero() + ".");
                    break;

                case 10:
                    jugadorActual.duplicarDinero();
                    oponente.dividirDinero();
                    System.out.println("¡Enhorabuena " + jugadorActual.getNombre() + "! Salió un " + total + " y tu apuesta se ha duplicado. Ahora tienes $" + jugadorActual.getDinero() + ".");
                    break;

                case 7:
                    jugadorActual.dividirDinero();
                    oponente.duplicarDinero();
                    System.out.println("¡Qué mal! " + jugadorActual.getNombre() + ", salió un " + total + " y tu apuesta se dividió y la de tu oponente se duplicó. Ahora tienes $" + jugadorActual.getDinero() + ".");
                    break;

                default:
                    System.out.println("No ocurre nada especial con ese número.");
                    break;
            }

            // Cambiar de turno
            turnoJugador1 = !turnoJugador1;

            /**
             * Verificar si alguien ha ganado o perdido
             */
            if (jugador1.getDinero() >= 10000) {
                System.out.println(jugador1.getNombre() + " ha ganado el juego con $10000!");
                break;
            } else if (jugador2.getDinero() >= 10000) {
                System.out.println(jugador2.getNombre() + " ha ganado el juego con $10000!");
                break;
            } else if (jugador1.getDinero() <= 0) {
                System.out.println(jugador1.getNombre() + " se ha quedado sin dinero. " + jugador2.getNombre() + " gana.");
                break;
            } else if (jugador2.getDinero() <= 0) {
                System.out.println(jugador2.getNombre() + " se ha quedado sin dinero. " + jugador1.getNombre() + " gana.");
                break;
            }
        }//Fin del while
    }//Fin de main
}//Fin de Jugador