package principal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Login extends javax.swing.JFrame {

    ImagenFondo imgFondo = new ImagenFondo();
    ConsumoAPI conexion = new ConsumoAPI();
    Gson gson = new Gson();

    public Login() {
        this.setContentPane(imgFondo);
        initComponents();
        initComponentsAltern();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_formulario = new javax.swing.JPanel();
        etq_email = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        etq_contrasenia = new javax.swing.JLabel();
        campo_contrasenia = new javax.swing.JPasswordField();
        panel_txt_login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        etq_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel_formulario.setBackground(new java.awt.Color(255, 255, 255));

        etq_email.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_email.setForeground(Color.decode("#318ade"));
        etq_email.setText("Email:");

        campo_email.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_email.setForeground(Color.decode("#318ade"));
        campo_email.setText("usuario2@gmail.com");
        campo_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));
        campo_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_emailActionPerformed(evt);
            }
        });

        etq_contrasenia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_contrasenia.setForeground(Color.decode("#318ade"));
        etq_contrasenia.setText("Contraseña:");

        campo_contrasenia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campo_contrasenia.setForeground(Color.decode("#318ade")
        );
        campo_contrasenia.setText("123");
        campo_contrasenia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));
        campo_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_contraseniaActionPerformed(evt);
            }
        });
        campo_contrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_contraseniaKeyReleased(evt);
            }
        });

        panel_txt_login.setBackground(Color.decode("#318ade"));

        jLabel1.setBackground(Color.decode("#318ade"));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout panel_txt_loginLayout = new javax.swing.GroupLayout(panel_txt_login);
        panel_txt_login.setLayout(panel_txt_loginLayout);
        panel_txt_loginLayout.setHorizontalGroup(
            panel_txt_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_txt_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_txt_loginLayout.setVerticalGroup(
            panel_txt_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_txt_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_login.setBackground(Color.decode("#318ade"));
        btn_login.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("ENVIAR");
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.setFocusable(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_formularioLayout = new javax.swing.GroupLayout(panel_formulario);
        panel_formulario.setLayout(panel_formularioLayout);
        panel_formularioLayout.setHorizontalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formularioLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_email)
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(etq_contrasenia)
                        .addGroup(panel_formularioLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(campo_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addComponent(panel_txt_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        panel_formularioLayout.setVerticalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formularioLayout.createSequentialGroup()
                .addComponent(panel_txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(etq_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(etq_contrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel_formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_contraseniaActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Loginfuncion();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void campo_contraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_contraseniaKeyReleased
        if (evt.getKeyChar() == '\n') {

            Loginfuncion();
        }
    }//GEN-LAST:event_campo_contraseniaKeyReleased

    private void campo_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_emailActionPerformed

    public void Loginfuncion() {
        String correo = campo_email.getText();
        String contrasenia = String.valueOf(campo_contrasenia.getPassword());

        if (correo.length() > 0 && contrasenia.length() > 0) {
            Map<String, String> ingresarData = new HashMap<>();
            ingresarData.put("correo", correo);
            ingresarData.put("contrasenia", contrasenia);

            try {
                String temporal = conexion.ConsumoGET("http://localhost/APIparqueadero/usuarios/LoginGet.php", ingresarData);
                
                JsonObject jsonObject = gson.fromJson(temporal, JsonObject.class);

                if (jsonObject.has("usuario")) {
                    JsonObject registro = jsonObject.getAsJsonObject("usuario");
                    String estados = registro.get("estado").getAsString();
                    if(estados.equals("0")){
                        JOptionPane.showMessageDialog(null, "El usuario esta deshabilitado");
                    }else{
                        Parqueadero ventanaParqueadero = new Parqueadero(registro);
                        dispose();
                    }
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro al Usuario");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(null, "Intentalo de nuevo");
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
        }

    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPasswordField campo_contrasenia;
    private javax.swing.JTextField campo_email;
    private javax.swing.JLabel etq_contrasenia;
    private javax.swing.JLabel etq_email;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel_formulario;
    private javax.swing.JPanel panel_txt_login;
    // End of variables declaration//GEN-END:variables

    private void initComponentsAltern() {
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/parqueadero-logo.png")));
        this.setTitle("Login");
        Image foto_login = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/login-img.png"));
        foto_login = foto_login.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        etq_img.setIcon(new ImageIcon(foto_login));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        campo_contrasenia.setText("");
    }

    class ImagenFondo extends JPanel {

        Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo-login.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
