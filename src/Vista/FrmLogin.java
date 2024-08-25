
package Vista;
import Modelo.EncriptarPassword;
import Modelo.LoginDao;
import Modelo.login;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class FrmLogin extends javax.swing.JFrame {
    // Instancia de la clase `login`, que representa al usuario que intenta iniciar sesión.
    login lg = new login();
    // Instancia de la clase `LoginDao`, que gestiona las operaciones de acceso a datos para el login.
    LoginDao login = new LoginDao();
    // Timer para controlar el progreso de la barra durante la validación de las credenciales.
    private Timer tiempo;
    // Contador para el progreso de la barra.
    int contador;
    // Tiempo en segundos para el progreso de la barra.
    int segundos = 30;
    
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null); // Centra la ventana en la pantalla.
        //this.setExtendedState(FrmLogin.MAXIMIZED_BOTH);//comenzar al maximo
        // Configuración de inicio: establece un correo y contraseña predeterminados.
        txtCorreo.setText("cristian@gmail.com");
        txtPass.setText("cristianonelover1");
        // Oculta la barra de progreso al inicio.
        barra.setVisible(false);
    
    }
     // Clase interna para manejar el progreso de la barra cuando se validan las credenciales.
    public class BarraProgreso implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
             contador++;  // Incrementa el contador.
            barra.setValue(contador);  // Actualiza el valor de la barra de progreso.
            // Si el progreso llega al 100%, detiene el Timer y abre el sistema principal.
            if (contador == 100) {
                tiempo.stop();
                if (barra.getValue() == 100) {
                    Sistema sis = new Sistema(lg);
                    sis.setVisible(true);  // Muestra la ventana del sistema.
                    dispose();  // Cierra la ventana de login.
                }
            }
        }
    }
    // Método para validar las credenciales ingresadas por el usuario.
  public void validar(){
    String correo = txtCorreo.getText();  // Obtiene el correo ingresado.
    String pass = String.valueOf(txtPass.getPassword());  // Obtiene la contraseña ingresada.
    
    // Verifica que los campos de correo y contraseña no estén vacíos.
    if (!"".equals(correo) || !"".equals(pass)) {
        // Encripta la contraseña antes de validar.
        String passEncriptada = EncriptarPassword.encriptarContraseña(pass);
        
        // Llama al método log() de LoginDao para validar las credenciales.
        lg = login.log(correo, passEncriptada);
        
        // Si las credenciales son correctas, muestra la barra de progreso.
        if (lg.getCorreo() != null && lg.getPass() != null) {
            barra.setVisible(true);  // Muestra la barra de progreso.
            contador = -1;  // Reinicia el contador.
            barra.setValue(0);  // Reinicia la barra de progreso.
            barra.setStringPainted(true);  // Muestra el valor en la barra.
            tiempo = new Timer(segundos, new BarraProgreso());  // Configura el Timer para la barra.
            tiempo.start();  // Inicia el Timer.
        } else {
            // Muestra un mensaje de error si las credenciales son incorrectas.
            JOptionPane.showMessageDialog(null, "Correo o la Contraseña incorrecta");
        }
    }
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnInicioSesion = new javax.swing.JButton();
        barra = new javax.swing.JProgressBar();
        btnSalir = new javax.swing.JButton();
        btnManual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(19, 23, 26));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(49, 54, 58));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/309978705_489581779852517_5421825225213162794_n-removebg-preview.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("\"Unimos a las familias con el sabor autentico de nuestras pizzas artesanales, ");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 147, 21));
        jLabel6.setText("USUARIO");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("hechas con ingredientes frescos y amor en cada bocado.\"");

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 147, 21));
        jLabel8.setText("CONTRASEÑA");

        txtCorreo.setBackground(new java.awt.Color(119, 119, 119));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 147, 21), 2));
        txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPass.setBackground(new java.awt.Color(119, 119, 119));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 147, 21), 2));

        btnInicioSesion.setBackground(new java.awt.Color(19, 23, 26));
        btnInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btn_Login (2).png"))); // NOI18N
        btnInicioSesion.setBorder(null);
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.setForeground(new java.awt.Color(1, 202, 2));

        btnSalir.setBackground(new java.awt.Color(19, 23, 26));
        btnSalir.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setIconTextGap(-20);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnManual.setBackground(new java.awt.Color(49, 54, 58));
        btnManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf_2.png"))); // NOI18N
        btnManual.setBorder(null);
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VER MANUAL:");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(172, 172, 172))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(243, 243, 243))))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGap(336, 336, 336)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnManual)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnManual)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(40, 40, 40))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1770, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        validar(); 
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         System.exit(0); //salir del sistema
    }//GEN-LAST:event_btnSalirActionPerformed

private void descargarPDF() {
    // Ruta del archivo PDF en el directorio de clases
    String pdfPath = "/Manual/Manual de Instrucciones de Software.pdf";
    // Ruta de la carpeta de Descargas del usuario
    String destinoPath = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Manual de Instrucciones de Software.pdf";
    
    try {
        // Obtiene el recurso como un InputStream
        InputStream sourceStream = getClass().getResourceAsStream(pdfPath);
        if (sourceStream == null) {
            throw new FileNotFoundException("El archivo no se encuentra en la ruta especificada: " + pdfPath);
        }
        Path destinationPath = new File(destinoPath).toPath();

        // Copia el archivo desde el InputStream al destino
        Files.copy(sourceStream, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        sourceStream.close();

        // Abre el archivo PDF después de descargarlo
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(destinationPath.toFile());
        } else {
            JOptionPane.showMessageDialog(this, "No se puede abrir el archivo automáticamente en este sistema.");
        }

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error al descargar el archivo: " + ex.getMessage());
    }
}

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
    
        descargarPDF();
        
    }//GEN-LAST:event_btnManualActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnManual;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
