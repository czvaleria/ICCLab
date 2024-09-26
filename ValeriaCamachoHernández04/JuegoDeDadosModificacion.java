import java.util.Random;
import java.util.Scanner;

public class JuegoDeDadosModificacion {

    public static void main(String[] args) {
        // Estos son mis objetos
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        // Estas son las variables
        String jugador1, jugador2, enter;
        int apuestaJugador1 = 5000, apuestaJugador2 = 5000;
        boolean turnoJugador1 = true;

        System.out.println("JUEGO DE DADOS");

        // Ingresar nombre de los jugadores
        System.out.println("Jugador 1, ingrese su nombre:");
        jugador1 = entrada.nextLine();

        System.out.println("Jugador 2, ingrese su nombre:");
        jugador2 = entrada.nextLine();

        // Ciclo principal
        while (apuestaJugador1 > 0 && apuestaJugador2 > 0 && apuestaJugador1 < 10000 && apuestaJugador2 < 10000) {
            // Determinar quién está jugando en este turno
            String jugadorActual;
            int dineroActual, dineroOponente;
            
            if (turnoJugador1) {
                jugadorActual = jugador1;
                dineroActual = apuestaJugador1;
                dineroOponente = apuestaJugador2;
            } else {
                jugadorActual = jugador2;
                dineroActual = apuestaJugador2;
                dineroOponente = apuestaJugador1;
            }

            // Comienza el turno
            System.out.println("Presiona Enter para tirar los dados o '-' para salir.");
            enter = entrada.nextLine();

            // Terminar el juego si se ingresa un "-"
            if (enter.equals("-")) {
                System.out.println("Fin del juego. Bye");
                break;
            }

            // Generar los valores de los dados
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int total = dado1 + dado2;

            // Mostrar el resultado de los dados
            System.out.println(jugadorActual + ", tus dados son: " + dado1 + " y " + dado2 + ".");

            // Evaluar el resultado del total de los dados
            switch (total) {
                case 2:
                    System.out.println(jugadorActual + ", ¡has perdido!. Salió un " + total + " y tu apuesta será transferida al tu oponente.");
                    dineroOponente += dineroActual;
                    dineroActual = 0;
                    break;

                case 12:
                    dineroActual += 5000;
                    System.out.println("¡Enhorabuena " + jugadorActual + "! Salión un " + total + " y has ganado +$5000. Ahora tienes $" + dineroActual + ".");
                    break;

                case 10:
                    dineroActual *= 2;
                    dineroOponente /= 2;
                    System.out.println("¡Enhorabuena " + jugadorActual + "! Salió un " + total + " y tu apuesta se ha duplicado. Ahora tienes $" + dineroActual + ".");
                    break;

                case 7:
                    dineroActual /= 2;
                    dineroOponente *= 2;
                    System.out.println("¡Que mal! " + jugadorActual + ", salió un " + total + " y tu apuesta se dividió y el de tu oponente se duplicó. Ahora tienes $" + dineroActual + ".");
                    break;

                default:
                    System.out.println("¡Uy! No ocurre nada especial con ese número. Intentalo de nuevo con otra ronda.");
                    break;
            }

            //Actualizar las cantidades de dinero
            if (turnoJugador1) {
                apuestaJugador1 = dineroActual;
                apuestaJugador2 = dineroOponente;
            } else {
                apuestaJugador2 = dineroActual;
                apuestaJugador1 = dineroOponente;
            }

            //Cambiar de turno. Se van a ir turnando los jugadores 1 y 1
            turnoJugador1 = !turnoJugador1;

            //Verificar si alguien ha ganado o perdido
            if (apuestaJugador1 >= 10000) {
                System.out.println(jugador1 + " ha ganado el juego con $10000!");
                break;
            } else if (apuestaJugador2 >= 10000) {
                System.out.println(jugador2 + " ha ganado el juego con $10000!");
                break;
            } else if (apuestaJugador1 <= 0) {
                System.out.println(jugador1 + " se ha quedado sin dinero. " + jugador2 + " gana.");
                break;
            } else if (apuestaJugador2 <= 0) {
                System.out.println(jugador2 + " se ha quedado sin dinero. " + jugador1 + " gana.");
                break;
            }
        }
    }
}