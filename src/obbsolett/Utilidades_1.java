package obbsolett;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* 
 * @autor Isaac Giménez Sánchez
 */

public class Utilidades_1 {

    // Mediante este método creo un ArrayList con todos los productos del CSV.
    // Lee los datos de las columnas que le interesan (según cabecera) y los
    //  añade-guarda-loqueseaquehaga como objetos del tipo Producto.
    public ArrayList<ProductoNovedadOLD> crearListaProductos (String ruta) {
        try {
            // Inicializo el ArrayList y el lector de CSV (biblioteca añadida manualmente).
            ArrayList<ProductoNovedadOLD> producto = new ArrayList<ProductoNovedadOLD>();
            CsvReader fila_reader = new CsvReader(ruta);
            
            //Especificación del separador
            fila_reader.setDelimiter(',');

            // recogida de los datos de cada línea
            while (fila_reader.readRecord()) {
                String familia = fila_reader.get("familia");
                String subfamilia = fila_reader.get("subfamilia");
                String codigo = fila_reader.get("codigo");
                String nombre = fila_reader.get("nombre");
                String marca = fila_reader.get("marca");
                String precio = fila_reader.get("precio");
                String stock_disponible = fila_reader.get("stock_disponible");
                String talla = fila_reader.get("talla");
                String iva = fila_reader.get("iva");
                String imagen_or = fila_reader.get("imagen_or");
                String imagen_grande_1 = fila_reader.get("imagen_grande_1");
                String imagen_grande_2 = fila_reader.get("imagen_grande_2");
                String imagen_grande_3 = fila_reader.get("imagen_grande_3");
                String imagen_grande_4 = fila_reader.get("imagen_grande_4");
                String imagen_grande_5 = fila_reader.get("imagen_grande_5");
                String imagen_grande_6 = fila_reader.get("imagen_grande_6");
                String imagen_grande_7 = fila_reader.get("imagen_grande_7");
                String imagen_grande_8 = fila_reader.get("imagen_grande_8");
                String imagen_grande_9 = fila_reader.get("imagen_grande_9");
                String imagen_grande_10 = fila_reader.get("imagen_grande_10");
                String descripcion_html = fila_reader.get("descripcion_html");
                
                // Añadir el producto recibido (a dónde? no lo se... per add es añadir, no? XD)
                producto.add(new ProductoNovedadOLD(familia,subfamilia,codigo,nombre,marca,precio,stock_disponible,talla,iva,imagen_or,imagen_grande_1,imagen_grande_2,imagen_grande_3,imagen_grande_4,imagen_grande_5,imagen_grande_6,imagen_grande_7,imagen_grande_8,imagen_grande_9,imagen_grande_10,descripcion_html));
            }
            fila_reader.close();
            return producto;
            
        // Nunca he hecho un tratamiento de excepciones ni he estudiado como hacerlos, 
        //  asi que a esto casi que ni caso, está hecho por deducción ;)
        } catch (FileNotFoundException e) {
            System.out.println("Parece que no se encuentra el fichero.");
            ArrayList<ProductoNovedadOLD> filas = null;
            return filas;
        } catch (IOException e) {
            System.out.println("Fallo desconocido en entrada/salida.");
            System.out.println("Tendrá algo que ver esto?: " + e);
            ArrayList<ProductoNovedadOLD> filas = null;
            return filas;
        }
    }
}