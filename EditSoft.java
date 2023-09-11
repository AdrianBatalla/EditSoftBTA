import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;

public class EditSoft extends javax.swing.JFrame {
    
    List<String> nombreArchivos = new ArrayList<String>();
    List<String> nuevosNombres = new ArrayList<String>();
    private int catNumero;
    private String directoryPath;

    public EditSoft() {
        initComponents();
        //quitar numero
        jNumerosPregunta.setVisible(false);
        jNumerosText.setVisible(false);
        jNumerosGuion.setVisible(false);
        //cambiar de lugar
        jNumerosPregunta1.setVisible(false);
        jCambiarSi.setVisible(false);
        jNumerosPregunta2.setVisible(false);
        jCambiarSi1.setVisible(false);
        jCambiarNo1.setVisible(false);
        //En vivo
        jNumerosPregunta3.setVisible(false);
        jCambiarSi2.setVisible(false);
        //Karaoke
        
    }
                   
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jNumerosText = new javax.swing.JTextField();
        jNumerosGuion = new javax.swing.JCheckBox();
        jCambiarSi = new javax.swing.JCheckBox();
        jNumerosPregunta = new javax.swing.JLabel();
        jEjemplo = new javax.swing.JLabel();
        jInstrucciones = new javax.swing.JLabel();
        jNumeroEjemplo1 = new javax.swing.JLabel();
        jNumeroEjemplo2 = new javax.swing.JLabel();
        jNumeroEjemplo3 = new javax.swing.JLabel();
        jNumeroEjemplo4 = new javax.swing.JLabel();
        jNumeroEjemplo5 = new javax.swing.JLabel();
        jNumeroEjemplo6 = new javax.swing.JLabel();
        jNumeroEjemplo7 = new javax.swing.JLabel();
        jNumeroEjemplo8 = new javax.swing.JLabel();
        jNumerosPregunta1 = new javax.swing.JLabel();
        jNumerosPregunta2 = new javax.swing.JLabel();
        jCambiarSi1 = new javax.swing.JCheckBox();
        jCambiarNo1 = new javax.swing.JCheckBox();
        jNumerosPregunta3 = new javax.swing.JLabel();
        jCambiarSi2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setText("Error:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bienvenido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Al Bayan", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione una de las siguientes opciones");
        jLabel3.setToolTipText("");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Quitar numero", "Quitar En Vivo", "Cambiar de lugar", "Karaoke" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instrucciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jNumerosGuion.setText("¿Hay un guion despues de los numeros?");

        jCambiarSi.setText("Si");

        jNumerosPregunta.setText("¿Cuantos numeros son?");

        jEjemplo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jEjemplo.setText("Ejemplo:");

        jInstrucciones.setText("Porfavor proporcione los siguientes datos:");

        jNumeroEjemplo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jNumeroEjemplo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jNumeroEjemplo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jNumeroEjemplo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jNumeroEjemplo5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jNumeroEjemplo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jNumeroEjemplo7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jNumeroEjemplo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jNumerosPregunta1.setText("¿Hay mas de un guion?");

        jNumerosPregunta2.setText("¿Esta antes o despues del guion principal?");

        jCambiarSi1.setText("Antes");

        jCambiarNo1.setText("Despues");

        jNumerosPregunta3.setText("¿La palabra \"En Vivo\" esta en minusculas?");

        jCambiarSi2.setText("Si");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jNumerosPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCambiarSi1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCambiarNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jNumeroEjemplo1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumeroEjemplo3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumeroEjemplo5, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumeroEjemplo7, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNumerosPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNumerosPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNumerosGuion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNumerosText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCambiarSi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jNumerosPregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCambiarSi2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEjemplo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNumeroEjemplo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNumeroEjemplo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNumeroEjemplo6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNumeroEjemplo8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNumerosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumerosPregunta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumerosGuion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jCambiarSi))
                    .addComponent(jNumerosPregunta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jCambiarSi1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jCambiarNo1))
                    .addComponent(jNumerosPregunta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jCambiarSi2))
                    .addComponent(jNumerosPregunta3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEjemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumeroEjemplo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumeroEjemplo2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumeroEjemplo3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumeroEjemplo4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumeroEjemplo5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumeroEjemplo6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumeroEjemplo7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNumeroEjemplo8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar");

        jButton4.setText("Ejecutar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Porfavor seleccione una carpeta:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel1)))
        );

        jMenu1.setText("Opciones");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showOpenDialog(this);

        nombreArchivos.clear();
        nuevosNombres.clear();

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = fileChooser.getSelectedFile();
            directoryPath = selectedDirectory.getAbsolutePath();

            // Muestra la ruta del directorio en el JLabel
            jLabel1.setText("Directorio actual: "+directoryPath);

            // Limpia el contenido actual del JTextArea
            jTextArea1.setText("");

            // Lista los nombres de los archivos en el directorio y los agrega al JTextArea
            File[] files = selectedDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        jTextArea1.append("\u251C  "+file.getName() + "\n");
                        nombreArchivos.add(file.getName());
                    }
                }
            }
        }  // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.out.println(directoryPath);
        System.out.println(nombreArchivos);
        System.out.println(nuevosNombres);
    }                                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String opcionSeleccionada = (String) jComboBox1.getSelectedItem();

            if ("Quitar numero".equals(opcionSeleccionada)) {
                // Muestra el JTextField y el JCheckBox para quitar números
                jNumeroEjemplo1.setText("En Este ejemplo hay 3 numeros y un guion:");
                jNumeroEjemplo2.setText("002 - Grupo Firme - Se Cancela la Depre");
                jNumeroEjemplo3.setText("Se pondra 3 y se marcaran la casilla, quedaria asi:");
                jNumeroEjemplo4.setText("Grupo Firme - Se Cancela la Depre");
                jNumeroEjemplo5.setText("En este otro ejemplo hay 2 numeros y no hay guion:");
                jNumeroEjemplo6.setText("10 Banda los recoditos - Vas a querer volver");
                jNumeroEjemplo7.setText("Se pondra 2 y no se marcaran la casilla, quedaria asi:");
                jNumeroEjemplo8.setText("Banda los recoditos - Vas a querer volver");
                jInstrucciones.setVisible(true);
                jNumeroEjemplo1.setVisible(true);
                jNumeroEjemplo2.setVisible(true);
                jNumeroEjemplo3.setVisible(true);
                jNumeroEjemplo4.setVisible(true);
                jNumeroEjemplo5.setVisible(true);
                jNumeroEjemplo6.setVisible(true);
                jNumeroEjemplo7.setVisible(true);
                jNumeroEjemplo8.setVisible(true);
                jNumerosText.setVisible(true);
                jNumerosGuion.setVisible(true);
                jNumerosPregunta.setVisible(true);
                // Oculta los componentes relacionados con "Cambiar de lugar"
                //cambiar de lugar
                jNumerosPregunta1.setVisible(false);
                jCambiarSi.setVisible(false);
                jNumerosPregunta2.setVisible(false);
                jCambiarSi1.setVisible(false);
                jCambiarNo1.setVisible(false);
                //En vivo
                jNumerosPregunta3.setVisible(false);
                jCambiarSi2.setVisible(false);
            } else if ("Cambiar de lugar".equals(opcionSeleccionada)) {
                // Muestra el JCheckBox para cambiar de lugar
                jCambiarSi.setVisible(true);
                jNumeroEjemplo1.setText("Ejemplo de nombre:");
                jNumeroEjemplo2.setText("Grupo Firme - Se Cancela la Depre");
                jNumeroEjemplo3.setText("Asi que quedaria de la siguiente manera:");
                jNumeroEjemplo4.setText("Se Cancela la Depre-Grupo Firme");
                jNumeroEjemplo5.setText("En este otro ejemplo hay mas de un guion, asi que quedaria asi:");
                jNumeroEjemplo6.setText("Banda los recoditos - Vas a querer volver - lorep");
                jNumeroEjemplo7.setText("Asi que se marcara la casilla si y que esta a la derecha, quedaria asi:");
                jNumeroEjemplo8.setText("Vas a querer volver-Banda los recoditos");
                jInstrucciones.setVisible(true);
                jNumeroEjemplo1.setVisible(true);
                jNumeroEjemplo2.setVisible(true);
                jNumeroEjemplo3.setVisible(true);
                jNumeroEjemplo4.setVisible(true);
                jNumeroEjemplo5.setVisible(true);
                jNumeroEjemplo6.setVisible(true);
                jNumeroEjemplo7.setVisible(true);
                jNumeroEjemplo8.setVisible(true);
                jNumerosPregunta1.setVisible(true);
                jCambiarSi.setVisible(true);
                jNumerosPregunta2.setVisible(true);
                jCambiarSi1.setVisible(true);
                jCambiarNo1.setVisible(true);
                // Oculta los componentes relacionados con "Quitar número"
                //quitar numero
                jNumerosPregunta.setVisible(false);
                jNumerosText.setVisible(false);
                jNumerosGuion.setVisible(false);
                //En vivo
                jNumerosPregunta3.setVisible(false);
                jCambiarSi2.setVisible(false);
            } else if("Quitar En Vivo".equals(opcionSeleccionada)) {
                jNumeroEjemplo1.setText("En Este ejemplo esta entre parentesis:");
                jNumeroEjemplo2.setText("Grupo Firme - Se Cancela la Depre(En Vivo)");
                jNumeroEjemplo3.setText("Asi que quedaria de la siguiente manera:");
                jNumeroEjemplo4.setText("Grupo Firme - Se Cancela la Depre(Vivo)");
                jNumeroEjemplo5.setText("En este otro ejemplo esta en minusculas:");
                jNumeroEjemplo6.setText("Grupo Firme - Se Cancela la Depre(en vivo)");
                jNumeroEjemplo7.setText("Asi que se marcara la casilla, quedaria asi:");
                jNumeroEjemplo8.setText("Grupo Firme - Se Cancela la Depre(Vivo)");
                jInstrucciones.setVisible(true);
                jNumeroEjemplo1.setVisible(true);
                jNumeroEjemplo2.setVisible(true);
                jNumeroEjemplo3.setVisible(true);
                jNumeroEjemplo4.setVisible(true);
                jNumeroEjemplo5.setVisible(true);
                jNumeroEjemplo6.setVisible(true);
                jNumeroEjemplo7.setVisible(true);
                jNumeroEjemplo8.setVisible(true);
                jNumerosPregunta3.setVisible(true);
                jCambiarSi2.setVisible(true);
                // Oculta los componentes relacionados con "Quitar número"
                //quitar numero
                jNumerosPregunta.setVisible(false);
                jNumerosText.setVisible(false);
                jNumerosGuion.setVisible(false);
                //cambiar de lugar
                jNumerosPregunta1.setVisible(false);
                jCambiarSi.setVisible(false);
                jNumerosPregunta2.setVisible(false);
                jCambiarSi1.setVisible(false);
                jCambiarNo1.setVisible(false);
            } else if("Karaoke".equals(opcionSeleccionada)) {
                jNumeroEjemplo1.setText("En Esta opcion se buscara el par de archivos que se llamen igual y");
                jNumeroEjemplo2.setVisible(false);
                jNumeroEjemplo3.setText("sean .mp3 y .cdg, si no hay un par sera borrado aquel archivo sin par.");
                jNumeroEjemplo4.setVisible(false);
                jNumeroEjemplo5.setText("En caso de que detecte un tercer archivo con el mismo nombre y que sea");
                jNumeroEjemplo6.setVisible(false);
                jNumeroEjemplo7.setText(".mp4 los otros dos seran borrados.");
                jNumeroEjemplo8.setVisible(false);
                // Oculta los componentes relacionados con "Quitar número"
                jInstrucciones.setVisible(false);
                //quitar numero
                jNumerosPregunta.setVisible(false);
                jNumerosText.setVisible(false);
                jNumerosGuion.setVisible(false);
                //cambiar de lugar
                jNumerosPregunta1.setVisible(false);
                jCambiarSi.setVisible(false);
                jNumerosPregunta2.setVisible(false);
                jCambiarSi1.setVisible(false);
                jCambiarNo1.setVisible(false);
                //En vivo
                jNumerosPregunta3.setVisible(false);
                jCambiarSi2.setVisible(false);
            } else {
                // Otra opción (puedes manejarla aquí si es necesario)
            }
    }                                                                                 

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String opcionSeleccionada = (String) jComboBox1.getSelectedItem();

        if ("Quitar numero".equals(opcionSeleccionada)) {
            // Obtén el valor del JTextField jNumerosText
            String catNumeroTexto = jNumerosText.getText();
    
            if (catNumeroTexto.isEmpty()) {
                // Si el JTextField está vacío, muestra un mensaje de error
                jTextArea2.setText("Por favor, ingrese un número en el campo 'Cuantos Números'");
            } else {
                try {
                    // Intenta convertir el texto a un número
                    catNumero = Integer.parseInt(catNumeroTexto);
    
                    // Verifica si el checkbox está seleccionado
                    boolean quitarGuion = jNumerosGuion.isSelected();
    
                    // Limpiar el ArrayList de nuevos nombres
                    nuevosNombres.clear();
    
                    // Itera sobre los nombres de archivos y realiza las modificaciones
                    for (String nombreArchivo : nombreArchivos) {
                        String nuevoNombre = nombreArchivo;
    
                        // Verifica si hay suficientes caracteres para eliminar
                        if (catNumero < nuevoNombre.length()) {
                            nuevoNombre = nuevoNombre.substring(catNumero);
                            // Verifica si el checkbox está seleccionado y hay guión
                            if (quitarGuion && nuevoNombre.contains("-")) {
                                nuevoNombre = nuevoNombre.substring(nuevoNombre.indexOf("-") + 1).trim();
                            }
                        } else {
                            // Si el número es mayor o igual a la longitud del nombre, elimina el nombre
                            nuevoNombre = "";
                        }
    
                        // Agrega el nuevo nombre al ArrayList de nuevos nombres
                        nuevosNombres.add(nuevoNombre);
                    }
    
                    // Actualiza el contenido del JTextArea con los nuevos nombres
                    actualizarJTextArea1();
    
                } catch (NumberFormatException e) {
                    // Si no se puede convertir el texto a número, muestra un mensaje de error
                    jTextArea2.setText("Por favor, ingrese un número válido en el campo 'Cuantos Números'");
                }
            }
        } else {
            // Otra opción (puedes manejarla aquí si es necesario)
        }
    }

    private void actualizarJTextArea1() {
        jTextArea1.setText(""); // Limpiar el JTextArea
    
        // Agrega los nuevos nombres al JTextArea y renombra los archivos
        File selectedDirectory = new File(directoryPath);
        File[] files = selectedDirectory.listFiles();
        
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                if (file.isFile()) {
                    String nuevoNombre = nuevosNombres.get(i);
                    if (!nuevoNombre.isEmpty()) {
                        jTextArea1.append("\u251C  "+nuevoNombre + "\n");
                        // Renombrar el archivo en el sistema de archivos
                        String nuevoPath = selectedDirectory.getAbsolutePath() + File.separator + nuevoNombre;
                        file.renameTo(new File(nuevoPath));
                    }
                }
            }
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSoft().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCambiarNo1;
    private javax.swing.JCheckBox jCambiarSi;
    private javax.swing.JCheckBox jCambiarSi1;
    private javax.swing.JCheckBox jCambiarSi2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jEjemplo;
    private javax.swing.JLabel jInstrucciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNumeroEjemplo1;
    private javax.swing.JLabel jNumeroEjemplo2;
    private javax.swing.JLabel jNumeroEjemplo3;
    private javax.swing.JLabel jNumeroEjemplo4;
    private javax.swing.JLabel jNumeroEjemplo5;
    private javax.swing.JLabel jNumeroEjemplo6;
    private javax.swing.JLabel jNumeroEjemplo7;
    private javax.swing.JLabel jNumeroEjemplo8;
    private javax.swing.JCheckBox jNumerosGuion;
    private javax.swing.JLabel jNumerosPregunta;
    private javax.swing.JLabel jNumerosPregunta1;
    private javax.swing.JLabel jNumerosPregunta2;
    private javax.swing.JLabel jNumerosPregunta3;
    private javax.swing.JTextField jNumerosText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration                   
}