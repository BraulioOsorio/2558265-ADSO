/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import clases.Conexion;

public class Principal {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Login v1 = new Login(conexion);
        v1.setVisible(true);
        v1.setResizable(false);
        v1.setLocationRelativeTo(null);
    }
    
    

}
