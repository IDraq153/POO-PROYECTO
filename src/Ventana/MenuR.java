package Ventana;

import Code.Empleado;
import java.awt.Color;
import static java.lang.System.exit;

public class MenuR extends javax.swing.JFrame {
    //VARIABLES
    int mousepX;
    int mousepY;
    
    //CONSTRUCTOR
    public MenuR(Empleado ref) {
        initComponents();
        String userPr = ref.getNombre() + " " + ref.getApellido();
        luserprofile.setText(userPr.toUpperCase());
        lrolprofile.setText("RECEPCIONISTA");
        setLocationRelativeTo(null);
    }

    private MenuR() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        arrastar = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        perfilmenu = new javax.swing.JPanel();
        imgpersona = new javax.swing.JLabel();
        lrolprofile = new javax.swing.JLabel();
        luserprofile = new javax.swing.JLabel();
        panelPEmpleados = new javax.swing.JPanel();
        lpEmpleados = new javax.swing.JLabel();
        mpAgregar = new javax.swing.JPanel();
        mlAgregar = new javax.swing.JLabel();
        mpEliminar = new javax.swing.JPanel();
        mlEliminar = new javax.swing.JLabel();
        mpModificar = new javax.swing.JPanel();
        mlModificar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lejem4 = new javax.swing.JLabel();
        panelPHabitaciones = new javax.swing.JPanel();
        lpHabitaciones = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        pexit = new javax.swing.JPanel();
        lexit = new javax.swing.JLabel();
        pminus = new javax.swing.JPanel();
        lminus = new javax.swing.JLabel();
        jMenu = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pEmpleado = new javax.swing.JPanel();
        pAgregar = new javax.swing.JPanel();
        lnombre = new javax.swing.JLabel();
        inombre = new javax.swing.JTextField();
        bagregar = new javax.swing.JButton();
        inombre1 = new javax.swing.JTextField();
        lnombre1 = new javax.swing.JLabel();
        cAdmin = new javax.swing.JRadioButton();
        cAdmin1 = new javax.swing.JRadioButton();
        lnombre2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arrastar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                arrastarMouseDragged(evt);
            }
        });
        arrastar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                arrastarMousePressed(evt);
            }
        });
        bg.add(arrastar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 70));

        menu.setBackground(new java.awt.Color(121, 180, 239));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perfilmenu.setBackground(new java.awt.Color(43, 137, 230));
        perfilmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgpersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgpersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconmenu.png"))); // NOI18N
        perfilmenu.add(imgpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 230, -1));

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

        panelPEmpleados.setBackground(new java.awt.Color(92, 164, 235));

        lpEmpleados.setBackground(new java.awt.Color(43, 137, 230));
        lpEmpleados.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lpEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lpEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconEmplead.png"))); // NOI18N
        lpEmpleados.setText("HUESPEDES");
        lpEmpleados.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lpEmpleados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lpEmpleadosMouseMoved(evt);
            }
        });
        lpEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpEmpleadosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lpEmpleadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPEmpleadosLayout = new javax.swing.GroupLayout(panelPEmpleados);
        panelPEmpleados.setLayout(panelPEmpleadosLayout);
        panelPEmpleadosLayout.setHorizontalGroup(
            panelPEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPEmpleadosLayout.createSequentialGroup()
                .addComponent(lpEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPEmpleadosLayout.setVerticalGroup(
            panelPEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menu.add(panelPEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 40));

        mpAgregar.setBackground(new java.awt.Color(121, 180, 239));

        mlAgregar.setBackground(new java.awt.Color(43, 137, 230));
        mlAgregar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        mlAgregar.setForeground(new java.awt.Color(255, 255, 255));
        mlAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlAgregar.setText("Registrar Huesped");
        mlAgregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlAgregarMouseMoved(evt);
            }
        });
        mlAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlAgregarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlAgregarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpAgregarLayout = new javax.swing.GroupLayout(mpAgregar);
        mpAgregar.setLayout(mpAgregarLayout);
        mpAgregarLayout.setHorizontalGroup(
            mpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpAgregarLayout.createSequentialGroup()
                .addComponent(mlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpAgregarLayout.setVerticalGroup(
            mpAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, 20));

        mpEliminar.setBackground(new java.awt.Color(121, 180, 239));

        mlEliminar.setBackground(new java.awt.Color(43, 137, 230));
        mlEliminar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        mlEliminar.setForeground(new java.awt.Color(255, 255, 255));
        mlEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlEliminar.setText("Modificar Huesped");
        mlEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlEliminarMouseMoved(evt);
            }
        });
        mlEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlEliminarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpEliminarLayout = new javax.swing.GroupLayout(mpEliminar);
        mpEliminar.setLayout(mpEliminarLayout);
        mpEliminarLayout.setHorizontalGroup(
            mpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpEliminarLayout.createSequentialGroup()
                .addComponent(mlEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpEliminarLayout.setVerticalGroup(
            mpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 20));

        mpModificar.setBackground(new java.awt.Color(121, 180, 239));

        mlModificar.setBackground(new java.awt.Color(43, 137, 230));
        mlModificar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        mlModificar.setForeground(new java.awt.Color(255, 255, 255));
        mlModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlModificar.setText("Eliminar Huesped");
        mlModificar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlModificarMouseMoved(evt);
            }
        });
        mlModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlModificarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlModificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpModificarLayout = new javax.swing.GroupLayout(mpModificar);
        mpModificar.setLayout(mpModificarLayout);
        mpModificarLayout.setHorizontalGroup(
            mpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpModificarLayout.createSequentialGroup()
                .addComponent(mlModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpModificarLayout.setVerticalGroup(
            mpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 20));

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

        menu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 230, 47));

        panelPHabitaciones.setBackground(new java.awt.Color(92, 164, 235));

        lpHabitaciones.setBackground(new java.awt.Color(43, 137, 230));
        lpHabitaciones.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lpHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        lpHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconHabit.png"))); // NOI18N
        lpHabitaciones.setText("RESERVACIONES");
        lpHabitaciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lpHabitaciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lpHabitacionesMouseMoved(evt);
            }
        });
        lpHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpHabitacionesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lpHabitacionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPHabitacionesLayout = new javax.swing.GroupLayout(panelPHabitaciones);
        panelPHabitaciones.setLayout(panelPHabitacionesLayout);
        panelPHabitacionesLayout.setHorizontalGroup(
            panelPHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPHabitacionesLayout.createSequentialGroup()
                .addComponent(lpHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPHabitacionesLayout.setVerticalGroup(
            panelPHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpHabitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menu.add(panelPHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 40));

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

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        jMenu.addTab("tab2", jPanel7);

        pEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        pEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pAgregar.setBackground(new java.awt.Color(204, 204, 204));
        pAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombre.setForeground(new java.awt.Color(51, 51, 51));
        lnombre.setText("NOMBRE");
        pAgregar.add(lnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        inombre.setBackground(new java.awt.Color(153, 153, 153));
        inombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombre.setForeground(new java.awt.Color(255, 255, 255));
        inombre.setText("  ");
        inombre.setBorder(null);
        inombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombreActionPerformed(evt);
            }
        });
        pAgregar.add(inombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 150, 25));

        bagregar.setBackground(new java.awt.Color(102, 102, 102));
        bagregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bagregar.setForeground(new java.awt.Color(255, 255, 255));
        bagregar.setText("AGREGAR");
        bagregar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });
        pAgregar.add(bagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 120, 30));

        inombre1.setBackground(new java.awt.Color(153, 153, 153));
        inombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombre1.setForeground(new java.awt.Color(255, 255, 255));
        inombre1.setText("  ");
        inombre1.setBorder(null);
        inombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombre1ActionPerformed(evt);
            }
        });
        pAgregar.add(inombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, 25));

        lnombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombre1.setForeground(new java.awt.Color(51, 51, 51));
        lnombre1.setText("PUESTO DE TRABAJO");
        pAgregar.add(lnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 89, -1, -1));

        cAdmin.setForeground(new java.awt.Color(51, 51, 51));
        cAdmin.setText("RECEPCIONISTA");
        cAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAdminActionPerformed(evt);
            }
        });
        pAgregar.add(cAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        cAdmin1.setForeground(new java.awt.Color(51, 51, 51));
        cAdmin1.setText("ADMINISTRADOR");
        cAdmin1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAdmin1ActionPerformed(evt);
            }
        });
        pAgregar.add(cAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lnombre2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombre2.setForeground(new java.awt.Color(51, 51, 51));
        lnombre2.setText("APELLIDOS");
        pAgregar.add(lnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        pEmpleado.add(pAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 280, 500));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pEmpleado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 380, 500));

        jMenu.addTab("tab1", pEmpleado);

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

    private void cAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAdmin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAdmin1ActionPerformed

    private void cAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAdminActionPerformed

    private void inombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombre1ActionPerformed

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed

    }//GEN-LAST:event_bagregarActionPerformed

    private void inombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombreActionPerformed

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

    private void lpHabitacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpHabitacionesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lpHabitacionesMouseExited

    private void lpHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpHabitacionesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lpHabitacionesMouseClicked

    private void lpHabitacionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpHabitacionesMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lpHabitacionesMouseMoved

    private void lejem4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem4MouseExited
        jPanel4.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_lejem4MouseExited

    private void lejem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem4MouseClicked
        jMenu.setSelectedIndex(4);
    }//GEN-LAST:event_lejem4MouseClicked

    private void lejem4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lejem4MouseMoved
        jPanel4.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_lejem4MouseMoved

    private void mlModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarMouseExited
        mpModificar.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlModificarMouseExited

    private void mlModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarMouseClicked
        jMenu.setSelectedIndex(3);
    }//GEN-LAST:event_mlModificarMouseClicked

    private void mlModificarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarMouseMoved
        mpModificar.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlModificarMouseMoved

    private void mlEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarMouseExited
        mpEliminar.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlEliminarMouseExited

    private void mlEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarMouseClicked
        jMenu.setSelectedIndex(2);
    }//GEN-LAST:event_mlEliminarMouseClicked

    private void mlEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarMouseMoved
        mpEliminar.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlEliminarMouseMoved

    private void mlAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarMouseExited
        mpAgregar.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlAgregarMouseExited

    private void mlAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarMouseClicked
        jMenu.setSelectedIndex(1);
    }//GEN-LAST:event_mlAgregarMouseClicked

    private void mlAgregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarMouseMoved
        mpAgregar.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlAgregarMouseMoved

    private void lpEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpEmpleadosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lpEmpleadosMouseExited

    private void lpEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpEmpleadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lpEmpleadosMouseClicked

    private void lpEmpleadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpEmpleadosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lpEmpleadosMouseMoved

    private void arrastarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrastarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_arrastarMousePressed

    private void arrastarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrastarMouseDragged
        int cordsX = evt.getXOnScreen();
        int cordsY = evt.getYOnScreen();

        this.setLocation(cordsX - mousepX, cordsY - mousepY);
    }//GEN-LAST:event_arrastarMouseDragged

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
            java.util.logging.Logger.getLogger(MenuR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrastar;
    private javax.swing.JButton bagregar;
    private javax.swing.JPanel bg;
    private javax.swing.JRadioButton cAdmin;
    private javax.swing.JRadioButton cAdmin1;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel imgpersona;
    private javax.swing.JTextField inombre;
    private javax.swing.JTextField inombre1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jMenu;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lejem4;
    private javax.swing.JLabel lexit;
    private javax.swing.JLabel lminus;
    private javax.swing.JLabel lnombre;
    private javax.swing.JLabel lnombre1;
    private javax.swing.JLabel lnombre2;
    private javax.swing.JLabel lpEmpleados;
    private javax.swing.JLabel lpHabitaciones;
    private javax.swing.JLabel lrolprofile;
    private javax.swing.JLabel luserprofile;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel mlAgregar;
    private javax.swing.JLabel mlEliminar;
    private javax.swing.JLabel mlModificar;
    private javax.swing.JPanel mpAgregar;
    private javax.swing.JPanel mpEliminar;
    private javax.swing.JPanel mpModificar;
    private javax.swing.JPanel pAgregar;
    private javax.swing.JPanel pEmpleado;
    private javax.swing.JPanel panelPEmpleados;
    private javax.swing.JPanel panelPHabitaciones;
    private javax.swing.JPanel perfilmenu;
    private javax.swing.JPanel pexit;
    private javax.swing.JPanel pminus;
    // End of variables declaration//GEN-END:variables
}
