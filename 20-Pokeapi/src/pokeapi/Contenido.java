
package pokeapi;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.logging.*;
import javax.swing.*;;
import javax.swing.table.DefaultTableModel;

public class Contenido extends javax.swing.JPanel {

    private JButton ultimoBotonSeleccionado;
    Conexion conexion;
    Gson gson = new Gson();
    DefaultTableModel modelo;
    public Contenido(Conexion conexion) {
        this.conexion = conexion;
        initComponents();
        botones();
        modelo = (DefaultTableModel) tablaHabilidades.getModel();
        contentButtons.setLayout(new BoxLayout(contentButtons, BoxLayout.Y_AXIS));
        pre();
    }
    
    public void pre(){
        String datosPokemonPre = conexion.consumoGET("https://pokeapi.co/api/v2/pokemon/1");
        JsonObject pokemonO = gson.fromJson(datosPokemonPre, JsonObject.class);
        nombrePokemon.setText("BULBASAUR");
        String imageUrlpo = pokemonO.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
      
        ImageIcon imageIconn;
        try {
            imageIconn = new ImageIcon(new URL(imageUrlpo));
            Image imagen = imageIconn.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon imagenPokepre = new ImageIcon(imagen);
            fotoPokemon.setIcon(imagenPokepre);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelo.setNumRows(0);
        JsonArray habilidadess = pokemonO.getAsJsonArray("abilities");
        int numero = 1;
        for (JsonElement registro : habilidadess) {
            JsonObject registrosOb = registro.getAsJsonObject();
            String ability = registrosOb.getAsJsonObject("ability").get("name").getAsString();
            String url = registrosOb.getAsJsonObject("ability").get("url").getAsString();
            Object[] fila = new Object[]{numero, ability, url};
            modelo.addRow(fila);
            numero++;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenInter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentButtons = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHabilidades = new javax.swing.JTable();
        fotoPokemon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombrePokemon = new javax.swing.JLabel();

        contenInter.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("POKEDEX");
        jLabel1.setOpaque(true);

        nombrePokemon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nombrePokemon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout contenInterLayout = new javax.swing.GroupLayout(contenInter);
        contenInter.setLayout(contenInterLayout);
        contenInterLayout.setHorizontalGroup(
            contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenInterLayout.createSequentialGroup()
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenInterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(contenInterLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenInterLayout.setVerticalGroup(
            contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenInterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                        .addComponent(nombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenInter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenInter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
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
                    if (ultimoBotonSeleccionado != null) {
                        ultimoBotonSeleccionado.setForeground(null);
                    }
                    ultimoBotonSeleccionado = boton;
                    boton.setForeground(Color.BLUE);      
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
    private javax.swing.JPanel contenInter;
    private javax.swing.JPanel contentButtons;
    private javax.swing.JLabel fotoPokemon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombrePokemon;
    private javax.swing.JTable tablaHabilidades;
    // End of variables declaration//GEN-END:variables
}
