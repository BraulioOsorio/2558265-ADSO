package Principal;

import clases.Conexion;
import hasdcode.Index;
import java.sql.ResultSet;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    Conexion conexion;
    Index pass;
    String estados;
    public Login(Conexion conexion) {
        this.conexion = conexion;
        this.pass = new Index();
        this.estados = estados;
        initComponents();
        initComponents2();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campo_email = new javax.swing.JTextField();
        etq_password = new javax.swing.JLabel();
        campo_password = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_recuperar = new javax.swing.JButton();
        etq_titulo = new javax.swing.JLabel();
        etq_imagen = new javax.swing.JLabel();
        etq_email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icon_app.png") ));

        jPanel1.setBackground(new java.awt.Color(248, 239, 230));

        campo_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_email.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(159, 168, 213), null));
        campo_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campo_emailvalidateEmail(evt);
            }
        });
        campo_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_emailActionPerformed(evt);
            }
        });

        etq_password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_password.setForeground(new java.awt.Color(0, 0, 0));
        etq_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_password.setText("Contraseña :");

        campo_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_password.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(159, 168, 213), null));
        campo_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_passwordActionPerformed(evt);
            }
        });
        campo_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_passwordpruebaKey(evt);
            }
        });

        btn_ingresar.setBackground(new java.awt.Color(159, 168, 213));
        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.setFocusable(false);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(159, 168, 213));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("REGISTRARME");
        btn_registrar.setFocusable(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_recuperar.setBackground(new java.awt.Color(159, 168, 213));
        btn_recuperar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_recuperar.setForeground(new java.awt.Color(0, 0, 0));
        btn_recuperar.setText("OLVIDE MI CONTRASEÑA");
        btn_recuperar.setFocusable(false);
        btn_recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recuperarActionPerformed(evt);
            }
        });

        etq_titulo.setBackground(new java.awt.Color(159, 168, 213));
        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Inicio de Sesión");
        etq_titulo.setOpaque(true);

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_email.setForeground(new java.awt.Color(0, 0, 0));
        etq_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_email.setText("Correo Electronico :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_recuperar)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campo_password, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campo_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etq_email)
                    .addComponent(etq_password))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_email, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_recuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_emailvalidateEmail(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campo_emailvalidateEmail


    }//GEN-LAST:event_campo_emailvalidateEmail

    private void campo_passwordpruebaKey(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_passwordpruebaKey

    }//GEN-LAST:event_campo_passwordpruebaKey

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String email = campo_email.getText();
        String password = campo_password .getText();
        String secretKey = "mySecretKey12345";
        
        try {
            ResultSet resultado = this.conexion.datos(email);
            String nombre = resultado.getString("nombre_user");
            String foto = resultado.getString("icono");
            String correo = resultado.getString("correo");
            String idUser = resultado.getString("id_usuario");
            String passGuardada = resultado.getString("pass");
            
            String passDescrypt = pass.decrypt(passGuardada, secretKey);
            if (passDescrypt.equalsIgnoreCase(password)) {
                    PanelTareas ventana = new PanelTareas(conexion,nombre,foto,correo,this.estados,idUser);
                    ventana.setVisible(true);
                    ventana.setResizable(false);
                    ventana.setLocationRelativeTo(null);
                    campo_email.setText("");
                    campo_password.setText("");
                    dispose();
                
            }else{
                JOptionPane.showMessageDialog(null, "Verifique su contraseña");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Verifique su correo");
            
        }
        
        
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        dispose();
        CrearUser crear = new CrearUser(conexion);
        crear.setVisible(true);
        crear.setResizable(false);
        crear.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void campo_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_emailActionPerformed

    private void campo_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_passwordActionPerformed

    private void btn_recuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recuperarActionPerformed
        dispose();
        Recuperar recu = new Recuperar(conexion);
        recu.setVisible(true);
        recu.setResizable(false);
        recu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_recuperarActionPerformed

    public void initComponents2(){
        setVisible(true);
        setLocationRelativeTo(null);
        
        Image img_candado = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/img_user.png"));
        img_candado = img_candado.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_imagen.setIcon(new ImageIcon(img_candado));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_recuperar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_password;
    private javax.swing.JLabel etq_email;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_password;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
