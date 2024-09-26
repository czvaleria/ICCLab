package Practica6;

import java.util.Random;

/**
 * La clase Entrenador representa un entrenador de Pokémon que puede tener hasta seis Pokémon
 * y enfrentarse a otros entrenadores en batallas Pokémon.
 * 
 * @author Camila Hernández Huchin
 */
public class Entrenador {
    // Generador de números aleatorios para seleccionar un Pokémon al azar.
    Random random = new Random();

    // Nombre del entrenador.
    private String nombre;

    // Los seis Pokémon de cada entrenador.
    Pokemon uno, dos, tres, cua, cin, sei, poke;

    /**
     * Método constructor que inicializa un objeto Entrenador con su nombre y seis Pokémon.
     * @param nombre El nombre del entrenador.
     * @param uno El primer Pokémon.
     * @param dos El segundo Pokémon.
     * @param tres El tercer Pokémon.
     * @param cua El cuarto Pokémon.
     * @param cin El quinto Pokémon.
     * @param sei El sexto Pokémon.
     */
    public Entrenador(String nombre, Pokemon uno, Pokemon dos, Pokemon tres, Pokemon cua, Pokemon cin, Pokemon sei) {
        this.nombre = nombre;
        this.uno = new Pokemon(uno);
        this.dos = new Pokemon(dos);
        this.tres = new Pokemon(tres);
        this.cua = new Pokemon(cua);
        this.cin = new Pokemon(cin);
        this.sei = new Pokemon(sei);
    }

    /**
     * Devuelve el nombre del entrenador.
     * @return Retorna el nombre del entrenador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Selecciona un Pokémon al azar entre los seis del entrenador.
     * @return Retorna Pokémon seleccionado al azar.
     */
    public Pokemon elegirPoke() {
        // Genera un número aleatorio entre 1 y 6 para elegir un Pokémon.
        int num = random.nextInt(6) + 1;
        switch (num) {
            case 1:
                poke = uno;
                break;
            case 2:
                poke = dos;
                break;
            case 3:
                poke = tres;
                break;
            case 4:
                poke = cua;
                break;
            case 5:
                poke = cin;
                break;
            case 6:
                poke = sei;
                break;
            default:
                // Si ocurre algún error, se retorna un Pokémon vacío.
                poke = new Pokemon();
        }
        return poke;
    }//Fin de elegirPoke

    /**
     * Realiza una batalla entre este entrenador y otro entrenador.
     * Se selecciona un Pokémon de cada entrenador de manera aleatoria y se realiza la pelea entre ellos
     * @param entrenador Es el entrenador oponente que tiene al pokemon oponente
     */
    public void pelear(Entrenador entrenador) {
        // Selecciona un Pokémon para cada entrenador
        Pokemon poke1 = new Pokemon(this.elegirPoke());
        Pokemon poke2 = new Pokemon(entrenador.elegirPoke());

        // Imprime la información de la batalla
        System.out.println("Inicio de batalla");
        System.out.println("Entrenador " + this.getNombre() + " contra Entrenador " + entrenador.getNombre());
        System.out.println("Pokemones elegidos");
        System.out.println("Entrenador " + this.getNombre() + " pokemon " + poke1.getNombre());
        System.out.println("Entrenador " + entrenador.getNombre() + " pokemon " + poke2.getNombre());

        // Realiza la pelea entre los dos Pokémon seleccionados
        poke1.pelear(poke2);
        
        // Imprime el fin de la pelea
        System.out.println("Fin de la pelea");
    }//Fin de pelear
}//Fin de Entrenador