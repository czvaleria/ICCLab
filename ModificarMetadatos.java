import java.util.InputMismatchException;
import java.util.Scanner; 
import java.util.List; 

/**
 * Clases relacionadas con operaciones de archivo y flujos de entrada/salida.
 */
import java.io.BufferedOutputStream;
import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileReader;
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.OutputStream;

/**
 * Biblioteca Apache Commons Imaging: Tiene para leer, escribir y manipular metadatos de imágenes.
 */
import org.apache.commons.imaging.Imaging; // Clase principal para manejar operaciones con imágenes.
import org.apache.commons.imaging.ImagingException; // Excepciones específicas relacionadas con Imaging.
import org.apache.commons.imaging.common.ImageMetadata; // Representa metadatos genéricos de imágenes.
import org.apache.commons.imaging.common.RationalNumber; // Representa números racionales en los metadatos.
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata; // Metadatos específicos del formato JPEG.
import org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter; // Herramientas para modificar datos EXIF en imágenes JPEG.
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata; // Metadatos en formato TIFF, base de los datos EXIF.
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants; // Constantes para acceder a etiquetas EXIF.
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory; // Directorio de salida para escribir datos TIFF.
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet; // Conjunto de datos TIFF a modificar o crear.

import org.apache.commons.io.FileUtils; 


/**
 * Los métodos en esta clase permiten extraer, modificar ciertos metadatos de imágenes y guardarlos, 
 * sin afectar la calidad en la imagen original, pues ocupamos ExifRewriter().updateExifMetadataLossless.
 * Los ocupamos en la clase Main donde se encuentra el flujo principal del proyecto.
 * 
 * Utilizamos las siguientes clases de Apache Commons Imaging para los metadatos:
 * - ExifRewriter para escribirlos sin que se pierda la calidad
 * - TiffOutputSet y TiffOutputDirectory para manejarlos formato TIFF
 * - JpegImageMetadata y TiffImageMetadata para manipularlos
 */
public class ModificarMetadatos {
    
    /**
     * Extrae los metadatos EXIF de una imagen, actualiza el nombre del fabricante de la cámara con el valor
     * que se le pase, y guarda los cambios en un nuevo archivo de destino
     * 
     * @param archivo El archivo de imagen cuyo metadato de fabricante se va a modificar
     * @param nuevo El archivo de destino donde se guardarán los cambios realizados a la imagen
     * @param nombre El nombre del fabricante de la cámara que se establecerá en los metadatos EXIF
     * 
     * @throws IOException Si ocurre un error al leer o escribir los archivos de imagen
     * @throws ImagingException Si ocurre un error al procesar los metadatos EXIF de la imagen
     */
    public void nombreFabricante(File archivo, File nuevo, String nombre) throws IOException, ImagingException {
        TiffOutputSet outputSet = extraerEXIF(archivo);
        if (outputSet != null) {
            TiffOutputDirectory exifDirectory = outputSet.getOrCreateExifDirectory();
            exifDirectory.removeField(ExifTagConstants.EXIF_TAG_MAKER_NOTE);
            // exifDirectory.add(ExifTagConstants.EXIF_TAG_MAKER_NOTE, nombre);
            // guardarCambio(archivo, nuevo, outputSet);
        }
    }

    /**
     * Extrae los metadatos EXIF de la imagen, actualiza el modelo de la cámara con el valor proporcionado,
     * y guarda los cambios en un nuevo archivo de destino
     * 
     * @param archivo El archivo de imagen cuyo metadato de modelo de la cámara se va a modificar
     * @param nuevo El archivo de destino donde se guardarán los cambios realizados a la imagen
     * @param modelo El modelo de la cámara que se establecerá en los metadatos EXIF
     * 
     * @throws IOException Si ocurre un error al leer o escribir los archivos de imagen
     * @throws ImagingException Si ocurre un error al procesar los metadatos EXIF de la imagen
     */
    public void duenoCamara(File archivo, File nuevo, String modelo) throws IOException, ImagingException {
        TiffOutputSet outputSet = extraerEXIF(archivo);
        if (outputSet != null) {
            TiffOutputDirectory exifDirectory = outputSet.getOrCreateExifDirectory();
            exifDirectory.removeField(ExifTagConstants.EXIF_TAG_CAMERA_OWNER_NAME );
            exifDirectory.add(ExifTagConstants.EXIF_TAG_CAMERA_OWNER_NAME , modelo);
            guardarCambio(archivo, nuevo, outputSet);
        }
    }

    /**
     * Extrae los metadatos EXIF de una imagen, actualiza las coordenadas GPS (latitud y longitud)
     * con los valores proporcionados, y guarda los cambios en un nuevo archivo de destino.
     * 
     * @param archivo El archivo de imagen cuyos metadatos GPS se van a modificar.
     * @param nuevo El archivo de destino donde se guardarán los cambios realizados a la imagen.
     * @param latitud La latitud que se establecerá en los metadatos GPS de la imagen.
     * @param longitud La longitud que se establecerá en los metadatos GPS de la imagen.
     * 
     * @throws IOException Si ocurre un error al leer o escribir los archivos de imagen.
     * @throws ImagingException Si ocurre un error al procesar los metadatos EXIF de la imagen.
     */
    public void coordenadas(File archivo, File nuevo, double latitud, double longitud) throws IOException, ImagingException {
        TiffOutputSet outputSet = extraerEXIF(archivo);
        if (outputSet != null) {
            outputSet.setGpsInDegrees(longitud, latitud);
            guardarCambio(archivo, nuevo, outputSet);
        }
    }

    /**
     * Extrae los metadatos EXIF de la imagen original, modifica la orientación de la imagen
     * utilizando el valor que se le pase, y guarda los metadatos nuevos en un nuevo archivo
     * 
     * @param archivo El archivo de imagen cuyo metadato de orientación se va a modificar
     * @param nuevo El archivo de destino donde se guardarán los cambios realizados a la imagen
     * @param orientacion El valor de orientación que se establecerá en los metadatos EXIF de la imagen
     * La orientación no es solo "horizontal" o "vertical", sino que es un valor numérico que representa cómo 
     * debe mostrarse la imagen, por eso es un int
     * 
     * @throws IOException Si ocurre un error al leer o escribir los archivos de imagen
     * @throws ImagingException Si ocurre un error al procesar los metadatos EXIF de la imagen
     */
    public void ancho (File archivo, File nuevo, short ancho) throws IOException, ImagingException {
        TiffOutputSet outputSet = extraerEXIF(archivo);
        if (outputSet != null) {
            TiffOutputDirectory exifDirectory = outputSet.getOrCreateExifDirectory();
            exifDirectory.removeField(ExifTagConstants.EXIF_TAG_EXIF_IMAGE_WIDTH );
            exifDirectory.add(ExifTagConstants.EXIF_TAG_EXIF_IMAGE_WIDTH , ancho);
            guardarCambio(archivo, nuevo, outputSet);
        }
    }

    /**
     * Extrae los metadatos EXIF de una imagen JPEG, actualiza el valor del metadato de flash según si 
     * se utilizó o no el flash (lo que pase el usuario),y guarda los cambios en un nuevo archivo de destino
     * 
     * @param archivo El archivo de imagen JPEG cuyo metadato de flash se va a modificar
     * @param nuevo El archivo de destino donde se guardarán los cambios realizados a la imagen
     * @param flashUsado Un valor booleano que indica si se usó el flash (true) o no (false)
     * 
     * @throws IOException Si ocurre un error al leer o escribir los archivos de imagen
     * @throws ImagingException Si ocurre un error al procesar los metadatos EXIF de la imagen
     */
    public void flash(File archivo, File nuevo, short flashUsado) throws IOException, ImagingException {
        TiffOutputSet outputSet = extraerEXIF(archivo);  // Obtener los metadatos de la imagen
        
        if (outputSet != null) {
            // Obtiene o crear el directorio EXIF 
            TiffOutputDirectory exifDirectory = outputSet.getOrCreateExifDirectory();  
            // Establecer el valor de flash, si es true es 1 y  si es false, entonces es 0
            exifDirectory.removeField(ExifTagConstants.EXIF_TAG_FLASH);  
            exifDirectory.add(ExifTagConstants.EXIF_TAG_FLASH, flashUsado);
            guardarCambio(archivo, nuevo, outputSet);
        }
    }

    /**
     * Extrae los metadatos EXIF de una imagen, actualiza el valor de la sensibilidad ISO con el valor,
     * que se le pase y guarda los cambios en un nuevo archivo
     * 
     * @param archivo El archivo de imagen cuyo metadato de sensibilidad ISO se va a modificar
     * @param nuevo El archivo de destino donde se guardarán los cambios realizados a la imagen
     * @param iso El valor de sensibilidad ISO que se establecerá en los metadatos EXIF de la imagen
     * 
     * @throws IOException Si ocurre un error al leer o escribir los archivos de imagen
     * @throws ImagingException Si ocurre un error al procesar los metadatos EXIF de la imagen
     */
    public void sensibilidad(File archivo, File nuevo, byte iso) throws IOException, ImagingException {
        TiffOutputSet outputSet =  extraerEXIF(archivo);;  // Obtener los metadatos de la imagen
        
        if (outputSet != null) {
            TiffOutputDirectory exifDirectory = outputSet.getOrCreateExifDirectory();
            exifDirectory.removeField(ExifTagConstants.EXIF_TAG_ISO); 
            exifDirectory.add(ExifTagConstants.EXIF_TAG_ISO, iso);
            guardarCambio(archivo, nuevo, outputSet);
        }
    }

    /**
     * Para modificar la fecha y hora original de una imagen, que es uno de los metadatos EXIF
     *
     * @param archivo El archivo de imagen original que contiene los metadatos EXIF
     * @param nuevo El archivo de destino donde se guardarán los cambios
     * @param fechaExacta La nueva fecha y hora para la foto, en formato "yyyy:MM:dd HH:mm:ss"
     * @throws IOException Si ocurre un error al leer o escribir el archivo
     * @throws ImagingException Si ocurre un error al procesar los metadatos EXIF
     */
    public void fecha(File archivo, File nuevo, String fechaExacta) throws IOException, ImagingException {
        TiffOutputSet outputSet = extraerEXIF(archivo);
        if (outputSet != null) {
            TiffOutputDirectory exifDirectory = outputSet.getOrCreateExifDirectory();
            exifDirectory.removeField(ExifTagConstants.EXIF_TAG_DATE_TIME_ORIGINAL);
            exifDirectory.add(ExifTagConstants.EXIF_TAG_DATE_TIME_ORIGINAL, fechaExacta);
            guardarCambio(archivo, nuevo, outputSet);
        }
    }

    /**
     * Método que modifica el número de serie de la cámara en los metadatos EXIF de la imagen
     *
     * @param archivo El archivo de imagen original que contiene los metadatos EXIF
     * @param nuevo El archivo de destino donde se guardarán los cambios
     * @param numSerie El nuevo número de serie de la cámara
     * @throws IOException Si ocurre un error al leer o escribir el archivo
     * @throws ImagingException Si ocurre un error al procesar los metadatos EXIF
     */
    public void numeroSerieCamara(File archivo, File nuevo, String numSerie) throws IOException, ImagingException {
        TiffOutputSet outputSet = extraerEXIF(archivo);
        if (outputSet != null) {
            TiffOutputDirectory exifDirectory = outputSet.getOrCreateExifDirectory();
            exifDirectory.removeField(ExifTagConstants.EXIF_TAG_SERIAL_NUMBER);
            exifDirectory.add(ExifTagConstants.EXIF_TAG_SERIAL_NUMBER, numSerie);
            guardarCambio(archivo, nuevo, outputSet);
        }
    }
    
    /**
     * Método que extrae los metadatos EXIF de un archivo de imagen JPEG. Si la imagen no contiene metadatos 
     * EXIF, se crea un conjunto vacío para que se puedan añadir o modificar los metadatos posteriormente
     * 
     * @param archivo El archivo de imagen JPEG del que se extraerán los metadatos EXIF
     * @return Un objeto de TiffOutputSet que contiene los metadatos EXIF extraídos de la imagen, o
     * un conjunto vacío si la imagen no contenía metadatos EXIF
     * 
     * @throws IOException Si ocurre un error al leer el archivo de imagen
     * @throws ImagingException Si ocurre un error al procesar los metadatos de la imagen
     */
    private TiffOutputSet extraerEXIF(File archivo) throws IOException, ImagingException {
        // Variable para almacenar los metadatos que le vamos a extraer
        TiffOutputSet outputSet = null;

        // Lee los metadatos de la imagen
        ImageMetadata metadata = Imaging.getMetadata(archivo);
        
        // Verifica si los metadatos son del tipo JPEG, y si sí, convierte metadata a JpegImageMetadata
        if (metadata instanceof JpegImageMetadata) {
            JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
        
	    // Busca los metadatos y si los hay, los convierte en un outputSet que podemos modificar
	    TiffImageMetadata tiffMetadata = jpegMetadata.getExif();
	    // Si no hay metadatos, crea uno vacío
	    if (tiffMetadata != null) {
		outputSet = tiffMetadata.getOutputSet();
	    }
	}
        // Regresa metadatos existentes (si la imagen ya los tenía) o un conjunto nuevo y vacío 
        // (si la imagen no tenía metadatos)
        return outputSet;
    }

    /**
     * Método auxiliar que guarda los metadatos modificados en una imagen en un nuevo archivo de imagen.
     * 
     * Utilizamos ExifRewriter().updateExifMetadataLossless para actualizar los metadatos EXIF del archivo original 
     * (archivo) con los nuevos metadatos (outputSet). Los cambios se guardan en el archivo de destino especificado.
     * 
     * @param archivo El archivo original de la imagen que contiene los metadatos que se quieren modificar
     * @param nuevo El archivo de destino donde se guardará la imagen con los nuevos metadatos
     * @param outputSet Los metadatos EXIF modificados que se deben aplicar a la imagen original
     * 
     * @throws IOException Si ocurre un error de entrada/salida al manejar los archivos
     * @throws ImagingException Si ocurre un error relacionado con el procesamiento de las imágenes
     */
    private void guardarCambio(File archivo, File nuevo, TiffOutputSet outputSet) throws IOException, ImagingException {
        try (FileOutputStream fos = new FileOutputStream(nuevo);
            OutputStream os = new BufferedOutputStream(fos)) {
            new ExifRewriter().updateExifMetadataLossless(archivo, os, outputSet);
        }
    }


    /**
     * Modifica los metadatos de una imagen utilizando los datos extraídos de un archivo de texto. Por 
     * lo que el archivo de texto debe contener líneas en el formato "etiqueta: valor", donde cada etiqueta 
     * corresponde a un tipo de metadato. Este método lee cada línea, pues ocupa BufferReader.
     *
     * @param imagen El archivo de imagen que se desea modificar
     * @param archivoTexto El archivo de texto que contiene las etiquetas y valores para modificar los metadatos de la imagen
     * @param imagenActualizada El archivo de imagen modificado con los nuevos metadatos
     * 
     * @throws IOException Si ocurre un error al leer el archivo de texto o al escribir los metadatos en la imagen
     * @throws ImagingException Si ocurre un error relacionado con la modificación de los metadatos de la imagen
     */

    public void modficarArchivo(File imagen, File archivoTexto, File imagenActualizada) throws IOException, ImagingException {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoTexto))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(":");
                String etiqueta = partes[0].trim();
                String valor = partes[1].trim();

                switch (etiqueta) {
                    case "Fabricante":
                        nombreFabricante(imagen, imagenActualizada, valor);
                        break;
                    case "Dueño":
                        duenoCamara(imagen, imagenActualizada, valor);
                        break;
                        //Inicializamos en 0 lat y lon
                    case "Latitud":
                        coordenadas(imagen, imagenActualizada, Double.parseDouble(valor), 0); 
                        break;
                    case "Longitud":
                        coordenadas(imagen, imagenActualizada, 0, Double.parseDouble(valor)); 
                        break;
                    case "Ancho":
                        ancho(imagen, imagenActualizada, Short.parseShort(valor));
                        break;
                    case "Flash":
                        flash(imagen, imagenActualizada,  Short.parseShort(valor));
                        break;
                    case "ISO":
                        sensibilidad(imagen, imagenActualizada, Byte.parseByte(valor));
                        break;
                    case "Fecha":
                        fecha(imagen, imagenActualizada, valor);
                        break;
                    case "NumeroSerie":
                        numeroSerieCamara(imagen, imagenActualizada, valor);
                        break;
                    default:
                        System.out.println("Etiqueta desconocida: " + etiqueta);
                }
            }
        }
    }
} // Fin de ModificarMetadatos
