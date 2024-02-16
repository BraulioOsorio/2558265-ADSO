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

/**
 *
 * @author INSTRUCTOR
 */
public class EditarParqueadero extends javax.swing.JPanel {

    ConsumoAPI conexion = new ConsumoAPI();
    Gson gson = new Gson();
    private String id_parqueadero;
    Color colorBoton;
    String estado = "";
    String estadoBoton = "";

    public EditarParqueadero() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        etq_nombre_edit = new javax.swing.JLabel();
        campo_nombre_edit = new javax.swing.JTextField();
        etq_direccion_edit = new javax.swing.JLabel();
        campo_direccion_edit = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        campo_nombre_buscar = new javax.swing.JTextField();
        btn_editar_parqueadero = new javax.swing.JButton();
        etq_nombre_parqueadero = new javax.swing.JLabel();
        etq_estado = new javax.swing.JLabel();
        etq_mostar_estado = new javax.swing.JLabel();
        btn_cambiar_estado = new javax.swing.JButton();
        etq_mensaje = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Parqueadero");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(49, 138, 222)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        etq_nombre_edit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre_edit.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre_edit.setText("NOMBRE:");

        campo_nombre_edit.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre_edit.setForeground(Color.decode("#318ade"));
        campo_nombre_edit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        etq_direccion_edit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_direccion_edit.setForeground(new java.awt.Color(49, 138, 222));
        etq_direccion_edit.setText("DIRECCIÓN:");

        campo_direccion_edit.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_direccion_edit.setForeground(Color.decode("#318ade"));
        campo_direccion_edit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

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

        campo_nombre_buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre_buscar.setForeground(Color.decode("#318ade"));
        campo_nombre_buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));
        campo_nombre_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombre_buscarActionPerformed(evt);
            }
        });
        campo_nombre_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_nombre_buscarKeyPressed(evt);
            }
        });

        btn_editar_parqueadero.setBackground(Color.decode("#318ade"));
        btn_editar_parqueadero.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_editar_parqueadero.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar_parqueadero.setText("EDITAR");
        btn_editar_parqueadero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar_parqueadero.setFocusable(false);
        btn_editar_parqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_parqueaderoActionPerformed(evt);
            }
        });

        etq_nombre_parqueadero.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre_parqueadero.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre_parqueadero.setText("NOMBRE PARQUEADERO:");

        etq_estado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_estado.setForeground(new java.awt.Color(49, 138, 222));
        etq_estado.setText("ESTADO:");

        btn_cambiar_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiar_estadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_nombre_parqueadero)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(etq_estado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(etq_mostar_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_cambiar_estado))
                                .addComponent(etq_nombre_edit, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etq_direccion_edit, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo_nombre_edit, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo_direccion_edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(campo_nombre_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_editar_parqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etq_nombre_parqueadero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombre_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(etq_nombre_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_nombre_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_direccion_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_direccion_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(etq_mostar_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etq_estado))
                    .addComponent(btn_cambiar_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btn_editar_parqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        etq_mensaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buscarParqueadero();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_editar_parqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_parqueaderoActionPerformed
        editarParqueadero();
    }//GEN-LAST:event_btn_editar_parqueaderoActionPerformed

    private void campo_nombre_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_nombre_buscarKeyPressed
        if (evt.getKeyChar() == '\n') {
            System.out.println("Se presiono enter y buscar el parqueadero");
            buscarParqueadero();
        }
    }//GEN-LAST:event_campo_nombre_buscarKeyPressed

    private void btn_cambiar_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiar_estadoActionPerformed
        JButton temp = (JButton) evt.getSource();
        cambiarEstadoParqueadero(temp.getText());
    }//GEN-LAST:event_btn_cambiar_estadoActionPerformed

    private void campo_nombre_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombre_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombre_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cambiar_estado;
    private javax.swing.JButton btn_editar_parqueadero;
    private javax.swing.JTextField campo_direccion_edit;
    private javax.swing.JTextField campo_nombre_buscar;
    private javax.swing.JTextField campo_nombre_edit;
    private javax.swing.JLabel etq_direccion_edit;
    private javax.swing.JLabel etq_estado;
    private javax.swing.JLabel etq_mensaje;
    private javax.swing.JLabel etq_mostar_estado;
    private javax.swing.JLabel etq_nombre_edit;
    private javax.swing.JLabel etq_nombre_parqueadero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void editarParqueadero() {
        System.out.println("editarPaqueadero");
        etq_mensaje.setText("");
        String nombreNew = campo_nombre_edit.getText();
        String direccionNew = campo_direccion_edit.getText();
        String estadoNew = etq_mostar_estado.getText();

        if (!nombreNew.equals("") && !direccionNew.equals("")) {
            System.out.println(nombreNew + " " + direccionNew);
            Map<String, String> datosParqueadero = new HashMap<>();
            datosParqueadero.put("id_parqueadero", this.id_parqueadero);
            datosParqueadero.put("nombre", nombreNew);
            datosParqueadero.put("direccion", direccionNew);
            datosParqueadero.put("estado", (String) ((estadoNew.equals("ACTIVO")) ? "1" : "0"));

            try {
                String temporal = conexion.consumoPOST("http://localhost/APIparqueadero/parqueaderos/UpdateParking.php", datosParqueadero);

                JsonObject jsonObject = gson.fromJson(temporal, JsonObject.class);
                System.out.println(jsonObject);

                if (jsonObject.get("status").getAsBoolean()) {
                    etq_mensaje.setText("Parqueadero " + nombreNew + " editado.");
                    campo_nombre_edit.setText("");
                    campo_direccion_edit.setText("");
                    etq_mostar_estado.setText("");
                    btn_cambiar_estado.setText("ESTADO");
                    colorBoton = Color.decode("#318ade");
                    btn_cambiar_estado.setBackground(colorBoton);
                    btn_cambiar_estado.setForeground(Color.WHITE);
                    btn_cambiar_estado.setEnabled(false);
                } else {
                    etq_mensaje.setText("Algo ocurrió, intentalo de nuevo.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Intentalo de nuevo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
        }
    }

    public void buscarParqueadero() {
        etq_mensaje.setText("");

        String nombreBuscado = campo_nombre_buscar.getText();

        Map<String, String> dataPost = new HashMap<>();
        dataPost.put("nombre", nombreBuscado);
        try {
            String response = conexion.consumoPOST("http://localhost/APIparqueadero/parqueaderos/BuscarParqueadero.php", dataPost);
            JsonObject jsonObject = gson.fromJson(response, JsonObject.class);
            System.out.println(jsonObject);

            JsonArray registros = jsonObject.getAsJsonArray("parqueadero");
            //!registros.isEmpty()
            //registros.size() > 0
            if (registros.size() > 0) {

                for (JsonElement registro : registros) {
                    JsonObject registrosOb = registro.getAsJsonObject();

                    String nombreActual = registrosOb.get("nombre").getAsString();
                    String direccionActual = registrosOb.get("direccion").getAsString();
                    int estadoActual = registrosOb.get("estado").getAsInt();

                    this.id_parqueadero = registrosOb.get("id_parqueadero").getAsString();
                    System.out.println("nombre actual: " + nombreActual);

                    campo_nombre_edit.setText(nombreActual);
                    campo_direccion_edit.setText(direccionActual);
                    if (estadoActual == 1) {
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
            } else {
                etq_mensaje.setText("El parqueadero no existe.");
                campo_nombre_edit.setText("");
                campo_direccion_edit.setText("");
                etq_mostar_estado.setText("");
                btn_cambiar_estado.setText("ESTADO");
                colorBoton = Color.decode("#318ade");
                btn_cambiar_estado.setBackground(colorBoton);
                btn_cambiar_estado.setForeground(Color.WHITE);
                btn_cambiar_estado.setEnabled(false);
            }

        } catch (Exception e) {
            System.out.println("error al obtener el parqueadero");
        }
        campo_nombre_buscar.setText("");
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

}
