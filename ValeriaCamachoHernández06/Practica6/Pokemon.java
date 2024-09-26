package Practica6;

/**
 * La clase Pokemon representa un Pokémon con un nombre, tipo y ataque.
 * Incluye métodos para atacar, evaluar y pelear contra otros Pokémon usando los atributos mencionados.
 * 
 * @author Camila Hernández Huchin
 */
public class Pokemon{

    //Este es el nombre del Pokémon
    private String nombre;
    
    // Este es el tipo del Pokémon
    Tipo tipo;
    
    //Este es el ataque que hace el Pokémon
    Ataque ataque;

    /**
     * Método constructor que inicializa un Pokémon con un nombre, tipo y ataque.
     * @param nombre Es el nombre del Pokémon.
     * @param tipo Es el tipo del Pokémon.
     * @param ataque Es el ataque del Pokémon.
     */
    public Pokemon(String nombre, Tipo tipo, Ataque ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
    }

    /**
     * Método constructor vacío para inicializar un Pokémon sin atributos.
     */
    public Pokemon() {
    }

    /**
     * Método constructor que crea un Pokémon a partir de otro Pokémon.
     * @param poke Es el Pokémon del cual se "copian" los atributos.
     */
    public Pokemon(Pokemon poke) {
        this.nombre = poke.getNombre();
        this.tipo = poke.getTipo();
        this.ataque = poke.getAtaque();
    }

    /**
     * Obtiene el nombre del Pokémon.
     * @return Retorna el nombre del Pokémon.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la debilidad del tipo del Pokémon.
     * @return Retorna la debilidad del tipo del Pokémon.
     */
    public String getDeb() {
        return tipo.getDeb();
    }

    /**
     * Obtiene la fortaleza del tipo del Pokémon.
     * @return Retorna fortaleza del tipo del Pokémon.
     */
    public String getFort() {
        return tipo.getFort();
    }

    /**
     * Obtiene el tipo del Pokémon.
     * @return Retorna el tipo del Pokémon.
     */
    public Tipo getTipo(){
        return tipo;
    }
    /**
     * Obtiene el nombre del ataque del Pokémon.
     * @return Retorna el nombre del ataque.
     */
    public String getNomAtaque() {
        return ataque.getNombre();
    }

    /**
     * Obtiene el tipo del ataque del Pokémon.
     * @return Retorna el tipo del ataque.
     */
    public String getTAtaque() {
        return ataque.getTipo();
    }

    /**
     * Obtiene el ataque del Pokémon.
     * @return Retorna el ataque del Pokémon.
     */
    public Ataque getAtaque() {
        return ataque;
    } 

    /**
     * Método para evalúar la efectividad de un ataque según el tipo del Pokémon que sea el oponente.
     * @param pokemon Es el Pokémon oponente contra el cual se evalúa la efectividad.
     */
    public void evaluar(Pokemon pokemon) {
        String tipDeb = pokemon.getDeb();
        String tipFort = pokemon.getFort();
        if (tipDeb.contains(this.getTAtaque())) {
            System.out.println("¡Es Super Efectivo!");
        } else if (tipFort.contains(this.getTAtaque())) {
            System.out.println("No es muy efectivo...");
        } else {
            System.out.println("No pasó nada...");
        }
    }//Fin de evaluar

    /**
     * Método para atacar al Pokémon que sea el oponente. 
     * También imprime que ataque usa y quien es el pokemon.
     * @param pokemon El Pokémon oponente que será atacado.
     */
    public void atacar(Pokemon pokemon) {
        System.out.println(this.getNombre() + " ha usado " + this.getNomAtaque() + "!");
        this.evaluar(pokemon);
    }//Fin de atacar

    /**
     * Hace que este Pokémon pelee contra otro Pokémon.
     * @param pokemon El Pokémon oponente con el que se va a pelear.
     */
    public void pelear(Pokemon pokemon) {
        System.out.println("¡Vamos " + this.getNombre() + "!");
        System.out.println("¡Haz lo tuyo, " + pokemon.getNombre() + "!");
        this.atacar(pokemon);
        pokemon.atacar(this);
    }//Fin de pelear
}//Fin de Pokemon