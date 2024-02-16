package principal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JPanel;

public class PanelAsignar extends javax.swing.JPanel {

    JPanel panel_contenido;
    String nombreParqueadero;
    String id_parqueadero;
    String documento;
    ConsumoAPI conexion = new ConsumoAPI();
    Gson gson = new Gson();
    

    public PanelAsignar(JPanel panel_contenido, String nombreParqueadero, String id_parqueadero) {
        this.panel_contenido = panel_contenido;
        this.nombreParqueadero = nombreParqueadero;
        this.id_parqueadero = id_parqueadero;
        initComponents();
        etq_nombre_empresa.setText(nombreParqueadero.toUpperCase());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_content = new javax.swing.JPanel();
        etq_nombre_empresa = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        etq_texto_descripcion = new javax.swing.JLabel();
        btn_asignar_vendedor = new javax.swing.JButton();
        etq_nombres_vendedor = new javax.swing.JLabel();
        etq_correo_vendedor = new javax.swing.JLabel();
        btn_buscar_vendedor = new javax.swing.JButton();
        etq_rol_vendedor = new javax.swing.JLabel();

        panel_content.setBackground(new java.awt.Color(255, 255, 255));

        etq_nombre_empresa.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        etq_nombre_empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_cedula.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(49, 138, 222));
        etq_cedula.setText("CEDULA VENDEDOR:");

        campo_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedula.setForeground(Color.decode("#318ade"));
        campo_cedula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));
        campo_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_cedulaKeyPressed(evt);
            }
        });

        etq_texto_descripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_texto_descripcion.setText("Ingrese el documento del vendeor.");

        btn_asignar_vendedor.setBackground(Color.decode("#318ade"));
        btn_asignar_vendedor.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_asignar_vendedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_asignar_vendedor.setText("ASIGNAR");
        btn_asignar_vendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_asignar_vendedor.setFocusable(false);
        btn_asignar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignar_vendedorActionPerformed(evt);
            }
        });

        etq_correo_vendedor.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btn_buscar_vendedor.setBackground(Color.decode("#318ade"));
        btn_buscar_vendedor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btn_buscar_vendedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar_vendedor.setText("BUSCAR");
        btn_buscar_vendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar_vendedor.setFocusable(false);
        btn_buscar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_vendedorActionPerformed(evt);
            }
        });

        etq_rol_vendedor.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panel_contentLayout = new javax.swing.GroupLayout(panel_content);
        panel_content.setLayout(panel_contentLayout);
        panel_contentLayout.setHorizontalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contentLayout.createSequentialGroup()
                .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contentLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(etq_nombre_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_contentLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(etq_texto_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                        .addComponent(etq_cedula)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                        .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_correo_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_nombres_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_rol_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_contentLayout.createSequentialGroup()
                                .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_asignar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        panel_contentLayout.setVerticalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contentLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etq_nombre_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(etq_texto_descripcion)
                .addGap(55, 55, 55)
                .addComponent(etq_cedula)
                .addGap(27, 27, 27)
                .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etq_nombres_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_correo_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_rol_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btn_asignar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_cedulaKeyPressed

        if (evt.getKeyChar() == '\n') {
            buscarVendedor();
        }
    }//GEN-LAST:event_campo_cedulaKeyPressed

    private void btn_asignar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignar_vendedorActionPerformed
        asignarVendedor();
    }//GEN-LAST:event_btn_asignar_vendedorActionPerformed

    private void btn_buscar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_vendedorActionPerformed
        buscarVendedor();
    }//GEN-LAST:event_btn_buscar_vendedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asignar_vendedor;
    private javax.swing.JButton btn_buscar_vendedor;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_correo_vendedor;
    private javax.swing.JLabel etq_nombre_empresa;
    private javax.swing.JLabel etq_nombres_vendedor;
    private javax.swing.JLabel etq_rol_vendedor;
    private javax.swing.JLabel etq_texto_descripcion;
    private javax.swing.JPanel panel_content;
    // End of variables declaration//GEN-END:variables

    private void buscarVendedor() {
        documento = campo_cedula.getText();

        if (!documento.equals("")) {
            Map<String, String> insertData = new HashMap<>();
            insertData.put("documento", documento);
            String respuestaFindVendedor = conexion.consumoPOST("http://localhost/APIparqueadero/usuarios/findVendedor.php", insertData);

            if (respuestaFindVendedor != null) {
                JsonObject jsonObject = gson.fromJson(respuestaFindVendedor, JsonObject.class);
                
                if (jsonObject.size() > 0) {
                    
                    String estado= jsonObject.getAsJsonObject("vendedor").get("estado").getAsString();


                    if (estado.equals("1")) {
                        String nombre = jsonObject.getAsJsonObject("vendedor").get("nombre").getAsString();
                        String correo = jsonObject.getAsJsonObject("vendedor").get("correo").getAsString();
                        String rol = jsonObject.getAsJsonObject("vendedor").get("rol").getAsString();

                        etq_rol_vendedor.setForeground(Color.black);
                        etq_rol_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
                        etq_nombres_vendedor.setText("Nombre: " + nombre);
                        etq_correo_vendedor.setText("Correo: " + correo);
                        etq_rol_vendedor.setText("Rol: " + rol);
                    }
                    
                } else {
                    etq_nombres_vendedor.setText("");
                    etq_correo_vendedor.setText("");
                    campo_cedula.setText("");
                    etq_rol_vendedor.setText("El usuario con documento "+documento+" no existe o no tiene el rol Vendedor");
                    etq_rol_vendedor.setForeground(Color.red);
                    etq_rol_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                }
                
            } else {
                System.out.println("Hubieron problemas en la consulta");
            }
        }else{
            etq_nombres_vendedor.setText("");
            etq_correo_vendedor.setText("");
            etq_rol_vendedor.setText("Debe ingresar un documento válido");
            etq_rol_vendedor.setForeground(Color.red);
            etq_rol_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        }
    }

    private void asignarVendedor() {
        Map<String, String> insertData = new HashMap<>();
        insertData.put("id_usuario", documento);
        insertData.put("id_parqueadero", id_parqueadero);
        String respuestaAsignarVend = conexion.consumoPOST("http://localhost/APIparqueadero/parqueadero_vendedores/asignarVendedor.php",insertData);

        if (respuestaAsignarVend != null) {
            JsonParser parser = new JsonParser();
            JsonObject registroAsignar = parser.parse(respuestaAsignarVend).getAsJsonObject();

            boolean status = registroAsignar.get("status").getAsBoolean();

            if (status) {
                campo_cedula.setText("");
                etq_rol_vendedor.setText("El usuario ha sido asignado exitosamente");
                etq_rol_vendedor.setForeground(Color.green);
                etq_rol_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                etq_nombres_vendedor.setText("");
                etq_correo_vendedor.setText("");
                System.out.println("El usuario ha sido asignado exitosamente");
            } else {
                String message = registroAsignar.get("mesagge").getAsString();
                System.out.println("No se pudo asignar el usuario: " + message);
            }
        } else {
            campo_cedula.setText("");
            etq_rol_vendedor.setText("Hubieron problemas al momento de asignar el vendedor");
            etq_rol_vendedor.setForeground(Color.red);
            etq_rol_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            etq_nombres_vendedor.setText("");
            etq_correo_vendedor.setText("");
            System.out.println("Hubieron problemas al momento de asignar el vendedor al parqueadero.");
        }
    }
}
