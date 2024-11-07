/**
 * Esta clase representa un cubo y hereda de la clase Figura.
 * Incluye atributos específicos de un cubo y métodos para calcular su 
 * área y volumen, además de imprimir su información.
 */
public class Cubo extends Figura {
    private double lado;
    private final int caras = 6; 
    private final int vertices = 8;

    /**
     * Constructor para el Cubo.
     * Inicializa el cubo con la longitud del lado y calcula su área y
     * volumen.
     * @param lado es la longitud de un lado del cubo
     */
    public Cubo(double lado) {
        super("Cubo", "Tridimensional (tiene longitud, alto y ancho)");
        this.lado = lado;
        calcularArea();
        calcularVolumen();
    }

    /**
     * Método para calcular el área del Cubo.
     * El área se calcula como 6 * (lado * lado), que es la suma de las 
     * áreas de las seis caras del cubo.
     */
    @Override
    public void calcularArea() {
        this.area = (6 * (lado * lado));
    }

    /**
     * Método para calcular el volumen del Cubo, el cual se calcula como 
     * lado * lado * lado, osea lado^3.
     */
    @Override
    public void calcularVolumen() {
        this.volumen = lado * lado * lado;
    }

    /**
     * Imprime el nombre, la dimensión, el área, el volumen y las 
     * características específicas del cubo.
     */
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Lado: " + this.lado);
        System.out.println("Caras: " + caras);
        System.out.println("Vértices: " + vertices);
    }
} // Fin de Cubo