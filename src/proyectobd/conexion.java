package proyectobd;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {

    public static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; //Direccion, puerto y nombre de la Base de Datos
    public static final String USR = "system"; //Usuario de Acceso a MySQL
    public static final String PASS = "SuprPausa1"; //Password del usuario
    Connection cn = null;

    public Connection getConection() {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection(URL, USR, PASS);

//            if (cn != null) {
//                System.out.println("Conexion Exitosa!!");
//                conexion.close();
//            }
        } catch (SQLException err) {
            System.out.println(err);
        } catch (ClassNotFoundException err) {
            System.out.println(err);
        }
        return cn;
    }

    public Connection close(Connection con, CallableStatement cstm) {
        try {
            if (con != null) {
                con.close();
            }
            if (cstm != null) {
                cstm.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
