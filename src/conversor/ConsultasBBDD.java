package conversor;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/** Programa:   ConsultasBBDD.java - (UTF-8)
  * Autor:      McKyavelik
  * 
**/

public class ConsultasBBDD {
    
        // JDBC driver name and database URL
        static String driverName = "com.mysql.jdbc.Driver";
        static String url = "jdbc:mysql://localhost:3306/";

        // defined and set value in  dbName, userName and password variables
        static String dbName = "catalogws";
        static String userName = "root";
        static String password = "root"; 

//    /*
//     * Bloque main extra para pruebas de conexión con la base de datos.
//     */
    public static void main (String[] args) {
        ConsultasBBDD programa = new ConsultasBBDD();
        programa.consultaPrueba();
    }
    
    public void consultaPrueba () {
        
        try {
            Class.forName(driverName);
            Connection c = (Connection) DriverManager.getConnection(url+dbName, userName, password);
            Statement consulta = (Statement) c.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM panel_control_usuarios WHERE id_usuario = '1'");
            
            while (resultado.next()) {
                System.out.println("Nombre de usuario = " + resultado.getObject("nombre_usuario"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultasBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    ////////////////////////////////////
    //////                      ////////
    //////      OLD             ////////
    //////                      ////////
    ////////////////////////////////////
    

    public boolean mirarSiExisteEnTablaRelaciones (String modeloBuscado) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "tester", "tester");
            Statement consulta = (Statement) c.createStatement();
            ResultSet consultaRelaciones = consulta.executeQuery("SELECT num_modelo_original FROM relacion_tallas_modelos");
            
            boolean resultado = false;
            
            while (consultaRelaciones.next()) {
                String modeloEnBBDD = consultaRelaciones.getString("num_modelo_original");
                if (modeloBuscado.equalsIgnoreCase(modeloEnBBDD)) {
                    resultado = true;
                }
            }
            return resultado;
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL buscando en relaciones: " + ex);
            return false;
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
            return false;
        }
    }

    String obtenerIdProducto(String codigoProducto) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "tester", "tester");
            Statement consultador = (Statement) c.createStatement();
            ResultSet resultadoConsulta = consultador.executeQuery("SELECT products_id FROM products WHERE products_model LIKE '" + codigoProducto + "'");
            String resultado = "";
            while (resultadoConsulta.next()) {
                resultado = resultadoConsulta.getString("products_id");
            }
            return resultado;
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL buscando en productos: " + codigoProducto + " // " + ex);
            return "";
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
            return "";
        }
    }

    public void actualizarProductoAntiguo(String idProducto, String precio, String stock_disponible) {
        actualizarPrecio(idProducto, precio);
        actualizarStock(idProducto, stock_disponible);
    }

    private void actualizarPrecio(String idProducto, String precio) {
        
      //  precio = PRO.cambiarFormato_Precio(precio);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "tester", "tester");
            Statement consultador = (Statement) c.createStatement();
            consultador.executeUpdate("UPDATE products SET products_price = " + precio + " WHERE products_id LIKE '" + idProducto + "'");
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL buscando en productos: " + ex);
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
        }
    }

    private void actualizarStock(String idProducto, String stock_disponible) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "tester", "tester");
            Statement consultador = (Statement) c.createStatement();
            consultador.executeUpdate("UPDATE products SET products_quantity = " + stock_disponible + " WHERE products_id LIKE '" + idProducto + "'");
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL buscando en productos: " + ex);
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
        }
    }

}