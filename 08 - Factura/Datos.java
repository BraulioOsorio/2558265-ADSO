import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.LayoutManager;
import java.text.NumberFormat;
import java.util.Currency;
public class Datos extends JFrame{
    public Datos(){
        initComponents();
    }
    public void initComponents(){
        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") );
        setIconImage(icono);
        setTitle("FACTURA");
        setSize(760,970);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel principal = new JPanel();
        GridBagLayout capaPrincipal = new GridBagLayout();
        principal.setLayout(capaPrincipal);
        principal.setBorder(new EmptyBorder(15,15,15,15));

        GridBagConstraints restriccion = new GridBagConstraints();
        // linea 1
        JLabel texto_inicial = new JLabel("DATOS CLIENTE:");
        texto_inicial.setFont(new Font("Aril",Font.BOLD,20));
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=12;
        restriccion.weightx=0;
        restriccion.weighty=0;
        texto_inicial.setBorder(new EmptyBorder(0,0,10,0));
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(texto_inicial,restriccion);
        // linea 2
        JLabel cedula_cliente = new JLabel("CEDULA :");
        restriccion.gridy=1;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(cedula_cliente,restriccion);

        JTextField campo_cedula = new JTextField();
        restriccion.gridy=1;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=2;
        restriccion.weightx=1;
        campo_cedula.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.insets = new Insets(0,20,0,20);
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo_cedula,restriccion);

        JButton btn1 = new JButton("BUSCAR");
        restriccion.gridy=1;
        restriccion.gridx=3;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        btn1.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn1,restriccion);

        // linea 3
        JLabel nombres_clientes = new JLabel("NOMBRES :");
        restriccion.gridy=2;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(nombres_clientes,restriccion);

        JTextField campo_nombre = new JTextField();
        restriccion.gridy=2;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=3;
        restriccion.weightx=0;
        restriccion.weighty=0;
        campo_nombre.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.insets = new Insets(10,20,10,20);
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo_nombre,restriccion);

        //LINEA 4
        JLabel direccion_clientes = new JLabel("DIRECCION :");
        restriccion.gridy=3;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(direccion_clientes,restriccion);

        JTextField campo_direccion = new JTextField();
        restriccion.gridy=3;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=3;
        restriccion.weightx=0;
        restriccion.weighty=0;
        campo_direccion.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.insets = new Insets(10,20,10,20);
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo_direccion,restriccion);

        //linea 5
        JLabel texto_inicial_abajo = new JLabel("DATOS VENDEDOR:");
        texto_inicial_abajo.setFont(new Font("Aril",Font.BOLD,20));
        restriccion.gridy=4;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=12;
        restriccion.weightx=0;
        restriccion.weighty=0;
        texto_inicial_abajo.setBorder(new EmptyBorder(0,0,10,0));
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(texto_inicial_abajo,restriccion);
        // linea 6
        JLabel cedula_vendedor = new JLabel("CEDULA :");
        restriccion.gridy=5;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(cedula_vendedor,restriccion);

        JTextField campo_cedula_vendedor = new JTextField();
        restriccion.gridy=5;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=2;
        restriccion.weightx=0;
        campo_cedula_vendedor.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.insets = new Insets(0,20,0,20);
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo_cedula_vendedor,restriccion);

        JButton btn2 = new JButton("BUSCAR");
        restriccion.gridy=5;
        restriccion.gridx=3;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        btn2.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn2,restriccion);

        // linea 7
        JLabel nombres_vendedor = new JLabel("NOMBRES :");
        restriccion.gridy=6;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(nombres_vendedor,restriccion);

        JTextField campo_nombre_vendedor = new JTextField();
        restriccion.gridy=6;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=3;
        restriccion.weightx=0;
        restriccion.weighty=0;
        campo_nombre_vendedor.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.insets = new Insets(10,20,10,20);
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo_nombre_vendedor,restriccion);

        //LINEA 8
        JLabel direccion_vendedor = new JLabel("DIRECCION :");
        restriccion.gridy=7;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(direccion_vendedor,restriccion);

        JTextField campo_direccion_vendedor = new JTextField();
        restriccion.gridy=7;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=3;
        restriccion.weightx=0;
        restriccion.weighty=0;
        campo_direccion_vendedor.setBorder(new EmptyBorder(7,15,7,15));
        restriccion.insets = new Insets(10,20,10,20);
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo_direccion_vendedor,restriccion);

        //linea 9
        JLabel texto_lista = new JLabel("LISTA PRODUCTOS FACTURADOS:");
        texto_lista.setFont(new Font("Aril",Font.BOLD,20));
        restriccion.gridy=8;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=12;
        restriccion.weightx=0;
        restriccion.weighty=0;
        texto_lista.setBorder(new EmptyBorder(0,0,10,0));
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(texto_lista,restriccion);
        //linea 10
        JLabel ID = new JLabel("ID");
        restriccion.gridy=9;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(ID,restriccion);

        JLabel nombre_producto = new JLabel("NOMBRE");
        restriccion.gridy=9;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(nombre_producto,restriccion);

        JLabel cant = new JLabel("CANT.");
        restriccion.gridy=9;
        restriccion.gridx=2;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(cant,restriccion);

        //LINEA 11
        JTextField campo_id_producto = new JTextField();
        restriccion.gridy=10;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo_id_producto,restriccion);

        JTextField campo_nombre_producto = new JTextField();
        restriccion.gridy=10;
        restriccion.gridx=1;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo_nombre_producto,restriccion);

        

        JTextField campo_cantidad = new JTextField();
        restriccion.gridy=10;
        restriccion.gridx=2;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo_cantidad,restriccion);

        JButton btn3 = new JButton("ADD");
        restriccion.gridy=10;
        restriccion.gridx=3;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(btn3,restriccion);

        //linea 12

        JLabel abajo = new JLabel("HELLOO");
		abajo.setBackground( Color.WHITE );
        abajo.setOpaque(true);
        restriccion.gridy=11;
        restriccion.gridx=0;
        restriccion.gridheight=0;
        restriccion.gridwidth=0;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(abajo,restriccion);
        //LINEA 13
        JLabel fondo = new JLabel("Total:$0");
		fondo.setBackground( Color.BLUE );
        fondo.setOpaque(true);
        restriccion.gridy=12;
        restriccion.gridx=0;
        restriccion.gridheight=0;
        restriccion.gridwidth=0;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(fondo,restriccion);
        add(principal);
        setVisible(true);
        
        
    }
}