/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;
import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.table.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;

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
    String horas;
    public PanelTareas(Conexion conexion,String nombre,String foto,String correo,String estado,String id) {
        this.conexion = conexion;
        this.estados = estado;
        this.nombres = nombre;
        this.conexion.time();
        this.idUser = id;
        this.fotos=foto;
        this.correos=correo;
        this.horas = horas;
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
        hora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

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
                "ID", "TAREAS PENDIENTES", "FECHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCellSelectionEnabled(true);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setEnabled(false);
        tabla.setRequestFocusEnabled(false);
        tabla.setRowHeight(40);
        tabla.setRowMargin(0);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(550);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        tablaReali.setAutoCreateRowSorter(true);
        tablaReali.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));
        tablaReali.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaReali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "TAREAS REALIZADAS", "ESTADOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaReali.setCellSelectionEnabled(true);
        tablaReali.setEnabled(false);
        tablaReali.setMinimumSize(new java.awt.Dimension(45, 80));
        tablaReali.setRequestFocusEnabled(false);
        tablaReali.setRowHeight(40);
        tablaReali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
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
                "ID", "TAREAS EN PROCESO", "FECHA FIN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPros.setCellSelectionEnabled(true);
        tablaPros.setEnabled(false);
        tablaPros.setRequestFocusEnabled(false);
        tablaPros.setRowHeight(40);
        tablaPros.setRowMargin(0);
        tablaPros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
            }
        });
        jScrollPane3.setViewportView(tablaPros);
        tablaPros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaPros.getColumnModel().getColumnCount() > 0) {
            tablaPros.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaPros.getColumnModel().getColumn(1).setPreferredWidth(550);
            tablaPros.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

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
                
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                
            }
        });

        hora.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Hora Fin :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreUser, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(emailUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_task, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(NombreTarea)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(close)
                        .addGap(171, 171, 171)
                        .addComponent(btn_recuperar)))
                .addGap(0, 172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(NombreTarea)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campo_task, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add))
                        .addGap(18, 18, 18)
                        .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FotoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailUser)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(btn_recuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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
            this.horas = hora.getText();
            if (!tarea.equalsIgnoreCase("")) {
                if(horas.length() > 0 && horas.length() <= 2){
                    boolean response = conexion.addTasks(tarea,fechaFormateada,this.idUser,this.horas);
                    if (response) {
                        System.out.println("Se agrego exitosamente");
                        JOptionPane.showMessageDialog(null, "Tarea agregada");
                        campo_task.setText("");
                        hora.setText("");
                        campo_task.requestFocus();
                        avg();
                        conexion.time();
                    }else{
                        System.out.println("No se pudo agregar");
                    }
                    actualizarTablas();
                }else{
                    JOptionPane.showMessageDialog(null, "Solo ingrese la hora en formato 24h");
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "No hay nada en el input");
                campo_task.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique la fecha");
        }
        //calendario.setDate(null); 
    }//GEN-LAST:event_btn_addActionPerformed

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
    
    public final void initComponentsAlter(){
        setTitle("Welcome "+this.nombres);
        nombreUser.setText(this.nombres);
        emailUser.setText(this.correos);
        modelo = (DefaultTableModel) tabla.getModel();
        modelo_two = (DefaultTableModel) tablaReali.getModel();
        modelo_tre = (DefaultTableModel) tablaPros.getModel();
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_app.png")) );
        System.out.println("Url imagen: "+"src/imagenes/"+fotos+".png"  );
        Image img_candado = getToolkit().createImage("src/imagenes/"+fotos+".png");
        img_candado = img_candado.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        FotoUser.setIcon(new ImageIcon(img_candado));
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tablaPros.getTableHeader().setResizingAllowed(false);
        tablaPros.getTableHeader().setReorderingAllowed(false);
        avg();
       
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int row = tabla.rowAtPoint(e.getPoint());
                    int column = tabla.columnAtPoint(e.getPoint());
                    int tarea = (int) tabla.getValueAt(row, 0);
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
                    int tarea = (int) tablaPros.getValueAt(row, 0);
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
    
    public final void tareasPendientes(){
        ResultSet listado = conexion.tasksPendientes(this.idUser);
        if (listado != null) {
            try {
                modelo.setRowCount(0);
                do {
                    int id = listado.getInt("id_tarea");
                    String fecha = listado.getString("Fecha_fin");
                    String tarea = listado.getString("tarea");
                    Object[] fila = new Object[]{id,tarea,fecha};
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
                    String est = listado2.getString("estado");
                    Object[] fila = new Object[]{tarea,est};
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
                    int id = listado3.getInt("id_tarea");
                    String fecha = listado3.getString("Fecha_fin");
                    String tarea = listado3.getString("tarea");
                    Object[] fila = new Object[]{id,tarea,fecha};
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
    public void avg(){
        ResultSet response = conexion.avgTaks(this.idUser);
        try {
            float promedio = response.getFloat("promedio");
            float redondeado = Math.round(promedio * 10.0f) / 10.0f;
            String etq_prom = String.valueOf(redondeado);
            porcentaje.setText("Tareas realizadas: "+etq_prom+"%");
        } catch (SQLException ex) {
            System.out.println("Error");
        }
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
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
