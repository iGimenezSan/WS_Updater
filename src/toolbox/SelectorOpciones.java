package toolbox;

import java.util.Scanner;

/**
 *
 * @author iGimenezSan
 */
public class SelectorOpciones {
    
    Scanner lector = new Scanner (System.in);
    
    public static void main (String[] Args) {
        SelectorOpciones programa = new SelectorOpciones();
        programa.ejecutor();
    }
    
    public void ejecutor() {
        int opcion;

        menuSeleccion();
        opcion = recibirOpcion();
        selectorAccion(opcion);
    }   
        
    public void menuSeleccion () {
        System.out.println("Qué tipo de actualización quieres hacer?");
        System.out.println();
        System.out.println("1 => Añadir Novedades");
        System.out.println("2 => Actualizar Stock de Productos");
        System.out.println("3 => Descatalogar Productos");
        System.out.println("4 => Desacactivar productos por stock 0");
        System.out.println("5 => Establecer productos en oferta");
        System.out.println("6 => Proceso completo");
        System.out.println();
        System.out.print("Introduce la opción deseada y pulsa intro: ");
    }
    
    public int recibirOpcion () {
        int opcion;
        opcion = lector.nextInt();
        return opcion;
    }
    
    public void selectorAccion (int seleccion) {
        switch (seleccion) {
            case 1: 
                System.out.println("Has entrado un 1");
                break;
            case 2:
                System.out.println("Has entrado un 2");
                break;
            case 3:
                System.out.println("Has entrado un 3");
                break;
            case 4:
                System.out.println("Has entrado un 4");
                break;
            case 5:
                System.out.println("Has entrado un 5");
                break;
            case 6:
                System.out.println("Has entrado un 6");
                break;
            default:
                System.out.println("No se ha especificado una opción válida.");
                break;
        }
    }


}
