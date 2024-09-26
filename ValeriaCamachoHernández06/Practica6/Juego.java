package Practica6;

/**
 * La clase Juego sirve para iniciar el juego Pokémon donde entrenadores se enfrentan en batallas, por eso es nuestro main
 * 
 * @author Valeria Camacho Hernández, Diego Alexander Cisneros Tenorio y Camila Hernández Huchin 
 */
public class Juego {

    public static void main(String[] args) {
        //Se crean tres objetos Entrenador con sus respectivos Pokémon. En este caso somos nosotros mismos
        Entrenador camila, valeria, diego;

        // Definir de tipos de Pokémon con sus debilidades y fortalezas. Para mejor manejo son Strings
		//Fuego
        String fuego = "Fuego";
        String debFue = "Agua, Tierra, Roca";
        String fortFue = "Planta, Hielo, Bicho, Acero";

        //Agua
		String agua = "Agua";
        String debAgu = "Eléctrico, Planta";
        String fortAgu = "Fuego, Tierra, Roca";

        //Fantasma
		String fantasma = "Fantasma";
        String debFan = "Siniestro, Fantasma";
        String fortFan = "Fantasma, Psíquico";

        //Tierra
		String tierra = "Tierra";
        String debTie = "Agua, Planta, Hielo";
        String fortTie = "Fuego, Eléctrico, Veneno, Roca, Acero";

        //Lucha
		String lucha = "Lucha";
        String debLuc = "Volador, Psíquico, Hada";
        String fortLuc = "Normal, Hielo, Roca, Siniestro, Acero";

        //Planta
		String planta = "Planta";
        String debPla = "Bicho, Volador, Veneno, Hielo, Fuego";
        String fortPla = "Agua, Tierra, Roca";

        //Siniestro
		String siniestro = "Siniestro";
        String debSin = "Lucha, Bicho, Hada";
        String fortSin = "Psíquico, Fantasma";

        //Psiquico
		String psiquico = "Psíquico";
        String debPsi = "Fantasma, Bicho, Siniestro";
        String fortPsi = "Lucha, Veneno";

        //Electrico
		String electrico = "Eléctrico";
        String roca = "Roca"; 

        // Crear los objetos Ataque con nombre y tipo de ataque
        Ataque Isoaqua = new Ataque("Isoaqua", agua);
        Ataque Golpe_Karate = new Ataque("Golpe Karate", lucha);
        Ataque Latigo_Cepa = new Ataque("Látigo Cepa", planta);
        Ataque Terremoto = new Ataque("Terremoto", tierra);
        Ataque Colmillo_igneo = new Ataque("Colmillo Ígneo", fuego);
        Ataque Rayo_confuso = new Ataque("Rayo Confuso", fantasma);
        Ataque Hidrobomba = new Ataque("Hidrobomba", agua);
        Ataque Lanzallamas = new Ataque("Lanzallamas", fuego);
        Ataque Latigazo = new Ataque("Latigazo", planta);
        Ataque Rayo_solar = new Ataque("Rayo Solar", planta);
        Ataque Evite_igneo = new Ataque("Evite Ígneo", fuego);
        Ataque Fuerza_bruta = new Ataque("Fuerza Bruta", lucha);
        Ataque Juego_sucio = new Ataque("Juego Sucio", siniestro);
        Ataque Acuacola = new Ataque("Acuacola", agua);
        Ataque Puno_trueno = new Ataque("Puño Trueno", electrico);

        //Crear los objetos que representan los tipos de Pokémon
        Tipo Fuego = new Tipo(fuego, debFue, fortFue);
        Tipo Agua = new Tipo(agua, debAgu, fortAgu);
        Tipo Fantasma = new Tipo(fantasma, debFan, fortFan);
        Tipo Tierra = new Tipo(tierra, debTie, fortTie);
        Tipo Lucha = new Tipo(lucha, debLuc, fortLuc);
        Tipo Planta = new Tipo(planta, debPla, fortPla);
        Tipo Siniestro = new Tipo(siniestro, debSin, fortSin);
        Tipo Psiquico = new Tipo(psiquico, debPsi, fortPsi);

        // Crear los Pokémonpnes que van a jugar, con su nombre, tipo y ataque
		//Estos son del Entrenador 1
        Pokemon Arcanine = new Pokemon("Arcanine", Fuego, Colmillo_igneo);
        Pokemon Omastar = new Pokemon("Omastar", Agua, Isoaqua);
        Pokemon Gengar = new Pokemon("Gengar", Fantasma, Rayo_confuso);
        Pokemon Machamp = new Pokemon("Machamp", Lucha, Golpe_Karate);
        Pokemon Rhydon = new Pokemon("Rhydon", Tierra, Terremoto);
        Pokemon Victreebel = new Pokemon("Victreebel", Planta, Latigo_Cepa);
		
		//Estos son del Entrenador 2
        Pokemon Infernape = new Pokemon("Infernape", Fuego, Lanzallamas);
        Pokemon Feraligatr = new Pokemon("Feraligatr", Agua, Hidrobomba);
        Pokemon Roserade = new Pokemon("Roserade", Planta, Latigazo);
        Pokemon Magmar = new Pokemon("Magmar", Fuego, Lanzallamas);
        Pokemon Meganium = new Pokemon("Meganium", Planta, Latigazo);
        Pokemon Politoed = new Pokemon("Politoed", Agua, Hidrobomba);

		//Estos son del Entrenador 3
        Pokemon Shaymin = new Pokemon("Shaymin", Planta, Rayo_solar);
        Pokemon Vulpix = new Pokemon("Vulpix", Fuego, Evite_igneo);
        Pokemon Mashadow = new Pokemon("Mashadow", Fantasma, Fuerza_bruta);
        Pokemon Zorva = new Pokemon("Zorva", Siniestro, Juego_sucio);
        Pokemon Milotic = new Pokemon("Milotic", Agua, Acuacola);
        Pokemon Gardevoir = new Pokemon("Gardevoir", Psiquico, Puno_trueno);

        //Se crean los entrenadores con sus equipos de seis pokemones
        camila = new Entrenador("Camila", Shaymin, Vulpix, Mashadow, Zorva, Milotic, Gardevoir);
        valeria = new Entrenador("Valeria", Infernape, Feraligatr, Roserade, Magmar, Meganium, Politoed);
        diego = new Entrenador("Diego", Omastar, Gengar, Machamp, Rhydon, Victreebel, Arcanine);

        //Se hacen las batallas. Como somos 3, el Entrenador 1 (diego) participará en 2 peleas.
        System.out.println("\nBatalla 1\n");
        camila.pelear(diego);
        System.out.println("\nBatalla 2\n");
        diego.pelear(valeria);
    }//Fin del main
}//Fin de Juego