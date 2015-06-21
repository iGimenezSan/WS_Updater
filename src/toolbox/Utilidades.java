package toolbox;

import java.util.ArrayList;
import java.util.Iterator;
import objetos.ProductosGlobal;

/* Descripció de la classe:
 * 
 * 
 * @autor Isaac Giménez Sánchez
 */

public class Utilidades {
    
    public static Lectores LECT = new Lectores();
    public static Parametros PARAM = new Parametros();
  
    // Metodo libreria para validar la estructura del fichero global
    public boolean validarEstructura (int fichero, int tablaEnBDD) {
        boolean validacion;
        
        if (fichero == tablaEnBDD) { 
            validacion = true; 
        } else { 
            validacion = false; 
        }

        return validacion;
    }
    
        
    ///////////////////////////////
    //
    //  Contenido Antiguo
    //
    ///////////////////////////////
    
    // Metodo libreria para mostrar el contenido de un ArrayList de Objetos
    public void iterarListaObjetos(ArrayList lista) { 
        Iterator iterator = lista.iterator();
        System.out.println("Iterando con la clase Iterator");
        while(iterator.hasNext()){
            System.out.println( iterator.next() );
        }
    }


    
}