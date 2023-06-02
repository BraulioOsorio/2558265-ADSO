import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.LayoutManager;
import java.text.NumberFormat;
import java.util.Currency;
public class Formatomoneda extends JFrame{

    JTextField campo;
    JLabel moneda;
    public Formatomoneda(){
        initComponents();
    }
    public void initComponents(){
        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_moneda.png") );
        setIconImage(icono);
        setTitle("FORMATO MONEDA");
        setSize(950,550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel principal = new JPanel();
        GridBagLayout capaPrincipal = new GridBagLayout();
        principal.setLayout(capaPrincipal);
        principal.setBorder(new EmptyBorder(15,15,15,15));

        GridBagConstraints restriccion = new GridBagConstraints();

        JLabel texto = new JLabel("CANTIDAD:");
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(texto,restriccion);

        JButton btn4 = new JButton("EJECUTAR");
        restriccion.gridy=0;
        restriccion.gridx=3;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        btn4.setBorder(new EmptyBorder(15,15,15,15));
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn4,restriccion);

        campo = new JTextField();
        restriccion.gridy=0;
        restriccion.gridx=2;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=1;
        restriccion.insets = new Insets(0,20,0,20);
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(campo,restriccion);


        moneda = new JLabel("-----");
        moneda.setFont(new Font("Aril",Font.BOLD,50));
        restriccion.gridy=1;
        restriccion.gridx=1;
        restriccion.gridheight=2;
        restriccion.gridwidth=2;
        restriccion.weightx=1;
        restriccion.weighty=1;
        restriccion.fill = GridBagConstraints.CENTER;
        principal.add(moneda,restriccion);

        JButton btn5 = new JButton("LIMPIAR");
        restriccion.gridy=3;
        restriccion.gridx=2;
        restriccion.gridheight=1;
        restriccion.gridwidth=1;
        restriccion.weightx=0;
        restriccion.weighty=0;
        btn5.setBorder(new EmptyBorder(15,15,15,15));
        restriccion.fill = GridBagConstraints.SOUTH;
        principal.add(btn5,restriccion);
        add(principal);

        ActionListener formatomoneda = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int campoMoneda = Integer.parseInt(campo.getText());
                NumberFormat formatomonedas = NumberFormat.getCurrencyInstance();
                String resultado = formatomonedas.format(campoMoneda);
				moneda.setText(resultado);
                campo.setText("");
				campo.requestFocus();
			}
		};
		btn4.addActionListener( formatomoneda );

        ActionListener limpiar = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                moneda.setText("-----");
                campo.setText("");
				campo.requestFocus();
			}
		};
		btn5.addActionListener( limpiar );
        setVisible(true);
        
        
    }
}