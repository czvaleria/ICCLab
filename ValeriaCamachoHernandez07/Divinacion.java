import java.util.Random;

/**
 * La clase Divinacion simula una adivinación de cartas de tarot.
 * Cada carta tiene un significado y una recomendación para el jugador.
 * Para esta práctica solo ocuparemos las 22 cartas principales.
 */
public class Divinacion{
    /**
     * Este es el método principal, que está declarado con main, que se ejecuta al iniciar el programa.
     * Genera un índice aleatorio para seleccionar una carta del tarot y muestra su significado.
     * @param args Argumentos de línea de comandos, no se utilizan en este programa.
     */
public static void main(String[] args){
    
        /**
         * Este arreglo de tipo String contiene las cartas del tarot.
         * Cada elemento del arreglo representa una carta con su significado y una pequneña recomendación.
         */
        String[] cartas = {
            "El Loco. Significa nuevos comienzos y cambios importantes. Te recomiendo que te atrevas a tomar el primer paso.",
            "El Mago. Significa habilidad, recursos y auto-confianza. Te recomiendo que uses tus talentos con sabiduría.",
            "La Sacerdotisa. Significa intuición, sabiduría oculta y misterios. Te recomiendo que confíes en tu intuición.",
            "La Emperatriz. Significa abundancia, fertilidad y creatividad. Te recomiendo que cultives tus proyectos con amor.",
            "El Emperador. Significa autoridad, estructura y control. Te recomiendo que seas firme en tus decisiones.",
            "El Sacerdote. Significa tradición, conformidad y educación. Te recomiendo que encuentres fortaleza en la guía.",
            "Los Amantes. Significa amor, decisiones y unión. Te recomiendo que pienses en las implicaciones de cada elección.",
            "El Carro. Significa determinación, éxito y voluntad. Te recomiendo que vayas por tus objetivos.",
            "La Fuerza. Significa valor, paciencia y control interno. Te recomiendo que encuentres fuerza dentro de ti.",
            "El Ermitaño. Significa búsqueda interna y guía espiritual. Te recomiendo que te tomes tiempo para reflexionar.",
            "La Rueda de la Fortuna. Significa cambio, suerte y ciclos de la vida. Te recomiendo que aceptes el cambio.",
            "La Justicia. Significa verdad, equidad y decisiones. Te recomiendo que busques el equilibrio en tus actos.",
            "El Colgado. Significa sacrificio, nuevas perspectivas y espera. Te recomiendo que mires las cosas desde otro ángulo.",
            "La Muerte. Significa transformación, cambio y nuevos comienzos. Te recomiendo que busques nuevas oportunidades.",
            "La Templanza. Significa equilibrio, moderación y armonía. Te recomiendo que busques la paz en la moderación.",
            "El Diablo. Significa adicciones, materialismo y ataduras. Te recomiendo que rompas con lo que te encadena.",
            "La Torre. Significa caos, revelaciones y cambio repentino. Te recomiendo que aprendas del caos y sigue adelante.",
            "La Estrella. Significa esperanza, inspiración y renovación. Te recomiendo que te mantengas la fe en el futuro.",
            "La Luna. Significa ilusiones, intuición y confusión. Te recomiendo que no tomes decisiones en la oscuridad.",
            "El Sol. Significa éxito, felicidad y vitalidad. Te recomiendo que disfrutes de los frutos de tu trabajo.",
            "El Juicio. Significa reflexión, despertar y nuevos comienzos. Te recomiendo que aprendas de tus experiencias pasadas.",
            "El Mundo. Significa logro, realización y cierre de ciclos. Te recomiendo que celebres tu éxito y comparte tu sabiduría."
        };
        
        /**
         * Creo un objeto Random para generar un número aleatorio que corresponde a una carta según su índice.
         */
        Random aleatorio = new Random();
        int indiceAleatorio = aleatorio.nextInt(cartas.length);

        /*
         * Se muestra la carta seleccionada aleatoriamente al usuario
         */
        System.out.println("Increíbe, no lo puedo creer, tu carta es: " + cartas[indiceAleatorio]);
    }    
}