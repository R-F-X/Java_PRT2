
package com.beans.wellnesswave;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JLabel; 
import javax.swing.JOptionPane;
import java.awt.Image; 
import javax.swing.ImageIcon;

public class WWW1 extends javax.swing.JFrame {

    public WWW1() {
        initComponents();
//        setIconImage();
        
//        Image icon = new ImageIcon(this.getClass().getResource("images/icons8-url-96.png")).getImage(); 
//        this.setIconImage(icon);

//        ("images/icons8-url-96.png")));
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8-url-96.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        resourceLabel = new javax.swing.JLabel();
        advicePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        imgLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Sidebar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        homeLBtn = new javax.swing.JLabel();
        profileLBtn = new javax.swing.JLabel();
        journalLBtn = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        imgLabelSide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wellness Wave");
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(51, 0, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1050, 640));

        jPanel1.setBackground(new java.awt.Color(96, 119, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Welcome to Wellness Wave");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 500, 69));

        resourceLabel.setBackground(new java.awt.Color(118, 137, 72));
        resourceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resourceLabel.setForeground(new java.awt.Color(255, 255, 255));
        resourceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resourceLabel.setText("View Resources");
        resourceLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        resourceLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resourceLabel.setOpaque(true);
        resourceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resourceLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resourceLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resourceLabelMouseExited(evt);
            }
        });
        jPanel1.add(resourceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 131, 40));

        advicePanel.setBackground(new java.awt.Color(255, 255, 255));
        advicePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 255, 114), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 185, 12));
        jLabel1.setText("About Us");

        jScrollPane1.setBorder(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("At Wellness Wave, we believe that mental wellness is a journey to a happy and fulfilling life. We strive to empower individuals to take control of their mental health and wellbeing, and our mission is to provide a supportive community that guides you to growth and healing.\n\nBy joining the Wellness Wave, you will not only embark on a journey but also contribute to reducing stigma around mental health. We, as Wellness Wave, want to nurture minds and enrich the lives of others.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout advicePanelLayout = new javax.swing.GroupLayout(advicePanel);
        advicePanel.setLayout(advicePanelLayout);
        advicePanelLayout.setHorizontalGroup(
            advicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(advicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        advicePanelLayout.setVerticalGroup(
            advicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(advicePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 250));
        jPanel1.add(imgLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 600));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(96, 119, 68));

        jPanel4.setBackground(new java.awt.Color(193, 255, 114));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("UserName:");

        jScrollPane6.setViewportView(jTextPane5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jTextPane1);

        jScrollPane3.setViewportView(jTextPane2);

        jScrollPane4.setViewportView(jTextPane3);

        jScrollPane5.setViewportView(jTextPane4);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email Adress:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Last Name:");

        jButton1.setBackground(new java.awt.Color(118, 137, 69));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Edit");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(595, 595, 595)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5});

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(193, 255, 114));

        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton2.setBackground(new java.awt.Color(118, 137, 69));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add New Entry");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButton3.setBackground(new java.awt.Color(118, 137, 69));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View Entries");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3});

        jTabbedPane1.addTab("tab3", jPanel3);

        Sidebar.setBackground(new java.awt.Color(96, 119, 68));
        Sidebar.setPreferredSize(new java.awt.Dimension(200, 450));
        Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Cambria", 3, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(193, 255, 114));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Wellness Wave");
        Sidebar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 188, 54));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NURTURING MINDS");
        Sidebar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENRICHING LIVES");
        Sidebar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        homeLBtn.setBackground(new java.awt.Color(96, 119, 68));
        homeLBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        homeLBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeLBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLBtn.setText("Home");
        homeLBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeLBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeLBtnMouseReleased(evt);
            }
        });
        Sidebar.add(homeLBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 148, 200, 56));

        profileLBtn.setBackground(new java.awt.Color(96, 119, 68));
        profileLBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        profileLBtn.setForeground(new java.awt.Color(255, 255, 255));
        profileLBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileLBtn.setText("Profile");
        profileLBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileLBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileLBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileLBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileLBtnMouseExited(evt);
            }
        });
        Sidebar.add(profileLBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 56));

        journalLBtn.setBackground(new java.awt.Color(96, 119, 68));
        journalLBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        journalLBtn.setForeground(new java.awt.Color(255, 255, 255));
        journalLBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        journalLBtn.setText("Journal");
        journalLBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        journalLBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                journalLBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                journalLBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                journalLBtnMouseExited(evt);
            }
        });
        Sidebar.add(journalLBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 272, 200, 56));

        exitLabel.setBackground(new java.awt.Color(118, 137, 72));
        exitLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setText("Close");
        exitLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.setOpaque(true);
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLabelMouseExited(evt);
            }
        });
        Sidebar.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 486, 118, 43));
        Sidebar.add(imgLabelSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void journalLBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_journalLBtnMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_journalLBtnMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        int optionCode = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit?",
                "Exit",
                JOptionPane.PLAIN_MESSAGE);

        if (optionCode == 0) {
            dispose();
        }
    }//GEN-LAST:event_exitLabelMouseClicked

    private void exitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseEntered
        exitLabel.setBackground(Color.red);
//        exitLabel.setBackground(new Color(255,12,12));
        exitLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitLabelMouseEntered

    private void exitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseExited
        exitLabel.setBackground(Color.BLACK);
        exitLabel.setForeground(new Color(255,12,12));
    }//GEN-LAST:event_exitLabelMouseExited

    private void homeLBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBtnMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        homeLBtn.setBackground(Color.YELLOW);
        homeLBtn.setForeground(Color.BLACK);
//        homeLBtn.setBackground(Color.red);
//        homeLBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_homeLBtnMouseClicked

    private void profileLBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLBtnMouseClicked
        jTabbedPane1.setSelectedIndex(1);
        this.offHover(homeLBtn);
    }//GEN-LAST:event_profileLBtnMouseClicked

    private void homeLBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBtnMouseEntered
        this.onHover(homeLBtn);
    }//GEN-LAST:event_homeLBtnMouseEntered

    private void homeLBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBtnMouseExited
        this.offHover(homeLBtn);
    }//GEN-LAST:event_homeLBtnMouseExited

    private void profileLBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLBtnMouseEntered
        this.onHover(profileLBtn);
    }//GEN-LAST:event_profileLBtnMouseEntered

    private void profileLBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLBtnMouseExited
        this.offHover(profileLBtn);
    }//GEN-LAST:event_profileLBtnMouseExited

    private void homeLBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBtnMouseReleased
//        homeLBtn.setBackground(Color.YELLOW);
//        homeLBtn.setForeground(Color.BLACK);
        
//        this.onHover(homeLBtn);
    }//GEN-LAST:event_homeLBtnMouseReleased

    private void journalLBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_journalLBtnMouseEntered
        this.onHover(journalLBtn);
    }//GEN-LAST:event_journalLBtnMouseEntered

    private void journalLBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_journalLBtnMouseExited
        this.offHover(journalLBtn);
    }//GEN-LAST:event_journalLBtnMouseExited

    private void resourceLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resourceLabelMouseExited
        resourceLabel.setBackground(new Color(150,185,12));
        resourceLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_resourceLabelMouseExited

    private void resourceLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resourceLabelMouseEntered
        resourceLabel.setBackground(Color.BLACK);
        resourceLabel.setForeground(new Color(150,185,12));
    }//GEN-LAST:event_resourceLabelMouseEntered

    private void resourceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resourceLabelMouseClicked
        // open a new frame
        //        JFrame rFrame = new JFrame("Resources");
        //
        //        rFrame.setSize(500, 300);
        //        rFrame.setVisible(true);
        //        rFrame.setLocale(null);
        //        rFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //

        // new FrameResources().setVisible(true);
    }//GEN-LAST:event_resourceLabelMouseClicked

    // ==========================================================
    // CUSTOM METHODS
    
    // used for all buttons on side bar except for the exit button
    private void onHover(JLabel labelButton){
        labelButton.setBackground(Color.YELLOW);
        labelButton.setForeground(Color.BLACK);
    }
    private void offHover(JLabel labelButton){
        labelButton.setBackground(Color.BLACK);
        labelButton.setForeground(new Color(255,255,0));
    }
    
    // add custom icon
    
    // ==========================================================
    
    // MAIN
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
            java.util.logging.Logger.getLogger(WWW1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WWW1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WWW1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WWW1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new WWW1().setVisible(true);
            }
        });
    }
    
    // add custom icon
     private void setIconImage() {
//         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icons8-url-96.png")));
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8-url-96.png")));

        setIconImage(Toolkit.getDefaultToolkit().getImage("icons8-url-96.png"));

    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sidebar;
    private javax.swing.JPanel advicePanel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel homeLBtn;
    private javax.swing.JLabel imgLabel1;
    private javax.swing.JLabel imgLabelSide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JLabel journalLBtn;
    private javax.swing.JLabel profileLBtn;
    private javax.swing.JLabel resourceLabel;
    // End of variables declaration//GEN-END:variables
}
