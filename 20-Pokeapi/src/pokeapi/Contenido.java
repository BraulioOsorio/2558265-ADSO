
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
        this.nombrePre = "bulbasaur";
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
        String datosPokemonPre = conexion.consumoGET("https://pokeapi.co/api/v2/pokemon/"+nombrePre);
        JsonObject pokemonO = gson.fromJson(datosPokemonPre, JsonObject.class);
        String nombre = pokemonO.get("name").getAsString();
        pokeActual = "https://pokeapi.co/api/v2/pokemon/" + nombre;
        String nombrePoMayusculas = nombre.toUpperCase();
        nombrePokemon.setText(nombrePoMayusculas);
        
        
        String imageUrlpo = null;
        JsonElement imagenUrl = pokemonO.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default");

        if (imagenUrl != null && !imagenUrl.isJsonNull() && imagenUrl.isJsonPrimitive()) {
            // Accede a la propiedad y conviértela a una cadena si no es nula
            imageUrlpo = imagenUrl.getAsString();
        } else {
            // Si imagenUrl es nulo o no es una propiedad JSON primitiva, intenta la otra ruta
            JsonElement frontDefault = pokemonO.getAsJsonObject("sprites").get("front_default");

            if (frontDefault != null && frontDefault.isJsonPrimitive()) {
                imageUrlpo = frontDefault.getAsString();
            } else {
                // Si ambas rutas fallan, asigna una URL de imagen predeterminada
                imageUrlpo = "https://www.pngkey.com/png/detail/119-1192258_faq-comments-emoji-signo-de-pregunta-png.png";
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

        fotoPokemon.setBackground(new java.awt.Color(255, 255, 255));

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

        paginadorPanel.setBackground(new java.awt.Color(255, 255, 255));
        paginadorPanel.setForeground(new java.awt.Color(255, 255, 255));
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
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(postImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(nextImage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(atras)
                        .addGap(18, 18, 18)
                        .addComponent(paginadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(next)
                        .addGap(129, 129, 129))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(171, 171, 171))
        );
        contenInterLayout.setVerticalGroup(
            contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenInterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenInterLayout.createSequentialGroup()
                        .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(nextImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(postImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenInterLayout.createSequentialGroup()
                                .addComponent(nombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fotoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(next)
                    .addGroup(contenInterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(paginadorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atras, javax.swing.GroupLayout.Alignment.TRAILING)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenInter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        String datos = conexion.consumoGET(urlbase);
        JsonObject jsonObject = gson.fromJson(datos, JsonObject.class);
        this.urlbase = jsonObject.get("previous").getAsString();
        botones(this.urlbase);
        
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
        int i = 0;
        JsonArray registros = jsonObject.getAsJsonArray("results");
        for (JsonElement registro : registros) {
            JsonObject registrosOb = registro.getAsJsonObject();
            String nombres = registrosOb.get("name").getAsString();
            JPanel buttonPanel = new JPanel();
            if(i==0){
                nombrePre = nombres;
            }
            i++;
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
                    String imageUrl = null;                    
                    JsonElement imagenUrl = pokemonObj.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default");

                    if (imagenUrl != null && !imagenUrl.isJsonNull() && imagenUrl.isJsonPrimitive()) {
                        // Accede a la propiedad y conviértela a una cadena si no es nula
                        imageUrl = imagenUrl.getAsString();
                    } else {
                        // Si imagenUrl es nulo o no es una propiedad JSON primitiva, intenta la otra ruta
                        JsonElement frontDefault = pokemonObj.getAsJsonObject("sprites").get("front_default");

                        if (frontDefault != null && frontDefault.isJsonPrimitive()) {
                            imageUrl = frontDefault.getAsString();
                        } else {
                            // Si ambas rutas fallan, asigna una URL de imagen predeterminada
                            imageUrl = "https://www.pngkey.com/png/detail/119-1192258_faq-comments-emoji-signo-de-pregunta-png.png";
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
        int inicio = Math.max(1, paginaActual - 2);
        int fin = Math.min(totalPaginas, paginaActual + 2);

        // Si la página actual es 1 o 2, establece fin en 5
        if (paginaActual == 1 || paginaActual == 2) {
            fin = Math.min(5, totalPaginas);
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