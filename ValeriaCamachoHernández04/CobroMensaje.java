// Importar los paquetes necesarios de la biblioteca de Java. 
import java.util.Scanner;

public class CobroMensaje {	
    public static void main(String[] args) {
	
        // 1. Declarar lo que voy a usar como variables.
        String usuario, destinatario, mensaje, confirmacion;
        String mensajeModificado = "";  
        // Declaro mensajeModificado vacío para almacenar el mensaje con las letras cambiadas.
	
        // 2. Construir los objetos
        Scanner entrada = new Scanner(System.in);
	
        // 3. Darle comportamiento a los objetos
        // 3.1 Bienvenida al programa
        System.out.println("Cobrador de mensajes");
	
        // 3.2 Pedirle su nombre al usuario
        System.out.println("Ingresa tu nombre:");
        usuario = entrada.nextLine();
	
        // 3.3 Pedirle el destinatario al usuario
        System.out.println("Ingresa el nombre del destinatario:");
        destinatario = entrada.nextLine();
	
        // 3.4 Pedirle el mensaje al usuario
        System.out.println("Ingresa el mensaje que quieres enviar:");
        mensaje = entrada.nextLine();
	
        // 3.5 Contar las letras del mensaje
        int numeroDeLetras = mensaje.length();
	
        // 3.6 Cobrar las letras (3 pesos)
        int costo = (mensaje.length() * 3);
	
        // 3.7 Pedir confirmación
        System.out.println("Tu mensaje de " + numeroDeLetras + " letras va a costar $" + costo + " pesos, ¿deseas continuar?");
        confirmacion = entrada.nextLine();
        
        
        // 3.8 Modificar el mensaje
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (caracter == 'a') {
                mensajeModificado += 'i';
            } else if (caracter == 'A') {
                mensajeModificado += 'I';
            } else {
                mensajeModificado += caracter;
            }
        }
        // 4. Imprimir
        if (confirmacion.equalsIgnoreCase("Si")) {
            System.out.println("Mensaje enviado con éxito:D ");
        } else {
            System.out.println("Querida/o " + usuario + ", sin dinero no podemos enviar tu mensaje: " + mensajeModificado);
        }
    }
}


        


