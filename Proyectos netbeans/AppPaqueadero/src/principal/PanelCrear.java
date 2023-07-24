package principal;

import javax.swing.JOptionPane;

public class PanelCrear extends javax.swing.JPanel {

    
    public PanelCrear() {
        initComponents();
        btn_registrar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        etq_nombres = new javax.swing.JLabel();
        campo_nombres = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        etq_email = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setText("CREAR CLIENTE");

        etq_cedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_cedula.setText("CEDULA:");

        campo_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_nombresKeyReleased(evt);
            }
        });

        etq_nombres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_nombres.setText("NOMBRES:");

        campo_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_nombresKeyReleased(evt);
            }
        });

        etq_apellidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_apellidos.setText("APELLIDOS:");

        campo_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_nombresKeyReleased(evt);
            }
        });

        etq_telefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_telefono.setText("TELEFONO:");

        campo_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_nombresKeyReleased(evt);
            }
        });

        etq_email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_email.setText("EMAIL:");

        campo_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_nombresKeyReleased(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(0, 0, 204));
        btn_registrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.setFocusable(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etq_nombres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etq_cedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etq_apellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etq_telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etq_email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campo_email, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_cedula)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombres)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_email)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        Conexion conexion = new Conexion();
        conexion.getConnection();
        
        String cedula = campo_cedula.getText();
        String name = campo_nombres.getText();
        String ape = campo_apellidos.getText();
        String cel = campo_telefono.getText();
        String correo = campo_email.getText();
        
        try {
            Boolean response = conexion.insert(cedula, name, ape, cel, correo);
            if (response) {
                JOptionPane.showMessageDialog(null,"Creado con éxito");
                
                campo_cedula.setText("");
                campo_nombres.setText("");
                campo_apellidos.setText("");
                campo_telefono.setText("");
                campo_email.setText("");
                btn_registrar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null,"Error al crear");
                System.out.println("No se pudo crear");
            }
        } catch (Exception e) {
            
            System.out.println("Error: "+e.getMessage());
        }
        
        
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void campo_nombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_nombresKeyReleased
        if ( (!campo_cedula.getText().equals("")) && (!campo_nombres.getText().equals("")) && (!campo_apellidos.getText().equals("")) && (!campo_telefono.getText().equals("")) && (!campo_email.getText().equals("")) ) {
            btn_registrar.setEnabled(true);
        }else{
            btn_registrar.setEnabled(false);
        }
    }//GEN-LAST:event_campo_nombresKeyReleased
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_email;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
