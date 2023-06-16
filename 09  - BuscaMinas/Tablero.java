import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.LayoutManager;
import java.util.Currency;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class Tablero extends JFrame{
    String guardaDetalle;
    int totalTotal;
    int Interno[][];
    public Tablero(){
        initComponents();
    }
    public void initComponents(){
        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") );
        setIconImage(icono);
        setTitle("Buscaminas");
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel principal = new JPanel();
        GridBagLayout capaPrincipal = new GridBagLayout();
        principal.setLayout(capaPrincipal);
        principal.setBorder(new EmptyBorder(15,15,15,15));

        GridBagConstraints restriccion = new GridBagConstraints();
        JLabel minas = new JLabel("020");
        minas.setFont(new Font("Aril",Font.PLAIN,30));
        minas.setOpaque(true);
        minas.setForeground( Color.RED);
		minas.setBackground( Color.BLACK );
        minas.setHorizontalAlignment(SwingConstants.CENTER);
        restriccion.insets = new Insets(0,10,2,0);
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridheight=1;
        restriccion.gridwidth=3;
        restriccion.weightx=3;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(minas,restriccion);
        Image caritaFeliz = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_happy.png"));
        caritaFeliz = caritaFeliz.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        JButton btn1 = new JButton();
        btn1.setIcon(new ImageIcon(caritaFeliz));
        restriccion.insets = new Insets(0,0,2,0);
        restriccion.gridy=0;
        restriccion.gridx=3;
        restriccion.gridheight=1;
        restriccion.gridwidth=3;
        restriccion.weightx=3;
        restriccion.weighty=0;
        btn1.setBorder(new EmptyBorder(10,10,10,10));
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn1,restriccion);

        Interno = new int[9][9];
        int bombasPlantadas = 0;
        while (bombasPlantadas < 20){
            int filaA = (int) (Math.random()*9);
            int columnaA = (int) (Math.random()*9);
            if(Interno[filaA][columnaA]==0){
                Interno[filaA][columnaA]=9;
                bombasPlantadas++;
            }

        }

        System.out.println(bombasPlantadas);
        for(int i =0; i <9 ; i++){
            for(int j =0; j<9;j++){
                System.out.print("["+Interno[i][j]+"]");
            }
            System.out.println();
        }

        JLabel tiempo = new JLabel("000");
        tiempo.setFont(new Font("Aril",Font.PLAIN,30));
        restriccion.insets = new Insets(0,0,2,10);
        tiempo.setOpaque(true);
        tiempo.setForeground( Color.RED);
		tiempo.setBackground( Color.BLACK );
        tiempo.setHorizontalAlignment(SwingConstants.CENTER);
        restriccion.gridy=0;
        restriccion.gridx=6;
        restriccion.gridheight=1;
        restriccion.gridwidth=5;
        restriccion.weightx=3;
        restriccion.weighty=0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(tiempo,restriccion);

        JButton Tablero[][] = new JButton[9][9];
        for(int i =0; i <9 ; i++){
            for(int j =0; j<9;j++){
                Tablero[i][j]= new JButton();
                restriccion.insets = new Insets(0,0,0,0);
                restriccion.gridy=(i+1);
                restriccion.gridx=j;
                restriccion.gridheight=1;
                restriccion.gridwidth=1;
                restriccion.weightx=1;
                restriccion.weighty=1;
                restriccion.fill = GridBagConstraints.BOTH;
                principal.add(Tablero[i][j],restriccion);

                final int fila=i;
                final int columna=j;
                ActionListener evento = new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        destaparCasilla(columna, fila);
                    }
                };
                Tablero[i][j].addActionListener(evento);

            }
        }
    
        add(principal);
        setVisible(true);
        
    }

    public void destaparCasilla(int columna, int fila){
        System.out.println("has dado clik en "+fila+"-"+columna);
    }


}