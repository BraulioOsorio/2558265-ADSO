/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.sql.*;

public class Conexion {
    Statement manipularDB;
    Connection conexion;
    boolean respuesta;
    
    public Conexion(){ 
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_tareas";
        String user = "root";
        String password = "";

        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;

        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a Base de Datos "+databasename);
        } catch (SQLException ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
            conexion = null;
            manipularDB = null;
        }
    }
    
    public boolean addTasks(String tarea){
        boolean respuesta = false;
        
        try {
            String consulta = "INSERT INTO tareas (tarea,estado) VALUES('"+tarea+"','0')";
            int resultado = manipularDB.executeUpdate(consulta);
            if (resultado == 1) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar: "+e.getMessage());
        }
        
        return respuesta;
    }
    
    public ResultSet tasksPendientes(){
        ResultSet listado = null;
        try {
            String consulta = "SELECT * FROM tareas WHERE estado = 0";   
            listado = manipularDB.executeQuery(consulta);
            listado.next();
        } catch (Exception e) {
            System.out.println("Error al obtener tareas: "+e.getMessage());
        }
        
        return listado;
    }
    
    public ResultSet tasksRealizadas(){
        ResultSet listado = null;
        try {
            String consulta = "SELECT * FROM tareas WHERE estado = 1";
            listado = manipularDB.executeQuery(consulta);
            listado.next();
            
        } catch (Exception e) {
            System.out.println("Error al obtener tareas: "+e.getMessage());
        }
        
        return listado;
    }
    
    public boolean EstadoPendi(String tarea){
        boolean respuesta = false;
        
        try {
            
            String consulta = "UPDATE tareas SET estado = 0 WHERE tarea = '"+tarea+"' ";
            int resultado = manipularDB.executeUpdate(consulta);
            if(resultado == 1){
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        return respuesta;
    }
    
    public boolean EstadoReali(String tarea){
        boolean respuesta = false;
        
        try {
          
            String consulta = "UPDATE tareas SET estado = 1 WHERE tarea = '"+tarea+"' ";
            int resultado = manipularDB.executeUpdate(consulta);
            if(resultado == 1){
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        return respuesta;
    }
    
    public boolean removeTasks(String tarea){
        boolean respuesta = false;
        try {
            String sql = "DELETE FROM tareas WHERE tarea LIKE '%"+tarea+"' LIMIT 1";
            int resultado = manipularDB.executeUpdate(sql);
            if (resultado == 1) {
                respuesta = true;
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar"+e.getMessage());
        }
        return respuesta;
    }
    
    public void updateTasks(String newValue,String tarea){
        try {
            String sql = "UPDATE tareas SET tarea = '"+newValue+"' WHERE tarea LIKE '%"+tarea+"' LIMIT 1 ";
            int result = manipularDB.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error al modificar");
        }
    }
}

