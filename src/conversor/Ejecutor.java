package conversor;

/** Programa:   Ejecutor.java - (UTF-8)
  * Autor:      McKyavelik
  * 
  * Esta clase me sirve para ejecutar el programa
  * 
**/

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class Ejecutor {

   private Procesador PRO_LEC = new Procesador();
   private Salida OUT = new Salida();
   private ConsultasBBDD SQL = new ConsultasBBDD();
    
    public static void main (String[] Args) {
        Ejecutor programa = new Ejecutor();
        programa.goes();
    }
    
    public void goes(){
        String ruta = "C:/Laboratorio/Wet Sensations/productos_sin_dvd.csv";
        try {
            actualizarProductos(ruta);
            //System.out.println(prueba);
        } catch (SQLException ex) {
            Logger.getLogger(Ejecutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarProductos (String ruta) throws SQLException {
        try {
            // Inicializo el ArrayList y el lector de CSV (biblioteca añadida manualmente).
            CsvReader fila_reader = new CsvReader(ruta);
            
            //Especificación del separador
            fila_reader.setDelimiter(',');
            int contador = 1;
            // recogida de los datos de cada línea
            while (fila_reader.readRecord()){ //&& (contador < 301)) {
                String familia = fila_reader.get(0);                            //familia
                String subfamilia = fila_reader.get(1);                         //subfamilia
                String codigo = fila_reader.get(2);                             //codigo
                String nombre = fila_reader.get(3);                             //nombre
                String marca = fila_reader.get(5);                              //marca
                String precio = fila_reader.get(8);                             //precio
                String stock_disponible = fila_reader.get(11);                  //stock_disponible
                String talla = fila_reader.get(13);                             //talla    
                String iva = fila_reader.get(14);                               //iva
                String imagen_or = fila_reader.get(17);                         //imagen_or
                String imagen_grande_1 = fila_reader.get(18);                   //imagen_grande_1
                String imagen_grande_2 = fila_reader.get(19);                   //imagen_grande_2
                String imagen_grande_3 = fila_reader.get(20);                   //imagen_grande_3
                String imagen_grande_4 = fila_reader.get(21);                   //imagen_grande_4
                String imagen_grande_5 = fila_reader.get(22);                   //imagen_grande_5
                String imagen_grande_6 = fila_reader.get(23);                   //imagen_grande_6
                String imagen_grande_7 = fila_reader.get(24);                   //imagen_grande_7
                String imagen_grande_8 = fila_reader.get(25);                   //imagen_grande_8
                String imagen_grande_9 = fila_reader.get(26);                   //imagen_grande_9
                String imagen_grande_10 = fila_reader.get(27);                  //imagen_grande_10
                String descripcion_html = fila_reader.get(30);                  //descripcion_html
                
                // Rellenar un array con el contenido de las variables para facilitar el trabajo.
//                String[] producto = PRO_LEC.goesArray(familia, subfamilia, codigo, nombre, marca, precio, stock_disponible, talla, iva, imagen_or, imagen_grande_1, imagen_grande_2, imagen_grande_3, imagen_grande_4, imagen_grande_5, imagen_grande_6, imagen_grande_7, imagen_grande_8, imagen_grande_9, imagen_grande_10, descripcion_html);
                System.out.print("linea " + contador + ": ");                
                // Si el producto existe en la base de datos, se actualiza
                if ("72300".equals(codigo) || "72301".equals(codigo)) {     //Debug
                    System.out.print("Detectado Código: " + codigo);        //Debug
                }                                                           //Debug
                if (SQL.mirarSiExisteEnTablaProductos(codigo) || SQL.mirarSiExisteEnTablaRelaciones(codigo)) {
                    System.out.println("Se ha encontrado el producto: " + codigo);
                } else {
                    System.out.println("No se ha encontrado el producto: " + codigo);
                }
                

//                if (!PRO_LEC.trueSiTieneTalla("hola")) {
//                    String[] productoSinTallaCamposProcesados = PRO_LEC.procesoSimple(producto);
//                } else {
//                    String[] productoConTallaCamposProcesados = PRO_LEC.procesoSimple(producto);
//                    String[] productoConTallaTallasProcesadas = PRO_LEC.procesoComplejo(producto);
//                }
                contador++;
            }
            fila_reader.close();
            
        // Nunca he hecho un tratamiento de excepciones ni he estudiado como hacerlos, 
        //  asi que a esto casi que ni caso, está hecho por deducción ;)
        } catch (FileNotFoundException e) {
            System.out.println("Parece que no se encuentra el fichero.");
        } catch (IOException e) {
            System.out.println("Fallo desconocido en entrada/salida.");
            System.out.println("Tendrá algo que ver esto?: " + e);
        }
    }    
    

}