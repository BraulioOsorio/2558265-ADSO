package principal;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MenuVend extends javax.swing.JPanel {

    ConsumoAPI conexion = new ConsumoAPI();
    Gson gson = new Gson();
    JPanel panel_contenido;
    JsonObject datosParqueadero;
    JsonObject usuario;
    String estado;
    public MenuVend(JPanel panel_contenido, JsonObject datosParqueadero, JsonObject usuario) {
        this.datosParqueadero = datosParqueadero;
        this.panel_contenido = panel_contenido;
        this.usuario = usuario;
        initComponents();
        initComponentsAlter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_botones = new javax.swing.JPanel();
        btnBuscarVehiculo = new javax.swing.JButton();
        btnCosto = new javax.swing.JButton();
        btnTickets = new javax.swing.JButton();
        addVehiculo = new javax.swing.JButton();
        definirTarifas = new javax.swing.JButton();
        infoParq = new javax.swing.JButton();
        listaTi = new javax.swing.JButton();

        panel_botones.setBackground(new java.awt.Color(15, 92, 162));

        btnBuscarVehiculo.setBackground(new java.awt.Color(49, 138, 222));
        btnBuscarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVehiculo.setText("Buscar Vehiculo");
        btnBuscarVehiculo.setBorder(null);
        btnBuscarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarVehiculo.setFocusable(false);
        btnBuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiculoActionPerformed(evt);
            }
        });

        btnCosto.setBackground(new java.awt.Color(49, 138, 222));
        btnCosto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCosto.setForeground(new java.awt.Color(255, 255, 255));
        btnCosto.setText("Salida");
        btnCosto.setBorder(null);
        btnCosto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCosto.setFocusable(false);
        btnCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoActionPerformed(evt);
            }
        });

        btnTickets.setBackground(new java.awt.Color(49, 138, 222));
        btnTickets.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTickets.setForeground(new java.awt.Color(255, 255, 255));
        btnTickets.setText("Entrada");
        btnTickets.setBorder(null);
        btnTickets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTickets.setFocusable(false);
        btnTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsActionPerformed(evt);
            }
        });

        addVehiculo.setBackground(new java.awt.Color(49, 138, 222));
        addVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        addVehiculo.setText("Registrar Vehiculos");
        addVehiculo.setBorder(null);
        addVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addVehiculo.setFocusable(false);
        addVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehiculoActionPerformed(evt);
            }
        });

        definirTarifas.setBackground(new java.awt.Color(49, 138, 222));
        definirTarifas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        definirTarifas.setForeground(new java.awt.Color(255, 255, 255));
        definirTarifas.setText("Definir Tarifas");
        definirTarifas.setBorder(null);
        definirTarifas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        definirTarifas.setFocusable(false);
        definirTarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definirTarifasActionPerformed(evt);
            }
        });

        infoParq.setBackground(new java.awt.Color(49, 138, 222));
        infoParq.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        infoParq.setForeground(new java.awt.Color(255, 255, 255));
        infoParq.setText("Info Parqueadero");
        infoParq.setBorder(null);
        infoParq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoParq.setFocusable(false);
        infoParq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoParqActionPerformed(evt);
            }
        });

        listaTi.setBackground(new java.awt.Color(49, 138, 222));
        listaTi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listaTi.setForeground(new java.awt.Color(255, 255, 255));
        listaTi.setText("Historico Tickets");
        listaTi.setBorder(null);
        listaTi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaTi.setFocusable(false);
        listaTi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(definirTarifas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoParq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listaTi, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botonesLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(infoParq, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(definirTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaTi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoActionPerformed
        panel_contenido.removeAll();
        PbuscarVehiculo buscarVehiculo = new PbuscarVehiculo();
        buscarVehiculo.setSize(panel_contenido.getSize());
        panel_contenido.add(buscarVehiculo);
        repaint();
        revalidate();
    }//GEN-LAST:event_btnBuscarVehiculoActionPerformed

    private void btnCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoActionPerformed
        panel_contenido.removeAll();
        String parqueadero = datosParqueadero.getAsJsonObject("registros").get("id_parqueadero").getAsString();
        PSalida salida = new PSalida(parqueadero);
        salida.setSize(panel_contenido.getSize());
        panel_contenido.add(salida);
        repaint();
        revalidate();
    }//GEN-LAST:event_btnCostoActionPerformed

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        panel_contenido.removeAll();
        String parqueadero = datosParqueadero.getAsJsonObject("registros").get("id_parqueadero").getAsString();
        PEntrada entrada = new PEntrada(parqueadero);
        entrada.setSize(panel_contenido.getSize());
        panel_contenido.add(entrada);
        repaint();
        revalidate();
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void addVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehiculoActionPerformed
        panel_contenido.removeAll();
        PAddVehiculo addVehiculo = new PAddVehiculo();
        addVehiculo.setSize(panel_contenido.getSize());
        panel_contenido.add(addVehiculo);
        repaint();
        revalidate();
    }//GEN-LAST:event_addVehiculoActionPerformed

    private void definirTarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definirTarifasActionPerformed
        panel_contenido.removeAll();
        DefinirTarifas tarifas = new DefinirTarifas(datosParqueadero);
        tarifas.setSize(panel_contenido.getSize());
        panel_contenido.add(tarifas);
        repaint();
        revalidate();
    }//GEN-LAST:event_definirTarifasActionPerformed

    private void infoParqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoParqActionPerformed

        panel_contenido.removeAll();

        String id_parqueadero = datosParqueadero.getAsJsonObject("registros").get("id_parqueadero").getAsString();
        JsonObject datosActuales = getParkin(id_parqueadero);
        InfoParqueadero infoParking = new InfoParqueadero(datosActuales);
        infoParking.setSize(panel_contenido.getSize());
        panel_contenido.add(infoParking);
        repaint();
        revalidate();
    }//GEN-LAST:event_infoParqActionPerformed

    private void listaTiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTiActionPerformed
        String parqueadero = datosParqueadero.getAsJsonObject("registros").get("id_parqueadero").getAsString();
        panel_contenido.removeAll();
        ListaTi panelListar = new ListaTi(parqueadero);
        panelListar.setSize(panel_contenido.getSize());
        panel_contenido.add(panelListar);

        repaint();
        revalidate();
    }//GEN-LAST:event_listaTiActionPerformed

    public void initComponentsAlter() {
        // ICONO DE INFORMACION PARQUEADERO
        estado = datosParqueadero.getAsJsonObject("registros").get("estado").getAsString();
        if(estado.equals("0")){
            btnBuscarVehiculo.setEnabled(false);
            btnCosto.setEnabled(false);
            btnTickets.setEnabled(false);
            addVehiculo.setEnabled(false);
            definirTarifas.setEnabled(false);
            listaTi.setEnabled(false);
        }
        try {
            Image icon_09 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_09.png"));
            java.awt.Image img = new ImageIcon(icon_09).getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            infoParq.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // ICONO DE TARIFAS DEL PARQUEADERO
        try {
            Image icon_10 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_10.png"));
            java.awt.Image img = new ImageIcon(icon_10).getImage().getScaledInstance(24, 24, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            definirTarifas.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // ICONO DE REGISTRAR VEHICULOS
        try {
            Image icon_11 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_11.png"));
            java.awt.Image img = new ImageIcon(icon_11).getImage().getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            addVehiculo.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // ICONO DE EMITIR TICKET
        try {
            Image icon_12 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_12.png"));
            java.awt.Image img = new ImageIcon(icon_12).getImage().getScaledInstance(26, 26, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            btnTickets.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // ICONO DE COSTOS 
        try {
            Image icon_13 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_13.png"));
            java.awt.Image img = new ImageIcon(icon_13).getImage().getScaledInstance(23, 23, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            btnCosto.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            Image icon_03 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_03.png"));
            java.awt.Image img = new ImageIcon(icon_03).getImage().getScaledInstance(20, 25, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            listaTi.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // ICONO DE ESTADO
//        try {
//            java.net.URL url = new java.net.URL("https://e7.pngegg.com/pngimages/20/812/png-clipart-parking-logo-stop-sign-car.png");
//            java.awt.Image img = new ImageIcon(url).getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
//            ImageIcon iconoAjustado = new ImageIcon(img);
//            btnEstado.setIcon(iconoAjustado);
//        } catch (java.net.MalformedURLException ex) {
//            ex.printStackTrace();
//        }
        // ICONO DE BUSCAR
        try {
            Image icon_14 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_14.png"));
            java.awt.Image img = new ImageIcon(icon_14).getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            btnBuscarVehiculo.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public JsonObject getParkin(String id_parqueadero) {
        JsonObject parqueadero = null;

        Map<String, String> data = new HashMap<>();
        data.put("id_parqueadero", id_parqueadero);

        try {

            String temporal = conexion.ConsumoGET("http://localhost/APIparqueadero/parqueaderos/getParking.php", data);

            JsonObject jsonObject = gson.fromJson(temporal, JsonObject.class);
            parqueadero = jsonObject;
        } catch (Exception e) {
            System.out.println("Error en getDatosParqueadero");
        }
        return parqueadero;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addVehiculo;
    public javax.swing.JButton btnBuscarVehiculo;
    public javax.swing.JButton btnCosto;
    public javax.swing.JButton btnTickets;
    public javax.swing.JButton definirTarifas;
    public javax.swing.JButton infoParq;
    public javax.swing.JButton listaTi;
    private javax.swing.JPanel panel_botones;
    // End of variables declaration//GEN-END:variables
}
