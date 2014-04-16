/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

/**
 *
 * @author iGimenezSan
 */
public class SelectorOpciones {
    
    public void menuSelecion () {
        System.out.println("Qué tipo de actualización quieres hacer?");
        System.out.println();
        System.out.println("1 => Añadir Novedades");
        System.out.println("2 => Actualizar Stock de Productos");
        System.out.println("3 => Descatalogar Productos");
        System.out.println("4 => Desacactivar productos por stock 0");
        System.out.println("5 => Establecer productos en oferta");
        System.out.println("6 => Proceso completo");
    }
    
    public int recibirOpción () {
        int opcion;
        
        opcion = 0;  // Espacio reservado para crear el código de entrada de la opcion.
        
        return opcion;
    }
    
    public void selectorAccion (int seleccion) {
        switch (seleccion) {
            case 1: 
                    break;
            case 2:
                    break;
            case 3:
                    break;
            case 4:
                    break;
            case 5:
                    break;
            case 6:
                    break;
            default:
                System.out.println("No se ha especificado una opción válida.");
                break;
        }
        
    }
    
    
}
