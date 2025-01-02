/**
 * Importaciones para el manejo de archivos, entrada/salida, y manipulación de metadatos
 */
import java.io.File;  // Representación de archivos y directorios en el sistema de archivos.
import java.io.IOException;  // Manejo de excepciones relacionadas con entrada/salida.
import java.io.BufferedWriter;  // Escritura eficiente de texto en archivos.
import java.io.FileWriter;  // Escritura de caracteres en archivos.
import java.io.FileOutputStream;  // Flujo de salida para escribir bytes en un archivo.
import java.io.OutputStream;  // Clase abstracta para flujos de salida de bytes.
import java.awt.Desktop;  // Interacción con el escritorio del sistema para abrir archivos, URLs, etc.
import java.net.URL;  // Representación de direcciones de recursos web.
import java.net.MalformedURLException;  // Excepción lanzada si una URL no es válida.
import java.net.URISyntaxException;  // Excepción lanzada si una URI no tiene formato válido.
import java.util.ArrayList;  // Estructura de datos para listas dinámicas.
import java.util.List;  // Interfaz para listas en Java.

/**
 * Importaciones de la biblioteca Apache Commons Imaging para manipular imágenes y metadatos EXIF
 */
import org.apache.commons.imaging.Imaging;  // Clase principal para operaciones con imágenes.
import org.apache.commons.imaging.ImagingException;  // Excepción lanzada por errores en Apache Commons Imaging.
import org.apache.commons.imaging.common.ImageMetadata;  // Clase base para manejar metadatos de imágenes.
import org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem;  // Elemento individual de metadatos de imagen.
import org.apache.commons.imaging.common.RationalNumber;  // Representación de números racionales usados en metadatos.
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;  // Clase para manejar metadatos específicos de JPEG.
import org.apache.commons.imaging.formats.tiff.TiffField;  // Representación de un campo TIFF en los metadatos.
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;  // Manejo de metadatos TIFF.
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;  // Constantes relacionadas con etiquetas EXIF.
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;  // Constantes relacionadas con etiquetas GPS.
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;  // Constantes relacionadas con etiquetas TIFF.
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;  // Información sobre etiquetas TIFF.

/**
 * Clase Metadatos
 *
 * Proporciona métodos para extraer, procesar y guardar metadatos EXIF de imágenes JPEG.
 * También permite obtener las coordenadas GPS y abrir la ubicación en Google Maps.
 */

public class Metadatos { 

	/**
     * Extrae e imprime los metadatos EXIF de una imagen JPEG.
     *
     * @param archivo el archivo de imagen del cual se extraerán los metadatos.
     * @throws ImagingException si ocurre un error al procesar la imagen.
     * @throws IOException si ocurre un error de entrada/salida al leer el archivo.
     */
	public static void obtenerMetadatos(final File archivo) throws ImagingException, IOException {

        // Primero extrae los metadatos de la imagen 
        ImageMetadata metadata = Imaging.getMetadata(archivo);

        if (metadata instanceof JpegImageMetadata) {
             JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;

            // Mostrar el nombre del archivo
            System.out.println("Archivo: " + archivo.getPath());
	    	System.out.println("-------------------------------------");

			/*
			 * Imprimir los valores de las etiquetas EXIF.
			 * Busca el valor de una etiqueta EXIF específica y lo imprime. Si no se encuentra, 
			 * muestra un mensaje indicando que no se encontró la etiqueta.
			 */

            printTagValue(jpegMetadata, TiffTagConstants.TIFF_TAG_XRESOLUTION, "XResolution");
            printTagValue(jpegMetadata, TiffTagConstants.TIFF_TAG_DATE_TIME, "Fecha");
	    	printTagValue(jpegMetadata, ExifTagConstants.EXIF_TAG_DATE_TIME_ORIGINAL, "Fecha original");
            printTagValue(jpegMetadata, ExifTagConstants.EXIF_TAG_DATE_TIME_DIGITIZED,"Fecha de digitalizacion");
            printTagValue(jpegMetadata, ExifTagConstants.EXIF_TAG_ISO, "Sensivilidad fotografica");
	    	printTagValue(jpegMetadata, ExifTagConstants.EXIF_TAG_SHUTTER_SPEED_VALUE, "Velocidad de disparo");
            printTagValue(jpegMetadata, ExifTagConstants.EXIF_TAG_APERTURE_VALUE,"Valor de apertura");
            printTagValue(jpegMetadata, ExifTagConstants.EXIF_TAG_BRIGHTNESS_VALUE,"Valor de brillo");

			// Coordenadas GPS
			printTagValue(jpegMetadata, GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF, "GPS referencia de latitud");
			printTagValue(jpegMetadata, GpsTagConstants.GPS_TAG_GPS_LATITUDE, "GPS Latitud");
			printTagValue(jpegMetadata, GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF, "GPS referencia de longitud");
			printTagValue(jpegMetadata, GpsTagConstants.GPS_TAG_GPS_LONGITUDE, "GPS Longitud");

	    final TiffImageMetadata exifMetadata = jpegMetadata.getExif();
	    if (null != exifMetadata) {
		final TiffImageMetadata.GpsInfo gpsInfo = exifMetadata.getGpsInfo();
		if (null != gpsInfo) {
		    final String gpsDescription = gpsInfo.toString();
		    final double longitude = gpsInfo.getLongitudeAsDegreesEast();
		    final double latitude = gpsInfo.getLatitudeAsDegreesNorth();

		    System.out.println( "GPS Descripcion: " + gpsDescription);
		    System.out.println("GPS Longitud : " + longitude);
		    System.out.println("GPS Latitud : " + latitude);
		}
	    }            
        }
    }

    /**
     * Imprime el valor de una etiqueta EXIF específica.
     *
     * @param jpegMetadata son los metadatos de la imagen en formato JPEG.
     * @param tagInfo es la etiqueta EXIF a buscar.
     * @param nombre es el nombre descriptivo de la etiqueta.
     */
    private static void printTagValue(final JpegImageMetadata jpegMetadata, final TagInfo tagInfo, String nombre) {
        final TiffField field = jpegMetadata.findExifValueWithExactMatch(tagInfo);
        if (field == null) {
            System.out.println(nombre + ": " + "No se encontró la etiqueta.");
        } else {
            System.out.println(nombre + ": " + field.getValueDescription());
        }
    }

	/**
     * Devuelve el valor de una etiqueta EXIF específica como String
     *
     * @param jpegMetadata son los metadatos de la imagen en formato JPEG.
     * @param tagInfo es la etiqueta EXIF a buscar.
     * @param nombre es el nombre descriptivo de la etiqueta.
     * @return es el valor de la etiqueta EXIF o un mensaje indicando que no se encontró.
     */
    private static String datos(final JpegImageMetadata jpegMetadata, final TagInfo tagInfo, String nombre) {
        final TiffField field = jpegMetadata.findExifValueWithExactMatch(tagInfo);
        if (field == null) {
            return (nombre + ": " + "No se encontró la etiqueta.");
        } else {
            return (nombre + ": " + field.getValueDescription());
        }
    }
    

	/**
     * Obtiene las coordenadas GPS (latitud y longitud) de una imagen.
     *
     * @param imgFile es el archivo de imagen del cual se extraerán las coordenadas GPS.
     * @return un arreglo con las coordenadas GPS, donde el índice 0 es la longitud
     * y el índice 1 es la latitud.
     * @throws ImagingException si ocurre un error al procesar la imagen.
     * @throws IOException si ocurre un error de entrada/salida al leer el archivo.
     */
     public static double[] gps(final File imgFile) throws ImagingException, IOException {
	 double[] datos =new double[2];
	final ImageMetadata metadata = Imaging.getMetadata(imgFile);
	if (metadata instanceof JpegImageMetadata) {
	    JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
	    
	    final TiffImageMetadata exifMetadata = jpegMetadata.getExif();
	    if (null != exifMetadata) {
		final TiffImageMetadata.GpsInfo gpsInfo = exifMetadata.getGpsInfo();
		if (null != gpsInfo) {
		    final double longitude = gpsInfo.getLongitudeAsDegreesEast();
		    final double latitude = gpsInfo.getLatitudeAsDegreesNorth();
		     datos[0] =longitude;
		     datos[1] =latitude;
		}
	    }
	}
	return datos;
    }
    
	/**
     * Abre las coordenadas GPS en el navegador con Google Maps.
     *
     * @param coordenadas un arreglo de coordenadas GPS donde el índice 0 es la longitud
     * y el índice 1 es la latitud.
     */
    public static void mapa(double[] coordenadas ) {
		double latitude=coordenadas[1];
		double longitude=coordenadas[0];
		String link="https://www.google.com/maps/search/?api=1&query="+latitude+","+longitude;
		URL url=null;
		try {
			url = new URL(link);
			try {
			Desktop.getDesktop().browse(url.toURI());
			} catch (IOException e) {
			} catch (URISyntaxException e) {
			}
		} catch (MalformedURLException e1) {
		}
    }

	/**
     * Devuelve un arreglo de cadenas con los metadatos extraídos de una imagen.
     *
     * @param imgFile es el archivo de imagen del cual se extraerán los metadatos.
     * @return un arreglo de cadenas con los metadatos.
     * @throws ImagingException si ocurre un error al procesar la imagen.
     * @throws IOException si ocurre un error de entrada/salida al leer el archivo.
     */
    public static String[] arregloMeta (final File imgFile)  throws ImagingException, IOException {
		List<String> metadataList = new ArrayList<>();
		ImageMetadata metadata = Imaging.getMetadata(imgFile);

		if (metadata instanceof JpegImageMetadata) {
			JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
			metadataList.add(imgFile.getPath());

			metadataList.add(datos(jpegMetadata, TiffTagConstants.TIFF_TAG_XRESOLUTION, "XResolution"));
			metadataList.add(datos(jpegMetadata, TiffTagConstants.TIFF_TAG_DATE_TIME, "Fecha"));
			metadataList.add(datos(jpegMetadata, ExifTagConstants.EXIF_TAG_DATE_TIME_ORIGINAL, "Fecha original"));
			metadataList.add(datos(jpegMetadata, ExifTagConstants.EXIF_TAG_DATE_TIME_DIGITIZED,"Fecha de digitalizacion"));
			metadataList.add(datos(jpegMetadata, ExifTagConstants.EXIF_TAG_ISO, "Sensivilidad fotografica"));
			metadataList.add(datos(jpegMetadata, ExifTagConstants.EXIF_TAG_SHUTTER_SPEED_VALUE, "Velocidad de disparo"));
			metadataList.add(datos(jpegMetadata, ExifTagConstants.EXIF_TAG_APERTURE_VALUE,"Valor de apertura"));
			metadataList.add(datos(jpegMetadata, ExifTagConstants.EXIF_TAG_BRIGHTNESS_VALUE,"Valor de brillo"));

			// Coordenadas GPS
			metadataList.add(datos(jpegMetadata, GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF, "GPS referencia de latitud"));
			metadataList.add(datos(jpegMetadata, GpsTagConstants.GPS_TAG_GPS_LATITUDE, "GPS Latitud"));
			metadataList.add(datos(jpegMetadata, GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF, "GPS referencia de longitud"));
			metadataList.add(datos(jpegMetadata, GpsTagConstants.GPS_TAG_GPS_LONGITUDE, "GPS Longitud"));

			final TiffImageMetadata exifMetadata = jpegMetadata.getExif();
			if (null != exifMetadata) {
			final TiffImageMetadata.GpsInfo gpsInfo = exifMetadata.getGpsInfo();
			if (null != gpsInfo) {
				final String gpsDescription = gpsInfo.toString();
				final double longitude = gpsInfo.getLongitudeAsDegreesEast();
				final double latitude = gpsInfo.getLatitudeAsDegreesNorth();

				metadataList.add( "GPS Descripcion: " + gpsDescription);
				metadataList.add("GPS Longitud : " + longitude);
				metadataList.add("GPS Latitud : " + latitude);
						
			}
			}
		}
		return metadataList.toArray(new String[0]);
    }
	
	/**
     * Guarda los metadatos extraídos de una imagen en un archivo de texto.
     *
     * @param archivo la ruta del archivo donde se guardarán los metadatos.
     * @param imgFile el archivo de imagen del cual se extraerán los metadatos.
     * @throws IOException si ocurre un error al escribir en el archivo.
     * @throws ImagingException si ocurre un error al procesar la imagen.
     */

    public static void guardarMetadatos(String archivo, File imgFile) throws IOException, ImagingException {
	String[] datos = arregloMeta(imgFile);
	
	try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, false))) {
	    for(int i=0; i<datos.length; i++){
		String dato= datos[i];
	    writer.write(dato);
            writer.newLine();
	    }
            System.out.println("Contenido escrito exitosamente en: " + archivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

} // Fin de Metadatos

