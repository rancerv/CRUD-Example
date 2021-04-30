/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Jhonjansel
 */
public class Querys {
    public static String ListarDatos = "SELECT * FROM eventos";
    public static String Insertar = "INSERT INTO eventos (Nombre,Fecha,HoraInicio,HoraFin,Lugar,Nota)VALUES(?,?,?,?,?,?)";
    public static String Modificar = "UPDATE eventos SET Nombre = ?,Fecha = ?,HoraInicio = ?,HoraFin = ?,Lugar = ?,Nota = ? WHERE Id = ?";
    public static String Eliminar = "DELETE FROM eventos WHERE Id = ?";  
 
 
}
