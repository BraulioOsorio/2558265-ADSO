package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import clases.ButtonEditor;
import clases.ButtonRenderer;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AsignarParqueadero extends javax.swing.JPanel {

    JsonObject datosParqueadero;
    DefaultTableModel tableModel;
    JPanel panel_contenido;
    ConsumoAPI conexion = new ConsumoAPI();

    public AsignarParqueadero(JsonObject datosParquedero, JPanel panel_contenido) {
        this.datosParqueadero = datosParquedero;
        this.panel_contenido = panel_contenido;
        initComponents();
        consumoParqueaderos();
        initComponentsAltern();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_content = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_parqueaderos = new javax.swing.JTable();
        etq_texto_descripcion = new javax.swing.JLabel();

        panel_content.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("ASIGNAR PARQUEADERO");
        etq_titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(49, 138, 222)));

        tabla_parqueaderos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Dirección", "Cantidad vendedores", "Asignar vendedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_parqueaderos.setFocusable(false);
        tabla_parqueaderos.setRowHeight(38);
        jScrollPane1.setViewportView(tabla_parqueaderos);
        if (tabla_parqueaderos.getColumnModel().getColumnCount() > 0) {
            tabla_parqueaderos.getColumnModel().getColumn(0).setResizable(false);
            tabla_parqueaderos.getColumnModel().getColumn(1).setResizable(false);
            tabla_parqueaderos.getColumnModel().getColumn(2).setResizable(false);
            tabla_parqueaderos.getColumnModel().getColumn(3).setResizable(false);
            tabla_parqueaderos.getColumnModel().getColumn(3).setPreferredWidth(1);
        }

        etq_texto_descripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_texto_descripcion.setText("En esta sección encontrará la lista de parqueaderos registrados junto a la opcion de asignar vendedores.");

        javax.swing.GroupLayout panel_contentLayout = new javax.swing.GroupLayout(panel_content);
        panel_content.setLayout(panel_contentLayout);
        panel_contentLayout.setHorizontalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                        .addComponent(etq_titulo)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contentLayout.createSequentialGroup()
                        .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etq_texto_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        panel_contentLayout.setVerticalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(etq_texto_descripcion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_texto_descripcion;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_content;
    private javax.swing.JTable tabla_parqueaderos;
    // End of variables declaration//GEN-END:variables

    private void initComponentsAltern() {
        JTableHeader header = tabla_parqueaderos.getTableHeader();
        header.setBackground(new Color(49, 138, 222));
        header.setForeground(Color.WHITE);
        tabla_parqueaderos.getColumn("Asignar vendedor").setCellRenderer(new ButtonRenderer());
        tabla_parqueaderos.getColumn("Asignar vendedor").setCellEditor(new ButtonEditor(new JCheckBox()));
    }

    private void consumoParqueaderos() {
        // Asume que la respuesta contiene un arreglo llamado "registros"
        JsonArray registros = datosParqueadero.getAsJsonArray("registros");

        // Itera a través de los registros y muestra sus datos en la consola
        tableModel = (DefaultTableModel) tabla_parqueaderos.getModel();
        tableModel.setNumRows(0);
        for (int i = 0; i < registros.size(); i++) {
            JsonObject registro = registros.get(i).getAsJsonObject();
            String id_parqueadero = registro.get("id_parqueadero").getAsString();
            String nombreParqueadero = registro.get("nombre").getAsString();
            String direccionParqueadero = registro.get("direccion").getAsString();

            Map<String, String> insertData = new HashMap<>();
            insertData.put("id_parqueadero", id_parqueadero);
            System.out.println("antes de aca");
            String respuestaCantVend = conexion.consumoPOST("http://localhost/APIparqueadero/parqueaderos/selectCantVend.php", insertData);
            System.out.println("Llego: "+respuestaCantVend);
            
            if (respuestaCantVend != null) {
                JsonParser parser = new JsonParser();
                JsonObject registroCount = parser.parse(respuestaCantVend).getAsJsonObject();
                int cantVendedores = registroCount.get("cantVendedores").getAsInt();
                System.out.println("Llegooooo: "+cantVendedores);

                JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 5));
                panel.setBackground(Color.white);
                JButton btnAsignar = new JButton("Asignar");
                btnAsignar.setBackground(Color.decode("#e8c41c"));
                btnAsignar.setForeground(Color.white);
                btnAsignar.setFocusable(false);
                btnAsignar.setFont(new Font("SansSerif", Font.BOLD, 12));
                btnAsignar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                btnAsignar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Se dió click en la parqueadero con nombre: " + nombreParqueadero + " y el id: " + id_parqueadero);
                        panel_contenido.removeAll();
                        PanelAsignar asignarVendedor = new PanelAsignar(panel_contenido, nombreParqueadero, id_parqueadero);
                        asignarVendedor.setSize(panel_contenido.getSize());
                        panel_contenido.add(asignarVendedor);

                        asignarVendedor.repaint();
                        asignarVendedor.revalidate();
                    }
                });

                panel.add(btnAsignar);

                Object[] temporal = new Object[]{nombreParqueadero, direccionParqueadero, cantVendedores, panel};
                tableModel.addRow(temporal);

                centrarTextTabla();

                System.out.println("------------------------------");
                System.out.println("Nombre: " + nombreParqueadero);
                System.out.println("Direccion: " + direccionParqueadero);
                System.out.println("******* Cantidad de vendedores: *******" + cantVendedores);
            } else {
                System.out.println("Hubieron ´problemillas");
            }

        }
    }

    private void centrarTextTabla() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabla_parqueaderos.getColumnCount(); i++) {
            tabla_parqueaderos.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        tabla_parqueaderos.repaint();
    }

}
