/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;
import hasdcode.Index;
import clases.Conexion;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;



public class CrearUser extends javax.swing.JFrame {
    String secretKey;
    Conexion conexion;
    Index hasdcode;
    ImageIcon imagenTemporal;
    public CrearUser(Conexion conexion) {
        initComponents();
        this.conexion = conexion;
        this.hasdcode = new Index();
        this.imagenTemporal = new ImageIcon(getToolkit().createImage("src/imagenes/default.png"));
        this.secretKey = "mySecretKey12345";
        fotos();
    }
    
    public void fotos(){
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_app.png")) ); 
        
        Image imagen = imagenTemporal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        imagenTemporal = new ImageIcon(imagen);
        imagenLabel.setIcon(imagenTemporal);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        campo_correo = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        passValidar = new javax.swing.JLabel();
        btnLoadImage = new javax.swing.JButton();
        panelPreview = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        pass1 = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        imagenLabel = new javax.swing.JLabel();
        campo_pass = new javax.swing.JPasswordField();
        campo_pass_validar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear Usuario");
        setBackground(new java.awt.Color(248, 239, 230));
        setExtendedState(100);

        jPanel1.setBackground(new java.awt.Color(248, 239, 230));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Titulo.setText("Crear Usuario");

        correo.setBackground(new java.awt.Color(0, 0, 0));
        correo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        correo.setText("Correo :");

        campo_correo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));

        nombre.setBackground(new java.awt.Color(0, 0, 0));
        nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombre.setText("Nombre :");

        campo_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));
        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        pass.setBackground(new java.awt.Color(0, 0, 0));
        pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass.setText("Contraseña  :");

        passValidar.setBackground(new java.awt.Color(0, 0, 0));
        passValidar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passValidar.setText("Validar Contraseña :");

        btnLoadImage.setBackground(new java.awt.Color(154, 168, 213));
        btnLoadImage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLoadImage.setText("Buscar Imagen");
        btnLoadImage.setEnabled(false);
        btnLoadImage.setFocusable(false);
        btnLoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadImageActionPerformed(evt);
            }
        });

        panelPreview.setBackground(new java.awt.Color(248, 239, 230));

        jButton1.setBackground(new java.awt.Color(154, 168, 213));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Crear Perfil");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(154, 168, 213));
        btn_salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setFocusable(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPreviewLayout = new javax.swing.GroupLayout(panelPreview);
        panelPreview.setLayout(panelPreviewLayout);
        panelPreviewLayout.setHorizontalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        panelPreviewLayout.setVerticalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pass1.setBackground(new java.awt.Color(0, 0, 0));
        pass1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass1.setText("Cedula:");

        campo_cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));
        campo_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_cedulaKeyReleased(evt);
            }
        });

        imagenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(imagenLabel);

        campo_pass.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));

        campo_pass_validar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(154, 168, 213), null));
        campo_pass_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pass_validarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(correo)
                            .addComponent(passValidar)
                            .addComponent(campo_pass_validar, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 151, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Titulo)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_pass_validar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(campo_pass))
                .addGap(18, 18, 18)
                .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
        Login abrir = new Login(conexion);
        abrir.setVisible(true);
        abrir.setResizable(false);
        abrir.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_salirActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombres = campo_nombre.getText();
        String email = campo_correo.getText();
        String pass = campo_pass.getText();
        String passValidar = campo_pass_validar.getText();
        String cedula = campo_cedula.getText();
        try {
            if(nombres.length() > 0 && pass.length() > 0 && cedula.length() > 0 && email.length() > 0){   
                boolean resultado = validarcorreo(email);
                if(pass.equals(passValidar)){
                    if(resultado){
                        String passEncript = hasdcode.encrypt(pass,this.secretKey);
                        boolean respuesta = this.conexion.insertarPersona(nombres,email,passEncript,cedula);
                        if(respuesta){
                            campo_correo.setText("");
                            campo_nombre.setText("");
                            campo_pass.setText("");
                            campo_pass_validar.setText("");                            
                            guardarFoto();
                            campo_cedula.setText("");                           
                            imagenLabel.setIcon(null); // Limpia el icono del JLabel
                            btnLoadImage.setEnabled(false);
                            JOptionPane.showMessageDialog(null,"Creado con éxito");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Correo Invalido");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Contraseña de validacion no coincide");
                }   
            }else{
                JOptionPane.showMessageDialog(null,"Todos los campos obligatorios");
            }    
        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);
        int seleccion = fileChooser.showOpenDialog(panelPreview);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaImagen = fileChooser.getSelectedFile().getAbsolutePath();
            imagenTemporal = new ImageIcon(rutaImagen);
            Image imagen = imagenTemporal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenTemporal = new ImageIcon(imagen);
            imagenLabel.setIcon(imagenTemporal);
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed

    private void campo_cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_cedulaKeyReleased
        String cedula = campo_cedula.getText();
        if(cedula.length() > 0){
            btnLoadImage.setEnabled(true);
        }else{
            btnLoadImage.setEnabled(false);
        }
    }//GEN-LAST:event_campo_cedulaKeyReleased

    private void campo_pass_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pass_validarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pass_validarActionPerformed
    public void guardarFoto(){
        try {
            BufferedImage image = createBufferedImage(imagenTemporal);
            if (image != null) {
                String outputFilePath = "src/imagenes/"+campo_cedula.getText()+".png";
                ImageIO.write(image, "png", new File(outputFilePath));

                System.out.println("La imagen se ha cargado correctamente y se ha guardado en " + outputFilePath);
            } else {
                System.out.println("No se pudo cargar la imagen.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
                                               

    private BufferedImage createBufferedImage(ImageIcon temporal){
        Image imagen = temporal.getImage();
        BufferedImage bufferedImage = new BufferedImage(
            imagen.getWidth(null),
            imagen.getHeight(null),
            BufferedImage.TYPE_INT_ARGB
        );
        Graphics2D bGr = bufferedImage.createGraphics();
        bGr.drawImage(imagen, 0, 0, null);
        bGr.dispose();
        return bufferedImage;
    }
    public boolean validarcorreo(String correo){
        boolean validar = false;
        int cont = 0;
        int contPuntos = 0;
        for (int i=0; i<correo.length(); i++) {
            if (correo.charAt(i)=='@') {
                cont++;
            }
            if (cont==1 && correo.charAt(i)=='.') {
                contPuntos++;
            }
        }
        if (cont==1 && contPuntos==2 || cont==1 && contPuntos==1) {
            Color colorRGB = new Color(154, 168, 213);
            Border borde = BorderFactory.createLineBorder(colorRGB, 2);   
            campo_correo.setBorder(borde);
            validar = true;
        }else{
            Border borderColor = new LineBorder(Color.RED, 1, true);
            Border borderPadding = new EmptyBorder(2,5,2,5);
            Border borderRojo = new CompoundBorder(borderColor, borderPadding);
            campo_correo.setBorder(borderRojo);
        }
        return validar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_nombre;
    public javax.swing.JPasswordField campo_pass;
    public javax.swing.JPasswordField campo_pass_validar;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelPreview;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel pass1;
    private javax.swing.JLabel passValidar;
    // End of variables declaration//GEN-END:variables
}
