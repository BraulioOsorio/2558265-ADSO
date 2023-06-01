import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.LayoutManager;
public class VentanaVideo extends JFrame{
    public VentanaVideo(){
        initComponents();
    }
    public void initComponents(){
        setTitle("Actividad del Video");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        JPanel contenedor = new JPanel();
        BorderLayout capa = new BorderLayout();
        contenedor.setLayout(capa);
        
        JPanel contenedorAl= new JPanel();
        JButton set1 = new JButton("set1");
        JButton set2 = new JButton("set2");
        JButton set3 = new JButton("set3");
        JButton set4 = new JButton("set4");
        contenedorAl.add(set1);
        contenedorAl.add(set2);
        contenedorAl.add(set3);
        contenedorAl.add(set4);

        JPanel contenedorAb= new JPanel();
        contenedorAb.setOpaque(true);
        contenedorAb.setBackground(Color.blue);
        FlowLayout capa0 = new FlowLayout();
        contenedorAb.setLayout(capa0);
        JTextField campo = new JTextField();
        JLabel texto = new JLabel("texto");
        campo.setColumns(15);
        JButton listo = new JButton("Listo");
        contenedorAb.add(texto);
        contenedorAb.add(campo);
        contenedorAb.add(listo);

        JPanel contenedorLateral1 = new JPanel();
        JPanel contenedorLateral2 = new JPanel();
        BoxLayout capa3 = new BoxLayout(contenedorLateral1,BoxLayout.Y_AXIS);
        BoxLayout capa4 = new BoxLayout(contenedorLateral2,BoxLayout.Y_AXIS);
        contenedorLateral1.setLayout(capa3);
        contenedorLateral2.setLayout(capa4);
        JButton uno = new JButton("1");
        JButton dos = new JButton("2");
        JButton tres = new JButton("3");
        JButton A = new JButton("a");
        JButton B = new JButton("b");
        JButton C = new JButton("c");
        JButton D = new JButton("d");

        contenedorLateral1.add(uno);
        contenedorLateral1.add(dos);
        contenedorLateral1.add(tres);
        contenedorLateral2.add(A);
        contenedorLateral2.add(B);
        contenedorLateral2.add(C);
        contenedorLateral2.add(D);


        contenedor.add(contenedorLateral1,BorderLayout.WEST);
        contenedor.add(contenedorLateral2,BorderLayout.EAST);
        contenedor.add(contenedorAl,BorderLayout.NORTH);
        contenedor.add(contenedorAb,BorderLayout.SOUTH);
        add(contenedor);



        revalidate();
        pack();
        
    }
}