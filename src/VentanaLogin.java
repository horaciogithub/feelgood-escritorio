
import java.applet.AudioClip;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Horacio Ramírez
 */
public class VentanaLogin extends javax.swing.JFrame {

    public Entrenador entrenador;
    public Nutricionista nutricionista;
    public Cliente cliente;

    private boolean validarEmail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher validar = pattern.matcher(email);

        if (validar.find() == true) {
            return true;
        }
        return false;
    }

    /**
     * Creates new form VentanaLogin
     */
    public VentanaLogin() throws SQLException {

        initComponents();

        // entrenador.setVisible(false);
        // nutricionista.setVisible(false);
        this.setLocationRelativeTo(null);//Centrar Ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasword = new javax.swing.JLabel();
        jbEntrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jtContraseña = new javax.swing.JPasswordField();
        jlErrorEmail = new javax.swing.JLabel();
        jErrorContraseña = new javax.swing.JLabel();
        jPanelImage = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 184, 115));
        jLabel1.setText("INICIO DE SESIÓN");

        jtEmail.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });
        jtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEmailKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man-user.png"))); // NOI18N
        jLabel2.setText("EMAIL : ");

        jPasword.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jPasword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlock.png"))); // NOI18N
        jPasword.setText("CONTRASEÑA : ");

        jbEntrar.setBackground(new java.awt.Color(41, 184, 115));
        jbEntrar.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jbEntrar.setForeground(new java.awt.Color(51, 51, 51));
        jbEntrar.setText("Aceptar");
        jbEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEntrarMouseClicked(evt);
            }
        });
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jbCancelar.setBackground(new java.awt.Color(41, 184, 115));
        jbCancelar.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(51, 51, 51));
        jbCancelar.setText("Borrar");
        jbCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCancelarMouseClicked(evt);
            }
        });
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jtContraseña.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtContraseñaActionPerformed(evt);
            }
        });
        jtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtContraseñaKeyTyped(evt);
            }
        });

        jlErrorEmail.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jlErrorEmail.setForeground(new java.awt.Color(204, 51, 0));

        jErrorContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jErrorContraseña.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jErrorContraseña.setForeground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlErrorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPasword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jErrorContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbEntrar)
                                .addGap(18, 18, 18)
                                .addComponent(jbCancelar)))))
                .addGap(254, 254, 254))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlErrorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasword)
                    .addComponent(jtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jErrorContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbEntrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelImage.setBackground(new java.awt.Color(255, 255, 255));
        jPanelImage.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(41, 184, 115), new java.awt.Color(41, 184, 115)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feelgood.png"))); // NOI18N

        javax.swing.GroupLayout jPanelImageLayout = new javax.swing.GroupLayout(jPanelImage);
        jPanelImage.setLayout(jPanelImageLayout);
        jPanelImageLayout.setHorizontalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelImageLayout.setVerticalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImageLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(42, 42, 42))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(null);

        jRegistrarse.setBackground(new java.awt.Color(41, 184, 115));
        jRegistrarse.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jRegistrarse.setForeground(new java.awt.Color(51, 51, 51));
        jRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-user-button.png"))); // NOI18N
        jRegistrarse.setText("REGISTRARSE");
        jRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegistrarseMouseClicked(evt);
            }
        });
        jRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jRegistrarse)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        jtEmail.setText("");
        jtContraseña.setText("");
        jlErrorEmail.setText("");
        jErrorContraseña.setText("");
    }//GEN-LAST:event_jbCancelarActionPerformed
    // ========
    //  LOGIN
    // ========
    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        // TODO add your handling code here:
        String email = jtEmail.getText();

        if (validarEmail(email) == false) {
            jlErrorEmail.setText("Email no válido");
        } else {
            jlErrorEmail.setText("");
        }
        String contraseña = jtContraseña.getText();

        Conexion conexion = new Conexion();
        Connection conectar = conexion.conectar();

        String SQL = "SELECT * FROM usuario_registrado WHERE email = '" + email + "' AND contrasena = '" + contraseña + "'";
        try {
            Statement consulta = conexion.getConexion().createStatement();
            ResultSet cantidad = consulta.executeQuery(SQL);
            cantidad.last();// Obtengo el ultimo resultado 
            int filas = cantidad.getRow();// obtengo la cantidad de resultados del la ultima ocurrencia

            ResultSet listado = consulta.executeQuery(SQL);

            if (filas > 0) {

                jErrorContraseña.setText("");

                while (listado.next()) {
                    String emailDB = listado.getString("email");
                    String nombreDB = listado.getString("NOMBRE");
                    String apellidosDB = listado.getString("apellidos");

                    if (listado.getString("tipo").equals("entrenador")) {
                        //Crea ventana entrenador
                        this.entrenador = new Entrenador();

                        char sexo = nombreDB.charAt(nombreDB.length() - 1);
                        if (sexo == 'a') {
                            entrenador.jlMensaje.setText("Bienvenida, " + nombreDB + " " + apellidosDB);
                        } else {
                            entrenador.jlMensaje.setText("Bienvenido, " + nombreDB + " " + apellidosDB);
                        }

                        this.entrenador.setVisible(true);
                        this.setVisible(false);
                    }
                    if (listado.getString("tipo").equals("nutricionista")) {
                        //Crea ventana entrenador
                        this.nutricionista = new Nutricionista();

                        char sexo = nombreDB.charAt(nombreDB.length() - 1);
                        if (sexo == 'a') {
                            nutricionista.jlMensaje.setText("Bienvenida, " + nombreDB + " " + apellidosDB);
                        } else {
                            nutricionista.jlMensaje.setText("Bienvenido, " + nombreDB + " " + apellidosDB);
                        }

                        this.nutricionista.setVisible(true);
                        this.setVisible(false);
                    }
                    if (listado.getString("tipo").equals("cliente")) {
                        //Crea ventana cliente
                        this.cliente = new Cliente();

                        char sexo = nombreDB.charAt(nombreDB.length() - 1);
                        if (sexo == 'a') {
                            cliente.jlMensaje.setText("Bienvenida, " + nombreDB + " " + apellidosDB);
                        } else {
                            cliente.jlMensaje.setText("Bienvenido, " + nombreDB + " " + apellidosDB);
                        }

                        Icon icon = new ImageIcon(getClass().getResource("/images/open-padlock-silhouette.png"));

                        // Desbloquear candado
                        this.jPasword.setIcon(icon);

                        this.cliente.setVisible(true);
                        this.setVisible(false);
                    }
                }
            } else {
                jErrorContraseña.setText("Email y/o contraseña equivocados");
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistrarseActionPerformed

        new FormularioRegistro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jRegistrarseActionPerformed

    private void jtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtContraseñaActionPerformed

    private void jtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEmailKeyTyped

        if (jtEmail.getText().length() >= 40) {
            evt.consume();
            jlErrorEmail.setText("Máximo 40 caracteres");
        } else {
            jlErrorEmail.setText("");
        }
    }//GEN-LAST:event_jtEmailKeyTyped

    private void jtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtContraseñaKeyTyped

        if (jtContraseña.getSelectionEnd() >= 255) {
            evt.consume();
            jErrorContraseña.setText("Máximo 255 caracteres");
        } else {
            jErrorContraseña.setText("");
        }
    }//GEN-LAST:event_jtContraseñaKeyTyped

    private void jRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegistrarseMouseClicked
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sounds/btnSound.wav"));
        sonido.play();
    }//GEN-LAST:event_jRegistrarseMouseClicked

    private void jbEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEntrarMouseClicked
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sounds/btnSound.wav"));
        sonido.play();
    }//GEN-LAST:event_jbEntrarMouseClicked

    private void jbCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseClicked
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sounds/btnSound.wav"));
        sonido.play();
    }//GEN-LAST:event_jbCancelarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaLogin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jErrorContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JLabel jPasword;
    private javax.swing.JButton jRegistrarse;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JLabel jlErrorEmail;
    private javax.swing.JPasswordField jtContraseña;
    public static javax.swing.JTextField jtEmail;
    // End of variables declaration//GEN-END:variables
}