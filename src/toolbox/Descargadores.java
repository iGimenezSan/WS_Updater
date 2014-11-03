package toolbox;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import interfazGrafica.Parametros;

public class Descargadores {
    
    private Parametros PARAM = new Parametros(); 
    
    //*********************
    //Declaración de constantes para las rutas de descarga
    // y de los ficheros locales
    //*********************
    private final String GLOBAL = PARAM.getRutaGlobal();
    private final String CAMPOS_GLOBAL = PARAM.getCamposGlobal();
    private final String DESTINOLOCAL_GLOBAL = PARAM.getDestinoLocalGlobal();
    private final String DESTINOLOCAL_CAMPOS_GLOBAL = PARAM.getDestinoLocalCamposGlobal();
    


    
    public void descargaFicheroGlobal () {
        try {
            URL url = new URL(GLOBAL);
            
            // establecemos conexion
            URLConnection urlCon = url.openConnection();
 
            // Obtención del InputStream del fichero y grabación en fichero local
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(DESTINOLOCAL_GLOBAL);
 
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
    
    public void descargaCamposGlobal () {
        try {
            URL url = new URL(CAMPOS_GLOBAL);
            
            // establecemos conexion
            URLConnection urlCon = url.openConnection();
 
 
            // Obtención del InputStream del fichero y grabación en fichero local
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(DESTINOLOCAL_CAMPOS_GLOBAL);
 
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
        File ficheroCamposProductos = new File(DESTINOLOCAL_CAMPOS_GLOBAL);
        if (ficheroCamposProductos.exists())
          return true;
        else
          return false;
    }    
    
}
