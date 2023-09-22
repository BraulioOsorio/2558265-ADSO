
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
    private JButton paginadorBoton;
    Conexion conexion;
    Gson gson = new Gson();
    DefaultTableModel modelo;
    String urlbase;
    String datoss;
    int numero;
    //paginador
    int paginaActual;
    int elementosPorPagina;
    int totalPaginas;
    String pokeActual;
    private int posicionActual = 0;
    
    
    public Contenido(Conexion conexion,String datoss) {
        this.conexion = conexion;
        initComponents();
        this.urlbase = "";
        this.datoss = datoss;
        this.numero = 1;
        this.pokeActual = "https://pokeapi.co/api/v2/pokemon/1";
        this.paginaActual = 1;
        this.elementosPorPagina = 20;
        this.totalPaginas = calcularTotalPaginas(datoss);
        
        
        
        
        contenInter.add(paginadorPanel, BorderLayout.SOUTH);
        
        
        botones(urlbase);
        modelo = (DefaultTableModel) tablaHabilidades.getModel();
        contentButtons.setLayout(new BoxLayout(contentButtons, BoxLayout.Y_AXIS));
        pre();
        
        agregarBotonesPaginador();
        
        
    }
    
    public void pre(){
        String datosPokemonPre = conexion.consumoGET("https://pokeapi.co/api/v2/pokemon/"+numero);
        JsonObject pokemonO = gson.fromJson(datosPokemonPre, JsonObject.class);
        String nombre = pokemonO.get("name").getAsString();
        String nombrePoMayusculas = nombre.toUpperCase();
        nombrePokemon.setText(nombrePoMayusculas);
        String imageUrlpo = pokemonO.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
      
        ImageIcon imageIconn;
        try {
            imageIconn = new ImageIcon(new URL(imageUrlpo));
            Image imagen = imageIconn.getImage().getScaledInstance(210, 210, Image.SCALE_SMOOTH);
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
        atras = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentButtons = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHabilidades = new javax.swing.JTable();
        fotoPokemon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombrePokemon = new javax.swing.JLabel();
        nextImage = new java.awt.Button();
        postImage = new java.awt.Button();
        paginadorPanel = new javax.swing.JPanel();

        contenInter.setBackground(new java.awt.Color(255, 255, 255));

        atras.setBackground(new java.awt.Color(51, 51, 255));
        atras.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(0, 0, 0));
        atras.setText("Anteriores");
        atras.setFocusable(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(51, 51, 255));
        next.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        next.setForeground(new java.awt.Color(0, 0, 0));
        next.setText("Siguientes");
        next.setFocusable(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

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
            tablaHabilidades.getColumnModel().getColumn(1).setPreferredWidth(230);
            tablaHabilidades.getColumnModel().getColumn(2).setResizable(false);
            tablaHabilidades.getColumnModel().getColumn(2).setPreferredWidth(500);
        }

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("POKEDEX");
        jLabel1.setOpaque(true);

        nombrePokemon.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nombrePokemon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nextImage.setLabel(">");
        nextImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextImageActionPerformed(evt);
            }
        });

        postImage.setLabel("<");
        postImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postImageActionPerformed(evt);
            }
        });

        paginadorPanel.setLayout(new javax.swing.BoxLayout(paginadorPanel, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout contenInterLayout = new javax.swing.GroupLayout(contenInter);
        contenInter.setLayout(contenInterLayout);
        contenInterLayout.setHorizontalGroup(
            contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenInterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenInterLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                                        .addGap(0, 187, Short.MAX_VALUE)
                                        .addComponent(nombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 120, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(225, 225, 225)))
                                .addContainerGap())
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(postImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextImage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                                .addComponent(atras)
                                .addGap(18, 18, 18)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                                .addComponent(paginadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))))))
        );
        contenInterLayout.setVerticalGroup(
            contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenInterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenInterLayout.createSequentialGroup()
                        .addComponent(nombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(nextImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(postImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(paginadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        String datos = conexion.consumoGET(urlbase);
        JsonObject jsonObject = gson.fromJson(datos, JsonObject.class);
        this.urlbase = jsonObject.get("previous").getAsString();
        botones(this.urlbase);
        this.numero = numero - 20;
        pre();
        paginaActual--;
        agregarBotonesPaginador();
        
        
    }//GEN-LAST:event_atrasActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        String datos = null;
        if(urlbase == null || urlbase.isEmpty()){
           datos = conexion.consumoGET("https://pokeapi.co/api/v2/pokemon");
        }else{
            datos = conexion.consumoGET(urlbase);
        }
        
        JsonObject jsonObject = gson.fromJson(datos, JsonObject.class);
        
        this.urlbase = jsonObject.get("next").getAsString();
        botones(this.urlbase);
        
        this.numero = numero + 20;
        pre();
        paginaActual++;
        agregarBotonesPaginador();
        
        
    }//GEN-LAST:event_nextActionPerformed

    private void nextImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextImageActionPerformed
        // Incrementar la posición actual
        posicionActual++;
        String[] datos = {
            "back_default",
            "back_female",
            "back_shiny",
            "back_shiny_female",
            "front_default",
            "front_female",
            "front_shiny",
            "front_shiny_female"
        };

        // Verificar si la posición actual es válida
        if (posicionActual >= datos.length) {
            // Si llegamos al final, volver al principio (circular)
            posicionActual = 0;
        }

        // Obtener el nombre del sprite en la posición actual del arreglo
        String imagenActual = datos[posicionActual];
        String datosPokemon = conexion.consumoGET(this.pokeActual);
        

        if(posicionActual == 0){
            JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);
            String imageUrl = pokemonObj.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
            cargarImagen(imageUrl);
        }else{
            
            if (datosPokemon != null && !datosPokemon.isEmpty()) {
            JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);

            // Verificar si el objeto JSON es nulo
            if (pokemonObj != null && pokemonObj.getAsJsonObject("sprites") != null) {
                // Obtener el valor del sprite actual
                JsonElement spriteElement = pokemonObj.getAsJsonObject("sprites").get(imagenActual);

                // Verificar si el valor en el JSON no es nulo y es un elemento primitivo
                if (!spriteElement.isJsonNull() ) {
                    String imageUrl = spriteElement.getAsString();
                    cargarImagen(imageUrl);
                } else {
                    // Si el valor en el JSON no es válido, intentar cargar la siguiente imagen
                    nextImageActionPerformed(evt);
                }
            } else {
                // Si el objeto JSON es nulo, intentar cargar la siguiente imagen
                nextImageActionPerformed(evt);
            }
        } else {
            // Si los datos del Pokémon son nulos o vacíos, intentar cargar la siguiente imagen
            nextImageActionPerformed(evt);
        }
        }
        
    }//GEN-LAST:event_nextImageActionPerformed
    
    private void postImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postImageActionPerformed
        // Decrementar la posición actual
      posicionActual--;
      String[] datos = {
            "back_default",
            "back_female",
            "back_shiny",
            "back_shiny_female",
            "front_default",
            "front_female",
            "front_shiny",
            "front_shiny_female"
        };

    // Verificar si la posición actual es válida
        if (posicionActual < 0) {
            // Si llegamos al principio, ir al final (circular)
            posicionActual = datos.length - 1;
        }

        // Obtener el nombre del sprite en la posición actual del arreglo
        String imagenActual = datos[posicionActual];
        String datosPokemon = conexion.consumoGET(this.pokeActual);
        

        if (posicionActual == 0) {
            JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);
            String imageUrl = pokemonObj.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
            cargarImagen(imageUrl);
        }else{
            
            if (datosPokemon != null && !datosPokemon.isEmpty()) {
            JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);

            // Verificar si el objeto JSON es nulo
                if (pokemonObj != null && pokemonObj.getAsJsonObject("sprites") != null) {
                    // Obtener el valor del sprite actual
                    JsonElement spriteElement = pokemonObj.getAsJsonObject("sprites").get(imagenActual);

                    // Verificar si el valor en el JSON no es nulo y es un elemento primitivo
                    if (spriteElement != null && !spriteElement.isJsonNull() && spriteElement.isJsonPrimitive()) {
                        String imageUrl = spriteElement.getAsString();
                        cargarImagen(imageUrl);
                    } else {
                        // Si el valor en el JSON no es válido, intentar cargar la imagen anterior
                        postImageActionPerformed(evt);
                    }
                } else {
                    // Si el objeto JSON es nulo, intentar cargar la imagen anterior
                    postImageActionPerformed(evt);
                }
            } else {
                    // Si los datos del Pokémon son nulos o vacíos, intentar cargar la imagen anterior
                    postImageActionPerformed(evt);
            }
        }
            

    
      
    }//GEN-LAST:event_postImageActionPerformed


    private void cargarImagen(String imageUrl) {
         try {
            ImageIcon imageIcon = new ImageIcon(new URL(imageUrl));
            Image image = imageIcon.getImage().getScaledInstance(210, 210, Image.SCALE_SMOOTH);

            ImageIcon imagenPoke = new ImageIcon(image);
            fotoPokemon.setIcon(imagenPoke);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    public int calcularTotalPaginas(String datos) {
        JsonObject jsonObject = gson.fromJson(datos, JsonObject.class);
        int totalElementos = jsonObject.get("count").getAsInt(); // Obtener el total de elementos
        return (int) Math.ceil((double) totalElementos / elementosPorPagina);
    }

    
    public void botones(String urlbase) {
        contentButtons.removeAll();
        JsonObject jsonObject = null;
        if(urlbase == null || urlbase.isEmpty()){
            jsonObject = gson.fromJson(datoss, JsonObject.class);
        }else{
            String datos = conexion.consumoGET(this.urlbase);
            jsonObject = gson.fromJson(datos, JsonObject.class);
        }
        
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
            boton.setBackground(Color.white);
            boton.setFocusable(false);

            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (ultimoBotonSeleccionado != null) {
                        ultimoBotonSeleccionado.setBackground(Color.white);
                        ultimoBotonSeleccionado.setForeground(null);
                    }
                    ultimoBotonSeleccionado = boton;
                    boton.setBackground(Color.BLUE);
                    boton.setForeground(Color.white);
                    
                    String nombrePo = boton.getText();
                    String datosPokemon = conexion.consumoGET("https://pokeapi.co/api/v2/pokemon/" + nombrePo);
                    pokeActual = "https://pokeapi.co/api/v2/pokemon/" + nombrePo;
                    JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);
                    String nombrePoMayusculas = nombrePo.toUpperCase();
                    nombrePokemon.setText(nombrePoMayusculas);
                    String imageUrl = pokemonObj.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
                    
                    ImageIcon imageIcon;
                    try {
                        imageIcon = new ImageIcon(new URL(imageUrl));
                        Image image = imageIcon.getImage().getScaledInstance(210, 210, Image.SCALE_SMOOTH);
                        
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
            boolean tieneAnterior = !jsonObject.get("previous").isJsonNull();
            if (!tieneAnterior) {
                atras.setEnabled(false);
            }else{
                atras.setEnabled(true);
            }
            
            buttonPanel.add(boton);
            contentButtons.add(buttonPanel);
            contentButtons.revalidate();
            contentButtons.repaint();
        }
        
        
    }
    
    public void agregarBotonesPaginador() {
        paginadorPanel.removeAll();

        // Botones de página
        for (int i = Math.max(1, paginaActual - 2); i <= Math.min(totalPaginas, paginaActual + 2); i++) {
            JButton botonPagina = new JButton(String.valueOf(i));
            botonPagina.setBackground(Color.red);
            botonPagina.setForeground(Color.white);
            botonPagina.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (paginadorBoton != null) {
                        paginadorBoton.setBackground(Color.white);
                        paginadorBoton.setForeground(null);
                    }
                    paginadorBoton = botonPagina;
                    botonPagina.setBackground(Color.BLUE);
                    botonPagina.setForeground(Color.white);
                    paginaActual = Integer.parseInt(botonPagina.getText());
                    System.out.println(paginaActual);
                    int paginaAmos = 0;
                    
                    if(paginaActual == 1){
                        urlbase = "https://pokeapi.co/api/v2/pokemon?offset=0&limit=20";
                        numero = 1;
                        agregarBotonesPaginador();
                        
                    }else{
                        paginaAmos = (paginaActual-1) * 20;
                        urlbase = "https://pokeapi.co/api/v2/pokemon?offset="+paginaAmos+"&limit=20";
                        numero = paginaAmos+1;
                        agregarBotonesPaginador();
                    }
                    
                    
                    System.out.println(paginaAmos);
                    
                    botones(urlbase);
                    pre();
                    
                }
            });
            
            paginadorPanel.add(botonPagina);
            System.out.println("si "+i);
        }
        paginadorPanel.revalidate();
        paginadorPanel.repaint();
                

       
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JPanel contenInter;
    private javax.swing.JPanel contentButtons;
    private javax.swing.JLabel fotoPokemon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton next;
    private java.awt.Button nextImage;
    private javax.swing.JLabel nombrePokemon;
    private javax.swing.JPanel paginadorPanel;
    private java.awt.Button postImage;
    private javax.swing.JTable tablaHabilidades;
    // End of variables declaration//GEN-END:variables

    
}
