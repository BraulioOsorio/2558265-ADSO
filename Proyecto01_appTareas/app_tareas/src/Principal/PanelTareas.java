/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;
import java.sql.*;
import clases.Conexion;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;


//hola
public class PanelTareas extends javax.swing.JFrame {
    
    Conexion conexion;
    DefaultTableModel modelo;
    DefaultTableModel modelo_two;
    public PanelTareas(Conexion conexion) {
        this.conexion = conexion;
        initComponents();
        initComponentsAlter();
        tareasPendientes();
        tareasRealizadas();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_add = new javax.swing.JLabel();
        campo_task = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaReali = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etq_add.setText("Agregar tarea:");

        btn_add.setBackground(new java.awt.Color(0, 85, 253));
        btn_add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Agregar");
        btn_add.setMargin(new java.awt.Insets(10, 14, 10, 14));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        tabla.setAutoCreateRowSorter(true);
        tabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TAREAS PENDIENTES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCellSelectionEnabled(true);
        tabla.setRowHeight(40);
        tabla.setRowMargin(0);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tablaReali.setAutoCreateRowSorter(true);
        tablaReali.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaReali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "TAREAS REALIZADAS"
            }
        ));
        tablaReali.setEnabled(false);
        tablaReali.setRowHeight(40);
        tablaReali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRealiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaReali);

        jLabel1.setText(" - CLICK EN LA TAREA PARA MARCAR COMO REALIZADA");

        jLabel2.setText("- CLICK DERECHO PARA ELIMINAR UNA TAREA");

        jLabel3.setText("- CLICK CENTRAL PARA MODIFICAR TAREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etq_add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campo_task, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_add)
                                .addGap(240, 240, 240))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etq_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_task, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String tarea = campo_task.getText();
        if (!tarea.equalsIgnoreCase("")) {
           boolean response = conexion.addTasks(tarea);
            if (response) {
                System.out.println("Se agrego exitosamente");
                JOptionPane.showMessageDialog(null, "Tarea agregada");
                campo_task.setText("");
                campo_task.requestFocus();
            }else{
                System.out.println("No se pudo agregar");
            }
            actualizarTablas();
        }else{
            JOptionPane.showMessageDialog(null, "No hay nada en el input");
            campo_task.requestFocus();
        }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
        int selectedRow = tabla.getSelectedRow();
        if (selectedRow >= 0) {
            String tarea = (String) modelo.getValueAt(selectedRow, 0);
            System.out.println("tarea: " + tarea);
            conexion.EstadoReali(tarea);
            actualizarTablas();
            
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaRealiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRealiMouseClicked
        int selectedRow = tablaReali.getSelectedRow();
        if (selectedRow >= 0) {
            String tarea = (String) modelo_two.getValueAt(selectedRow, 0);
            System.out.println("tarea: " + tarea);
            conexion.EstadoPendi(tarea);
            actualizarTablas();
            
        }
        
    }//GEN-LAST:event_tablaRealiMouseClicked
    
    public final void initComponentsAlter(){
        
        modelo = (DefaultTableModel) tabla.getModel();
        modelo_two = (DefaultTableModel) tablaReali.getModel();
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_app.png")) );
        tabla.getTableHeader().setResizingAllowed(true);
        tabla.getTableHeader().setReorderingAllowed(false);
        
        tabla.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int row = tabla.rowAtPoint(e.getPoint());
                    int column = tabla.columnAtPoint(e.getPoint());
                    String tarea = (String) tabla.getValueAt(row, column);
                    
                    System.out.println("tarea: "+tarea);
                    
                    boolean response = conexion.removeTasks(tarea);
                    if(response){
                        JOptionPane.showMessageDialog(null, "Tarea Eliminada con éxito");
                        tareasPendientes();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al eliminar");
                    }
                }
            }
        });
        
        tablaReali.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int row = tablaReali.rowAtPoint(e.getPoint());
                    int column = tablaReali.columnAtPoint(e.getPoint());
                    String tarea = (String) tablaReali.getValueAt(row, column);
                    
                    System.out.println("tarea: "+tarea);
                    
                    boolean response = conexion.removeTasks(tarea);
                    if(response){
                        JOptionPane.showMessageDialog(null, "Tarea Eliminada con éxito");
                        tareasRealizadas();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al eliminar");
                    }
                }
            }
        });
        
        
        
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isMiddleMouseButton(e)) {
                    String newValue = JOptionPane.showInputDialog("Ingrese el nuevo valor:", null);
                    int row = tabla.rowAtPoint(e.getPoint());
                    int column = tabla.columnAtPoint(e.getPoint());
                    String tarea = (String) tabla.getValueAt(row, column);
                    conexion.updateTasks(newValue, tarea);
                    System.out.println("tarea: "+tarea +" modificada a "+newValue);
                    actualizarTablas();
                }
            }
        });
        
        tablaReali.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isMiddleMouseButton(e)) {
                    String newValue = JOptionPane.showInputDialog("Ingrese el nuevo valor:", null);
                    int row = tablaReali.rowAtPoint(e.getPoint());
                    int column = tablaReali.columnAtPoint(e.getPoint());
                    String tarea = (String) tablaReali.getValueAt(row, column);
                    conexion.updateTasks(newValue, tarea);
                    System.out.println("tarea: "+tarea +" modificada a "+newValue);
                    
                    actualizarTablas();
                }
            }
        });
        
        
    }
    
    public final void tareasPendientes(){
        ResultSet listado = conexion.tasksPendientes();
        if (listado != null) {
            try {
                modelo.setRowCount(0);
                do {                
                    int id = listado.getInt("id_tarea");
                    String tarea = listado.getString("tarea");
                    
                    
                    Object[] fila = new Object[]{tarea};
                    modelo.addRow(fila);
                    
                    
                } while (listado.next());
            } catch (Exception e) {
                System.out.println("Error al extraer un dato: "+e.getMessage());
            }
            
        }else{
            System.out.println("Lista vacia");
        }
    }
    
    public final void tareasRealizadas(){
        ResultSet listado2 = conexion.tasksRealizadas();
        if (listado2 != null) {
            try {
                modelo_two.setRowCount(0);
                do {                
                    int id = listado2.getInt("id_tarea");
                    String tarea = listado2.getString("tarea");
                    
                    
                    Object[] fila = new Object[]{tarea};
                    modelo_two.addRow(fila);
                    
                    
                } while (listado2.next());
            } catch (Exception e) {
                System.out.println("Error al extraer un dato: "+e.getMessage());
            }
            
        }else{
            System.out.println("Lista vacia");
        }
    }
    private void actualizarTablas() {
        tareasRealizadas();
        tareasPendientes();
        
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    public javax.swing.JTextField campo_task;
    private javax.swing.JLabel etq_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tabla;
    public javax.swing.JTable tablaReali;
    // End of variables declaration//GEN-END:variables

}
