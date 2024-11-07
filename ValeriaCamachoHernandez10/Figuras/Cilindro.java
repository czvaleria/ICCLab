/**
 * Esta clase representa un cilindro tridimensional y hereda de la clase Figura.
 * Contiene los atributos necesarios para definir un cilindro y métodos para
 * calcular su área y volumen.
 *
 */
public class Cilindro extends Figura {
    private double radio;        
    private double altura;       
    private final int caras = 3;  

    /**
     * Constructor para el Cilindro.
     * Inicializa un objeto Cilindro con un radio y una altura específicos.
     * Al crear el objeto, se calcula automáticamente el área y el volumen.
     *
     * @param radio es el radio de la base del cilindro
     * @param altura es la altura del cilindro
     */
    public Cilindro(double radio, double altura) {
        super("Cilindro", "Tridimensional (tiene longitud, alto y ancho)");
        this.radio = radio;
        this.altura = altura;
        calcularArea();
        calcularVolumen(); 
    }

    /**
     * Método para calcular el área del Cilindro.
     * Primero calcula el área total y luego suma el área de las dos bases 
     * circulares y el área lateral del cilindro.
     */
    @Override
    public void calcularArea() {
        double areaBases = 2 * Math.PI * radio * radio;  
        double areaLateral = 2 * Math.PI * radio * altura; 
        this.area = areaBases + areaLateral; 
    }

    /**
     * Método para calcular el volumen del Cilindro.
     * Primero calcula el volumen del cilindro utilizando la fórmula que
     * es (pi * radio^2 * altura)
     */
    @Override
    public void calcularVolumen() {
        this.volumen = (Math.PI * radio * radio * altura); 
    }

    /**
     * Método para imprimir la información del Cilindro: nombre, tipo, área, 
     * volumen, radio, altura y número de caras del cilindro. Además, llama 
     * al método de la superclase para imprimir la información general de las figuras.
     */
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Radio: " + this.radio);
        System.out.println("Altura: " + this.altura);
        System.out.println("Caras: " + this.caras);
    }
} // Fin de Cilindro