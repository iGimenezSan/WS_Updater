package toolbox;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DescargaFicheros {
    
    //*********************
    //Declaración de constantes para las rutas de descarga
    // y de los ficheros locales
    //*********************
    private final String PRODUCTOS = "http://media.grutinet.com/ficheros/productos_sin_dvd.csv";
    private final String CAMPOS_PRODUCTOS = "http://media.grutinet.com/ficheros/estructura_campos.txt";
    private final String DESTINO_PRODUCTOS = "d:/FicherosGrutinet/descargados/productos.csv";
    private final String DESTINO_CAMPOS_PRODUCTOS = "d:/FicherosGrutinet/descargados/campos_productos.csv";
    
    private final String NOVEDADES = "";
    private final String DESTINO_NOVEDADES = "d:/FicherosGrutinet/descargados/novedades.csv";

//    public static void main (String[] Args) {
//        DescargaFicheros programa = new DescargaFicheros();
//        programa.descargaFicheroProductos();
//    }
    
    public void descargaFicheroProductos () {
        try {
            URL url = new URL(PRODUCTOS);
            
            // establecemos conexion
            URLConnection urlCon = url.openConnection();
 
 
            // Obtención del InputStream del fichero y grabación en fichero local
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(DESTINO_PRODUCTOS);
 
            // Lectura del fichero y escritura en fichero local
            byte[] array = new byte[1000]; // buffer temporal de lectura.
            int leido = is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido = is.read(array);
            }
 
            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Ha fallado");
            System.out.println(e);
        }
        
    }
    
    public boolean comprobarExistenciaProductos () {
        File ficheroProductos = new File(DESTINO_PRODUCTOS);
        if (ficheroProductos.exists())
          return true;
        else
          return false;
    }
    
    public void descargaCamposDeProductos () {
        try {
            URL url = new URL(CAMPOS_PRODUCTOS);
            
            // establecemos conexion
            URLConnection urlCon = url.openConnection();
 
 
            // Obtención del InputStream del fichero y grabación en fichero local
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(DESTINO_CAMPOS_PRODUCTOS);
 
            // Lectura del fichero y escritura en fichero local
            byte[] array = new byte[1000]; // buffer temporal de lectura.
            int leido = is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido = is.read(array);
            }
 
            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Ha fallado");
            System.out.println(e);
        }
        
    }
    
    public boolean comprobarExistenciaCamposProductos () {
        File ficheroCamposProductos = new File(DESTINO_CAMPOS_PRODUCTOS);
        if (ficheroCamposProductos.exists())
          return true;
        else
          return false;
    }    
    
    public void descargaFicheroNovedades () {
        try {
            URL url = new URL(NOVEDADES);
            
            // establecemos conexion
            URLConnection urlCon = url.openConnection();
 
 
            // Obtención del InputStream del fichero y grabación en fichero local
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(DESTINO_NOVEDADES);
 
            // Lectura del fichero y escritura en fichero local
            byte[] array = new byte[1000]; // buffer temporal de lectura.
            int leido = is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido = is.read(array);
            }
 
            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Ha fallado");
            System.out.println(e);
        }
        
    }

}
