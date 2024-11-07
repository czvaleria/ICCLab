import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que representa un bestiario de monstruos.
 * Permite al usuario seleccionar un monstruo para aprender más sobre él.
 */
public class Bestiario {

    /**
     * Método principal que ejecuta el programa del bestiario.
     * Muestra un menú de selección de monstruos y maneja la entrada del usuario.
     * El programa se mantiene en un bucle hasta que el usuario elige salir.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int seleccion = 0;

        do {
            System.out.println("-------- BESTIARIO --------");
            System.out.println("¿De qué monstruo quieres aprender?");
            System.out.println("[1] Zombie" + "\n [2] Vampiro"
                    + "\n [3] Poltergeist" + "\n [4] Momia"
                    + "\n [5] Hombre Lobo" + "\n [6] Frankenstein"
                    + "\n [7] La Parca" + "\n [8] Bruja"
                    + "\n [9] Alienígena" + "\n [10] Chupacabras"
                    + "\n [11] Jinete sin Cabeza" + "\n [12] Troll"
                    + "\n [13] Monstruo del Pantano"
                    + "\n [0] Salir");

            try {
                System.out.print("Ingresa tu selección: ");
                seleccion = entrada.nextInt();

                switch (seleccion) {
                    case 0:
                        System.out.println("Feliz Halloween");
                        break;

                    case 1:
                        Zombie zombie = new Zombie();
                        System.out.println(zombie);
                        zombie.descripcion();
                        zombie.locacion();
                        zombie.debilidad();
                        zombie.mordida();
                        zombie.generar();
                        zombie.datoHistorico();
                        System.out.println("- Especificaciones:");
                        zombie.pudrirse();
                        zombie.gruñir();
                        break;

                    case 2:
                        Vampiro vampiro = new Vampiro();
                        System.out.println(vampiro);
                        vampiro.descripcion();
                        vampiro.locacion();
                        vampiro.debilidad();
                        vampiro.hostilidad();
                        vampiro.mordida();
                        vampiro.generar();
                        vampiro.datoHistorico();
                        System.out.println("- Especificaciones:");
                        vampiro.transformarseEnMurcielago();
                        vampiro.hipnotizarVictima();
                        break;

                    case 3:
                        Poltergeist poltergeist = new Poltergeist();
                        System.out.println(poltergeist);
                        poltergeist.descripcion();
                        poltergeist.locacion();
                        poltergeist.debilidad();
                        poltergeist.hostilidad();
                        poltergeist.mordida();
                        poltergeist.generar();
                        poltergeist.datoHistorico();
                        System.out.println("- Especificaciones:");
                        poltergeist.moverObjetos();
                        poltergeist.hacerRuido();
                        break;

                    case 4:
                        Momia momia = new Momia();
                        System.out.println(momia);
                        momia.descripcion();
                        momia.locacion();
                        momia.debilidad();
                        momia.hostilidad();
                        momia.mordida();
                        momia.generar();
                        momia.datoHistorico();
                        System.out.println("- Especificaciones:");
                        momia.maldecir();
                        momia.renovarVendajes();
                        break;

                    case 5:
                        HombreLobo hombreLobo = new HombreLobo();
                        System.out.println(hombreLobo);
                        hombreLobo.descripcion();
                        hombreLobo.locacion();
                        hombreLobo.debilidad();
                        hombreLobo.hostilidad();
                        hombreLobo.mordida();
                        hombreLobo.generar();
                        hombreLobo.datoHistorico();
                        System.out.println("- Especificaciones:");
                        hombreLobo.serVeloz();
                        hombreLobo.aullar();
                        break;

                    case 6:
                        Frankenstein frankenstein = new Frankenstein();
                        System.out.println(frankenstein);
                        frankenstein.descripcion();
                        frankenstein.locacion();
                        frankenstein.debilidad();
                        frankenstein.hostilidad();
                        frankenstein.mordida();
                        frankenstein.generar();
                        frankenstein.datoHistorico();
                        System.out.println("- Especificaciones:");
                        frankenstein.presencia();
                        frankenstein.busca();
                        break;

                    case 7:
                        LaParca laParca = new LaParca();
                        System.out.println(laParca);
                        laParca.descripcion();
                        laParca.locacion();
                        laParca.debilidad();
                        laParca.hostilidad();
                        laParca.mordida();
                        laParca.generar();
                        laParca.datoHistorico();
                        System.out.println("- Especificaciones:");
                        laParca.presencia();
                        laParca.presagio();
                        break;

                    case 8:
                        Bruja bruja = new Bruja();
                        System.out.println(bruja);
                        bruja.descripcion();
                        bruja.locacion();
                        bruja.debilidad();
                        bruja.hostilidad();
                        bruja.mordida();
                        bruja.generar();
                        bruja.datoHistorico();
                        System.out.println("- Especificaciones:");
                        bruja.ataque();
                        bruja.esparcirConocimiento();
                        break;

                    case 9:
                        Alienigena alien = new Alienigena();
                        System.out.println(alien);
                        alien.descripcion();
                        alien.locacion();
                        alien.debilidad();
                        alien.hostilidad();
                        alien.mordida();
                        alien.generar();
                        alien.datoHistorico();
                        System.out.println("- Especificaciones:");
                        alien.analizarHumano();
                        alien.teletransportarse();
                        break;

                    case 10:
                        Chupacabras chupacabras = new Chupacabras();
                        System.out.println(chupacabras);
                        chupacabras.descripcion();
                        chupacabras.locacion();
                        chupacabras.debilidad();
                        chupacabras.hostilidad();
                        chupacabras.mordida();
                        chupacabras.generar();
                        chupacabras.datoHistorico();
                        System.out.println("- Especificaciones:");
                        chupacabras.succionarSangre();
                        chupacabras.emitirSonido();
                        break;

                    case 11:
                        JineteSinCabeza jineteSinCabeza = new JineteSinCabeza();
                        System.out.println(jineteSinCabeza);
                        jineteSinCabeza.descripcion();
                        jineteSinCabeza.locacion();
                        jineteSinCabeza.debilidad();
                        jineteSinCabeza.hostilidad();
                        jineteSinCabeza.mordida();
                        jineteSinCabeza.generar();
                        jineteSinCabeza.datoHistorico();
                        System.out.println("- Especificaciones:");
                        jineteSinCabeza.tomarCabeza();
                        jineteSinCabeza.aparecerse(); 
                        break;

                    case 12:
                        Troll troll = new Troll();
                        System.out.println(troll);
                        troll.descripcion();
                        troll.locacion();
                        troll.debilidad();
                        troll.hostilidad();
                        troll.mordida();
                        troll.generar();
                        troll.datoHistorico();
                        System.out.println("- Especificaciones:");
                        troll.lanzarRocas();
                        troll.romperCosas(); 
                        break; 

                    case 13:
                        MonstruoPantano pantano = new MonstruoPantano();
                        System.out.println(pantano);
                        pantano.descripcion();
                        pantano.locacion();
                        pantano.debilidad();
                        pantano.hostilidad();
                        pantano.mordida();
                        pantano.generar();
                        pantano.datoHistorico();
                        System.out.println("- Especificaciones:");
                        pantano.nadar();
                        pantano.ocultarse(); 
                        break; 

                    default:
                        System.out.println("Selección no válida. Inténtalo de nuevo.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor, ingresa un número.");
                entrada.next(); // Limpiar el scanner
            }

        } while (seleccion != 0); // El bucle se detendrá cuando se seleccione '0' para salir

        entrada.close();
    }
}
