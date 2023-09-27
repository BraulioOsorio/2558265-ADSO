
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
    String urlbase;
    String datoss;
    //paginador
    int paginaActual;
    int elementosPorPagina;
    int totalPaginas;
    String pokeActual;
    String nombrePre;
    private int posicionActual = 0;
    
    
    public Contenido(Conexion conexion,String datoss) {
        this.conexion = conexion;
        initComponents();
        this.urlbase = "";
        this.datoss = datoss;
        this.pokeActual = "https://pokeapi.co/api/v2/pokemon/1";
        this.paginaActual = 1;
        this.elementosPorPagina = 20;
        this.totalPaginas = calcularTotalPaginas(datoss);
        
        
        botones(urlbase);
        modelo = (DefaultTableModel) tablaHabilidades.getModel();
        contentButtons.setLayout(new BoxLayout(contentButtons, BoxLayout.Y_AXIS));
        pre();
        
        agregarBotonesPaginador();
        
        
    }
    
    public void pre(){
        try {
            String datosPokemonPre = conexion.consumoGET("https://pokeapi.co/api/v2/pokemon/"+nombrePre);
            JsonObject pokemonO = gson.fromJson(datosPokemonPre, JsonObject.class);
            String nombre = pokemonO.get("name").getAsString();
            pokeActual = "https://pokeapi.co/api/v2/pokemon/" + nombre;
            String nombrePoMayusculas = nombre.toUpperCase();
            nombrePokemon.setText(nombrePoMayusculas);


            String imageUrlpo = null;
            JsonElement imagenUrl = pokemonO.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default");

            if (imagenUrl != null && !imagenUrl.isJsonNull() && imagenUrl.isJsonPrimitive()) {
                imageUrlpo = imagenUrl.getAsString();
            } else {
   
                JsonElement frontDefault = pokemonO.getAsJsonObject("sprites").get("front_default");

                if (frontDefault != null && frontDefault.isJsonPrimitive()) {
                    imageUrlpo = frontDefault.getAsString();
                } else {

                    imageUrlpo = "https://i.pinimg.com/originals/46/e7/7e/46e77e3db6a6cdce8c63a9de331f31ff.png";
                }
            }



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
        } catch (Exception e) {
            buscar.setText("");
            JOptionPane.showMessageDialog(null, "Ingrese el numero o nombre de un pokemon que exista");
            
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
        buscar = new javax.swing.JTextField();
        atrasTodo = new javax.swing.JButton();
        nextTodo = new javax.swing.JButton();

        contenInter.setBackground(new java.awt.Color(255, 255, 255));

        atras.setBackground(java.awt.Color.blue);
        atras.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("<");
        atras.setFocusable(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        next.setBackground(java.awt.Color.blue);
        next.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText(">");
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
            .addGap(0, 191, Short.MAX_VALUE)
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

        fotoPokemon.setBackground(new java.awt.Color(255, 255, 255));
        fotoPokemon.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("POKEDEX");
        jLabel1.setOpaque(true);

        nombrePokemon.setBackground(new java.awt.Color(0, 0, 0));
        nombrePokemon.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        nombrePokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePokemon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nextImage.setBackground(java.awt.Color.blue);
        nextImage.setForeground(new java.awt.Color(255, 255, 255));
        nextImage.setLabel(">");
        nextImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextImageActionPerformed(evt);
            }
        });

        postImage.setBackground(java.awt.Color.blue);
        postImage.setForeground(new java.awt.Color(255, 255, 255));
        postImage.setLabel("<");
        postImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postImageActionPerformed(evt);
            }
        });

        paginadorPanel.setBackground(new java.awt.Color(255, 255, 255));
        paginadorPanel.setForeground(new java.awt.Color(255, 255, 255));
        paginadorPanel.setLayout(new javax.swing.BoxLayout(paginadorPanel, javax.swing.BoxLayout.X_AXIS));

        buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.blue));
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });

        atrasTodo.setBackground(java.awt.Color.blue);
        atrasTodo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        atrasTodo.setForeground(new java.awt.Color(255, 255, 255));
        atrasTodo.setText("<<");
        atrasTodo.setFocusable(false);
        atrasTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasTodoActionPerformed(evt);
            }
        });

        nextTodo.setBackground(java.awt.Color.blue);
        nextTodo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        nextTodo.setForeground(new java.awt.Color(255, 255, 255));
        nextTodo.setText(">>");
        nextTodo.setFocusable(false);
        nextTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenInterLayout = new javax.swing.GroupLayout(contenInter);
        contenInter.setLayout(contenInterLayout);
        contenInterLayout.setHorizontalGroup(
            contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atrasTodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atras)
                .addGap(18, 18, 18)
                .addComponent(paginadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(next)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextTodo)
                .addGap(34, 34, 34))
            .addGroup(contenInterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenInterLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(contenInterLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenInterLayout.createSequentialGroup()
                                        .addComponent(nombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenInterLayout.createSequentialGroup()
                                        .addComponent(postImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nextImage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))))))))
        );
        contenInterLayout.setVerticalGroup(
            contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(26, 26, 26)
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenInterLayout.createSequentialGroup()
                        .addComponent(nombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nextImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(postImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(next)
                        .addComponent(nextTodo))
                    .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(paginadorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atras)
                            .addComponent(atrasTodo))))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenInter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenInter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed

        if(paginaActual <= 5){
            paginaActual = 1;
            agregarBotonesPaginador();
        }else{
            paginaActual = paginaActual - 5;
            agregarBotonesPaginador();
        }
        
        
    }//GEN-LAST:event_atrasActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(paginaActual >= 61){
            paginaActual = 65;
            agregarBotonesPaginador();
        }else{
            paginaActual = paginaActual + 5;
            agregarBotonesPaginador();
        }
        
    }//GEN-LAST:event_nextActionPerformed

    private void nextImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextImageActionPerformed
        try {
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

            if (posicionActual >= datos.length) {

                posicionActual = 0;
            }


            String imagenActual = datos[posicionActual];
            String datosPokemon = conexion.consumoGET(this.pokeActual);


            if(posicionActual == 0){
                JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);
                String imageUrl = pokemonObj.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
                cargarImagen(imageUrl);
            }else{

                if (datosPokemon != null && !datosPokemon.isEmpty()) {
                JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);

                    if (pokemonObj != null && pokemonObj.getAsJsonObject("sprites") != null) {

                        JsonElement spriteElement = pokemonObj.getAsJsonObject("sprites").get(imagenActual);


                        if (!spriteElement.isJsonNull() ) {
                            String imageUrl = spriteElement.getAsString();
                            cargarImagen(imageUrl);
                        } else {

                            nextImageActionPerformed(evt);
                        }
                    } else {

                        nextImageActionPerformed(evt);
                    }
                } else {

                    nextImageActionPerformed(evt);
                }
            }
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_nextImageActionPerformed
    
    private void postImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postImageActionPerformed
        try {
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


            if (posicionActual < 0) {
                posicionActual = datos.length - 1;
            }

            String imagenActual = datos[posicionActual];
            String datosPokemon = conexion.consumoGET(this.pokeActual);


            if (posicionActual == 0) {
                JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);
                String imageUrl = pokemonObj.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
                cargarImagen(imageUrl);
            }else{

                if (datosPokemon != null && !datosPokemon.isEmpty()) {
                JsonObject pokemonObj = gson.fromJson(datosPokemon, JsonObject.class);

                    if (pokemonObj != null && pokemonObj.getAsJsonObject("sprites") != null) {

                        JsonElement spriteElement = pokemonObj.getAsJsonObject("sprites").get(imagenActual);

                        if (spriteElement != null && !spriteElement.isJsonNull() && spriteElement.isJsonPrimitive()) {
                            String imageUrl = spriteElement.getAsString();
                            cargarImagen(imageUrl);
                        } else {

                            postImageActionPerformed(evt);
                        }
                    } else {

                        postImageActionPerformed(evt);
                    }
                } else {

                        postImageActionPerformed(evt);
                }
            }
        } catch (Exception e) {
        }
        
            

    
      
    }//GEN-LAST:event_postImageActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        if (evt.getKeyChar() == '\n') {
            
            this.nombrePre =  buscar.getText().toLowerCase();
            pre();
            buscar.setText("");
        }  
    }//GEN-LAST:event_buscarKeyReleased

    private void atrasTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasTodoActionPerformed
        paginaActual = 1;
        agregarBotonesPaginador();
        
    }//GEN-LAST:event_atrasTodoActionPerformed

    private void nextTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTodoActionPerformed
        paginaActual = totalPaginas;
        agregarBotonesPaginador();
    }//GEN-LAST:event_nextTodoActionPerformed


    private void cargarImagen(String imageUrl) {
         try {
            ImageIcon imageIcon = new ImageIcon(new URL(imageUrl));
            Image image = imageIcon.getImage().getScaledInstance(210, 210, Image.SCALE_SMOOTH);

            ImageIcon imagenPoke = new ImageIcon(image);
            fotoPokemon.setIcon(imagenPoke);
        } catch (MalformedURLException ex) {
            
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
        int i = 0;
        JsonArray registros = jsonObject.getAsJsonArray("results");
        for (JsonElement registro : registros) {
            JsonObject registrosOb = registro.getAsJsonObject();
            String nombres = registrosOb.get("name").getAsString();
            JPanel buttonPanel = new JPanel();
            
            FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
            flowLayout.setHgap(0); 
            flowLayout.setVgap(0); 
            buttonPanel.setLayout(flowLayout);
            JButton boton = new JButton(nombres);
            
            boton.setHorizontalAlignment(SwingConstants.CENTER);
            boton.setPreferredSize(new Dimension(190, 32));
            boton.setBackground(Color.white);
            boton.setFocusable(false);
            boton.setFont(new Font("Arial", Font.PLAIN, 12));
            if(i==0){
                nombrePre = nombres;
                ultimoBotonSeleccionado = boton;
                boton.setBackground(Color.BLUE);
                boton.setForeground(Color.white);
            }
            i++;
            

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
                    String imageUrl = null;                    
                    JsonElement imagenUrl = pokemonObj.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default");

                    if (imagenUrl != null && !imagenUrl.isJsonNull() && imagenUrl.isJsonPrimitive()) {

                        imageUrl = imagenUrl.getAsString();
                    } else {
     
                        JsonElement frontDefault = pokemonObj.getAsJsonObject("sprites").get("front_default");

                        if (frontDefault != null && frontDefault.isJsonPrimitive()) {
                            imageUrl = frontDefault.getAsString();
                        } else {
       
                            imageUrl = "https://i.pinimg.com/originals/46/e7/7e/46e77e3db6a6cdce8c63a9de331f31ff.png";
                        }
                    }
                    
                    
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

            buttonPanel.add(boton);
            contentButtons.add(buttonPanel);
            contentButtons.revalidate();
            contentButtons.repaint();
        }
        
        
    }
    
    public void agregarBotonesPaginador() {
        int paginaPor = (paginaActual - 1) * 20;
        urlbase = "https://pokeapi.co/api/v2/pokemon?offset=" + paginaPor + "&limit=20";
        
        botones(urlbase);
        pre();

        
        paginadorPanel.removeAll();


        int inicio = Math.max(1, paginaActual - 2);
        int fin = Math.min(totalPaginas, paginaActual + 2);


        if (paginaActual == 1 || paginaActual == 2) {
            fin = Math.min(5, totalPaginas);
        }
        
        if(paginaActual == 65 || paginaActual == 64){
            inicio = Math.max(60, totalPaginas - 4);
        }
        
        
        for (int i = inicio; i <= fin; i++) {
            JButton botonPagina;
            if(i <= 9){
                botonPagina = new JButton(String.valueOf("0"+i));
            }else{
                botonPagina = new JButton(String.valueOf(i));
            }
            
            botonPagina.setBackground(Color.red);
            botonPagina.setForeground(Color.white);
            botonPagina.setFont(new Font("Arial", Font.BOLD, 16)); // Cambia el tamaño de fuente
            botonPagina.setFocusable(false);
            if(paginaActual == i){
                botonPagina.setBackground(Color.BLUE);
                botonPagina.setForeground(Color.white);
            }
            botonPagina.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    paginaActual = Integer.parseInt(botonPagina.getText());

                    int paginaAmos = 0;

                    if (paginaActual == 1) {
                        urlbase = "https://pokeapi.co/api/v2/pokemon?offset=0&limit=20";
                        agregarBotonesPaginador();

                    } else {
                        paginaAmos = (paginaActual - 1) * 20;
                        urlbase = "https://pokeapi.co/api/v2/pokemon?offset=" + paginaAmos + "&limit=20";
                      
                        agregarBotonesPaginador();
                    }

                    botones(urlbase);
                    pre();
                }
            });

            paginadorPanel.add(botonPagina);
        }
        if(paginaActual == 65){
            next.setEnabled(false);
            nextTodo.setEnabled(false);
        }else{
            next.setEnabled(true);
            nextTodo.setEnabled(true);
        }
        
        if(paginaActual == 1){
            atras.setEnabled(false);
            atrasTodo.setEnabled(false);
        }else{
            atras.setEnabled(true);
            atrasTodo.setEnabled(true);
        }
        paginadorPanel.revalidate();
        paginadorPanel.repaint();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton atrasTodo;
    private javax.swing.JTextField buscar;
    private javax.swing.JPanel contenInter;
    private javax.swing.JPanel contentButtons;
    private javax.swing.JLabel fotoPokemon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton next;
    private java.awt.Button nextImage;
    private javax.swing.JButton nextTodo;
    private javax.swing.JLabel nombrePokemon;
    private javax.swing.JPanel paginadorPanel;
    private java.awt.Button postImage;
    private javax.swing.JTable tablaHabilidades;
    // End of variables declaration//GEN-END:variables

    
}
