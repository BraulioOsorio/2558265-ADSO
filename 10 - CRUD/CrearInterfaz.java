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

public class CrearInterfaz extends JFrame{

    public CrearInterfaz(){
        initComponents();
    }
    public void initComponents(){
        Color azulOscuro = new Color(0, 5, 118);
        Color raro = new Color(140, 140, 255);
        Border borde = BorderFactory.createLineBorder(Color.RED, 1);
        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") );
        setIconImage(icono);
        setTitle("Usuarios");
        setSize(360,405);
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
        JLabel texto_inicial = new JLabel("CREAR USUARIO");
        texto_inicial.setFont(new Font("Aril",Font.BOLD,25));
        texto_inicial.setOpaque(true);
        texto_inicial.setForeground( Color.WHITE);
		texto_inicial.setBackground(azulOscuro);
        texto_inicial.setHorizontalAlignment(SwingConstants.CENTER);
        texto_inicial.setBorder(new EmptyBorder(4,0,4,0));
        texto_menu.add(texto_inicial);

        JPanel panelBotones = new JPanel(new GridBagLayout());
        panelBotones.setBackground(raro);

        JLabel cedula_cliente = new JLabel("Cedula :");
        cedula_cliente.setFont(new Font("Aril",Font.BOLD,15));
        restriccion.insets = new Insets(0,10,0,0);
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(cedula_cliente,restriccion);

        JTextField campo_cedula = new JTextField();
        restriccion.gridy=0;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        campo_cedula.setBorder(new EmptyBorder(7,0,7,0));
        restriccion.insets = new Insets(5,0,5,0);
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_cedula,restriccion);
        
        JLabel nombres_cliente = new JLabel("Nombres :");
        nombres_cliente.setFont(new Font("Aril",Font.BOLD,15));
        restriccion.insets = new Insets(0,10,0,25);
        restriccion.gridy=1;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(nombres_cliente,restriccion);

        JTextField campo_nombre = new JTextField();
        restriccion.gridy=1;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        campo_nombre.setBorder(new EmptyBorder(7,0,7,0));
        restriccion.insets = new Insets(5,0,5,0);
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_nombre,restriccion);

        JLabel apellidos_clientes = new JLabel("Apellidos :");
        apellidos_clientes.setFont(new Font("Aril",Font.BOLD,15));
        restriccion.insets = new Insets(0,10,0,0);
        restriccion.gridy=2;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(apellidos_clientes,restriccion);

        JTextField campo_apellidos = new JTextField();
        restriccion.gridy=2;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        campo_apellidos.setBorder(new EmptyBorder(7,0,7,0));
        restriccion.insets = new Insets(5,0,5,0);
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_apellidos,restriccion);

        JLabel telefono_clientes = new JLabel("Teléfono :");
        telefono_clientes.setFont(new Font("Aril",Font.BOLD,15));
        restriccion.insets = new Insets(0,10,0,0);
        restriccion.gridy=3;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(telefono_clientes,restriccion);

        JTextField campo_telefono = new JTextField();
        restriccion.gridy=3;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        campo_telefono.setBorder(new EmptyBorder(7,0,7,0));
        restriccion.insets = new Insets(5,0,5,0);
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_telefono,restriccion);

        JLabel direccion_clientes = new JLabel("Dirección :");
        direccion_clientes.setFont(new Font("Aril",Font.BOLD,15));
        restriccion.insets = new Insets(0,10,0,0);
        restriccion.gridy=4;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(direccion_clientes,restriccion);

        JTextField campo_direccion = new JTextField();
        restriccion.gridy=4;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        campo_direccion.setBorder(new EmptyBorder(7,0,7,0));
        restriccion.insets = new Insets(5,0,5,0);
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_direccion,restriccion);


        JLabel email_clientes = new JLabel("Email :");
        email_clientes.setFont(new Font("Aril",Font.BOLD,15));
        restriccion.insets = new Insets(0,10,0,0);
        restriccion.gridy=5;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(email_clientes,restriccion);

        JTextField campo_email = new JTextField();
        restriccion.gridy=5;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        campo_email.setBorder(new EmptyBorder(7,0,7,200));
        restriccion.insets = new Insets(5,0,5,0);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_email,restriccion);

        JPanel botones = new JPanel();
        botones.setBackground(raro);
        JButton btn1 = new JButton("CANCELAR");
        btn1.setFont(new Font("Aril",Font.BOLD,17));
        btn1.setOpaque(true);
        btn1.setForeground( Color.BLACK);
		btn1.setBackground(Color.GRAY);
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        botones.add(btn1,restriccion);

        // linea 3
        JButton btn2 = new JButton("REGISTRAR");
        btn2.setFont(new Font("Aril",Font.BOLD,17));
        btn2.setOpaque(true);
        btn2.setForeground( Color.WHITE);
		btn2.setBackground(azulOscuro);
        restriccion.gridy=1;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        
        
        botones.add(btn2,restriccion);

        principal.add(botones,BorderLayout.SOUTH);
        principal.add(texto_menu,BorderLayout.NORTH);
        principal.add(panelBotones);
        add(principal);
        setVisible(true);

        ActionListener cancelar = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                dispose();
				respaldo vamo = new respaldo();
			}
		};
        ActionListener crear = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String cedula = campo_cedula.getText();
                String nombres = campo_nombre.getText();
                String apellidos = campo_apellidos.getText();
                String telefono = campo_telefono.getText();
                String direccion = campo_direccion.getText();
                String email = campo_email.getText();
                if (cedula.length() == 0 || nombres.length() == 0 || apellidos.length() == 0 || telefono.length() == 0 || direccion.length() == 0 || email.length() == 0 ) {
                    
                    if(cedula.length() == 0 ){
                        campo_cedula.setBorder(borde);
                    }
                    if(nombres.length() == 0 ){
                        campo_nombre.setBorder(borde);
                    }
                    if(apellidos.length() == 0 ){
                        campo_apellidos.setBorder(borde);
                    }
                    if(telefono.length() == 0 ){
                        campo_telefono.setBorder(borde);
                    }
                    if(direccion.length() == 0 ){
                        campo_direccion.setBorder(borde);
                    }
                    if(email.length() == 0 ){
                        campo_email.setBorder(borde);
                    }
                    
                } else {
                    Procesos procesos = new Procesos(); 
                    procesos.CrearUsuario(cedula,nombres,apellidos,telefono,direccion,email);
                    respaldo vamo = new respaldo();
                    dispose();
                    AlertaCorrecta alertaBuena = new AlertaCorrecta();
                }
            }
        };
		btn1.addActionListener( cancelar );
        btn2.addActionListener( crear );
        
    }   
}