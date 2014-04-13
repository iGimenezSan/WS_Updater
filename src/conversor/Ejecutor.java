package conversor;

import añadirNovedades.LecturaInputCSV;

/** Programa:   Ejecutor.java - (UTF-8)
  * Autor:      McKyavelik
  * 
  * Esta clase me sirve para ejecutar el programa
  * 
**/
        
public class Ejecutor {

   private LecturaInputCSV PRO = new LecturaInputCSV();
   private ConsultasBBDD SQL = new ConsultasBBDD();
    
    public static void main (String[] Args) {
        Ejecutor programa = new Ejecutor();
        programa.goes();
    }
    
    public void goes(){
//        String ruta = "C:/Laboratorio/Wet Sensations/productos_sin_dvd.csv";
//        PRO.parsearFicheroHaciaBD(ruta);
        
    }
}