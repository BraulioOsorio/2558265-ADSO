/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Conexion {
    Statement manipularDB;
    boolean respuesta;
    public Conexion(){ }

    public void getConnection(){
        Connection conexion;    // Objeto de conexion.
        //Statement manipularDB;  // Objeto para ejecutar consultas.

        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_parqueadero";
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

    public Boolean insert(String doc,String nom,String ape,String tel,String email){
        respuesta = false;
        try {
            String consulta = "INSERT INTO usuarios (cedula, nombre, apellido, telefono, email) VALUES ('"+doc+"','"+nom+"','"+ape+"','"+tel+"','"+email+"')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Insertado con exito");
        }else{
            System.out.println("No se pudo insertar");
        }

        return respuesta;
    }

    public Boolean update(String document,String nom,String ape,String tel,String correo){
        respuesta = false;
        try {
            String consulta = "UPDATE usuarios SET nombre='"+nom+"', apellido='"+ape+"', telefono='"+tel+"', email='"+correo+"' WHERE cedula ='"+document+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Editado con exito");
        }else{
            System.out.println("No se pudo Editar");
        }
        return respuesta;
    }

    public Boolean delete(String document){
        respuesta = false;
        try {
            
            String consulta = "DELETE FROM usuarios WHERE cedula = '"+document+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
    }
    
    public Boolean consultaCliente(String cedula){
        getConnection();
        Boolean respuesta = false;
        try {
            String consulta = "SELECT * FROM usuarios WHERE cedula = '"+cedula+"' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            respuesta = true;
        } catch (Exception e) {
            respuesta = false;
        }
        return respuesta;
    }

    public void getUsers(JTable tabla){
        
        try {
            String consulta = "SELECT * FROM usuarios";
            ResultSet registros = manipularDB.executeQuery(consulta);
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            while (registros.next()) {
                Object[] dato = new Object[]{registros.getString("cedula"),registros.getString("nombre"),registros.getString("apellido"),registros.getString("telefono"),registros.getString("email")};
                modelo.addRow(dato);
            }
            System.out.println("usuarios impresos exitosamentes");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    
    public void llenarInputs(String document,JTextField inputNombre,JTextField inputApe,JTextField inputTel,JTextField inputEmail,JButton btn){
        try {
            System.out.println("Encontrado");
            String consulta = "SELECT * FROM usuarios WHERE cedula = '"+document+"' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            
            inputNombre.setText(registros.getString("nombre"));
            inputApe.setText(registros.getString("apellido"));
            inputTel.setText(registros.getString("telefono"));
            inputEmail.setText(registros.getString("email"));
            btn.setEnabled(true);
        } catch (Exception e) {
            System.out.println("No encontrado: "+e.getMessage());
            inputNombre.setText("");
            inputApe.setText("");
            inputTel.setText("");
            inputEmail.setText("");
            btn.setEnabled(false);
        }
            
    }
}

