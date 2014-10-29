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

    // Metodo libreria para mostrar el contenido de un ArrayList de Objetos
    public void iterarListaObjetos(ArrayList lista) { 
        Iterator iterator = lista.iterator();
        System.out.println("Iterando con la clase Iterator");
        while(iterator.hasNext()){
            System.out.println( iterator.next() );
        }
    }
    
    // Metodo libreria para mostrar arrays de Object
    public void mostrarArrayObj(Object[] array){
        System.out.println("El contenido del array es: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    // Metodo libreria para mostrar arrays de String
    public void mostrarArrayStr(String[] array){
        System.out.println("El contenido del array es: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    void mostrarArrayProductos(ArrayList<ProductosGlobal> ListaProductos) {
        
        int size = ListaProductos.size();
        System.out.println("La lista contiene: " + size);
        
    }
    
}