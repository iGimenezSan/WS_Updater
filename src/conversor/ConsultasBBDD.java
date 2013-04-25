package conversor;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** Programa:   ConsultasBBDD.java - (UTF-8)
  * Autor:      McKyavelik
  * 
**/

public class ConsultasBBDD {

    public static void main (String[] args) {
        ConsultasBBDD programa = new ConsultasBBDD();
//        programa.consulta_selectCatalogws();
//        programa.consulta_InsertCatalogws();
//        boolean prueba = programa.comprobarExistenciaDelProducto("19999");
//        System.out.println("El resultado es: " + prueba);
    }
    
    public boolean comprobarExistenciaDelProducto(String modeloBuscado) {
        // Buscar el modelo en cuestión en la tabla producto (productos sin talla)
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "tester", "tester");
            Statement consulta = (Statement) c.createStatement();
            ResultSet consultaProducts = consulta.executeQuery("SELECT products_model FROM products;");
//            ResultSet consultaRelaciones = consulta.executeQuery("SELECT num_modelo_original FROM relacion_tallas_modelos");
            
            boolean resultado = false;
            
            while (consultaProducts.next()) {
                String modeloEnBBDD = consultaProducts.getString("products_model");
                if (modeloBuscado.equalsIgnoreCase(modeloEnBBDD)) {
                    resultado = true;
                }
            }
//            while (consultaRelaciones.next()) {
//                String modeloEnBBDD = consultaRelaciones.getString("num_modelo_original");
//                if (modeloBuscado.equalsIgnoreCase(modeloEnBBDD)) {
//                    resultado = true;
//                }
//            }
            return resultado;
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL");
            return false;
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver");
            return false;
        }
    }
    
    public void consulta_selectCatalogws() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "tester", "tester");
            Statement consulta = (Statement) c.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM tags");
        
            int columna_tag_id = resultado.findColumn("tag_id");
            int columna_tag_text = resultado.findColumn("tag_text");
            boolean quedanRegistros = resultado.next();
            
            while (quedanRegistros) {

                quedanRegistros = resultado.next(); //se verifica si hay otro registro
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL");
        } catch (ClassNotFoundException ex2){
            System.out.println("No se pudo cargar el driver");
        }
    }
    
    public void consulta_InsertCatalogws(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "tester", "tester");
            Statement consulta = (Statement) c.createStatement();
            int resultado = consulta.executeUpdate("INSERT INTO tags (tag_id, tag_text) VALUES (19, 'Flautas')");
        
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL");
        
        } catch (ClassNotFoundException ex2){
            System.out.println("No se pudo cargar el driver");
        }
    }    
    
}