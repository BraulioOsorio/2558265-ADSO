/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class EditarVendedor extends javax.swing.JPanel {
    
    ConsumoAPI conexion = new ConsumoAPI();
    Gson gson = new Gson();
    String estado = "";
    Color colorBoton;
    String estadoBoton = "";
    public EditarVendedor() {
        this.colorBoton = Color.decode("#318ade");
        initComponents();
        btn_cambiar_estado.setText("ESTADO");
        btn_cambiar_estado.setBackground(colorBoton);
        btn_cambiar_estado.setForeground(Color.WHITE);
        btn_cambiar_estado.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        campo_contrasenia = new javax.swing.JPasswordField();
        campo_cedula = new javax.swing.JTextField();
        etq_pass = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etq_emial = new javax.swing.JLabel();
        campo_emial = new javax.swing.JTextField();
        btn_crear_vendedor = new javax.swing.JButton();
        etq_buscar = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        etq_estado = new javax.swing.JLabel();
        etq_mostar_estado = new javax.swing.JLabel();
        btn_cambiar_estado = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Editar vendedor");
        etq_titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(49, 138, 222)));

        etq_cedula.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(49, 138, 222));
        etq_cedula.setText("CEDULA");

        campo_contrasenia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campo_contrasenia.setForeground(Color.decode("#318ade")
        );
        campo_contrasenia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        campo_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedula.setForeground(Color.decode("#318ade"));
        campo_cedula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));
        campo_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_cedulaKeyPressed(evt);
            }
        });

        etq_pass.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_pass.setForeground(new java.awt.Color(49, 138, 222));
        etq_pass.setText("CONTRASEÑA");

        etq_nombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre.setText("NOMBRE:");

        campo_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre.setForeground(Color.decode("#318ade"));
        campo_nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        etq_emial.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_emial.setForeground(new java.awt.Color(49, 138, 222));
        etq_emial.setText("CORREO");

        campo_emial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_emial.setForeground(Color.decode("#318ade"));
        campo_emial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        btn_crear_vendedor.setBackground(Color.decode("#318ade"));
        btn_crear_vendedor.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_crear_vendedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear_vendedor.setText("EDITAR");
        btn_crear_vendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crear_vendedor.setFocusable(false);
        btn_crear_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_vendedorActionPerformed(evt);
            }
        });

        etq_buscar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_buscar.setForeground(new java.awt.Color(49, 138, 222));
        etq_buscar.setText("INGRESE LA CEDULA DEL VENDEDOR");

        btn_buscar.setBackground(Color.decode("#318ade"));
        btn_buscar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setFocusable(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_estado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_estado.setForeground(new java.awt.Color(49, 138, 222));
        etq_estado.setText("ESTADO:");

        etq_mostar_estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_cambiar_estado.setFocusable(false);
        btn_cambiar_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiar_estadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 161, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campo_emial, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(etq_cedula, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo_cedula))
                            .addComponent(etq_emial)
                            .addComponent(campo_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_pass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_nombre)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_estado)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(etq_mostar_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_cambiar_estado))
                                .addComponent(campo_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_buscar)
                .addGap(180, 180, 180))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(btn_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_buscar)
                .addGap(25, 25, 25)
                .addComponent(etq_cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etq_emial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_emial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etq_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addComponent(etq_pass))
                    .addComponent(etq_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cambiar_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_contrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(etq_mostar_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btn_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crear_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_vendedorActionPerformed
        System.out.println("Se edito el vendedor");
        String nombre = campo_nombre.getText();
        String contrasenia = campo_contrasenia.getText();
        String email = campo_emial.getText();
        String documento = campo_cedula.getText();
        String estadoNew = etq_mostar_estado.getText();
        System.out.println(estadoNew);
        Map<String, String> updateData = new HashMap<>();
        updateData.put("correo", email);
        updateData.put("contrasenia", contrasenia);
        updateData.put("nombre", nombre);
        updateData.put("documento", documento);
        updateData.put("estado", (String) ((estadoNew.equals("ACTIVO")) ? "1" : "0"));


        try {
            String temporal = conexion.consumoPOST("http://localhost/APIparqueadero/usuarios/Update.php", updateData);

            System.out.println(temporal);
            JsonObject jsonObject = gson.fromJson(temporal, JsonObject.class);

            if (jsonObject.has("mesagge")) {
                String mensajeDeError = jsonObject.get("mesagge").getAsString();

                if (mensajeDeError.equals("ERROR##SQL")) {
                    JOptionPane.showMessageDialog(null, "Intentalo de nuevo");
                }else{
                campo_nombre.setText("");
                campo_contrasenia.setText("");
                campo_emial.setText("");
                campo_cedula.setText("");
                btn_cambiar_estado.setText("ESTADO");
                etq_mostar_estado.setText("");
                this.colorBoton = Color.decode("#318ade");
                btn_cambiar_estado.setBackground(colorBoton);
                btn_cambiar_estado.setForeground(Color.WHITE);
                btn_cambiar_estado.setEnabled(false);
                btn_cambiar_estado.setBackground(colorBoton);
                campo_cedula.setEnabled(true);
                campo_cedula.requestFocus();
                JOptionPane.showMessageDialog(null, "Editado con éxito");
            }

            }
            
        } catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_btn_crear_vendedorActionPerformed

    private void campo_cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_cedulaKeyPressed

        if (evt.getKeyChar() == '\n') {
            System.out.println("Se presiono enter y buscar el vendedor");
            ObtenerDatosVendedor();
        }
    }//GEN-LAST:event_campo_cedulaKeyPressed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        System.out.println("Se presiono boton y buscar el vendedor");
        ObtenerDatosVendedor();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_cambiar_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiar_estadoActionPerformed
        JButton temp = (JButton) evt.getSource();
        cambiarEstadoParqueadero(temp.getText());
    }//GEN-LAST:event_btn_cambiar_estadoActionPerformed

    public void ObtenerDatosVendedor(){
        String documento = campo_cedula.getText();
        Map<String, String> dataPost = new HashMap<>();
        dataPost.put("documento", documento);
        try {
            String response = conexion.consumoPOST("http://localhost/APIparqueadero/usuarios/findVendedor.php", dataPost);
            
            JsonObject jsonObject = gson.fromJson(response, JsonObject.class);
            System.out.println(jsonObject.toString());
            
            String identidad = jsonObject.getAsJsonObject("vendedor").get("documento").getAsString();
            String nombre = jsonObject.getAsJsonObject("vendedor").get("nombre").getAsString();
            String correo = jsonObject.getAsJsonObject("vendedor").get("correo").getAsString();
            String passw = jsonObject.getAsJsonObject("vendedor").get("contrasenia").getAsString();
            String estados = jsonObject.getAsJsonObject("vendedor").get("estado").getAsString();
            if (estados.equals("1")) {
                estado = "ACTIVO";
                estadoBoton = "DESACTIVAR";
                colorBoton = Color.RED;
            }else{
                estado = "INACTIVO";
                estadoBoton = "ACTIVAR";
                colorBoton = Color.GREEN;
            }

            campo_emial.setText(correo);
            campo_nombre.setText(nombre);
            campo_contrasenia.setText(passw);
            etq_mostar_estado.setText(estado);
            btn_cambiar_estado.setEnabled(true);
            btn_cambiar_estado.setText(estadoBoton);
            btn_cambiar_estado.setBackground(colorBoton);
            campo_cedula.setEnabled(false);

            

        } catch (Exception e) {

            etq_mostar_estado.setText("");
            btn_cambiar_estado.setText("ESTADO");
            colorBoton = Color.decode("#318ade");
            btn_cambiar_estado.setBackground(colorBoton);
            btn_cambiar_estado.setForeground(Color.WHITE);
            btn_cambiar_estado.setEnabled(false);
            System.out.println("error al obtener el vendedor");
        }
    }
    
        private void cambiarEstadoParqueadero(String estado) {
            if (estado.equalsIgnoreCase("ACTIVAR")) {
                estado = "ACTIVO";
                estadoBoton = "DESACTIVAR";
                colorBoton = Color.RED;
            } else {
                estado = "INACTIVO";
                estadoBoton = "ACTIVAR";
                colorBoton = Color.GREEN;
            }
            etq_mostar_estado.setText(estado);
            btn_cambiar_estado.setEnabled(true);
            btn_cambiar_estado.setText(estadoBoton);
            btn_cambiar_estado.setBackground(colorBoton);
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cambiar_estado;
    private javax.swing.JButton btn_crear_vendedor;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JPasswordField campo_contrasenia;
    private javax.swing.JTextField campo_emial;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel etq_buscar;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_emial;
    private javax.swing.JLabel etq_estado;
    private javax.swing.JLabel etq_mostar_estado;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_pass;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
