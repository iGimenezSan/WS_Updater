package toolbox;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import interfazGrafica.Parametros;


/** Programa:   ConectoresBDD.java - (UTF-8)
  * Autor:      McKyavelik
  * 
**/

public class ConectoresBDD {
    
    private static final Parametros PARAM = new Parametros();
    
        static String Nombre_Driver = PARAM.getDriverName();
        static String urlBaseDatosLocal = PARAM.getURLBaseDatosLocal();
        
        static String BaseDatosLocal = PARAM.getNombreBaseDatosLocal();
        static String NombreUsuarioLocal = PARAM.getNombreUsuarioLocal();
        static String PasswordUsuarioLocal = PARAM.getPasswordUsuarioLocal();


    public String getRutaGlobal() {
        String rutaGlobal = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "root", "root");
            Statement consultador = (Statement) c.createStatement();
            ResultSet resultadoConsulta = consultador.executeQuery( "SELECT valor1 " +
                                                                    "FROM updater_parametros " +
                                                                    "WHERE nombreRegistro = \"Global;\"");
            
            while (resultadoConsulta.next()) {
                rutaGlobal = resultadoConsulta.getString("valor1");
            }
            
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL consultando los datos del Fichero Global: " + ex);
            return null;
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
            return null;
        }
        return rutaGlobal;
    }   
        
    public void actualizarDatosGlobalEnBaseDatos(String[] valores) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "root", "root");
            Statement consultador = (Statement) c.createStatement();
            consultador.executeUpdate("UPDATE updater_parametros SET valor0 = \'" + valores[0] + "\', valor1 = \'" + valores[1] + "\', valor2 = \'" + valores[2] + "\', valor3 = \'" + valores[3] + "\' WHERE nombreRegistro = \'Global\'");
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
        }
    }
        
    public String[] cargarDatosGlobalDesdeBaseDatos() {
        String[] valores = new String[5];
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogws", "root", "root");
            Statement consultador = (Statement) c.createStatement();
            ResultSet resultadoConsulta = consultador.executeQuery("SELECT * FROM updater_parametros WHERE nombreRegistro = \'Global\';");
            
            while (resultadoConsulta.next()) {
                valores[0] = resultadoConsulta.getString("valor0");
                valores[1] = resultadoConsulta.getString("valor1");
                valores[2] = resultadoConsulta.getString("valor2");
                valores[3] = resultadoConsulta.getString("valor3");
            }
            
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL consultando los datos del Fichero Global: " + ex);
            return null;
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
            return null;
        }
        return valores;
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