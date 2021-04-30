package ConexionDB;
import java.sql.*;
public class conectar{

  private static String Database = "itla";
  private static String User = "root";
  private static String Pass = "";
  private static String Host = "localhost:3306";
  private static String Server = "jdbc:mysql://"+Host+"/"+Database;
  public static Connection conexion = null;
 
  
  public Connection getConexion(){
  
      try{
          conexion = DriverManager.getConnection(Server, User, Pass);
           System.out.println("CONEXION");
            return conexion;
      }catch(Exception e){
          System.out.println(String.valueOf(e));
           return null;
      }
      
     
  }
}