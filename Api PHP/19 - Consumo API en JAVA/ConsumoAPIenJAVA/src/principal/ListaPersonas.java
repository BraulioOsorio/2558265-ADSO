/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;
import javax.swing.table.DefaultTableModel;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 *
 * @author INSTRUCTOR
 */
public class ListaPersonas extends javax.swing.JFrame {

    /**
     * Creates new form ListaPersonas
     */
    
    DefaultTableModel modelo;
    Gson gson;
    ConsumoAPI ejemplo;
    public ListaPersonas(ConsumoAPI ejemplo, Gson gson) {
        this.ejemplo = ejemplo;
        this.gson = gson;
        initComponents(); // Llama a initComponents() primero para inicializar los componentes
        modelo = (DefaultTableModel) PersonasListado.getModel();
        listado(); // Luego llama a listado()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PersonasListado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PersonasListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "TELEFONO", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PersonasListado);
        if (PersonasListado.getColumnModel().getColumnCount() > 0) {
            PersonasListado.getColumnModel().getColumn(0).setResizable(false);
            PersonasListado.getColumnModel().getColumn(0).setPreferredWidth(5);
            PersonasListado.getColumnModel().getColumn(1).setResizable(false);
            PersonasListado.getColumnModel().getColumn(2).setResizable(false);
            PersonasListado.getColumnModel().getColumn(3).setResizable(false);
            PersonasListado.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Menu menu = new Menu(ejemplo,gson);
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public final void listado(){
        modelo.setNumRows(0);
        String datos = ejemplo.consumoGET("http://localhost/02APIenPHP/Obtener.php");
        if (datos != null) {
            try {
                
                JsonObject jsonObject = gson.fromJson(datos, JsonObject.class);
                JsonArray registros = jsonObject.getAsJsonArray("registros");

                for(JsonElement registro : registros){
                    JsonObject registrosOb = registro.getAsJsonObject();
                    int cedula = registrosOb.get("documento").getAsInt();
                    String nombres = registrosOb.get("nombres").getAsString();
                    String apellidos = registrosOb.get("apellidos").getAsString();
                    String telefono = registrosOb.get("telefono").getAsString();
                    //String direccion = registrosOb.get("direccion").getAsString();
                    String email = registrosOb.get("email").getAsString();

                    Object[] fila = new Object[]{cedula,nombres,apellidos,telefono,email};
                    modelo.addRow(fila);
                }
            } catch (Exception e) {
            }
            
        }else{
            System.out.println("Lista vacia");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable PersonasListado;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}