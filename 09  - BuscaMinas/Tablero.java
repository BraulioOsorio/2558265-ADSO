import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.LayoutManager;
import java.util.Currency;
import javax.swing.event.DocumentListener;
public class Tablero extends JFrame{
    int Interno[][];
    JButton Tablero[][];
    JButton btn1;
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
        btn1 = new JButton();
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
         for(int i =0; i <9 ; i++){
            for(int j =0; j<9;j++){
                if(Interno[i][j]==0){
                    int numero = 0;
                    if(i==0 && j==0){
                        if(Interno[i][j+1]==9){
                            numero++;
                        }
                        if(Interno[i+1][j]==9){
                            numero++;
                        }
                        if(Interno[i+1][j+1]==9){
                            numero++;
                        }
                    }else if(i==0 && j==8){
                        if(Interno[i][j-1]==9){
                            numero++;
                        }
                        if(Interno[i+1][j]==9){
                            numero++;
                        }
                        if(Interno[i+1][j-1]==9){
                            numero++;
                        }
                    }else if(i==8 && j==0){
                        if(Interno[i-1][j]==9){
                            numero++;
                        }
                        if(Interno[i-1][j+1]==9){
                            numero++;
                        }
                        if(Interno[i][j+1]==9){
                            numero++;
                        }
                    }else if(i==8 && j==8){
                        if(Interno[i-1][j-1]==9){
                            numero++;
                        }
                        if(Interno[i-1][j]==9){
                            numero++;
                        }
                        if(Interno[i][j-1]==9){
                            numero++;
                        }
                    }else if(i==8){
                        if(Interno[i][j-1]==9){
                            numero++;
                        }
                        if(Interno[i][j+1]==9){
                            numero++;
                        }
                        if(Interno[i-1][j]==9){
                            numero++;
                        }
                        if(Interno[i-1][j-1]==9){
                            numero++;
                        }
                        if(Interno[i-1][j+1]==9){
                            numero++;
                        }
                    }else if(i==0){
                        if(Interno[i][j-1]==9){
                            numero++;
                        }
                        if(Interno[i][j+1]==9){
                            numero++;
                        }
                        if(Interno[i+1][j]==9){
                            numero++;
                        }
                        if(Interno[i+1][j+1]==9){
                            numero++;
                        }
                        if(Interno[i+1][j-1]==9){
                            numero++;
                        }
                    }else if(j==8){
                        if(Interno[i-1][j]==9){
                            numero++;
                        }
                        if(Interno[i][j-1]==9){
                            numero++;
                        }
                        if(Interno[i+1][j]==9){
                            numero++;
                        }
                        if(Interno[i-1][j-1]==9){
                            numero++;
                        }
                        if(Interno[i+1][j-1]==9){
                            numero++;
                        }
                    }else if(j==0){
                        if(Interno[i-1][j]==9){
                            numero++;
                        }
                        if(Interno[i][j+1]==9){
                            numero++;
                        }
                        if(Interno[i+1][j]==9){
                            numero++;
                        }
                        if(Interno[i+1][j+1]==9){
                            numero++;
                        }
                        if(Interno[i-1][j+1]==9){
                            numero++;
                        }
                    }else{
                        if(Interno[i][j-1]==9){
                            numero++;
                        }
                        if(Interno[i][j+1]==9){
                            numero++;
                        }
                        if(Interno[i-1][j]==9){
                            numero++;
                        }
                        if(Interno[i+1][j]==9){
                            numero++;
                        }
                        if(Interno[i+1][j+1]==9){
                            numero++;
                        }
                        if(Interno[i+1][j-1]==9){
                            numero++;
                        }
                        if(Interno[i-1][j+1]==9){
                            numero++;
                        }
                        if(Interno[i-1][j-1]==9){
                            numero++;
                        }
                    }
                    Interno[i][j]=numero;
                }
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

        Image img_blanco = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_espacio.png"));
        img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        Tablero = new JButton[9][9];
        for(int i =0; i <9 ; i++){
            for(int j =0; j<9;j++){
                this.Tablero[i][j] = new JButton();
                this.Tablero[i][j].setIcon( new ImageIcon(img_blanco) );
                this.Tablero[i][j].setFocusable(false);
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
        if(Interno[fila][columna]==9){
            Image img_mina = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_bomba.png"));
            img_mina = img_mina.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            this.Tablero[fila][columna].setDisabledIcon(new ImageIcon(img_mina));
            this.Tablero[fila][columna].setEnabled(false);
            DestaparTodo();
        }else if(Interno[fila][columna]>=1 && Interno[fila][columna]<=8){
            int numeroCasilla = Interno[fila][columna];
            Image img_numero = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_num_"+numeroCasilla+".png"));
            img_numero = img_numero.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            this.Tablero[fila][columna].setDisabledIcon(new ImageIcon(img_numero));
            this.Tablero[fila][columna].setEnabled(false);
        }else if(Interno[fila][columna]==0){
            Image img_blanco = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_espacio.png"));
            img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            this.Tablero[fila][columna].setDisabledIcon(new ImageIcon(img_blanco));
            this.Tablero[fila][columna].setEnabled(false);
        }

    }
    public void DestaparTodo(){
        Image caritaTrite = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_triste.png"));
        caritaTrite = caritaTrite.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        btn1.setIcon(new ImageIcon(caritaTrite));
        for(int i =0; i <9 ; i++){
            for(int j =0; j<9;j++){
                if(Interno[i][j]==9){
                    Image img_mina = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_bomba.png"));
                    img_mina = img_mina.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                    this.Tablero[i][j].setDisabledIcon(new ImageIcon(img_mina));
                    this.Tablero[i][j].setEnabled(false);

                }else if(Interno[i][j]>=1 && Interno[i][j]<=8){
                    int numeroCasilla = Interno[i][j];
                    Image img_numero = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_num_"+numeroCasilla+".png"));
                    img_numero = img_numero.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                    this.Tablero[i][j].setDisabledIcon(new ImageIcon(img_numero));
                    this.Tablero[i][j].setEnabled(false);
                }else if(Interno[i][j]==0){
                    Image img_blanco = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_espacio.png"));
                    img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                    this.Tablero[i][j].setDisabledIcon(new ImageIcon(img_blanco));
                    this.Tablero[i][j].setEnabled(false);
                }
            }
                
        }
    }
}