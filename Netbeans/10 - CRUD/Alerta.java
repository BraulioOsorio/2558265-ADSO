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

public class Alerta extends JFrame{
    String titulo;
    String texto;
    String imagen;
    public Alerta(String titulo, String texto, String imagen){
        this.titulo = titulo;
        this.texto = texto;
        this.imagen = imagen;
        initComponents();
    }
    public void initComponents(){
        Color azulOscuro = new Color(0, 5, 118);
        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") );
        setIconImage(icono);
        setTitle("Alerta");
        setSize(350,180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);

        JPanel principal = new JPanel();
        GridBagLayout capaPrincipal = new GridBagLayout();
        principal.setLayout(capaPrincipal);

        GridBagConstraints restriccion = new GridBagConstraints();

        Image correcto = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_"+imagen+".png"));
        correcto = correcto.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        JLabel  btn1 = new JLabel ();
        btn1.setIcon(new ImageIcon(correcto));
		btn1.setBackground(Color.WHITE);
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        btn1.setBorder(new EmptyBorder(0,20,0,0));
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn1,restriccion);

        
        JLabel dio = new JLabel(titulo);
        dio.setFont(new Font("Aril",Font.BOLD,25));
        dio.setHorizontalAlignment(SwingConstants.CENTER);
        restriccion.gridy=0;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        restriccion.insets = new Insets(0,-10,0,0);
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(dio,restriccion);

        JLabel mensaje = new JLabel(texto);
        mensaje.setFont(new Font("Aril",Font.PLAIN,15));
        mensaje.setHorizontalAlignment(SwingConstants.CENTER);
        restriccion.gridy=1;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(mensaje,restriccion);

        JButton aceptar = new JButton("Aceptar");
        aceptar.setFont(new Font("Aril",Font.BOLD,15));
        aceptar.setOpaque(true);
        aceptar.setForeground( Color.WHITE);
		aceptar.setBackground(azulOscuro);
        restriccion.gridy=2;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        
        restriccion.fill = GridBagConstraints.NORTH;
        
        principal.add(aceptar,restriccion);


        ActionListener close = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        };
        aceptar.addActionListener(close);
        
        add(principal);
        setVisible(true);
        
    }
}