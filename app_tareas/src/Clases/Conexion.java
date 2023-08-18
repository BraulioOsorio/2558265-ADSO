/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    Statement manipularDB;
    Connection conexion;
    
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
    public void time(){
        try {
            String uestado = "UPDATE tareas SET estado = 'TIEMPO' WHERE (estado = 'PROCESO' or estado = 'PENDIENTE') and now() > Fecha_fin;";
            manipularDB.executeUpdate(uestado);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    public boolean addTasks(String tarea,String fecha,String id,String hora){
        boolean respuesta = false;        
        try {
            if (hora.equals("24")){
                hora = "0";
            }
            String consulta = "INSERT INTO tareas (tarea,estado,Fecha_inicio,Fecha_fin) VALUES('"+tarea+"','PENDIENTE',now(),'"+fecha+" "+hora+":00:00')";
            int resultado = manipularDB.executeUpdate(consulta);
            String auxiliar = "INSERT INTO user_tareas (id_usuario,id_tarea) VALUES('"+id+"',LAST_INSERT_ID())";
            manipularDB.executeUpdate(auxiliar);                        
            if (resultado == 1) {
                respuesta = true;                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo ingrese la hora en formato 24h");
        }
        
        return respuesta;
    }
    
    public ResultSet tasksPendientes(String id){
        ResultSet listado = null;
        try {
            String consulta = "SELECT * FROM tareas  JOIN user_tareas  ON tareas.id_tarea = user_tareas.id_tarea WHERE user_tareas.id_usuario = '"+id+"' AND tareas.estado = 'PENDIENTE' ORDER BY DATEDIFF(tareas.Fecha_fin, NOW()) ASC"; 
            
            listado = manipularDB.executeQuery(consulta);
            
            listado.next();
        } catch (SQLException e) {
            System.out.println("Error al obtener tareas: "+e.getMessage());
        }
        
        return listado;
    }
    public boolean login(String correo,String pass){
        boolean iniciar = false;
        try {
            String consulta = "SELECT * FROM usuarios WHERE correo = '"+correo+"' and pass = '"+pass+"' ";
            ResultSet resultados = manipularDB.executeQuery(consulta);
            if (resultados.next()) {
                iniciar = true;
            }
        } catch (SQLException e) {
            System.out.println("Error  "+e.getMessage());
        }
        
        return iniciar;
    }
    
    public ResultSet datos(String correo){
        ResultSet listado = null;
        try {
            String consulta = "SELECT * FROM usuarios WHERE correo = '"+correo+"' ";
            listado = manipularDB.executeQuery(consulta);
            listado.next();
            
        } catch (SQLException e) {
            System.out.println("Error al obtener tareas: "+e.getMessage());
        }
        
        return listado;
    }
    
    public ResultSet consultarestado(String tarea){
        ResultSet listado = null;
        try {
            String consulta = "SELECT estado FROM tareas WHERE tarea LIKE '%"+tarea+"' LIMIT 1";
            listado = manipularDB.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println("Error al obtener tareas: "+e.getMessage());
        }
        
        return listado;
    }
    
    
    
    public ResultSet tasksRealizadas(String id){
        ResultSet listado = null;
        try {
            String consulta = "SELECT * FROM tareas  JOIN user_tareas  ON tareas.id_tarea = user_tareas.id_tarea WHERE user_tareas.id_usuario = '"+id+"' AND (tareas.estado = 'REALIZADO' or tareas.estado = 'CANCELAR' or tareas.estado = 'TIEMPO')";
            listado = manipularDB.executeQuery(consulta);
            listado.next();
            
        } catch (SQLException e) {
            System.out.println("Error al obtener tareas: "+e.getMessage());
        }
        
        return listado;
    }
    public ResultSet tasksProceso(String id){
        ResultSet listado = null;
        try { 
            String consulta = "SELECT * FROM tareas  JOIN user_tareas  ON tareas.id_tarea = user_tareas.id_tarea WHERE user_tareas.id_usuario = '"+id+"' AND tareas.estado = 'PROCESO' ORDER BY DATEDIFF(tareas.Fecha_fin, NOW()) ASC";
            listado = manipularDB.executeQuery(consulta);
            listado.next();
            
        } catch (SQLException e) {
            System.out.println("Error al obtener tareas: "+e.getMessage());
        }
        
        return listado;
    }
    
    
    
    
    public boolean removeTasks(String tarea,String estado){
        boolean respuesta = false;
        try {
            String sql = "UPDATE tareas SET estado = '"+estado+"' WHERE tarea LIKE '%"+tarea+"' LIMIT 1";
            int resultado = manipularDB.executeUpdate(sql);
            if (resultado == 1) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar el estado"+e.getMessage());
        }
        return respuesta;
    }
    
    public void updateTasks(String newValue,String tarea){
        
        try {
            String sql = "UPDATE tareas SET tarea = '"+newValue+"' WHERE tarea LIKE '%"+tarea+"' LIMIT 1 ";
            int result = manipularDB.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error al modificar");
        }
    }
    public boolean insertarPersona(String nombre,String email,String pass,String cedula){
        boolean respuesta = false;
        try {
            String consulta = "INSERT INTO usuarios (nombre_user,correo,pass,cedula) VALUES ('"+nombre+"','"+email+"','"+pass+"','"+cedula+"')";
            int resultado = this.manipularDB.executeUpdate(consulta);
            String upda = "UPDATE usuarios SET Icono = '"+cedula+"' WHERE id_usuario = LAST_INSERT_ID()";
            manipularDB.executeUpdate(upda);
            if (resultado == 1){
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());
        }
        return respuesta;
    }
    public ResultSet consultarPersonas(String correo){
        ResultSet resultado = null;
        
        try {
            String consulta = "SELECT * FROM usuarios WHERE correo = '"+correo+"'";
            resultado = this.manipularDB.executeQuery(consulta);
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        return resultado;
    }
    
    public void actualizarDatos(String correoBefore,String correo,String nombre){
        try {
            String consulta = "UPDATE usuarios SET correo = '"+correo+"',nombre_user = '"+nombre+"' WHERE correo = '"+correoBefore+"'";
            manipularDB.executeUpdate(consulta);
        } catch (SQLException e) {
            System.out.println("Error al modificar");
        }
    }
    
    public boolean recuperar(String correo,String pass){
        boolean respuesta = false;
        
        try {
            String consulta = "SELECT * FROM usuarios WHERE correo = '"+correo+"'";
            ResultSet resultado = this.manipularDB.executeQuery(consulta);
            if(resultado.next()){
                String actualizar = "UPDATE usuarios SET pass = '"+pass+"' WHERE correo = '"+correo+"'";
                int valor = manipularDB.executeUpdate(actualizar);
                if (valor == 1) {
                    respuesta = true;
                }
            }

        } catch (Exception e) {
            System.out.println("Error al insertar: "+e.getMessage());
        }
        
        return respuesta;
    }
    
    public ResultSet avgTaks(String id){
       ResultSet listado = null;
        try { 
            String consulta = "SELECT (AVG(tareas.estado='REALIZADO') * 100) AS promedio FROM user_tareas INNER JOIN tareas ON user_tareas.id_tarea = tareas.id_tarea INNER JOIN usuarios ON user_tareas.id_usuario = usuarios.id_usuario WHERE usuarios.id_usuario = "+id +" ";
            listado = manipularDB.executeQuery(consulta);
            listado.next();
            
        } catch (SQLException e) {
            System.out.println("Error al consultar promedio: "+e.getMessage());
        }
        return listado;
    }
}

