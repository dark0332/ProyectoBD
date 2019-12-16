
package proyectobd;
import java.sql.*;
class TrabajoFinal
{
    static String bd = "orcl";
    static String login = "system";
    static String password = "SuprPausa1";
    static String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
       Connection conexion = null;
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
           conexion = DriverManager.getConnection(URL,login, password);
           
           if (conexion != null){
               System.out.println("Conexion a la BASE de DATOS ORACLE "+URL+" ...Ok\n");
               conexion.close();
           }
       }
       catch(SQLException err){
           System.out.println(err);
       }
       catch(ClassNotFoundException err){
           System.out.println(err);
       }
            
    }
    
}