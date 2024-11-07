/**
 * Esta clase representa un cuadrado y hereda de la clase Figura.
 * Incluye atributos específicos de un cuadrado y métodos para 
 * calcular su área y volumen.
 */
public class Cuadrado extends Figura {
    // Atributos específicos de Cuadrado
    private double lado;
    private final double grado = 90.0;

    /**
     * Constructor de Cuadrado. Inicializa el cuadrado con la 
     * longitud del lado y calcula su área y volumen.
     * @param lado la longitud de un lado del cuadrado
     */
    public Cuadrado(double lado) {
        super("Cuadrado", "Bidimensional (tiene longitud y anchura, pero no altura)");
        this.lado = lado;
        calcularArea();
        calcularVolumen();
    }

    /**
     * Método para calcular el área del cuadrado, la cual
     * se calcula como lado * lado, osea lado^2.
     */
    public void calcularArea() {
        this.area = lado * lado;
    }

    /**
     * Método para calcular el volumen del cuadrado, nada más
     * que como el cuadrado es bidimensional, el volumen es 0.
     */
    public void calcularVolumen() {
        this.volumen = 0.0;
    }

    /**
     * Imprime el nombre, la dimensión, el área, el volumen y 
     * las características específicas del cuadrado.
     */
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Lado: " + this.lado);
        System.out.println("Grado interior: " + grado);
    }

} // Fin de Cuadrado