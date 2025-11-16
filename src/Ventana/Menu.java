package Ventana;

import Code.Empleado;
import java.awt.Color;
import static java.lang.System.exit;

public class Menu extends javax.swing.JFrame {

    int mousepX;
    int mousepY;

    //CONSTRUCTOR
    public Menu(Empleado ref) {
        initComponents();
        String userPr = ref.getNombre() + " " + ref.getApellido();
        luserprofile.setText(userPr.toUpperCase());
        lrolprofile.setText(ref.getRol());
        setLocationRelativeTo(null);
    }

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        perfilmenu = new javax.swing.JPanel();
        imgpersona = new javax.swing.JLabel();
        lrolprofile = new javax.swing.JLabel();
        luserprofile = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lejem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lejem2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lejem3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lejem4 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        pexit = new javax.swing.JPanel();
        lexit = new javax.swing.JLabel();
        pminus = new javax.swing.JPanel();
        lminus = new javax.swing.JLabel();
        jMenu = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 70));

        menu.setBackground(new java.awt.Color(121, 180, 239));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perfilmenu.setBackground(new java.awt.Color(43, 137, 230));
        perfilmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgpersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgpersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconmenu.png"))); // NOI18N
        perfilmenu.add(imgpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, -1));

        lrolprofile.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lrolprofile.setForeground(new java.awt.Color(255, 255, 255));
        lrolprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lrolprofile.setText("ROL");
        perfilmenu.add(lrolprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, -1));

        luserprofile.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        luserprofile.setForeground(new java.awt.Color(255, 255, 255));
        luserprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        luserprofile.setText("USUARIO");
        perfilmenu.add(luserprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, -1));

        menu.add(perfilmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 190));

        jPanel1.setBackground(new java.awt.Color(121, 180, 239));

        lejem.setBackground(new java.awt.Color(43, 137, 230));
        lejem.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lejem.setForeground(new java.awt.Color(255, 255, 255));
        lejem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lejem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconEmplead.png"))); // NOI18N
        lejem.setText("  EMPLEADOS ");
        lejem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lejemMouseMoved(evt);
            }
        });
        lejem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lejemMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lejemMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lejem, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lejem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 47));

        jPanel2.setBackground(new java.awt.Color(121, 180, 239));

        lejem2.setBackground(new java.awt.Color(43, 137, 230));
        lejem2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lejem2.setForeground(new java.awt.Color(255, 255, 255));
        lejem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lejem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconHabit.png"))); // NOI18N
        lejem2.setText("HABITACIONES");
        lejem2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lejem2MouseMoved(evt);
            }
        });
        lejem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lejem2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lejem2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lejem2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lejem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 47));

        jPanel3.setBackground(new java.awt.Color(121, 180, 239));

        lejem3.setBackground(new java.awt.Color(43, 137, 230));
        lejem3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lejem3.setForeground(new java.awt.Color(255, 255, 255));
        lejem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lejem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icongest.png"))); // NOI18N
        lejem3.setText("  GESTION");
        lejem3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lejem3MouseMoved(evt);
            }
        });
        lejem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lejem3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lejem3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lejem3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lejem3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        menu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 230, 47));

        jPanel4.setBackground(new java.awt.Color(121, 180, 239));

        lejem4.setBackground(new java.awt.Color(43, 137, 230));
        lejem4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lejem4.setForeground(new java.awt.Color(255, 255, 255));
        lejem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lejem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconInfo.png"))); // NOI18N
        lejem4.setText("  REPORTES");
        lejem4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lejem4MouseMoved(evt);
            }
        });
        lejem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lejem4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lejem4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lejem4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lejem4, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        menu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 47));

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 610));

        dashboard.setBackground(new java.awt.Color(43, 137, 230));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pexit.setBackground(new java.awt.Color(43, 137, 230));
        pexit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pexitMouseMoved(evt);
            }
        });
        pexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pexitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pexitMouseExited(evt);
            }
        });

        lexit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        lexit.setForeground(new java.awt.Color(255, 255, 255));
        lexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lexit.setText("X");
        lexit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lexitMouseMoved(evt);
            }
        });
        lexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lexitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lexitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pexitLayout = new javax.swing.GroupLayout(pexit);
        pexit.setLayout(pexitLayout);
        pexitLayout.setHorizontalGroup(
            pexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        pexitLayout.setVerticalGroup(
            pexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        dashboard.add(pexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        pminus.setBackground(new java.awt.Color(43, 137, 230));

        lminus.setBackground(new java.awt.Color(43, 137, 230));
        lminus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        lminus.setForeground(new java.awt.Color(255, 255, 255));
        lminus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lminus.setText("__");
        lminus.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lminus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lminusMouseMoved(evt);
            }
        });
        lminus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lminusMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lminusMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pminusLayout = new javax.swing.GroupLayout(pminus);
        pminus.setLayout(pminusLayout);
        pminusLayout.setHorizontalGroup(
            pminusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pminusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lminus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pminusLayout.setVerticalGroup(
            pminusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lminus, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        dashboard.add(pminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        bg.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 710, 70));

        jMenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jMenu.addTab("tab1", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PRIMER MENU");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        jMenu.addTab("tab2", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("SEGUNDO MENU");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addContainerGap(377, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(448, Short.MAX_VALUE))
        );

        jMenu.addTab("tab3", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TERCER MENU");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(442, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        jMenu.addTab("tab4", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CUARTO MENU");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addContainerGap(421, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(454, Short.MAX_VALUE))
        );

        jMenu.addTab("tab5", jPanel10);

        bg.add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 710, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lejemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejemMouseMoved
        jPanel1.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_lejemMouseMoved

    private void lejemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejemMouseExited
        jPanel1.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_lejemMouseExited

    private void lejem2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem2MouseMoved
        jPanel2.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_lejem2MouseMoved

    private void lejem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem2MouseExited
        jPanel2.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_lejem2MouseExited

    //UNDERCORATE MOUSE BARRA MENU
    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int cordsX = evt.getXOnScreen();
        int cordsY = evt.getYOnScreen();

        this.setLocation(cordsX - mousepX, cordsY - mousepY);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void lminusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lminusMouseExited
        pminus.setBackground(new Color(43, 137, 230));
    }//GEN-LAST:event_lminusMouseExited

    private void lminusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lminusMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lminusMouseClicked

    private void lminusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lminusMouseMoved
        pminus.setBackground(new Color(227, 81, 54));
    }//GEN-LAST:event_lminusMouseMoved

    private void pexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pexitMouseExited
        pexit.setBackground(new Color(43, 137, 230));
    }//GEN-LAST:event_pexitMouseExited

    private void pexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pexitMouseClicked
        exit(0);
    }//GEN-LAST:event_pexitMouseClicked

    private void pexitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pexitMouseMoved
        pexit.setBackground(new Color(227, 81, 54));
    }//GEN-LAST:event_pexitMouseMoved

    private void lexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lexitMouseExited
        pexit.setBackground(new Color(43, 137, 230));
    }//GEN-LAST:event_lexitMouseExited

    private void lexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lexitMouseClicked
        exit(0);
    }//GEN-LAST:event_lexitMouseClicked

    private void lexitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lexitMouseMoved
        pexit.setBackground(new Color(227, 81, 54));
    }//GEN-LAST:event_lexitMouseMoved

    private void lejemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejemMouseClicked
        jMenu.setSelectedIndex(1);
    }//GEN-LAST:event_lejemMouseClicked

    private void lejem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem2MouseClicked
        jMenu.setSelectedIndex(2);
    }//GEN-LAST:event_lejem2MouseClicked

    private void lejem3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem3MouseMoved
        jPanel3.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_lejem3MouseMoved

    private void lejem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem3MouseClicked
        jMenu.setSelectedIndex(3);
    }//GEN-LAST:event_lejem3MouseClicked

    private void lejem3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem3MouseExited
        jPanel3.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_lejem3MouseExited

    private void lejem4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem4MouseMoved
        jPanel4.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_lejem4MouseMoved

    private void lejem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem4MouseClicked
        jMenu.setSelectedIndex(4);
    }//GEN-LAST:event_lejem4MouseClicked

    private void lejem4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem4MouseExited
        jPanel4.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_lejem4MouseExited

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel imgpersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lejem;
    private javax.swing.JLabel lejem2;
    private javax.swing.JLabel lejem3;
    private javax.swing.JLabel lejem4;
    private javax.swing.JLabel lexit;
    private javax.swing.JLabel lminus;
    private javax.swing.JLabel lrolprofile;
    private javax.swing.JLabel luserprofile;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel perfilmenu;
    private javax.swing.JPanel pexit;
    private javax.swing.JPanel pminus;
    // End of variables declaration//GEN-END:variables
}
