package Ventana;

import Code.Administrador;
import Code.Empleado;
import Code.GestionPersona;
import Code.Recepcionista;
import java.awt.Color;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    private Empleado[] arreglo;
    GestionPersona GP = new GestionPersona();

    //CONSTRUCTOR
    public LogIn() {
        initComponents();
        Administrador adm = new Administrador("DARIO", "RUA", "ADMIN", "60789650", "Dar123", "123");
        Recepcionista rec = new Recepcionista("MARIA", "MENDA", "REC", "8313912", "Mar12", "153");
        GP.IngresarE(adm);
        GP.IngresarE(rec);
        arreglo = GP.getArregloPersona();

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        plogin = new javax.swing.JPanel();
        licono = new javax.swing.JLabel();
        ltitlelog = new javax.swing.JLabel();
        icontra = new javax.swing.JPasswordField();
        iuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        botonIngresar = new javax.swing.JButton();
        lcontra = new javax.swing.JLabel();
        luser = new javax.swing.JLabel();
        pexit = new javax.swing.JPanel();
        lexit = new javax.swing.JLabel();
        pminus = new javax.swing.JPanel();
        lminus = new javax.swing.JLabel();
        pimglogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        decologin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setName("Login"); // NOI18N
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
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        plogin.setBackground(new java.awt.Color(255, 255, 255));
        plogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        licono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        licono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconlog.png"))); // NOI18N
        plogin.add(licono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 530, 200));

        ltitlelog.setBackground(new java.awt.Color(102, 102, 102));
        ltitlelog.setFont(new java.awt.Font("Tw Cen MT", 1, 55)); // NOI18N
        ltitlelog.setForeground(new java.awt.Color(102, 102, 102));
        ltitlelog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ltitlelog.setText("LOGIN");
        ltitlelog.setToolTipText("");
        plogin.add(ltitlelog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 530, 60));

        icontra.setBackground(new java.awt.Color(255, 255, 255));
        icontra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        icontra.setBorder(null);
        icontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icontraActionPerformed(evt);
            }
        });
        plogin.add(icontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 240, 20));

        iuser.setBackground(new java.awt.Color(255, 255, 255));
        iuser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iuser.setBorder(null);
        iuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iuserActionPerformed(evt);
            }
        });
        plogin.add(iuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 240, 20));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        plogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 240, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        plogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 240, -1));

        botonIngresar.setBackground(new java.awt.Color(60, 117, 232));
        botonIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("INGRESAR");
        botonIngresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        plogin.add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 120, 40));

        lcontra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcontra.setForeground(new java.awt.Color(102, 102, 102));
        lcontra.setText("CONTRASEÑA");
        plogin.add(lcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, 20));

        luser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        luser.setForeground(new java.awt.Color(102, 102, 102));
        luser.setText("USUARIO");
        plogin.add(luser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 20));

        pexit.setBackground(new java.awt.Color(255, 255, 255));
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

        plogin.add(pexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 40, 20));

        pminus.setBackground(new java.awt.Color(255, 255, 255));

        lminus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
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

        plogin.add(pminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 40, 20));

        bg.add(plogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 530, 600));

        pimglogin.setBackground(new java.awt.Color(153, 204, 255));
        pimglogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconomenu.png"))); // NOI18N
        pimglogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 400, 120));

        decologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city.png"))); // NOI18N
        pimglogin.add(decologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        bg.add(pimglogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

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

    private void iuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iuserActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed

        boolean mal = false;
        String user = iuser.getText();
        String contra = icontra.getText();
        
        if (user.isEmpty() || contra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algun campo esta vacio");
        } else {
            for (int i = 0; i < GP.getConta(); i++) {
                if (user.equals(arreglo[i].getUser()) && contra.equals(arreglo[i].getContra())) {
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    if (arreglo[i].getRol().equalsIgnoreCase("ADMIN")) {
                        Menu m2 = new Menu(arreglo[i]);
                        m2.setVisible(true);
                        mal = false;    
                        this.setVisible(false);
                        break;
                    } else if (arreglo[i].getRol().equalsIgnoreCase("REC")) {
                        MenuR m3 = new MenuR(arreglo[i]);
                        m3.setVisible(true);
                        mal = false;
                        this.setVisible(false);
                        break;
                    }
                    
                } else {
                    iuser.setText("");
                    icontra.setText("");
                    mal = true;
                }
            }
            if (mal == true) {
                JOptionPane.showMessageDialog(null, "Su usuario o contraseña son incorrectas");
            }
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void icontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icontraActionPerformed

    private void pexitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pexitMouseMoved
        pexit.setBackground(new Color(227, 81, 54));
    }//GEN-LAST:event_pexitMouseMoved

    private void pexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pexitMouseExited
        pexit.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_pexitMouseExited

    private void pexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pexitMouseClicked
        exit(0);
    }//GEN-LAST:event_pexitMouseClicked

    private void lexitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lexitMouseMoved
        pexit.setBackground(new Color(227, 81, 54));
    }//GEN-LAST:event_lexitMouseMoved

    private void lexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lexitMouseExited
        pexit.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lexitMouseExited

    private void lexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lexitMouseClicked
        exit(0);
    }//GEN-LAST:event_lexitMouseClicked

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
        pminus.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lminusMouseExited

    private void lminusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lminusMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lminusMouseClicked

    private void lminusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lminusMouseMoved
        pminus.setBackground(new Color(227, 81, 54));
    }//GEN-LAST:event_lminusMouseMoved

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JLabel decologin;
    private javax.swing.JPasswordField icontra;
    private javax.swing.JTextField iuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lcontra;
    private javax.swing.JLabel lexit;
    private javax.swing.JLabel licono;
    private javax.swing.JLabel lminus;
    private javax.swing.JLabel ltitlelog;
    private javax.swing.JLabel luser;
    private javax.swing.JPanel pexit;
    private javax.swing.JPanel pimglogin;
    private javax.swing.JPanel plogin;
    private javax.swing.JPanel pminus;
    // End of variables declaration//GEN-END:variables
}
