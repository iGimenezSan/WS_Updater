package rutas;

/** Programa:   rutasArchivos.java - (UTF-8)
  * Autor:      McKyavelik
  * 
**/

public class rutasArchivos {

    // Ruta al fichero del listado general de Productos.
    public String urlProductosGeneral () {
        String url = "http://media.grutinet.com/ficheros/productos_sin_dvd.csv";
        return url;
    }

    // Ruta al fichero del listado de novedades    
    public String urlNovedades () {
        String url = "http://media.grutinet.com/ficheros/productos_csv_novedades.csv";
        return url;
    }
    
    // Ruta al fichero del listado del stock actual
    public String urlStock () {
        String url = "http://media.grutinet.com/ficheros/productos_stock.csv";
        return url;
    }    
    
    // Ruta al fichero del listado de productos sin stock
    public String urlSinStock () {
        String url = "http://media.grutinet.com/ficheros/productos_csv_sin_stock.csv";
        return url;
    }
    
    // Ruta al fichero del listado de productos descatalogados
    public String urlDescatalogados (){
        String url = "http://media.grutinet.com/ficheros/productos_csv_descatalogados.csv";
        return url;
    }
    
    // Ruta al fichero del listado de productos en oferta    
    public String urlOfertas () {
        String url = "http://media.grutinet.com/ficheros/productos_csv_ofertas.csv";
        return url;
    }

}