import java.io.FileReader; // Para abrir el archivo
import java.io.IOException;
import java.io.BufferedReader; // Para leer el archivo
import java.io.File;

/**
 * CalculadoraArchivo es la principal para la calculadora que lee operaciones de un archivo que permite 
 * verificar la existencia de un archivo, leer su contenido línea por línea, y calcular el resultado de 
 * operaciones aritméticas básicas, no toma en cuenta numeros negativos. Además de las 2 excepciones pedi-
 * das, añadí otras excepciones para que fuera más robusto, pero no afectan a las que se pidieron.
 */
public class CalculadoraArchivo {

    /**
     * Este es el método principal que toma el nombre de un archivo como argumento desde la terminal, 
     * verifica su existencia, y calcula los resultados de operaciones aritméticas que se encuentren en cada línea.
     * @param entrada Nombre del archivo que contiene las operaciones.
     */
    public static void main(String[] entrada) {

        if (entrada.length == 0) {
            System.out.println("Debes ingresar correctamente el nombre del archivo que quieres que lea");
            return;
        }

        String archivo = entrada[0];

        try {
            // Primero verificamos que exista el archivo con una excepción checked
            ChecarExiste(archivo);
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            String linea;
            // Primero verificamos que haya contenido en el archivo
            while ((linea = lector.readLine()) != null) {
                System.out.println("El contenido en el archivo '" + archivo + "' es: " + linea);
                try {
                    System.out.println("Calculando resultado...");
                    System.out.println("Resultado: " + operar(linea));
                } catch (FormatoIncorrecto e) {
                    System.out.println(e.getMessage());
                } catch (OperadorNoValido e) {
                    System.out.println(e.getMessage());
                } catch (DividirPorCero e) {
                    System.out.println(e.getMessage());
                }
            } // Fin de while
            lector.close();
        } catch (NoEsta e) {
            System.out.println(e.getMessage());
        } catch (IOException ioe) {
            System.out.println("Error: No se puede leer el archivo");
        }
    } // Fin de main

    /**
     * Verifica si un archivo existe. Si no, lanza la excepción NoEsta.
     * @param archivo es el nombre del archivo a verificar.
     * @throws NoEsta es si el archivo no se encuentra en el sistema.
     */
    public static void ChecarExiste(String archivo) throws NoEsta {
        File file = new File(archivo);
        if (!file.exists()) {
            throw new NoEsta("Error: No existe el archivo que ingresaste. Asegúrate de que esté en la misma carpeta o que hayas escrito bien su nombre");
        }
    } // Fin de ChecarExiste

    /**
     * Realiza una operación aritmética (suma, resta, multiplicación o división) en
     * función de una cadena de texto. 
     * @param linea es la línea de texto con el formato "n1 operador n2" que viene en el archivo que me estan pasando.
     * @return es el resultado de la operación aritmética.
     * @throws FormatoIncorrecto es si la línea no está en el formato esperado.
     * @throws OperadorNoValido es si el operador no es +, -, * o /.
     * @throws DividirPorCero es si se intenta dividir por cero.
     */
    public static double operar(String linea) throws FormatoIncorrecto, OperadorNoValido, DividirPorCero {
        String[] elementos = linea.split(" ");

        if (elementos.length != 3) {
            throw new FormatoIncorrecto("Error: El formato es incorrecto. Debe ser 'n1 operador n2'");
        }

        double num1 = Double.parseDouble(elementos[0]);
        String op = elementos[1];
        double num2 = Double.parseDouble(elementos[2]);
        double resultado;

        switch (op) {
            case "+":
                resultado = (num1 + num2);
                break;

            case "-":
                resultado = (num1 - num2);
                break;

            case "*":
                resultado = (num1 * num2);
                break;

            case "/":
                if (num2 == 0) {
                    // UncheckedException de que se está tratando de dividir entre 0
                    throw new DividirPorCero("Error: Se está tratando de dividir entre cero.");
                }
                resultado = (num1 / num2);
                break;

            default:
                throw new OperadorNoValido("Error: El operador no es válido. Debe ser +, -, * o /");
        }
        return resultado;
    } // Fin de operar
} // Fin de CalculadoraArchivo
