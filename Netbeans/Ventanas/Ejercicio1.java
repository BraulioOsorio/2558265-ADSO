import javax.swing.*;
import java.awt.*;
public class Ejercicio1{
    public static void main(String[]args){
        JFrame ventana = new JFrame();
        ventana.setTitle("Ejercicio 1");
        ventana.setSize(1000,1000);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setLayout( new BoxLayout(contenedor,BoxLayout.Y_AXIS));
        
        JLabel registro = new JLabel("Registro");
        registro.setFont(new Font("Arial",Font.BOLD,20));
        registro.setForeground(Color.RED);
        JLabel documento = new JLabel("Documento");
        JTextField documentos = new JTextField(10);

        JLabel nombre = new JLabel("Nombres");
        JTextField nombres = new JTextField(10);

        JLabel apellido = new JLabel("Apellidos");
        JTextField apellidos = new JTextField(10);
        JButton boton = new JButton("Enviar",null);
        boton.setBackground(Color.RED);
        contenedor.add(registro);
        contenedor.add(documento);
        contenedor.add(documentos);
        contenedor.add(nombre);
        contenedor.add(nombres);
        contenedor.add(apellido);
        contenedor.add(apellidos);
        contenedor.add(boton);

        ventana.add(contenedor);
        ventana.setVisible(true);
        ventana.revalidate();
    } 
}