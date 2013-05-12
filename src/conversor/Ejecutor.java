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

//            int contador = 1;

            // recogida de los datos de cada línea
            while (fila_reader.readRecord()) { // && (contador < 301)) {
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
                
//                System.out.print("linea " + contador + ": ");                

                if (SQL.mirarSiExisteEnTablaProductos(codigo) || SQL.mirarSiExisteEnTablaRelaciones(codigo)) {
// Deberia haber diferencia por tallas??????
                    String idProducto = SQL.obtenerIdProducto(codigo);
                    SQL.actualizarProductoAntiguo(idProducto, precio, stock_disponible);
                } else {
//                    System.out.println("No se ha encontrado el producto: " + codigo);
                }
                
//                contador++;
            }
            fila_reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Parece que no se encuentra el fichero.");
        } catch (IOException e) {
            System.out.println("Fallo desconocido en entrada/salida.");
            System.out.println("Tendrá algo que ver esto?: " + e);
        }
    }    
    

}