
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
        String databasename = "app_java";
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
    public boolean insertarPersona(String cedula,String nombre,String apellidos,String direccion,String telefono,String email){
        boolean respuesta = false;
        
        try {
            String consulta = "INSERT INTO personas (cedula,nombres,apellidos,telefono,direccion,email) VALUES ('"+cedula+"','"+nombre+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"')";
            int resultado = this.manipularDB.executeUpdate(consulta);
            if (resultado == 1){
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());
        }
        return respuesta;
    }
    public ResultSet listarPersonas(){
        ResultSet listado = null;
        
        try{
            String consulta = "SELECT * FROM personas";
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
    public boolean ModificarPersonas(String cedula){
        boolean respuesta = false;
        
        try {
            String consulta = "SELECT FROM personas WHERE cedula = '"+cedula+"'";
            int resultado = this.manipularDB.executeUpdate(consulta);
            if (resultado == 1){
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());
        }
        return respuesta;
    }
}
