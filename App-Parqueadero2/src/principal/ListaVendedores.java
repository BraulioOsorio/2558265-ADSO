/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author INSTRUCTOR
 */
public class ListaVendedores extends javax.swing.JPanel {

    JsonObject datosVendedor;
    DefaultTableModel modelo;
    Gson gson = new Gson();
    ConsumoAPI conexion = new ConsumoAPI();

    public ListaVendedores(JsonObject datosVendedor) {
        this.datosVendedor = datosVendedor;

        initComponents();
        modelo = (DefaultTableModel) vendedores.getModel();

        initComponentsAlter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendedores = new javax.swing.JTable();
        opcionVendedores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("VENDEDORES");
        etq_titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(49, 138, 222)));

        vendedores.setAutoCreateRowSorter(true);
        vendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Documento", "Nombre", "Correo", "Rol", "Estado", "Parqueadero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendedores.setEnabled(false);
        vendedores.setGridColor(new java.awt.Color(49, 138, 222));
        vendedores.setRequestFocusEnabled(false);
        vendedores.setRowHeight(32);
        vendedores.setUpdateSelectionOnSort(false);
        vendedores.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(vendedores);
        if (vendedores.getColumnModel().getColumnCount() > 0) {
            vendedores.getColumnModel().getColumn(0).setResizable(false);
            vendedores.getColumnModel().getColumn(0).setPreferredWidth(65);
            vendedores.getColumnModel().getColumn(1).setResizable(false);
            vendedores.getColumnModel().getColumn(1).setPreferredWidth(100);
            vendedores.getColumnModel().getColumn(2).setResizable(false);
            vendedores.getColumnModel().getColumn(2).setPreferredWidth(120);
            vendedores.getColumnModel().getColumn(3).setResizable(false);
            vendedores.getColumnModel().getColumn(3).setPreferredWidth(65);
            vendedores.getColumnModel().getColumn(4).setResizable(false);
            vendedores.getColumnModel().getColumn(4).setPreferredWidth(65);
            vendedores.getColumnModel().getColumn(5).setResizable(false);
            vendedores.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        opcionVendedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Sin asignar" }));
        opcionVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionVendedoresActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione una opción :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_titulo)
                .addGap(225, 225, 225))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcionVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcionVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void opcionVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionVendedoresActionPerformed
        
        String opcionSelect = opcionVendedores.getSelectedItem().toString();

        if (opcionSelect.equals("General")) {
            initComponentsAlter();
        }
        if (opcionSelect.equals("Sin asignar")) {
            consumoVendedores();
        }
    }//GEN-LAST:event_opcionVendedoresActionPerformed

    public void initComponentsAlter() {

        modelo.setNumRows(0);
        try {
            if (datosVendedor != null) {
                JsonObject jsonObject = gson.fromJson(datosVendedor, JsonObject.class);
                JsonArray registros = jsonObject.getAsJsonArray("registros");

                for (JsonElement registro : registros) {
                    JsonObject registrosOb = registro.getAsJsonObject();

                    String documento = registrosOb.get("documento").getAsString();
                    String nombre = registrosOb.get("nombre").getAsString();
                    String correo = registrosOb.get("correo").getAsString();
                    String rol = registrosOb.get("rol").getAsString();
                    String estado = registrosOb.get("estado").getAsString();
                    String parque = registrosOb.get("nombre_parqueadero").getAsString();
                    
                    if (estado.equals("1")) {
                        estado = "Activo";
                    } else {
                        estado = "Inactivo";
                    }

                    Object[] fila = new Object[]{documento, nombre, correo, rol, estado,parque};
                    modelo.addRow(fila);

                    centrarTextTabla();
                }
            } else {
                System.out.println("La variable datosParquedero es nula.");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opcionVendedores;
    private javax.swing.JTable vendedores;
    // End of variables declaration//GEN-END:variables

    private void consumoVendedores() {
        String respuesta = conexion.consumoGET("http://localhost/APIparqueadero/usuarios/getVendNull.php");

        if (respuesta != null) {
            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(respuesta).getAsJsonObject();

            // Asume que la respuesta contiene un arreglo llamado "registros"
            JsonArray registros = jsonObject.getAsJsonArray("registros");

            // Itera a través de los registros y muestra sus datos en la consola
            modelo = (DefaultTableModel) vendedores.getModel();
            modelo.setNumRows(0);
            for (int i = 0; i < registros.size(); i++) {
                JsonObject registro = registros.get(i).getAsJsonObject();
                String cedula = registro.get("documento").getAsString();
                String nombre = registro.get("nombre").getAsString();
                String correo = registro.get("correo").getAsString();
                String rol = registro.get("rol").getAsString();
                String estado = registro.get("estado").getAsString();


                if (rol.equalsIgnoreCase("vendedor")) {
                    if (estado.equals("1")) {
                        estado = "Activo";
                    } else {
                        estado = "Inactivo";
                    }
                    Object[] temporal = new Object[]{cedula, nombre, correo, rol, estado,"Sin Definir"};
                    modelo.addRow(temporal);

                    centrarTextTabla();

                }
            }
        } else {
            System.out.println("No se pudo obtener respuesta en el consumoGET de obtener personas");
        }
    }

    private void centrarTextTabla() {
        JTableHeader header = vendedores.getTableHeader();
        header.setBackground(new Color(49, 138, 222));
        header.setForeground(Color.WHITE);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < vendedores.getColumnCount(); i++) {
            vendedores.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        vendedores.repaint();
    }
}
