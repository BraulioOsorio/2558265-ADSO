/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import com.google.gson.Gson;

/**
 *
 * @author INSTRUCTOR
 */
public class Menu extends javax.swing.JFrame {

    ConsumoAPI ejemplo;
    Gson gson;
    public Menu(ConsumoAPI ejemplo,Gson gson) {
        this.ejemplo = ejemplo;
        this.gson = gson;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ingresar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_recuperar = new javax.swing.JButton();
        etq_titulo = new javax.swing.JLabel();
        btn_ingresar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_ingresar.setBackground(new java.awt.Color(159, 168, 213));
        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ingresar.setText("Actualizar Persona");
        btn_ingresar.setFocusable(false);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(159, 168, 213));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setText("Lista De Personas");
        btn_registrar.setFocusable(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_recuperar.setBackground(new java.awt.Color(159, 168, 213));
        btn_recuperar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_recuperar.setText("Crear Persona");
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
        etq_titulo.setText("Menu");
        etq_titulo.setOpaque(true);

        btn_ingresar1.setBackground(new java.awt.Color(159, 168, 213));
        btn_ingresar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ingresar1.setText("Eliminar Persona");
        btn_ingresar1.setFocusable(false);
        btn_ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_recuperar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ingresar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_recuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ingresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        dispose();
        ActualizarDatos v1 = new ActualizarDatos(ejemplo,gson);
        v1.setVisible(true);
        v1.setResizable(false);
        v1.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        dispose();
        ListaPersonas v1 = new ListaPersonas(ejemplo,gson);
        v1.setVisible(true);
        v1.setResizable(false);
        v1.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_recuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recuperarActionPerformed
        dispose();
        CrearUser v1 = new CrearUser(ejemplo,gson);
        v1.setVisible(true);
        v1.setResizable(false);
        v1.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn_recuperarActionPerformed

    private void btn_ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar1ActionPerformed
        dispose();
        EliminarUser v1 = new EliminarUser(ejemplo,gson);
        v1.setVisible(true);
        v1.setResizable(false);
        v1.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_ingresar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_ingresar1;
    private javax.swing.JButton btn_recuperar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
