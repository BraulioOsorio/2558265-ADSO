/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import clases.Conexion;

import javax.swing.JOptionPane;

/**
 *
 * @author Braulio_07
 */
public class Estados extends javax.swing.JFrame {

    Conexion conexion;
    String nombres;
    String fotos;
    String correos;
    String estados;
    String tarea;
    String idUser;
    public Estados(Conexion conexion,String nombre,String foto,String correo,String estado,String tarea,String id) {
        initComponents();
        this.tarea = tarea;
        this.estados = estado;
        this.nombres = nombre;
        this.fotos=foto;
        this.idUser = id;
        this.correos=correo;
        this.conexion = conexion;
        validarBotones();
        
    }

    public void validarBotones(){
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_app.png")) ); 
        if(estados.equals("PENDIENTE")){
            btn_pediente.setEnabled(false);
        }else if(estados.equals("PROCESO")){
            btn_proceso.setEnabled(false);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        btn_pediente = new javax.swing.JButton();
        btn_realizada = new javax.swing.JButton();
        btn_proceso = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 239, 230));

        etq_titulo.setBackground(new java.awt.Color(159, 168, 213));
        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Cambiar estado de la Tarea");
        etq_titulo.setOpaque(true);

        btn_pediente.setBackground(new java.awt.Color(159, 168, 213));
        btn_pediente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pediente.setForeground(new java.awt.Color(0, 0, 0));
        btn_pediente.setText("TAREA PENDIENTE");
        btn_pediente.setFocusable(false);
        btn_pediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedienteActionPerformed(evt);
            }
        });

        btn_realizada.setBackground(new java.awt.Color(159, 168, 213));
        btn_realizada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_realizada.setForeground(new java.awt.Color(0, 0, 0));
        btn_realizada.setText("TAREA REALIZADA");
        btn_realizada.setFocusable(false);
        btn_realizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_realizadaActionPerformed(evt);
            }
        });

        btn_proceso.setBackground(new java.awt.Color(159, 168, 213));
        btn_proceso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_proceso.setForeground(new java.awt.Color(0, 0, 0));
        btn_proceso.setText("TAREA EN PROCESO");
        btn_proceso.setFocusable(false);
        btn_proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesoActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(159, 168, 213));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancelar.setText("CANCELAR TAREA");
        btn_cancelar.setFocusable(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(159, 168, 213));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("SALIR");
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
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_pediente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_proceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_realizada, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pediente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_realizada, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btn_pedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedienteActionPerformed
    dispose();
        String estado = "PENDIENTE";
        boolean response = conexion.removeTasks(this.tarea,estado);
        if(response){
            PanelTareas abrir = new PanelTareas(conexion,this.nombres,this.fotos,this.correos,estado,this.idUser);
            abrir.setVisible(true);
            abrir.setResizable(false);
            abrir.setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Estado Cambiado con exito");
        } 
    }//GEN-LAST:event_btn_pedienteActionPerformed
    
    
    private void btn_realizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_realizadaActionPerformed
        dispose();
        String estado = "REALIZADO";
        boolean response = conexion.removeTasks(this.tarea,estado);
        if(response){
            PanelTareas abrir = new PanelTareas(conexion,this.nombres,this.fotos,this.correos,estado,this.idUser);
            abrir.setVisible(true);
            abrir.setResizable(false);
            abrir.setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Estado Cambiado con exito");
        }
        
        
    }//GEN-LAST:event_btn_realizadaActionPerformed

    private void btn_procesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesoActionPerformed
        dispose();
        String estado = "PROCESO";
        boolean response = conexion.removeTasks(this.tarea,estado);
        if(response){
            PanelTareas abrir = new PanelTareas(conexion,this.nombres,this.fotos,this.correos,estado,this.idUser);
            abrir.setVisible(true);
            abrir.setResizable(false);
            abrir.setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Estado Cambiado con exito");
        }
    }//GEN-LAST:event_btn_procesoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
        String estado = "CANCELAR";
        boolean response = conexion.removeTasks(this.tarea,estado);
        if(response){
            PanelTareas abrir = new PanelTareas(conexion,this.nombres,this.fotos,this.correos,estado,this.idUser);
            abrir.setVisible(true);
            abrir.setResizable(false);
            abrir.setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Estado Cambiado con exito");
        }
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
        PanelTareas abrir = new PanelTareas(conexion,this.nombres,this.fotos,this.correos,this.estados,this.idUser);
        abrir.setVisible(true);
        abrir.setResizable(false);
        abrir.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_pediente;
    private javax.swing.JButton btn_proceso;
    private javax.swing.JButton btn_realizada;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
