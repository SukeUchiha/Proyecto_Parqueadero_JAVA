package proyectoparqueadero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TestConeccion {
    public static void main(String[] args) {
        try {
            // TODO add your handling code here:
            
            //Server SQl

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://systemengine-database.database.windows.net:1433;database=SystemEngine-database;user=systemengine-server@systemengine-database;password={63Z6OOi*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","systemengine-server","63Z6OOi*");
           
            Statement stat = con.createStatement();
            Logger.getLogger(TestConeccion.class.getName()).info("Closing database connection");
            Logger.getLogger(TestConeccion.class.getName()).info("Consult data");

            
            String sql = "SELECT * FROM [dbo].[Usuarios]";
            ResultSet rs = stat.executeQuery(sql);
            System.out.println(sql);
            rs.next();

            do {
                String nombreQuery = rs.getString("Nombre");
                String correoQuery = rs.getString("Correo");
                System.out.println("Nombre encontrado:"+nombreQuery);
                System.out.println("Correo encontrado:"+correoQuery);
                System.out.println("------------------\n");
            } while (rs.next()); 
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestConeccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El vehiculo no se encuentra en el parqueadero, por favor revise la placa ingresada");
            
            Logger.getLogger(TestConeccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
