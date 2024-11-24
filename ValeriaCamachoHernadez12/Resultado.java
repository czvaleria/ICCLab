/**
 * Clase que representa el resultado de una jugada en el juego de deletreo.
 * Contiene la palabra que se intentó deletrear, el tiempo que tomó y el puntaje obtenido.
 */
class Resultado {
    private String palabra;
    private double tiempo;
    private int puntaje;

    /**
     * Constructor para crear un objeto Resultado con los datos de la jugada.
     * @param palabra La palabra que el jugador intentó deletrear.
     * @param tiempo El tiempo en segundos que tomó el jugador para deletrear la palabra.
     * @param puntaje El puntaje obtenido por el jugador por la respuesta.
     */
    public Resultado (String palabra, double tiempo, int puntaje) {
        this.palabra = palabra;
        this.tiempo = tiempo;
        this.puntaje = puntaje;
    }

    /**
     * Obtiene la palabra que el jugador intentó deletrear.
     * @return La palabra del resultado.
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * Obtiene el tiempo que el jugador tardó en deletrear la palabra.
     * @return El tiempo en segundos.
     */
    public double getTiempo() {
        return tiempo;
    }

    /**
     * Obtiene el puntaje que el jugador obtuvo por su respuesta.
     * @return El puntaje.
     */
    public int getPuntuaje() {
        return puntaje;
    }

    /**
     * Devuelve una representación en cadena del resultado de la jugada.
     * @return Una cadena con la palabra, el tiempo y el puntaje.
     */
    @Override
    public String toString() {
        return "\n - Palabra: " + palabra + 
                "\n - Tiempo: " + tiempo +
                "\n - Puntaje: " + puntaje;
    }
}
