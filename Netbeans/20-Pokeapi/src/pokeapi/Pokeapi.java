
package pokeapi;

public class Pokeapi {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();

        Menu menu = new Menu(conexion);
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }    
    
}
