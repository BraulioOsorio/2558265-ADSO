package principal;

import Clases.DataBase;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    
    DataBase basedatos;
    public Menu(DataBase basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initComponentAltern();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentButtons = new javax.swing.JPanel();
        btn_listar = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        etq_icono = new javax.swing.JLabel();
        etq_rol = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentButtons.setBackground(new java.awt.Color(255, 255, 255));

        btn_listar.setBackground(new java.awt.Color(0, 51, 255));
        btn_listar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_listar.setForeground(new java.awt.Color(255, 255, 255));
        btn_listar.setText("LISTAR");
        btn_listar.setFocusable(false);
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

        btn_crear.setBackground(new java.awt.Color(0, 51, 255));
        btn_crear.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("CREAR");
        btn_crear.setFocusPainted(false);
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(0, 51, 255));
        btn_editar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("EDITAR");
        btn_editar.setFocusPainted(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(0, 51, 255));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setFocusPainted(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(153, 0, 0));
        btn_salir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("SALIR");
        btn_salir.setFocusPainted(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        etq_icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_rol.setBackground(new java.awt.Color(0, 0, 0));
        etq_rol.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etq_rol.setForeground(new java.awt.Color(0, 0, 0));
        etq_rol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_rol.setText("ADMIN");

        javax.swing.GroupLayout contentButtonsLayout = new javax.swing.GroupLayout(contentButtons);
        contentButtons.setLayout(contentButtonsLayout);
        contentButtonsLayout.setHorizontalGroup(
            contentButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_listar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_crear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addGroup(contentButtonsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contentButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_icono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etq_rol, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGap(27, 27, 27)))
                .addContainerGap())
        );
        contentButtonsLayout.setVerticalGroup(
            contentButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(etq_rol)
                .addGap(18, 18, 18)
                .addComponent(btn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        Login ventana = new Login();
        dispose(); 
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        contentPrincipal.removeAll();
        PanelListar contenTemporal = new PanelListar(basedatos);
        contenTemporal.setSize(contentPrincipal.getSize());
        contentPrincipal.add(contenTemporal);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_listarActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        contentPrincipal.removeAll();
        PanelCrear contenTemporal = new PanelCrear(basedatos);
        contenTemporal.setSize(contentPrincipal.getSize());
        contentPrincipal.add(contenTemporal);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_crearActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        contentPrincipal.removeAll();
        PanelModificar contenTemporal = new PanelModificar(basedatos);
        contenTemporal.setSize(contentPrincipal.getSize());
        contentPrincipal.add(contenTemporal);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        contentPrincipal.removeAll();
        PanelEliminar contenTemporal = new PanelEliminar(basedatos);
        contenTemporal.setSize(contentPrincipal.getSize());
        contentPrincipal.add(contenTemporal);
        repaint();
        revalidate();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    public void initComponentAltern(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("MENU");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")) );
        
        Image img_candado = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png"));
        img_candado = img_candado.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        etq_icono.setIcon(new ImageIcon(img_candado));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel contentButtons;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etq_icono;
    private javax.swing.JLabel etq_rol;
    // End of variables declaration//GEN-END:variables
}
