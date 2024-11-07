/**
 * Se lanza cuando ocurre una división entre cero,
 * indicando una Unchecked Exception.
 */
public class DividirPorCero extends RuntimeException {
    public DividirPorCero(String mensaje) {
        super(mensaje);
    }
}
