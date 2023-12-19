import javax.swing.JFrame;
import java.awt.*;
public class MiVentana extends JFrame {
    public MiVentana() {
        // Configurar el título de la ventana
        setTitle("Mi Aplicación");
        
        // Establecer el tamaño de la ventana
        setSize(500, 300);
        
        // Establecer la posición de la ventana en el centro de la pantalla
        setLocationRelativeTo(null);
        
        // Evitar que la ventana se pueda redimensionar
        setResizable(false);
        
        // Establecer la acción al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args) {
        // Crear una instancia de la ventana
        MiVentana ventana = new MiVentana();
        
        // Hacer visible la ventana
        ventana.setVisible(true);
        
    }
}