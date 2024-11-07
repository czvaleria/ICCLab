public class Main {
    public static void main(String[] entrada) {
            System.out.println("----------CALCULADORA DE FIGURAS----------" +
                                "\n  (cuadrado, pentagono, cubo, cilindro)");

            // Primero verificamos si hay suficientes argumentos
            if (entrada.length < 2) {
                System.out.println("Debes ingresar el tipo de figura y al menos un parámetro (ejemplo: 'cilindro 3 5').");
                return;
            }

            String tipoFigura = entrada[0].toLowerCase();
            Figura figura = null;

            try {
                switch (tipoFigura) {
                    case "cuadrado":
                        if (entrada.length < 2) {
                            System.out.println("Debes ingresar el lado del cuadrado.");
                            break;
                        }
                        System.out.println("Ingresaste: " + entrada[0] + " de lado " + entrada [1]);
                        double ladoCuadrado = Double.parseDouble(entrada[1]);
                        if (ladoCuadrado <= 0) {
                            System.out.println("El lado del cuadrado no puede ser negativo o cero porque estamos midiendo distancias");
                            break;
                        }
                        figura = new Cuadrado(ladoCuadrado);
                        break;

                    case "pentagono":
                        if (entrada.length < 3) {
                            System.out.println("Debes ingresar el lado y la apotema del pentágono.");
                            break; 
                        }
                        System.out.println("Ingresaste: " + entrada[0] + " de lado " + entrada [1] + " y apotema " + entrada[2]);
                        double ladoPentagono = Double.parseDouble(entrada[1]);
                        double apotemaPentagono = Double.parseDouble(entrada[2]);
                        if (ladoPentagono <= 0 || apotemaPentagono <= 0) {
                            System.out.println("El lado y la apotema del pentágono no pueden ser negativos o cero porque estamos midiendo distancias.");
                            break;
                        }
                        figura = new Pentagono(ladoPentagono, apotemaPentagono);
                        break;

                    case "cubo":
                        if (entrada.length < 2) {
                            System.out.println("Debes ingresar el lado del cubo.");
                            break; 
                        }
                        System.out.println("Ingresaste: " + entrada[0] + " de lado " + entrada [1]);
                        double ladoCubo = Double.parseDouble(entrada[1]);
                        if (ladoCubo <= 0) {
                            System.out.println("El lado del cubo no puede ser negativo o cero porque estamos midiendo distancias.");
                            break; 
                        }
                        figura = new Cubo(ladoCubo);
                        break;

                    case "cilindro":
                        if (entrada.length < 3) {
                            System.out.println("Debes ingresar el radio y la altura del cilindro.");
                            break;
                        }
                        System.out.println("Ingresaste: " + entrada[0] + " de radio " + entrada [1] + " y altura " + entrada[2]);
                        double radioCilindro = Double.parseDouble(entrada[1]);
                        double alturaCilindro = Double.parseDouble(entrada[2]);
                        if (radioCilindro <= 0 || alturaCilindro <= 0) {
                            System.out.println("El radio y la altura del cilindro no pueden ser negativos o cero porque estamos midiendo distancias.");
                            break;
                        }
                        figura = new Cilindro(radioCilindro, alturaCilindro);
                        break;

                    default:
                        System.out.println("Figura no reconocida. Usa 'cuadrado', 'pentagono', 'cubo' o 'cilindro'.");
                        break; // Salir del switch pero seguir en el bucle
                }

                // Si figura se cre bien, entonces calculamos el area y el volumen, y se muestra la información
                if (figura != null) {
                    figura.calcularArea();
                    figura.calcularVolumen();
                    figura.imprimirInfo();
                    return;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Los parámetros deben ser números válidos.");
            }

            // Si llegamos aquí, significa que hubo un error, entonces se imprime el mensaje y se vuelve a pedir la entrada
            System.out.println("Intentalo de nuevo.");
    }
} // Fin de Main