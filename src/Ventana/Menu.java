package Ventana;

import Code.Administrador;
import Code.Deluxe;
import Code.Empleado;
import Code.Estandar;
import Code.GestionHabitacion;
import Code.GestionPersona;
import Code.GestionServicio;
import Code.Habitacion;
import Code.Limpieza;
import Code.Recepcionista;
import Code.Relax;
import Code.Servicio;
import Code.Suite;
import Code.Tour;
import java.awt.Color;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    //VARIABLES
    private DefaultTableModel modelo;
    private DefaultTableModel modeloH;
    private DefaultTableModel modeloS;
    private GestionPersona GP;
    private GestionHabitacion GH;
    private GestionServicio GS;
    private Habitacion[] arregloH;
    private Empleado[] arreglo;
    private Servicio[] arregloS;
    private Empleado menuE;
    int mousepX;
    int mousepY;

    //CONSTRUCTOR
    public Menu(Empleado ref) {
        initComponents();
        GH = new GestionHabitacion();
        GP = new GestionPersona();
        GS = new GestionServicio();

        //TABLAS EMPLEADOS
        modelo = new DefaultTableModel();
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

        //TABLAS HABITACIONES
        modeloH = new DefaultTableModel();
        modeloH.addColumn("Num");
        modeloH.addColumn("Capacidad");
        modeloH.addColumn("Tipo");
        modeloH.addColumn("Estado");
        modeloH.addColumn("Precio S/.");
        this.jtableaAgregarHab.setModel(modeloH);
        this.jtableaEliminarHab.setModel(modeloH);
        jtableaAgregarHab.getTableHeader().setResizingAllowed(false);
        jtableaEliminarHab.getTableHeader().setResizingAllowed(false);
        jtableaAgregarHab.getTableHeader().setReorderingAllowed(false);
        jtableaEliminarHab.getTableHeader().setReorderingAllowed(false);
        
        //TABLAS SERVICIOS
        modeloS = new DefaultTableModel();
        modeloS.addColumn("Servicio");
        modeloS.addColumn("Tipo");
        modeloS.addColumn("Precio S/.");
        modeloS.addColumn("Disponible");
        this.jtableagregarSer.setModel(modeloS);
        this.jtableEliminarSer.setModel(modeloS);
        jtableagregarSer.getTableHeader().setResizingAllowed(false);
        jtableEliminarSer.getTableHeader().setResizingAllowed(false);
        jtableagregarSer.getTableHeader().setReorderingAllowed(false);
        jtableEliminarSer.getTableHeader().setReorderingAllowed(false);

        //PERFIL
        String userPr = ref.getNombre() + " " + ref.getApellido();
        luserprofile.setText(userPr.toUpperCase());
        lrolprofile.setText("ADMINISTRADOR");

        //ARREGLO
        Recepcionista refR = new Recepcionista("MARIA", "MENDA", "REC", "8313912", "Mar12", "153");
        Estandar ref1 = new Estandar(2, "EST", "DISPONIBLE", 40);
        ref1.setNum(1);
        Deluxe ref2 = new Deluxe(3, "DEL", "DISPONIBLE", 60);
        ref2.setNum(2);
        Suite ref3 = new Suite(5, "SUI", "DISPONIBLE", 100);
        ref3.setNum(3);
        GH.IngresarHab(ref1);
        GH.IngresarHab(ref2);
        GH.IngresarHab(ref3);
        GP.IngresarE(ref);
        GP.IngresarE(refR);
        arreglo = GP.getArregloPersona();
        arregloH = GH.getArregloHab();
        arregloS = GS.getArregloS();
        menuE = ref;
        CargarTablaH();
        CargarTabla();
        CargarTablaS();

        //CENTRAR
        setLocationRelativeTo(null);
    }

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        botonesAgregarEmp = new javax.swing.ButtonGroup();
        botonesModificarEmp = new javax.swing.ButtonGroup();
        botonesAgregarHab = new javax.swing.ButtonGroup();
        botonesAgregEstado = new javax.swing.ButtonGroup();
        botonesModiHab = new javax.swing.ButtonGroup();
        botonesModiEst = new javax.swing.ButtonGroup();
        botonesAgregarServ = new javax.swing.ButtonGroup();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        botonesModiSer = new javax.swing.ButtonGroup();
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
        menuimagen = new javax.swing.JLabel();
        jMenu = new javax.swing.JTabbedPane();
        jPanelMenu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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
        ldniC = new javax.swing.JLabel();
        idniC = new javax.swing.JTextField();
        beliminarEmp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanelModificarEmp = new javax.swing.JPanel();
        jimagenModiEmp = new javax.swing.JLabel();
        pModificarE = new javax.swing.JPanel();
        ldniModE = new javax.swing.JLabel();
        idniModiE = new javax.swing.JTextField();
        bBuscarModificarE = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        pModificarEmp = new javax.swing.JPanel();
        lnombreM = new javax.swing.JLabel();
        inombreM = new javax.swing.JTextField();
        bmodificarEmp = new javax.swing.JButton();
        iapellidoM = new javax.swing.JTextField();
        lpuestotrabajoM = new javax.swing.JLabel();
        cRecepcionitaM = new javax.swing.JRadioButton();
        cAdministradorM = new javax.swing.JRadioButton();
        lapellidoM = new javax.swing.JLabel();
        idniM = new javax.swing.JTextField();
        ldniM = new javax.swing.JLabel();
        luserM = new javax.swing.JLabel();
        iuserM = new javax.swing.JTextField();
        lcontraM = new javax.swing.JLabel();
        icontraM = new javax.swing.JTextField();
        jPanelAgregarHab = new javax.swing.JPanel();
        pAgregarHab = new javax.swing.JPanel();
        bagregar1 = new javax.swing.JButton();
        icapacidadH = new javax.swing.JTextField();
        lpuestotrabajo1 = new javax.swing.JLabel();
        csuiteH = new javax.swing.JRadioButton();
        cEstandarH = new javax.swing.JRadioButton();
        lcapacidadH = new javax.swing.JLabel();
        iprecioH = new javax.swing.JTextField();
        lprecioH = new javax.swing.JLabel();
        lestadoH = new javax.swing.JLabel();
        cdeluxeH = new javax.swing.JRadioButton();
        cdisponibleH = new javax.swing.JRadioButton();
        creservadoH = new javax.swing.JRadioButton();
        cocupadoH = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableaAgregarHab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanelEliminarHab = new javax.swing.JPanel();
        pEliminarH = new javax.swing.JPanel();
        lnumeroeEH = new javax.swing.JLabel();
        inumeroEH = new javax.swing.JTextField();
        beliminarHab = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtableaEliminarHab = new javax.swing.JTable();
        imagenAgregarHab = new javax.swing.JLabel();
        jPanelModificarHab = new javax.swing.JPanel();
        pEliminarH1 = new javax.swing.JPanel();
        lnumeroHM = new javax.swing.JLabel();
        inumeroHM = new javax.swing.JTextField();
        bModificarHab = new javax.swing.JButton();
        pModificarHab = new javax.swing.JPanel();
        bmodificarHab = new javax.swing.JButton();
        icapacidadMH = new javax.swing.JTextField();
        ltipodehabitacion = new javax.swing.JLabel();
        cSuiteMH = new javax.swing.JRadioButton();
        cEstandarMH = new javax.swing.JRadioButton();
        lapellidoMH = new javax.swing.JLabel();
        iprecioMH = new javax.swing.JTextField();
        lprecioMH = new javax.swing.JLabel();
        cDeluxeMH = new javax.swing.JRadioButton();
        lestadoMH = new javax.swing.JLabel();
        cdisponibleMH = new javax.swing.JRadioButton();
        creservadoMH = new javax.swing.JRadioButton();
        cocupadoMH = new javax.swing.JRadioButton();
        jimagenModificarHab = new javax.swing.JLabel();
        jimagenModHab = new javax.swing.JLabel();
        jPanelAgregarSer = new javax.swing.JPanel();
        pAgregarHab1 = new javax.swing.JPanel();
        bagregarAS = new javax.swing.JButton();
        ltipodeservicioAS = new javax.swing.JLabel();
        cLavanderiaAS = new javax.swing.JRadioButton();
        cMasajeAS = new javax.swing.JRadioButton();
        iprecioAS = new javax.swing.JTextField();
        lprecioAS = new javax.swing.JLabel();
        cTourAS = new javax.swing.JRadioButton();
        lcantDisAS = new javax.swing.JLabel();
        iCantDisAS = new javax.swing.JTextField();
        lnombreAS = new javax.swing.JLabel();
        inombreAS = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtableagregarSer = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanelEliminarSer = new javax.swing.JPanel();
        pAgregarHab2 = new javax.swing.JPanel();
        beliminarAE = new javax.swing.JButton();
        lnombreAE = new javax.swing.JLabel();
        inombreAE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtableEliminarSer = new javax.swing.JTable();
        jPanelModificarSer = new javax.swing.JPanel();
        pMSer = new javax.swing.JPanel();
        bBuscarS = new javax.swing.JButton();
        lnombreMS = new javax.swing.JLabel();
        inombreMS = new javax.swing.JTextField();
        pmsservv = new javax.swing.JPanel();
        bModificarMS = new javax.swing.JButton();
        ltipodeservicioms = new javax.swing.JLabel();
        cLavanderiaMS = new javax.swing.JRadioButton();
        cMasajeMS = new javax.swing.JRadioButton();
        iprecioMS = new javax.swing.JTextField();
        lprecioMS = new javax.swing.JLabel();
        cTourMS = new javax.swing.JRadioButton();
        lcantDisMS = new javax.swing.JLabel();
        iCantDisMS = new javax.swing.JTextField();
        lnombresMS = new javax.swing.JLabel();
        inombresMS = new javax.swing.JTextField();
        imgMS = new javax.swing.JLabel();
        imgMSX = new javax.swing.JLabel();
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

        menuimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconomenu.png"))); // NOI18N
        dashboard.add(menuimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 1, 230, -1));

        bg.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 710, 70));

        jMenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMGMENU.png"))); // NOI18N
        jPanelMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 700, 500));

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
        inombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        iapellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        botonesAgregarEmp.add(cRecepcionita);
        cRecepcionita.setForeground(new java.awt.Color(51, 51, 51));
        cRecepcionita.setText("RECEPCIONISTA");
        cRecepcionita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRecepcionitaActionPerformed(evt);
            }
        });
        pAgregar.add(cRecepcionita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        botonesAgregarEmp.add(cAdministrador);
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
        idni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        iuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        icontra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        ldniC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ldniC.setForeground(new java.awt.Color(51, 51, 51));
        ldniC.setText("DNI");
        pEliminar.add(ldniC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        idniC.setBackground(new java.awt.Color(153, 153, 153));
        idniC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idniC.setForeground(new java.awt.Color(255, 255, 255));
        idniC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idniC.setBorder(null);
        idniC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idniCActionPerformed(evt);
            }
        });
        pEliminar.add(idniC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 25));

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

        jimagenModiEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jimagenModiEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarEmpleado.png"))); // NOI18N

        pModificarE.setBackground(new java.awt.Color(233, 230, 230));
        pModificarE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ldniModE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ldniModE.setForeground(new java.awt.Color(51, 51, 51));
        ldniModE.setText("DNI");
        pModificarE.add(ldniModE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        idniModiE.setBackground(new java.awt.Color(153, 153, 153));
        idniModiE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idniModiE.setForeground(new java.awt.Color(255, 255, 255));
        idniModiE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idniModiE.setBorder(null);
        idniModiE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idniModiEActionPerformed(evt);
            }
        });
        pModificarE.add(idniModiE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 25));

        bBuscarModificarE.setBackground(new java.awt.Color(102, 102, 102));
        bBuscarModificarE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bBuscarModificarE.setForeground(new java.awt.Color(255, 255, 255));
        bBuscarModificarE.setText("BUSCAR");
        bBuscarModificarE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bBuscarModificarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarModificarEActionPerformed(evt);
            }
        });
        pModificarE.add(bBuscarModificarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleadoModificado.png"))); // NOI18N

        pModificarEmp.setBackground(new java.awt.Color(233, 230, 230));
        pModificarEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnombreM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombreM.setForeground(new java.awt.Color(51, 51, 51));
        lnombreM.setText("NOMBRE");
        pModificarEmp.add(lnombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        inombreM.setBackground(new java.awt.Color(153, 153, 153));
        inombreM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombreM.setForeground(new java.awt.Color(255, 255, 255));
        inombreM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inombreM.setBorder(null);
        inombreM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombreMActionPerformed(evt);
            }
        });
        pModificarEmp.add(inombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, 25));

        bmodificarEmp.setBackground(new java.awt.Color(102, 102, 102));
        bmodificarEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bmodificarEmp.setForeground(new java.awt.Color(255, 255, 255));
        bmodificarEmp.setText("MODIFICAR");
        bmodificarEmp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bmodificarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarEmpActionPerformed(evt);
            }
        });
        pModificarEmp.add(bmodificarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, 30));

        iapellidoM.setBackground(new java.awt.Color(153, 153, 153));
        iapellidoM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iapellidoM.setForeground(new java.awt.Color(255, 255, 255));
        iapellidoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iapellidoM.setBorder(null);
        iapellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iapellidoMActionPerformed(evt);
            }
        });
        pModificarEmp.add(iapellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 150, 25));

        lpuestotrabajoM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lpuestotrabajoM.setForeground(new java.awt.Color(51, 51, 51));
        lpuestotrabajoM.setText("PUESTO DE TRABAJO");
        pModificarEmp.add(lpuestotrabajoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        botonesModificarEmp.add(cRecepcionitaM);
        cRecepcionitaM.setForeground(new java.awt.Color(51, 51, 51));
        cRecepcionitaM.setText("RECEPCIONISTA");
        cRecepcionitaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRecepcionitaMActionPerformed(evt);
            }
        });
        pModificarEmp.add(cRecepcionitaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        botonesModificarEmp.add(cAdministradorM);
        cAdministradorM.setForeground(new java.awt.Color(51, 51, 51));
        cAdministradorM.setText("ADMINISTRADOR");
        cAdministradorM.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cAdministradorM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAdministradorMActionPerformed(evt);
            }
        });
        pModificarEmp.add(cAdministradorM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lapellidoM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lapellidoM.setForeground(new java.awt.Color(51, 51, 51));
        lapellidoM.setText("APELLIDOS");
        pModificarEmp.add(lapellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        idniM.setBackground(new java.awt.Color(153, 153, 153));
        idniM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idniM.setForeground(new java.awt.Color(255, 255, 255));
        idniM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idniM.setBorder(null);
        idniM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idniMActionPerformed(evt);
            }
        });
        pModificarEmp.add(idniM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, 25));

        ldniM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ldniM.setForeground(new java.awt.Color(51, 51, 51));
        ldniM.setText("DNI");
        pModificarEmp.add(ldniM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        luserM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        luserM.setForeground(new java.awt.Color(51, 51, 51));
        luserM.setText("USUARIO");
        pModificarEmp.add(luserM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        iuserM.setBackground(new java.awt.Color(153, 153, 153));
        iuserM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iuserM.setForeground(new java.awt.Color(255, 255, 255));
        iuserM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iuserM.setBorder(null);
        iuserM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iuserMActionPerformed(evt);
            }
        });
        pModificarEmp.add(iuserM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, 25));

        lcontraM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcontraM.setForeground(new java.awt.Color(51, 51, 51));
        lcontraM.setText("CONTRASEÑA");
        pModificarEmp.add(lcontraM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        icontraM.setBackground(new java.awt.Color(153, 153, 153));
        icontraM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        icontraM.setForeground(new java.awt.Color(255, 255, 255));
        icontraM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        icontraM.setBorder(null);
        icontraM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icontraMActionPerformed(evt);
            }
        });
        pModificarEmp.add(icontraM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 150, 25));

        javax.swing.GroupLayout jPanelModificarEmpLayout = new javax.swing.GroupLayout(jPanelModificarEmp);
        jPanelModificarEmp.setLayout(jPanelModificarEmpLayout);
        jPanelModificarEmpLayout.setHorizontalGroup(
            jPanelModificarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarEmpLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanelModificarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pModificarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jimagenModiEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelModificarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pModificarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanelModificarEmpLayout.setVerticalGroup(
            jPanelModificarEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarEmpLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pModificarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificarEmpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jimagenModiEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pModificarE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        jMenu.addTab("tab4", jPanelModificarEmp);

        jPanelAgregarHab.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAgregarHab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pAgregarHab.setBackground(new java.awt.Color(233, 230, 230));
        pAgregarHab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bagregar1.setBackground(new java.awt.Color(102, 102, 102));
        bagregar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bagregar1.setForeground(new java.awt.Color(255, 255, 255));
        bagregar1.setText("AGREGAR");
        bagregar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bagregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregar1ActionPerformed(evt);
            }
        });
        pAgregarHab.add(bagregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, 30));

        icapacidadH.setBackground(new java.awt.Color(153, 153, 153));
        icapacidadH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        icapacidadH.setForeground(new java.awt.Color(255, 255, 255));
        icapacidadH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        icapacidadH.setBorder(null);
        icapacidadH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icapacidadHActionPerformed(evt);
            }
        });
        pAgregarHab.add(icapacidadH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 150, 25));

        lpuestotrabajo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lpuestotrabajo1.setForeground(new java.awt.Color(51, 51, 51));
        lpuestotrabajo1.setText("TIPO DE HABITACION");
        pAgregarHab.add(lpuestotrabajo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        botonesAgregarHab.add(csuiteH);
        csuiteH.setForeground(new java.awt.Color(51, 51, 51));
        csuiteH.setText("SUITE");
        csuiteH.setActionCommand("DOUBLE");
        csuiteH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csuiteHActionPerformed(evt);
            }
        });
        pAgregarHab.add(csuiteH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        botonesAgregarHab.add(cEstandarH);
        cEstandarH.setForeground(new java.awt.Color(51, 51, 51));
        cEstandarH.setText("STANDAR");
        cEstandarH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cEstandarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEstandarHActionPerformed(evt);
            }
        });
        pAgregarHab.add(cEstandarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lcapacidadH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcapacidadH.setForeground(new java.awt.Color(51, 51, 51));
        lcapacidadH.setText("CAPACIDAD");
        pAgregarHab.add(lcapacidadH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        iprecioH.setBackground(new java.awt.Color(153, 153, 153));
        iprecioH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iprecioH.setForeground(new java.awt.Color(255, 255, 255));
        iprecioH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iprecioH.setBorder(null);
        iprecioH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iprecioHActionPerformed(evt);
            }
        });
        pAgregarHab.add(iprecioH, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 150, 25));

        lprecioH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lprecioH.setForeground(new java.awt.Color(51, 51, 51));
        lprecioH.setText("PRECIO ");
        pAgregarHab.add(lprecioH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lestadoH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lestadoH.setForeground(new java.awt.Color(51, 51, 51));
        lestadoH.setText("ESTADO");
        pAgregarHab.add(lestadoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        botonesAgregarHab.add(cdeluxeH);
        cdeluxeH.setForeground(new java.awt.Color(51, 51, 51));
        cdeluxeH.setText("DELUXE");
        cdeluxeH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cdeluxeH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdeluxeHActionPerformed(evt);
            }
        });
        pAgregarHab.add(cdeluxeH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        botonesAgregEstado.add(cdisponibleH);
        cdisponibleH.setForeground(new java.awt.Color(51, 51, 51));
        cdisponibleH.setText("DISPONIBLE");
        cdisponibleH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cdisponibleH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdisponibleHActionPerformed(evt);
            }
        });
        pAgregarHab.add(cdisponibleH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        botonesAgregEstado.add(creservadoH);
        creservadoH.setForeground(new java.awt.Color(51, 51, 51));
        creservadoH.setText("RESERVADO");
        creservadoH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        creservadoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creservadoHActionPerformed(evt);
            }
        });
        pAgregarHab.add(creservadoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        botonesAgregEstado.add(cocupadoH);
        cocupadoH.setForeground(new java.awt.Color(51, 51, 51));
        cocupadoH.setText("OCUPADO");
        cocupadoH.setActionCommand("DOUBLE");
        cocupadoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocupadoHActionPerformed(evt);
            }
        });
        pAgregarHab.add(cocupadoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jPanelAgregarHab.add(pAgregarHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 300, 280));

        jScrollPane3.setBackground(new java.awt.Color(204, 204, 204));

        jtableaAgregarHab.setBackground(new java.awt.Color(204, 204, 204));
        jtableaAgregarHab.setForeground(new java.awt.Color(0, 0, 0));
        jtableaAgregarHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableaAgregarHab.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtableaAgregarHab.setFocusable(false);
        jScrollPane3.setViewportView(jtableaAgregarHab);

        jPanelAgregarHab.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 380, 500));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarHab.png"))); // NOI18N
        jPanelAgregarHab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 280, 150));

        jMenu.addTab("tab5", jPanelAgregarHab);

        jPanelEliminarHab.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEliminarHab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pEliminarH.setBackground(new java.awt.Color(233, 230, 230));
        pEliminarH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnumeroeEH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnumeroeEH.setForeground(new java.awt.Color(51, 51, 51));
        lnumeroeEH.setText("NUMERO");
        pEliminarH.add(lnumeroeEH, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 13, -1, -1));

        inumeroEH.setBackground(new java.awt.Color(153, 153, 153));
        inumeroEH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inumeroEH.setForeground(new java.awt.Color(255, 255, 255));
        inumeroEH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inumeroEH.setBorder(null);
        inumeroEH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inumeroEHActionPerformed(evt);
            }
        });
        pEliminarH.add(inumeroEH, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 25));

        beliminarHab.setBackground(new java.awt.Color(102, 102, 102));
        beliminarHab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        beliminarHab.setForeground(new java.awt.Color(255, 255, 255));
        beliminarHab.setText("ELIMINAR");
        beliminarHab.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        beliminarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarHabActionPerformed(evt);
            }
        });
        pEliminarH.add(beliminarHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        jPanelEliminarHab.add(pEliminarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 280, 100));

        jScrollPane4.setBackground(new java.awt.Color(204, 204, 204));

        jtableaEliminarHab.setBackground(new java.awt.Color(204, 204, 204));
        jtableaEliminarHab.setForeground(new java.awt.Color(0, 0, 0));
        jtableaEliminarHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableaEliminarHab.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtableaEliminarHab.setFocusable(false);
        jScrollPane4.setViewportView(jtableaEliminarHab);

        jPanelEliminarHab.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 400, 500));

        imagenAgregarHab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenAgregarHab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/habitacionEliminarr.png"))); // NOI18N
        jPanelEliminarHab.add(imagenAgregarHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 170));

        jMenu.addTab("tab6", jPanelEliminarHab);

        jPanelModificarHab.setBackground(new java.awt.Color(255, 255, 255));
        jPanelModificarHab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pEliminarH1.setBackground(new java.awt.Color(233, 230, 230));
        pEliminarH1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnumeroHM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnumeroHM.setForeground(new java.awt.Color(51, 51, 51));
        lnumeroHM.setText("NUMERO");
        pEliminarH1.add(lnumeroHM, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 13, -1, -1));

        inumeroHM.setBackground(new java.awt.Color(153, 153, 153));
        inumeroHM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inumeroHM.setForeground(new java.awt.Color(255, 255, 255));
        inumeroHM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inumeroHM.setBorder(null);
        inumeroHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inumeroHMActionPerformed(evt);
            }
        });
        pEliminarH1.add(inumeroHM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 25));

        bModificarHab.setBackground(new java.awt.Color(102, 102, 102));
        bModificarHab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bModificarHab.setForeground(new java.awt.Color(255, 255, 255));
        bModificarHab.setText("BUSCAR");
        bModificarHab.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bModificarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarHabActionPerformed(evt);
            }
        });
        pEliminarH1.add(bModificarHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        jPanelModificarHab.add(pEliminarH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 290, 100));

        pModificarHab.setBackground(new java.awt.Color(233, 230, 230));
        pModificarHab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bmodificarHab.setBackground(new java.awt.Color(102, 102, 102));
        bmodificarHab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bmodificarHab.setForeground(new java.awt.Color(255, 255, 255));
        bmodificarHab.setText("MODIFICAR");
        bmodificarHab.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bmodificarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarHabActionPerformed(evt);
            }
        });
        pModificarHab.add(bmodificarHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 120, 30));

        icapacidadMH.setBackground(new java.awt.Color(153, 153, 153));
        icapacidadMH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        icapacidadMH.setForeground(new java.awt.Color(255, 255, 255));
        icapacidadMH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        icapacidadMH.setBorder(null);
        icapacidadMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icapacidadMHActionPerformed(evt);
            }
        });
        pModificarHab.add(icapacidadMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 150, 25));

        ltipodehabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ltipodehabitacion.setForeground(new java.awt.Color(51, 51, 51));
        ltipodehabitacion.setText("TIPO DE HABITACION");
        pModificarHab.add(ltipodehabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        botonesModiHab.add(cSuiteMH);
        cSuiteMH.setForeground(new java.awt.Color(51, 51, 51));
        cSuiteMH.setText("SUITE");
        cSuiteMH.setActionCommand("DOUBLE");
        cSuiteMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSuiteMHActionPerformed(evt);
            }
        });
        pModificarHab.add(cSuiteMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        botonesModiHab.add(cEstandarMH);
        cEstandarMH.setForeground(new java.awt.Color(51, 51, 51));
        cEstandarMH.setText("STANDAR");
        cEstandarMH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cEstandarMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEstandarMHActionPerformed(evt);
            }
        });
        pModificarHab.add(cEstandarMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lapellidoMH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lapellidoMH.setForeground(new java.awt.Color(51, 51, 51));
        lapellidoMH.setText("CAPACDAD");
        pModificarHab.add(lapellidoMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        iprecioMH.setBackground(new java.awt.Color(153, 153, 153));
        iprecioMH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iprecioMH.setForeground(new java.awt.Color(255, 255, 255));
        iprecioMH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iprecioMH.setBorder(null);
        iprecioMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iprecioMHActionPerformed(evt);
            }
        });
        pModificarHab.add(iprecioMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, 25));

        lprecioMH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lprecioMH.setForeground(new java.awt.Color(51, 51, 51));
        lprecioMH.setText("PRECIO S/. ");
        pModificarHab.add(lprecioMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        botonesModiHab.add(cDeluxeMH);
        cDeluxeMH.setForeground(new java.awt.Color(51, 51, 51));
        cDeluxeMH.setText("DELUXE");
        cDeluxeMH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cDeluxeMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDeluxeMHActionPerformed(evt);
            }
        });
        pModificarHab.add(cDeluxeMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        lestadoMH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lestadoMH.setForeground(new java.awt.Color(51, 51, 51));
        lestadoMH.setText("ESTADO");
        pModificarHab.add(lestadoMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        botonesModiEst.add(cdisponibleMH);
        cdisponibleMH.setForeground(new java.awt.Color(51, 51, 51));
        cdisponibleMH.setText("DISPONIBLE");
        cdisponibleMH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cdisponibleMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdisponibleMHActionPerformed(evt);
            }
        });
        pModificarHab.add(cdisponibleMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        botonesModiEst.add(creservadoMH);
        creservadoMH.setForeground(new java.awt.Color(51, 51, 51));
        creservadoMH.setText("RESERVADO");
        creservadoMH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        creservadoMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creservadoMHActionPerformed(evt);
            }
        });
        pModificarHab.add(creservadoMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        botonesModiEst.add(cocupadoMH);
        cocupadoMH.setForeground(new java.awt.Color(51, 51, 51));
        cocupadoMH.setText("OCUPADO");
        cocupadoMH.setActionCommand("DOUBLE");
        cocupadoMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocupadoMHActionPerformed(evt);
            }
        });
        pModificarHab.add(cocupadoMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jPanelModificarHab.add(pModificarHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 310, 270));

        jimagenModificarHab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jimagenModificarHab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarEmpleado.png"))); // NOI18N
        jPanelModificarHab.add(jimagenModificarHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 290, -1));

        jimagenModHab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jimagenModHab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/habitacionModi.png"))); // NOI18N
        jPanelModificarHab.add(jimagenModHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 300, 160));

        jMenu.addTab("tab7", jPanelModificarHab);

        jPanelAgregarSer.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAgregarSer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pAgregarHab1.setBackground(new java.awt.Color(233, 230, 230));
        pAgregarHab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bagregarAS.setBackground(new java.awt.Color(102, 102, 102));
        bagregarAS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bagregarAS.setForeground(new java.awt.Color(255, 255, 255));
        bagregarAS.setText("AGREGAR");
        bagregarAS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bagregarAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarASActionPerformed(evt);
            }
        });
        pAgregarHab1.add(bagregarAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 120, 30));

        ltipodeservicioAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ltipodeservicioAS.setForeground(new java.awt.Color(51, 51, 51));
        ltipodeservicioAS.setText("TIPO DE SERVICIO");
        pAgregarHab1.add(ltipodeservicioAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        botonesAgregarServ.add(cLavanderiaAS);
        cLavanderiaAS.setForeground(new java.awt.Color(51, 51, 51));
        cLavanderiaAS.setText("LIMPIEZA");
        cLavanderiaAS.setActionCommand("DOUBLE");
        cLavanderiaAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cLavanderiaASActionPerformed(evt);
            }
        });
        pAgregarHab1.add(cLavanderiaAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 109, -1, -1));

        botonesAgregarServ.add(cMasajeAS);
        cMasajeAS.setForeground(new java.awt.Color(51, 51, 51));
        cMasajeAS.setText("RELAX");
        cMasajeAS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cMasajeAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMasajeASActionPerformed(evt);
            }
        });
        pAgregarHab1.add(cMasajeAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        iprecioAS.setBackground(new java.awt.Color(153, 153, 153));
        iprecioAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iprecioAS.setForeground(new java.awt.Color(255, 255, 255));
        iprecioAS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iprecioAS.setBorder(null);
        iprecioAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iprecioASActionPerformed(evt);
            }
        });
        pAgregarHab1.add(iprecioAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, 25));

        lprecioAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lprecioAS.setForeground(new java.awt.Color(51, 51, 51));
        lprecioAS.setText("PRECIO ");
        pAgregarHab1.add(lprecioAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        botonesAgregarServ.add(cTourAS);
        cTourAS.setForeground(new java.awt.Color(51, 51, 51));
        cTourAS.setText("TOUR");
        cTourAS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cTourAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTourASActionPerformed(evt);
            }
        });
        pAgregarHab1.add(cTourAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        lcantDisAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcantDisAS.setForeground(new java.awt.Color(51, 51, 51));
        lcantDisAS.setText("CANT DISPONIBLE");
        pAgregarHab1.add(lcantDisAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        iCantDisAS.setBackground(new java.awt.Color(153, 153, 153));
        iCantDisAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iCantDisAS.setForeground(new java.awt.Color(255, 255, 255));
        iCantDisAS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iCantDisAS.setBorder(null);
        iCantDisAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iCantDisASActionPerformed(evt);
            }
        });
        pAgregarHab1.add(iCantDisAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, 25));

        lnombreAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombreAS.setForeground(new java.awt.Color(51, 51, 51));
        lnombreAS.setText("NOMBRE SERVICIO");
        pAgregarHab1.add(lnombreAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        inombreAS.setBackground(new java.awt.Color(153, 153, 153));
        inombreAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombreAS.setForeground(new java.awt.Color(255, 255, 255));
        inombreAS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inombreAS.setBorder(null);
        inombreAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombreASActionPerformed(evt);
            }
        });
        pAgregarHab1.add(inombreAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 150, 25));

        jPanelAgregarSer.add(pAgregarHab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 350, 270));

        jScrollPane5.setBackground(new java.awt.Color(204, 204, 204));

        jtableagregarSer.setBackground(new java.awt.Color(204, 204, 204));
        jtableagregarSer.setForeground(new java.awt.Color(0, 0, 0));
        jtableagregarSer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableagregarSer.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtableagregarSer.setFocusable(false);
        jScrollPane5.setViewportView(jtableagregarSer);

        jPanelAgregarSer.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 320, 500));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarSer.png"))); // NOI18N
        jPanelAgregarSer.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 270, 150));

        jMenu.addTab("tab8", jPanelAgregarSer);

        jPanelEliminarSer.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEliminarSer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pAgregarHab2.setBackground(new java.awt.Color(233, 230, 230));
        pAgregarHab2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        beliminarAE.setBackground(new java.awt.Color(102, 102, 102));
        beliminarAE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        beliminarAE.setForeground(new java.awt.Color(255, 255, 255));
        beliminarAE.setText("ELIMINAR");
        beliminarAE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        beliminarAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarAEActionPerformed(evt);
            }
        });
        pAgregarHab2.add(beliminarAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 120, 30));

        lnombreAE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombreAE.setForeground(new java.awt.Color(51, 51, 51));
        lnombreAE.setText("NOMBRE SERVICIO");
        pAgregarHab2.add(lnombreAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        inombreAE.setBackground(new java.awt.Color(153, 153, 153));
        inombreAE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombreAE.setForeground(new java.awt.Color(255, 255, 255));
        inombreAE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inombreAE.setBorder(null);
        inombreAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombreAEActionPerformed(evt);
            }
        });
        pAgregarHab2.add(inombreAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 150, 25));

        jPanelEliminarSer.add(pAgregarHab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 350, 110));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarSer.png"))); // NOI18N
        jPanelEliminarSer.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, 140));

        jScrollPane6.setBackground(new java.awt.Color(204, 204, 204));

        jtableEliminarSer.setBackground(new java.awt.Color(204, 204, 204));
        jtableEliminarSer.setForeground(new java.awt.Color(0, 0, 0));
        jtableEliminarSer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableEliminarSer.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtableEliminarSer.setFocusable(false);
        jScrollPane6.setViewportView(jtableEliminarSer);

        jPanelEliminarSer.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 320, 500));

        jMenu.addTab("tab9", jPanelEliminarSer);

        jPanelModificarSer.setBackground(new java.awt.Color(255, 255, 255));
        jPanelModificarSer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pMSer.setBackground(new java.awt.Color(233, 230, 230));
        pMSer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bBuscarS.setBackground(new java.awt.Color(102, 102, 102));
        bBuscarS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bBuscarS.setForeground(new java.awt.Color(255, 255, 255));
        bBuscarS.setText("BUSCAR");
        bBuscarS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bBuscarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarSActionPerformed(evt);
            }
        });
        pMSer.add(bBuscarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 120, 30));

        lnombreMS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombreMS.setForeground(new java.awt.Color(51, 51, 51));
        lnombreMS.setText("NOMBRE SERVICIO");
        pMSer.add(lnombreMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        inombreMS.setBackground(new java.awt.Color(153, 153, 153));
        inombreMS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombreMS.setForeground(new java.awt.Color(255, 255, 255));
        inombreMS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inombreMS.setBorder(null);
        inombreMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombreMSActionPerformed(evt);
            }
        });
        pMSer.add(inombreMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 150, 25));

        jPanelModificarSer.add(pMSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 310, 110));

        pmsservv.setBackground(new java.awt.Color(233, 230, 230));
        pmsservv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bModificarMS.setBackground(new java.awt.Color(102, 102, 102));
        bModificarMS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bModificarMS.setForeground(new java.awt.Color(255, 255, 255));
        bModificarMS.setText("MODIFICAR");
        bModificarMS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bModificarMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarMSActionPerformed(evt);
            }
        });
        pmsservv.add(bModificarMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 120, 30));

        ltipodeservicioms.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ltipodeservicioms.setForeground(new java.awt.Color(51, 51, 51));
        ltipodeservicioms.setText("TIPO DE SERVICIO");
        pmsservv.add(ltipodeservicioms, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        botonesModiSer.add(cLavanderiaMS);
        cLavanderiaMS.setForeground(new java.awt.Color(51, 51, 51));
        cLavanderiaMS.setText("LIMPIEZA");
        cLavanderiaMS.setActionCommand("DOUBLE");
        cLavanderiaMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cLavanderiaMSActionPerformed(evt);
            }
        });
        pmsservv.add(cLavanderiaMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 109, -1, -1));

        botonesModiSer.add(cMasajeMS);
        cMasajeMS.setForeground(new java.awt.Color(51, 51, 51));
        cMasajeMS.setText("RELAX");
        cMasajeMS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cMasajeMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMasajeMSActionPerformed(evt);
            }
        });
        pmsservv.add(cMasajeMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        iprecioMS.setBackground(new java.awt.Color(153, 153, 153));
        iprecioMS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iprecioMS.setForeground(new java.awt.Color(255, 255, 255));
        iprecioMS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iprecioMS.setBorder(null);
        iprecioMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iprecioMSActionPerformed(evt);
            }
        });
        pmsservv.add(iprecioMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, 25));

        lprecioMS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lprecioMS.setForeground(new java.awt.Color(51, 51, 51));
        lprecioMS.setText("PRECIO ");
        pmsservv.add(lprecioMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        botonesModiSer.add(cTourMS);
        cTourMS.setForeground(new java.awt.Color(51, 51, 51));
        cTourMS.setText("TOUR");
        cTourMS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cTourMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTourMSActionPerformed(evt);
            }
        });
        pmsservv.add(cTourMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        lcantDisMS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcantDisMS.setForeground(new java.awt.Color(51, 51, 51));
        lcantDisMS.setText("CANT DISPONIBLE");
        pmsservv.add(lcantDisMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        iCantDisMS.setBackground(new java.awt.Color(153, 153, 153));
        iCantDisMS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iCantDisMS.setForeground(new java.awt.Color(255, 255, 255));
        iCantDisMS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iCantDisMS.setBorder(null);
        iCantDisMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iCantDisMSActionPerformed(evt);
            }
        });
        pmsservv.add(iCantDisMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, 25));

        lnombresMS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombresMS.setForeground(new java.awt.Color(51, 51, 51));
        lnombresMS.setText("NOMBRE SERVICIO");
        pmsservv.add(lnombresMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        inombresMS.setBackground(new java.awt.Color(153, 153, 153));
        inombresMS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombresMS.setForeground(new java.awt.Color(255, 255, 255));
        inombresMS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inombresMS.setBorder(null);
        inombresMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombresMSActionPerformed(evt);
            }
        });
        pmsservv.add(inombresMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 150, 25));

        jPanelModificarSer.add(pmsservv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 350, 270));

        imgMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarserv.png"))); // NOI18N
        jPanelModificarSer.add(imgMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 200, 160));

        imgMSX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMSX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modifserac.png"))); // NOI18N
        jPanelModificarSer.add(imgMSX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 350, 190));

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
        botonesAgregarEmp.clearSelection();
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
        mpMenu.setBackground(new Color(72, 147, 223));
    }//GEN-LAST:event_mlMenuMouseExited

    private void mlMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlMenuMouseClicked
        jMenu.setSelectedIndex(0);
    }//GEN-LAST:event_mlMenuMouseClicked

    private void mlMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlMenuMouseMoved
        mpMenu.setBackground(new Color(66, 126, 187));
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

    private void idniCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idniCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idniCActionPerformed

    private void beliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarEmpActionPerformed
        String dni = idniC.getText();
        if (dni.equalsIgnoreCase(menuE.getDni())) {
            JOptionPane.showMessageDialog(null, "No te puedes eliminar a ti mismo");
        } else {
            GP.EliminarE(dni);
            CargarTabla();
        }
        idniC.setText("");
    }//GEN-LAST:event_beliminarEmpActionPerformed

    private void idniModiEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idniModiEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idniModiEActionPerformed

    private void bBuscarModificarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarModificarEActionPerformed
        //HACE LA BUSQUEDA DEL EMPLEADO Y TRAE SU INFORMACION AL CAMPO
        String dni = idniModiE.getText();
        boolean Noencontro = false;
        for (int i = 0; i < GP.getConta(); i++) {
            if (arreglo[i].getDni().equalsIgnoreCase(dni)) {
                inombreM.setText(arreglo[i].getNombre());
                iapellidoM.setText(arreglo[i].getApellido());
                idniM.setText(arreglo[i].getDni());
                iuserM.setText(arreglo[i].getUser());
                icontraM.setText(arreglo[i].getContra());
                if (arreglo[i].getRol().equalsIgnoreCase("Admin")) {
                    cAdministradorM.setSelected(true);
                } else if (arreglo[i].getRol().equalsIgnoreCase("Rec")) {
                    cRecepcionitaM.setSelected(true);
                }
                Noencontro = false;
                break;
            } else {
                Noencontro = true;
            }
        }
        if (Noencontro == true) {
            JOptionPane.showMessageDialog(null, "No se encontro el empleado");
        }

    }//GEN-LAST:event_bBuscarModificarEActionPerformed

    private void inombreMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombreMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombreMActionPerformed

    private void bmodificarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarEmpActionPerformed
        //REALIZA LOS CAMBIOS AL EMPLEADO
        String dni = idniModiE.getText();
        String persN = idniModiE.getText();
        if (menuE.getDni().equalsIgnoreCase(persN)) {
            JOptionPane.showMessageDialog(null, "No puedes modificarte a ti mismo"); 
        } else {
            for (int i = 0; i < GP.getConta(); i++) {
                if (arreglo[i].getDni().equalsIgnoreCase(dni)) {
                    arreglo[i].setNombre(inombreM.getText());
                    arreglo[i].setApellido(iapellidoM.getText());
                    arreglo[i].setDni(idniM.getText());
                    arreglo[i].setUser(iuserM.getText());
                    arreglo[i].setContra(icontraM.getText());
                    if (cAdministradorM.isSelected()) {
                        arreglo[i].setRol("ADMIN");
                    } else if (cRecepcionitaM.isSelected()) {
                        arreglo[i].setRol("REC");
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Cambios hechos en empleado"); 
        }
        //VACIA LOS TEXTFIELDS
        CargarTabla();
        inombreM.setText("");
        iapellidoM.setText("");
        idniM.setText("");
        iuserM.setText("");
        icontraM.setText("");
        idniModiE.setText("");
        botonesModificarEmp.clearSelection();
        
    }//GEN-LAST:event_bmodificarEmpActionPerformed

    private void iapellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iapellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iapellidoMActionPerformed

    private void cRecepcionitaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRecepcionitaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRecepcionitaMActionPerformed

    private void cAdministradorMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAdministradorMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAdministradorMActionPerformed

    private void idniMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idniMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idniMActionPerformed

    private void iuserMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iuserMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iuserMActionPerformed

    private void icontraMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icontraMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icontraMActionPerformed

    private void bagregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregar1ActionPerformed
        //AGREGAR HABITACION A LA LISTA
        int numH = GH.getContaH()+1;
        int capMax = Integer.parseInt(this.icapacidadH.getText());
        float precioF = Float.parseFloat(iprecioH.getText());
        String estado = "";
        if (cdisponibleH.isSelected()) {
            estado = "DISPONIBLE";
        } else if (creservadoH.isSelected()) {
            estado = "RESERVADO";
        } else if (cocupadoH.isSelected()) {
            estado = "OCUPADO";
        }
        if (cEstandarH.isSelected()) {
            Estandar ref = new Estandar(capMax, "EST", estado, precioF);
            ref.setNum(numH);
            GH.IngresarHab(ref);
        } else if (cdeluxeH.isSelected()) {
            Deluxe ref = new Deluxe(capMax, "DEL", estado, precioF);
            ref.setNum(numH);
            GH.IngresarHab(ref);
        } else if (csuiteH.isSelected()) {
            Suite ref = new Suite(capMax, "SUI" , estado, precioF);
            ref.setNum(numH);
            GH.IngresarHab(ref);
        }
        System.out.println(GH.getContaH());
        CargarTablaH();
        this.icapacidadH.setText("");
        this.iprecioH.setText("");
        botonesAgregarHab.clearSelection();
        botonesAgregEstado.clearSelection();
    }//GEN-LAST:event_bagregar1ActionPerformed

    public void CargarTablaH() {
        int fila = this.jtableaAgregarHab.getRowCount();
        for (int i = 0; i < fila; i++) {
            modeloH.removeRow(0);
        }
        Habitacion[] arregloH = GH.getArregloHab();
        String[] datos = new String[6];
        for (int i = 0; i < GH.getContaH(); i++) {
            datos[0] = String.valueOf(arregloH[i].getNum());
            datos[1] = String.valueOf(arregloH[i].getCapMax());
            datos[2] = arregloH[i].getTipoHabi();
            datos[3] = arregloH[i].getEstado();
            datos[4] = String.valueOf("S/. "+arregloH[i].getPrecNoche());

            modeloH.addRow(datos);
        }     
    }
    
    private void icapacidadHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icapacidadHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icapacidadHActionPerformed

    private void csuiteHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csuiteHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csuiteHActionPerformed

    private void cEstandarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEstandarHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEstandarHActionPerformed

    private void iprecioHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iprecioHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iprecioHActionPerformed

    private void cdeluxeHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdeluxeHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdeluxeHActionPerformed

    private void inumeroEHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inumeroEHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inumeroEHActionPerformed

    private void beliminarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarHabActionPerformed
        int num = Integer.parseInt(inumeroEH.getText());
        GH.EliminarHab(num);
        inumeroEH.setText("");
        CargarTablaH();
    }//GEN-LAST:event_beliminarHabActionPerformed

    private void inumeroHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inumeroHMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inumeroHMActionPerformed

    private void bModificarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarHabActionPerformed
        int num = Integer.parseInt(inumeroHM.getText());
        boolean noencontro = false;
        for (int i = 0; i < GH.getContaH(); i++) {
            if (arregloH[i].getNum()== num) {
                icapacidadMH.setText(String.valueOf(arregloH[i].getCapMax()));
                iprecioMH.setText(String.valueOf(arregloH[i].getPrecNoche()));
                iprecioMH.setText(String.valueOf(arregloH[i].getPrecNoche()));
                if (arregloH[i].getEstado().equalsIgnoreCase("DISPONIBLE")) {
                    cdisponibleMH.setSelected(true);
                } else if (arregloH[i].getEstado().equalsIgnoreCase("RESERVADO")) {
                    creservadoMH.setSelected(true);
                } else if (arregloH[i].getEstado().equalsIgnoreCase("OCUPADO")) {
                    cocupadoMH.setSelected(true); 
                }
                if (arregloH[i].getTipoHabi().equalsIgnoreCase("EST")) {
                    cEstandarMH.setSelected(true);
                } else if (arregloH[i].getTipoHabi().equalsIgnoreCase("DEL")) {
                    cDeluxeMH.setSelected(true);
                } else if (arregloH[i].getTipoHabi().equalsIgnoreCase("SUI")) {
                    cSuiteMH.setSelected(true);
                }
                noencontro = false;
                break;
            } else {
                noencontro = true;
            }
        }
        if (noencontro == true) {
            JOptionPane.showMessageDialog(null, "Habitacion no encontrada");
        }
    }//GEN-LAST:event_bModificarHabActionPerformed

    private void bmodificarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarHabActionPerformed
        int num = Integer.parseInt(inumeroHM.getText());        
        for (int i = 0; i < GH.getContaH(); i++) {
            if (arregloH[i].getNum() == num) {
                arregloH[i].setCapMax(Integer.parseInt(icapacidadMH.getText())); 
                arregloH[i].setPrecNoche(Float.parseFloat(iprecioMH.getText())); 
                if (cdisponibleMH.isSelected()) {
                    arregloH[i].setEstado("DISPONIBLE");
                } else if (creservadoMH.isSelected()) {
                    arregloH[i].setEstado("RESERVADO");
                } else if (cocupadoMH.isSelected()) {
                    arregloH[i].setEstado("OCUPADO");
                }
                if (cEstandarMH.isSelected()) {
                    arregloH[i].setTipoHabi("EST");
                } else if (cDeluxeMH.isSelected()) {
                    arregloH[i].setTipoHabi("DEL");
                } else if (cSuiteMH.isSelected()) {
                    arregloH[i].setTipoHabi("SUI");
                }
            }
        }
        CargarTablaH();
        inumeroHM.setText("");
        icapacidadMH.setText("");
        iprecioMH.setText(""); 
        botonesModiEst.clearSelection();
        botonesModiHab.clearSelection();
    }//GEN-LAST:event_bmodificarHabActionPerformed

    private void icapacidadMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icapacidadMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icapacidadMHActionPerformed

    private void cSuiteMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSuiteMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cSuiteMHActionPerformed

    private void cEstandarMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEstandarMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEstandarMHActionPerformed

    private void iprecioMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iprecioMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iprecioMHActionPerformed

    private void cDeluxeMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDeluxeMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDeluxeMHActionPerformed

    private void cdisponibleHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdisponibleHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdisponibleHActionPerformed

    private void creservadoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creservadoHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creservadoHActionPerformed

    private void cocupadoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocupadoHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cocupadoHActionPerformed

    private void cdisponibleMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdisponibleMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdisponibleMHActionPerformed

    private void creservadoMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creservadoMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creservadoMHActionPerformed

    private void cocupadoMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocupadoMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cocupadoMHActionPerformed

    private void bagregarASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarASActionPerformed
        String nom = inombreAS.getText();
        float prec = Float.parseFloat(iprecioAS.getText());
        int cant = Integer.parseInt(iCantDisAS.getText());
        if (cMasajeAS.isSelected()) {
            Relax ref = new Relax(nom, prec, cant);
            ref.setTipo("RELAX");
            GS.IngresarServicio(ref);
        } else if (cTourAS.isSelected()) {
            Tour ref = new Tour(nom, prec, cant);
            ref.setTipo("TOUR");
            GS.IngresarServicio(ref);
        } else if (cLavanderiaAS.isSelected()) {
            Limpieza ref = new Limpieza(nom, prec, cant);
            ref.setTipo("LIMPIEZA");
            GS.IngresarServicio(ref);
        }
        
        CargarTablaS(); 
        this.inombreAS.setText("");
        this.iprecioAS.setText("");
        this.iCantDisAS.setText("");
        botonesAgregarServ.clearSelection();
    }//GEN-LAST:event_bagregarASActionPerformed
    
    public void CargarTablaS(){
        int fila = this.jtableagregarSer.getRowCount();
        for (int i = 0; i < fila; i++) {
            modeloS.removeRow(0);
        }
        
        Servicio[] arregloS = GS.getArregloS();
        String[] datos = new String[4];
        for (int i = 0; i < GS.getContaS(); i++) {
            datos[0] = arregloS[i].getNomServicio();
            datos[1] = arregloS[i].getTipo();
            datos[2] = String.valueOf("S/. "+arregloS[i].getPrecServicio());
            datos[3] = String.valueOf(arregloS[i].getCantSerDisponibles()+" reserv");
            
            modeloS.addRow(datos);
        }
    }
    
    private void cLavanderiaASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLavanderiaASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cLavanderiaASActionPerformed

    private void cMasajeASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMasajeASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMasajeASActionPerformed

    private void iprecioASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iprecioASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iprecioASActionPerformed

    private void cTourASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTourASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTourASActionPerformed

    private void iCantDisASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iCantDisASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iCantDisASActionPerformed

    private void inombreASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombreASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombreASActionPerformed

    private void beliminarAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarAEActionPerformed
        String nom = inombreAE.getText();
        GS.EliminarServicio(nom);
        inombreAE.setText("");
        CargarTablaS();
    }//GEN-LAST:event_beliminarAEActionPerformed

    private void inombreAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombreAEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombreAEActionPerformed

    private void bBuscarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarSActionPerformed
        boolean noencontro = false;
        String nom = inombreMS.getText();
        for (int i = 0; i < GS.getContaS(); i++) {
            if (arregloS[i].getNomServicio().equalsIgnoreCase(nom)) {
                inombresMS.setText(arregloS[i].getNomServicio());
                iprecioMS.setText(String.valueOf(arregloS[i].getPrecServicio()));
                iCantDisMS.setText(String.valueOf(arregloS[i].getCantSerDisponibles()));
                if (arregloS[i].getTipo().equalsIgnoreCase("RELAX")) {
                    cMasajeMS.setSelected(true);
                } else  if (arregloS[i].getTipo().equalsIgnoreCase("TOUR")) {
                    cTourMS.setSelected(true);
                } else if (arregloS[i].getTipo().equalsIgnoreCase("LIMPIEZA")) {
                    cLavanderiaMS.setSelected(true);
                }
                noencontro = false;
                break;
            } 
            else {
                noencontro = true;
            }
        }
        if (noencontro == true) {
            JOptionPane.showMessageDialog(null, "Servicio no encontrado");
        }
    }//GEN-LAST:event_bBuscarSActionPerformed

    private void inombreMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombreMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombreMSActionPerformed

    private void bModificarMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarMSActionPerformed
        String nom = inombreMS.getText();
        for (int i = 0; i < GS.getContaS(); i++) {
            if (arregloS[i].getNomServicio().equalsIgnoreCase(nom)) {
                arregloS[i].setNomServicio(inombresMS.getText());
                arregloS[i].setPrecServicio(Float.parseFloat(iprecioMS.getText()));
                arregloS[i].setCantSerDisponibles(Integer.parseInt(iCantDisMS.getText())); 
                if (cMasajeMS.isSelected()) {
                    arregloS[i].setTipo("RELAX");
                } else if (cTourMS.isSelected()) {
                    arregloS[i].setTipo("TOUR");
                } else if (cLavanderiaMS.isSelected()) {
                    arregloS[i].setTipo("LIMPIEZA");
                }
            }
        }
        CargarTablaS();
        inombreMS.setText("");
        inombresMS.setText("");
        iCantDisMS.setText("");
        iprecioMS.setText("");
        botonesModiSer.clearSelection();
    }//GEN-LAST:event_bModificarMSActionPerformed

    private void cLavanderiaMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLavanderiaMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cLavanderiaMSActionPerformed

    private void cMasajeMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMasajeMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMasajeMSActionPerformed

    private void iprecioMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iprecioMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iprecioMSActionPerformed

    private void cTourMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTourMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTourMSActionPerformed

    private void iCantDisMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iCantDisMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iCantDisMSActionPerformed

    private void inombresMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombresMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombresMSActionPerformed

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
    private javax.swing.JButton bBuscarModificarE;
    private javax.swing.JButton bBuscarS;
    private javax.swing.JButton bModificarHab;
    private javax.swing.JButton bModificarMS;
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bagregar1;
    private javax.swing.JButton bagregarAS;
    private javax.swing.JButton beliminarAE;
    private javax.swing.JButton beliminarEmp;
    private javax.swing.JButton beliminarHab;
    private javax.swing.JPanel bg;
    private javax.swing.JButton bmodificarEmp;
    private javax.swing.JButton bmodificarHab;
    private javax.swing.ButtonGroup botonesAgregEstado;
    private javax.swing.ButtonGroup botonesAgregarEmp;
    private javax.swing.ButtonGroup botonesAgregarHab;
    private javax.swing.ButtonGroup botonesAgregarServ;
    private javax.swing.ButtonGroup botonesModiEst;
    private javax.swing.ButtonGroup botonesModiHab;
    private javax.swing.ButtonGroup botonesModiSer;
    private javax.swing.ButtonGroup botonesModificarEmp;
    private javax.swing.JRadioButton cAdministrador;
    private javax.swing.JRadioButton cAdministradorM;
    private javax.swing.JRadioButton cDeluxeMH;
    private javax.swing.JRadioButton cEstandarH;
    private javax.swing.JRadioButton cEstandarMH;
    private javax.swing.JRadioButton cLavanderiaAS;
    private javax.swing.JRadioButton cLavanderiaMS;
    private javax.swing.JRadioButton cMasajeAS;
    private javax.swing.JRadioButton cMasajeMS;
    private javax.swing.JRadioButton cRecepcionita;
    private javax.swing.JRadioButton cRecepcionitaM;
    private javax.swing.JRadioButton cSuiteMH;
    private javax.swing.JRadioButton cTourAS;
    private javax.swing.JRadioButton cTourMS;
    private javax.swing.JRadioButton cdeluxeH;
    private javax.swing.JRadioButton cdisponibleH;
    private javax.swing.JRadioButton cdisponibleMH;
    private javax.swing.JRadioButton cocupadoH;
    private javax.swing.JRadioButton cocupadoMH;
    private javax.swing.JRadioButton creservadoH;
    private javax.swing.JRadioButton creservadoMH;
    private javax.swing.JRadioButton csuiteH;
    private javax.swing.JPanel dashboard;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField iCantDisAS;
    private javax.swing.JTextField iCantDisMS;
    private javax.swing.JTextField iapellido;
    private javax.swing.JTextField iapellidoM;
    private javax.swing.JTextField icapacidadH;
    private javax.swing.JTextField icapacidadMH;
    private javax.swing.JTextField icontra;
    private javax.swing.JTextField icontraM;
    private javax.swing.JTextField idni;
    private javax.swing.JTextField idniC;
    private javax.swing.JTextField idniM;
    private javax.swing.JTextField idniModiE;
    private javax.swing.JLabel imagenAgregarHab;
    private javax.swing.JLabel imgMS;
    private javax.swing.JLabel imgMSX;
    private javax.swing.JLabel imgpersona;
    private javax.swing.JTextField inombre;
    private javax.swing.JTextField inombreAE;
    private javax.swing.JTextField inombreAS;
    private javax.swing.JTextField inombreM;
    private javax.swing.JTextField inombreMS;
    private javax.swing.JTextField inombresMS;
    private javax.swing.JTextField inumeroEH;
    private javax.swing.JTextField inumeroHM;
    private javax.swing.JTextField iprecioAS;
    private javax.swing.JTextField iprecioH;
    private javax.swing.JTextField iprecioMH;
    private javax.swing.JTextField iprecioMS;
    private javax.swing.JTextField iuser;
    private javax.swing.JTextField iuserM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel jimagenModHab;
    private javax.swing.JLabel jimagenModiEmp;
    private javax.swing.JLabel jimagenModificarHab;
    private javax.swing.JTable jtableEliminarEmp;
    private javax.swing.JTable jtableEliminarSer;
    private javax.swing.JTable jtableaAgregarHab;
    private javax.swing.JTable jtableaEliminarHab;
    private javax.swing.JTable jtableagregarSer;
    private javax.swing.JTable jtableagregarem;
    private javax.swing.JLabel lapellido;
    private javax.swing.JLabel lapellidoM;
    private javax.swing.JLabel lapellidoMH;
    private javax.swing.JLabel lcantDisAS;
    private javax.swing.JLabel lcantDisMS;
    private javax.swing.JLabel lcapacidadH;
    private javax.swing.JLabel lcontra;
    private javax.swing.JLabel lcontraM;
    private javax.swing.JLabel ldni;
    private javax.swing.JLabel ldniC;
    private javax.swing.JLabel ldniM;
    private javax.swing.JLabel ldniModE;
    private javax.swing.JLabel lestadoH;
    private javax.swing.JLabel lestadoMH;
    private javax.swing.JLabel lexit;
    private javax.swing.JLabel lminus;
    private javax.swing.JLabel lnombre;
    private javax.swing.JLabel lnombreAE;
    private javax.swing.JLabel lnombreAS;
    private javax.swing.JLabel lnombreM;
    private javax.swing.JLabel lnombreMS;
    private javax.swing.JLabel lnombresMS;
    private javax.swing.JLabel lnumeroHM;
    private javax.swing.JLabel lnumeroeEH;
    private javax.swing.JLabel lpEmpleados;
    private javax.swing.JLabel lpHabitaciones;
    private javax.swing.JLabel lpReportes;
    private javax.swing.JLabel lpServicios;
    private javax.swing.JLabel lprecioAS;
    private javax.swing.JLabel lprecioH;
    private javax.swing.JLabel lprecioMH;
    private javax.swing.JLabel lprecioMS;
    private javax.swing.JLabel lpuestotrabajo;
    private javax.swing.JLabel lpuestotrabajo1;
    private javax.swing.JLabel lpuestotrabajoM;
    private javax.swing.JLabel lrolprofile;
    private javax.swing.JLabel ltipodehabitacion;
    private javax.swing.JLabel ltipodeservicioAS;
    private javax.swing.JLabel ltipodeservicioms;
    private javax.swing.JLabel luser;
    private javax.swing.JLabel luserM;
    private javax.swing.JLabel luserprofile;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menuimagen;
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
    private javax.swing.JPanel pAgregarHab;
    private javax.swing.JPanel pAgregarHab1;
    private javax.swing.JPanel pAgregarHab2;
    private javax.swing.JPanel pEliminar;
    private javax.swing.JPanel pEliminarH;
    private javax.swing.JPanel pEliminarH1;
    private javax.swing.JPanel pMSer;
    private javax.swing.JPanel pModificarE;
    private javax.swing.JPanel pModificarEmp;
    private javax.swing.JPanel pModificarHab;
    private javax.swing.JPanel panelPEmpleados;
    private javax.swing.JPanel panelPHabitaciones;
    private javax.swing.JPanel panelPReportes;
    private javax.swing.JPanel panelPServicios;
    private javax.swing.JPanel perfilmenu;
    private javax.swing.JPanel pexit;
    private javax.swing.JPanel pminus;
    private javax.swing.JPanel pmsservv;
    // End of variables declaration//GEN-END:variables
}
