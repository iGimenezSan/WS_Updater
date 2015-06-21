package toolbox;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
                                                                                                                            

/** Programa:   Conectores.java - (UTF-8)
 Autor:      McKyavelik
  * 
**/

public class Conectores {
    
    public static Parametros PARAM = new Parametros();
    public static Utilidades UTIL = new Utilidades();
    
    public int obtenerCantidadColumnas () {
        int cantidadColumnas;
        ResultSetMetaData metaDatos;
        
        try {
            Class.forName(PARAM.getDriverName());
            Connection c = (Connection) DriverManager.getConnection(PARAM.getURL_Local() + PARAM.getNombreDB_Local(), PARAM.getUsuario_Local(), PARAM.getPasswordDB_Local());
            Statement consultador = (Statement) c.createStatement();
            ResultSet resultadoConsulta = consultador.executeQuery("SELECT * FROM wsu_global_sin_tallas");
            
            metaDatos = resultadoConsulta.getMetaData();
            cantidadColumnas = metaDatos.getColumnCount();
            
        } catch (SQLException ex) {
            System.out.println("Hubo un error con los comandos SQL consultando los datos del Fichero Global: " + ex);
            return 0;
        } catch (ClassNotFoundException ex2) {
            System.out.println("No se pudo cargar el driver: " + ex2);
            return 0;
        }
        return cantidadColumnas;
    }
    

    
    ////////////////////////////////////
    //////                      ////////
    //////      help            ////////
    //////                      ////////
    ////////////////////////////////////
    
    public String[] consultaSELECT() {
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
    
    private void consultaUPDATE(String idProducto, String precio) {
        
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

}