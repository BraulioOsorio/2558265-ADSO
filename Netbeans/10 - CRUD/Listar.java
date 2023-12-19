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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class Listar extends JFrame{
    Clientes arrayClientes[];
    Respaldo menuPrincipal;

    private JTable table;
    private DefaultTableModel tableModel;

    public Listar(Respaldo respaldo,Clientes arrayClientesM[]){
        this.menuPrincipal = respaldo;
        this.arrayClientes = arrayClientesM; 
        initComponents();
    }
    public void initComponents(){
        Procesos interior = new Procesos(arrayClientes);
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

        Object[] columnNames = {"N","CEDULA","NOMBRES","APELLIDOS"};
        tableModel = new DefaultTableModel(columnNames, 0){
            public boolean isCellEditable(int row, int colum){
                return false;
            }
        };
        table = new JTable(tableModel);
        table.getColumn("N").setPreferredWidth(15);
        table.getColumn("CEDULA").setPreferredWidth(150);
        table.getColumn("NOMBRES").setPreferredWidth(150);
        table.getColumn("APELLIDOS").setPreferredWidth(150);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        JScrollPane bajar = new JScrollPane(table);
        bajar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        bajar.setBorder(null);



        
        for(int i =0; i <20; i++){
            if(arrayClientes[i]!=null){
                Object [] datoFila = new Object[]{i,arrayClientes[i].getNumcedula(),arrayClientes[i].getNombreCliente(),arrayClientes[i].getApellido()};
                this.tableModel.addRow(datoFila);
            }
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
                menuPrincipal.setVisible(true);
                dispose();
				
			}
		};
		btn1.addActionListener( atras );
        
    }   
}