/**
 * La clase Canciones representa una canción con atributos como nombre, género,
 * artista, álbum, duración y año de lanzamiento. Proporciona métodos para
 * acceder a los atributos y un método para imprimir la información completa
 * de la canción. Como en el ejercicio de Playlist En Modo Shuffle de la práctica 5.
 */
public class Canciones {
    /**
     * Nombre de la canción.
     */
    private String nombre;
    /**
     * Género de la canción (por ejemplo, "Regional mexicano").
     */
    private String genero;
    /**
     * Artista o grupo que interpreta la canción.
     */
    private String artista;
    /**
     * Álbum al que pertenece la canción.
     */
    private String album;
    /**
     * Duración de la canción en formato "mm:ss".
     */
    private String duracion;
    /**
     * Año de lanzamiento de la canción.
     */
    private short lanzamiento;

    /**
     * Método constructor para crear objetos canción con los atributos dados.
     *
     * @param nombre es el nombre de la canción.
     * @param genero es el género de la canción.
     * @param artista es el artista o grupo que interpreta la canción.
     * @param album es el album al que pertenece la canción.
     * @param duracion es la duración de la canción en formato.
     * @param lanzamiento es el año de lanzamiento de la canción.
     */
    public Canciones(String nombre, String genero, String artista, String album, String duracion, short lanzamiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
        this.lanzamiento = lanzamiento;
    }

    // Métodos para obtener los atributos encapsulados
    /**
     * Este método obtiene el nombre de la canción.
     * @return El nombre de la canción.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene el género de la canción.
     * @return El género de la canción.
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Obtiene el artista que interpreta la canción.
     * @return El artista de la canción.
     */
    public String getArtista() {
        return artista;
    }
    /**
     * Obtiene el álbum al que pertenece la canción.
     * @return El álbum de la canción.
     */
    public String getAlbum() {
        return album;
    }
    /**
     * Obtiene la duración de la canción.
     * @return La duración de la canción en formato "mm:ss".
     */
    public String getDuracion() {
        return duracion;
    }
    /**
     * Obtiene el año de lanzamiento de la canción.
     * @return El año de lanzamiento de la canción.
     */
    public short getLanzamiento() {
        return lanzamiento;
    }

    /**
     * Este método devuelve la información de la canción con formato.
     * @return Es el String con la información de la canción.
     */
    public String imprimirInfo() {
        return "Nombre: " + nombre + "\nArtista: " + artista + "\nDuración: " + duracion +
                "\nÁlbum: " + album + "\nGénero: " + genero + "\nAño de lanzamiento: " + lanzamiento;
    }

    /**
     * Método principal que permite buscar canciones en una lista a partir de los criterios proporcionados 
     * en la línea de comandos: número de resultados que quiere que de, el atributo y el valor del atributo.
     * Con esto se llena el formato: java Canciones númeroDeResultados "atributo" "valor". Por ejemplo: 
     * 2 artista Luis Miguel. 
     * @param args Son los argumentos de la línea de comandos: número de resultados,
     *             atributo a buscar (nombre, género, artista, etc.) y valor del
     *             atributo.
     */
    public static void main(String[] args) {
        // Crear las canciones: objetos de la clase Cancion
        Canciones cancion1 = new Canciones("Son De La Negra", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Las Canciones Mexicanas Que El Mundo Canta", "3:01", (short) 1997);
        Canciones cancion2 = new Canciones("Viva México", "Regional mexicano", "Mariachi Real De México", "Viva México", "1:55", (short) 1997);
        Canciones cancion3 = new Canciones("Cielito Lindo", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Las Canciones Mexicanas Que El Mundo Canta", "4:02", (short) 1997);
        Canciones cancion4 = new Canciones("El Jarabe Tapatío", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Las Canciones Mexicanas Que El Mundo Canta", "2:24", (short) 1997);
        Canciones cancion5 = new Canciones("La Bikina", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Las Canciones Mexicanas Que El Mundo Canta", "2:34", (short) 1997);
        Canciones cancion6 = new Canciones("El Mariachi Loco", "Regional mexicano", "Mariachi Vargas de Tecalitlán", "Viva México Y Sus Canciones", "3:00", (short) 2013);
        Canciones cancion7 = new Canciones("Sabes Una Cosa", "Regional mexicano", "Luis Miguel", "México En La Piel", "3:30", (short) 2004);
        Canciones cancion8 = new Canciones("México En La Piel", "Regional mexicano", "Luis Miguel", "México En La Piel", "3:30", (short) 2004);
        Canciones cancion9 = new Canciones("Cucurrucucú Paloma", "Regional mexicano", "Lola Beltrán", "A 10 años.. Un Recuerdo Permanente", "3:59", (short) 2006);
        Canciones cancion10 = new Canciones("Yo Soy El Aventurero", "Regional mexicano", "Pedro Fernández", "Treinta Años, Vol. 2", "3:45", (short) 2009);

        // Crear un arreglo de las canciones.
        Canciones[] canciones = {cancion1, cancion2, cancion3, cancion4, cancion5, cancion6, cancion7, cancion8, cancion9, cancion10};

        /*
         * Con este if se verificarsi se pasaron los argumentos correctos desde la línea de comandos con el formato aceptado.
         * De lo contrario, lo anuncia.
         */
        if (args.length < 3) {
            System.out.println("Debes proporcionar el número de resultados, el atributo a buscar y el valor del atributo.");
            System.out.println("El formato esperado es: java Canciones númeroDeResultados atributo valor. Por ejemplo: 2 artista Luis Miguel. El tributo y valor van entre comillas");
            return;
        }

        /*
         * Aquí se obtene el número de resultados, el atributo y el valor a buscar desde los argumentos. Para ello todos los 
         * atributos son pasados a String. En el ejercicio de la práctica 5 se ocuparon diferentes tipos de datos y para este 
         * ejercicio de esta práctica es más fácil manejarlo como String. Además, se convierte a minúsculas para comparar mejor.
         * 
         * @param numResultados es el número de resultados que se ingresaron.
         * @param atributoBuscado es el atributo que se busca.
         * @param valorBuscado es el valor del atributo que se busca.
         * @param resultadosEncontrados es para guardar cuántos resultados se han encontrado, inicializada en cero.
         */
        int numResultados = Integer.parseInt(args[0]);
        String atributoBuscado = args[1].toLowerCase(); 
        String valorBuscado = args[2]; 

        int resultadosEncontrados = 0;

        /**
         * Este ciclo for recorre todas las canciones para buscar el atributo con el valor que se dió
         */ 
        for (int i = 0; i < canciones.length; i++) {
            Canciones cancion = canciones[i];
            boolean coincide = false;

            /*
             * Este switch verificar el atributo ingresado y ve si coincide con el valor de la canción actual.
             */
            switch (atributoBuscado) {
                case "nombre":
                    coincide = cancion.getNombre().equalsIgnoreCase(valorBuscado);
                    break;
                case "genero":
                    coincide = cancion.getGenero().equalsIgnoreCase(valorBuscado);
                    break;
                case "artista":
                    coincide = cancion.getArtista().equalsIgnoreCase(valorBuscado);
                    break;
                case "album":
                    coincide = cancion.getAlbum().equalsIgnoreCase(valorBuscado);
                    break;
                case "duracion":
                    coincide = cancion.getDuracion().equalsIgnoreCase(valorBuscado);
                    break;
                case "lanzamiento":
                    coincide = Short.toString(cancion.getLanzamiento()).equals(valorBuscado);
                    break;
                default:
                    System.out.println("Mmm.. parece que no encontramos el atributo con su valor de la cancion");
                    return;
            }

            /*
             * Si la canción coincide con el atributo buscado, va a imprimirla y aumentará el contador.
             */
            if (coincide) {
                System.out.println(cancion.imprimirInfo());
                System.out.println("-----------------------------");
                resultadosEncontrados++;
            }

            /*
             * Una vez que se haya alcanzado el número de resultados deseado, se termina el ciclo.
             */
            if (resultadosEncontrados >= numResultados) {
                break;
            }
        }
    }
}
