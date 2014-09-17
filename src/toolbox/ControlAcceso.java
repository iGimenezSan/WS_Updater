package toolbox;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iGimenezSan
 */
public class ControlAcceso {
    
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
//    public static void main (String[] args) {
//        ControlAcceso programa = new ControlAcceso();
//        programa.consultarUsuarios();
//    }
    
    public void consultarUsuarios (String username, String contraseña) {
        
        String query = "SELECT " + username + " FROM panel_control_usuarios;";
        boolean accesoConcedido;
        try {
            Class.forName(driverName);
            Connection c = (Connection) DriverManager.getConnection(url+dbName, userName, password);
            Statement consulta = (Statement) c.createStatement();
            boolean prueba = consulta.execute(query);
            if (prueba == true) {
                accesoConcedido = true;
            } else { 
                accesoConcedido = false;
            }
            confirmarEntrada (accesoConcedido);
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void confirmarEntrada(boolean accesoConcedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
