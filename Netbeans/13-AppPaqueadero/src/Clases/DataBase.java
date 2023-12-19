
package Clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DataBase {
    Connection conexion;
    Statement manipularDB;
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_parqueadero";
        String user = "root";
        String password = "";

        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
            this.conexion = DriverManager.getConnection(url, user, password);
            this.manipularDB = this.conexion.createStatement();
            System.out.println("Conexion Exitosa a Base de Datos "+databasename);
        } catch (SQLException ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        }  
    }
    public boolean insertarPersona(String cedula,String nombre,String apellidos,String telefono,String email){
        boolean respuesta = false;
        
        try {
            String consulta = "INSERT INTO usuarios (cedula,nombre,apellido,telefono,email) VALUES ('"+cedula+"','"+nombre+"','"+apellidos+"','"+telefono+"','"+email+"')";
            int resultado = this.manipularDB.executeUpdate(consulta);
            if (resultado == 1){
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());
        }
        return respuesta;
    }
    public boolean updatePeople(String cedula,String nombre,String apellidos,String telefono,String email){
        boolean respuesta = false;
        
        try {
            String consulta = "UPDATE usuarios SET cedula = '"+cedula+"',nombre = '"+nombre+"',apellido = '"+apellidos+"',telefono = '"+telefono+"',email = '"+email+"' WHERE cedula = '"+cedula+"'";
            int resultado = this.manipularDB.executeUpdate(consulta);
            if (resultado == 1){
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
        return respuesta;
    }
    public ResultSet listarPersonas(){
        ResultSet listado = null;
        
        try{
            String consulta = "SELECT * FROM usuarios";
            listado = this.manipularDB.executeQuery(consulta);
            listado.next();
            if(listado.getRow()==1){
                return listado;
            }else{
                return null;
            }
        }catch(SQLException ex){
            System.out.println("no funca");
        }    
        return listado;
    }
    public ResultSet ModificarPersonas(String cedula){
        ResultSet resultado = null;
        
        try {
            String consulta = "SELECT * FROM usuarios WHERE cedula = '"+cedula+"'";
            resultado = this.manipularDB.executeQuery(consulta);
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        return resultado;
    }
    public ResultSet EliminarPersonabuscar(String cedula){
        ResultSet resultado = null;
        try {
            String consulta = "SELECT * FROM usuarios WHERE cedula = '"+cedula+"'";
            resultado = this.manipularDB.executeQuery(consulta);
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        return resultado;
    }
    public boolean EliminarPersona(String cedula){
        boolean respuesta = false;
        try {
            String consulta = "DELETE FROM usuarios WHERE cedula = '"+cedula+"'";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if ( resp_consulta == 1){
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        return respuesta;
    }
}
