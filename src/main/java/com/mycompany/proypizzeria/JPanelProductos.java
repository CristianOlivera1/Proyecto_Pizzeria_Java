
package com.mycompany.proypizzeria;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class JPanelProductos extends javax.swing.JPanel {

   
    public JPanelProductos() {
        initComponents();
        jTabbedPane2.setSize(1020,1013);
    }
 private void ShowPanel(JPanel p){
        p.setSize(1122, 710);
        p.setLocation(0, 0);
        //remover el panel padre para reemplazarlo por el nuevo JPANEL
        panelProductos.removeAll();
        panelProductos.add(p, BorderLayout.CENTER); //agregar el nuevo jpanel llamado p
        panelProductos.revalidate();
        panelProductos.repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProductos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        panelRound51 = new PanelPersonalizado.PanelRound();
        panelRound65 = new PanelPersonalizado.PanelRound();
        jLabel168 = new javax.swing.JLabel();
        jSeparator135 = new javax.swing.JSeparator();
        jLabel399 = new javax.swing.JLabel();
        jLabel400 = new javax.swing.JLabel();
        jButton142 = new javax.swing.JButton();
        panelRound137 = new PanelPersonalizado.PanelRound();
        jLabel169 = new javax.swing.JLabel();
        jSeparator136 = new javax.swing.JSeparator();
        jLabel401 = new javax.swing.JLabel();
        jLabel402 = new javax.swing.JLabel();
        jButton162 = new javax.swing.JButton();
        panelRound138 = new PanelPersonalizado.PanelRound();
        jLabel170 = new javax.swing.JLabel();
        jSeparator137 = new javax.swing.JSeparator();
        jLabel403 = new javax.swing.JLabel();
        jLabel404 = new javax.swing.JLabel();
        jButton171 = new javax.swing.JButton();
        panelRound139 = new PanelPersonalizado.PanelRound();
        jLabel405 = new javax.swing.JLabel();
        jSeparator138 = new javax.swing.JSeparator();
        jLabel406 = new javax.swing.JLabel();
        jLabel407 = new javax.swing.JLabel();
        jButton161 = new javax.swing.JButton();
        panelRound140 = new PanelPersonalizado.PanelRound();
        jLabel408 = new javax.swing.JLabel();
        jSeparator139 = new javax.swing.JSeparator();
        jLabel409 = new javax.swing.JLabel();
        jLabel410 = new javax.swing.JLabel();
        jButton163 = new javax.swing.JButton();
        panelRound141 = new PanelPersonalizado.PanelRound();
        jLabel411 = new javax.swing.JLabel();
        jSeparator140 = new javax.swing.JSeparator();
        jLabel412 = new javax.swing.JLabel();
        jLabel413 = new javax.swing.JLabel();
        jButton164 = new javax.swing.JButton();
        panelRound142 = new PanelPersonalizado.PanelRound();
        jLabel414 = new javax.swing.JLabel();
        jSeparator141 = new javax.swing.JSeparator();
        jLabel415 = new javax.swing.JLabel();
        jLabel416 = new javax.swing.JLabel();
        jButton165 = new javax.swing.JButton();
        panelRound143 = new PanelPersonalizado.PanelRound();
        jLabel417 = new javax.swing.JLabel();
        jSeparator142 = new javax.swing.JSeparator();
        jLabel418 = new javax.swing.JLabel();
        jLabel419 = new javax.swing.JLabel();
        jButton173 = new javax.swing.JButton();
        panelRound144 = new PanelPersonalizado.PanelRound();
        jLabel420 = new javax.swing.JLabel();
        jSeparator143 = new javax.swing.JSeparator();
        jLabel421 = new javax.swing.JLabel();
        jLabel422 = new javax.swing.JLabel();
        jButton172 = new javax.swing.JButton();
        panelRound145 = new PanelPersonalizado.PanelRound();
        jLabel423 = new javax.swing.JLabel();
        jSeparator144 = new javax.swing.JSeparator();
        jLabel424 = new javax.swing.JLabel();
        jLabel425 = new javax.swing.JLabel();
        jButton167 = new javax.swing.JButton();
        panelRound146 = new PanelPersonalizado.PanelRound();
        jLabel426 = new javax.swing.JLabel();
        jSeparator145 = new javax.swing.JSeparator();
        jLabel427 = new javax.swing.JLabel();
        jLabel428 = new javax.swing.JLabel();
        jButton170 = new javax.swing.JButton();
        panelRound147 = new PanelPersonalizado.PanelRound();
        jLabel429 = new javax.swing.JLabel();
        jSeparator164 = new javax.swing.JSeparator();
        jLabel430 = new javax.swing.JLabel();
        jLabel431 = new javax.swing.JLabel();
        jButton166 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        panelRound53 = new PanelPersonalizado.PanelRound();
        panelRound67 = new PanelPersonalizado.PanelRound();
        jLabel174 = new javax.swing.JLabel();
        jSeparator157 = new javax.swing.JSeparator();
        jLabel465 = new javax.swing.JLabel();
        jLabel466 = new javax.swing.JLabel();
        jButton143 = new javax.swing.JButton();
        panelRound159 = new PanelPersonalizado.PanelRound();
        jLabel175 = new javax.swing.JLabel();
        jSeparator158 = new javax.swing.JSeparator();
        jLabel467 = new javax.swing.JLabel();
        jLabel468 = new javax.swing.JLabel();
        jButton168 = new javax.swing.JButton();
        panelRound160 = new PanelPersonalizado.PanelRound();
        jLabel176 = new javax.swing.JLabel();
        jSeparator159 = new javax.swing.JSeparator();
        jLabel469 = new javax.swing.JLabel();
        jLabel470 = new javax.swing.JLabel();
        jButton174 = new javax.swing.JButton();
        panelRound161 = new PanelPersonalizado.PanelRound();
        jLabel471 = new javax.swing.JLabel();
        jSeparator160 = new javax.swing.JSeparator();
        jLabel472 = new javax.swing.JLabel();
        jLabel473 = new javax.swing.JLabel();
        jButton181 = new javax.swing.JButton();
        panelRound162 = new PanelPersonalizado.PanelRound();
        jLabel474 = new javax.swing.JLabel();
        jSeparator161 = new javax.swing.JSeparator();
        jLabel475 = new javax.swing.JLabel();
        jLabel476 = new javax.swing.JLabel();
        jButton200 = new javax.swing.JButton();
        panelRound163 = new PanelPersonalizado.PanelRound();
        jLabel477 = new javax.swing.JLabel();
        jSeparator162 = new javax.swing.JSeparator();
        jLabel478 = new javax.swing.JLabel();
        jLabel479 = new javax.swing.JLabel();
        jButton210 = new javax.swing.JButton();
        panelRound164 = new PanelPersonalizado.PanelRound();
        jLabel480 = new javax.swing.JLabel();
        jSeparator163 = new javax.swing.JSeparator();
        jLabel481 = new javax.swing.JLabel();
        jLabel482 = new javax.swing.JLabel();
        jButton211 = new javax.swing.JButton();
        panelRound165 = new PanelPersonalizado.PanelRound();
        jLabel483 = new javax.swing.JLabel();
        jSeparator166 = new javax.swing.JSeparator();
        jLabel484 = new javax.swing.JLabel();
        jLabel485 = new javax.swing.JLabel();
        jButton212 = new javax.swing.JButton();
        panelRound166 = new PanelPersonalizado.PanelRound();
        jLabel486 = new javax.swing.JLabel();
        jSeparator167 = new javax.swing.JSeparator();
        jLabel487 = new javax.swing.JLabel();
        jLabel488 = new javax.swing.JLabel();
        jButton213 = new javax.swing.JButton();
        panelRound167 = new PanelPersonalizado.PanelRound();
        jLabel489 = new javax.swing.JLabel();
        jSeparator168 = new javax.swing.JSeparator();
        jLabel490 = new javax.swing.JLabel();
        jLabel491 = new javax.swing.JLabel();
        jButton214 = new javax.swing.JButton();
        panelRound168 = new PanelPersonalizado.PanelRound();
        jLabel492 = new javax.swing.JLabel();
        jSeparator169 = new javax.swing.JSeparator();
        jLabel493 = new javax.swing.JLabel();
        jLabel494 = new javax.swing.JLabel();
        jButton215 = new javax.swing.JButton();
        panelRound169 = new PanelPersonalizado.PanelRound();
        jLabel495 = new javax.swing.JLabel();
        jSeparator170 = new javax.swing.JSeparator();
        jLabel496 = new javax.swing.JLabel();
        jLabel497 = new javax.swing.JLabel();
        jButton216 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelRound57 = new PanelPersonalizado.PanelRound();
        panelRound70 = new PanelPersonalizado.PanelRound();
        jLabel183 = new javax.swing.JLabel();
        jSeparator177 = new javax.swing.JSeparator();
        jLabel509 = new javax.swing.JLabel();
        jLabel513 = new javax.swing.JLabel();
        jButton144 = new javax.swing.JButton();
        panelRound175 = new PanelPersonalizado.PanelRound();
        jLabel184 = new javax.swing.JLabel();
        jSeparator196 = new javax.swing.JSeparator();
        jLabel514 = new javax.swing.JLabel();
        jLabel515 = new javax.swing.JLabel();
        jButton217 = new javax.swing.JButton();
        panelRound193 = new PanelPersonalizado.PanelRound();
        jLabel185 = new javax.swing.JLabel();
        jSeparator206 = new javax.swing.JSeparator();
        jLabel518 = new javax.swing.JLabel();
        jLabel567 = new javax.swing.JLabel();
        jButton218 = new javax.swing.JButton();
        panelRound203 = new PanelPersonalizado.PanelRound();
        jLabel569 = new javax.swing.JLabel();
        jSeparator207 = new javax.swing.JSeparator();
        jLabel570 = new javax.swing.JLabel();
        jLabel572 = new javax.swing.JLabel();
        jButton219 = new javax.swing.JButton();
        panelRound204 = new PanelPersonalizado.PanelRound();
        jLabel575 = new javax.swing.JLabel();
        jSeparator208 = new javax.swing.JSeparator();
        jLabel579 = new javax.swing.JLabel();
        jLabel582 = new javax.swing.JLabel();
        jButton220 = new javax.swing.JButton();
        panelRound205 = new PanelPersonalizado.PanelRound();
        jLabel586 = new javax.swing.JLabel();
        jSeparator209 = new javax.swing.JSeparator();
        jLabel594 = new javax.swing.JLabel();
        jLabel612 = new javax.swing.JLabel();
        jButton221 = new javax.swing.JButton();
        panelRound206 = new PanelPersonalizado.PanelRound();
        jLabel618 = new javax.swing.JLabel();
        jSeparator210 = new javax.swing.JSeparator();
        jLabel619 = new javax.swing.JLabel();
        jLabel620 = new javax.swing.JLabel();
        jButton222 = new javax.swing.JButton();
        panelRound207 = new PanelPersonalizado.PanelRound();
        jLabel621 = new javax.swing.JLabel();
        jSeparator211 = new javax.swing.JSeparator();
        jLabel622 = new javax.swing.JLabel();
        jLabel623 = new javax.swing.JLabel();
        jButton223 = new javax.swing.JButton();
        panelRound208 = new PanelPersonalizado.PanelRound();
        jLabel624 = new javax.swing.JLabel();
        jSeparator212 = new javax.swing.JSeparator();
        jLabel625 = new javax.swing.JLabel();
        jLabel626 = new javax.swing.JLabel();
        jButton224 = new javax.swing.JButton();
        panelRound209 = new PanelPersonalizado.PanelRound();
        jLabel627 = new javax.swing.JLabel();
        jSeparator213 = new javax.swing.JSeparator();
        jLabel628 = new javax.swing.JLabel();
        jLabel629 = new javax.swing.JLabel();
        jButton225 = new javax.swing.JButton();
        panelRound210 = new PanelPersonalizado.PanelRound();
        jLabel630 = new javax.swing.JLabel();
        jSeparator214 = new javax.swing.JSeparator();
        jLabel631 = new javax.swing.JLabel();
        jLabel632 = new javax.swing.JLabel();
        jButton226 = new javax.swing.JButton();
        panelRound211 = new PanelPersonalizado.PanelRound();
        jLabel633 = new javax.swing.JLabel();
        jSeparator215 = new javax.swing.JSeparator();
        jLabel634 = new javax.swing.JLabel();
        jLabel635 = new javax.swing.JLabel();
        jButton227 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelRound54 = new PanelPersonalizado.PanelRound();
        panelRound172 = new PanelPersonalizado.PanelRound();
        jLabel504 = new javax.swing.JLabel();
        jSeparator174 = new javax.swing.JSeparator();
        jLabel505 = new javax.swing.JLabel();
        jLabel506 = new javax.swing.JLabel();
        jLabel564 = new javax.swing.JLabel();
        jButton231 = new javax.swing.JButton();
        panelRound192 = new PanelPersonalizado.PanelRound();
        jLabel565 = new javax.swing.JLabel();
        jSeparator195 = new javax.swing.JSeparator();
        jLabel566 = new javax.swing.JLabel();
        jLabel568 = new javax.swing.JLabel();
        jLabel613 = new javax.swing.JLabel();
        jButton230 = new javax.swing.JButton();
        panelRound194 = new PanelPersonalizado.PanelRound();
        jLabel573 = new javax.swing.JLabel();
        jSeparator197 = new javax.swing.JSeparator();
        jLabel574 = new javax.swing.JLabel();
        jLabel576 = new javax.swing.JLabel();
        jLabel616 = new javax.swing.JLabel();
        jButton233 = new javax.swing.JButton();
        panelRound173 = new PanelPersonalizado.PanelRound();
        jLabel507 = new javax.swing.JLabel();
        jSeparator175 = new javax.swing.JSeparator();
        jLabel508 = new javax.swing.JLabel();
        jLabel577 = new javax.swing.JLabel();
        jLabel611 = new javax.swing.JLabel();
        jButton234 = new javax.swing.JButton();
        panelRound174 = new PanelPersonalizado.PanelRound();
        jLabel510 = new javax.swing.JLabel();
        jSeparator176 = new javax.swing.JSeparator();
        jLabel511 = new javax.swing.JLabel();
        jLabel512 = new javax.swing.JLabel();
        jLabel578 = new javax.swing.JLabel();
        jButton239 = new javax.swing.JButton();
        panelRound195 = new PanelPersonalizado.PanelRound();
        jLabel580 = new javax.swing.JLabel();
        jSeparator198 = new javax.swing.JSeparator();
        jLabel581 = new javax.swing.JLabel();
        jLabel583 = new javax.swing.JLabel();
        jLabel617 = new javax.swing.JLabel();
        jButton238 = new javax.swing.JButton();
        panelRound196 = new PanelPersonalizado.PanelRound();
        jLabel584 = new javax.swing.JLabel();
        jSeparator199 = new javax.swing.JSeparator();
        jLabel585 = new javax.swing.JLabel();
        jLabel587 = new javax.swing.JLabel();
        jLabel571 = new javax.swing.JLabel();
        jButton235 = new javax.swing.JButton();
        panelRound197 = new PanelPersonalizado.PanelRound();
        jLabel588 = new javax.swing.JLabel();
        jSeparator200 = new javax.swing.JSeparator();
        jLabel589 = new javax.swing.JLabel();
        jLabel590 = new javax.swing.JLabel();
        jLabel591 = new javax.swing.JLabel();
        jButton229 = new javax.swing.JButton();
        panelRound198 = new PanelPersonalizado.PanelRound();
        jLabel592 = new javax.swing.JLabel();
        jSeparator201 = new javax.swing.JSeparator();
        jLabel593 = new javax.swing.JLabel();
        jLabel595 = new javax.swing.JLabel();
        jLabel602 = new javax.swing.JLabel();
        jButton236 = new javax.swing.JButton();
        panelRound199 = new PanelPersonalizado.PanelRound();
        jLabel596 = new javax.swing.JLabel();
        jSeparator202 = new javax.swing.JSeparator();
        jLabel597 = new javax.swing.JLabel();
        jLabel598 = new javax.swing.JLabel();
        jLabel599 = new javax.swing.JLabel();
        jButton228 = new javax.swing.JButton();
        panelRound200 = new PanelPersonalizado.PanelRound();
        jLabel600 = new javax.swing.JLabel();
        jSeparator203 = new javax.swing.JSeparator();
        jLabel601 = new javax.swing.JLabel();
        jLabel603 = new javax.swing.JLabel();
        jLabel614 = new javax.swing.JLabel();
        jButton232 = new javax.swing.JButton();
        panelRound176 = new PanelPersonalizado.PanelRound();
        jLabel516 = new javax.swing.JLabel();
        jSeparator178 = new javax.swing.JSeparator();
        jLabel517 = new javax.swing.JLabel();
        jLabel604 = new javax.swing.JLabel();
        jLabel615 = new javax.swing.JLabel();
        jButton237 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        panelRound55 = new PanelPersonalizado.PanelRound();
        panelRound69 = new PanelPersonalizado.PanelRound();
        jLabel180 = new javax.swing.JLabel();
        jSeparator183 = new javax.swing.JSeparator();
        jLabel531 = new javax.swing.JLabel();
        jLabel532 = new javax.swing.JLabel();
        jButton240 = new javax.swing.JButton();
        panelRound181 = new PanelPersonalizado.PanelRound();
        jLabel181 = new javax.swing.JLabel();
        jSeparator184 = new javax.swing.JSeparator();
        jLabel533 = new javax.swing.JLabel();
        jLabel534 = new javax.swing.JLabel();
        jButton242 = new javax.swing.JButton();
        panelRound182 = new PanelPersonalizado.PanelRound();
        jLabel182 = new javax.swing.JLabel();
        jSeparator185 = new javax.swing.JSeparator();
        jLabel535 = new javax.swing.JLabel();
        jLabel536 = new javax.swing.JLabel();
        jButton247 = new javax.swing.JButton();
        panelRound183 = new PanelPersonalizado.PanelRound();
        jLabel537 = new javax.swing.JLabel();
        jSeparator186 = new javax.swing.JSeparator();
        jLabel538 = new javax.swing.JLabel();
        jLabel539 = new javax.swing.JLabel();
        jButton243 = new javax.swing.JButton();
        panelRound184 = new PanelPersonalizado.PanelRound();
        jLabel540 = new javax.swing.JLabel();
        jSeparator187 = new javax.swing.JSeparator();
        jLabel541 = new javax.swing.JLabel();
        jLabel542 = new javax.swing.JLabel();
        jButton244 = new javax.swing.JButton();
        panelRound185 = new PanelPersonalizado.PanelRound();
        jLabel543 = new javax.swing.JLabel();
        jSeparator188 = new javax.swing.JSeparator();
        jLabel544 = new javax.swing.JLabel();
        jLabel545 = new javax.swing.JLabel();
        jButton241 = new javax.swing.JButton();
        panelRound186 = new PanelPersonalizado.PanelRound();
        jLabel546 = new javax.swing.JLabel();
        jSeparator189 = new javax.swing.JSeparator();
        jLabel547 = new javax.swing.JLabel();
        jLabel548 = new javax.swing.JLabel();
        jButton245 = new javax.swing.JButton();
        panelRound187 = new PanelPersonalizado.PanelRound();
        jLabel549 = new javax.swing.JLabel();
        jSeparator190 = new javax.swing.JSeparator();
        jLabel550 = new javax.swing.JLabel();
        jLabel551 = new javax.swing.JLabel();
        jButton248 = new javax.swing.JButton();
        panelRound189 = new PanelPersonalizado.PanelRound();
        jLabel555 = new javax.swing.JLabel();
        jSeparator192 = new javax.swing.JSeparator();
        jLabel556 = new javax.swing.JLabel();
        jLabel557 = new javax.swing.JLabel();
        jButton246 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        panelProductos.setBackground(new java.awt.Color(66, 71, 74));
        panelProductos.setPreferredSize(new java.awt.Dimension(1270, 710));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 147, 21));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-producto item20.png"))); // NOI18N
        jLabel2.setText("PRODUCTOS");

        jButton1.setBackground(new java.awt.Color(66, 71, 74));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/retroceder.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(119, 119, 119));
        jSeparator1.setForeground(new java.awt.Color(137, 128, 126));

        jTabbedPane2.setBackground(new java.awt.Color(66, 71, 74));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane8.setBackground(new java.awt.Color(33, 36, 41));
        jScrollPane8.setBorder(null);

        panelRound51.setBackground(new java.awt.Color(66, 71, 74));
        panelRound51.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        panelRound51.setPreferredSize(new java.awt.Dimension(1032, 1567));

        panelRound65.setBackground(new java.awt.Color(33, 36, 41));
        panelRound65.setRoundBottomLeft(30);
        panelRound65.setRoundBottomRight(30);
        panelRound65.setRoundTopLeft(30);
        panelRound65.setRoundTopRight(30);

        jLabel168.setBackground(new java.awt.Color(119, 119, 119));
        jLabel168.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(137, 128, 126));
        jLabel168.setText("PRECIO");

        jSeparator135.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator135.setForeground(new java.awt.Color(137, 128, 126));

        jLabel399.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel399.setForeground(new java.awt.Color(255, 255, 255));
        jLabel399.setText("PIZZA HAYANA");

        jLabel400.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_huawaiana_oficial.png"))); // NOI18N

        jButton142.setBackground(new java.awt.Color(51, 51, 51));
        jButton142.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton142.setForeground(new java.awt.Color(255, 255, 255));
        jButton142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton142.setText("ELEGIR");
        jButton142.setBorder(null);
        jButton142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton142ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound65Layout = new javax.swing.GroupLayout(panelRound65);
        panelRound65.setLayout(panelRound65Layout);
        panelRound65Layout.setHorizontalGroup(
            panelRound65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound65Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel399)
                .addGap(120, 120, 120))
            .addGroup(panelRound65Layout.createSequentialGroup()
                .addGroup(panelRound65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound65Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator135, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound65Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel400, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel168)))
                    .addGroup(panelRound65Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelRound65Layout.setVerticalGroup(
            panelRound65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound65Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel168)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel399)
                .addGap(24, 24, 24)
                .addComponent(jLabel400)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator135, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        panelRound137.setBackground(new java.awt.Color(33, 36, 41));
        panelRound137.setRoundBottomLeft(30);
        panelRound137.setRoundBottomRight(30);
        panelRound137.setRoundTopLeft(30);
        panelRound137.setRoundTopRight(30);

        jLabel169.setBackground(new java.awt.Color(119, 119, 119));
        jLabel169.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(137, 128, 126));
        jLabel169.setText("PRECIO");

        jSeparator136.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator136.setForeground(new java.awt.Color(137, 128, 126));

        jLabel401.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel401.setForeground(new java.awt.Color(255, 255, 255));
        jLabel401.setText("PIZZA DE FRUTAS");

        jLabel402.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_frutas_oficial.png"))); // NOI18N

        jButton162.setBackground(new java.awt.Color(51, 51, 51));
        jButton162.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton162.setForeground(new java.awt.Color(255, 255, 255));
        jButton162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton162.setText("ELEGIR");
        jButton162.setBorder(null);
        jButton162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton162ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound137Layout = new javax.swing.GroupLayout(panelRound137);
        panelRound137.setLayout(panelRound137Layout);
        panelRound137Layout.setHorizontalGroup(
            panelRound137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound137Layout.createSequentialGroup()
                .addGroup(panelRound137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound137Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator136, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel169)))
                    .addGroup(panelRound137Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel402))
                    .addGroup(panelRound137Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel401))
                    .addGroup(panelRound137Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton162, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound137Layout.setVerticalGroup(
            panelRound137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound137Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel169)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel401)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel402, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator136, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton162, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        panelRound138.setBackground(new java.awt.Color(33, 36, 41));
        panelRound138.setRoundBottomLeft(30);
        panelRound138.setRoundBottomRight(30);
        panelRound138.setRoundTopLeft(30);
        panelRound138.setRoundTopRight(30);

        jLabel170.setBackground(new java.awt.Color(119, 119, 119));
        jLabel170.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(137, 128, 126));
        jLabel170.setText("PRECIO");

        jSeparator137.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator137.setForeground(new java.awt.Color(137, 128, 126));

        jLabel403.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel403.setForeground(new java.awt.Color(255, 255, 255));
        jLabel403.setText("PIZZA PICANTE");

        jLabel404.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_picante_oficial.png"))); // NOI18N

        jButton171.setBackground(new java.awt.Color(51, 51, 51));
        jButton171.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton171.setForeground(new java.awt.Color(255, 255, 255));
        jButton171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton171.setText("ELEGIR");
        jButton171.setBorder(null);
        jButton171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton171ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound138Layout = new javax.swing.GroupLayout(panelRound138);
        panelRound138.setLayout(panelRound138Layout);
        panelRound138Layout.setHorizontalGroup(
            panelRound138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound138Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator137, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(panelRound138Layout.createSequentialGroup()
                .addGroup(panelRound138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound138Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel170))
                    .addGroup(panelRound138Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel403))
                    .addGroup(panelRound138Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel404, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound138Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton171, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound138Layout.setVerticalGroup(
            panelRound138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound138Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel170)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel403)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel404, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator137, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton171, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        panelRound139.setBackground(new java.awt.Color(33, 36, 41));
        panelRound139.setRoundBottomLeft(30);
        panelRound139.setRoundBottomRight(30);
        panelRound139.setRoundTopLeft(30);
        panelRound139.setRoundTopRight(30);

        jLabel405.setBackground(new java.awt.Color(119, 119, 119));
        jLabel405.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel405.setForeground(new java.awt.Color(137, 128, 126));
        jLabel405.setText("PRECIO");

        jSeparator138.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator138.setForeground(new java.awt.Color(137, 128, 126));

        jLabel406.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel406.setForeground(new java.awt.Color(255, 255, 255));
        jLabel406.setText("ESPECIALIDAD DE CASA");

        jLabel407.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_especialidad_de_casa_oficial.png"))); // NOI18N

        jButton161.setBackground(new java.awt.Color(51, 51, 51));
        jButton161.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton161.setForeground(new java.awt.Color(255, 255, 255));
        jButton161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton161.setText("ELEGIR");
        jButton161.setBorder(null);
        jButton161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton161ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound139Layout = new javax.swing.GroupLayout(panelRound139);
        panelRound139.setLayout(panelRound139Layout);
        panelRound139Layout.setHorizontalGroup(
            panelRound139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound139Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel407, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(panelRound139Layout.createSequentialGroup()
                .addGroup(panelRound139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound139Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel405))
                    .addGroup(panelRound139Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator138, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound139Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel406)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound139Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jButton161, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );
        panelRound139Layout.setVerticalGroup(
            panelRound139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound139Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel405)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel406)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel407, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator138, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(panelRound139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound139Layout.createSequentialGroup()
                    .addContainerGap(310, Short.MAX_VALUE)
                    .addComponent(jButton161, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
        );

        panelRound140.setBackground(new java.awt.Color(33, 36, 41));
        panelRound140.setRoundBottomLeft(30);
        panelRound140.setRoundBottomRight(30);
        panelRound140.setRoundTopLeft(30);
        panelRound140.setRoundTopRight(30);

        jLabel408.setBackground(new java.awt.Color(119, 119, 119));
        jLabel408.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel408.setForeground(new java.awt.Color(137, 128, 126));
        jLabel408.setText("PRECIO");

        jSeparator139.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator139.setForeground(new java.awt.Color(137, 128, 126));

        jLabel409.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel409.setForeground(new java.awt.Color(255, 255, 255));
        jLabel409.setText("PIZZA AMERICANA");

        jLabel410.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_americana_oficial.png"))); // NOI18N

        jButton163.setBackground(new java.awt.Color(51, 51, 51));
        jButton163.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton163.setForeground(new java.awt.Color(255, 255, 255));
        jButton163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton163.setText("ELEGIR");
        jButton163.setBorder(null);
        jButton163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton163ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound140Layout = new javax.swing.GroupLayout(panelRound140);
        panelRound140.setLayout(panelRound140Layout);
        panelRound140Layout.setHorizontalGroup(
            panelRound140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound140Layout.createSequentialGroup()
                .addGroup(panelRound140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound140Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel408))
                    .addGroup(panelRound140Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRound140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel410, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator139, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound140Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel409))
                    .addGroup(panelRound140Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton163, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound140Layout.setVerticalGroup(
            panelRound140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound140Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel408)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel409)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel410)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator139, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton163, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound141.setBackground(new java.awt.Color(33, 36, 41));
        panelRound141.setRoundBottomLeft(30);
        panelRound141.setRoundBottomRight(30);
        panelRound141.setRoundTopLeft(30);
        panelRound141.setRoundTopRight(30);

        jLabel411.setBackground(new java.awt.Color(119, 119, 119));
        jLabel411.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel411.setForeground(new java.awt.Color(137, 128, 126));
        jLabel411.setText("PRECIO");

        jSeparator140.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator140.setForeground(new java.awt.Color(137, 128, 126));

        jLabel412.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel412.setForeground(new java.awt.Color(255, 255, 255));
        jLabel412.setText("PIZZA DE CHAMPIÑONES");

        jLabel413.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_champiñones_oficial.png"))); // NOI18N

        jButton164.setBackground(new java.awt.Color(51, 51, 51));
        jButton164.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton164.setForeground(new java.awt.Color(255, 255, 255));
        jButton164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton164.setText("ELEGIR");
        jButton164.setBorder(null);
        jButton164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton164ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound141Layout = new javax.swing.GroupLayout(panelRound141);
        panelRound141.setLayout(panelRound141Layout);
        panelRound141Layout.setHorizontalGroup(
            panelRound141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound141Layout.createSequentialGroup()
                .addGroup(panelRound141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound141Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound141Layout.createSequentialGroup()
                                .addComponent(jLabel411)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE))
                            .addComponent(jLabel413, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound141Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator140, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound141Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound141Layout.createSequentialGroup()
                        .addComponent(jButton164, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound141Layout.createSequentialGroup()
                        .addComponent(jLabel412)
                        .addGap(60, 60, 60))))
        );
        panelRound141Layout.setVerticalGroup(
            panelRound141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound141Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel411)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel412)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel413)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator140, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton164, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelRound142.setBackground(new java.awt.Color(33, 36, 41));
        panelRound142.setRoundBottomLeft(30);
        panelRound142.setRoundBottomRight(30);
        panelRound142.setRoundTopLeft(30);
        panelRound142.setRoundTopRight(30);

        jLabel414.setBackground(new java.awt.Color(119, 119, 119));
        jLabel414.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel414.setForeground(new java.awt.Color(137, 128, 126));
        jLabel414.setText("PRECIO");

        jSeparator141.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator141.setForeground(new java.awt.Color(137, 128, 126));

        jLabel415.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel415.setForeground(new java.awt.Color(255, 255, 255));
        jLabel415.setText("PIZZA 4 ESTACIONES");

        jLabel416.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_4_estaciones_oficial.png"))); // NOI18N

        jButton165.setBackground(new java.awt.Color(51, 51, 51));
        jButton165.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton165.setForeground(new java.awt.Color(255, 255, 255));
        jButton165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton165.setText("ELEGIR");
        jButton165.setBorder(null);
        jButton165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton165ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound142Layout = new javax.swing.GroupLayout(panelRound142);
        panelRound142.setLayout(panelRound142Layout);
        panelRound142Layout.setHorizontalGroup(
            panelRound142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound142Layout.createSequentialGroup()
                .addGroup(panelRound142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound142Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel414))
                    .addGroup(panelRound142Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator141, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound142Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel415)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound142Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelRound142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound142Layout.createSequentialGroup()
                        .addComponent(jLabel416)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound142Layout.createSequentialGroup()
                        .addComponent(jButton165, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        panelRound142Layout.setVerticalGroup(
            panelRound142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound142Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel414)
                .addGap(12, 12, 12)
                .addComponent(jLabel415)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel416, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator141, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton165, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        panelRound143.setBackground(new java.awt.Color(33, 36, 41));
        panelRound143.setRoundBottomLeft(30);
        panelRound143.setRoundBottomRight(30);
        panelRound143.setRoundTopLeft(30);
        panelRound143.setRoundTopRight(30);

        jLabel417.setBackground(new java.awt.Color(119, 119, 119));
        jLabel417.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel417.setForeground(new java.awt.Color(137, 128, 126));
        jLabel417.setText("PRECIO");

        jSeparator142.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator142.setForeground(new java.awt.Color(137, 128, 126));

        jLabel418.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel418.setForeground(new java.awt.Color(255, 255, 255));
        jLabel418.setText("PIZZA MIXTA");

        jLabel419.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_mixta_oficial.png"))); // NOI18N

        jButton173.setBackground(new java.awt.Color(51, 51, 51));
        jButton173.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton173.setForeground(new java.awt.Color(255, 255, 255));
        jButton173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton173.setText("ELEGIR");
        jButton173.setBorder(null);
        jButton173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton173ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound143Layout = new javax.swing.GroupLayout(panelRound143);
        panelRound143.setLayout(panelRound143Layout);
        panelRound143Layout.setHorizontalGroup(
            panelRound143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound143Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton173, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(panelRound143Layout.createSequentialGroup()
                .addGroup(panelRound143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator142, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRound143Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel417))
                        .addGroup(panelRound143Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jLabel418))
                        .addGroup(panelRound143Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel419, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelRound143Layout.setVerticalGroup(
            panelRound143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound143Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel417)
                .addGap(9, 9, 9)
                .addComponent(jLabel418)
                .addGap(34, 34, 34)
                .addComponent(jLabel419, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jSeparator142, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton173, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound144.setBackground(new java.awt.Color(33, 36, 41));
        panelRound144.setRoundBottomLeft(30);
        panelRound144.setRoundBottomRight(30);
        panelRound144.setRoundTopLeft(30);
        panelRound144.setRoundTopRight(30);

        jLabel420.setBackground(new java.awt.Color(119, 119, 119));
        jLabel420.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel420.setForeground(new java.awt.Color(137, 128, 126));
        jLabel420.setText("PRECIO");

        jSeparator143.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator143.setForeground(new java.awt.Color(137, 128, 126));

        jLabel421.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel421.setForeground(new java.awt.Color(255, 255, 255));
        jLabel421.setText("PIZZA VEGETARIANA");

        jLabel422.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_vegetariana_oficial.png"))); // NOI18N

        jButton172.setBackground(new java.awt.Color(51, 51, 51));
        jButton172.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton172.setForeground(new java.awt.Color(255, 255, 255));
        jButton172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton172.setText("ELEGIR");
        jButton172.setBorder(null);
        jButton172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton172ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound144Layout = new javax.swing.GroupLayout(panelRound144);
        panelRound144.setLayout(panelRound144Layout);
        panelRound144Layout.setHorizontalGroup(
            panelRound144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound144Layout.createSequentialGroup()
                .addGroup(panelRound144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound144Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel421))
                    .addGroup(panelRound144Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel422, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel420))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound144Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelRound144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound144Layout.createSequentialGroup()
                        .addComponent(jSeparator143, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound144Layout.createSequentialGroup()
                        .addComponent(jButton172, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        panelRound144Layout.setVerticalGroup(
            panelRound144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound144Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel420)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel421)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel422, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator143, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton172, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        panelRound145.setBackground(new java.awt.Color(33, 36, 41));
        panelRound145.setRoundBottomLeft(30);
        panelRound145.setRoundBottomRight(30);
        panelRound145.setRoundTopLeft(30);
        panelRound145.setRoundTopRight(30);

        jLabel423.setBackground(new java.awt.Color(119, 119, 119));
        jLabel423.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel423.setForeground(new java.awt.Color(137, 128, 126));
        jLabel423.setText("PRECIO");

        jSeparator144.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator144.setForeground(new java.awt.Color(137, 128, 126));

        jLabel424.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel424.setForeground(new java.awt.Color(255, 255, 255));
        jLabel424.setText("PIZZA NAPOLITANA");

        jLabel425.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_napolitana_oficial.png"))); // NOI18N

        jButton167.setBackground(new java.awt.Color(51, 51, 51));
        jButton167.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton167.setForeground(new java.awt.Color(255, 255, 255));
        jButton167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton167.setText("ELEGIR");
        jButton167.setBorder(null);
        jButton167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton167ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound145Layout = new javax.swing.GroupLayout(panelRound145);
        panelRound145.setLayout(panelRound145Layout);
        panelRound145Layout.setHorizontalGroup(
            panelRound145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound145Layout.createSequentialGroup()
                .addGroup(panelRound145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound145Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel423))
                    .addGroup(panelRound145Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel424))
                    .addGroup(panelRound145Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRound145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel425, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator144)))
                    .addGroup(panelRound145Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton167, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelRound145Layout.setVerticalGroup(
            panelRound145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound145Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel423)
                .addGap(18, 18, 18)
                .addComponent(jLabel424)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel425)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator144, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton167, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound146.setBackground(new java.awt.Color(33, 36, 41));
        panelRound146.setRoundBottomLeft(30);
        panelRound146.setRoundBottomRight(30);
        panelRound146.setRoundTopLeft(30);
        panelRound146.setRoundTopRight(30);

        jLabel426.setBackground(new java.awt.Color(119, 119, 119));
        jLabel426.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel426.setForeground(new java.awt.Color(137, 128, 126));
        jLabel426.setText("PRECIO");

        jSeparator145.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator145.setForeground(new java.awt.Color(137, 128, 126));

        jLabel427.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel427.setForeground(new java.awt.Color(255, 255, 255));
        jLabel427.setText("PIZZA DE PEPERONI");

        jLabel428.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_peperoni_oficial.png"))); // NOI18N

        jButton170.setBackground(new java.awt.Color(51, 51, 51));
        jButton170.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton170.setForeground(new java.awt.Color(255, 255, 255));
        jButton170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton170.setText("ELEGIR");
        jButton170.setBorder(null);
        jButton170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton170ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound146Layout = new javax.swing.GroupLayout(panelRound146);
        panelRound146.setLayout(panelRound146Layout);
        panelRound146Layout.setHorizontalGroup(
            panelRound146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound146Layout.createSequentialGroup()
                .addGroup(panelRound146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound146Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel428)
                            .addComponent(jLabel426)
                            .addComponent(jSeparator145, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound146Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel427)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound146Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton170, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        panelRound146Layout.setVerticalGroup(
            panelRound146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound146Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel426)
                .addGap(18, 18, 18)
                .addComponent(jLabel427)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel428, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator145, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton170, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        panelRound147.setBackground(new java.awt.Color(33, 36, 41));
        panelRound147.setRoundBottomLeft(30);
        panelRound147.setRoundBottomRight(30);
        panelRound147.setRoundTopLeft(30);
        panelRound147.setRoundTopRight(30);

        jLabel429.setBackground(new java.awt.Color(119, 119, 119));
        jLabel429.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel429.setForeground(new java.awt.Color(137, 128, 126));
        jLabel429.setText("PRECIO");

        jSeparator164.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator164.setForeground(new java.awt.Color(137, 128, 126));

        jLabel430.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel430.setForeground(new java.awt.Color(255, 255, 255));
        jLabel430.setText("PIZZA DE QUESO");

        jLabel431.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_queso_oficial.png"))); // NOI18N

        jButton166.setBackground(new java.awt.Color(51, 51, 51));
        jButton166.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton166.setForeground(new java.awt.Color(255, 255, 255));
        jButton166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton166.setText("ELEGIR");
        jButton166.setBorder(null);
        jButton166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton166ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound147Layout = new javax.swing.GroupLayout(panelRound147);
        panelRound147.setLayout(panelRound147Layout);
        panelRound147Layout.setHorizontalGroup(
            panelRound147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound147Layout.createSequentialGroup()
                .addGroup(panelRound147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound147Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel429))
                    .addGroup(panelRound147Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel430))
                    .addGroup(panelRound147Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelRound147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel431, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator164, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound147Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton166, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        panelRound147Layout.setVerticalGroup(
            panelRound147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound147Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel429)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel430)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel431, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator164, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton166, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout panelRound51Layout = new javax.swing.GroupLayout(panelRound51);
        panelRound51.setLayout(panelRound51Layout);
        panelRound51Layout.setHorizontalGroup(
            panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound51Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound51Layout.createSequentialGroup()
                        .addComponent(panelRound139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(panelRound65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound51Layout.createSequentialGroup()
                        .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelRound138, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound145, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRound141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound146, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(panelRound144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30)
                .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound51Layout.createSequentialGroup()
                        .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(987, 987, 987))
                    .addGroup(panelRound51Layout.createSequentialGroup()
                        .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound51Layout.setVerticalGroup(
            panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound51Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound137, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound139, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound65, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound140, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound142, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound146, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound147, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelRound138, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelRound144, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(panelRound143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jScrollPane8.setViewportView(panelRound51);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("FAMILIARES            ", jPanel3);

        jPanel5.setBackground(new java.awt.Color(66, 71, 74));

        jScrollPane1.setBackground(new java.awt.Color(66, 71, 74));
        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(66, 71, 74));

        panelRound53.setBackground(new java.awt.Color(66, 71, 74));
        panelRound53.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        panelRound67.setBackground(new java.awt.Color(33, 36, 41));
        panelRound67.setRoundBottomLeft(30);
        panelRound67.setRoundBottomRight(30);
        panelRound67.setRoundTopLeft(30);
        panelRound67.setRoundTopRight(30);

        jLabel174.setBackground(new java.awt.Color(119, 119, 119));
        jLabel174.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(137, 128, 126));
        jLabel174.setText("PRECIO");

        jSeparator157.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator157.setForeground(new java.awt.Color(137, 128, 126));

        jLabel465.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel465.setForeground(new java.awt.Color(255, 255, 255));
        jLabel465.setText("PIZZA HAYANA");

        jLabel466.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_huawaiana_oficial.png"))); // NOI18N

        jButton143.setBackground(new java.awt.Color(51, 51, 51));
        jButton143.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton143.setForeground(new java.awt.Color(255, 255, 255));
        jButton143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton143.setText("ELEGIR");
        jButton143.setBorder(null);
        jButton143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton143ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound67Layout = new javax.swing.GroupLayout(panelRound67);
        panelRound67.setLayout(panelRound67Layout);
        panelRound67Layout.setHorizontalGroup(
            panelRound67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound67Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel465)
                .addGap(120, 120, 120))
            .addGroup(panelRound67Layout.createSequentialGroup()
                .addGroup(panelRound67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound67Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator157, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound67Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel466, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel174)))
                    .addGroup(panelRound67Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelRound67Layout.setVerticalGroup(
            panelRound67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound67Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel174)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel465)
                .addGap(24, 24, 24)
                .addComponent(jLabel466)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator157, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        panelRound159.setBackground(new java.awt.Color(33, 36, 41));
        panelRound159.setRoundBottomLeft(30);
        panelRound159.setRoundBottomRight(30);
        panelRound159.setRoundTopLeft(30);
        panelRound159.setRoundTopRight(30);

        jLabel175.setBackground(new java.awt.Color(119, 119, 119));
        jLabel175.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(137, 128, 126));
        jLabel175.setText("PRECIO");

        jSeparator158.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator158.setForeground(new java.awt.Color(137, 128, 126));

        jLabel467.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel467.setForeground(new java.awt.Color(255, 255, 255));
        jLabel467.setText("PIZZA DE FRUTAS");

        jLabel468.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_frutas_oficial.png"))); // NOI18N

        jButton168.setBackground(new java.awt.Color(51, 51, 51));
        jButton168.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton168.setForeground(new java.awt.Color(255, 255, 255));
        jButton168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton168.setText("ELEGIR");
        jButton168.setBorder(null);
        jButton168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton168ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound159Layout = new javax.swing.GroupLayout(panelRound159);
        panelRound159.setLayout(panelRound159Layout);
        panelRound159Layout.setHorizontalGroup(
            panelRound159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound159Layout.createSequentialGroup()
                .addGroup(panelRound159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound159Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator158, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel175)))
                    .addGroup(panelRound159Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel468))
                    .addGroup(panelRound159Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel467))
                    .addGroup(panelRound159Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton168, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound159Layout.setVerticalGroup(
            panelRound159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound159Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel175)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel467)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel468, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator158, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton168, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        panelRound160.setBackground(new java.awt.Color(33, 36, 41));
        panelRound160.setRoundBottomLeft(30);
        panelRound160.setRoundBottomRight(30);
        panelRound160.setRoundTopLeft(30);
        panelRound160.setRoundTopRight(30);

        jLabel176.setBackground(new java.awt.Color(119, 119, 119));
        jLabel176.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(137, 128, 126));
        jLabel176.setText("PRECIO");

        jSeparator159.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator159.setForeground(new java.awt.Color(137, 128, 126));

        jLabel469.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel469.setForeground(new java.awt.Color(255, 255, 255));
        jLabel469.setText("PIZZA PICANTE");

        jLabel470.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_picante_oficial.png"))); // NOI18N

        jButton174.setBackground(new java.awt.Color(51, 51, 51));
        jButton174.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton174.setForeground(new java.awt.Color(255, 255, 255));
        jButton174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton174.setText("ELEGIR");
        jButton174.setBorder(null);
        jButton174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton174ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound160Layout = new javax.swing.GroupLayout(panelRound160);
        panelRound160.setLayout(panelRound160Layout);
        panelRound160Layout.setHorizontalGroup(
            panelRound160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound160Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator159, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(panelRound160Layout.createSequentialGroup()
                .addGroup(panelRound160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound160Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel176))
                    .addGroup(panelRound160Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel469))
                    .addGroup(panelRound160Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel470, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound160Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton174, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound160Layout.setVerticalGroup(
            panelRound160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound160Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel176)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel469)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel470, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator159, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton174, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        panelRound161.setBackground(new java.awt.Color(33, 36, 41));
        panelRound161.setRoundBottomLeft(30);
        panelRound161.setRoundBottomRight(30);
        panelRound161.setRoundTopLeft(30);
        panelRound161.setRoundTopRight(30);

        jLabel471.setBackground(new java.awt.Color(119, 119, 119));
        jLabel471.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel471.setForeground(new java.awt.Color(137, 128, 126));
        jLabel471.setText("PRECIO");

        jSeparator160.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator160.setForeground(new java.awt.Color(137, 128, 126));

        jLabel472.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel472.setForeground(new java.awt.Color(255, 255, 255));
        jLabel472.setText("ESPECIALIDAD DE CASA");

        jLabel473.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_especialidad_de_casa_oficial.png"))); // NOI18N

        jButton181.setBackground(new java.awt.Color(51, 51, 51));
        jButton181.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton181.setForeground(new java.awt.Color(255, 255, 255));
        jButton181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton181.setText("ELEGIR");
        jButton181.setBorder(null);
        jButton181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton181ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound161Layout = new javax.swing.GroupLayout(panelRound161);
        panelRound161.setLayout(panelRound161Layout);
        panelRound161Layout.setHorizontalGroup(
            panelRound161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound161Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel473, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(panelRound161Layout.createSequentialGroup()
                .addGroup(panelRound161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound161Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel471))
                    .addGroup(panelRound161Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator160, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound161Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel472)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound161Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jButton181, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );
        panelRound161Layout.setVerticalGroup(
            panelRound161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound161Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel471)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel472)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel473, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator160, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(panelRound161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound161Layout.createSequentialGroup()
                    .addContainerGap(310, Short.MAX_VALUE)
                    .addComponent(jButton181, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
        );

        panelRound162.setBackground(new java.awt.Color(33, 36, 41));
        panelRound162.setRoundBottomLeft(30);
        panelRound162.setRoundBottomRight(30);
        panelRound162.setRoundTopLeft(30);
        panelRound162.setRoundTopRight(30);

        jLabel474.setBackground(new java.awt.Color(119, 119, 119));
        jLabel474.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel474.setForeground(new java.awt.Color(137, 128, 126));
        jLabel474.setText("PRECIO");

        jSeparator161.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator161.setForeground(new java.awt.Color(137, 128, 126));

        jLabel475.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel475.setForeground(new java.awt.Color(255, 255, 255));
        jLabel475.setText("PIZZA AMERICANA");

        jLabel476.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_americana_oficial.png"))); // NOI18N

        jButton200.setBackground(new java.awt.Color(51, 51, 51));
        jButton200.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton200.setForeground(new java.awt.Color(255, 255, 255));
        jButton200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton200.setText("ELEGIR");
        jButton200.setBorder(null);
        jButton200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton200ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound162Layout = new javax.swing.GroupLayout(panelRound162);
        panelRound162.setLayout(panelRound162Layout);
        panelRound162Layout.setHorizontalGroup(
            panelRound162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound162Layout.createSequentialGroup()
                .addGroup(panelRound162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound162Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel474))
                    .addGroup(panelRound162Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRound162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel476, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator161, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound162Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel475))
                    .addGroup(panelRound162Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton200, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound162Layout.setVerticalGroup(
            panelRound162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound162Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel474)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel475)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel476)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator161, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton200, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound163.setBackground(new java.awt.Color(33, 36, 41));
        panelRound163.setRoundBottomLeft(30);
        panelRound163.setRoundBottomRight(30);
        panelRound163.setRoundTopLeft(30);
        panelRound163.setRoundTopRight(30);

        jLabel477.setBackground(new java.awt.Color(119, 119, 119));
        jLabel477.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel477.setForeground(new java.awt.Color(137, 128, 126));
        jLabel477.setText("PRECIO");

        jSeparator162.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator162.setForeground(new java.awt.Color(137, 128, 126));

        jLabel478.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel478.setForeground(new java.awt.Color(255, 255, 255));
        jLabel478.setText("PIZZA DE CHAMPIÑONES");

        jLabel479.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_champiñones_oficial.png"))); // NOI18N

        jButton210.setBackground(new java.awt.Color(51, 51, 51));
        jButton210.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton210.setForeground(new java.awt.Color(255, 255, 255));
        jButton210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton210.setText("ELEGIR");
        jButton210.setBorder(null);
        jButton210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton210ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound163Layout = new javax.swing.GroupLayout(panelRound163);
        panelRound163.setLayout(panelRound163Layout);
        panelRound163Layout.setHorizontalGroup(
            panelRound163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound163Layout.createSequentialGroup()
                .addGroup(panelRound163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound163Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound163Layout.createSequentialGroup()
                                .addComponent(jLabel477)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE))
                            .addComponent(jLabel479, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound163Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator162, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound163Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound163Layout.createSequentialGroup()
                        .addComponent(jButton210, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound163Layout.createSequentialGroup()
                        .addComponent(jLabel478)
                        .addGap(60, 60, 60))))
        );
        panelRound163Layout.setVerticalGroup(
            panelRound163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound163Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel477)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel478)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel479)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator162, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton210, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelRound164.setBackground(new java.awt.Color(33, 36, 41));
        panelRound164.setRoundBottomLeft(30);
        panelRound164.setRoundBottomRight(30);
        panelRound164.setRoundTopLeft(30);
        panelRound164.setRoundTopRight(30);

        jLabel480.setBackground(new java.awt.Color(119, 119, 119));
        jLabel480.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel480.setForeground(new java.awt.Color(137, 128, 126));
        jLabel480.setText("PRECIO");

        jSeparator163.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator163.setForeground(new java.awt.Color(137, 128, 126));

        jLabel481.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel481.setForeground(new java.awt.Color(255, 255, 255));
        jLabel481.setText("PIZZA 4 ESTACIONES");

        jLabel482.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_4_estaciones_oficial.png"))); // NOI18N

        jButton211.setBackground(new java.awt.Color(51, 51, 51));
        jButton211.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton211.setForeground(new java.awt.Color(255, 255, 255));
        jButton211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton211.setText("ELEGIR");
        jButton211.setBorder(null);
        jButton211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton211ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound164Layout = new javax.swing.GroupLayout(panelRound164);
        panelRound164.setLayout(panelRound164Layout);
        panelRound164Layout.setHorizontalGroup(
            panelRound164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound164Layout.createSequentialGroup()
                .addGroup(panelRound164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound164Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel480))
                    .addGroup(panelRound164Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator163, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound164Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel481)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound164Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelRound164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound164Layout.createSequentialGroup()
                        .addComponent(jLabel482)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound164Layout.createSequentialGroup()
                        .addComponent(jButton211, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        panelRound164Layout.setVerticalGroup(
            panelRound164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound164Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel480)
                .addGap(12, 12, 12)
                .addComponent(jLabel481)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel482, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator163, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton211, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        panelRound165.setBackground(new java.awt.Color(33, 36, 41));
        panelRound165.setRoundBottomLeft(30);
        panelRound165.setRoundBottomRight(30);
        panelRound165.setRoundTopLeft(30);
        panelRound165.setRoundTopRight(30);

        jLabel483.setBackground(new java.awt.Color(119, 119, 119));
        jLabel483.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel483.setForeground(new java.awt.Color(137, 128, 126));
        jLabel483.setText("PRECIO");

        jSeparator166.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator166.setForeground(new java.awt.Color(137, 128, 126));

        jLabel484.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel484.setForeground(new java.awt.Color(255, 255, 255));
        jLabel484.setText("PIZZA MIXTA");

        jLabel485.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_mixta_oficial.png"))); // NOI18N

        jButton212.setBackground(new java.awt.Color(51, 51, 51));
        jButton212.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton212.setForeground(new java.awt.Color(255, 255, 255));
        jButton212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton212.setText("ELEGIR");
        jButton212.setBorder(null);
        jButton212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton212ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound165Layout = new javax.swing.GroupLayout(panelRound165);
        panelRound165.setLayout(panelRound165Layout);
        panelRound165Layout.setHorizontalGroup(
            panelRound165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound165Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton212, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(panelRound165Layout.createSequentialGroup()
                .addGroup(panelRound165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator166, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRound165Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel483))
                        .addGroup(panelRound165Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jLabel484))
                        .addGroup(panelRound165Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel485, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelRound165Layout.setVerticalGroup(
            panelRound165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound165Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel483)
                .addGap(9, 9, 9)
                .addComponent(jLabel484)
                .addGap(34, 34, 34)
                .addComponent(jLabel485, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jSeparator166, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton212, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound166.setBackground(new java.awt.Color(33, 36, 41));
        panelRound166.setRoundBottomLeft(30);
        panelRound166.setRoundBottomRight(30);
        panelRound166.setRoundTopLeft(30);
        panelRound166.setRoundTopRight(30);

        jLabel486.setBackground(new java.awt.Color(119, 119, 119));
        jLabel486.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel486.setForeground(new java.awt.Color(137, 128, 126));
        jLabel486.setText("PRECIO");

        jSeparator167.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator167.setForeground(new java.awt.Color(137, 128, 126));

        jLabel487.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel487.setForeground(new java.awt.Color(255, 255, 255));
        jLabel487.setText("PIZZA VEGETARIANA");

        jLabel488.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_vegetariana_oficial.png"))); // NOI18N

        jButton213.setBackground(new java.awt.Color(51, 51, 51));
        jButton213.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton213.setForeground(new java.awt.Color(255, 255, 255));
        jButton213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton213.setText("ELEGIR");
        jButton213.setBorder(null);
        jButton213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton213ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound166Layout = new javax.swing.GroupLayout(panelRound166);
        panelRound166.setLayout(panelRound166Layout);
        panelRound166Layout.setHorizontalGroup(
            panelRound166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound166Layout.createSequentialGroup()
                .addGroup(panelRound166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound166Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel487))
                    .addGroup(panelRound166Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel488, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel486))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound166Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelRound166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound166Layout.createSequentialGroup()
                        .addComponent(jSeparator167, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound166Layout.createSequentialGroup()
                        .addComponent(jButton213, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        panelRound166Layout.setVerticalGroup(
            panelRound166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound166Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel486)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel487)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel488, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator167, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton213, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        panelRound167.setBackground(new java.awt.Color(33, 36, 41));
        panelRound167.setRoundBottomLeft(30);
        panelRound167.setRoundBottomRight(30);
        panelRound167.setRoundTopLeft(30);
        panelRound167.setRoundTopRight(30);

        jLabel489.setBackground(new java.awt.Color(119, 119, 119));
        jLabel489.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel489.setForeground(new java.awt.Color(137, 128, 126));
        jLabel489.setText("PRECIO");

        jSeparator168.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator168.setForeground(new java.awt.Color(137, 128, 126));

        jLabel490.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel490.setForeground(new java.awt.Color(255, 255, 255));
        jLabel490.setText("PIZZA NAPOLITANA");

        jLabel491.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_napolitana_oficial.png"))); // NOI18N

        jButton214.setBackground(new java.awt.Color(51, 51, 51));
        jButton214.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton214.setForeground(new java.awt.Color(255, 255, 255));
        jButton214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton214.setText("ELEGIR");
        jButton214.setBorder(null);
        jButton214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton214ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound167Layout = new javax.swing.GroupLayout(panelRound167);
        panelRound167.setLayout(panelRound167Layout);
        panelRound167Layout.setHorizontalGroup(
            panelRound167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound167Layout.createSequentialGroup()
                .addGroup(panelRound167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound167Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel489))
                    .addGroup(panelRound167Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel490))
                    .addGroup(panelRound167Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRound167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel491, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator168)))
                    .addGroup(panelRound167Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton214, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelRound167Layout.setVerticalGroup(
            panelRound167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound167Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel489)
                .addGap(18, 18, 18)
                .addComponent(jLabel490)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel491)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator168, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton214, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound168.setBackground(new java.awt.Color(33, 36, 41));
        panelRound168.setRoundBottomLeft(30);
        panelRound168.setRoundBottomRight(30);
        panelRound168.setRoundTopLeft(30);
        panelRound168.setRoundTopRight(30);

        jLabel492.setBackground(new java.awt.Color(119, 119, 119));
        jLabel492.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel492.setForeground(new java.awt.Color(137, 128, 126));
        jLabel492.setText("PRECIO");

        jSeparator169.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator169.setForeground(new java.awt.Color(137, 128, 126));

        jLabel493.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel493.setForeground(new java.awt.Color(255, 255, 255));
        jLabel493.setText("PIZZA DE PEPERONI");

        jLabel494.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_peperoni_oficial.png"))); // NOI18N

        jButton215.setBackground(new java.awt.Color(51, 51, 51));
        jButton215.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton215.setForeground(new java.awt.Color(255, 255, 255));
        jButton215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton215.setText("ELEGIR");
        jButton215.setBorder(null);
        jButton215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton215ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound168Layout = new javax.swing.GroupLayout(panelRound168);
        panelRound168.setLayout(panelRound168Layout);
        panelRound168Layout.setHorizontalGroup(
            panelRound168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound168Layout.createSequentialGroup()
                .addGroup(panelRound168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound168Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel494)
                            .addComponent(jLabel492)
                            .addComponent(jSeparator169, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound168Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel493)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound168Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton215, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        panelRound168Layout.setVerticalGroup(
            panelRound168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound168Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel492)
                .addGap(18, 18, 18)
                .addComponent(jLabel493)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel494, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator169, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton215, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        panelRound169.setBackground(new java.awt.Color(33, 36, 41));
        panelRound169.setRoundBottomLeft(30);
        panelRound169.setRoundBottomRight(30);
        panelRound169.setRoundTopLeft(30);
        panelRound169.setRoundTopRight(30);

        jLabel495.setBackground(new java.awt.Color(119, 119, 119));
        jLabel495.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel495.setForeground(new java.awt.Color(137, 128, 126));
        jLabel495.setText("PRECIO");

        jSeparator170.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator170.setForeground(new java.awt.Color(137, 128, 126));

        jLabel496.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel496.setForeground(new java.awt.Color(255, 255, 255));
        jLabel496.setText("PIZZA DE QUESO");

        jLabel497.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_queso_oficial.png"))); // NOI18N

        jButton216.setBackground(new java.awt.Color(51, 51, 51));
        jButton216.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton216.setForeground(new java.awt.Color(255, 255, 255));
        jButton216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton216.setText("ELEGIR");
        jButton216.setBorder(null);
        jButton216.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton216ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound169Layout = new javax.swing.GroupLayout(panelRound169);
        panelRound169.setLayout(panelRound169Layout);
        panelRound169Layout.setHorizontalGroup(
            panelRound169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound169Layout.createSequentialGroup()
                .addGroup(panelRound169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound169Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel495))
                    .addGroup(panelRound169Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel496))
                    .addGroup(panelRound169Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelRound169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel497, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator170, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound169Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton216, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        panelRound169Layout.setVerticalGroup(
            panelRound169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound169Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel495)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel496)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel497, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator170, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton216, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout panelRound53Layout = new javax.swing.GroupLayout(panelRound53);
        panelRound53.setLayout(panelRound53Layout);
        panelRound53Layout.setHorizontalGroup(
            panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound53Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound53Layout.createSequentialGroup()
                        .addComponent(panelRound161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(panelRound67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound53Layout.createSequentialGroup()
                        .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelRound160, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound167, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRound163, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound168, javax.swing.GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(panelRound166, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30)
                .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound53Layout.createSequentialGroup()
                        .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(987, 987, 987))
                    .addGroup(panelRound53Layout.createSequentialGroup()
                        .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound53Layout.setVerticalGroup(
            panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound53Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound159, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound161, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound67, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound162, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound163, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound164, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound168, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound169, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelRound160, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelRound166, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(panelRound165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRound53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelRound53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("MEDIANAS                ", jPanel5);

        jScrollPane2.setBackground(new java.awt.Color(66, 71, 74));
        jScrollPane2.setBorder(null);

        panelRound57.setBackground(new java.awt.Color(66, 71, 74));
        panelRound57.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N

        panelRound70.setBackground(new java.awt.Color(33, 36, 41));
        panelRound70.setRoundBottomLeft(30);
        panelRound70.setRoundBottomRight(30);
        panelRound70.setRoundTopLeft(30);
        panelRound70.setRoundTopRight(30);

        jLabel183.setBackground(new java.awt.Color(119, 119, 119));
        jLabel183.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(137, 128, 126));
        jLabel183.setText("PRECIO");

        jSeparator177.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator177.setForeground(new java.awt.Color(137, 128, 126));

        jLabel509.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel509.setForeground(new java.awt.Color(255, 255, 255));
        jLabel509.setText("PIZZA HAYANA");

        jLabel513.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_huawaiana_oficial.png"))); // NOI18N

        jButton144.setBackground(new java.awt.Color(51, 51, 51));
        jButton144.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton144.setForeground(new java.awt.Color(255, 255, 255));
        jButton144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton144.setText("ELEGIR");
        jButton144.setBorder(null);
        jButton144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton144ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound70Layout = new javax.swing.GroupLayout(panelRound70);
        panelRound70.setLayout(panelRound70Layout);
        panelRound70Layout.setHorizontalGroup(
            panelRound70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound70Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel509)
                .addGap(120, 120, 120))
            .addGroup(panelRound70Layout.createSequentialGroup()
                .addGroup(panelRound70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound70Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator177, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound70Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel513, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel183)))
                    .addGroup(panelRound70Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelRound70Layout.setVerticalGroup(
            panelRound70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound70Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel183)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel509)
                .addGap(24, 24, 24)
                .addComponent(jLabel513)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator177, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        panelRound175.setBackground(new java.awt.Color(33, 36, 41));
        panelRound175.setRoundBottomLeft(30);
        panelRound175.setRoundBottomRight(30);
        panelRound175.setRoundTopLeft(30);
        panelRound175.setRoundTopRight(30);

        jLabel184.setBackground(new java.awt.Color(119, 119, 119));
        jLabel184.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(137, 128, 126));
        jLabel184.setText("PRECIO");

        jSeparator196.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator196.setForeground(new java.awt.Color(137, 128, 126));

        jLabel514.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel514.setForeground(new java.awt.Color(255, 255, 255));
        jLabel514.setText("PIZZA DE FRUTAS");

        jLabel515.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_frutas_oficial.png"))); // NOI18N

        jButton217.setBackground(new java.awt.Color(51, 51, 51));
        jButton217.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton217.setForeground(new java.awt.Color(255, 255, 255));
        jButton217.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton217.setText("ELEGIR");
        jButton217.setBorder(null);
        jButton217.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton217ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound175Layout = new javax.swing.GroupLayout(panelRound175);
        panelRound175.setLayout(panelRound175Layout);
        panelRound175Layout.setHorizontalGroup(
            panelRound175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound175Layout.createSequentialGroup()
                .addGroup(panelRound175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound175Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator196, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel184)))
                    .addGroup(panelRound175Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel515))
                    .addGroup(panelRound175Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel514))
                    .addGroup(panelRound175Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton217, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound175Layout.setVerticalGroup(
            panelRound175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound175Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel184)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel514)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel515, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator196, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton217, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        panelRound193.setBackground(new java.awt.Color(33, 36, 41));
        panelRound193.setRoundBottomLeft(30);
        panelRound193.setRoundBottomRight(30);
        panelRound193.setRoundTopLeft(30);
        panelRound193.setRoundTopRight(30);

        jLabel185.setBackground(new java.awt.Color(119, 119, 119));
        jLabel185.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(137, 128, 126));
        jLabel185.setText("PRECIO");

        jSeparator206.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator206.setForeground(new java.awt.Color(137, 128, 126));

        jLabel518.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel518.setForeground(new java.awt.Color(255, 255, 255));
        jLabel518.setText("PIZZA PICANTE");

        jLabel567.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_picante_oficial.png"))); // NOI18N

        jButton218.setBackground(new java.awt.Color(51, 51, 51));
        jButton218.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton218.setForeground(new java.awt.Color(255, 255, 255));
        jButton218.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton218.setText("ELEGIR");
        jButton218.setBorder(null);
        jButton218.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton218ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound193Layout = new javax.swing.GroupLayout(panelRound193);
        panelRound193.setLayout(panelRound193Layout);
        panelRound193Layout.setHorizontalGroup(
            panelRound193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound193Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator206, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(panelRound193Layout.createSequentialGroup()
                .addGroup(panelRound193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound193Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel185))
                    .addGroup(panelRound193Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel518))
                    .addGroup(panelRound193Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel567, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound193Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton218, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound193Layout.setVerticalGroup(
            panelRound193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound193Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel185)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel518)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel567, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator206, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton218, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        panelRound203.setBackground(new java.awt.Color(33, 36, 41));
        panelRound203.setRoundBottomLeft(30);
        panelRound203.setRoundBottomRight(30);
        panelRound203.setRoundTopLeft(30);
        panelRound203.setRoundTopRight(30);

        jLabel569.setBackground(new java.awt.Color(119, 119, 119));
        jLabel569.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel569.setForeground(new java.awt.Color(137, 128, 126));
        jLabel569.setText("PRECIO");

        jSeparator207.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator207.setForeground(new java.awt.Color(137, 128, 126));

        jLabel570.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel570.setForeground(new java.awt.Color(255, 255, 255));
        jLabel570.setText("ESPECIALIDAD DE CASA");

        jLabel572.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_especialidad_de_casa_oficial.png"))); // NOI18N

        jButton219.setBackground(new java.awt.Color(51, 51, 51));
        jButton219.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton219.setForeground(new java.awt.Color(255, 255, 255));
        jButton219.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton219.setText("ELEGIR");
        jButton219.setBorder(null);
        jButton219.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton219ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound203Layout = new javax.swing.GroupLayout(panelRound203);
        panelRound203.setLayout(panelRound203Layout);
        panelRound203Layout.setHorizontalGroup(
            panelRound203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound203Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel572, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(panelRound203Layout.createSequentialGroup()
                .addGroup(panelRound203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound203Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel569))
                    .addGroup(panelRound203Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator207, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound203Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel570)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound203Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jButton219, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );
        panelRound203Layout.setVerticalGroup(
            panelRound203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound203Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel569)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel570)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel572, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator207, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(panelRound203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound203Layout.createSequentialGroup()
                    .addContainerGap(310, Short.MAX_VALUE)
                    .addComponent(jButton219, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
        );

        panelRound204.setBackground(new java.awt.Color(33, 36, 41));
        panelRound204.setRoundBottomLeft(30);
        panelRound204.setRoundBottomRight(30);
        panelRound204.setRoundTopLeft(30);
        panelRound204.setRoundTopRight(30);

        jLabel575.setBackground(new java.awt.Color(119, 119, 119));
        jLabel575.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel575.setForeground(new java.awt.Color(137, 128, 126));
        jLabel575.setText("PRECIO");

        jSeparator208.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator208.setForeground(new java.awt.Color(137, 128, 126));

        jLabel579.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel579.setForeground(new java.awt.Color(255, 255, 255));
        jLabel579.setText("PIZZA AMERICANA");

        jLabel582.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_americana_oficial.png"))); // NOI18N

        jButton220.setBackground(new java.awt.Color(51, 51, 51));
        jButton220.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton220.setForeground(new java.awt.Color(255, 255, 255));
        jButton220.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton220.setText("ELEGIR");
        jButton220.setBorder(null);
        jButton220.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton220ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound204Layout = new javax.swing.GroupLayout(panelRound204);
        panelRound204.setLayout(panelRound204Layout);
        panelRound204Layout.setHorizontalGroup(
            panelRound204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound204Layout.createSequentialGroup()
                .addGroup(panelRound204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound204Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel575))
                    .addGroup(panelRound204Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRound204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel582, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator208, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound204Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel579))
                    .addGroup(panelRound204Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton220, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound204Layout.setVerticalGroup(
            panelRound204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound204Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel575)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel579)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel582)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator208, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton220, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound205.setBackground(new java.awt.Color(33, 36, 41));
        panelRound205.setRoundBottomLeft(30);
        panelRound205.setRoundBottomRight(30);
        panelRound205.setRoundTopLeft(30);
        panelRound205.setRoundTopRight(30);

        jLabel586.setBackground(new java.awt.Color(119, 119, 119));
        jLabel586.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel586.setForeground(new java.awt.Color(137, 128, 126));
        jLabel586.setText("PRECIO");

        jSeparator209.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator209.setForeground(new java.awt.Color(137, 128, 126));

        jLabel594.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel594.setForeground(new java.awt.Color(255, 255, 255));
        jLabel594.setText("PIZZA DE CHAMPIÑONES");

        jLabel612.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_champiñones_oficial.png"))); // NOI18N

        jButton221.setBackground(new java.awt.Color(51, 51, 51));
        jButton221.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton221.setForeground(new java.awt.Color(255, 255, 255));
        jButton221.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton221.setText("ELEGIR");
        jButton221.setBorder(null);
        jButton221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton221ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound205Layout = new javax.swing.GroupLayout(panelRound205);
        panelRound205.setLayout(panelRound205Layout);
        panelRound205Layout.setHorizontalGroup(
            panelRound205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound205Layout.createSequentialGroup()
                .addGroup(panelRound205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound205Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound205Layout.createSequentialGroup()
                                .addComponent(jLabel586)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE))
                            .addComponent(jLabel612, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound205Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator209, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound205Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound205Layout.createSequentialGroup()
                        .addComponent(jButton221, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound205Layout.createSequentialGroup()
                        .addComponent(jLabel594)
                        .addGap(60, 60, 60))))
        );
        panelRound205Layout.setVerticalGroup(
            panelRound205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound205Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel586)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel594)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel612)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator209, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton221, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelRound206.setBackground(new java.awt.Color(33, 36, 41));
        panelRound206.setRoundBottomLeft(30);
        panelRound206.setRoundBottomRight(30);
        panelRound206.setRoundTopLeft(30);
        panelRound206.setRoundTopRight(30);

        jLabel618.setBackground(new java.awt.Color(119, 119, 119));
        jLabel618.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel618.setForeground(new java.awt.Color(137, 128, 126));
        jLabel618.setText("PRECIO");

        jSeparator210.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator210.setForeground(new java.awt.Color(137, 128, 126));

        jLabel619.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel619.setForeground(new java.awt.Color(255, 255, 255));
        jLabel619.setText("PIZZA 4 ESTACIONES");

        jLabel620.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_4_estaciones_oficial.png"))); // NOI18N

        jButton222.setBackground(new java.awt.Color(51, 51, 51));
        jButton222.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton222.setForeground(new java.awt.Color(255, 255, 255));
        jButton222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton222.setText("ELEGIR");
        jButton222.setBorder(null);
        jButton222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton222ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound206Layout = new javax.swing.GroupLayout(panelRound206);
        panelRound206.setLayout(panelRound206Layout);
        panelRound206Layout.setHorizontalGroup(
            panelRound206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound206Layout.createSequentialGroup()
                .addGroup(panelRound206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound206Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel618))
                    .addGroup(panelRound206Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator210, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound206Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel619)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound206Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelRound206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound206Layout.createSequentialGroup()
                        .addComponent(jLabel620)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound206Layout.createSequentialGroup()
                        .addComponent(jButton222, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        panelRound206Layout.setVerticalGroup(
            panelRound206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound206Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel618)
                .addGap(12, 12, 12)
                .addComponent(jLabel619)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel620, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator210, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton222, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        panelRound207.setBackground(new java.awt.Color(33, 36, 41));
        panelRound207.setRoundBottomLeft(30);
        panelRound207.setRoundBottomRight(30);
        panelRound207.setRoundTopLeft(30);
        panelRound207.setRoundTopRight(30);

        jLabel621.setBackground(new java.awt.Color(119, 119, 119));
        jLabel621.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel621.setForeground(new java.awt.Color(137, 128, 126));
        jLabel621.setText("PRECIO");

        jSeparator211.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator211.setForeground(new java.awt.Color(137, 128, 126));

        jLabel622.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel622.setForeground(new java.awt.Color(255, 255, 255));
        jLabel622.setText("PIZZA MIXTA");

        jLabel623.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_mixta_oficial.png"))); // NOI18N

        jButton223.setBackground(new java.awt.Color(51, 51, 51));
        jButton223.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton223.setForeground(new java.awt.Color(255, 255, 255));
        jButton223.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton223.setText("ELEGIR");
        jButton223.setBorder(null);
        jButton223.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton223ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound207Layout = new javax.swing.GroupLayout(panelRound207);
        panelRound207.setLayout(panelRound207Layout);
        panelRound207Layout.setHorizontalGroup(
            panelRound207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound207Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton223, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(panelRound207Layout.createSequentialGroup()
                .addGroup(panelRound207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator211, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRound207Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel621))
                        .addGroup(panelRound207Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jLabel622))
                        .addGroup(panelRound207Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel623, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelRound207Layout.setVerticalGroup(
            panelRound207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound207Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel621)
                .addGap(9, 9, 9)
                .addComponent(jLabel622)
                .addGap(34, 34, 34)
                .addComponent(jLabel623, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jSeparator211, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton223, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound208.setBackground(new java.awt.Color(33, 36, 41));
        panelRound208.setRoundBottomLeft(30);
        panelRound208.setRoundBottomRight(30);
        panelRound208.setRoundTopLeft(30);
        panelRound208.setRoundTopRight(30);

        jLabel624.setBackground(new java.awt.Color(119, 119, 119));
        jLabel624.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel624.setForeground(new java.awt.Color(137, 128, 126));
        jLabel624.setText("PRECIO");

        jSeparator212.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator212.setForeground(new java.awt.Color(137, 128, 126));

        jLabel625.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel625.setForeground(new java.awt.Color(255, 255, 255));
        jLabel625.setText("PIZZA VEGETARIANA");

        jLabel626.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_vegetariana_oficial.png"))); // NOI18N

        jButton224.setBackground(new java.awt.Color(51, 51, 51));
        jButton224.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton224.setForeground(new java.awt.Color(255, 255, 255));
        jButton224.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton224.setText("ELEGIR");
        jButton224.setBorder(null);
        jButton224.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton224ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound208Layout = new javax.swing.GroupLayout(panelRound208);
        panelRound208.setLayout(panelRound208Layout);
        panelRound208Layout.setHorizontalGroup(
            panelRound208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound208Layout.createSequentialGroup()
                .addGroup(panelRound208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound208Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel625))
                    .addGroup(panelRound208Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel626, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel624))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound208Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelRound208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound208Layout.createSequentialGroup()
                        .addComponent(jSeparator212, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound208Layout.createSequentialGroup()
                        .addComponent(jButton224, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        panelRound208Layout.setVerticalGroup(
            panelRound208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound208Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel624)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel625)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel626, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator212, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton224, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        panelRound209.setBackground(new java.awt.Color(33, 36, 41));
        panelRound209.setRoundBottomLeft(30);
        panelRound209.setRoundBottomRight(30);
        panelRound209.setRoundTopLeft(30);
        panelRound209.setRoundTopRight(30);

        jLabel627.setBackground(new java.awt.Color(119, 119, 119));
        jLabel627.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel627.setForeground(new java.awt.Color(137, 128, 126));
        jLabel627.setText("PRECIO");

        jSeparator213.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator213.setForeground(new java.awt.Color(137, 128, 126));

        jLabel628.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel628.setForeground(new java.awt.Color(255, 255, 255));
        jLabel628.setText("PIZZA NAPOLITANA");

        jLabel629.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/Pizza_napolitana_oficial.png"))); // NOI18N

        jButton225.setBackground(new java.awt.Color(51, 51, 51));
        jButton225.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton225.setForeground(new java.awt.Color(255, 255, 255));
        jButton225.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton225.setText("ELEGIR");
        jButton225.setBorder(null);
        jButton225.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton225ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound209Layout = new javax.swing.GroupLayout(panelRound209);
        panelRound209.setLayout(panelRound209Layout);
        panelRound209Layout.setHorizontalGroup(
            panelRound209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound209Layout.createSequentialGroup()
                .addGroup(panelRound209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound209Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel627))
                    .addGroup(panelRound209Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel628))
                    .addGroup(panelRound209Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRound209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel629, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator213)))
                    .addGroup(panelRound209Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton225, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelRound209Layout.setVerticalGroup(
            panelRound209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound209Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel627)
                .addGap(18, 18, 18)
                .addComponent(jLabel628)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel629)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator213, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton225, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound210.setBackground(new java.awt.Color(33, 36, 41));
        panelRound210.setRoundBottomLeft(30);
        panelRound210.setRoundBottomRight(30);
        panelRound210.setRoundTopLeft(30);
        panelRound210.setRoundTopRight(30);

        jLabel630.setBackground(new java.awt.Color(119, 119, 119));
        jLabel630.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel630.setForeground(new java.awt.Color(137, 128, 126));
        jLabel630.setText("PRECIO");

        jSeparator214.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator214.setForeground(new java.awt.Color(137, 128, 126));

        jLabel631.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel631.setForeground(new java.awt.Color(255, 255, 255));
        jLabel631.setText("PIZZA DE PEPERONI");

        jLabel632.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_peperoni_oficial.png"))); // NOI18N

        jButton226.setBackground(new java.awt.Color(51, 51, 51));
        jButton226.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton226.setForeground(new java.awt.Color(255, 255, 255));
        jButton226.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton226.setText("ELEGIR");
        jButton226.setBorder(null);
        jButton226.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton226ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound210Layout = new javax.swing.GroupLayout(panelRound210);
        panelRound210.setLayout(panelRound210Layout);
        panelRound210Layout.setHorizontalGroup(
            panelRound210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound210Layout.createSequentialGroup()
                .addGroup(panelRound210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound210Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel632)
                            .addComponent(jLabel630)
                            .addComponent(jSeparator214, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound210Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel631)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound210Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton226, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        panelRound210Layout.setVerticalGroup(
            panelRound210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound210Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel630)
                .addGap(18, 18, 18)
                .addComponent(jLabel631)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel632, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator214, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton226, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        panelRound211.setBackground(new java.awt.Color(33, 36, 41));
        panelRound211.setRoundBottomLeft(30);
        panelRound211.setRoundBottomRight(30);
        panelRound211.setRoundTopLeft(30);
        panelRound211.setRoundTopRight(30);

        jLabel633.setBackground(new java.awt.Color(119, 119, 119));
        jLabel633.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel633.setForeground(new java.awt.Color(137, 128, 126));
        jLabel633.setText("PRECIO");

        jSeparator215.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator215.setForeground(new java.awt.Color(137, 128, 126));

        jLabel634.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel634.setForeground(new java.awt.Color(255, 255, 255));
        jLabel634.setText("PIZZA DE QUESO");

        jLabel635.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/pizza_queso_oficial.png"))); // NOI18N

        jButton227.setBackground(new java.awt.Color(51, 51, 51));
        jButton227.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton227.setForeground(new java.awt.Color(255, 255, 255));
        jButton227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton227.setText("ELEGIR");
        jButton227.setBorder(null);
        jButton227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton227ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound211Layout = new javax.swing.GroupLayout(panelRound211);
        panelRound211.setLayout(panelRound211Layout);
        panelRound211Layout.setHorizontalGroup(
            panelRound211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound211Layout.createSequentialGroup()
                .addGroup(panelRound211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound211Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel633))
                    .addGroup(panelRound211Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel634))
                    .addGroup(panelRound211Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelRound211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel635, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator215, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound211Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton227, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        panelRound211Layout.setVerticalGroup(
            panelRound211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound211Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel633)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel634)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel635, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator215, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton227, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout panelRound57Layout = new javax.swing.GroupLayout(panelRound57);
        panelRound57.setLayout(panelRound57Layout);
        panelRound57Layout.setHorizontalGroup(
            panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound57Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound57Layout.createSequentialGroup()
                        .addComponent(panelRound203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(panelRound70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound57Layout.createSequentialGroup()
                        .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelRound193, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound209, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRound205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound210, javax.swing.GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(panelRound208, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30)
                .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound57Layout.createSequentialGroup()
                        .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound211, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound206, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(987, 987, 987))
                    .addGroup(panelRound57Layout.createSequentialGroup()
                        .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelRound57Layout.setVerticalGroup(
            panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound57Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound175, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound203, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound70, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound204, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound206, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound210, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound211, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelRound193, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelRound208, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(panelRound207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jScrollPane2.setViewportView(panelRound57);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1645, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PERSONALES                  ", jPanel1);

        jScrollPane3.setBorder(null);

        panelRound54.setBackground(new java.awt.Color(66, 71, 74));

        panelRound172.setBackground(new java.awt.Color(33, 36, 41));
        panelRound172.setRoundBottomLeft(30);
        panelRound172.setRoundBottomRight(30);
        panelRound172.setRoundTopLeft(30);
        panelRound172.setRoundTopRight(30);

        jLabel504.setBackground(new java.awt.Color(119, 119, 119));
        jLabel504.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel504.setForeground(new java.awt.Color(137, 128, 126));
        jLabel504.setText("PRECIO:");

        jSeparator174.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator174.setForeground(new java.awt.Color(137, 128, 126));

        jLabel505.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel505.setForeground(new java.awt.Color(255, 255, 255));
        jLabel505.setText("INCA COLA PERSONAL");

        jLabel506.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/INCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jLabel564.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel564.setForeground(new java.awt.Color(255, 255, 255));
        jLabel564.setText("VIDRIO");

        jButton231.setBackground(new java.awt.Color(51, 51, 51));
        jButton231.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton231.setForeground(new java.awt.Color(255, 255, 255));
        jButton231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton231.setText("ELEGIR");
        jButton231.setBorder(null);
        jButton231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton231ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound172Layout = new javax.swing.GroupLayout(panelRound172);
        panelRound172.setLayout(panelRound172Layout);
        panelRound172Layout.setHorizontalGroup(
            panelRound172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound172Layout.createSequentialGroup()
                .addGroup(panelRound172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound172Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jSeparator174, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound172Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel506, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel564)
                            .addComponent(jLabel505)
                            .addComponent(jLabel504)))
                    .addGroup(panelRound172Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton231, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound172Layout.setVerticalGroup(
            panelRound172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound172Layout.createSequentialGroup()
                .addGroup(panelRound172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound172Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel506)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelRound172Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel505, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel564, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel504)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator174, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton231, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound192.setBackground(new java.awt.Color(33, 36, 41));
        panelRound192.setRoundBottomLeft(30);
        panelRound192.setRoundBottomRight(30);
        panelRound192.setRoundTopLeft(30);
        panelRound192.setRoundTopRight(30);

        jLabel565.setBackground(new java.awt.Color(119, 119, 119));
        jLabel565.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel565.setForeground(new java.awt.Color(137, 128, 126));
        jLabel565.setText("PRECIO:");

        jSeparator195.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator195.setForeground(new java.awt.Color(137, 128, 126));

        jLabel566.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel566.setForeground(new java.awt.Color(255, 255, 255));
        jLabel566.setText("INCA COLA PERSONAL");

        jLabel568.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel568.setForeground(new java.awt.Color(255, 255, 255));
        jLabel568.setText("DESCARTABLE");

        jLabel613.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/INCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jButton230.setBackground(new java.awt.Color(51, 51, 51));
        jButton230.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton230.setForeground(new java.awt.Color(255, 255, 255));
        jButton230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton230.setText("ELEGIR");
        jButton230.setBorder(null);
        jButton230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton230ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound192Layout = new javax.swing.GroupLayout(panelRound192);
        panelRound192.setLayout(panelRound192Layout);
        panelRound192Layout.setHorizontalGroup(
            panelRound192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound192Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelRound192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator195, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound192Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(panelRound192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel565)
                            .addComponent(jLabel566)
                            .addGroup(panelRound192Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel568)))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound192Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(panelRound192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound192Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel613, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );
        panelRound192Layout.setVerticalGroup(
            panelRound192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound192Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel566, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel568, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel565)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jSeparator195, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(panelRound192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound192Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jLabel613, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        panelRound194.setBackground(new java.awt.Color(33, 36, 41));
        panelRound194.setRoundBottomLeft(30);
        panelRound194.setRoundBottomRight(30);
        panelRound194.setRoundTopLeft(30);
        panelRound194.setRoundTopRight(30);

        jLabel573.setBackground(new java.awt.Color(119, 119, 119));
        jLabel573.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel573.setForeground(new java.awt.Color(137, 128, 126));
        jLabel573.setText("PRECIO:");

        jSeparator197.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator197.setForeground(new java.awt.Color(137, 128, 126));

        jLabel574.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel574.setForeground(new java.awt.Color(255, 255, 255));
        jLabel574.setText("INCA COLA FAMILIAR");

        jLabel576.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel576.setForeground(new java.awt.Color(255, 255, 255));
        jLabel576.setText("1 LITRO");

        jLabel616.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/INCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jButton233.setBackground(new java.awt.Color(51, 51, 51));
        jButton233.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton233.setForeground(new java.awt.Color(255, 255, 255));
        jButton233.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton233.setText("ELEGIR");
        jButton233.setBorder(null);
        jButton233.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton233ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound194Layout = new javax.swing.GroupLayout(panelRound194);
        panelRound194.setLayout(panelRound194Layout);
        panelRound194Layout.setHorizontalGroup(
            panelRound194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound194Layout.createSequentialGroup()
                .addGroup(panelRound194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound194Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator197, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound194Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel616, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel573)
                            .addComponent(jLabel574)
                            .addGroup(panelRound194Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel576)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound194Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton233, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        panelRound194Layout.setVerticalGroup(
            panelRound194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound194Layout.createSequentialGroup()
                .addGroup(panelRound194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound194Layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jLabel616, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelRound194Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel574, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel576, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel573)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator197, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton233, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelRound173.setBackground(new java.awt.Color(33, 36, 41));
        panelRound173.setRoundBottomLeft(30);
        panelRound173.setRoundBottomRight(30);
        panelRound173.setRoundTopLeft(30);
        panelRound173.setRoundTopRight(30);

        jLabel507.setBackground(new java.awt.Color(119, 119, 119));
        jLabel507.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel507.setForeground(new java.awt.Color(137, 128, 126));
        jLabel507.setText("PRECIO:");

        jSeparator175.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator175.setForeground(new java.awt.Color(137, 128, 126));

        jLabel508.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel508.setForeground(new java.awt.Color(255, 255, 255));
        jLabel508.setText("INCA COLA FAMILIAR");

        jLabel577.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel577.setForeground(new java.awt.Color(255, 255, 255));
        jLabel577.setText("2 LITROS");

        jLabel611.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/INCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jButton234.setBackground(new java.awt.Color(51, 51, 51));
        jButton234.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton234.setForeground(new java.awt.Color(255, 255, 255));
        jButton234.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton234.setText("ELEGIR");
        jButton234.setBorder(null);
        jButton234.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton234ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound173Layout = new javax.swing.GroupLayout(panelRound173);
        panelRound173.setLayout(panelRound173Layout);
        panelRound173Layout.setHorizontalGroup(
            panelRound173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound173Layout.createSequentialGroup()
                .addGroup(panelRound173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound173Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel611, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound173Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel577))
                            .addComponent(jLabel507)
                            .addComponent(jLabel508)))
                    .addGroup(panelRound173Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator175, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound173Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton234, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound173Layout.setVerticalGroup(
            panelRound173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound173Layout.createSequentialGroup()
                .addGroup(panelRound173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound173Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(jLabel611, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelRound173Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel508, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel577, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel507)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator175, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton234, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound174.setBackground(new java.awt.Color(33, 36, 41));
        panelRound174.setRoundBottomLeft(30);
        panelRound174.setRoundBottomRight(30);
        panelRound174.setRoundTopLeft(30);
        panelRound174.setRoundTopRight(30);

        jLabel510.setBackground(new java.awt.Color(119, 119, 119));
        jLabel510.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel510.setForeground(new java.awt.Color(137, 128, 126));
        jLabel510.setText("PRECIO:");

        jSeparator176.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator176.setForeground(new java.awt.Color(137, 128, 126));

        jLabel511.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel511.setForeground(new java.awt.Color(255, 255, 255));
        jLabel511.setText("COCA COLA PERSONAL");

        jLabel512.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/COCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jLabel578.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel578.setForeground(new java.awt.Color(255, 255, 255));
        jLabel578.setText("VIDRIO");

        jButton239.setBackground(new java.awt.Color(51, 51, 51));
        jButton239.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton239.setForeground(new java.awt.Color(255, 255, 255));
        jButton239.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton239.setText("ELEGIR");
        jButton239.setBorder(null);
        jButton239.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton239ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound174Layout = new javax.swing.GroupLayout(panelRound174);
        panelRound174.setLayout(panelRound174Layout);
        panelRound174Layout.setHorizontalGroup(
            panelRound174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound174Layout.createSequentialGroup()
                .addGroup(panelRound174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound174Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator176, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound174Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel512, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelRound174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound174Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelRound174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound174Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel578))
                                    .addComponent(jLabel510)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound174Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel511)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound174Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton239, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        panelRound174Layout.setVerticalGroup(
            panelRound174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound174Layout.createSequentialGroup()
                .addGroup(panelRound174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound174Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel512, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelRound174Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel511, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel578, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel510)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator176, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton239, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        panelRound195.setBackground(new java.awt.Color(33, 36, 41));
        panelRound195.setRoundBottomLeft(30);
        panelRound195.setRoundBottomRight(30);
        panelRound195.setRoundTopLeft(30);
        panelRound195.setRoundTopRight(30);

        jLabel580.setBackground(new java.awt.Color(119, 119, 119));
        jLabel580.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel580.setForeground(new java.awt.Color(137, 128, 126));
        jLabel580.setText("PRECIO:");

        jSeparator198.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator198.setForeground(new java.awt.Color(137, 128, 126));

        jLabel581.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel581.setForeground(new java.awt.Color(255, 255, 255));
        jLabel581.setText("COCA COLA FAMILIAR");

        jLabel583.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel583.setForeground(new java.awt.Color(255, 255, 255));
        jLabel583.setText("1/2 LITRO");

        jLabel617.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/COCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jButton238.setBackground(new java.awt.Color(51, 51, 51));
        jButton238.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton238.setForeground(new java.awt.Color(255, 255, 255));
        jButton238.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton238.setText("ELEGIR");
        jButton238.setBorder(null);
        jButton238.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton238ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound195Layout = new javax.swing.GroupLayout(panelRound195);
        panelRound195.setLayout(panelRound195Layout);
        panelRound195Layout.setHorizontalGroup(
            panelRound195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound195Layout.createSequentialGroup()
                .addGroup(panelRound195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound195Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator198, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound195Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel617, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRound195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel580)
                            .addComponent(jLabel581)
                            .addGroup(panelRound195Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel583)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound195Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton238, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        panelRound195Layout.setVerticalGroup(
            panelRound195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound195Layout.createSequentialGroup()
                .addGroup(panelRound195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound195Layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .addComponent(jLabel617, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelRound195Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel581, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel583, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel580)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator198, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton238, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelRound196.setBackground(new java.awt.Color(33, 36, 41));
        panelRound196.setRoundBottomLeft(30);
        panelRound196.setRoundBottomRight(30);
        panelRound196.setRoundTopLeft(30);
        panelRound196.setRoundTopRight(30);

        jLabel584.setBackground(new java.awt.Color(119, 119, 119));
        jLabel584.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel584.setForeground(new java.awt.Color(137, 128, 126));
        jLabel584.setText("PRECIO:");

        jSeparator199.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator199.setForeground(new java.awt.Color(137, 128, 126));

        jLabel585.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel585.setForeground(new java.awt.Color(255, 255, 255));
        jLabel585.setText("COCA COLA FAMILIAR");

        jLabel587.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel587.setForeground(new java.awt.Color(255, 255, 255));
        jLabel587.setText("1 LITRO");

        jLabel571.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/COCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jButton235.setBackground(new java.awt.Color(51, 51, 51));
        jButton235.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton235.setForeground(new java.awt.Color(255, 255, 255));
        jButton235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton235.setText("ELEGIR");
        jButton235.setBorder(null);
        jButton235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton235ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound196Layout = new javax.swing.GroupLayout(panelRound196);
        panelRound196.setLayout(panelRound196Layout);
        panelRound196Layout.setHorizontalGroup(
            panelRound196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound196Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound196Layout.createSequentialGroup()
                        .addComponent(jLabel571, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panelRound196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel584)
                            .addComponent(jLabel585)
                            .addGroup(panelRound196Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel587)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound196Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator199, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(panelRound196Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton235, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRound196Layout.setVerticalGroup(
            panelRound196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound196Layout.createSequentialGroup()
                .addGroup(panelRound196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel571, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound196Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel585, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel587, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel584)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator199, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton235, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound197.setBackground(new java.awt.Color(33, 36, 41));
        panelRound197.setRoundBottomLeft(30);
        panelRound197.setRoundBottomRight(30);
        panelRound197.setRoundTopLeft(30);
        panelRound197.setRoundTopRight(30);

        jLabel588.setBackground(new java.awt.Color(119, 119, 119));
        jLabel588.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel588.setForeground(new java.awt.Color(137, 128, 126));
        jLabel588.setText("PRECIO:");

        jSeparator200.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator200.setForeground(new java.awt.Color(137, 128, 126));

        jLabel589.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel589.setForeground(new java.awt.Color(255, 255, 255));
        jLabel589.setText("CHICHA MORADA");

        jLabel590.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/CHICHA_MORADFA_OFICIAL_TAN.png"))); // NOI18N

        jLabel591.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel591.setForeground(new java.awt.Color(255, 255, 255));
        jLabel591.setText("1 LITRO");

        jButton229.setBackground(new java.awt.Color(51, 51, 51));
        jButton229.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton229.setForeground(new java.awt.Color(255, 255, 255));
        jButton229.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton229.setText("ELEGIR");
        jButton229.setBorder(null);
        jButton229.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton229ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound197Layout = new javax.swing.GroupLayout(panelRound197);
        panelRound197.setLayout(panelRound197Layout);
        panelRound197Layout.setHorizontalGroup(
            panelRound197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound197Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator200, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(panelRound197Layout.createSequentialGroup()
                .addGroup(panelRound197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound197Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel590)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound197Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel591))
                            .addComponent(jLabel588)
                            .addComponent(jLabel589)))
                    .addGroup(panelRound197Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton229, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRound197Layout.setVerticalGroup(
            panelRound197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound197Layout.createSequentialGroup()
                .addGroup(panelRound197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound197Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jLabel590, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound197Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel589, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel591, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel588)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator200, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton229, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelRound198.setBackground(new java.awt.Color(33, 36, 41));
        panelRound198.setRoundBottomLeft(30);
        panelRound198.setRoundBottomRight(30);
        panelRound198.setRoundTopLeft(30);
        panelRound198.setRoundTopRight(30);

        jLabel592.setBackground(new java.awt.Color(119, 119, 119));
        jLabel592.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel592.setForeground(new java.awt.Color(137, 128, 126));
        jLabel592.setText("PRECIO:");

        jSeparator201.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator201.setForeground(new java.awt.Color(137, 128, 126));

        jLabel593.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel593.setForeground(new java.awt.Color(255, 255, 255));
        jLabel593.setText("COCA COLA FAMILIAR");

        jLabel595.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel595.setForeground(new java.awt.Color(255, 255, 255));
        jLabel595.setText("2 LITROS");

        jLabel602.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/COCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jButton236.setBackground(new java.awt.Color(51, 51, 51));
        jButton236.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton236.setForeground(new java.awt.Color(255, 255, 255));
        jButton236.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton236.setText("ELEGIR");
        jButton236.setBorder(null);
        jButton236.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton236ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound198Layout = new javax.swing.GroupLayout(panelRound198);
        panelRound198.setLayout(panelRound198Layout);
        panelRound198Layout.setHorizontalGroup(
            panelRound198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound198Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelRound198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator201)
                    .addGroup(panelRound198Layout.createSequentialGroup()
                        .addComponent(jLabel602, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRound198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel592)
                            .addComponent(jLabel593)
                            .addGroup(panelRound198Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel595)))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound198Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton236, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        panelRound198Layout.setVerticalGroup(
            panelRound198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound198Layout.createSequentialGroup()
                .addGroup(panelRound198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound198Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel602, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound198Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel593, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel595, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel592)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator201, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton236, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        panelRound199.setBackground(new java.awt.Color(33, 36, 41));
        panelRound199.setRoundBottomLeft(30);
        panelRound199.setRoundBottomRight(30);
        panelRound199.setRoundTopLeft(30);
        panelRound199.setRoundTopRight(30);

        jLabel596.setBackground(new java.awt.Color(119, 119, 119));
        jLabel596.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel596.setForeground(new java.awt.Color(137, 128, 126));
        jLabel596.setText("PRECIO:");

        jSeparator202.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator202.setForeground(new java.awt.Color(137, 128, 126));

        jLabel597.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel597.setForeground(new java.awt.Color(255, 255, 255));
        jLabel597.setText("CHICHA MORADA");

        jLabel598.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/CHICHA_MORADFA_OFICIAL_TAN.png"))); // NOI18N

        jLabel599.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel599.setForeground(new java.awt.Color(255, 255, 255));
        jLabel599.setText("1/2 LITRO");

        jButton228.setBackground(new java.awt.Color(51, 51, 51));
        jButton228.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton228.setForeground(new java.awt.Color(255, 255, 255));
        jButton228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton228.setText("ELEGIR");
        jButton228.setBorder(null);
        jButton228.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton228ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound199Layout = new javax.swing.GroupLayout(panelRound199);
        panelRound199.setLayout(panelRound199Layout);
        panelRound199Layout.setHorizontalGroup(
            panelRound199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound199Layout.createSequentialGroup()
                .addGroup(panelRound199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound199Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator202, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound199Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel598)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel596)
                            .addComponent(jLabel599)
                            .addComponent(jLabel597)))
                    .addGroup(panelRound199Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton228, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound199Layout.setVerticalGroup(
            panelRound199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound199Layout.createSequentialGroup()
                .addGroup(panelRound199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound199Layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(jLabel598, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelRound199Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel597, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel599, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel596)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator202, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton228, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound200.setBackground(new java.awt.Color(33, 36, 41));
        panelRound200.setRoundBottomLeft(30);
        panelRound200.setRoundBottomRight(30);
        panelRound200.setRoundTopLeft(30);
        panelRound200.setRoundTopRight(30);

        jLabel600.setBackground(new java.awt.Color(119, 119, 119));
        jLabel600.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel600.setForeground(new java.awt.Color(137, 128, 126));
        jLabel600.setText("PRECIO:");

        jSeparator203.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator203.setForeground(new java.awt.Color(137, 128, 126));

        jLabel601.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel601.setForeground(new java.awt.Color(255, 255, 255));
        jLabel601.setText("INCA COLA FAMILIAR");

        jLabel603.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel603.setForeground(new java.awt.Color(255, 255, 255));
        jLabel603.setText("1/2 LITRO");

        jLabel614.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/INCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jButton232.setBackground(new java.awt.Color(51, 51, 51));
        jButton232.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton232.setForeground(new java.awt.Color(255, 255, 255));
        jButton232.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton232.setText("ELEGIR");
        jButton232.setBorder(null);
        jButton232.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton232ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound200Layout = new javax.swing.GroupLayout(panelRound200);
        panelRound200.setLayout(panelRound200Layout);
        panelRound200Layout.setHorizontalGroup(
            panelRound200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound200Layout.createSequentialGroup()
                .addGroup(panelRound200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound200Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel614, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel600)
                            .addComponent(jLabel601)
                            .addGroup(panelRound200Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel603))))
                    .addGroup(panelRound200Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator203, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound200Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton232, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound200Layout.setVerticalGroup(
            panelRound200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound200Layout.createSequentialGroup()
                .addGroup(panelRound200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound200Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jLabel614, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound200Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel601, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel603, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel600)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator203, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton232, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelRound176.setBackground(new java.awt.Color(33, 36, 41));
        panelRound176.setRoundBottomLeft(30);
        panelRound176.setRoundBottomRight(30);
        panelRound176.setRoundTopLeft(30);
        panelRound176.setRoundTopRight(30);

        jLabel516.setBackground(new java.awt.Color(119, 119, 119));
        jLabel516.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel516.setForeground(new java.awt.Color(137, 128, 126));
        jLabel516.setText("PRECIO:");

        jSeparator178.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator178.setForeground(new java.awt.Color(137, 128, 126));

        jLabel517.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel517.setForeground(new java.awt.Color(255, 255, 255));
        jLabel517.setText("COCA COLA PERSONAL");

        jLabel604.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel604.setForeground(new java.awt.Color(255, 255, 255));
        jLabel604.setText("DESCARTABLE");

        jLabel615.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/COCA_COLA_OFICIAL_TAN.png"))); // NOI18N

        jButton237.setBackground(new java.awt.Color(51, 51, 51));
        jButton237.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton237.setForeground(new java.awt.Color(255, 255, 255));
        jButton237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton237.setText("ELEGIR");
        jButton237.setBorder(null);
        jButton237.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton237ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound176Layout = new javax.swing.GroupLayout(panelRound176);
        panelRound176.setLayout(panelRound176Layout);
        panelRound176Layout.setHorizontalGroup(
            panelRound176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound176Layout.createSequentialGroup()
                .addGroup(panelRound176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound176Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator178, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound176Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel615, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound176Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel604))
                            .addComponent(jLabel516)
                            .addComponent(jLabel517)))
                    .addGroup(panelRound176Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton237, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound176Layout.setVerticalGroup(
            panelRound176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound176Layout.createSequentialGroup()
                .addGroup(panelRound176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound176Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jLabel615, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelRound176Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel517, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel604, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel516)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator178, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton237, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout panelRound54Layout = new javax.swing.GroupLayout(panelRound54);
        panelRound54.setLayout(panelRound54Layout);
        panelRound54Layout.setHorizontalGroup(
            panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound54Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelRound176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelRound199, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound197, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound54Layout.createSequentialGroup()
                        .addComponent(panelRound198, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRound54Layout.createSequentialGroup()
                        .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(1530, Short.MAX_VALUE))))
        );
        panelRound54Layout.setVerticalGroup(
            panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound54Layout.createSequentialGroup()
                .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound54Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRound54Layout.createSequentialGroup()
                                .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelRound192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelRound199, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelRound197, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelRound200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelRound194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(panelRound172, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(panelRound173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound54Layout.createSequentialGroup()
                        .addGap(804, 804, 804)
                        .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRound196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound198, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panelRound174, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelRound195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(panelRound54);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1645, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("BEBIDAS                  ", jPanel4);

        jScrollPane4.setBorder(null);

        panelRound55.setBackground(new java.awt.Color(66, 71, 74));
        panelRound55.setPreferredSize(new java.awt.Dimension(1032, 1647));

        panelRound69.setBackground(new java.awt.Color(33, 36, 41));
        panelRound69.setRoundBottomLeft(30);
        panelRound69.setRoundBottomRight(30);
        panelRound69.setRoundTopLeft(30);
        panelRound69.setRoundTopRight(30);

        jLabel180.setBackground(new java.awt.Color(119, 119, 119));
        jLabel180.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(137, 128, 126));
        jLabel180.setText("PRECIO");

        jSeparator183.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator183.setForeground(new java.awt.Color(137, 128, 126));

        jLabel531.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel531.setForeground(new java.awt.Color(255, 255, 255));
        jLabel531.setText("CEBOLLA");

        jLabel532.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/CEBOLA_OFICIAL.png"))); // NOI18N

        jButton240.setBackground(new java.awt.Color(51, 51, 51));
        jButton240.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton240.setForeground(new java.awt.Color(255, 255, 255));
        jButton240.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton240.setText("ELEGIR");
        jButton240.setBorder(null);

        javax.swing.GroupLayout panelRound69Layout = new javax.swing.GroupLayout(panelRound69);
        panelRound69.setLayout(panelRound69Layout);
        panelRound69Layout.setHorizontalGroup(
            panelRound69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound69Layout.createSequentialGroup()
                .addGroup(panelRound69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound69Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel180)
                            .addComponent(jSeparator183, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound69Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel531))
                    .addGroup(panelRound69Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel532, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound69Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton240, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound69Layout.setVerticalGroup(
            panelRound69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound69Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel180)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel531)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel532, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator183, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton240, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        panelRound181.setBackground(new java.awt.Color(33, 36, 41));
        panelRound181.setRoundBottomLeft(30);
        panelRound181.setRoundBottomRight(30);
        panelRound181.setRoundTopLeft(30);
        panelRound181.setRoundTopRight(30);

        jLabel181.setBackground(new java.awt.Color(119, 119, 119));
        jLabel181.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(137, 128, 126));
        jLabel181.setText("PRECIO");

        jSeparator184.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator184.setForeground(new java.awt.Color(137, 128, 126));

        jLabel533.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel533.setForeground(new java.awt.Color(255, 255, 255));
        jLabel533.setText("FIELTE DE CERDO");

        jLabel534.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/CERDO_OFICIAL.png"))); // NOI18N

        jButton242.setBackground(new java.awt.Color(51, 51, 51));
        jButton242.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton242.setForeground(new java.awt.Color(255, 255, 255));
        jButton242.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton242.setText("ELEGIR");
        jButton242.setBorder(null);

        javax.swing.GroupLayout panelRound181Layout = new javax.swing.GroupLayout(panelRound181);
        panelRound181.setLayout(panelRound181Layout);
        panelRound181Layout.setHorizontalGroup(
            panelRound181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound181Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel533)
                .addGap(98, 98, 98))
            .addGroup(panelRound181Layout.createSequentialGroup()
                .addGroup(panelRound181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound181Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel181))
                    .addGroup(panelRound181Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRound181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel534, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator184, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound181Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton242, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound181Layout.setVerticalGroup(
            panelRound181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound181Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel181)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel533)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel534, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jSeparator184, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton242, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound182.setBackground(new java.awt.Color(33, 36, 41));
        panelRound182.setRoundBottomLeft(30);
        panelRound182.setRoundBottomRight(30);
        panelRound182.setRoundTopLeft(30);
        panelRound182.setRoundTopRight(30);

        jLabel182.setBackground(new java.awt.Color(119, 119, 119));
        jLabel182.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(137, 128, 126));
        jLabel182.setText("PRECIO");

        jSeparator185.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator185.setForeground(new java.awt.Color(137, 128, 126));

        jLabel535.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel535.setForeground(new java.awt.Color(255, 255, 255));
        jLabel535.setText("PEPERONI");

        jLabel536.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/PEPDRONI_OFICIAL.png"))); // NOI18N

        jButton247.setBackground(new java.awt.Color(51, 51, 51));
        jButton247.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton247.setForeground(new java.awt.Color(255, 255, 255));
        jButton247.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton247.setText("ELEGIR");
        jButton247.setBorder(null);

        javax.swing.GroupLayout panelRound182Layout = new javax.swing.GroupLayout(panelRound182);
        panelRound182.setLayout(panelRound182Layout);
        panelRound182Layout.setHorizontalGroup(
            panelRound182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound182Layout.createSequentialGroup()
                .addGroup(panelRound182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound182Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator185, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound182Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel182)
                            .addComponent(jLabel536, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound182Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelRound182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound182Layout.createSequentialGroup()
                        .addComponent(jLabel535)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound182Layout.createSequentialGroup()
                        .addComponent(jButton247, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        panelRound182Layout.setVerticalGroup(
            panelRound182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound182Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel182)
                .addGap(18, 18, 18)
                .addComponent(jLabel535)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel536, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator185, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton247, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        panelRound183.setBackground(new java.awt.Color(33, 36, 41));
        panelRound183.setRoundBottomLeft(30);
        panelRound183.setRoundBottomRight(30);
        panelRound183.setRoundTopLeft(30);
        panelRound183.setRoundTopRight(30);

        jLabel537.setBackground(new java.awt.Color(119, 119, 119));
        jLabel537.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel537.setForeground(new java.awt.Color(137, 128, 126));
        jLabel537.setText("PRECIO");

        jSeparator186.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator186.setForeground(new java.awt.Color(137, 128, 126));

        jLabel538.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel538.setForeground(new java.awt.Color(255, 255, 255));
        jLabel538.setText("ACEITUNA");

        jLabel539.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/ACEITUNAS_OFICIAL.png"))); // NOI18N

        jButton243.setBackground(new java.awt.Color(51, 51, 51));
        jButton243.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton243.setForeground(new java.awt.Color(255, 255, 255));
        jButton243.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton243.setText("ELEGIR");
        jButton243.setBorder(null);

        javax.swing.GroupLayout panelRound183Layout = new javax.swing.GroupLayout(panelRound183);
        panelRound183.setLayout(panelRound183Layout);
        panelRound183Layout.setHorizontalGroup(
            panelRound183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound183Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel538)
                .addGap(128, 128, 128))
            .addGroup(panelRound183Layout.createSequentialGroup()
                .addGroup(panelRound183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound183Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel537))
                    .addGroup(panelRound183Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator186, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound183Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel539, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound183Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton243, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound183Layout.setVerticalGroup(
            panelRound183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound183Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel537)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel538)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel539, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jSeparator186, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton243, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        panelRound184.setBackground(new java.awt.Color(33, 36, 41));
        panelRound184.setRoundBottomLeft(30);
        panelRound184.setRoundBottomRight(30);
        panelRound184.setRoundTopLeft(30);
        panelRound184.setRoundTopRight(30);

        jLabel540.setBackground(new java.awt.Color(119, 119, 119));
        jLabel540.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel540.setForeground(new java.awt.Color(137, 128, 126));
        jLabel540.setText("PRECIO");

        jSeparator187.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator187.setForeground(new java.awt.Color(137, 128, 126));

        jLabel541.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel541.setForeground(new java.awt.Color(255, 255, 255));
        jLabel541.setText("PIMIENTO");

        jLabel542.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/PIMIENTO_OFICIAL1.png"))); // NOI18N

        jButton244.setBackground(new java.awt.Color(51, 51, 51));
        jButton244.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton244.setForeground(new java.awt.Color(255, 255, 255));
        jButton244.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton244.setText("ELEGIR");
        jButton244.setBorder(null);

        javax.swing.GroupLayout panelRound184Layout = new javax.swing.GroupLayout(panelRound184);
        panelRound184.setLayout(panelRound184Layout);
        panelRound184Layout.setHorizontalGroup(
            panelRound184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound184Layout.createSequentialGroup()
                .addGroup(panelRound184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound184Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelRound184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound184Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel541))
                            .addComponent(jSeparator187, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRound184Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel542, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRound184Layout.createSequentialGroup()
                        .addGroup(panelRound184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound184Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel540))
                            .addGroup(panelRound184Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jButton244, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRound184Layout.setVerticalGroup(
            panelRound184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound184Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel540)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel541)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel542, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator187, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton244, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRound185.setBackground(new java.awt.Color(33, 36, 41));
        panelRound185.setRoundBottomLeft(30);
        panelRound185.setRoundBottomRight(30);
        panelRound185.setRoundTopLeft(30);
        panelRound185.setRoundTopRight(30);

        jLabel543.setBackground(new java.awt.Color(119, 119, 119));
        jLabel543.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel543.setForeground(new java.awt.Color(137, 128, 126));
        jLabel543.setText("PRECIO");

        jSeparator188.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator188.setForeground(new java.awt.Color(137, 128, 126));

        jLabel544.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel544.setForeground(new java.awt.Color(255, 255, 255));
        jLabel544.setText("TOMATE");

        jLabel545.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/TOMATE_OFICIAL.png"))); // NOI18N

        jButton241.setBackground(new java.awt.Color(51, 51, 51));
        jButton241.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton241.setForeground(new java.awt.Color(255, 255, 255));
        jButton241.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton241.setText("ELEGIR");
        jButton241.setBorder(null);

        javax.swing.GroupLayout panelRound185Layout = new javax.swing.GroupLayout(panelRound185);
        panelRound185.setLayout(panelRound185Layout);
        panelRound185Layout.setHorizontalGroup(
            panelRound185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound185Layout.createSequentialGroup()
                .addGroup(panelRound185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound185Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel543)
                            .addComponent(jLabel545, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound185Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel544))
                    .addGroup(panelRound185Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator188, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound185Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton241, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        panelRound185Layout.setVerticalGroup(
            panelRound185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound185Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel543)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel544)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel545, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator188, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton241, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        panelRound186.setBackground(new java.awt.Color(33, 36, 41));
        panelRound186.setRoundBottomLeft(30);
        panelRound186.setRoundBottomRight(30);
        panelRound186.setRoundTopLeft(30);
        panelRound186.setRoundTopRight(30);

        jLabel546.setBackground(new java.awt.Color(119, 119, 119));
        jLabel546.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel546.setForeground(new java.awt.Color(137, 128, 126));
        jLabel546.setText("PRECIO");

        jSeparator189.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator189.setForeground(new java.awt.Color(137, 128, 126));

        jLabel547.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel547.setForeground(new java.awt.Color(255, 255, 255));
        jLabel547.setText("CHAMPIÑONES");

        jLabel548.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/CHAMPIÑONES_OFICIAL.png"))); // NOI18N

        jButton245.setBackground(new java.awt.Color(51, 51, 51));
        jButton245.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton245.setForeground(new java.awt.Color(255, 255, 255));
        jButton245.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton245.setText("ELEGIR");
        jButton245.setBorder(null);

        javax.swing.GroupLayout panelRound186Layout = new javax.swing.GroupLayout(panelRound186);
        panelRound186.setLayout(panelRound186Layout);
        panelRound186Layout.setHorizontalGroup(
            panelRound186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound186Layout.createSequentialGroup()
                .addGroup(panelRound186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound186Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel546))
                    .addGroup(panelRound186Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel547))
                    .addGroup(panelRound186Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRound186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel548, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator189, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound186Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton245, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        panelRound186Layout.setVerticalGroup(
            panelRound186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound186Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel546)
                .addGap(4, 4, 4)
                .addComponent(jLabel547)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel548, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator189, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton245, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        panelRound187.setBackground(new java.awt.Color(33, 36, 41));
        panelRound187.setRoundBottomLeft(30);
        panelRound187.setRoundBottomRight(30);
        panelRound187.setRoundTopLeft(30);
        panelRound187.setRoundTopRight(30);

        jLabel549.setBackground(new java.awt.Color(119, 119, 119));
        jLabel549.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel549.setForeground(new java.awt.Color(137, 128, 126));
        jLabel549.setText("PRECIO");

        jSeparator190.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator190.setForeground(new java.awt.Color(137, 128, 126));

        jLabel550.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel550.setForeground(new java.awt.Color(255, 255, 255));
        jLabel550.setText("ALBAHACA");

        jLabel551.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/ALBAHACA_OFICIAL.png"))); // NOI18N

        jButton248.setBackground(new java.awt.Color(51, 51, 51));
        jButton248.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton248.setForeground(new java.awt.Color(255, 255, 255));
        jButton248.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton248.setText("ELEGIR");
        jButton248.setBorder(null);

        javax.swing.GroupLayout panelRound187Layout = new javax.swing.GroupLayout(panelRound187);
        panelRound187.setLayout(panelRound187Layout);
        panelRound187Layout.setHorizontalGroup(
            panelRound187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound187Layout.createSequentialGroup()
                .addGroup(panelRound187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound187Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel549)
                            .addComponent(jLabel551, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator190, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound187Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel550)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound187Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton248, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        panelRound187Layout.setVerticalGroup(
            panelRound187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound187Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel549)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel550)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel551)
                .addGap(18, 18, 18)
                .addComponent(jSeparator190, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton248, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        panelRound189.setBackground(new java.awt.Color(33, 36, 41));
        panelRound189.setRoundBottomLeft(30);
        panelRound189.setRoundBottomRight(30);
        panelRound189.setRoundTopLeft(30);
        panelRound189.setRoundTopRight(30);

        jLabel555.setBackground(new java.awt.Color(119, 119, 119));
        jLabel555.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel555.setForeground(new java.awt.Color(137, 128, 126));
        jLabel555.setText("PRECIO");

        jSeparator192.setBackground(new java.awt.Color(137, 128, 126));
        jSeparator192.setForeground(new java.awt.Color(137, 128, 126));

        jLabel556.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel556.setForeground(new java.awt.Color(255, 255, 255));
        jLabel556.setText("ESPINACA");

        jLabel557.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizzas/ESPINACA_OFICIAL.png"))); // NOI18N

        jButton246.setBackground(new java.awt.Color(51, 51, 51));
        jButton246.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        jButton246.setForeground(new java.awt.Color(255, 255, 255));
        jButton246.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegir-20.png"))); // NOI18N
        jButton246.setText("ELEGIR");
        jButton246.setBorder(null);

        javax.swing.GroupLayout panelRound189Layout = new javax.swing.GroupLayout(panelRound189);
        panelRound189.setLayout(panelRound189Layout);
        panelRound189Layout.setHorizontalGroup(
            panelRound189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound189Layout.createSequentialGroup()
                .addGroup(panelRound189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound189Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel555))
                    .addGroup(panelRound189Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelRound189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel557, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound189Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator192, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRound189Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel556))
                    .addGroup(panelRound189Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton246, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelRound189Layout.setVerticalGroup(
            panelRound189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound189Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel555)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel556)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel557, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator192, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton246, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout panelRound55Layout = new javax.swing.GroupLayout(panelRound55);
        panelRound55.setLayout(panelRound55Layout);
        panelRound55Layout.setHorizontalGroup(
            panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound55Layout.createSequentialGroup()
                .addGroup(panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound55Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound55Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound184, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30)
                .addGroup(panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound187, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound185, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound181, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1700, 1700, 1700))
        );
        panelRound55Layout.setVerticalGroup(
            panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound55Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound183, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound69, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound185, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound186, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound184, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound189, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound182, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound187, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(486, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(panelRound55);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1645, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("EXTRAS                ", jPanel6);

        jPanel7.setBackground(new java.awt.Color(66, 71, 74));
        jPanel7.setPreferredSize(new java.awt.Dimension(1032, 1645));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "PRECIO TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable1);

        jButton2.setText("CONFIRMAR");

        jButton3.setText("METODO DE PAGO");

        jButton4.setText("CANCELAR");

        jButton5.setText("ELIMINAR");

        jButton6.setText("CERRAR MESA");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL A PAGAR");

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/metodoPago/metodopago-24.png"))); // NOI18N
        jButton7.setText("METODO PAGO");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(623, 623, 623)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1077, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("PEDIDOS", jPanel7);

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        add(panelProductos, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JPanelPedidosLocalMesa mesas =new JPanelPedidosLocalMesa();
        ShowPanel(mesas);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton142ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton142ActionPerformed

    private void jButton161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton161ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton161ActionPerformed

    private void jButton162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton162ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton162ActionPerformed

    private void jButton163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton163ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton163ActionPerformed

    private void jButton164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton164ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton164ActionPerformed

    private void jButton165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton165ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton165ActionPerformed

    private void jButton166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton166ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton166ActionPerformed

    private void jButton167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton167ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton167ActionPerformed

    private void jButton170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton170ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton170ActionPerformed

    private void jButton171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton171ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton171ActionPerformed

    private void jButton172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton172ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton172ActionPerformed

    private void jButton173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton173ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton173ActionPerformed

    private void jButton143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton143ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton143ActionPerformed

    private void jButton168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton168ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton168ActionPerformed

    private void jButton174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton174ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton174ActionPerformed

    private void jButton181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton181ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton181ActionPerformed

    private void jButton200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton200ActionPerformed

    private void jButton210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton210ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton210ActionPerformed

    private void jButton211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton211ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton211ActionPerformed

    private void jButton212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton212ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton212ActionPerformed

    private void jButton213ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton213ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton213ActionPerformed

    private void jButton214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton214ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton214ActionPerformed

    private void jButton215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton215ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton215ActionPerformed

    private void jButton216ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton216ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton216ActionPerformed

    private void jButton144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton144ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton144ActionPerformed

    private void jButton217ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton217ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton217ActionPerformed

    private void jButton218ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton218ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton218ActionPerformed

    private void jButton219ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton219ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton219ActionPerformed

    private void jButton220ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton220ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton220ActionPerformed

    private void jButton221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton221ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton221ActionPerformed

    private void jButton222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton222ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton222ActionPerformed

    private void jButton223ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton223ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton223ActionPerformed

    private void jButton224ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton224ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton224ActionPerformed

    private void jButton225ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton225ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton225ActionPerformed

    private void jButton226ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton226ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton226ActionPerformed

    private void jButton227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton227ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton227ActionPerformed

    private void jButton228ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton228ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton228ActionPerformed

    private void jButton229ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton229ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton229ActionPerformed

    private void jButton230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton230ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton230ActionPerformed

    private void jButton231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton231ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton231ActionPerformed

    private void jButton232ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton232ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton232ActionPerformed

    private void jButton233ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton233ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton233ActionPerformed

    private void jButton234ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton234ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton234ActionPerformed

    private void jButton235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton235ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton235ActionPerformed

    private void jButton236ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton236ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton236ActionPerformed

    private void jButton237ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton237ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton237ActionPerformed

    private void jButton238ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton238ActionPerformed
    
    }//GEN-LAST:event_jButton238ActionPerformed

    private void jButton239ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton239ActionPerformed
        
    }//GEN-LAST:event_jButton239ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
       JPanelMetodoPago pagos =new JPanelMetodoPago();
       ShowPanel(pagos);
     
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton161;
    private javax.swing.JButton jButton162;
    private javax.swing.JButton jButton163;
    private javax.swing.JButton jButton164;
    private javax.swing.JButton jButton165;
    private javax.swing.JButton jButton166;
    private javax.swing.JButton jButton167;
    private javax.swing.JButton jButton168;
    private javax.swing.JButton jButton170;
    private javax.swing.JButton jButton171;
    private javax.swing.JButton jButton172;
    private javax.swing.JButton jButton173;
    private javax.swing.JButton jButton174;
    private javax.swing.JButton jButton181;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton200;
    private javax.swing.JButton jButton210;
    private javax.swing.JButton jButton211;
    private javax.swing.JButton jButton212;
    private javax.swing.JButton jButton213;
    private javax.swing.JButton jButton214;
    private javax.swing.JButton jButton215;
    private javax.swing.JButton jButton216;
    private javax.swing.JButton jButton217;
    private javax.swing.JButton jButton218;
    private javax.swing.JButton jButton219;
    private javax.swing.JButton jButton220;
    private javax.swing.JButton jButton221;
    private javax.swing.JButton jButton222;
    private javax.swing.JButton jButton223;
    private javax.swing.JButton jButton224;
    private javax.swing.JButton jButton225;
    private javax.swing.JButton jButton226;
    private javax.swing.JButton jButton227;
    private javax.swing.JButton jButton228;
    private javax.swing.JButton jButton229;
    private javax.swing.JButton jButton230;
    private javax.swing.JButton jButton231;
    private javax.swing.JButton jButton232;
    private javax.swing.JButton jButton233;
    private javax.swing.JButton jButton234;
    private javax.swing.JButton jButton235;
    private javax.swing.JButton jButton236;
    private javax.swing.JButton jButton237;
    private javax.swing.JButton jButton238;
    private javax.swing.JButton jButton239;
    private javax.swing.JButton jButton240;
    private javax.swing.JButton jButton241;
    private javax.swing.JButton jButton242;
    private javax.swing.JButton jButton243;
    private javax.swing.JButton jButton244;
    private javax.swing.JButton jButton245;
    private javax.swing.JButton jButton246;
    private javax.swing.JButton jButton247;
    private javax.swing.JButton jButton248;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel400;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel402;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel404;
    private javax.swing.JLabel jLabel405;
    private javax.swing.JLabel jLabel406;
    private javax.swing.JLabel jLabel407;
    private javax.swing.JLabel jLabel408;
    private javax.swing.JLabel jLabel409;
    private javax.swing.JLabel jLabel410;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel412;
    private javax.swing.JLabel jLabel413;
    private javax.swing.JLabel jLabel414;
    private javax.swing.JLabel jLabel415;
    private javax.swing.JLabel jLabel416;
    private javax.swing.JLabel jLabel417;
    private javax.swing.JLabel jLabel418;
    private javax.swing.JLabel jLabel419;
    private javax.swing.JLabel jLabel420;
    private javax.swing.JLabel jLabel421;
    private javax.swing.JLabel jLabel422;
    private javax.swing.JLabel jLabel423;
    private javax.swing.JLabel jLabel424;
    private javax.swing.JLabel jLabel425;
    private javax.swing.JLabel jLabel426;
    private javax.swing.JLabel jLabel427;
    private javax.swing.JLabel jLabel428;
    private javax.swing.JLabel jLabel429;
    private javax.swing.JLabel jLabel430;
    private javax.swing.JLabel jLabel431;
    private javax.swing.JLabel jLabel465;
    private javax.swing.JLabel jLabel466;
    private javax.swing.JLabel jLabel467;
    private javax.swing.JLabel jLabel468;
    private javax.swing.JLabel jLabel469;
    private javax.swing.JLabel jLabel470;
    private javax.swing.JLabel jLabel471;
    private javax.swing.JLabel jLabel472;
    private javax.swing.JLabel jLabel473;
    private javax.swing.JLabel jLabel474;
    private javax.swing.JLabel jLabel475;
    private javax.swing.JLabel jLabel476;
    private javax.swing.JLabel jLabel477;
    private javax.swing.JLabel jLabel478;
    private javax.swing.JLabel jLabel479;
    private javax.swing.JLabel jLabel480;
    private javax.swing.JLabel jLabel481;
    private javax.swing.JLabel jLabel482;
    private javax.swing.JLabel jLabel483;
    private javax.swing.JLabel jLabel484;
    private javax.swing.JLabel jLabel485;
    private javax.swing.JLabel jLabel486;
    private javax.swing.JLabel jLabel487;
    private javax.swing.JLabel jLabel488;
    private javax.swing.JLabel jLabel489;
    private javax.swing.JLabel jLabel490;
    private javax.swing.JLabel jLabel491;
    private javax.swing.JLabel jLabel492;
    private javax.swing.JLabel jLabel493;
    private javax.swing.JLabel jLabel494;
    private javax.swing.JLabel jLabel495;
    private javax.swing.JLabel jLabel496;
    private javax.swing.JLabel jLabel497;
    private javax.swing.JLabel jLabel504;
    private javax.swing.JLabel jLabel505;
    private javax.swing.JLabel jLabel506;
    private javax.swing.JLabel jLabel507;
    private javax.swing.JLabel jLabel508;
    private javax.swing.JLabel jLabel509;
    private javax.swing.JLabel jLabel510;
    private javax.swing.JLabel jLabel511;
    private javax.swing.JLabel jLabel512;
    private javax.swing.JLabel jLabel513;
    private javax.swing.JLabel jLabel514;
    private javax.swing.JLabel jLabel515;
    private javax.swing.JLabel jLabel516;
    private javax.swing.JLabel jLabel517;
    private javax.swing.JLabel jLabel518;
    private javax.swing.JLabel jLabel531;
    private javax.swing.JLabel jLabel532;
    private javax.swing.JLabel jLabel533;
    private javax.swing.JLabel jLabel534;
    private javax.swing.JLabel jLabel535;
    private javax.swing.JLabel jLabel536;
    private javax.swing.JLabel jLabel537;
    private javax.swing.JLabel jLabel538;
    private javax.swing.JLabel jLabel539;
    private javax.swing.JLabel jLabel540;
    private javax.swing.JLabel jLabel541;
    private javax.swing.JLabel jLabel542;
    private javax.swing.JLabel jLabel543;
    private javax.swing.JLabel jLabel544;
    private javax.swing.JLabel jLabel545;
    private javax.swing.JLabel jLabel546;
    private javax.swing.JLabel jLabel547;
    private javax.swing.JLabel jLabel548;
    private javax.swing.JLabel jLabel549;
    private javax.swing.JLabel jLabel550;
    private javax.swing.JLabel jLabel551;
    private javax.swing.JLabel jLabel555;
    private javax.swing.JLabel jLabel556;
    private javax.swing.JLabel jLabel557;
    private javax.swing.JLabel jLabel564;
    private javax.swing.JLabel jLabel565;
    private javax.swing.JLabel jLabel566;
    private javax.swing.JLabel jLabel567;
    private javax.swing.JLabel jLabel568;
    private javax.swing.JLabel jLabel569;
    private javax.swing.JLabel jLabel570;
    private javax.swing.JLabel jLabel571;
    private javax.swing.JLabel jLabel572;
    private javax.swing.JLabel jLabel573;
    private javax.swing.JLabel jLabel574;
    private javax.swing.JLabel jLabel575;
    private javax.swing.JLabel jLabel576;
    private javax.swing.JLabel jLabel577;
    private javax.swing.JLabel jLabel578;
    private javax.swing.JLabel jLabel579;
    private javax.swing.JLabel jLabel580;
    private javax.swing.JLabel jLabel581;
    private javax.swing.JLabel jLabel582;
    private javax.swing.JLabel jLabel583;
    private javax.swing.JLabel jLabel584;
    private javax.swing.JLabel jLabel585;
    private javax.swing.JLabel jLabel586;
    private javax.swing.JLabel jLabel587;
    private javax.swing.JLabel jLabel588;
    private javax.swing.JLabel jLabel589;
    private javax.swing.JLabel jLabel590;
    private javax.swing.JLabel jLabel591;
    private javax.swing.JLabel jLabel592;
    private javax.swing.JLabel jLabel593;
    private javax.swing.JLabel jLabel594;
    private javax.swing.JLabel jLabel595;
    private javax.swing.JLabel jLabel596;
    private javax.swing.JLabel jLabel597;
    private javax.swing.JLabel jLabel598;
    private javax.swing.JLabel jLabel599;
    private javax.swing.JLabel jLabel600;
    private javax.swing.JLabel jLabel601;
    private javax.swing.JLabel jLabel602;
    private javax.swing.JLabel jLabel603;
    private javax.swing.JLabel jLabel604;
    private javax.swing.JLabel jLabel611;
    private javax.swing.JLabel jLabel612;
    private javax.swing.JLabel jLabel613;
    private javax.swing.JLabel jLabel614;
    private javax.swing.JLabel jLabel615;
    private javax.swing.JLabel jLabel616;
    private javax.swing.JLabel jLabel617;
    private javax.swing.JLabel jLabel618;
    private javax.swing.JLabel jLabel619;
    private javax.swing.JLabel jLabel620;
    private javax.swing.JLabel jLabel621;
    private javax.swing.JLabel jLabel622;
    private javax.swing.JLabel jLabel623;
    private javax.swing.JLabel jLabel624;
    private javax.swing.JLabel jLabel625;
    private javax.swing.JLabel jLabel626;
    private javax.swing.JLabel jLabel627;
    private javax.swing.JLabel jLabel628;
    private javax.swing.JLabel jLabel629;
    private javax.swing.JLabel jLabel630;
    private javax.swing.JLabel jLabel631;
    private javax.swing.JLabel jLabel632;
    private javax.swing.JLabel jLabel633;
    private javax.swing.JLabel jLabel634;
    private javax.swing.JLabel jLabel635;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator135;
    private javax.swing.JSeparator jSeparator136;
    private javax.swing.JSeparator jSeparator137;
    private javax.swing.JSeparator jSeparator138;
    private javax.swing.JSeparator jSeparator139;
    private javax.swing.JSeparator jSeparator140;
    private javax.swing.JSeparator jSeparator141;
    private javax.swing.JSeparator jSeparator142;
    private javax.swing.JSeparator jSeparator143;
    private javax.swing.JSeparator jSeparator144;
    private javax.swing.JSeparator jSeparator145;
    private javax.swing.JSeparator jSeparator157;
    private javax.swing.JSeparator jSeparator158;
    private javax.swing.JSeparator jSeparator159;
    private javax.swing.JSeparator jSeparator160;
    private javax.swing.JSeparator jSeparator161;
    private javax.swing.JSeparator jSeparator162;
    private javax.swing.JSeparator jSeparator163;
    private javax.swing.JSeparator jSeparator164;
    private javax.swing.JSeparator jSeparator166;
    private javax.swing.JSeparator jSeparator167;
    private javax.swing.JSeparator jSeparator168;
    private javax.swing.JSeparator jSeparator169;
    private javax.swing.JSeparator jSeparator170;
    private javax.swing.JSeparator jSeparator174;
    private javax.swing.JSeparator jSeparator175;
    private javax.swing.JSeparator jSeparator176;
    private javax.swing.JSeparator jSeparator177;
    private javax.swing.JSeparator jSeparator178;
    private javax.swing.JSeparator jSeparator183;
    private javax.swing.JSeparator jSeparator184;
    private javax.swing.JSeparator jSeparator185;
    private javax.swing.JSeparator jSeparator186;
    private javax.swing.JSeparator jSeparator187;
    private javax.swing.JSeparator jSeparator188;
    private javax.swing.JSeparator jSeparator189;
    private javax.swing.JSeparator jSeparator190;
    private javax.swing.JSeparator jSeparator192;
    private javax.swing.JSeparator jSeparator195;
    private javax.swing.JSeparator jSeparator196;
    private javax.swing.JSeparator jSeparator197;
    private javax.swing.JSeparator jSeparator198;
    private javax.swing.JSeparator jSeparator199;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator200;
    private javax.swing.JSeparator jSeparator201;
    private javax.swing.JSeparator jSeparator202;
    private javax.swing.JSeparator jSeparator203;
    private javax.swing.JSeparator jSeparator206;
    private javax.swing.JSeparator jSeparator207;
    private javax.swing.JSeparator jSeparator208;
    private javax.swing.JSeparator jSeparator209;
    private javax.swing.JSeparator jSeparator210;
    private javax.swing.JSeparator jSeparator211;
    private javax.swing.JSeparator jSeparator212;
    private javax.swing.JSeparator jSeparator213;
    private javax.swing.JSeparator jSeparator214;
    private javax.swing.JSeparator jSeparator215;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelProductos;
    private PanelPersonalizado.PanelRound panelRound137;
    private PanelPersonalizado.PanelRound panelRound138;
    private PanelPersonalizado.PanelRound panelRound139;
    private PanelPersonalizado.PanelRound panelRound140;
    private PanelPersonalizado.PanelRound panelRound141;
    private PanelPersonalizado.PanelRound panelRound142;
    private PanelPersonalizado.PanelRound panelRound143;
    private PanelPersonalizado.PanelRound panelRound144;
    private PanelPersonalizado.PanelRound panelRound145;
    private PanelPersonalizado.PanelRound panelRound146;
    private PanelPersonalizado.PanelRound panelRound147;
    private PanelPersonalizado.PanelRound panelRound159;
    private PanelPersonalizado.PanelRound panelRound160;
    private PanelPersonalizado.PanelRound panelRound161;
    private PanelPersonalizado.PanelRound panelRound162;
    private PanelPersonalizado.PanelRound panelRound163;
    private PanelPersonalizado.PanelRound panelRound164;
    private PanelPersonalizado.PanelRound panelRound165;
    private PanelPersonalizado.PanelRound panelRound166;
    private PanelPersonalizado.PanelRound panelRound167;
    private PanelPersonalizado.PanelRound panelRound168;
    private PanelPersonalizado.PanelRound panelRound169;
    private PanelPersonalizado.PanelRound panelRound172;
    private PanelPersonalizado.PanelRound panelRound173;
    private PanelPersonalizado.PanelRound panelRound174;
    private PanelPersonalizado.PanelRound panelRound175;
    private PanelPersonalizado.PanelRound panelRound176;
    private PanelPersonalizado.PanelRound panelRound181;
    private PanelPersonalizado.PanelRound panelRound182;
    private PanelPersonalizado.PanelRound panelRound183;
    private PanelPersonalizado.PanelRound panelRound184;
    private PanelPersonalizado.PanelRound panelRound185;
    private PanelPersonalizado.PanelRound panelRound186;
    private PanelPersonalizado.PanelRound panelRound187;
    private PanelPersonalizado.PanelRound panelRound189;
    private PanelPersonalizado.PanelRound panelRound192;
    private PanelPersonalizado.PanelRound panelRound193;
    private PanelPersonalizado.PanelRound panelRound194;
    private PanelPersonalizado.PanelRound panelRound195;
    private PanelPersonalizado.PanelRound panelRound196;
    private PanelPersonalizado.PanelRound panelRound197;
    private PanelPersonalizado.PanelRound panelRound198;
    private PanelPersonalizado.PanelRound panelRound199;
    private PanelPersonalizado.PanelRound panelRound200;
    private PanelPersonalizado.PanelRound panelRound203;
    private PanelPersonalizado.PanelRound panelRound204;
    private PanelPersonalizado.PanelRound panelRound205;
    private PanelPersonalizado.PanelRound panelRound206;
    private PanelPersonalizado.PanelRound panelRound207;
    private PanelPersonalizado.PanelRound panelRound208;
    private PanelPersonalizado.PanelRound panelRound209;
    private PanelPersonalizado.PanelRound panelRound210;
    private PanelPersonalizado.PanelRound panelRound211;
    private PanelPersonalizado.PanelRound panelRound51;
    private PanelPersonalizado.PanelRound panelRound53;
    private PanelPersonalizado.PanelRound panelRound54;
    private PanelPersonalizado.PanelRound panelRound55;
    private PanelPersonalizado.PanelRound panelRound57;
    private PanelPersonalizado.PanelRound panelRound65;
    private PanelPersonalizado.PanelRound panelRound67;
    private PanelPersonalizado.PanelRound panelRound69;
    private PanelPersonalizado.PanelRound panelRound70;
    // End of variables declaration//GEN-END:variables
}
