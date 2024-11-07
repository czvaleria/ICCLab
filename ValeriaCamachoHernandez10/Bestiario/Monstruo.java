public class Monstruo {
    private String nombre;
    private String locacion;

    public Monstruo(String nombre) {
        this.nombre = nombre;
    }

    public void descripcion() {
        System.out.println("- Descripción: Se desconoce");
    } 

    public void locacion() {
        System.out.println("- Descripción: Se desconoce");
    } 

    public void debilidad() {
        System.out.println("- Debilidad: Se desconoce.");
    }

    public void hostilidad() {
        System.out.println("- Hostilidad: Se desconoce.");
    }

    public void presa() {
        System.out.println("- Presa: Se desconoce.");
    } 

    public void mordida() {
        System.out.println("- Mordida y su efecto: Se desconoce.");
    }
    
    public void generar() {
        System.out.println("- Generación de ejemplares: Se desconoce.");
    }

    public void datoHistorico() {
        System.out.println("- Dato Historico: Se desconoce");
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getLocacion() {
        return locacion;
    }

    @Override
    public String toString() {
        return "- Monstruo: " + nombre;
    }

    
}
