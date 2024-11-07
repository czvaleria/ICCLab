/**
 * Esta clase Figura es la base pues representa una figura geométrica genérica.
 * Esta clase contiene los atributos comunes a todas las figuras, 
 * así como métodos para calcular el área y el volumen, los cuales 
 * deben ser implementados en las subclases.
 */
public class Figura {
    protected String nombre;      
    protected String dimension;
    protected double area;       
    protected double volumen;    

    /**
     * Constructor de Figura que asigna el nombre y la dimensión. Además, inicializa
     * el area y el volumen en 0.0
     * @param nombre es el nombre de la figura
     * @param dimension  es la dimensión de la figura (bidimensional o tridimensional)
     */
    public Figura(String nombre, String dimension) {
        this.nombre = nombre;
        this.dimension = dimension;
        this.area = 0.0;          
        this.volumen = 0.0;   
    }

    /**
     * Método para calcular el área, el cual debe ser implementado en las subclases, 
     * ya que el área no está definida para esta clase base.
     */
    public void calcularArea() {
        System.out.println("Debes proporcionar datos para la figura.");
    }

    /**
     * Método para calcular el volumen, que también debe ser implementado en las subclases, 
     * ya que el volumen no está definido para la clase base Figura.
     */
    public void calcularVolumen() {
        System.out.println("Debes proporcionar datos para la figura.");
    }

    /**
     * Método para obtener el valor del área.
     * @return regresa el área de la figura
     */
    public double getArea() {
        return this.area;
    }

    /**
     * Método para asignar un valor al área.
     * @param area es el valor a asignar al área de la figura
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Método para obtener el valor del volumen.
     * @return retorna el volumen de la figura
     */
    public double getVolumen() {
        return this.volumen;
    }

    /**
     * Método para asignar un valor al volumen.
     * @param volumen es el valor a asignar al volumen de la figura
     */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * Este método es para imprimir la información general de la figura.
     * Imprime el nombre, la dimensión, el área y el volumen (si están 
     * definidos) de la figura, pues tenemos dos tipos de figuras: planas
     * o prismas.
     */
    public void imprimirInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dimensión: " + this.dimension);
        if (this.area != 0) {
            System.out.println("Área: " + this.area);
        }
        if (this.volumen != 0) {
            System.out.println("Volumen: " + this.volumen);
        }
    }

} // Fin de Figura