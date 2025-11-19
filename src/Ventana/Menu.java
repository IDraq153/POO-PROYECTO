package Ventana;

import Code.Administrador;
import Code.Empleado;
import Code.GestionPersona;
import Code.Recepcionista;
import java.awt.Color;
import static java.lang.System.exit;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    
    //VARIABLES
    private DefaultTableModel modelo;
    private GestionPersona GP;
    private Empleado[] arreglo;
    int mousepX;
    int mousepY;

    //CONSTRUCTOR
    public Menu(Empleado ref) {
        initComponents();
        modelo = new DefaultTableModel();
        GP = new GestionPersona();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Rol");
        modelo.addColumn("Dni");
        modelo.addColumn("User");
        modelo.addColumn("Contra");
        this.jtableagregarem.setModel(modelo); 
        this.jtableEliminarEmp.setModel(modelo); 
        jtableagregarem.getTableHeader().setResizingAllowed(false);
        jtableEliminarEmp.getTableHeader().setResizingAllowed(false);
        jtableagregarem.getTableHeader().setReorderingAllowed(false);
        jtableEliminarEmp.getTableHeader().setReorderingAllowed(false);
        String userPr = ref.getNombre() + " " + ref.getApellido();
        luserprofile.setText(userPr.toUpperCase());
        lrolprofile.setText(ref.getRol().toUpperCase());
        Recepcionista refR = new Recepcionista("MARIA", "MENDA", "REC", "8313912", "Mar12", "153");
        GP.IngresarE(refR); 
        GP.IngresarE(ref);
        arreglo = GP.getArregloPersona();
        CargarTabla(); 
        setLocationRelativeTo(null);
    }

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        botonesAgregar = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        arrastar = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        perfilmenu = new javax.swing.JPanel();
        imgpersona = new javax.swing.JLabel();
        lrolprofile = new javax.swing.JLabel();
        luserprofile = new javax.swing.JLabel();
        mpMenu = new javax.swing.JPanel();
        mlMenu = new javax.swing.JLabel();
        panelPEmpleados = new javax.swing.JPanel();
        lpEmpleados = new javax.swing.JLabel();
        mpAgregar = new javax.swing.JPanel();
        mlAgregar = new javax.swing.JLabel();
        mpEliminar = new javax.swing.JPanel();
        mlEliminar = new javax.swing.JLabel();
        mpModificar = new javax.swing.JPanel();
        mlModificar = new javax.swing.JLabel();
        panelPHabitaciones = new javax.swing.JPanel();
        lpHabitaciones = new javax.swing.JLabel();
        mpAgregarH = new javax.swing.JPanel();
        mlAgregarH = new javax.swing.JLabel();
        mpEliminarH = new javax.swing.JPanel();
        mlEliminarH = new javax.swing.JLabel();
        mpModificarH = new javax.swing.JPanel();
        mlModificarH = new javax.swing.JLabel();
        panelPServicios = new javax.swing.JPanel();
        lpServicios = new javax.swing.JLabel();
        mpAgregarS = new javax.swing.JPanel();
        mlAgregarS = new javax.swing.JLabel();
        mpEliminarS = new javax.swing.JPanel();
        mlEliminarS = new javax.swing.JLabel();
        mpModificarS = new javax.swing.JPanel();
        mlModificarS = new javax.swing.JLabel();
        panelPReportes = new javax.swing.JPanel();
        lpReportes = new javax.swing.JLabel();
        mpGenInfoH = new javax.swing.JPanel();
        mlGenInfoH = new javax.swing.JLabel();
        mpGenInfoIng = new javax.swing.JPanel();
        mlGenInfoIng = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        pexit = new javax.swing.JPanel();
        lexit = new javax.swing.JLabel();
        pminus = new javax.swing.JPanel();
        lminus = new javax.swing.JLabel();
        jMenu = new javax.swing.JTabbedPane();
        jPanelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelAgregarEmp = new javax.swing.JPanel();
        pAgregar = new javax.swing.JPanel();
        lnombre = new javax.swing.JLabel();
        inombre = new javax.swing.JTextField();
        bagregar = new javax.swing.JButton();
        iapellido = new javax.swing.JTextField();
        lpuestotrabajo = new javax.swing.JLabel();
        cRecepcionita = new javax.swing.JRadioButton();
        cAdministrador = new javax.swing.JRadioButton();
        lapellido = new javax.swing.JLabel();
        idni = new javax.swing.JTextField();
        ldni = new javax.swing.JLabel();
        luser = new javax.swing.JLabel();
        iuser = new javax.swing.JTextField();
        lcontra = new javax.swing.JLabel();
        icontra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableagregarem = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanelEliminarEmp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableEliminarEmp = new javax.swing.JTable();
        pEliminar = new javax.swing.JPanel();
        lnombre1 = new javax.swing.JLabel();
        inombreC = new javax.swing.JTextField();
        beliminarEmp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanelModificarEmp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelAgregarHab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelEliminarHab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelModificarHab = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelAgregarSer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelEliminarSer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanelModificarSer = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanelInforH = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanelInfoIng = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setUndecorated(true);
        setResizable(false);

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

        mpMenu.setBackground(new java.awt.Color(72, 147, 223));

        mlMenu.setBackground(new java.awt.Color(25, 106, 187));
        mlMenu.setFont(new java.awt.Font("Segoe UI Emoji", 1, 17)); // NOI18N
        mlMenu.setForeground(new java.awt.Color(255, 255, 255));
        mlMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlMenu.setText("  MENU PRINCIPAL");
        mlMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlMenuMouseMoved(evt);
            }
        });
        mlMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlMenuMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpMenuLayout = new javax.swing.GroupLayout(mpMenu);
        mpMenu.setLayout(mpMenuLayout);
        mpMenuLayout.setHorizontalGroup(
            mpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mpMenuLayout.setVerticalGroup(
            mpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        menu.add(mpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 30));

        panelPEmpleados.setBackground(new java.awt.Color(92, 164, 235));

        lpEmpleados.setBackground(new java.awt.Color(43, 137, 230));
        lpEmpleados.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lpEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lpEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconEmplead.png"))); // NOI18N
        lpEmpleados.setText(" EMPLEADOS");
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

        menu.add(panelPEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 40));

        mpAgregar.setBackground(new java.awt.Color(121, 180, 239));

        mlAgregar.setBackground(new java.awt.Color(43, 137, 230));
        mlAgregar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlAgregar.setForeground(new java.awt.Color(255, 255, 255));
        mlAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlAgregar.setText("Agregar Empleados");
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

        menu.add(mpAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 20));

        mpEliminar.setBackground(new java.awt.Color(121, 180, 239));

        mlEliminar.setBackground(new java.awt.Color(43, 137, 230));
        mlEliminar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlEliminar.setForeground(new java.awt.Color(255, 255, 255));
        mlEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlEliminar.setText("Eliminar Empleados");
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

        menu.add(mpEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 20));

        mpModificar.setBackground(new java.awt.Color(121, 180, 239));

        mlModificar.setBackground(new java.awt.Color(43, 137, 230));
        mlModificar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlModificar.setForeground(new java.awt.Color(255, 255, 255));
        mlModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlModificar.setText("Modificar Empleado");
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

        menu.add(mpModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 20));

        panelPHabitaciones.setBackground(new java.awt.Color(92, 164, 235));

        lpHabitaciones.setBackground(new java.awt.Color(43, 137, 230));
        lpHabitaciones.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lpHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        lpHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconHabit.png"))); // NOI18N
        lpHabitaciones.setText(" HABITACIONES");
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

        menu.add(panelPHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 40));

        mpAgregarH.setBackground(new java.awt.Color(121, 180, 239));

        mlAgregarH.setBackground(new java.awt.Color(43, 137, 230));
        mlAgregarH.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlAgregarH.setForeground(new java.awt.Color(255, 255, 255));
        mlAgregarH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlAgregarH.setText("Registrar Habitacion");
        mlAgregarH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlAgregarHMouseMoved(evt);
            }
        });
        mlAgregarH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlAgregarHMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlAgregarHMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpAgregarHLayout = new javax.swing.GroupLayout(mpAgregarH);
        mpAgregarH.setLayout(mpAgregarHLayout);
        mpAgregarHLayout.setHorizontalGroup(
            mpAgregarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpAgregarHLayout.createSequentialGroup()
                .addComponent(mlAgregarH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpAgregarHLayout.setVerticalGroup(
            mpAgregarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlAgregarH, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpAgregarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 230, -1));

        mpEliminarH.setBackground(new java.awt.Color(121, 180, 239));

        mlEliminarH.setBackground(new java.awt.Color(43, 137, 230));
        mlEliminarH.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlEliminarH.setForeground(new java.awt.Color(255, 255, 255));
        mlEliminarH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlEliminarH.setText("Eliminar Habitacion");
        mlEliminarH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlEliminarHMouseMoved(evt);
            }
        });
        mlEliminarH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlEliminarHMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlEliminarHMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpEliminarHLayout = new javax.swing.GroupLayout(mpEliminarH);
        mpEliminarH.setLayout(mpEliminarHLayout);
        mpEliminarHLayout.setHorizontalGroup(
            mpEliminarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpEliminarHLayout.createSequentialGroup()
                .addComponent(mlEliminarH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpEliminarHLayout.setVerticalGroup(
            mpEliminarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlEliminarH, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpEliminarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 230, 20));

        mpModificarH.setBackground(new java.awt.Color(121, 180, 239));

        mlModificarH.setBackground(new java.awt.Color(43, 137, 230));
        mlModificarH.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlModificarH.setForeground(new java.awt.Color(255, 255, 255));
        mlModificarH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlModificarH.setText("Modificar Habitacion");
        mlModificarH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlModificarHMouseMoved(evt);
            }
        });
        mlModificarH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlModificarHMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlModificarHMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpModificarHLayout = new javax.swing.GroupLayout(mpModificarH);
        mpModificarH.setLayout(mpModificarHLayout);
        mpModificarHLayout.setHorizontalGroup(
            mpModificarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpModificarHLayout.createSequentialGroup()
                .addComponent(mlModificarH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpModificarHLayout.setVerticalGroup(
            mpModificarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlModificarH, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpModificarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 20));

        panelPServicios.setBackground(new java.awt.Color(92, 164, 235));

        lpServicios.setBackground(new java.awt.Color(43, 137, 230));
        lpServicios.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lpServicios.setForeground(new java.awt.Color(255, 255, 255));
        lpServicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icongest.png"))); // NOI18N
        lpServicios.setText("  SERVICIOS");
        lpServicios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lpServiciosMouseMoved(evt);
            }
        });
        lpServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpServiciosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lpServiciosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPServiciosLayout = new javax.swing.GroupLayout(panelPServicios);
        panelPServicios.setLayout(panelPServiciosLayout);
        panelPServiciosLayout.setHorizontalGroup(
            panelPServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPServiciosLayout.createSequentialGroup()
                .addComponent(lpServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPServiciosLayout.setVerticalGroup(
            panelPServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menu.add(panelPServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 40));

        mpAgregarS.setBackground(new java.awt.Color(121, 180, 239));

        mlAgregarS.setBackground(new java.awt.Color(43, 137, 230));
        mlAgregarS.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlAgregarS.setForeground(new java.awt.Color(255, 255, 255));
        mlAgregarS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlAgregarS.setText("Registrar Servicio");
        mlAgregarS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlAgregarSMouseMoved(evt);
            }
        });
        mlAgregarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlAgregarSMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlAgregarSMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpAgregarSLayout = new javax.swing.GroupLayout(mpAgregarS);
        mpAgregarS.setLayout(mpAgregarSLayout);
        mpAgregarSLayout.setHorizontalGroup(
            mpAgregarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpAgregarSLayout.createSequentialGroup()
                .addComponent(mlAgregarS, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpAgregarSLayout.setVerticalGroup(
            mpAgregarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlAgregarS, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpAgregarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 230, -1));

        mpEliminarS.setBackground(new java.awt.Color(121, 180, 239));

        mlEliminarS.setBackground(new java.awt.Color(43, 137, 230));
        mlEliminarS.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlEliminarS.setForeground(new java.awt.Color(255, 255, 255));
        mlEliminarS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlEliminarS.setText("Eliminar Servicio");
        mlEliminarS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlEliminarSMouseMoved(evt);
            }
        });
        mlEliminarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlEliminarSMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlEliminarSMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpEliminarSLayout = new javax.swing.GroupLayout(mpEliminarS);
        mpEliminarS.setLayout(mpEliminarSLayout);
        mpEliminarSLayout.setHorizontalGroup(
            mpEliminarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpEliminarSLayout.createSequentialGroup()
                .addComponent(mlEliminarS, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpEliminarSLayout.setVerticalGroup(
            mpEliminarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlEliminarS, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpEliminarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 230, 20));

        mpModificarS.setBackground(new java.awt.Color(121, 180, 239));

        mlModificarS.setBackground(new java.awt.Color(43, 137, 230));
        mlModificarS.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlModificarS.setForeground(new java.awt.Color(255, 255, 255));
        mlModificarS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlModificarS.setText("Modificar Servicio");
        mlModificarS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlModificarSMouseMoved(evt);
            }
        });
        mlModificarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlModificarSMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlModificarSMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpModificarSLayout = new javax.swing.GroupLayout(mpModificarS);
        mpModificarS.setLayout(mpModificarSLayout);
        mpModificarSLayout.setHorizontalGroup(
            mpModificarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpModificarSLayout.createSequentialGroup()
                .addComponent(mlModificarS, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpModificarSLayout.setVerticalGroup(
            mpModificarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlModificarS, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpModificarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 230, 20));

        panelPReportes.setBackground(new java.awt.Color(92, 164, 235));

        lpReportes.setBackground(new java.awt.Color(43, 137, 230));
        lpReportes.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        lpReportes.setForeground(new java.awt.Color(255, 255, 255));
        lpReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconInfo.png"))); // NOI18N
        lpReportes.setText("  REPORTES");
        lpReportes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lpReportes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lpReportesMouseMoved(evt);
            }
        });
        lpReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpReportesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lpReportesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPReportesLayout = new javax.swing.GroupLayout(panelPReportes);
        panelPReportes.setLayout(panelPReportesLayout);
        panelPReportesLayout.setHorizontalGroup(
            panelPReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPReportesLayout.createSequentialGroup()
                .addComponent(lpReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPReportesLayout.setVerticalGroup(
            panelPReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menu.add(panelPReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 230, 40));

        mpGenInfoH.setBackground(new java.awt.Color(121, 180, 239));

        mlGenInfoH.setBackground(new java.awt.Color(43, 137, 230));
        mlGenInfoH.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlGenInfoH.setForeground(new java.awt.Color(255, 255, 255));
        mlGenInfoH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlGenInfoH.setText("Informe Habitaciones");
        mlGenInfoH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlGenInfoHMouseMoved(evt);
            }
        });
        mlGenInfoH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlGenInfoHMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlGenInfoHMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpGenInfoHLayout = new javax.swing.GroupLayout(mpGenInfoH);
        mpGenInfoH.setLayout(mpGenInfoHLayout);
        mpGenInfoHLayout.setHorizontalGroup(
            mpGenInfoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpGenInfoHLayout.createSequentialGroup()
                .addComponent(mlGenInfoH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpGenInfoHLayout.setVerticalGroup(
            mpGenInfoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlGenInfoH, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpGenInfoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 230, -1));

        mpGenInfoIng.setBackground(new java.awt.Color(121, 180, 239));

        mlGenInfoIng.setBackground(new java.awt.Color(43, 137, 230));
        mlGenInfoIng.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlGenInfoIng.setForeground(new java.awt.Color(255, 255, 255));
        mlGenInfoIng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlGenInfoIng.setText("Informe Ingresos");
        mlGenInfoIng.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlGenInfoIngMouseMoved(evt);
            }
        });
        mlGenInfoIng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlGenInfoIngMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlGenInfoIngMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpGenInfoIngLayout = new javax.swing.GroupLayout(mpGenInfoIng);
        mpGenInfoIng.setLayout(mpGenInfoIngLayout);
        mpGenInfoIngLayout.setHorizontalGroup(
            mpGenInfoIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpGenInfoIngLayout.createSequentialGroup()
                .addComponent(mlGenInfoIng, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpGenInfoIngLayout.setVerticalGroup(
            mpGenInfoIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlGenInfoIng, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpGenInfoIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 230, 20));

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

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        jMenu.addTab("tab2", jPanelMenu);

        jPanelAgregarEmp.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAgregarEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pAgregar.setBackground(new java.awt.Color(233, 230, 230));
        pAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombre.setForeground(new java.awt.Color(51, 51, 51));
        lnombre.setText("NOMBRE");
        pAgregar.add(lnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        inombre.setBackground(new java.awt.Color(153, 153, 153));
        inombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombre.setForeground(new java.awt.Color(255, 255, 255));
        inombre.setBorder(null);
        inombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombreActionPerformed(evt);
            }
        });
        pAgregar.add(inombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 25));

        bagregar.setBackground(new java.awt.Color(102, 102, 102));
        bagregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bagregar.setForeground(new java.awt.Color(255, 255, 255));
        bagregar.setText("AGREGAR");
        bagregar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });
        pAgregar.add(bagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 120, 30));

        iapellido.setBackground(new java.awt.Color(153, 153, 153));
        iapellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iapellido.setForeground(new java.awt.Color(255, 255, 255));
        iapellido.setBorder(null);
        iapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iapellidoActionPerformed(evt);
            }
        });
        pAgregar.add(iapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 25));

        lpuestotrabajo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lpuestotrabajo.setForeground(new java.awt.Color(51, 51, 51));
        lpuestotrabajo.setText("PUESTO DE TRABAJO");
        pAgregar.add(lpuestotrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        botonesAgregar.add(cRecepcionita);
        cRecepcionita.setForeground(new java.awt.Color(51, 51, 51));
        cRecepcionita.setText("RECEPCIONISTA");
        cRecepcionita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRecepcionitaActionPerformed(evt);
            }
        });
        pAgregar.add(cRecepcionita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        botonesAgregar.add(cAdministrador);
        cAdministrador.setForeground(new java.awt.Color(51, 51, 51));
        cAdministrador.setText("ADMINISTRADOR");
        cAdministrador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAdministradorActionPerformed(evt);
            }
        });
        pAgregar.add(cAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lapellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lapellido.setForeground(new java.awt.Color(51, 51, 51));
        lapellido.setText("APELLIDOS");
        pAgregar.add(lapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        idni.setBackground(new java.awt.Color(153, 153, 153));
        idni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idni.setForeground(new java.awt.Color(255, 255, 255));
        idni.setBorder(null);
        idni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idniActionPerformed(evt);
            }
        });
        pAgregar.add(idni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 150, 25));

        ldni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ldni.setForeground(new java.awt.Color(51, 51, 51));
        ldni.setText("DNI");
        pAgregar.add(ldni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        luser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        luser.setForeground(new java.awt.Color(51, 51, 51));
        luser.setText("USUARIO");
        pAgregar.add(luser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        iuser.setBackground(new java.awt.Color(153, 153, 153));
        iuser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iuser.setForeground(new java.awt.Color(255, 255, 255));
        iuser.setBorder(null);
        iuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iuserActionPerformed(evt);
            }
        });
        pAgregar.add(iuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 25));

        lcontra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcontra.setForeground(new java.awt.Color(51, 51, 51));
        lcontra.setText("CONTRASEÑA");
        pAgregar.add(lcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        icontra.setBackground(new java.awt.Color(153, 153, 153));
        icontra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        icontra.setForeground(new java.awt.Color(255, 255, 255));
        icontra.setBorder(null);
        icontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icontraActionPerformed(evt);
            }
        });
        pAgregar.add(icontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 150, 25));

        jPanelAgregarEmp.add(pAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 280, 290));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        jtableagregarem.setBackground(new java.awt.Color(204, 204, 204));
        jtableagregarem.setForeground(new java.awt.Color(0, 0, 0));
        jtableagregarem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableagregarem.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtableagregarem.setFocusable(false);
        jScrollPane1.setViewportView(jtableagregarem);

        jPanelAgregarEmp.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 400, 500));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevoempleado.png"))); // NOI18N
        jPanelAgregarEmp.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 200));

        jMenu.addTab("tab1", jPanelAgregarEmp);

        jPanelEliminarEmp.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEliminarEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        jtableEliminarEmp.setBackground(new java.awt.Color(204, 204, 204));
        jtableEliminarEmp.setForeground(new java.awt.Color(0, 0, 0));
        jtableEliminarEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableEliminarEmp.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtableEliminarEmp.setFocusable(false);
        jScrollPane2.setViewportView(jtableEliminarEmp);

        jPanelEliminarEmp.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 400, 500));

        pEliminar.setBackground(new java.awt.Color(233, 230, 230));
        pEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombre1.setForeground(new java.awt.Color(51, 51, 51));
        lnombre1.setText("NOMBRE");
        pEliminar.add(lnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        inombreC.setBackground(new java.awt.Color(153, 153, 153));
        inombreC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombreC.setForeground(new java.awt.Color(255, 255, 255));
        inombreC.setBorder(null);
        inombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombreCActionPerformed(evt);
            }
        });
        pEliminar.add(inombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 25));

        beliminarEmp.setBackground(new java.awt.Color(102, 102, 102));
        beliminarEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        beliminarEmp.setForeground(new java.awt.Color(255, 255, 255));
        beliminarEmp.setText("ELIMINAR");
        beliminarEmp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        beliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarEmpActionPerformed(evt);
            }
        });
        pEliminar.add(beliminarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        jPanelEliminarEmp.add(pEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 280, 100));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarEmp.png"))); // NOI18N
        jPanelEliminarEmp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 260, 190));

        jMenu.addTab("tab3", jPanelEliminarEmp);

        jPanelModificarEmp.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("MODIFICAR EMPLEADOS");

        javax.swing.GroupLayout jPanelModificarEmpLayout = new javax.swing.GroupLayout(jPanelModificarEmp);
        jPanelModificarEmp.setLayout(jPanelModificarEmpLayout);
        jPanelModificarEmpLayout.setHorizontalGroup(
            jPanelModificarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarEmpLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanelModificarEmpLayout.setVerticalGroup(
            jPanelModificarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarEmpLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        jMenu.addTab("tab4", jPanelModificarEmp);

        jPanelAgregarHab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRAR HABITACION");

        javax.swing.GroupLayout jPanelAgregarHabLayout = new javax.swing.GroupLayout(jPanelAgregarHab);
        jPanelAgregarHab.setLayout(jPanelAgregarHabLayout);
        jPanelAgregarHabLayout.setHorizontalGroup(
            jPanelAgregarHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarHabLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanelAgregarHabLayout.setVerticalGroup(
            jPanelAgregarHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarHabLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        jMenu.addTab("tab5", jPanelAgregarHab);

        jPanelEliminarHab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ELIMINAR HABITACION");

        javax.swing.GroupLayout jPanelEliminarHabLayout = new javax.swing.GroupLayout(jPanelEliminarHab);
        jPanelEliminarHab.setLayout(jPanelEliminarHabLayout);
        jPanelEliminarHabLayout.setHorizontalGroup(
            jPanelEliminarHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(jPanelEliminarHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEliminarHabLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        jPanelEliminarHabLayout.setVerticalGroup(
            jPanelEliminarHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(jPanelEliminarHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEliminarHabLayout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(jLabel5)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );

        jMenu.addTab("tab6", jPanelEliminarHab);

        jPanelModificarHab.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("MODIFICAR HABITACION");

        javax.swing.GroupLayout jPanelModificarHabLayout = new javax.swing.GroupLayout(jPanelModificarHab);
        jPanelModificarHab.setLayout(jPanelModificarHabLayout);
        jPanelModificarHabLayout.setHorizontalGroup(
            jPanelModificarHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarHabLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanelModificarHabLayout.setVerticalGroup(
            jPanelModificarHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarHabLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6)
                .addContainerGap(430, Short.MAX_VALUE))
        );

        jMenu.addTab("tab7", jPanelModificarHab);

        jPanelAgregarSer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("REGISTRAR SERVICIO");

        javax.swing.GroupLayout jPanelAgregarSerLayout = new javax.swing.GroupLayout(jPanelAgregarSer);
        jPanelAgregarSer.setLayout(jPanelAgregarSerLayout);
        jPanelAgregarSerLayout.setHorizontalGroup(
            jPanelAgregarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarSerLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanelAgregarSerLayout.setVerticalGroup(
            jPanelAgregarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarSerLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel7)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jMenu.addTab("tab8", jPanelAgregarSer);

        jPanelEliminarSer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("MODIFICAR SERVICIO");

        javax.swing.GroupLayout jPanelEliminarSerLayout = new javax.swing.GroupLayout(jPanelEliminarSer);
        jPanelEliminarSer.setLayout(jPanelEliminarSerLayout);
        jPanelEliminarSerLayout.setHorizontalGroup(
            jPanelEliminarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(jPanelEliminarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEliminarSerLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        jPanelEliminarSerLayout.setVerticalGroup(
            jPanelEliminarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(jPanelEliminarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEliminarSerLayout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(jLabel8)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );

        jMenu.addTab("tab9", jPanelEliminarSer);

        jPanelModificarSer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ELIMINAR SERVICIO");

        javax.swing.GroupLayout jPanelModificarSerLayout = new javax.swing.GroupLayout(jPanelModificarSer);
        jPanelModificarSer.setLayout(jPanelModificarSerLayout);
        jPanelModificarSerLayout.setHorizontalGroup(
            jPanelModificarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(jPanelModificarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelModificarSerLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        jPanelModificarSerLayout.setVerticalGroup(
            jPanelModificarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(jPanelModificarSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelModificarSerLayout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(jLabel9)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );

        jMenu.addTab("tab10", jPanelModificarSer);

        jPanelInforH.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("INFORME HABITACIONES");

        javax.swing.GroupLayout jPanelInforHLayout = new javax.swing.GroupLayout(jPanelInforH);
        jPanelInforH.setLayout(jPanelInforHLayout);
        jPanelInforHLayout.setHorizontalGroup(
            jPanelInforHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(jPanelInforHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInforHLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        jPanelInforHLayout.setVerticalGroup(
            jPanelInforHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(jPanelInforHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInforHLayout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(jLabel10)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );

        jMenu.addTab("tab11", jPanelInforH);

        jPanelInfoIng.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("INFORME INGRESOS");

        javax.swing.GroupLayout jPanelInfoIngLayout = new javax.swing.GroupLayout(jPanelInfoIng);
        jPanelInfoIng.setLayout(jPanelInfoIngLayout);
        jPanelInfoIngLayout.setHorizontalGroup(
            jPanelInfoIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(jPanelInfoIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInfoIngLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        jPanelInfoIngLayout.setVerticalGroup(
            jPanelInfoIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(jPanelInfoIngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInfoIngLayout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(jLabel11)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );

        jMenu.addTab("tab12", jPanelInfoIng);

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

    //UNDERCORATE MOUSE BARRA MENU
    private void arrastarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrastarMouseDragged
        int cordsX = evt.getXOnScreen();
        int cordsY = evt.getYOnScreen();

        this.setLocation(cordsX - mousepX, cordsY - mousepY);
    }//GEN-LAST:event_arrastarMouseDragged

    private void arrastarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrastarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_arrastarMousePressed

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

    private void inombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombreActionPerformed

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
        String nom = this.inombre.getText().toUpperCase();
        String apell = this.iapellido.getText().toUpperCase();
        String dni = this.idni.getText();
        String user = this.iuser.getText();
        String password = this.icontra.getText();
        if (this.cAdministrador.isSelected()) {
            Administrador ref = new Administrador(nom, apell, "ADMIN", dni, user, password);
            GP.IngresarE(ref);
        } else if (this.cRecepcionita.isSelected()) {
            Recepcionista refE = new Recepcionista(nom, apell, "REC", dni, user, password);
            GP.IngresarE(refE);
        }
        this.inombre.setText("");
        this.iapellido.setText("");
        this.idni.setText("");
        this.iuser.setText("");
        this.icontra.setText("");
        botonesAgregar.clearSelection();
        CargarTabla();
    }//GEN-LAST:event_bagregarActionPerformed

    public void CargarTabla() {
        int fila = this.jtableagregarem.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
        Empleado[] arreglo = GP.getArregloPersona();
        String[] datos = new String[6];
        for (int i = 0; i < GP.getConta(); i++) {
            datos[0] = arreglo[i].getNombre();
            datos[1] = arreglo[i].getApellido();
            datos[2] = arreglo[i].getRol();
            datos[3] = arreglo[i].getDni();
            datos[4] = arreglo[i].getUser();
            datos[5] = arreglo[i].getContra();
            
            modelo.addRow(datos); 
        }
    }
    
    private void iapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iapellidoActionPerformed

    private void cRecepcionitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRecepcionitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRecepcionitaActionPerformed

    private void cAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAdministradorActionPerformed

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

    private void mlModificarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarMouseMoved
        mpModificar.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlModificarMouseMoved

    private void mlModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarMouseClicked
        jMenu.setSelectedIndex(3); 
    }//GEN-LAST:event_mlModificarMouseClicked

    private void mlModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarMouseExited
        mpModificar.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlModificarMouseExited

    private void lpHabitacionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpHabitacionesMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lpHabitacionesMouseMoved

    private void lpHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpHabitacionesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lpHabitacionesMouseClicked

    private void lpHabitacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpHabitacionesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lpHabitacionesMouseExited

    private void mlAgregarHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarHMouseMoved
        mpAgregarH.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlAgregarHMouseMoved

    private void mlAgregarHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarHMouseClicked
        jMenu.setSelectedIndex(4); 
    }//GEN-LAST:event_mlAgregarHMouseClicked

    private void mlAgregarHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarHMouseExited
        mpAgregarH.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlAgregarHMouseExited

    private void mlEliminarHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarHMouseMoved
        mpEliminarH.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlEliminarHMouseMoved

    private void mlEliminarHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarHMouseClicked
        jMenu.setSelectedIndex(5); 
    }//GEN-LAST:event_mlEliminarHMouseClicked

    private void mlEliminarHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarHMouseExited
        mpEliminarH.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlEliminarHMouseExited

    private void mlModificarHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarHMouseMoved
        mpModificarH.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlModificarHMouseMoved

    private void mlModificarHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarHMouseClicked
        jMenu.setSelectedIndex(6);
    }//GEN-LAST:event_mlModificarHMouseClicked

    private void mlModificarHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarHMouseExited
        mpModificarH.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlModificarHMouseExited

    private void lpServiciosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpServiciosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lpServiciosMouseMoved

    private void lpServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpServiciosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lpServiciosMouseClicked

    private void lpServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpServiciosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lpServiciosMouseExited

    private void mlAgregarSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarSMouseMoved
        mpAgregarS.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlAgregarSMouseMoved

    private void mlAgregarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarSMouseClicked
        jMenu.setSelectedIndex(7);
    }//GEN-LAST:event_mlAgregarSMouseClicked

    private void mlAgregarSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarSMouseExited
        mpAgregarS.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlAgregarSMouseExited

    private void mlEliminarSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarSMouseMoved
        mpEliminarS.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlEliminarSMouseMoved

    private void mlEliminarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarSMouseClicked
        jMenu.setSelectedIndex(8);
    }//GEN-LAST:event_mlEliminarSMouseClicked

    private void mlEliminarSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarSMouseExited
        mpEliminarS.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlEliminarSMouseExited

    private void mlModificarSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarSMouseMoved
        mpModificarS.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlModificarSMouseMoved

    private void mlModificarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarSMouseClicked
        jMenu.setSelectedIndex(9);
    }//GEN-LAST:event_mlModificarSMouseClicked

    private void mlModificarSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarSMouseExited
        mpModificarS.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlModificarSMouseExited

    private void lpReportesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpReportesMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lpReportesMouseMoved

    private void lpReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpReportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lpReportesMouseClicked

    private void lpReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpReportesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lpReportesMouseExited

    private void mlGenInfoHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoHMouseMoved
        mpGenInfoH.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlGenInfoHMouseMoved

    private void mlGenInfoHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoHMouseClicked
        jMenu.setSelectedIndex(10);
    }//GEN-LAST:event_mlGenInfoHMouseClicked

    private void mlGenInfoHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoHMouseExited
        mpGenInfoH.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlGenInfoHMouseExited

    private void mlGenInfoIngMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoIngMouseMoved
        mpGenInfoIng.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlGenInfoIngMouseMoved

    private void mlGenInfoIngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoIngMouseClicked
        jMenu.setSelectedIndex(11);
    }//GEN-LAST:event_mlGenInfoIngMouseClicked

    private void mlGenInfoIngMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoIngMouseExited
        mpGenInfoIng.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlGenInfoIngMouseExited

    private void mlMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlMenuMouseExited
        mpMenu.setBackground(new Color(72,147,223));
    }//GEN-LAST:event_mlMenuMouseExited

    private void mlMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlMenuMouseClicked
        jMenu.setSelectedIndex(0);
    }//GEN-LAST:event_mlMenuMouseClicked

    private void mlMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlMenuMouseMoved
        mpMenu.setBackground(new Color(66,126,187));
    }//GEN-LAST:event_mlMenuMouseMoved

    private void idniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idniActionPerformed

    private void iuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iuserActionPerformed

    private void icontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icontraActionPerformed

    private void inombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombreCActionPerformed

    private void beliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarEmpActionPerformed
        String nom = inombreC.getText();
        GP.EliminarE(nom);
        CargarTabla();
    }//GEN-LAST:event_beliminarEmpActionPerformed

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
    private javax.swing.JLabel arrastar;
    private javax.swing.JButton bagregar;
    private javax.swing.JButton beliminarEmp;
    private javax.swing.JPanel bg;
    private javax.swing.ButtonGroup botonesAgregar;
    private javax.swing.JRadioButton cAdministrador;
    private javax.swing.JRadioButton cRecepcionita;
    private javax.swing.JPanel dashboard;
    private javax.swing.JTextField iapellido;
    private javax.swing.JTextField icontra;
    private javax.swing.JTextField idni;
    private javax.swing.JLabel imgpersona;
    private javax.swing.JTextField inombre;
    private javax.swing.JTextField inombreC;
    private javax.swing.JTextField iuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jMenu;
    private javax.swing.JPanel jPanelAgregarEmp;
    private javax.swing.JPanel jPanelAgregarHab;
    private javax.swing.JPanel jPanelAgregarSer;
    private javax.swing.JPanel jPanelEliminarEmp;
    private javax.swing.JPanel jPanelEliminarHab;
    private javax.swing.JPanel jPanelEliminarSer;
    private javax.swing.JPanel jPanelInfoIng;
    private javax.swing.JPanel jPanelInforH;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelModificarEmp;
    private javax.swing.JPanel jPanelModificarHab;
    private javax.swing.JPanel jPanelModificarSer;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtableEliminarEmp;
    private javax.swing.JTable jtableagregarem;
    private javax.swing.JLabel lapellido;
    private javax.swing.JLabel lcontra;
    private javax.swing.JLabel ldni;
    private javax.swing.JLabel lexit;
    private javax.swing.JLabel lminus;
    private javax.swing.JLabel lnombre;
    private javax.swing.JLabel lnombre1;
    private javax.swing.JLabel lpEmpleados;
    private javax.swing.JLabel lpHabitaciones;
    private javax.swing.JLabel lpReportes;
    private javax.swing.JLabel lpServicios;
    private javax.swing.JLabel lpuestotrabajo;
    private javax.swing.JLabel lrolprofile;
    private javax.swing.JLabel luser;
    private javax.swing.JLabel luserprofile;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel mlAgregar;
    private javax.swing.JLabel mlAgregarH;
    private javax.swing.JLabel mlAgregarS;
    private javax.swing.JLabel mlEliminar;
    private javax.swing.JLabel mlEliminarH;
    private javax.swing.JLabel mlEliminarS;
    private javax.swing.JLabel mlGenInfoH;
    private javax.swing.JLabel mlGenInfoIng;
    private javax.swing.JLabel mlMenu;
    private javax.swing.JLabel mlModificar;
    private javax.swing.JLabel mlModificarH;
    private javax.swing.JLabel mlModificarS;
    private javax.swing.JPanel mpAgregar;
    private javax.swing.JPanel mpAgregarH;
    private javax.swing.JPanel mpAgregarS;
    private javax.swing.JPanel mpEliminar;
    private javax.swing.JPanel mpEliminarH;
    private javax.swing.JPanel mpEliminarS;
    private javax.swing.JPanel mpGenInfoH;
    private javax.swing.JPanel mpGenInfoIng;
    private javax.swing.JPanel mpMenu;
    private javax.swing.JPanel mpModificar;
    private javax.swing.JPanel mpModificarH;
    private javax.swing.JPanel mpModificarS;
    private javax.swing.JPanel pAgregar;
    private javax.swing.JPanel pEliminar;
    private javax.swing.JPanel panelPEmpleados;
    private javax.swing.JPanel panelPHabitaciones;
    private javax.swing.JPanel panelPReportes;
    private javax.swing.JPanel panelPServicios;
    private javax.swing.JPanel perfilmenu;
    private javax.swing.JPanel pexit;
    private javax.swing.JPanel pminus;
    // End of variables declaration//GEN-END:variables
}
