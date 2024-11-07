/**
 * Esta excepción personalizada se lanza cuando se detecta 
 * un operador no válido en una operación aritmética.
 * Solo se permiten los operadores +, -, * y /.
 */
public class OperadorNoValido extends Exception {
    public OperadorNoValido(String mensaje) {
        super(mensaje);
    }
}
