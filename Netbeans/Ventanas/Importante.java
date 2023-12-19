import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.LayoutManager;
public class Importante extends JFrame{
    public Importante(){
        initComponents();
    }
    public void initComponents(){
        setTitle("GridBagLayout");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JPanel principal = new JPanel();
        GridBagLayout capaPrincipal = new GridBagLayout();
        principal.setLayout(capaPrincipal);

        GridBagConstraints restriccion = new GridBagConstraints();

        JTextArea areaTexto = new JTextArea();
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridwidth = 2;
        restriccion.gridheight = 2;
        restriccion.weightx=1;
        restriccion.weighty=1;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(areaTexto,restriccion);

        JButton btn1 = new JButton("boton 1");
        restriccion.gridy=0;
        restriccion.gridx=2;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn1,restriccion);

        JButton btn2 = new JButton("boton 2");
        restriccion.gridy=1;
        restriccion.gridx=2;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn2,restriccion);

        JButton btn3 = new JButton("boton 3");
        restriccion.gridy=2;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn3,restriccion);

        JButton btn4 = new JButton("boton 4");
        restriccion.gridy=2;
        restriccion.gridx=2;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn4,restriccion);

        JTextField campo = new JTextField("Campo de texto");
        restriccion.gridy=2;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo,restriccion);





        add(principal);
        revalidate();
        
        
    }
}