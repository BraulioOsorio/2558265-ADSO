package principal;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class PAddVehiculo extends javax.swing.JPanel {

    ConsumoAPI conexion = new ConsumoAPI();

    public PAddVehiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etq_placa = new javax.swing.JLabel();
        campo_placa = new javax.swing.JTextField();
        etq_nombre = new javax.swing.JLabel();
        etq_propietario = new javax.swing.JLabel();
        campo_propietario = new javax.swing.JTextField();
        opcion_vehiculo = new javax.swing.JComboBox<>();
        btn_registrar = new javax.swing.JButton();
        etq_mensaje = new javax.swing.JLabel();

        panel_content.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR VEHICULO");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(49, 138, 222)));

        etq_placa.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_placa.setForeground(new java.awt.Color(49, 138, 222));
        etq_placa.setText("PLACA:");

        campo_placa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_placa.setForeground(Color.decode("#318ade"));
        campo_placa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        etq_nombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre.setText("TIPO:");

        etq_propietario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_propietario.setForeground(new java.awt.Color(49, 138, 222));
        etq_propietario.setText("PROPIETARIO:");
        etq_propietario.setToolTipText("");

        campo_propietario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_propietario.setForeground(Color.decode("#318ade"));
        campo_propietario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        opcion_vehiculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        opcion_vehiculo.setMaximumRowCount(20);
        opcion_vehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "carro", "moto", "camioneta", "camion" }));
        opcion_vehiculo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        btn_registrar.setBackground(Color.decode("#318ade"));
        btn_registrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.setFocusable(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        etq_mensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_contentLayout = new javax.swing.GroupLayout(panel_content);
        panel_content.setLayout(panel_contentLayout);
        panel_contentLayout.setHorizontalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contentLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                        .addComponent(btn_registrar)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                        .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campo_placa, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                .addComponent(etq_nombre)
                                .addComponent(etq_placa)
                                .addComponent(etq_propietario)
                                .addComponent(campo_propietario)))
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                        .addComponent(etq_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        panel_contentLayout.setVerticalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(etq_placa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(etq_propietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(etq_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(etq_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        registrarVehiculo();
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_placa;
    private javax.swing.JTextField campo_propietario;
    private javax.swing.JLabel etq_mensaje;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_placa;
    private javax.swing.JLabel etq_propietario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> opcion_vehiculo;
    private javax.swing.JPanel panel_content;
    // End of variables declaration//GEN-END:variables

    private void registrarVehiculo() {
        String placa = campo_placa.getText().toUpperCase();
        String propietario = campo_propietario.getText();
        String tipo = opcion_vehiculo.getSelectedItem().toString();

        if (placa.length() == 6) {
            if (tipo.equals("") || placa.equals("") || propietario.equals("")) {
                etq_mensaje.setForeground(Color.red);
                etq_mensaje.setText("No se pueden enviar campos vacios");
            } else {
                Map<String, String> insertDataFind = new HashMap<>();
                insertDataFind.put("placa", placa);
                String respuestaSelect = conexion.consumoPOST("http://localhost/APIparqueadero/vehiculos/findVehiculo.php", insertDataFind);
                System.out.println("respuesta del select" + respuestaSelect);

                if (respuestaSelect != null) {
                    JsonParser parser = new JsonParser();
                    JsonObject registroFind = parser.parse(respuestaSelect).getAsJsonObject();

                    boolean statusFind = registroFind.get("status").getAsBoolean();
                    System.out.println(statusFind);
                            

                    if (statusFind) {
                        etq_mensaje.setForeground(Color.red);
                        etq_mensaje.setText("La placa " + placa + " ya se encuentra registrada");
                    } else {
                        System.out.println("Tipo de vehiculo: " + tipo);
                        Map<String, String> insertData = new HashMap<>();
                        insertData.put("placa", placa);
                        insertData.put("propietario", propietario);
                        insertData.put("tipo_vehiculo", tipo);
                        String respuestaInsert = conexion.consumoPOST("http://localhost/APIparqueadero/vehiculos/insertVehiculo.php", insertData);

                        if (respuestaInsert != null) {
                            JsonObject registroAsignar = parser.parse(respuestaInsert).getAsJsonObject();

                            boolean status = registroAsignar.get("status").getAsBoolean();

                            if (status) {
                                campo_placa.setText("");
                                campo_propietario.setText("");
                                opcion_vehiculo.setSelectedIndex(0);
                                etq_mensaje.setForeground(Color.green);
                                etq_mensaje.setText("Vehiculo registrado exitosamente");
                            } else {
                                campo_placa.setText("");
                                campo_propietario.setText("");
                                opcion_vehiculo.setSelectedIndex(0);
                                etq_mensaje.setForeground(Color.red);
                                etq_mensaje.setText("Hubieron problemas al registrar el vehiculo, llame al programador");
                                String message = registroAsignar.get("mesagge").getAsString();
                                System.out.println("MENSAJE: " + message);
                            }
                        } else {
                            etq_mensaje.setForeground(Color.red);
                            etq_mensaje.setText("Algo salio mal, vuelva a intentarlo");
                        }
                    }
                }
            }
        } else {
            etq_mensaje.setForeground(Color.red);
            etq_mensaje.setText("Ingrese una placa valida");
        }
    }
}
