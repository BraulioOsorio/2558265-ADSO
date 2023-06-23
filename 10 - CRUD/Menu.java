import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.LayoutManager;
import java.util.Currency;
import javax.swing.event.DocumentListener;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicButtonUI;
import java.lang.reflect.Field;

public class Menu extends JFrame{

    public Menu(){
        initComponents();
    }
    public void initComponents(){
        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") );
        setIconImage(icono);
        setTitle("Usuarios");
        setSize(545,695);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel principal = new JPanel();
        GridBagLayout capaPrincipal = new GridBagLayout();
        principal.setLayout(capaPrincipal);

        GridBagConstraints restriccion = new GridBagConstraints();
        // linea 1
        JLabel texto_inicial = new JLabel("Menú");
        texto_inicial.setFont(new Font("Aril",Font.BOLD,20));
        texto_inicial.setOpaque(true);
        texto_inicial.setForeground( Color.WHITE);
		texto_inicial.setBackground( Color.BLUE );
        texto_inicial.setHorizontalAlignment(SwingConstants.CENTER);
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(texto_inicial,restriccion);

        JButton btn1 = new JButton("Crear Usuario");
        restriccion.gridy=1;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        btn1.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.insets = new Insets(0,10,0,0);
        restriccion.fill = GridBagConstraints.CENTER;
        principal.add(btn1,restriccion);

        // linea 3
        JButton btn2 = new JButton("Modificar Usuario");
        restriccion.gridy=2;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(btn2,restriccion);

         JButton btn3 = new JButton("Eliminar Usuario");
        restriccion.gridy=3;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(btn3,restriccion);

        //LINEA 4
        JButton btn4 = new JButton("Listar Usuario");
        restriccion.gridy=4;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(btn4,restriccion);

        


        
        add(principal);
        setVisible(true);
        
    }

    

    
    
    
}