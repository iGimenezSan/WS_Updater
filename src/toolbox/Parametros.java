package toolbox;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Isaac Gimenez
 */
public class Parametros {

    // Datos Generales de la Base de Datos
    public String DriverName = "com.mysql.jdbc.Driver";
    
    // Datos de Conexión a la Base de Datos Local
    public String URL_Local = "jdbc:mysql://localhost:3306/";
    public String NombreDB_Local = "catalogws";
    public String Usuario_Local = "root";
    public String PasswordDB_Local = "root";

    // Datos de Conexión a la Base de Datos Real
    public String URL_Real = "jdbc:mysql://wetsensations.es";
    public String NombreDB_Real = "/catalogws";
    public String Usuario_Real = "mckyavelik";
    public String PasswordDB_Real = "Masterr00t";
    
    // URL de acceso a ficheros para descargar
    public String URL_Global = "http://media.grutinet.com/ficheros/productos_sin_dvd.csv";
    public String URL_CamposGlobal = "http://media.grutinet.com/ficheros/estructura_campos.txt";
    public String URL_Novedades = "http://media.grutinet.com/ficheros/productos_csv_novedades.csv";
    public String URL_Ofertas = "http://media.grutinet.com/ficheros/productos_csv_ofertas.csv";
    public String URL_Stock = "http://media.grutinet.com/ficheros/productos_stock.csv";
    public String URL_SinStock = "http://media.grutinet.com/ficheros/productos_csv_sin_stock.csv";
    public String URL_Descatalogados = "http://media.grutinet.com/ficheros/productos_csv_descatalogados.csv";

    // Rutas locales para los ficheros
    public String RutaLocal_Global = "d:/iGimenezSan/FicherosWS/Originales/globalfromgrutinet.csv";
    public String RutaLocal_CamposGlobal = "d:/iGimenezSan/FicherosWS/Originales/camposglobal.txt";
    public String RutaLocal_ProductosParaImportar = "d:/iGimenezSan/FicherosWS/Preparados/productosparaimportar.csv";
    public String RutaLocal_Imagenes = "d:/iGimenezSan/FicherosWS/Imagenes/";
    
    //A futuro
    public String RutaLocal_Novedades = "d:/iGimenezSan/FicherosGrutinet/descargados/novedades.csv";
    public String RutaLocal_Ofertas = "d:/iGimenezSan/FicherosGrutinet/descargados/ofertas.csv";
    public String RutaLocal_Stock = "d:/iGimenezSan/FicherosGrutinet/descargados/stock.csv";
    public String RutaLocal_SinStock = "d:/iGimenezSan/FicherosGrutinet/descargados/sinstock.csv";
    public String RutaLocal_Descatalogados = "d:/iGimenezSan/FicherosGrutinet/descargados/descatalogados.csv";
    
    
    
///////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
        
    //////////////////////////////////////////
    //                                      //
    //  No Modificar la siguiente sección.  //
    //  Zona de código de programa.         //
    //                                      //
    //////////////////////////////////////////
    
/////////////////////
// Getters & Setters
/////////////////////
    public String getRutaLocal_Imagenes() {
        return RutaLocal_Imagenes;
    }

    public void setRutaLocal_Imagenes(String RutaLocal_Imagenes) {
        this.RutaLocal_Imagenes = RutaLocal_Imagenes;
    }
    
    public String getRutaLocal_ProductosParaImportar() {
        return RutaLocal_ProductosParaImportar;
    }
    
    public String getDriverName() {
        return DriverName;
    }
    
    public String getURL_Local() {
        return URL_Local;
    }
    
    public String getNombreDB_Local() {
        return NombreDB_Local;
    }
    
    public String getUsuario_Local() {
        return Usuario_Local;
    }
    
    public String getPasswordDB_Local() {
        return PasswordDB_Local;
    }
    
    public String getURL_Real() {
        return URL_Real;
    }

    public String getNombreDB_Real() {
        return NombreDB_Real;
    }

    public String getUsuario_Real() {
        return Usuario_Real;
    }

    public String getPasswordDB_Real() {
        return PasswordDB_Real;
    }

    public String getURL_Global() {
        return URL_Global;
    }
    
    public String getRutaLocal_Global() {
        return RutaLocal_Global;
    }
    
    public String getURL_CamposGlobal() {
        return URL_CamposGlobal;
    }

    public String getRutaLocal_CamposGlobal() {
        return RutaLocal_CamposGlobal;
    }

    public String getURL_Novedades() {
        return URL_Novedades;
    }

    public String getURL_Ofertas() {
        return URL_Ofertas;
    }

    public String getURL_Stock() {
        return URL_Stock;
    }

    public String getURL_SinStock() {
        return URL_SinStock;
    }

    public String getURL_Descatalogados() {
        return URL_Descatalogados;
    }

    public String getRutaLocal_Novedades() {
        return RutaLocal_Novedades;
    }

    public String getRutaLocal_Ofertas() {
        return RutaLocal_Ofertas;
    }

    public String getRutaLocal_Stock() {
        return RutaLocal_Stock;
    }

    public String getRutaLocal_SinStock() {
        return RutaLocal_SinStock;
    }

    public String getRutaLocal_Descatalogados() {
        return RutaLocal_Descatalogados;
    }


    
    ////////////////////////////////////
    //////                      ////////
    //////    Descargadores     ////////
    //////                      ////////
    ////////////////////////////////////
    
    public void descargaGlobal () {
        try {
            URL url = new URL(getURL_Global());
            URLConnection urlCon = url.openConnection();
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(getRutaLocal_Global());
 
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
    
    public void descargaCamposGlobal() {
        try {
            URL url = new URL(getURL_CamposGlobal());
            URLConnection urlCon = url.openConnection();
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(getRutaLocal_CamposGlobal());
 
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
    
    public void descargarImagen(String urlImagen, String rutaLocalCompleta) {
        try {
            // Condicion para evitar el fallo cuando "Sin Imagen"
            if (!"Sin Imagen".equals(urlImagen)) {
                URL url = new URL(urlImagen);
                URLConnection urlCon = url.openConnection();
                InputStream is = urlCon.getInputStream();
                FileOutputStream fos = new FileOutputStream(rutaLocalCompleta);

                byte[] array = new byte[1000]; // buffer temporal de lectura.
                int leido = is.read(array);
                while (leido > 0) {
                    fos.write(array, 0, leido);
                    leido = is.read(array);
                }
                // cierre de conexion y fichero.
                is.close();
                fos.close();
            }
        } catch (Exception e) {
            System.out.println("Ha fallado:");
            System.out.println(e);
        }                
    }
    
    public void descargarImagenPrueba(String urlImagen, String rutaLocalCompleta) {
        try {
            URL url = new URL(urlImagen);
            URLConnection urlCon = url.openConnection();
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(rutaLocalCompleta);
 
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
    
    ////////////////////////////////////
    //////                      ////////
    //////    A futuro...       ////////
    //////                      ////////
    ////////////////////////////////////
//    public void descargaNovedades () {
//        try {
//            URL url = new URL(getURL_Novedades());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_Novedades());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    
//    public void descargaOfertas () {
//        try {
//            URL url = new URL(getURL_Ofertas());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_Ofertas());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    
//    public void descargaStock () {
//        try {
//            URL url = new URL(getURL_Stock());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_Stock());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    
//    public void descargaSinStock () {
//        try {
//            URL url = new URL(getURL_SinStock());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_SinStock());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    
//    public void descargaDescatalogados () {
//        try {
//            URL url = new URL(getURL_Descatalogados());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_Descatalogados());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    


}