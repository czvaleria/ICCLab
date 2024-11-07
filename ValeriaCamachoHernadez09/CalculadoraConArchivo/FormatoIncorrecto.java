/**
 * Excepción lanzada cuando la operación no está en el 
 * formato correcto (es decir, debe ser n1 operador n2).
 * Esta es una Checked Exception, ya que se espera que 
 * sea declarada en el código.
 */
public class FormatoIncorrecto extends Exception {
    public FormatoIncorrecto(String mensaje) {
        super(mensaje);
    }
}
