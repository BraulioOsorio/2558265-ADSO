import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class Tabla{
    public static void main(String[]args){
        JFrame ventana = new JFrame();
        ventana.setTitle("Tabla De Multiplicar");
        ventana.setSize(500,500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));
        contenedor.setBorder(new EmptyBorder(15,15,15,15));

        Font fuenteInputs = new Font("Arial", Font.BOLD, 20);
		Font fuenteLabels = new Font("Arial", Font.PLAIN, 18);
		EmptyBorder borderLabel = new EmptyBorder(15,0,0,0);

        JLabel titulo = new JLabel("MULTIPLICACIÓN");
        titulo.setFont( new Font("Arial", Font.BOLD, 25) );
		titulo.setForeground( Color.RED);
		titulo.setBackground( Color.BLACK );
        titulo.setOpaque(true);
		titulo.setBorder( new EmptyBorder(0,25,0,25) );

        JLabel numeroTabla = new JLabel("Ingrese el numero de la tabla");
        numeroTabla.setFont(fuenteLabels);
        numeroTabla.setBorder(borderLabel);
        JTextField campoNumero = new JTextField();
        campoNumero.setFont( fuenteInputs );

        JLabel hastaDonde = new JLabel("Ingrese Hasta que numero quiere la tabla");
        hastaDonde.setFont(fuenteLabels);
        hastaDonde.setBorder(borderLabel);
        JTextField campoHasta = new JTextField();
        campoHasta.setFont( fuenteInputs );

        JLabel espacio = new JLabel("");
		espacio.setBorder( new EmptyBorder(20,0,0,0) );

        JButton multiplicar = new JButton("Multiplicar");
        JLabel etq_texto = new JLabel("");
        JLabel etq_textoConcatenado = new JLabel("");
		etq_texto.setFont( new Font("Arial", Font.PLAIN, 12) );
		etq_texto.setBorder( new EmptyBorder(20,0,20,0) );

        contenedor.add(titulo);
        contenedor.add(numeroTabla);
        contenedor.add(campoNumero);
        contenedor.add(hastaDonde);
        contenedor.add(campoHasta);
        contenedor.add(espacio);
        contenedor.add(multiplicar);
        contenedor.add(etq_texto);

        ventana.add( contenedor );
		ventana.setVisible(true);
		ventana.pack();

        ActionListener eventoMultiplicar = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numeroT = Integer.parseInt(campoNumero.getText());
                int numeroHasta = Integer.parseInt(campoHasta.getText());
                String temporal = "";
                for(int i=1;i<=numeroHasta;i++){
                    temporal += numeroT+" X "+i+" = "+numeroT*i+ "<br>";
                }
                etq_texto.setText("<html>"+temporal+"</html>");
                campoNumero.setText("");
				campoHasta.setText("");
				numeroTabla.requestFocus();
			}
		};
		multiplicar.addActionListener( eventoMultiplicar );

    }
}