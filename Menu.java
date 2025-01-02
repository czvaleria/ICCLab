// Importaciones para manejo de excepciones y entrada/salida
import java.util.InputMismatchException;
import java.util.Scanner;

// Importaciones estándar de Java para manejo de archivos y flujos
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Importaciones de Apache Commons Imaging
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

import org.apache.commons.io.FileUtils;

/**
 * Este programa utiliza bibliotecas estándar de Java y la paquetería de Apache Commons Imaging 
 * para leer y modificar metadatos en imágenes JPEG. También incluye funcionalidades para 
 * interactuar con el usuario mediante un menú en consola.
 * 
 * Paqueterías principales:
 * - java.util y java.io: Para manejo de excepciones, entrada/salida y archivos.
 * - org.apache.commons.imaging: Para manipular metadatos de imágenes.
 * - org.apache.commons.io: Para operaciones comunes de archivos.
 * 
 * Funcionalidades principales:
 * - Leer los metadatos de una imagen JPEG.
 * - Modificar los metadatos, como información del GPS, modelo de cámara, y más.
 * - Guardar los datos extraídos o modificados en nuevos archivos.
 * 
 * Dependencias externas:
 * - Apache Commons Imaging: Biblioteca especializada para trabajar con formatos de imagen.
 * - Apache Commons IO: Proporciona utilidades para operaciones con archivos.
 */
public class Menu {

    /**
     * Muestra un menú interactivo al usuario y permite seleccionar una opción.
     * 
     * Este método despliega un menú con tres opciones principales: 
     * leer metadatos de una imagen, escribir metadatos en una imagen, 
     * o salir del programa. Valida la entrada del usuario para asegurarse
     * de que sea un número entero.
     * 
     * @param tec Scanner utilizado para la entrada del usuario.
     * @return Un número entero que representa la opción seleccionada por el usuario:
     * @throws InputMismatchException Si el usuario ingresa un valor no numérico.
     */ 
    public static int menu(Scanner tec){
        int opc=0;
        System.out.println("\n--- Menú ---");
        System.out.println("1. Leer metadatos de una imagen");
        System.out.println("2. Escribir metadatos a una imagen");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");

        try{
            opc=tec.nextInt();
            tec.nextLine();
            return opc;
        }catch (InputMismatchException ex) {
            tec.nextLine();
            System.out.println("Tu entrada no es un numero");
        }
        return opc;
        }  

    /**
     * Este método evalúa si un archivo de imagen proporcionado existe, es un archivo válido
     * y contiene datos. Devuelve un mensaje descriptivo del estado del archivo.
     * 
     * @param archivoImagen El archivo de imagen a verificar.
     * @return Una cadena con uno de los siguientes mensajes:
     * "Imagen encontrada": Si el archivo existe, es válido y no está vacío.
     * "La imagen no existe": Si el archivo no existe. 
     * "No se encuentra la imagen en esa ruta": Si la ruta proporcionada no apunta a un archivo válido. 
     * "La imagen no tiene datos": Si el archivo existe pero está vacío. 
     */
    public static String mensajeImagen(File archivoImagen){
        if(archivoImagen.exists() && archivoImagen.isFile() && archivoImagen.length() > 0) {
            return "Imagen encontrada"; 
                                
        } else {
            if (!archivoImagen.exists()) {
            return "La imagen no existe";
            } else if (!archivoImagen.isFile()) {
            return "No se encuentra la imagen en esa ruta";
            } else {
            return "La imagen no tiene datos";
            }
        }
    } 

    /**
     * Este método comprueba si un archivo de imagen proporcionado existe, es un archivo
     * válido y contiene datos. Útil para validaciones previas antes de realizar operaciones
     * sobre el archivo.
     * 
     * @param archivoImagen es el archivo de imagen a verificar.
     * @return true si el archivo existe, es un archivo válido y no está vacío o false en caso contrario.
     */ 
    public static boolean comprobarImagen(File archivoImagen){
        if(archivoImagen.exists() && archivoImagen.isFile() && archivoImagen.length() > 0) {
            return true;                    
        } else {
            return false;
        }
    }

    /**
     * Main donde se lleva la interacción con el usuario
     */
    public static void main(String[] args) throws IOException{    
        boolean flujo = true;
        Scanner entrada = new Scanner(System.in);   
        int seleccionMP = 0;  // selección del Menu Principal
        int seleccionCambio = 0; // Selección del menú cuando en principal se esocge a 2
	    File archivoImagen;
        String archivo, archivo2;

        // 0. Bienvenida al programa
        System.out.println(" DATOS Y MÁS ALLÁ ");
        System.out.println("¡Bienvenido al programa de gestión de metadatos y GPS de una imágen! ");

        while (flujo){
            // Boolean para controlar las entradas de selección del menú principal
            boolean menuPrincipal = false;
            boolean menu2 = false;

            // Entrada del menú 
            seleccionMP= menu( entrada);
            // Selección del menú principal
            switch (seleccionMP) {
        // 1. Leer los metadatos de una foto
	    case 1:
            System.out.print("Ingresa el nombre de tu imagen: ");
            archivo = entrada.nextLine(); 
            // Convertimos el string a objeto
            archivoImagen = new File(archivo); 

            // Verificar que el archivo exista, sea válido y que no este vacío 
            // Para comprobar que el archivo no esté vacío, verificamos el tamaño del archivo con length() > 0
            // pues devuelve el tamaño del archivo en bytes, y si es mayor que cero, significa que el archivo tiene contenido
            System.out.println(mensajeImagen(archivoImagen));
            if(comprobarImagen( archivoImagen)){
                Metadatos.obtenerMetadatos(archivoImagen);
                System.out.print("Ingresa el nombre del archivo donde se guardadan los datos: ");
                archivo = entrada.nextLine();
                Metadatos.guardarMetadatos(archivo, archivoImagen);
                if(Metadatos.gps(archivoImagen)!= null){
                    boolean bandera=false;
                    do{
                        System.out.print("La imagen cuenta con informacion de GPS, desea verla en el navegador?  \n1)si      2)no ");
                        int opc=0;
                        try{
                            opc=entrada.nextInt();
                            entrada.nextLine();
                            }catch (InputMismatchException ex) {
                            entrada.nextLine();
                            System.out.println("Tu entrada no es un numero");
                        }

                        switch(opc){
                            case 1:
                                System.out.println("Abriendo navegador...");
                                Metadatos.mapa(Metadatos.gps(archivoImagen));
                                bandera=true;
                                break;

                            case 2:
                                bandera=true;
                                break;

                            default:
                                System.out.println("Entrada no valida");
                                break;
                        }
                    } while(!bandera);
                }
            }
            break;

		// [2] Modificar los metadatos de una foto
	    case 2:
	        System.out.print("Ingresa el nombre de tu imagen: ");
                    
                archivo2 = entrada.nextLine(); 
                // Convertimos el string a objeto
                File archivoImagen2 = new File(archivo2); 
                System.out.println("La imagen que ingresaste tiene los siguientes datos: ");
                Metadatos.obtenerMetadatos(archivoImagen2);
                // Imprimimosinformación de la imagen (la extraemos)
                System.out.println("\n" + 
                                    "Se pueden realizar cambios a: "
                                    + "\n [1] Dueño de la camara"
                                    + "\n [2] Modelo de la camara"
                                    + "\n [3] Fecha"
                                    + "\n [4] Coordenadas (latitud y longitud)"
                                    + "\n [5] Uso de flash"
                                    + "\n [6] Número de seria de cámara"
                                    + "\n [7] Ancho"
                                    + "\n [8] Sensibilidad (ISO)" 
                                    + "\n");
                System.out.print("Ingresa que deseas hacer: ");
                try {
                    seleccionCambio = entrada.nextInt();
                    entrada.nextLine();
                    if (seleccionCambio <= 1 || seleccionCambio >= 8) { 
                        System.out.println("Opción no válida. Ingresa un número de 1 a 8.");
                    } else {
                        // Si la entrada es válida, se termina este while
                        menu2 = true;
                    }  
                } catch (InputMismatchException e) {
                    // Si no ingresa un número entero
                    System.out.println("Opción no válida. Ingresa un número de 1 a 8.");
                    entrada.nextLine();
                } // Fin del try - catch

                    // Nueva imagen con los cambios
                    File imagenActualizada = new File("imagenActualizada.jpg");

                    ModificarMetadatos cambio = new ModificarMetadatos();

                    switch (seleccionCambio) {
                        case 1:
                            try {
                                System.out.print("Ingresa el nombre del dueño de la cámara: ");
                                String nuevoFabricante = entrada.nextLine();
			                    cambio.nombreFabricante(archivoImagen2, imagenActualizada, nuevoFabricante);
                            } catch (IOException  e) {
                                System.out.println("Error al modificar el dueño de la cámara: " + e.getMessage());
                            }
                            break;

                        case 2:
                            try {
                                System.out.print("Ingresa el modelo nuevo de la cámara: ");
                                String duenoCamara = entrada.nextLine();
				                cambio.duenoCamara(archivoImagen2, imagenActualizada, duenoCamara);
                                System.out.println("Listo. Ahora tu imagen tiene los siguientes metadatos:");
                            } catch (IOException e) {
                                System.out.println("Error al modificar el modelo de la cámara: " + e.getMessage());
                            } 
                            break;

                        case 3:
                            entrada.nextLine(); // Para mejor manejo de la entrada
                            try {
                                System.out.print("Ingresa la nueva fecha: ");
                                String fechaNueva = entrada.nextLine();
                                cambio.fecha(archivoImagen2, imagenActualizada, fechaNueva);
                            } catch (IOException  e) {
                                System.out.println("Error al modificar la fecha: " + e.getMessage());
                            }
                            break;

                        case 4:
                        try {
                            System.out.println("Ingresa las nuevas coordenadas: ");
                            System.out.print("Ingresa la nueva latitud: ");
                            double latitudNueva = entrada.nextDouble();
                            System.out.print("Ingresa la nueva longitud: ");
                            double longitudNueva = entrada.nextDouble();
                            cambio.coordenadas(archivoImagen2, imagenActualizada, latitudNueva, longitudNueva);
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Las coordenadas deben ser números.");
                        } catch (IOException  e) {
                            System.out.println("Error al modificar las coordenadas: " + e.getMessage());
                        }
                        break;
                

                        case 5:
                            entrada.next(); 
                            try {
                                System.out.print("Ingresa 1 si se uso flash ó 0 si no se uso flash: ");
                                short flash = entrada.nextShort();
				                cambio.flash(archivoImagen2, imagenActualizada, flash);
                            } catch (IOException  e) {
                                System.out.println("Error al modificar el flash: " + e.getMessage());
                            }
                            break;

                            case 6: 
                                entrada.nextLine();  // Limpiar buffer
                                System.out.print("Ingresa el número de serie de la cámara: "); 
                                String nuevoNumSerie = entrada.nextLine();
                            try {
				                cambio.numeroSerieCamara(archivoImagen2, imagenActualizada, nuevoNumSerie);
                                System.out.println("Número de serie actualizado.");
                            } catch (IOException  e) {
                                System.out.println("Error al modificar el número de serie: " + e.getMessage());
                            }
                            break;
                        
                        case 7:
                            entrada.next(); // Para mejor manejo de la entrada
                            System.out.print("Ingresa nuevo ancho de la imagen:");
                            try {
                                short ancho = entrada.nextShort();
				                cambio.ancho(archivoImagen2, imagenActualizada, ancho);
                            } catch (IOException  e) {
                                System.out.println("Error al modificar el ajncho: " + e.getMessage());
                            }
                            break;

                        case 8:
                            System.out.print("Ingresa la nueva sensibilidad de la imagen: ");
                            try {
                                byte sensibilidad = entrada.nextByte();
				                cambio.sensibilidad(archivoImagen2, imagenActualizada, sensibilidad);
                            } catch (IOException  e) {
                                System.out.println("Error al modificar la sensibilidad: " + e.getMessage());
                            }
                            break;
                        default:
                            System.err.println("Ingresa un número válido");
                    }
                        break;
                
		// 3. Salir
	    case 3:
            System.out.println("SALIENDO... ");
            flujo = false;
		break;
    
	    default:
		    System.out.println("Opción no válida");
		break;
	    } // Fin de switch de selección    
	} // Fin de while
    } // Fin de main
} // Fin de la clase Menu
///home/cami/Downloads/IMG20241130123711.jpg
