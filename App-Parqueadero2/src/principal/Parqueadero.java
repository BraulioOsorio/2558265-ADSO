package principal;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class Parqueadero extends javax.swing.JFrame {

    JsonObject usuario;
    ConsumoAPI conexion = new ConsumoAPI();
    Gson gson = new Gson();
    String nombre;
    public Parqueadero(JsonObject usuario) {
        this.usuario = usuario;
        initComponents();
        initComponentsAltern();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etq_rol = new javax.swing.JLabel();
        etq_logo = new javax.swing.JLabel();
        etq_nombre_parqueadero = new javax.swing.JLabel();
        etq_cerrar_sesion = new javax.swing.JLabel();
        etq_inicio = new javax.swing.JLabel();
        panel_menu = new javax.swing.JPanel();
        panel_contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 92, 162));

        jPanel2.setBackground(new java.awt.Color(49, 138, 222));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 50));

        etq_rol.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_rol.setForeground(new java.awt.Color(255, 255, 255));
        etq_rol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_rol.setText("ROL");
        etq_rol.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        etq_rol.setPreferredSize(new java.awt.Dimension(158, 50));

        etq_logo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_logo.setForeground(new java.awt.Color(255, 255, 255));
        etq_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_logo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        etq_logo.setPreferredSize(new java.awt.Dimension(158, 50));

        etq_nombre_parqueadero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_nombre_parqueadero.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre_parqueadero.setText("NOMBRE DEL PARQUEADERO");
        etq_nombre_parqueadero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        etq_nombre_parqueadero.setPreferredSize(new java.awt.Dimension(158, 50));

        etq_cerrar_sesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_cerrar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        etq_cerrar_sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_cerrar_sesion.setText("CERRRAR SESION");
        etq_cerrar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etq_cerrar_sesion.setPreferredSize(new java.awt.Dimension(158, 50));
        etq_cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                etq_cerrar_sesionMousePressed(evt);
            }
        });

        etq_inicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_inicio.setForeground(new java.awt.Color(255, 255, 255));
        etq_inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_inicio.setText("INICIO");
        etq_inicio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        etq_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etq_inicio.setPreferredSize(new java.awt.Dimension(158, 50));
        etq_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                etq_inicioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(etq_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre_parqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_rol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etq_nombre_parqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(etq_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(etq_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(etq_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_contenidoLayout = new javax.swing.GroupLayout(panel_contenido);
        panel_contenido.setLayout(panel_contenidoLayout);
        panel_contenidoLayout.setHorizontalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        panel_contenidoLayout.setVerticalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etq_cerrar_sesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_cerrar_sesionMousePressed
        cerrarSesion();
    }//GEN-LAST:event_etq_cerrar_sesionMousePressed

    private void etq_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etq_inicioMousePressed
        Carga();
        
                
    }//GEN-LAST:event_etq_inicioMousePressed

    private void initComponentsAltern() {
        nombre = this.usuario.get("nombre").getAsString().toUpperCase();
        Carga();

        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/parqueadero-logo.png")));

        Image logo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/parqueadero-logo.png"));
        logo = logo.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        etq_logo.setIcon(new ImageIcon(logo));

        String nombreParqueadero = "";
        String rol = this.usuario.get("rol").getAsString();
        String estado = this.usuario.get("estado").getAsString();
        String cedula = this.usuario.get("documento").getAsString();

        if (rol.equals("admin") && estado.equals("1")) {
            System.out.println("Funcion crear panel");
            nombreParqueadero = "PANEL DE CONTROL";

            panel_menu.removeAll();
            MenuAdmin panelAdmin = new MenuAdmin(panel_contenido);

            panelAdmin.setSize(panel_menu.getSize());
            panel_menu.add(panelAdmin);

            repaint();
            revalidate();
        }
        if (rol.equals("vendedor") && estado.equals("1")) {
            System.out.println("Vendedor");
            panel_menu.removeAll();

            JsonObject datosParquedero = getDatosParqueadero(cedula);
            MenuVend panelVendedor = new MenuVend(panel_contenido, datosParquedero, usuario);

            panelVendedor.setSize(panel_menu.getSize());
            panel_menu.add(panelVendedor);

            nombreParqueadero = datosParquedero.getAsJsonObject("registros").get("nombre").getAsString();

        }

        etq_nombre_parqueadero.setText(nombreParqueadero.toUpperCase());
        etq_rol.setText(rol.toUpperCase()+" "+nombre );

        setTitle("Parqueadero");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JsonObject getDatosParqueadero(String id_usuario) {
        JsonObject parqueadero = null;

        Map<String, String> data = new HashMap<>();
        data.put("id_usuario", id_usuario);

        try {

            String temporal = conexion.ConsumoGET("http://localhost/APIparqueadero/parqueaderos/getParqueaderoVend.php", data);

            JsonObject jsonObject = gson.fromJson(temporal, JsonObject.class);
            parqueadero = jsonObject;
        } catch (Exception e) {
            System.out.println("Error en getDatosParqueadero");
        }
        return parqueadero;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_cerrar_sesion;
    private javax.swing.JLabel etq_inicio;
    private javax.swing.JLabel etq_logo;
    private javax.swing.JLabel etq_nombre_parqueadero;
    private javax.swing.JLabel etq_rol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_contenido;
    public javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables

    private void cerrarSesion() {
        System.out.println("Cerrando sesión");
        Login ventanaLogin = new Login();
        dispose();
    }
    
    public void Carga(){
        panel_contenido.removeAll();
        
        PantallaCarga pantallaCarga = new PantallaCarga(nombre);

        pantallaCarga.setSize(panel_contenido.getSize());
        panel_contenido.add(pantallaCarga);

        repaint();
        revalidate();
    }
}
