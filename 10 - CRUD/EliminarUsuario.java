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

public class EliminarUsuario extends JFrame{
    Clientes arrayClientes[];
    Respaldo menuPrincipal;
    public EliminarUsuario(Respaldo respaldo ,Clientes arrayClientesM[]){
        this.menuPrincipal = respaldo;
        this.arrayClientes = arrayClientesM;
        initComponents();
    }
    public void initComponents(){
        Procesos procesos = new Procesos(arrayClientes);
        Color azulOscuro = new Color(0, 5, 118);
        Color raro = new Color(140, 140, 255);
        Color inputEliminar = new Color(128, 120, 87);

        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") );
        setIconImage(icono);
        setTitle("Usuarios");
        setSize(460,460);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel principal = new JPanel();
        BorderLayout capaPrincipal = new BorderLayout();
        principal.setLayout(capaPrincipal);
        GridBagConstraints restriccion = new GridBagConstraints();


        // linea 1
        JPanel texto_menu = new JPanel();
        texto_menu.setBackground(azulOscuro);
        texto_menu.setBorder(new MatteBorder(0, 0, 5, 0, Color.WHITE)); 

        JLabel texto_inicial = new JLabel("ELIMINAR USUARIO");
        texto_inicial.setFont(new Font("Aril",Font.BOLD,27));
        texto_inicial.setOpaque(true);
        texto_inicial.setForeground( Color.WHITE);
		texto_inicial.setBackground(azulOscuro);
        texto_inicial.setHorizontalAlignment(SwingConstants.CENTER);
        texto_inicial.setBorder(new EmptyBorder(3,0,3,0));
        texto_menu.add(texto_inicial);

        JPanel panelBotones = new JPanel(new GridBagLayout());
        panelBotones.setBorder(new EmptyBorder(20,0,0,0));
        panelBotones.setBackground(raro);

        JLabel cedula_cliente = new JLabel("Cedula:");
        cedula_cliente.setFont(new Font("Aril",Font.BOLD,20));
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.insets = new Insets(0,30,0,0);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(cedula_cliente,restriccion);

        JTextField campo_cedula = new JTextField();
        restriccion.gridy=0;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        restriccion.insets = new Insets(3,-50,3,10);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_cedula,restriccion);

        JButton btnBuscar = new JButton("BUSCAR");
        btnBuscar.setFont(new Font("Aril",Font.BOLD,17));
        btnBuscar.setForeground( Color.WHITE);
        btnBuscar.setBackground(azulOscuro);
        restriccion.gridy=0;
        restriccion.gridx=2;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        btnBuscar.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.insets = new Insets(0,0,0,50);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(btnBuscar,restriccion);

        JLabel usuarios_encontrados = new JLabel("Usuario encontrado :");
        usuarios_encontrados.setBorder(new MatteBorder(1,0, 0, 0, Color.WHITE)); 
        usuarios_encontrados.setFont(new Font("Aril",Font.PLAIN,13));
        restriccion.gridy=1;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=3;
        restriccion.weightx=0;
        restriccion.weighty=3;
        restriccion.insets = new Insets(10,20,10,20);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(usuarios_encontrados,restriccion);
        
        JLabel nombres_cliente = new JLabel("Nombres :");
        nombres_cliente.setFont(new Font("Aril",Font.BOLD,19));
        restriccion.gridy=2;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.insets = new Insets(0,60,0,0);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(nombres_cliente,restriccion);

        JTextField campo_nombre = new JTextField();
        campo_nombre.setBackground(inputEliminar);
        campo_nombre.setDisabledTextColor(Color.DARK_GRAY);
        campo_nombre.setEnabled(false);
        restriccion.gridy=2;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        campo_nombre.setBorder(new EmptyBorder(7,7,7,0));
        restriccion.insets = new Insets(0,20,5,-70);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_nombre,restriccion);

        JLabel apellidos_clientes = new JLabel("Apellidos :");
        apellidos_clientes.setFont(new Font("Aril",Font.BOLD,19));
        restriccion.gridy=3;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.insets = new Insets(0,60,0,0);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(apellidos_clientes,restriccion);

        JTextField campo_apellidos = new JTextField();
        campo_apellidos.setEnabled(false);
        campo_apellidos.setBackground(inputEliminar);
        campo_apellidos.setDisabledTextColor(Color.DARK_GRAY);
        restriccion.gridy=3;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        campo_apellidos.setBorder(new EmptyBorder(7,7,7,0));
        restriccion.insets = new Insets(0,20,5,-70);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_apellidos,restriccion);

        JLabel telefono_clientes = new JLabel("Teléfono :");
        telefono_clientes.setFont(new Font("Aril",Font.BOLD,19));
        restriccion.gridy=4;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.insets = new Insets(0,60,0,0);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(telefono_clientes,restriccion);

        JTextField campo_telefono = new JTextField();
        campo_telefono.setEnabled(false);
        campo_telefono.setDisabledTextColor(Color.DARK_GRAY);
        campo_telefono.setBackground(inputEliminar);
        restriccion.gridy=4;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        campo_telefono.setBorder(new EmptyBorder(7,7,7,0));
        restriccion.insets = new Insets(0,20,5,-70);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_telefono,restriccion);

        JLabel direccion_clientes = new JLabel("Dirección :");
        direccion_clientes.setFont(new Font("Aril",Font.BOLD,19));
        restriccion.gridy=5;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.insets = new Insets(0,60,0,0);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(direccion_clientes,restriccion);

        JTextField campo_direccion = new JTextField();
        campo_direccion.setEnabled(false);
        campo_direccion.setBackground(inputEliminar);
        campo_direccion.setDisabledTextColor(Color.DARK_GRAY);
        restriccion.gridy=5;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        campo_direccion.setBorder(new EmptyBorder(7,7,7,0));
        restriccion.insets = new Insets(0,20,5,-70);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_direccion,restriccion);


        JLabel email_clientes = new JLabel("Email :");
        email_clientes.setFont(new Font("Aril",Font.BOLD,19));
        restriccion.gridy=6;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.insets = new Insets(0,60,0,0);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(email_clientes,restriccion);

        JTextField campo_email = new JTextField();
        campo_email.setEnabled(false);
        campo_email.setBackground(inputEliminar);
        campo_email.setDisabledTextColor(Color.DARK_GRAY);
        restriccion.gridy=6;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.weighty=0;
        campo_email.setBorder(new EmptyBorder(7,7,7,0));
        restriccion.insets = new Insets(0,20,5,-70);
        restriccion.fill = GridBagConstraints.BOTH;
        panelBotones.add(campo_email,restriccion);

        JPanel botones = new JPanel();
        botones.setBackground(raro);
        botones.setBorder(new EmptyBorder(10,0,15,0));
        
        JButton btn1 = new JButton("CANCELAR");
        btn1.setFont(new Font("Aril",Font.BOLD,20));
		btn1.setBackground(Color.GRAY);
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        botones.add(btn1,restriccion);

        // linea 3
        JButton btn2 = new JButton("ELIMINAR");
        //btn2.setEnabled(false);
        btn2.setFont(new Font("Aril",Font.BOLD,20));
        btn2.setForeground( Color.WHITE);
		btn2.setBackground(Color.RED);
        restriccion.gridy=1;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        botones.add(btn2,restriccion);

        principal.add(botones,BorderLayout.SOUTH);
        principal.add(texto_menu,BorderLayout.NORTH);
        principal.add(panelBotones,BorderLayout.CENTER);
        add(principal);
        setVisible(true);

        ActionListener cancelar = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                menuPrincipal.setVisible(true);
                dispose();
				
			}
		};
        KeyListener buscarCliente = new KeyListener() {
            public void keyPressed(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
                String cedula = campo_cedula.getText();
                ClienteExistente resultado = procesos.clientesExistentes(cedula);
                campo_nombre.setText(resultado.getNombre());
                campo_apellidos.setText(resultado.getApellido());
                campo_telefono.setText(resultado.getTelefono());
                campo_direccion.setText(resultado.getDireccion());
                campo_email.setText(resultado.getEmail());
            }

            public void keyTyped(KeyEvent e) {
            }
        };
        ActionListener Eliminar = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                String cedula = campo_cedula.getText();
                procesos.EliminarUsuario(cedula);
                menuPrincipal.setVisible(true);
                AlertaCorrecta alertaBuena = new AlertaCorrecta();
                dispose();
			}
		};
		campo_cedula.addKeyListener( buscarCliente ); 
		btn1.addActionListener( cancelar );
        btn2.addActionListener( Eliminar );
        
    }   
}