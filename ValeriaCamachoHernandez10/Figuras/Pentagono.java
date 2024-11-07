/**
 * Esta clase representa un pentágono y hereda de la clase Figura.
 * Incluye atributos específicos de un pentágono y métodos para 
 * calcular su área y volumen.
 */
public class Pentagono extends Figura {
    // Atributos específicos de Pentagono
    private double lado;
    private double perimetro;
    private double apotema;
    private double altura;
    private final double grado = 180.0;

    /**
     * Constructor para el Pentagono.
     * Inicializa el pentágono con la longitud del lado y la 
     * apotema, y calcula su área.
     * @param lado   la longitud de un lado del pentágono
     * @param apotema el apotema del pentágono
     */
    public Pentagono(double lado, double apotema) {
        super("Pentagono", "Bidimensional (tiene longitud y anchura, pero no altura)");
        this.lado = lado;
        this.apotema = apotema;
        this.perimetro = lado * 5;
        calcularArea();
    }

    /**
     * Método para calcular el área del Pentagono. El área se 
     * calcula como (perímetro * apotema) / 2.
     */
    public void calcularArea() {
        this.area = (perimetro * apotema) / 2;
    }

    /**
     * Método para calcular el volumen del Pentagono. Si se ha 
     * establecido la altura, se calcula el volumen como área * altura.
     * Si la altura es menor o igual a cero, el volumen será 0.
     */
    public void calcularVolumen() {
        if (altura > 0) { 
            this.volumen = this.area * altura;
        } else {
            this.volumen = 0.0;
        }
    }

    /**
     * Método para establecer la altura del Pentágono. Al establecer 
     * la altura, se recalcula el volumen.
     *
     * @param altura la altura del pentágono
     */
    public void setAltura(double altura) {
        this.altura = altura;
        calcularVolumen();
    }

    /**
     * Imprime el nombre, la dimensión, el área, el volumen y las 
     * características específicas del pentágono. Además, llama al 
     * método de la superclase para imprimir la información general
     */
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Lado: " + this.lado);
        System.out.println("Perímetro: " + this.perimetro);
        System.out.println("Apotema: " + this.apotema);
        System.out.println("Altura: " + (altura > 0 ? altura : "No especificada"));
        System.out.println("Grado interior: " + grado);
    }

} // Fin de Pentagono