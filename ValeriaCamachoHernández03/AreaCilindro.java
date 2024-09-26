import java.util.Scanner;
// 0. Importa las clases necesarias de Java para leer lo que el usuario escribe.

public class AreaCilindro {
    public static void main(String[] args){
    
        // 1. Declarar las variables que voy a usar.
        double radio, altura, area;
        final double pi = Math.PI;        
        
        // 2. Construir los objetos
        Scanner entrada = new Scanner(System.in);
        /* Este objeto 'Scanner', con nombre 'entrada', leerá lo que el usuario ingrese como texto, y le doy esa instrucción con 'System.in'. */
        
        // 3. Darle comportamiento a los objetos
        System.out.println("Calcular área de un cilindro");
        System.out.println(" ");
        
        // 3.2 Pedirle sus datos al usuario
        System.out.println("Ingrese el radio de la base del cilindro:");
        radio = entrada.nextDouble();
        
        System.out.println("Ingrese la altura del cilindro:");
        altura = entrada.nextDouble();
        
        System.out.println(" ");
        
        // 4. Calcular el área
        //4.1 Calcular el área de la base
        double areaBase = 2 * pi * radio * radio;
        
        //4.2 Calcular el área de los lados
        double areaLados = 2 * pi * radio * altura;
        
        //4.3 Calcular el área total
        area = areaBase + areaLados;
     
        // 5. Mostrar el resultado
        System.out.println("Las medidas que ingresaste fueron:");
        System.out.println("- Radio: " + radio);
        System.out.println("- Altura: " + altura);
        System.out.println(" ");
        System.out.println("Para el área del cilindro, primero se calculó el área de la base, que es: " + areaBase + ", y luego el área de los lados: " + areaLados);
        System.out.println(" ");
        System.out.println("Así, el área del cilindro es: " + area);
    }
}

