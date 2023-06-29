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

public class Listar extends JFrame{

    public Listar(){
        initComponents();
    }
    public void initComponents(){
        Procesos interior = new Procesos();
        Color azulOscuro = new Color(0, 5, 118);
        Color raro = new Color(140, 140, 255);
        Border borde = BorderFactory.createLineBorder(Color.RED, 1);
        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") );
        setIconImage(icono);
        setTitle("Usuarios");
        setSize(360,405);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);

        JPanel principal = new JPanel();
        BorderLayout capaPrincipal = new BorderLayout();
        principal.setLayout(capaPrincipal);
        GridBagConstraints restriccion = new GridBagConstraints();


        // linea 1
        JPanel texto_menu = new JPanel();
        texto_menu.setBackground(azulOscuro);
        texto_menu.setBorder(new MatteBorder(0, 0, 5, 0, Color.WHITE)); 
        JLabel texto_inicial = new JLabel("LISTAR USUARIO");
        texto_inicial.setFont(new Font("Aril",Font.BOLD,25));
        texto_inicial.setOpaque(true);
        texto_inicial.setForeground( Color.WHITE);
		texto_inicial.setBackground(azulOscuro);
        texto_inicial.setHorizontalAlignment(SwingConstants.CENTER);
        texto_inicial.setBorder(new EmptyBorder(4,0,4,0));
        texto_menu.add(texto_inicial);

        JPanel panelBotones = new JPanel(new GridBagLayout());
        panelBotones.setBackground(raro);
        panelBotones.setBorder(new EmptyBorder(15,15,15,0));
        JScrollPane bajar = new JScrollPane(panelBotones);
        bajar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        bajar.setBorder(null);

        JLabel Lista[] = new JLabel[20];
        for(int i =0; i <20; i++){
            
            ClienteExistente resultado = interior.buscarCliente(i);
            Lista[i]= new JLabel (i+" - "+resultado.getNumcedula()+" "+resultado.getNombre()+" "+resultado.getApellido());
            restriccion.insets = new Insets(0,0,0,10);
            Lista[i].setBorder(new EmptyBorder(0,0,7,0));
            Lista[i].setOpaque(true);
            Lista[i].setBackground(Color.WHITE);
            Lista[i].setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK)); 
            restriccion.gridy=(i+1);
            restriccion.gridx=0;
            restriccion.gridheight=1;
            restriccion.gridwidth=1;
            restriccion.weightx=1;
            restriccion.weighty=1;
            restriccion.fill = GridBagConstraints.BOTH;
            panelBotones.add(Lista[i],restriccion);

        }

        JPanel botones = new JPanel(new GridBagLayout());
        botones.setBackground(raro);
        JButton btn1 = new JButton("ATRAS");
        btn1.setFont(new Font("Aril",Font.BOLD,20));
        btn1.setOpaque(true);
        btn1.setForeground( Color.BLACK);
		btn1.setBackground(Color.GRAY);
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.insets = new Insets(10,0,10,0);
        botones.add(btn1,restriccion);

        principal.add(botones,BorderLayout.SOUTH);
        principal.add(texto_menu,BorderLayout.NORTH);
        principal.add(bajar);
        add(principal);
        setVisible(true);

        ActionListener atras = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                dispose();
				respaldo vamo = new respaldo();
			}
		};
		btn1.addActionListener( atras );
        
    }   
}