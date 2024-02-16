package principal;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MenuAdmin extends javax.swing.JPanel {
    ConsumoAPI conexion = new ConsumoAPI();
    Gson gson = new Gson();
    JPanel panel_contenido;
    JsonObject datosParquedero;
    JsonObject datosVendedor;
    public MenuAdmin(JPanel panel_contenido) {
        this.datosVendedor = datosVendedor;
        this.panel_contenido = panel_contenido;
        initComponents();
        initComponentsAlter();
        this.datosParquedero = datosParquedero;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editarParqueadero1 = new javax.swing.JButton();
        crearParqueadero1 = new javax.swing.JButton();
        crearVend1 = new javax.swing.JButton();
        editarVend1 = new javax.swing.JButton();
        asigParqueadero = new javax.swing.JButton();
        listaParqueadero1 = new javax.swing.JButton();
        vendSinParq1 = new javax.swing.JButton();
        listaVend1 = new javax.swing.JButton();
        panel_botones = new javax.swing.JPanel();
        asigParqueadero1 = new javax.swing.JButton();
        listaVend = new javax.swing.JButton();
        editarVend = new javax.swing.JButton();
        crearVend = new javax.swing.JButton();
        listaParqueadero = new javax.swing.JButton();
        editarParqueadero = new javax.swing.JButton();
        crearParqueadero = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(15, 92, 162));

        editarParqueadero1.setBackground(new java.awt.Color(49, 138, 222));
        editarParqueadero1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarParqueadero1.setForeground(new java.awt.Color(255, 255, 255));
        editarParqueadero1.setText("Editar Parqueaderos");
        editarParqueadero1.setBorder(null);

        crearParqueadero1.setBackground(new java.awt.Color(49, 138, 222));
        crearParqueadero1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        crearParqueadero1.setForeground(new java.awt.Color(255, 255, 255));
        crearParqueadero1.setText("Crear Parqueaderos");
        crearParqueadero1.setBorder(null);

        crearVend1.setBackground(new java.awt.Color(49, 138, 222));
        crearVend1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        crearVend1.setForeground(new java.awt.Color(255, 255, 255));
        crearVend1.setText("Crear Vendedores");
        crearVend1.setBorder(null);

        editarVend1.setBackground(new java.awt.Color(49, 138, 222));
        editarVend1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarVend1.setForeground(new java.awt.Color(255, 255, 255));
        editarVend1.setText("Editar Vendedores");
        editarVend1.setBorder(null);

        asigParqueadero.setBackground(new java.awt.Color(49, 138, 222));
        asigParqueadero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        asigParqueadero.setForeground(new java.awt.Color(255, 255, 255));
        asigParqueadero.setText("Asignar parqueaderos");
        asigParqueadero.setBorder(null);

        listaParqueadero1.setBackground(new java.awt.Color(49, 138, 222));
        listaParqueadero1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listaParqueadero1.setForeground(new java.awt.Color(255, 255, 255));
        listaParqueadero1.setText("Lista Parqueaderos");
        listaParqueadero1.setBorder(null);

        vendSinParq1.setBackground(new java.awt.Color(49, 138, 222));
        vendSinParq1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vendSinParq1.setForeground(new java.awt.Color(255, 255, 255));
        vendSinParq1.setText("Vendedores sin parqueadero");
        vendSinParq1.setBorder(null);

        listaVend1.setBackground(new java.awt.Color(49, 138, 222));
        listaVend1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listaVend1.setForeground(new java.awt.Color(255, 255, 255));
        listaVend1.setText("Lista Vendedores");
        listaVend1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(crearParqueadero1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(listaVend1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarVend1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crearVend1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(listaParqueadero1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarParqueadero1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(asigParqueadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vendSinParq1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(crearParqueadero1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarParqueadero1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaParqueadero1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crearVend1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarVend1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaVend1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vendSinParq1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(asigParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(15, 92, 162));

        panel_botones.setBackground(new java.awt.Color(15, 92, 162));

        asigParqueadero1.setBackground(new java.awt.Color(49, 138, 222));
        asigParqueadero1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        asigParqueadero1.setForeground(new java.awt.Color(255, 255, 255));
        asigParqueadero1.setText("Asignar parqueaderos");
        asigParqueadero1.setBorder(null);
        asigParqueadero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asigParqueadero1.setFocusable(false);
        asigParqueadero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asigParqueadero1ActionPerformed(evt);
            }
        });

        listaVend.setBackground(new java.awt.Color(49, 138, 222));
        listaVend.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listaVend.setForeground(new java.awt.Color(255, 255, 255));
        listaVend.setText("Lista Vendedores");
        listaVend.setBorder(null);
        listaVend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaVend.setFocusable(false);
        listaVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaVendActionPerformed(evt);
            }
        });

        editarVend.setBackground(new java.awt.Color(49, 138, 222));
        editarVend.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarVend.setForeground(new java.awt.Color(255, 255, 255));
        editarVend.setText("Editar Vendedores");
        editarVend.setBorder(null);
        editarVend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarVend.setFocusable(false);
        editarVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarVendActionPerformed(evt);
            }
        });

        crearVend.setBackground(new java.awt.Color(49, 138, 222));
        crearVend.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        crearVend.setForeground(new java.awt.Color(255, 255, 255));
        crearVend.setText("Crear Vendedores");
        crearVend.setBorder(null);
        crearVend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearVend.setFocusable(false);
        crearVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVendActionPerformed(evt);
            }
        });

        listaParqueadero.setBackground(new java.awt.Color(49, 138, 222));
        listaParqueadero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listaParqueadero.setForeground(new java.awt.Color(255, 255, 255));
        listaParqueadero.setText("Lista Parqueaderos");
        listaParqueadero.setBorder(null);
        listaParqueadero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaParqueadero.setFocusable(false);
        listaParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaParqueaderoActionPerformed(evt);
            }
        });

        editarParqueadero.setBackground(new java.awt.Color(49, 138, 222));
        editarParqueadero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarParqueadero.setForeground(new java.awt.Color(255, 255, 255));
        editarParqueadero.setText("Editar Parqueaderos");
        editarParqueadero.setBorder(null);
        editarParqueadero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarParqueadero.setFocusable(false);
        editarParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarParqueaderoActionPerformed(evt);
            }
        });

        crearParqueadero.setBackground(new java.awt.Color(49, 138, 222));
        crearParqueadero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        crearParqueadero.setForeground(new java.awt.Color(255, 255, 255));
        crearParqueadero.setText("Crear Parqueaderos");
        crearParqueadero.setBorder(null);
        crearParqueadero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearParqueadero.setFocusable(false);
        crearParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearParqueaderoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asigParqueadero1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaVend, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarVend, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearVend, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botonesLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(crearParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crearVend, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarVend, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaVend, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(asigParqueadero1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void asigParqueadero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asigParqueadero1ActionPerformed
        panel_contenido.removeAll();
        datosParquedero = getDatosParqueaderoAdmin();
        AsignarParqueadero panelAsignar = new AsignarParqueadero(datosParquedero, panel_contenido);
        panelAsignar.setSize(panel_contenido.getSize());
        panel_contenido.add(panelAsignar);

        repaint();
        revalidate();
    }//GEN-LAST:event_asigParqueadero1ActionPerformed

    private void listaParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaParqueaderoActionPerformed

        panel_contenido.removeAll();
        ListaParqueaderos panelListarParq = new ListaParqueaderos();
        panelListarParq.setSize(panel_contenido.getSize());
        panel_contenido.add(panelListarParq);

        repaint();
        revalidate();
    }//GEN-LAST:event_listaParqueaderoActionPerformed

    private void crearParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearParqueaderoActionPerformed

        panel_contenido.removeAll();
        CrearParqueadero crearParqueadero = new CrearParqueadero();
        crearParqueadero.setSize(panel_contenido.getSize());
        panel_contenido.add(crearParqueadero);

        repaint();
        revalidate();
    }//GEN-LAST:event_crearParqueaderoActionPerformed

    private void editarParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarParqueaderoActionPerformed
        panel_contenido.removeAll();
        EditarParqueadero panelEditarParq = new EditarParqueadero();
        panelEditarParq.setSize(panel_contenido.getSize());
        panel_contenido.add(panelEditarParq);

        repaint();
        revalidate();
    }//GEN-LAST:event_editarParqueaderoActionPerformed

    private void crearVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVendActionPerformed

        panel_contenido.removeAll();
        CrearVendedores panelCrearVendedores = new CrearVendedores();
        panelCrearVendedores.setSize(panel_contenido.getSize());
        panel_contenido.add(panelCrearVendedores);

        repaint();
        revalidate();
    }//GEN-LAST:event_crearVendActionPerformed

    private void editarVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarVendActionPerformed
        panel_contenido.removeAll();
        EditarVendedor panelEditarVendedores = new EditarVendedor();
        panelEditarVendedores.setSize(panel_contenido.getSize());
        panel_contenido.add(panelEditarVendedores);

        repaint();
        revalidate();
    }//GEN-LAST:event_editarVendActionPerformed

    private void listaVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaVendActionPerformed
        panel_contenido.removeAll();
        datosVendedor = getDatosVendedoresAdmin();
        ListaVendedores panelListaVendedores = new ListaVendedores(datosVendedor);
        panelListaVendedores.setSize(panel_contenido.getSize());
        panel_contenido.add(panelListaVendedores);

        repaint();
        revalidate();
    }//GEN-LAST:event_listaVendActionPerformed

    public JsonObject getDatosVendedoresAdmin() {
        JsonObject vendedor = null;
        
        try {
            String temporal = conexion.consumoGET("http://localhost/APIparqueadero/usuarios/getVendedoresAll.php");
            JsonObject jsonObject = gson.fromJson(temporal, JsonObject.class);
            vendedor = jsonObject;            
        } catch (Exception e) {
            System.out.println("Error en getDatosVendedores");
        }
        return vendedor;
    }
    
    public JsonObject getDatosParqueaderoAdmin() {
        JsonObject parqueadero = null;
        
        try {
            String temporal = conexion.consumoGET("http://localhost/APIparqueadero/parqueaderos/getParqueaderos.php");
            
            JsonObject jsonObject = gson.fromJson(temporal, JsonObject.class);
            parqueadero = jsonObject;            

        } catch (Exception e) {
            System.out.println("Error en getDatosParqueadero");
        }
        return parqueadero;
    }
    
    public void initComponentsAlter(){
        // ICONO DE CREAR PARQUEADERO
        try {
            Image icon_01 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_01.png"));
            java.awt.Image img = new ImageIcon(icon_01).getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            crearParqueadero.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // ICONO DE EDITAR PARQUEADERO QUEADERO QUEA DERO
        try {
            Image icon_02 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_02.png"));
            java.awt.Image img = new ImageIcon(icon_02).getImage().getScaledInstance(22, 25, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            editarParqueadero.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //ICONO DE LISTAR PARQUEADERO
        try {
            Image icon_03 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_03.png"));
            java.awt.Image img = new ImageIcon(icon_03).getImage().getScaledInstance(20, 25, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            listaParqueadero.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // ICONO DE CREAR VENDEDOR
        try {
            Image icon_04 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_04.png"));
            java.awt.Image img = new ImageIcon(icon_04).getImage().getScaledInstance(23, 23, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            crearVend.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        // ICONO DE EDITAR VENDEDOR
        try {
            Image icon_05 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_05.png"));
            java.awt.Image img = new ImageIcon(icon_05).getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            editarVend.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // ICONO LISTAR VENDEDORES
        try {
            Image icon_06 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_06.png"));
            java.awt.Image img = new ImageIcon(icon_06).getImage().getScaledInstance(20, 23, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            listaVend.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        // ICONO PARQUEADEROS ASIGNADOS
        try {
            Image icon_08 = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_08.png"));
            java.awt.Image img = new ImageIcon(icon_08).getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(img);
            asigParqueadero1.setIcon(iconoAjustado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton asigParqueadero;
    public javax.swing.JButton asigParqueadero1;
    public javax.swing.JButton crearParqueadero;
    public javax.swing.JButton crearParqueadero1;
    public javax.swing.JButton crearVend;
    public javax.swing.JButton crearVend1;
    public javax.swing.JButton editarParqueadero;
    public javax.swing.JButton editarParqueadero1;
    public javax.swing.JButton editarVend;
    public javax.swing.JButton editarVend1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton listaParqueadero;
    public javax.swing.JButton listaParqueadero1;
    public javax.swing.JButton listaVend;
    public javax.swing.JButton listaVend1;
    private javax.swing.JPanel panel_botones;
    public javax.swing.JButton vendSinParq1;
    // End of variables declaration//GEN-END:variables
}
