import javax.swing.*;
import java.awt.*;
public class Interfaz{
    public static void main(String[]args){
        JFrame ventana = new JFrame();
        ventana.setTitle("Hola mundo");
        ventana.setSize(1000,1000);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));

        JLabel etiqueta01 = new JLabel("Etiqueta 01");
        etiqueta01.setFont(new Font("Arial",Font.BOLD,150));
        JLabel etiqueta02 = new JLabel("Etiqueta 02");
        JLabel etiqueta03 = new JLabel("Etiqueta 03");
        JLabel etiqueta04 = new JLabel("Etiqueta 04");
        JLabel etiqueta05 = new JLabel("Etiqueta 05");

        contenedor.add(etiqueta01);
        contenedor.add(etiqueta02);
        contenedor.add(etiqueta03);
        contenedor.add(etiqueta04);
        contenedor.add(etiqueta05);

        ventana.add(contenedor);
        ventana.revalidate();
        ventana.setVisible(true);
    }
}