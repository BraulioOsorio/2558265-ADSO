package pokeapi;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    
    Conexion conexion;
    Gson gson = new Gson();
    DefaultTableModel modelo;
    public Menu(Conexion conexion) {
        this.conexion = conexion;
        initComponents();
        initComponentAltern();
        botones();
        modelo = (DefaultTableModel) tablaHabilidades.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentButtons = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHabilidades = new javax.swing.JTable();
        fotoPokemon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombrePokemon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        contentButtons.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentButtonsLayout = new javax.swing.GroupLayout(contentButtons);
        contentButtons.setLayout(contentButtonsLayout);
        contentButtonsLayout.setHorizontalGroup(
            contentButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        contentButtonsLayout.setVerticalGroup(
            contentButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contentButtons);

        tablaHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "Habilidades", "Url"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(tablaHabilidades);
        if (tablaHabilidades.getColumnModel().getColumnCount() > 0) {
            tablaHabilidades.getColumnModel().getColumn(0).setResizable(false);
            tablaHabilidades.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaHabilidades.getColumnModel().getColumn(1).setResizable(false);
            tablaHabilidades.getColumnModel().getColumn(1).setPreferredWidth(250);
            tablaHabilidades.getColumnModel().getColumn(2).setResizable(false);
            tablaHabilidades.getColumnModel().getColumn(2).setPreferredWidth(500);
        }

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("POKEDEX");
        jLabel1.setOpaque(true);

        nombrePokemon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nombrePokemon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombrePokemon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel1))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initComponentAltern(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("POKEDEX");
        //setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")) );
        
        //Image img_candado = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png"));
        //img_candado = img_candado.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        //etq_icono.setIcon(new ImageIcon(img_candado));
        
        contentButtons.setLayout(new BoxLayout(contentButtons, BoxLayout.Y_AXIS)); // Establecer el layout vertical
        
        
        
        
        
    }
    
    
    
    public void botones() {
        String datos = conexion.consumoGET("https://pokeapi.co/api/v2/pokemon");
        JsonObject jsonObject = gson.fromJson(datos, JsonObject.class);
        JsonArray registros = jsonObject.getAsJsonArray("results");
        for (JsonElement registro : registros) {
            JsonObject registrosOb = registro.getAsJsonObject();
            String nombres = registrosOb.get("name").getAsString();
            JPanel buttonPanel = new JPanel();
            
            FlowLayout flowLayout = new FlowLayout();
            flowLayout.setHgap(0); 
            flowLayout.setVgap(0); 
            buttonPanel.setLayout(flowLayout);
            JButton boton = new JButton(nombres);
            
            boton.setHorizontalAlignment(SwingConstants.CENTER);
            boton.setPreferredSize(new Dimension(130, 25));
            
            
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String nombrePo = boton.getText();
                    String datosPokemon = conexion.consumoGET("https://pokeapi.co/api/v2/pokemon/" + nombrePo);
                    JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);
                    String nombrePoMayusculas = nombrePo.toUpperCase();
                    nombrePokemon.setText(nombrePoMayusculas);
                    String imageUrl = pokemonObj.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
                    ImageIcon imageIcon;
                    try {
                        imageIcon = new ImageIcon(new URL(imageUrl));
                        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
                        ImageIcon imagenPoke = new ImageIcon(image);
                        fotoPokemon.setIcon(imagenPoke);
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    modelo.setNumRows(0);
                    JsonArray habilidades = pokemonObj.getAsJsonArray("abilities");
                    int numero = 1;
                    for (JsonElement registro : habilidades) {
                        JsonObject registrosOb = registro.getAsJsonObject();
                        String ability = registrosOb.getAsJsonObject("ability").get("name").getAsString();
                        String url = registrosOb.getAsJsonObject("ability").get("url").getAsString();
                        Object[] fila = new Object[]{numero, ability, url};
                        modelo.addRow(fila);
                        numero++;
                    }

                }
            });
            buttonPanel.add(boton);
    
   
            contentButtons.add(buttonPanel);
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentButtons;
    private javax.swing.JLabel fotoPokemon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombrePokemon;
    private javax.swing.JTable tablaHabilidades;
    // End of variables declaration//GEN-END:variables
}
