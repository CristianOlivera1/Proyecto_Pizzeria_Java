
package com.mycompany.proypizzeria;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class JPanelStock extends javax.swing.JPanel {

    public JPanelStock() {
        initComponents();
    }
   private void ShowPanel(JPanel p){
        p.setSize(1122, 710);
        p.setLocation(0, 0);
        //remover el panel padre para reemplazarlo por el nuevo JPANEL
        panelHijoStock.removeAll();
        panelHijoStock.add(p, BorderLayout.CENTER); //agregar el nuevo jpanel llamado p
        panelHijoStock.revalidate();
        panelHijoStock.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHijoStock = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRetrocederStock = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHijoStock.setBackground(new java.awt.Color(66, 71, 74));

        jTable1.setBackground(new java.awt.Color(66, 71, 74));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pizzas", "ID", "Fecha", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 147, 21));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-stock-20_1.png"))); // NOI18N
        jLabel2.setText("STOCK");

        jSeparator1.setBackground(new java.awt.Color(119, 119, 119));
        jSeparator1.setForeground(new java.awt.Color(137, 128, 126));

        btnRetrocederStock.setBackground(new java.awt.Color(66, 71, 74));
        btnRetrocederStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/retroceder.png"))); // NOI18N
        btnRetrocederStock.setBorder(null);
        btnRetrocederStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHijoStockLayout = new javax.swing.GroupLayout(panelHijoStock);
        panelHijoStock.setLayout(panelHijoStockLayout);
        panelHijoStockLayout.setHorizontalGroup(
            panelHijoStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHijoStockLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelHijoStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHijoStockLayout.createSequentialGroup()
                        .addComponent(btnRetrocederStock)
                        .addGap(18, 18, 18)
                        .addGroup(panelHijoStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelHijoStockLayout.setVerticalGroup(
            panelHijoStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHijoStockLayout.createSequentialGroup()
                .addGroup(panelHijoStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHijoStockLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnRetrocederStock)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHijoStockLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        add(panelHijoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederStockActionPerformed
        // TODO add your handling code here:
       JPanelInicio ini =new JPanelInicio();
        ShowPanel(ini);
    }//GEN-LAST:event_btnRetrocederStockActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetrocederStock;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelHijoStock;
    // End of variables declaration//GEN-END:variables
}
