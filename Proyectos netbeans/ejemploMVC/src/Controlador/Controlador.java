/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    Vista vista;
    Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.btn_sumar.addActionListener(this);
    }

    
    public void iniciar(){
        vista.setTitle("Ejemplo de MVC");
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNum1( Integer.parseInt(vista.num1.getText() ) );
        modelo.setNum2( Integer.parseInt(vista.num2.getText() ) );
        vista.result.setText(String.valueOf(modelo.sumar()));
    }
    
    
}
