package toolbox;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import interfazGrafica.Parametros;
import javax.swing.JOptionPane;

public class Descargadores {
    
    private Parametros PARAM = new Parametros(); 
    private ConectoresBDD BBDD = new ConectoresBDD();
    
    //*********************
    //Declaración de constantes para las rutas de descarga
    // y de los ficheros locales
    //*********************
    private final String[] RUTAS = BBDD.cargarDatosGlobalDesdeBaseDatos();
    
    private final String URL_GLOBAL = RUTAS[0];
    private final String DESTINOLOCAL_GLOBAL = RUTAS[1];
    private final String CAMPOS_GLOBAL = RUTAS[2];
    private final String DESTINOLOCAL_CAMPOS_GLOBAL = RUTAS[3];
    


    
    public void testDeConstantes () {
        JOptionPane.showMessageDialog(null, "Constante Global: " + URL_GLOBAL + "\n Constante Campos_Global: " + CAMPOS_GLOBAL + "\n Constante DestinoLocal_Global: " + DESTINOLOCAL_GLOBAL + "\n Constante DestinoLocal_Campos_Global: " + DESTINOLOCAL_CAMPOS_GLOBAL);
    }
    
    
    
    public void descargaGlobal () {
        try {
            URL url = new URL(URL_GLOBAL);
            URLConnection urlCon = url.openConnection();
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(DESTINOLOCAL_GLOBAL);
 
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
            System.out.println("Ha fallado:");
            System.out.println(e);
        }
        
    }
    
    public void descargaCamposGlobal () {
        try {
            URL url = new URL(CAMPOS_GLOBAL);
            URLConnection urlCon = url.openConnection();
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(DESTINOLOCAL_CAMPOS_GLOBAL);
 
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
