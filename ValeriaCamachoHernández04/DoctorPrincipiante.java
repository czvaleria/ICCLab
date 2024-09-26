import java.util.Scanner;

public class DoctorPrincipiante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declarar variables
        String nombre, padecimientos, causantes;
        int peso, edad;

        // Solicitar nombre
        System.out.println("Doctor");
        System.out.println("Buen día. ¿Cuál es su nombre?");
        nombre = entrada.nextLine();

        // Solicitar edad
        System.out.println("¿Qué edad tiene?");
        edad = entrada.nextInt();
        entrada.nextLine();

        // Evaluar la edad
        if (edad > 75) {
            System.out.println("Primeramente, le recomiendo 'La Siempre Viva', una funeraria con promociones por todo este mes del abuelo.");
        } else if (edad < 18) {
            System.out.println("Lo voy a atender, pero le recomiendo un pediatra.");
        }

        // Solicitar peso
        System.out.println("¿Cuánto pesa?");
        peso = entrada.nextInt();
        entrada.nextLine();

        // Evaluar el peso
        if (peso < 50) {
            System.out.println("Cerca de aquí están los tacos 'Don Sucio', también le voy a recomendar que vaya por unos.");
        } else if (peso > 150) {
            System.out.println("También le voy a recomendar que haga la dieta de la papaya.");
        }

        // Solicitar padecimientos
        System.out.println("Pero dígame, ¿a qué vino a consulta?");
        padecimientos = entrada.nextLine();

        // Solicitar causantes
        System.out.println("Mmmmmm... Ya veo, dígame ¿Qué hizo para padecer sus padecimientos de " +padecimientos + "?, ¿por qué cree que está enfermo?");
        causantes = entrada.nextLine();

        // Resultado final
        System.out.println("Comprendo, suele suceder. Ya para finalizar, porque tengo más pacientes esperándome afuera, le voy a recetar un Paracetamol cada 8 horas.");

    }
}

