/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;
import clases.Conexion;
import javax.swing.JOptionPane;
import hasdcode.Index;

public class Recuperar extends javax.swing.JFrame {
    Index hasdcode;
    Conexion conexion;
    String secretKey;
    public Recuperar(Conexion conexion) {
        this.conexion = conexion;
        this.hasdcode = new Index();
        this.secretKey = "mySecretKey12345";
        initComponents();
        initAlter();
    }
    
    public void initAlter(){
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_app.png")) );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        campo_correo = new javax.swing.JTextField();
        campo_pass = new javax.swing.JTextField();
        passValidar = new javax.swing.JLabel();
        campo_pass_validar = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 239, 230));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("Recuperar Contraseña");

        correo.setBackground(new java.awt.Color(0, 0, 0));
        correo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        correo.setText("Ingrese su correo para Buscarlo :");

        campo_correo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));

        campo_pass.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));

        passValidar.setBackground(new java.awt.Color(0, 0, 0));
        passValidar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passValidar.setText("Validar Nueva Contraseña :");

        campo_pass_validar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));
        

        pass.setBackground(new java.awt.Color(0, 0, 0));
        pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass.setText("Nueva Contraseña  :");

        jButton1.setBackground(new java.awt.Color(154, 168, 213));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Recuperar Contraseña");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(154, 168, 213));
        btn_salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        btn_salir.setFocusable(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass)
                            .addComponent(passValidar)
                            .addComponent(correo)
                            .addComponent(campo_pass)
                            .addComponent(campo_correo)
                            .addComponent(campo_pass_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_pass_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String email = campo_correo.getText();
        String pass = campo_pass.getText();
        String passValidar = campo_pass_validar.getText();
        try {
            if (!email.equals("") && !pass.equals("") && !passValidar.equals("") ) {
                if(pass.equals(passValidar)){
                    String passEncript = hasdcode.encrypt(pass,this.secretKey);
                    boolean respuesta = this.conexion.recuperar(email,passEncript);
                    if(respuesta){
                        JOptionPane.showMessageDialog(null,"Contreseña recuperada con éxito");
                        campo_correo.setText("");
                        campo_pass.setText("");
                        campo_pass_validar.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null,"Correo invalido");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Contraseña de validacion no coincide");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Todos los campos deben estar llenos");
            }   
        } catch (Exception e) {
            System.out.println("Error al restablecer password: "+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
        Login abrir = new Login(conexion);
        abrir.setVisible(true);
        abrir.setResizable(false);
        abrir.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_salirActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_pass;
    private javax.swing.JTextField campo_pass_validar;
    private javax.swing.JLabel correo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel passValidar;
    // End of variables declaration//GEN-END:variables
}