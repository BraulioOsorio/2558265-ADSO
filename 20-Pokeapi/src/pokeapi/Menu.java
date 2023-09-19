package pokeapi;


public class Menu extends javax.swing.JFrame {
    
    Conexion conexion;

    public Menu(Conexion conexion) {
        this.conexion = conexion;
        
        initComponents();
        mostrarPantalla();
        initComponentAltern();
        
        contenido();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenPrrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        contenPrrincipal.setBackground(new java.awt.Color(255, 255, 255));
        contenPrrincipal.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenPrrincipalLayout = new javax.swing.GroupLayout(contenPrrincipal);
        contenPrrincipal.setLayout(contenPrrincipalLayout);
        contenPrrincipalLayout.setHorizontalGroup(
            contenPrrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );
        contenPrrincipalLayout.setVerticalGroup(
            contenPrrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenPrrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initComponentAltern(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("POKEDEX");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")) );        
    }
       
    public void mostrarPantalla(){
        contenPrrincipal.removeAll();
        PantallaCarga panelCarga = new PantallaCarga();
        panelCarga.setSize(contenPrrincipal.getSize());
        contenPrrincipal.add(panelCarga);
        repaint();
        revalidate();
    }
    
    public void contenido(){
        try {
            contenPrrincipal.removeAll();
            Contenido content = new Contenido(conexion);
            content.setSize(contenPrrincipal.getSize());
            contenPrrincipal.add(content);
            repaint();
            revalidate();
        } catch (Exception e) {
            contenPrrincipal.removeAll();
            PantallaWifi content = new PantallaWifi();
            content.setSize(contenPrrincipal.getSize());
            contenPrrincipal.add(content);
            repaint();
            revalidate();
            System.out.println(e.toString());
        }
        
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenPrrincipal;
    // End of variables declaration//GEN-END:variables
}
