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

public class respaldo extends JFrame{
    public respaldo(){
        initComponents();
        
    }
    public void initComponents(){
        Color azulOscuro = new Color(0, 5, 118);
        Color raro = new Color(140, 140, 255);
        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") );
        setIconImage(icono);
        setTitle("Usuarios");
        setSize(445,395);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel principal = new JPanel();
        BorderLayout capaPrincipal = new BorderLayout();
        principal.setLayout(capaPrincipal);
        GridBagConstraints restriccion = new GridBagConstraints();


        // linea 1
        JPanel texto_menu = new JPanel();
        texto_menu.setBackground(azulOscuro);
        texto_menu.setBorder(new MatteBorder(0, 0, 5, 0, Color.WHITE)); 
        JLabel texto_inicial = new JLabel("Menú");
        texto_inicial.setFont(new Font("Aril",Font.BOLD,50));
        texto_inicial.setOpaque(true);
        texto_inicial.setForeground( Color.WHITE);
		texto_inicial.setBackground(azulOscuro);
        texto_inicial.setHorizontalAlignment(SwingConstants.CENTER);
        texto_inicial.setBorder(new EmptyBorder(4,0,4,0));
        texto_menu.add(texto_inicial);

        JPanel panelBotones = new JPanel(new GridBagLayout());
        panelBotones.setBackground(raro);
        JButton btn1 = new JButton("Crear Usuario");
        btn1.setFont(new Font("Aril",Font.BOLD,19));
        btn1.setOpaque(true);
        btn1.setForeground( Color.WHITE);
		btn1.setBackground(azulOscuro);
        restriccion.gridy=1;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.insets = new Insets(60,0,0,0);
        btn1.setBorder(new EmptyBorder(7,50,7,50));
        restriccion.fill = GridBagConstraints.CENTER;
        panelBotones.add(btn1,restriccion);

        // linea 3
        JButton btn2 = new JButton("Modificar Usuario");
        btn2.setFont(new Font("Aril",Font.BOLD,19));
        btn2.setOpaque(true);
        btn2.setForeground( Color.WHITE);
		btn2.setBackground(azulOscuro);
        restriccion.gridy=2;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.insets = new Insets(7,0,0,0);
        btn2.setBorder(new EmptyBorder(7,32,7,33));
        restriccion.fill = GridBagConstraints.CENTER;
        panelBotones.add(btn2,restriccion);

        JButton btn3 = new JButton("Eliminar Usuario");
        btn3.setFont(new Font("Aril",Font.BOLD,19));
        btn3.setOpaque(true);
        btn3.setForeground( Color.WHITE);
		btn3.setBackground(azulOscuro);
        restriccion.gridy=3;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        btn3.setBorder(new EmptyBorder(7,38,7,38));
        restriccion.insets = new Insets(7,0,0,0);
        restriccion.fill = GridBagConstraints.CENTER;
        panelBotones.add(btn3,restriccion);
        //LINEA 4
        JButton btn4 = new JButton("Listar Usuario");
        btn4.setFont(new Font("Aril",Font.BOLD,19));
        btn4.setOpaque(true);
        btn4.setForeground( Color.WHITE);
		btn4.setBackground(azulOscuro);
        restriccion.gridy=4;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        btn4.setBorder(new EmptyBorder(7,49,7,50));
        restriccion.insets = new Insets(7,0,49,0);
        restriccion.fill = GridBagConstraints.CENTER;
        panelBotones.add(btn4,restriccion);

        principal.add(texto_menu,BorderLayout.NORTH);
        principal.add(panelBotones,BorderLayout.CENTER);
        add(principal);
        setVisible(true);
        ActionListener crearUsuario = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                dispose();
				CrearInterfaz vamo = new CrearInterfaz();
			}
		};
		
        ActionListener ModificarUsuario = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                dispose();
				ModificarInterfaz vamo = new ModificarInterfaz();
			}
		};
        ActionListener EliminarUsuario = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                dispose();
				EliminarUsuario vamo = new EliminarUsuario();
			}
		};
        ActionListener Listar = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                dispose();
				Listar vamo = new Listar();
			}
		};
        btn1.addActionListener( crearUsuario );
		btn2.addActionListener( ModificarUsuario );
        btn3.addActionListener( EliminarUsuario );
        btn4.addActionListener( Listar );
        
    }

    

    
    
    
}