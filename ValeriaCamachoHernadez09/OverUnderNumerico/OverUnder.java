/**
 * Clase OverUnder que maneja la multiplicación de números en diferentes tipos de datos (byte, 
 * short, int) y maneja excepciones de Overflow y Underflow.
 */
public class OverUnder {
    
    /**
     * Método principal que recibe los argumentos desde la línea de comandos. 
     * Los ingresamos como java OverUnder tipoDato n1 n2
     * @param entrada Arreglo de String que contiene el tipo de dato y los números.
     */
    public static void main(String[] entrada) {
        
        if (entrada.length < 3 || entrada.length > 3) {
            System.out.println("Debes ingresar el tipo de dato y dos números, así: tipoDato n1 n2");
            return;
        }

        String tipoDato = entrada[0];
        String num1 = entrada[1];
        String num2 = entrada[2];

        try {
            switch (tipoDato.toLowerCase()) {
                case "byte":
                    byte num1Byte = Byte.parseByte(num1);
                    byte num2Byte = Byte.parseByte(num2);
                    byte resultadoByte = multiplicar(num1Byte, num2Byte);
                    System.out.println("Ingresaste los números " + entrada[1] + " y " + entrada[2] +
                                        ". El resultado es: " + resultadoByte);
                    break;

                case "short":
                    short num1Short = Short.parseShort(num1);
                    short num2Short = Short.parseShort(num2);
                    short resultadoShort = multiplicar(num1Short, num2Short);
                    System.out.println("Ingresaste los números " + entrada[1] + " y " + entrada[2] + 
                                        ". El resultado es: " + resultadoShort);
                    break;

                case "int":
                    int num1Int = Integer.parseInt(num1);
                    int num2Int = Integer.parseInt(num2);
                    int resultadoInt = multiplicar(num1Int, num2Int);
                    System.out.println("Ingresaste los números " + entrada[1] + " y " + entrada[2] +
                                        ". El resultado es: " + resultadoInt);
                    break;

                default:
                    System.out.println("El tipo de dato que ingresaste no es válido, se usará int.");
                    int num1Default = Integer.parseInt(num1);
                    int num2Default = Integer.parseInt(num2);
                    int resultadoDefault = multiplicar(num1Default, num2Default);
                    System.out.println("Ingresaste los números " + entrada[1] + " y " + entrada[2] +
                                        ". El resultado es: " + resultadoDefault);
                    break;
            }
        } catch (ByteOverEx | ByteUnderEx e) {
            System.out.println(e.getMessage());
            // Se hace el cambio de tipo de dato si es overflow o underflow
            // Volvemos a repetir el switch pero ahora cambiándolo según la excepción
            try {
                switch (tipoDato.toLowerCase()) {
                    case "byte":
                        short num1Short = Short.parseShort(num1);
                        short num2Short = Short.parseShort(num2);
                        short resultadoShort = multiplicar(num1Short, num2Short);
                        System.out.println("El resultado es: " + resultadoShort);
                        break;

                    case "short":
                        int num1Int = Integer.parseInt(num1);
                        int num2Int = Integer.parseInt(num2);
                        int resultadoInt = multiplicar(num1Int, num2Int);
                        System.out.println("El resultado es: " + resultadoInt);
                        break;

                    case "int":
                        long num1Long = Long.parseLong(num1);
                        long num2Long = Long.parseLong(num2);
                        long resultadoLong = num1Long * num2Long;
                        System.out.println("El resultado es: " + resultadoLong);
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Error al cambiar el tipo de dato: " + ex.getMessage());
            }
        }
    }

    /**
     * Método para multiplicar dos números de tipo byte.
     * 
     * @param a es el primer número.
     * @param b es el segundo número.
     * @return es el resultado de la multiplicación como byte.
     * @throws ByteOverEx es si ocurre un overflow.
     * @throws ByteUnderEx es si ocurre un underflow.
     */
    public static byte multiplicar(byte a, byte b) throws ByteOverEx, ByteUnderEx {
        int resultado = (a * b); 
        // Evaluamos si está fuera de -128 y 127 para saber si es un overflow o underflow
        if (resultado > 127) {
            throw new ByteOverEx("Ocurrió un Overflow. El resultado de la multiplicación es mayor al valor de byte (127)");
        } else if (resultado < -128) {
            throw new ByteUnderEx("Ocurrió un Underflow. El resultado de la multiplicación es menor al valor de byte (-127)");
        }
        return (byte) resultado;
    }

    /**
     * Método para multiplicar dos números de tipo short.
     * 
     * @param a es el primer número.
     * @param b es el segundo número.
     * @return es el resultado de la multiplicación como short.
     * @throws ByteOverEx es si ocurre un overflow.
     * @throws ByteUnderEx es si ocurre un underflow.
     */
    public static short multiplicar(short a, short b) throws ByteOverEx, ByteUnderEx {
        int resultado = (a * b); 
        if (resultado > 32767) {
            throw new ByteOverEx("Ocurrió un Overflow. El resultado de la multiplicación es mayor al valor de short (32767)");
        } else if (resultado < -32768) {
            throw new ByteUnderEx("Ocurrió un Underflow en short. El resultado de la multiplicación es menor al valor de short (-32767)");
        }
        return (short) resultado;
    }

    /**
     * Método para multiplicar dos números de tipo int.
     * 
     * @param a es el primer número.
     * @param b es el segundo número.
     * @return es el resultado de la multiplicación como int.
     * @throws ByteOverEx es si ocurre un overflow.
     * @throws ByteUnderEx es si ocurre un underflow.
     */
    private static int multiplicar(int a, int b) throws ByteOverEx, ByteUnderEx {
        long resultado = (long) (a * b); 
        if (resultado > 2147483647) {
            throw new ByteOverEx("Ocurrió un Overflow en int. El resultado de la multiplicación es mayor al valor de long (2147483647)");
        } else if (resultado < -2147483648) {
            throw new ByteUnderEx("Ocurrió un Underflow en int. El resultado de la multiplicación es menor al valor de long (-2147483647)");
        }
        return (int) resultado;
    }
} // Fin de UnderOver
