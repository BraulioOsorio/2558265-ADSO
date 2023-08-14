/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;
import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.table.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
<<<<<<< HEAD
import java.util.Date;
=======
>>>>>>> 75db80bba7be71dbadb493d540f7a15e2410ba1d





public class PanelTareas extends javax.swing.JFrame {
    
    Conexion conexion;
    DefaultTableModel modelo;
    DefaultTableModel modelo_two;
    DefaultTableModel modelo_tre;
    String nombres;
    String fotos;
    String correos;
    String estados;
    String idUser;
    String Fecha;
<<<<<<< HEAD
=======
    
>>>>>>> 75db80bba7be71dbadb493d540f7a15e2410ba1d
    public PanelTareas(Conexion conexion,String nombre,String foto,String correo,String estado,String id) {
        this.conexion = conexion;
        this.estados = estado;
        this.nombres = nombre;
        
        this.idUser = id;
        this.fotos=foto;
        this.correos=correo;
        initComponents();
        this.Fecha = Fecha;
        initComponentsAlter();
        tareasPendientes();
        tareasRealizadas();
        tareasProceso();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo_task = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaReali = new javax.swing.JTable();
        FotoUser = new javax.swing.JLabel();
        nombreUser = new javax.swing.JLabel();
        emailUser = new javax.swing.JLabel();
        btn_recuperar = new javax.swing.JButton();
        NombreTarea = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPros = new javax.swing.JTable();
        close = new javax.swing.JButton();
        porcentaje = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(new java.awt.Dimension(647, 663));

        campo_task.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));

        btn_add.setBackground(new java.awt.Color(154, 168, 213));
        btn_add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_add.setText("Agregar Tarea");
        btn_add.setFocusable(false);
        btn_add.setMargin(new java.awt.Insets(10, 14, 10, 14));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        tabla.setAutoCreateRowSorter(true);
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));
        tabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TAREAS PENDIENTES", "FECHA FIN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCellSelectionEnabled(true);
        tabla.setEnabled(false);
        tabla.setRequestFocusEnabled(false);
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
        tablaReali.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));
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

        FotoUser.setBackground(new java.awt.Color(102, 204, 255));
        FotoUser.setForeground(new java.awt.Color(255, 255, 255));

        nombreUser.setBackground(new java.awt.Color(0, 0, 0));
        nombreUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombreUser.setText("Nombre");

        emailUser.setBackground(new java.awt.Color(0, 0, 0));
        emailUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailUser.setText("Emaiil");

        btn_recuperar.setBackground(new java.awt.Color(154, 168, 213));
        btn_recuperar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_recuperar.setText("Modificar Datos");
        btn_recuperar.setFocusable(false);
        btn_recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recuperarActionPerformed(evt);
            }
        });

        NombreTarea.setBackground(new java.awt.Color(0, 0, 0));
        NombreTarea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NombreTarea.setText("Nombre de la Tarea :");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Fecha de Finalización :");

        tablaPros.setAutoCreateRowSorter(true);
        tablaPros.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));
        tablaPros.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaPros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TAREAS EN PROCESO", "FECHA FIN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPros.setCellSelectionEnabled(true);
        tablaPros.setRowHeight(40);
        tablaPros.setRowMargin(0);
        tablaPros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaPros);
        tablaPros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        close.setBackground(new java.awt.Color(154, 168, 213));
        close.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        close.setText("Cerrar Sesión");
        close.setFocusable(false);
        close.setMargin(new java.awt.Insets(10, 14, 10, 14));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        porcentaje.setBackground(new java.awt.Color(0, 0, 0));
        porcentaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        porcentaje.setText("tareas realizadas: 100%");

        calendario.setBackground(new java.awt.Color(0, 0, 0));
        calendario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(155, 168, 213), null));
        calendario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calendarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calendarioKeyReleased(evt);
            }
        });

        calendario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calendarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calendarioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailUser)
                    .addComponent(nombreUser)
                    .addComponent(FotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_task, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(NombreTarea)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                            .addComponent(NombreTarea)
                            .addComponent(nombreUser)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(close))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(campo_task, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(261, 261, 261)
                                    .addComponent(btn_add))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(187, 187, 187))
=======
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1))
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(btn_recuperar)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(close)))
                .addContainerGap())
>>>>>>> 75db80bba7be71dbadb493d540f7a15e2410ba1d
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(emailUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(NombreTarea)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_task, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_add))
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                        .addComponent(emailUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NombreTarea)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_task, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_recuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add)
                            .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 75db80bba7be71dbadb493d540f7a15e2410ba1d
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(close)
<<<<<<< HEAD
                .addGap(184, 184, 184))
=======
                .addGap(17, 17, 17))
>>>>>>> 75db80bba7be71dbadb493d540f7a15e2410ba1d
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String tarea = campo_task.getText();

        
        try {
            DateTimeFormatter formatoOriginal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter formatoDeseado = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate fechaLocal = LocalDate.parse(this.Fecha, formatoOriginal);
            String fechaFormateada = fechaLocal.format(formatoDeseado);
            if (!tarea.equalsIgnoreCase("")) {
            boolean response = conexion.addTasks(tarea,fechaFormateada,this.idUser);
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porfavor Coloquele los / para separar la fecha Gracias");
        }
        //calendario.setDate(null); 
            
        
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
        
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaRealiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRealiMouseClicked
        
        
    }//GEN-LAST:event_tablaRealiMouseClicked

    private void tablaProsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaProsMouseClicked

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose();
        Login iniciar = new Login(conexion);
        iniciar.setVisible(true);
        iniciar.setResizable(false);
        iniciar.setLocationRelativeTo(null);
    }//GEN-LAST:event_closeActionPerformed

    private void btn_recuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recuperarActionPerformed
        Modificar modi = new Modificar(conexion,this.nombres,this.fotos,this.correos,this.estados,this.idUser);
        dispose();
        modi.setVisible(true);
        modi.setResizable(false);
        modi.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_recuperarActionPerformed

    private void calendarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calendarioKeyReleased
          
                
    }//GEN-LAST:event_calendarioKeyReleased

    private void calendarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calendarioKeyPressed
         
    }//GEN-LAST:event_calendarioKeyPressed
    
    public final void initComponentsAlter(){
        
        setTitle("Welcome "+this.nombres);
        nombreUser.setText(this.nombres);
        emailUser.setText(this.correos);
        modelo = (DefaultTableModel) tabla.getModel();
        modelo_two = (DefaultTableModel) tablaReali.getModel();
        modelo_tre = (DefaultTableModel) tablaPros.getModel();
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_app.png")) );
<<<<<<< HEAD
        Image img_candado = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/"+this.fotos+".png"));
=======
        Image img_candado = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/"+fotos+".png"));
>>>>>>> 75db80bba7be71dbadb493d540f7a15e2410ba1d
        img_candado = img_candado.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        FotoUser.setIcon(new ImageIcon(img_candado));
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tablaPros.getTableHeader().setResizingAllowed(false);
        tablaPros.getTableHeader().setReorderingAllowed(false);
        
        
        ResultSet response = conexion.avgTaks(this.idUser);
        
        try {
            float promedio = response.getFloat("promedio");
            float redondeado = Math.round(promedio * 10.0f) / 10.0f;
            String etq_prom = String.valueOf(redondeado);
            porcentaje.setText("Tareas realizadas: "+etq_prom+"%");
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        
        
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int row = tabla.rowAtPoint(e.getPoint());
                    int column = tabla.columnAtPoint(e.getPoint());
                    String tarea = (String) tabla.getValueAt(row, column);
                    ResultSet resultado = conexion.consultarestado(tarea);
                    try {
                        if (resultado.next()) {
                            String validarE = resultado.getString("estado");
                            System.out.print(validarE);
                            Estados cambiarEsatado = new Estados(conexion,nombres,fotos,correos,validarE,tarea,idUser);
                            cambiarEsatado.setVisible(true);
                            cambiarEsatado.setResizable(false);
                            cambiarEsatado.setLocationRelativeTo(null);
                            dispose();
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);    
                    }
                }
                
            }
        });
        tablaPros.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int row = tablaPros.rowAtPoint(e.getPoint());
                    int column = tablaPros.columnAtPoint(e.getPoint());
                    String tarea = (String) tablaPros.getValueAt(row, column);
                    ResultSet resultado = conexion.consultarestado(tarea);
                    try {
                        if (resultado.next()) {
                            String validarE = resultado.getString("estado");
                            System.out.print(validarE);
                            Estados cambiarEsatado = new Estados(conexion,nombres,fotos,correos,validarE,tarea,idUser);
                            cambiarEsatado.setVisible(true);
                            cambiarEsatado.setResizable(false);
                            cambiarEsatado.setLocationRelativeTo(null);
                            dispose();
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);    
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
        
        calendario.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    // Obtén la fecha seleccionada
                    java.util.Date seleccionada = calendario.getDate();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaFormateada = formato.format(seleccionada);
                    System.out.println(fechaFormateada);
                    Fecha = fechaFormateada;
                }
            }
        });
        
        
    }
    public void actualizaTarea(boolean estado){
        
    }
    
    public final void tareasPendientes(){
        
        ResultSet listado = conexion.tasksPendientes(this.idUser);
        if (listado != null) {
            try {
                modelo.setRowCount(0);
                do {
                    String fecha = listado.getString("Fecha_fin");
                    String tarea = listado.getString("tarea");
                    Object[] fila = new Object[]{tarea,fecha};
                    modelo.addRow(fila);
                } while (listado.next());
            } catch (Exception e) {
                
            }
            
        }else{
            System.out.println("Lista vacia");
        }
    }
    
    public final void tareasRealizadas(){
        ResultSet listado2 = conexion.tasksRealizadas(this.idUser);
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
                
            }
        }else{
            System.out.println("Lista vacia");
        }
    }
    public final void tareasProceso(){
        ResultSet listado3 = conexion.tasksProceso(this.idUser);
        if (listado3 != null) {
            try {
                modelo_tre.setRowCount(0);
                do {                
                    String fecha = listado3.getString("Fecha_fin");
                    String tarea = listado3.getString("tarea");
                    Object[] fila = new Object[]{tarea,fecha};
                    modelo_tre.addRow(fila);
                } while (listado3.next());
            } catch (Exception e) {
               
            }
        }else{
            System.out.println("Lista vacia");
        }
    }
    private void actualizarTablas() {
        tareasRealizadas();
        tareasPendientes();
        tareasProceso();
        
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FotoUser;
    private javax.swing.JLabel NombreTarea;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_recuperar;
    private com.toedter.calendar.JDateChooser calendario;
    public javax.swing.JTextField campo_task;
    private javax.swing.JButton close;
    private javax.swing.JLabel emailUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nombreUser;
    public javax.swing.JLabel porcentaje;
    public javax.swing.JTable tabla;
    public javax.swing.JTable tablaPros;
    public javax.swing.JTable tablaReali;
    // End of variables declaration//GEN-END:variables

}
