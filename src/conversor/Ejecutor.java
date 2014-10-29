package conversor;

import toolbox.LecturaInputCSV;
import toolbox.Utilidades;

/** Programa:   Ejecutor.java - (UTF-8)
  * Autor:      McKyavelik
  * 
  * Esta clase me sirve para ejecutar el programa
  * 
**/
        
public class Ejecutor {

    private LecturaInputCSV PRO = new LecturaInputCSV();
    private ConsultasBBDD SQL = new ConsultasBBDD();
    private Utilidades UTI = new Utilidades();
    
    public static void main (String[] Args) {
        Ejecutor programa = new Ejecutor();
        programa.goes();
    }
    
    public void goes(){

        PRO.leerProductosGlobal("d:/FicherosGrutinet/descargados/productos.csv");
        
    }
}