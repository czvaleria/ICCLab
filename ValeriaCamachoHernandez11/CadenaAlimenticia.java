public class CadenaAlimenticia {

    public static void main(String [] args) {

        System.out.println("UN DÍA EN LA CADENA ALIMENTICIA EN EL DESIERTO...\n");

        Planta planta = new Planta();
        System.out.println("- Ser Vivo: Planta");
        planta.descripcion();
        planta.comoCome();
        planta.comer();
        planta.serPresa();
        System.out.println("\n");

        Grillo grillo = new Grillo();
        System.out.println("- Ser Vivo: Grillo");
        grillo.descripcion();
        grillo.comoCome();
        grillo.comer();
        grillo.cazar();
        grillo.serPresa();
        System.out.println("\n");

        Serpiente serpiente = new Serpiente();
        System.out.println("- Ser Vivo: Serpiente");
        serpiente.descripcion();
        serpiente.comoCome();
        serpiente.comer();
        serpiente.cazar();
        serpiente.serPresa();
        System.out.println("\n");

        Halcon halcon = new Halcon();
        System.out.println("- Ser Vivo: Halcón");
        halcon.descripcion();
        halcon.comoCome();
        halcon.comer();
        halcon.cazar();
        halcon.serPresa();
        System.out.println("\n");

        Coyote coyote = new Coyote();
        System.out.println("- Ser Vivo: Coyote");
        coyote.descripcion();
        coyote.comoCome();
        coyote.cazar();
        System.out.println("\n");

    } // Fin de main
    
} // Fin de CadenaAlimenticia