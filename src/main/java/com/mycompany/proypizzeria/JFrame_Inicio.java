
package com.mycompany.proypizzeria;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class JFrame_Inicio extends javax.swing.JFrame {

   JPanelInicio panelPrincipal =new JPanelInicio();
   JPanelStock stock =new JPanelStock();
   JFrame_Login login= new JFrame_Login();
   JPanelHistorial historial = new JPanelHistorial();
    public JFrame_Inicio() {
        initComponents();
        this.setLocationRelativeTo(null); //comenzar en el centro
        this.setExtendedState(JFrame_Inicio.MAXIMIZED_BOTH);//comenzar al maximo
  
        ShowPanel(panelPrincipal);//mostrar el JPanelInicio por defecto
        
        //personalizar el fondo de los lblBtn`s como un boton
        lblBtnInicio.setOpaque(true);
        lblBtnInicio.setBackground(new Color(33,36,41));
        
        lblBtnProducto.setOpaque(true);
        lblBtnProducto.setBackground(new Color(33,36,41));
        
        lblBtnStock.setOpaque(true);
        lblBtnStock.setBackground(new Color(33,36,41));
        
        lblBtnHistorial.setOpaque(true);
        lblBtnHistorial.setBackground(new Color(33,36,41));
        
        lblBtnCerrar.setOpaque(true);
        lblBtnCerrar.setBackground(new Color(33,36,41));

        lblBtnProducto.setEnabled(false);
        
    }

private void ShowPanel(JPanel p){
        p.setSize(1122, 710);
        p.setLocation(0, 0);
        //remover el panel padre para reemplazarlo por el nuevo JPANEL
        PanelPadre.removeAll();
        PanelPadre.add(p, BorderLayout.CENTER); //agregar el nuevo jpanel llamado p
        PanelPadre.revalidate();
        PanelPadre.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelPadre = new javax.swing.JPanel();
        lblBtnInicio = new javax.swing.JLabel();
        lblBtnCerrar = new javax.swing.JLabel();
        lblBtnProducto = new javax.swing.JLabel();
        lblBtnStock = new javax.swing.JLabel();
        lblBtnHistorial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 36, 41));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio_logo_adriana.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        PanelPadre.setBackground(new java.awt.Color(66, 71, 74));
        PanelPadre.setPreferredSize(new java.awt.Dimension(1270, 710));

        javax.swing.GroupLayout PanelPadreLayout = new javax.swing.GroupLayout(PanelPadre);
        PanelPadre.setLayout(PanelPadreLayout);
        PanelPadreLayout.setHorizontalGroup(
            PanelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1122, Short.MAX_VALUE)
        );
        PanelPadreLayout.setVerticalGroup(
            PanelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );

        lblBtnInicio.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblBtnInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-item-casa-30.png"))); // NOI18N
        lblBtnInicio.setText("                                 INICIO");
        lblBtnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnInicio.setIconTextGap(10);
        lblBtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnInicioMouseExited(evt);
            }
        });

        lblBtnCerrar.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblBtnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        lblBtnCerrar.setText("                               CERRAR SESIÓN");
        lblBtnCerrar.setFocusable(false);
        lblBtnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnCerrar.setIconTextGap(10);
        lblBtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseExited(evt);
            }
        });

        lblBtnProducto.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblBtnProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-producto item2.png"))); // NOI18N
        lblBtnProducto.setText("                                 PRODUCTOS");
        lblBtnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnProducto.setIconTextGap(10);
        lblBtnProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnProductoMouseExited(evt);
            }
        });

        lblBtnStock.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblBtnStock.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-stock.png"))); // NOI18N
        lblBtnStock.setText("                                 STOCK ");
        lblBtnStock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnStock.setIconTextGap(10);
        lblBtnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnStockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnStockMouseExited(evt);
            }
        });

        lblBtnHistorial.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblBtnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-historial-30.png"))); // NOI18N
        lblBtnHistorial.setText("                                HISTORIAL");
        lblBtnHistorial.setFocusable(false);
        lblBtnHistorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBtnHistorial.setIconTextGap(10);
        lblBtnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnHistorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnHistorialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblBtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblBtnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBtnHistorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBtnStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(PanelPadre, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblBtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblBtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblBtnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lblBtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblBtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addComponent(PanelPadre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //evento para el label que muestre el JPanelInicio
    private void lblBtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnInicioMouseClicked
         lblBtnInicio.setBackground(new Color(109,109,109)); //cambiar el fondo al darle click
         lblBtnInicio.setForeground(new Color(254,147,21));//cambia el color de las letras a amarillo al darle click
         //los demas se cambian a blancos
         lblBtnProducto.setForeground(Color.WHITE);
         lblBtnStock.setForeground(Color.WHITE);
         lblBtnHistorial.setForeground(Color.WHITE);
         lblBtnCerrar.setForeground(Color.WHITE);
         ShowPanel(panelPrincipal); //muestra el JPanelInicio
    }//GEN-LAST:event_lblBtnInicioMouseClicked
    //evento para cambiar el fondo del lbl al pasar el cursor encima 
    private void lblBtnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnInicioMouseEntered

        lblBtnInicio.setBackground(new Color(66,71,74));//cambia el fondo del label
        
    }//GEN-LAST:event_lblBtnInicioMouseEntered
    //evento para cambiar el fondo del lbl al sacar el cursor
    private void lblBtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnInicioMouseExited
       
        lblBtnInicio.setBackground(new Color(33,36,41)); // se devuelde al color icial al salir el cursor del label
    }//GEN-LAST:event_lblBtnInicioMouseExited

    private void lblBtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseClicked
     
        this.dispose(); //cerramos el Jpanel actual para mostrar el Login
        login.setVisible(true); //se muestra el login
    }//GEN-LAST:event_lblBtnCerrarMouseClicked

    private void lblBtnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseEntered
       lblBtnCerrar.setBackground(new Color(66,71,74));
    }//GEN-LAST:event_lblBtnCerrarMouseEntered

    private void lblBtnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseExited
    
         lblBtnCerrar.setBackground(new Color(33,36,41));
    }//GEN-LAST:event_lblBtnCerrarMouseExited

    private void lblBtnProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnProductoMouseClicked
      
    }//GEN-LAST:event_lblBtnProductoMouseClicked

    private void lblBtnProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnProductoMouseEntered
        lblBtnProducto.setBackground(new Color(66,71,74));
    }//GEN-LAST:event_lblBtnProductoMouseEntered

    private void lblBtnProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnProductoMouseExited
     
         lblBtnProducto.setBackground(new Color(33,36,41));
    }//GEN-LAST:event_lblBtnProductoMouseExited

    private void lblBtnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnStockMouseClicked
         lblBtnStock.setBackground(new Color(109,109,109)); 
         lblBtnStock.setForeground(new Color(254,147,21));
         
         lblBtnInicio.setForeground(Color.WHITE);
         lblBtnProducto.setForeground(Color.WHITE);
         lblBtnHistorial.setForeground(Color.WHITE);
         lblBtnCerrar.setForeground(Color.WHITE);
         
        ShowPanel(stock);
    }//GEN-LAST:event_lblBtnStockMouseClicked

    private void lblBtnStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnStockMouseEntered
        lblBtnStock.setBackground(new Color(66,71,74));
    }//GEN-LAST:event_lblBtnStockMouseEntered

    private void lblBtnStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnStockMouseExited
      
         lblBtnStock.setBackground(new Color(33,36,41));
    }//GEN-LAST:event_lblBtnStockMouseExited

    private void lblBtnHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnHistorialMouseClicked
         lblBtnHistorial.setBackground(new Color(109,109,109)); //cambiar el fondo al darle click
         lblBtnHistorial.setForeground(new Color(254,147,21));//cambia el color de las letras a amarillo al darle click
         //los demas se cambian a blancos
         lblBtnInicio.setForeground(Color.WHITE);
         lblBtnProducto.setForeground(Color.WHITE);
         lblBtnStock.setForeground(Color.WHITE);
         lblBtnCerrar.setForeground(Color.WHITE);
        
        ShowPanel(historial);
    }//GEN-LAST:event_lblBtnHistorialMouseClicked

    private void lblBtnHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnHistorialMouseEntered
       lblBtnHistorial.setBackground(new Color(66,71,74));
    }//GEN-LAST:event_lblBtnHistorialMouseEntered

    private void lblBtnHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnHistorialMouseExited
       
         lblBtnHistorial.setBackground(new Color(33,36,41));
    }//GEN-LAST:event_lblBtnHistorialMouseExited

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
            java.util.logging.Logger.getLogger(JFrame_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPadre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBtnCerrar;
    private javax.swing.JLabel lblBtnHistorial;
    private javax.swing.JLabel lblBtnInicio;
    private javax.swing.JLabel lblBtnProducto;
    private javax.swing.JLabel lblBtnStock;
    // End of variables declaration//GEN-END:variables
}
