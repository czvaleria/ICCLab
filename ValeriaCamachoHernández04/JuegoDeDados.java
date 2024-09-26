import java.util.Random;
import java.util.Scanner;

public class JuegoDeDados {

    public static void main(String[] args) {
        // Estos son mis objetos
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        // Estas son mis variables
        String jugador, enter;
        int apuesta;

        System.out.println("JUEGO DE DADOS");

        System.out.println("Ingrese un nombre de usuario");
        jugador = entrada.nextLine();

        System.out.println("¿Cuanto quieres apostar, " + jugador + "?");
        apuesta = entrada.nextInt();
        entrada.nextLine();

        while (apuesta != 0) {
            // Verifica si la apuesta es válida (mayor que 0 y menor que 10000)
            if (apuesta > 0 && apuesta < 10000) {
                System.out.println("¡Vamos a jugar! Presiona enter para tirar los dados o - para salir.");
                enter = entrada.nextLine();

                // Generar los valores de los dados
                int dado1 = random.nextInt(6) + 1;
                int dado2 = random.nextInt(6) + 1;
                int total = dado1 + dado2;

                // El programa termina cuando se ingresa un "-"
                if (enter.equals("-")) {
                    System.out.println("Fin del juego. Bye");
                    break;
                }

                if (enter.equals("")) {
                    System.out.println(jugador + ", tus dados son: " + dado1 + " y " + dado2 + ".");
                }

                // Evaluar el resultado de los dados
                switch (total) {
                    case 2:
                        System.out.print(jugador + ", ¡has perdido! Salió un " + total + ".");
                        break;

                    case 12:
                        apuesta = apuesta + 5000;
                        System.out.print("¡Enhorabuena, " + jugador + "! Salió un " + total + " y has ganado +5000. Ahora tienes " + apuesta + ".");
                        break;

                    case 10:
                        apuesta = apuesta * 2;
                        System.out.print("¡Enhorabuena! Salió un " + total + " y tu apuesta se ha duplicado. Ahora tienes " + apuesta + ".");
                        break;

                    case 7:
                        apuesta = apuesta / 2;
                        System.out.print("¡Que mal! Salió un " + total + " y tu apuesta se dividirá en 2, " + jugador + ". Ahora tienes " + apuesta + ".");
                        break;

                    default:
                        System.out.print("¡Uy! No ocurre nada especial con ese número. Intentalo de nuevo con otra ronda, " + jugador + ".");
                        break;
                }
            } else {
                // Mensaje cuando la apuesta es inválida
                System.out.println("Debes ingresar una cantidad mayor a cero y menor a 10000.");
                System.out.println("¿Cuanto quieres apostar, " + jugador + "?");
                apuesta = entrada.nextInt();
            }

            // Terminar el juego cuando la apuesta llega a 0 o menos
            if (apuesta <= 0) {
                System.out.println("¡Ya no tienes dinero con que jugar, " + jugador + ". Fin del juego. Bye, " + jugador + ".");
                break;
            }
        }
    }
