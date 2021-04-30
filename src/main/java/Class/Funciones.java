/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import Frames.VentanaP;
import ConexionDB.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonjansel
 */
public class Funciones {
    private static ConexionDB.conectar conexion = new conectar();
     private static Connection ConectDB = conexion.getConexion();
     private static PreparedStatement PreStatem = null;
    
     
   public static void guardar(Entidades e) {
          String sql = Querys.Insertar;
        try {
          PreStatem = ConectDB.prepareStatement(sql);   
          PreStatem.setString(1, e.getNombre());
          PreStatem.setString(2, e.getFecha());
          PreStatem.setString(3, e.getHoraInicio());
          PreStatem.setString(4, e.getHoraFin());
          PreStatem.setString(5, e.getLugar());
          PreStatem.setString(6, e.getNota());
          PreStatem.execute();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
         
   public static void modificar(Entidades e) {
          String sql = Querys.Modificar;
        try {
          PreStatem = ConectDB.prepareStatement(sql);   
          PreStatem.setString(1, e.getNombre());
          PreStatem.setString(2, e.getFecha());
          PreStatem.setString(3, e.getHoraInicio());
          PreStatem.setString(4, e.getHoraFin());
          PreStatem.setString(5, e.getLugar());
          PreStatem.setString(6, e.getNota());
          PreStatem.setInt(7, e.getId());
          PreStatem.execute();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
    
      public static void eliminar(Entidades e) {
          String sql = Querys.Eliminar;
        try {
          PreStatem = ConectDB.prepareStatement(sql); 
          PreStatem.setInt(1, e.getId());
          PreStatem.execute();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
    
     public static void Listar(String buscar){
      DefaultTableModel modelo =  (DefaultTableModel)VentanaP.Table.getModel();
         while(modelo.getRowCount() > 0){
          modelo.removeRow(0);
      }
       String query = Querys.ListarDatos;
       String fila[]  = new String[7];
       try{
        Statement Statem = ConectDB.createStatement();
        ResultSet miresult =  Statem.executeQuery(query);
        
      
        
          while(miresult.next()){
          fila[0] = miresult.getString("Id");
          fila[1] = miresult.getString("Nombre");
          fila[2] = miresult.getString("Fecha");
          fila[3] = miresult.getString("HoraInicio");
          fila[4] = miresult.getString("HoraFin");
          fila[5] = miresult.getString("Lugar");
          fila[6] = miresult.getString("Nota");
          modelo.addRow(fila);
           
          }
       }
      catch(Exception e){
          System.out.println("No conecta");
          e.printStackTrace();
      }
        
     
     }
     
     public static void BuscarNombre(String buscar){
     DefaultTableModel modelo =  (DefaultTableModel)VentanaP.Table.getModel();
      
      while(modelo.getRowCount() > 0){
          modelo.removeRow(0);
      }
      String query = "";
      if(buscar.equals("")){
       query = Querys.ListarDatos;
      }else{
          query =  "SELECT * FROM eventos WHERE Nombre LIKE'"+buscar+"%'";
      }
      
      
       String fila[]  = new String[7];
       try{
        Statement Statem = ConectDB.createStatement();
        ResultSet miresult =  Statem.executeQuery(query);
        
      
        
          while(miresult.next()){
          fila[0] = miresult.getString("Id");
          fila[1] = miresult.getString("Nombre");
          fila[2] = miresult.getString("Fecha");
          fila[3] = miresult.getString("HoraInicio");
          fila[4] = miresult.getString("HoraFin");
          fila[5] = miresult.getString("Lugar");
          fila[6] = miresult.getString("Nota");
          modelo.addRow(fila);
           
          }
       }
      catch(Exception e){
          System.out.println("No conecta");
          e.printStackTrace();
      }
        
      
     }
     public static void BuscarFecha(String buscar){
     DefaultTableModel modelo =  (DefaultTableModel)VentanaP.Table.getModel();
      
      while(modelo.getRowCount() > 0){
          modelo.removeRow(0);
      }
      String query = "";
      if(buscar.equals("")){
       query = Querys.ListarDatos;
      }else{
          query =  "SELECT * FROM eventos WHERE Fecha LIKE'"+buscar+"%'";
      }
      
      
       String fila[]  = new String[7];
       try{
        Statement Statem = ConectDB.createStatement();
        ResultSet miresult =  Statem.executeQuery(query);
        
      
        
          while(miresult.next()){
          fila[0] = miresult.getString("Id");
          fila[1] = miresult.getString("Nombre");
          fila[2] = miresult.getString("Fecha");
          fila[3] = miresult.getString("HoraInicio");
          fila[4] = miresult.getString("HoraFin");
          fila[5] = miresult.getString("Lugar");
          fila[6] = miresult.getString("Nota");
          modelo.addRow(fila);
           
          }
       }
      catch(Exception e){
          System.out.println("No conecta");
          e.printStackTrace();
      }
        
      
     }
         public static void BuscarNota(String buscar){
     DefaultTableModel modelo =  (DefaultTableModel)VentanaP.Table.getModel();
      
      while(modelo.getRowCount() > 0){
          modelo.removeRow(0);
      }
      String query = "";
      if(buscar.equals("")){
       query = Querys.ListarDatos;
      }else{
          query =  "SELECT * FROM eventos WHERE Nota LIKE'"+buscar+"%'";
      }
      
      
       String fila[]  = new String[7];
       try{
        Statement Statem = ConectDB.createStatement();
        ResultSet miresult =  Statem.executeQuery(query);
        
      
        
          while(miresult.next()){
          fila[0] = miresult.getString("Id");
          fila[1] = miresult.getString("Nombre");
          fila[2] = miresult.getString("Fecha");
          fila[3] = miresult.getString("HoraInicio");
          fila[4] = miresult.getString("HoraFin");
          fila[5] = miresult.getString("Lugar");
          fila[6] = miresult.getString("Nota");
          modelo.addRow(fila);
           
          }
       }
      catch(Exception e){
          System.out.println("No conecta");
          e.printStackTrace();
      }
        
      
     }

    
     
}

