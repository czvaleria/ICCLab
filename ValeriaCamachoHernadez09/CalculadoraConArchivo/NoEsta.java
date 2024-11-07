/**
 * Excepción lanzada cuando el archivo especificado 
 * no se encuentra en la carpeta. Esta es una Checked 
 * Exception, ya que se espera que sea manejada o declarada.
 */
public class NoEsta extends Exception {
    public NoEsta(String mensaje) {
        super(mensaje);
    }
}
