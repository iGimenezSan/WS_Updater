package añadirNovedades;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* 
 * @autor Isaac Giménez Sánchez
 */

public class LecturaInputCSV {
    
    
    
    public void aaa () {
        try {
            URL myURL = new URL("http://example.com/");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
        } 
        catch (MalformedURLException e) { 
        // new URL() failed
        // ...
        } 
        catch (IOException e) {   
    // openConnection() failed
    // ...
}
    }
    
    /* 
     * Lee el fichero CSV y almacena los datos en "catalogWS.archivo_csv_parseado".
     */
    public void parsearFicheroHaciaBD (String ruta) {
        try {
            CsvReader lector = new CsvReader(ruta);
            
            //Especificación del separador
            lector.setDelimiter(';');

            // recogida de los datos de cada línea
            while (lector.readRecord()) {
                String familia = lector.get(0);                             //familia
                String subfamilia = lector.get(1);                          //subfamilia
                String codigo = lector.get(2);                              //codigo
                String nombre = lector.get(3);                              //nombre
                String nombre_original = lector.get(4);                     //nombre_original
                String marca = lector.get(5);                               //marca
                String descripcion_castellano = lector.get(6);              //descripcion_castellano
                String link = lector.get(7);                                //link
                String precio = lector.get(8);                              //precio
                String precio_tarifa = lector.get(9);                       //precio_tarifa
                String stock = lector.get(10);                              //stock
                String stock_disponible = lector.get(11);                   //stock_disponible
                String reponer = lector.get(12);                            //reponer
                String talla = lector.get(13);                              //talla    
                String iva = lector.get(14);                                //iva
                String imagen_gr = lector.get(15);                          //imagen_gr
                String imagen_bu = lector.get(16);                          //imagen_bu
                String imagen_or = lector.get(17);                          //imagen_or
                String imagen_grande_1 = lector.get(18);                    //imagen_grande_1
                String imagen_grande_2 = lector.get(19);                    //imagen_grande_2
                String imagen_grande_3 = lector.get(20);                    //imagen_grande_3
                String imagen_grande_4 = lector.get(21);                    //imagen_grande_4
                String imagen_grande_5 = lector.get(22);                    //imagen_grande_5
                String imagen_grande_6 = lector.get(23);                    //imagen_grande_6
                String imagen_grande_7 = lector.get(24);                    //imagen_grande_7
                String imagen_grande_8 = lector.get(25);                    //imagen_grande_8
                String imagen_grande_9 = lector.get(26);                    //imagen_grande_9
                String imagen_grande_10 = lector.get(27);                   //imagen_grande_10
                String ean = lector.get(28);                                //ean
                String asociado_talla = lector.get(29);                     //asociado_talla
                String descripcion_html = lector.get(30);                   //descripcion_html
                String tarifa_basica = lector.get(31);                      //tarifa_basica
                String tarifa_preferente = lector.get(32);                  //tarifa_preferente
                String tarifa_profesional = lector.get(33);                 //tarifa_profesional
                String tarifa_premium = lector.get(34);                     //tarifa_premium

                }
        } catch (FileNotFoundException e) {
            System.out.println("Parece que no se encuentra el fichero.");
        } catch (IOException e) {
            System.out.println("Fallo desconocido en entrada/salida.");
        }
    }        
    
}