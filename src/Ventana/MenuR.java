package Ventana;

import Code.Base;
import Code.Empleado;
import Code.GestionHabitacion;
import Code.GestionHuesped;
import Code.GestionPersona;
import Code.GestionServicio;
import Code.GestionSistema;
import Code.Habitacion;
import Code.Huesped;
import Code.Miembro;
import Code.Servicio;
import java.awt.Color;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuR extends javax.swing.JFrame {
    //VARIABLES
    private DefaultTableModel modelo;
    private DefaultTableModel modeloH;
    private GestionPersona GP;
    private GestionHabitacion GH;
    private GestionServicio GS;
    private GestionHuesped GC;
    private Habitacion[] arregloH;
    private Huesped[] arregloC;
    private Empleado[] arreglo;
    private Servicio[] arregloS;  
    private Empleado menuS;
    GestionSistema sis;
    Empleado personActual;
    int mousepX;
    int mousepY;
    
    //CONSTRUCTOR
    public MenuR(Empleado ref, GestionSistema sis) {
        initComponents();
        this.sis = sis;
        this.personActual = ref;
        this.GP = sis.getGP();
        this.GH = sis.getGH();
        this.GS = sis.getGS();
        this.GC = sis.getGC();
        
        String userPr = ref.getNombre() + " " + ref.getApellido();
        luserprofile.setText(userPr.toUpperCase());
        lrolprofile.setText("RECEPCIONISTA");
        
        //TABLAS HUESPEEDES
        modelo = new DefaultTableModel();
        modelo.addColumn("Code");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dni");
        modelo.addColumn("Pase");
        modelo.addColumn("N° Hab");
        this.jtableHuespedes.setModel(modelo);
        this.jtableEliminaCliente.setModel(modelo);
        jtableHuespedes.getTableHeader().setResizingAllowed(false);
        jtableEliminaCliente.getTableHeader().setResizingAllowed(false);
        jtableHuespedes.getTableHeader().setReorderingAllowed(false);
        jtableEliminaCliente.getTableHeader().setReorderingAllowed(false);
        
        //TABLAS HABITACIONES
        modeloH = new DefaultTableModel();
        modeloH.addColumn("Num");
        modeloH.addColumn("Capacidad");
        modeloH.addColumn("Tipo");
        modeloH.addColumn("Estado");
        modeloH.addColumn("Precio S/.");
        this.jtableHabitaciones.setModel(modeloH);
        jtableHabitaciones.getTableHeader().setResizingAllowed(false);
        jtableHabitaciones.getTableHeader().setReorderingAllowed(false);
        
        this.arregloH = GH.getArregloHab();
        this.arregloS = GS.getArregloS();
        this.arregloC = GC.getArregloC();
        CargarTablaH();
        CargarTablaC();
        setLocationRelativeTo(null);
    }

    private MenuR() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesAgregarH = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        cerrarses = new javax.swing.JPanel();
        flecha = new javax.swing.JLabel();
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
        mpMostrarH = new javax.swing.JPanel();
        mostrarH = new javax.swing.JLabel();
        mpAgregar = new javax.swing.JPanel();
        mlAgregar = new javax.swing.JLabel();
        mpEliminar = new javax.swing.JPanel();
        mlEliminar = new javax.swing.JLabel();
        mpModificar = new javax.swing.JPanel();
        mlModificar = new javax.swing.JLabel();
        panelPHabitaciones = new javax.swing.JPanel();
        lpHabitaciones = new javax.swing.JLabel();
        mpRegistrarR = new javax.swing.JPanel();
        mlregistrarR = new javax.swing.JLabel();
        mpEliminar1 = new javax.swing.JPanel();
        mlEliminarR = new javax.swing.JLabel();
        mpModificar1 = new javax.swing.JPanel();
        mlModificarR = new javax.swing.JLabel();
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
        pmenuPrincipal = new javax.swing.JPanel();
        imgMenuPrinvipal = new javax.swing.JLabel();
        pmostrarH = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtableHuespedes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pregistratHuesped = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pAgregar = new javax.swing.JPanel();
        lnombreC = new javax.swing.JLabel();
        inombreC = new javax.swing.JTextField();
        bagregar = new javax.swing.JButton();
        iapellidoC = new javax.swing.JTextField();
        lpaseCliente = new javax.swing.JLabel();
        cMiembroC = new javax.swing.JRadioButton();
        cBaseC = new javax.swing.JRadioButton();
        lapellidoC = new javax.swing.JLabel();
        idniC = new javax.swing.JTextField();
        ldniC = new javax.swing.JLabel();
        lhabitacionC = new javax.swing.JLabel();
        inumHabC = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableHabitaciones = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        peliminarHuesped = new javax.swing.JPanel();
        peliminarC = new javax.swing.JPanel();
        lcodeMC = new javax.swing.JLabel();
        icodeMC = new javax.swing.JTextField();
        bEliminarC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableEliminaCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        pmodificarHuesped = new javax.swing.JPanel();
        pBuscarC = new javax.swing.JPanel();
        lcodigoMH = new javax.swing.JLabel();
        icodigoMH = new javax.swing.JTextField();
        bBuscarMH = new javax.swing.JButton();
        jimagenModificarHab = new javax.swing.JLabel();
        bmodih = new javax.swing.JPanel();
        lnombreCH = new javax.swing.JLabel();
        inombreCH = new javax.swing.JTextField();
        bmodificarCH = new javax.swing.JButton();
        iapellidoCH = new javax.swing.JTextField();
        lpaseClienteH = new javax.swing.JLabel();
        cMiembroCH = new javax.swing.JRadioButton();
        cBaseCH = new javax.swing.JRadioButton();
        lapellidoCH = new javax.swing.JLabel();
        idniCH = new javax.swing.JTextField();
        ldniCH = new javax.swing.JLabel();
        lhabitacionCH = new javax.swing.JLabel();
        inumHabCH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarses.setBackground(new java.awt.Color(43, 137, 230));

        flecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        flecha.setForeground(new java.awt.Color(255, 255, 255));
        flecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flecha.setText("<");
        flecha.setToolTipText("Cerrar sesion");
        flecha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        flecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                flechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                flechaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarsesLayout = new javax.swing.GroupLayout(cerrarses);
        cerrarses.setLayout(cerrarsesLayout);
        cerrarsesLayout.setHorizontalGroup(
            cerrarsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(flecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        cerrarsesLayout.setVerticalGroup(
            cerrarsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(flecha, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(cerrarses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

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

        menu.add(panelPEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 40));

        mpMostrarH.setBackground(new java.awt.Color(121, 180, 239));

        mostrarH.setBackground(new java.awt.Color(43, 137, 230));
        mostrarH.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mostrarH.setForeground(new java.awt.Color(255, 255, 255));
        mostrarH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarH.setText("Mostrar Huespedes");
        mostrarH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mostrarHMouseMoved(evt);
            }
        });
        mostrarH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarHMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarHMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpMostrarHLayout = new javax.swing.GroupLayout(mpMostrarH);
        mpMostrarH.setLayout(mpMostrarHLayout);
        mpMostrarHLayout.setHorizontalGroup(
            mpMostrarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpMostrarHLayout.createSequentialGroup()
                .addComponent(mostrarH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpMostrarHLayout.setVerticalGroup(
            mpMostrarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarH, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpMostrarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, -1));

        mpAgregar.setBackground(new java.awt.Color(121, 180, 239));

        mlAgregar.setBackground(new java.awt.Color(43, 137, 230));
        mlAgregar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
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

        menu.add(mpAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 20));

        mpEliminar.setBackground(new java.awt.Color(121, 180, 239));

        mlEliminar.setBackground(new java.awt.Color(43, 137, 230));
        mlEliminar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlEliminar.setForeground(new java.awt.Color(255, 255, 255));
        mlEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlEliminar.setText("Eliminar Huesped");
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

        menu.add(mpEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 20));

        mpModificar.setBackground(new java.awt.Color(121, 180, 239));

        mlModificar.setBackground(new java.awt.Color(43, 137, 230));
        mlModificar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlModificar.setForeground(new java.awt.Color(255, 255, 255));
        mlModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlModificar.setText("Modificar Huesped");
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

        menu.add(mpModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 20));

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

        menu.add(panelPHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 230, 40));

        mpRegistrarR.setBackground(new java.awt.Color(121, 180, 239));

        mlregistrarR.setBackground(new java.awt.Color(43, 137, 230));
        mlregistrarR.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlregistrarR.setForeground(new java.awt.Color(255, 255, 255));
        mlregistrarR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlregistrarR.setText("Registrar Reservacion");
        mlregistrarR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlregistrarRMouseMoved(evt);
            }
        });
        mlregistrarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlregistrarRMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlregistrarRMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpRegistrarRLayout = new javax.swing.GroupLayout(mpRegistrarR);
        mpRegistrarR.setLayout(mpRegistrarRLayout);
        mpRegistrarRLayout.setHorizontalGroup(
            mpRegistrarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpRegistrarRLayout.createSequentialGroup()
                .addComponent(mlregistrarR, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpRegistrarRLayout.setVerticalGroup(
            mpRegistrarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlregistrarR, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpRegistrarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 230, -1));

        mpEliminar1.setBackground(new java.awt.Color(121, 180, 239));

        mlEliminarR.setBackground(new java.awt.Color(43, 137, 230));
        mlEliminarR.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlEliminarR.setForeground(new java.awt.Color(255, 255, 255));
        mlEliminarR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlEliminarR.setText("Eliminar Reservacion");
        mlEliminarR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlEliminarRMouseMoved(evt);
            }
        });
        mlEliminarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlEliminarRMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlEliminarRMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpEliminar1Layout = new javax.swing.GroupLayout(mpEliminar1);
        mpEliminar1.setLayout(mpEliminar1Layout);
        mpEliminar1Layout.setHorizontalGroup(
            mpEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpEliminar1Layout.createSequentialGroup()
                .addComponent(mlEliminarR, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpEliminar1Layout.setVerticalGroup(
            mpEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlEliminarR, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 20));

        mpModificar1.setBackground(new java.awt.Color(121, 180, 239));

        mlModificarR.setBackground(new java.awt.Color(43, 137, 230));
        mlModificarR.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlModificarR.setForeground(new java.awt.Color(255, 255, 255));
        mlModificarR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlModificarR.setText("Modificar Reservacion");
        mlModificarR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mlModificarRMouseMoved(evt);
            }
        });
        mlModificarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlModificarRMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlModificarRMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mpModificar1Layout = new javax.swing.GroupLayout(mpModificar1);
        mpModificar1.setLayout(mpModificar1Layout);
        mpModificar1Layout.setHorizontalGroup(
            mpModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpModificar1Layout.createSequentialGroup()
                .addComponent(mlModificarR, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mpModificar1Layout.setVerticalGroup(
            mpModificar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mlModificarR, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        menu.add(mpModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 20));

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

        menu.add(panelPReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 230, -1));

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

        menu.add(mpGenInfoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 230, -1));

        mpGenInfoIng.setBackground(new java.awt.Color(121, 180, 239));

        mlGenInfoIng.setBackground(new java.awt.Color(43, 137, 230));
        mlGenInfoIng.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        mlGenInfoIng.setForeground(new java.awt.Color(255, 255, 255));
        mlGenInfoIng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlGenInfoIng.setText("Informe Huespedes");
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

        menu.add(mpGenInfoIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 230, -1));

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

        pmenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pmenuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgMenuPrinvipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMGMENU.png"))); // NOI18N
        pmenuPrincipal.add(imgMenuPrinvipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 700, 500));

        jMenu.addTab("tab1", pmenuPrincipal);

        pmostrarH.setBackground(new java.awt.Color(255, 255, 255));
        pmostrarH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBackground(new java.awt.Color(204, 204, 204));

        jtableHuespedes.setBackground(new java.awt.Color(204, 204, 204));
        jtableHuespedes.setForeground(new java.awt.Color(0, 0, 0));
        jtableHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableHuespedes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtableHuespedes.setFocusable(false);
        jScrollPane4.setViewportView(jtableHuespedes);

        pmostrarH.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 400, 500));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huesped.png"))); // NOI18N
        pmostrarH.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 300, 330));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HUESPEDES");
        pmostrarH.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 310, 40));

        jMenu.addTab("tab5", pmostrarH);

        pregistratHuesped.setBackground(new java.awt.Color(255, 255, 255));
        pregistratHuesped.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgregistrarHues.png"))); // NOI18N
        pregistratHuesped.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 280, 140));

        pAgregar.setBackground(new java.awt.Color(233, 230, 230));
        pAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnombreC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombreC.setForeground(new java.awt.Color(51, 51, 51));
        lnombreC.setText("NOMBRE");
        pAgregar.add(lnombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        inombreC.setBackground(new java.awt.Color(153, 153, 153));
        inombreC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombreC.setForeground(new java.awt.Color(255, 255, 255));
        inombreC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inombreC.setBorder(null);
        inombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombreCActionPerformed(evt);
            }
        });
        pAgregar.add(inombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 25));

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
        pAgregar.add(bagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 120, 30));

        iapellidoC.setBackground(new java.awt.Color(153, 153, 153));
        iapellidoC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iapellidoC.setForeground(new java.awt.Color(255, 255, 255));
        iapellidoC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iapellidoC.setBorder(null);
        iapellidoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iapellidoCActionPerformed(evt);
            }
        });
        pAgregar.add(iapellidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 25));

        lpaseCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lpaseCliente.setForeground(new java.awt.Color(51, 51, 51));
        lpaseCliente.setText("PASE DE CLIENTE");
        pAgregar.add(lpaseCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        botonesAgregarH.add(cMiembroC);
        cMiembroC.setForeground(new java.awt.Color(51, 51, 51));
        cMiembroC.setText("MIEMBRO");
        cMiembroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMiembroCActionPerformed(evt);
            }
        });
        pAgregar.add(cMiembroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        botonesAgregarH.add(cBaseC);
        cBaseC.setForeground(new java.awt.Color(51, 51, 51));
        cBaseC.setText("BASE");
        cBaseC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cBaseC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBaseCActionPerformed(evt);
            }
        });
        pAgregar.add(cBaseC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        lapellidoC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lapellidoC.setForeground(new java.awt.Color(51, 51, 51));
        lapellidoC.setText("APELLIDOS");
        pAgregar.add(lapellidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

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
        pAgregar.add(idniC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 150, 25));

        ldniC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ldniC.setForeground(new java.awt.Color(51, 51, 51));
        ldniC.setText("DNI");
        pAgregar.add(ldniC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        lhabitacionC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lhabitacionC.setForeground(new java.awt.Color(51, 51, 51));
        lhabitacionC.setText("HABITACION");
        pAgregar.add(lhabitacionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        inumHabC.setBackground(new java.awt.Color(153, 153, 153));
        inumHabC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inumHabC.setForeground(new java.awt.Color(255, 255, 255));
        inumHabC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inumHabC.setBorder(null);
        inumHabC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inumHabCActionPerformed(evt);
            }
        });
        pAgregar.add(inumHabC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 175, 150, 25));

        pregistratHuesped.add(pAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, 270));

        jScrollPane3.setBackground(new java.awt.Color(204, 204, 204));

        jtableHabitaciones.setBackground(new java.awt.Color(204, 204, 204));
        jtableHabitaciones.setForeground(new java.awt.Color(0, 0, 0));
        jtableHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableHabitaciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtableHabitaciones.setFocusable(false);
        jScrollPane3.setViewportView(jtableHabitaciones);

        pregistratHuesped.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 380, 470));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HABITACIONES");
        pregistratHuesped.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 380, -1));

        jMenu.addTab("tab3", pregistratHuesped);

        peliminarHuesped.setBackground(new java.awt.Color(255, 255, 255));
        peliminarHuesped.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        peliminarC.setBackground(new java.awt.Color(233, 230, 230));
        peliminarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lcodeMC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcodeMC.setForeground(new java.awt.Color(51, 51, 51));
        lcodeMC.setText("CODIGO");
        peliminarC.add(lcodeMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, -1, -1));

        icodeMC.setBackground(new java.awt.Color(153, 153, 153));
        icodeMC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        icodeMC.setForeground(new java.awt.Color(255, 255, 255));
        icodeMC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        icodeMC.setBorder(null);
        icodeMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icodeMCActionPerformed(evt);
            }
        });
        peliminarC.add(icodeMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, 25));

        bEliminarC.setBackground(new java.awt.Color(102, 102, 102));
        bEliminarC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bEliminarC.setForeground(new java.awt.Color(255, 255, 255));
        bEliminarC.setText("ELIMINAR");
        bEliminarC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarCActionPerformed(evt);
            }
        });
        peliminarC.add(bEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        peliminarHuesped.add(peliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 280, 100));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        jtableEliminaCliente.setBackground(new java.awt.Color(204, 204, 204));
        jtableEliminaCliente.setForeground(new java.awt.Color(0, 0, 0));
        jtableEliminaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableEliminaCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtableEliminaCliente.setFocusable(false);
        jScrollPane2.setViewportView(jtableEliminaCliente);

        peliminarHuesped.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 370, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgeliminarcliente.png"))); // NOI18N
        peliminarHuesped.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 160, 200));

        jMenu.addTab("tab5", peliminarHuesped);

        pmodificarHuesped.setBackground(new java.awt.Color(255, 255, 255));
        pmodificarHuesped.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pBuscarC.setBackground(new java.awt.Color(233, 230, 230));
        pBuscarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lcodigoMH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lcodigoMH.setForeground(new java.awt.Color(51, 51, 51));
        lcodigoMH.setText("CODIGO");
        pBuscarC.add(lcodigoMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, -1, -1));

        icodigoMH.setBackground(new java.awt.Color(153, 153, 153));
        icodigoMH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        icodigoMH.setForeground(new java.awt.Color(255, 255, 255));
        icodigoMH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        icodigoMH.setBorder(null);
        icodigoMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icodigoMHActionPerformed(evt);
            }
        });
        pBuscarC.add(icodigoMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 25));

        bBuscarMH.setBackground(new java.awt.Color(102, 102, 102));
        bBuscarMH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bBuscarMH.setForeground(new java.awt.Color(255, 255, 255));
        bBuscarMH.setText("BUSCAR");
        bBuscarMH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bBuscarMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarMHActionPerformed(evt);
            }
        });
        pBuscarC.add(bBuscarMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        pmodificarHuesped.add(pBuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 290, 100));

        jimagenModificarHab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jimagenModificarHab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarEmpleado.png"))); // NOI18N
        pmodificarHuesped.add(jimagenModificarHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 290, -1));

        bmodih.setBackground(new java.awt.Color(233, 230, 230));
        bmodih.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnombreCH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnombreCH.setForeground(new java.awt.Color(51, 51, 51));
        lnombreCH.setText("NOMBRE");
        bmodih.add(lnombreCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        inombreCH.setBackground(new java.awt.Color(153, 153, 153));
        inombreCH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inombreCH.setForeground(new java.awt.Color(255, 255, 255));
        inombreCH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inombreCH.setBorder(null);
        inombreCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inombreCHActionPerformed(evt);
            }
        });
        bmodih.add(inombreCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 150, 25));

        bmodificarCH.setBackground(new java.awt.Color(102, 102, 102));
        bmodificarCH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bmodificarCH.setForeground(new java.awt.Color(255, 255, 255));
        bmodificarCH.setText("MODIFICAR");
        bmodificarCH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bmodificarCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarCHActionPerformed(evt);
            }
        });
        bmodih.add(bmodificarCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, 30));

        iapellidoCH.setBackground(new java.awt.Color(153, 153, 153));
        iapellidoCH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iapellidoCH.setForeground(new java.awt.Color(255, 255, 255));
        iapellidoCH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iapellidoCH.setBorder(null);
        iapellidoCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iapellidoCHActionPerformed(evt);
            }
        });
        bmodih.add(iapellidoCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, 25));

        lpaseClienteH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lpaseClienteH.setForeground(new java.awt.Color(51, 51, 51));
        lpaseClienteH.setText("PASE DE CLIENTE");
        bmodih.add(lpaseClienteH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        cMiembroCH.setForeground(new java.awt.Color(51, 51, 51));
        cMiembroCH.setText("MIEMBRO");
        cMiembroCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMiembroCHActionPerformed(evt);
            }
        });
        bmodih.add(cMiembroCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        cBaseCH.setForeground(new java.awt.Color(51, 51, 51));
        cBaseCH.setText("BASE");
        cBaseCH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cBaseCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBaseCHActionPerformed(evt);
            }
        });
        bmodih.add(cBaseCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lapellidoCH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lapellidoCH.setForeground(new java.awt.Color(51, 51, 51));
        lapellidoCH.setText("APELLIDOS");
        bmodih.add(lapellidoCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        idniCH.setBackground(new java.awt.Color(153, 153, 153));
        idniCH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idniCH.setForeground(new java.awt.Color(255, 255, 255));
        idniCH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idniCH.setBorder(null);
        idniCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idniCHActionPerformed(evt);
            }
        });
        bmodih.add(idniCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, 25));

        ldniCH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ldniCH.setForeground(new java.awt.Color(51, 51, 51));
        ldniCH.setText("DNI");
        bmodih.add(ldniCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        lhabitacionCH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lhabitacionCH.setForeground(new java.awt.Color(51, 51, 51));
        lhabitacionCH.setText("HABITACION");
        bmodih.add(lhabitacionCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        inumHabCH.setBackground(new java.awt.Color(153, 153, 153));
        inumHabCH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inumHabCH.setForeground(new java.awt.Color(255, 255, 255));
        inumHabCH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inumHabCH.setBorder(null);
        inumHabCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inumHabCHActionPerformed(evt);
            }
        });
        bmodih.add(inumHabCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, 25));

        pmodificarHuesped.add(bmodih, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 300, 280));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgmodihuesped.png"))); // NOI18N
        pmodificarHuesped.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 300, 160));

        jMenu.addTab("tab4", pmodificarHuesped);

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

    public void CargarTablaH() {
        int fila = this.jtableHabitaciones.getRowCount();
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

    private void mlModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarMouseExited
        mpModificar.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlModificarMouseExited

    private void mlModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarMouseClicked
        jMenu.setSelectedIndex(4);
    }//GEN-LAST:event_mlModificarMouseClicked

    private void mlModificarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarMouseMoved
        mpModificar.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlModificarMouseMoved

    private void mlEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarMouseExited
        mpEliminar.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlEliminarMouseExited

    private void mlEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarMouseClicked
        jMenu.setSelectedIndex(3);
    }//GEN-LAST:event_mlEliminarMouseClicked

    private void mlEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarMouseMoved
        mpEliminar.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlEliminarMouseMoved

    private void mlAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarMouseExited
        mpAgregar.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlAgregarMouseExited

    private void mlAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlAgregarMouseClicked
        jMenu.setSelectedIndex(2);
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

    private void flechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaMouseClicked
        LogIn m1 = new LogIn(this.sis);
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_flechaMouseClicked

    private void flechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaMouseEntered
        cerrarses.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_flechaMouseEntered

    private void flechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaMouseExited
        cerrarses.setBackground(new Color(43,137,230));
    }//GEN-LAST:event_flechaMouseExited

    private void mlMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlMenuMouseMoved
        mpMenu.setBackground(new Color(66, 126, 187));
    }//GEN-LAST:event_mlMenuMouseMoved

    private void mlMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlMenuMouseClicked
        jMenu.setSelectedIndex(0);
    }//GEN-LAST:event_mlMenuMouseClicked

    private void mlMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlMenuMouseExited
        mpMenu.setBackground(new Color(72, 147, 223));
    }//GEN-LAST:event_mlMenuMouseExited

    private void inombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombreCActionPerformed

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
        int numH = Integer.parseInt(inumHabC.getText());
        if (arregloH[numH-1].getEstado().equals("DISPONIBLE")) {
            arregloH[numH-1].setEstado("OCUPADO"); 
            
            String nom = inombreC.getText();
            String apell = iapellidoC.getText();
            int dni = Integer.parseInt(idniC.getText());
            if (cBaseC.isSelected()) {
                Base ref = new Base(nom, apell, "Base", dni, numH);
                ref.generarCodigo();
                GC.IngresarHuesped(ref);
            } else if (cMiembroC.isSelected()) {
                Miembro ref = new Miembro(nom,apell, "Miembro", dni, numH);
                ref.generarCodigo();
                GC.IngresarHuesped(ref);
            }
            CargarTablaH();
            CargarTablaC();
            this.inombreC.setText("");
            this.iapellidoC.setText("");
            this.idniC.setText("");
            this.inumHabC.setText("");
            botonesAgregarH.clearSelection(); 
        } else {
            JOptionPane.showMessageDialog(null, "Habitacion ocupada o reservada");
        }
    }//GEN-LAST:event_bagregarActionPerformed

    public void CargarTablaC() {
        int fila = this.jtableHuespedes.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
        Huesped[] arregloC = GC.getArregloC();
        String[] datos = new String[6];
        for (int i = 0; i < GC.getContaC(); i++) {
            datos[0] = arregloC[i].getCode();
            datos[1] = arregloC[i].getNom().toUpperCase();
            datos[2] = String.valueOf(arregloC[i].getApell()).toUpperCase();
            datos[3] = String.valueOf(arregloC[i].getDni());
            datos[4] = arregloC[i].getPase().toUpperCase();
            datos[5] = String.valueOf(arregloC[i].getNumH());
            
            modelo.addRow(datos);
        }     
    }
    
    private void iapellidoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iapellidoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iapellidoCActionPerformed

    private void idniCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idniCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idniCActionPerformed

    private void cMiembroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMiembroCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMiembroCActionPerformed

    private void cBaseCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBaseCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBaseCActionPerformed

    private void inumHabCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inumHabCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inumHabCActionPerformed

    private void icodeMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icodeMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icodeMCActionPerformed

    private void bEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarCActionPerformed
        String code = icodeMC.getText();
        int numH = 0;
        for (int i = 0; i < GC.getContaC(); i++) {
            if (arregloC[i].getCode().equalsIgnoreCase(code)) {
                numH = arregloC[i].getNumH();
            }
        }
        arregloH[numH-1].setEstado("DISPONIBLE");
        GC.EliminarHuesped(code);
        CargarTablaC();
        CargarTablaH();
        icodeMC.setText("");
    }//GEN-LAST:event_bEliminarCActionPerformed

    private void icodigoMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icodigoMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icodigoMHActionPerformed

    private void bBuscarMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarMHActionPerformed

    }//GEN-LAST:event_bBuscarMHActionPerformed

    private void inombreCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inombreCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inombreCHActionPerformed

    private void bmodificarCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmodificarCHActionPerformed

    private void iapellidoCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iapellidoCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iapellidoCHActionPerformed

    private void cMiembroCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMiembroCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMiembroCHActionPerformed

    private void cBaseCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBaseCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBaseCHActionPerformed

    private void idniCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idniCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idniCHActionPerformed

    private void inumHabCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inumHabCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inumHabCHActionPerformed

    private void mlregistrarRMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlregistrarRMouseMoved
        mpRegistrarR.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlregistrarRMouseMoved

    private void mlregistrarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlregistrarRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mlregistrarRMouseClicked

    private void mlregistrarRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlregistrarRMouseExited
        mpRegistrarR.setBackground(new Color(121,180,239)); 
    }//GEN-LAST:event_mlregistrarRMouseExited

    private void mlEliminarRMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarRMouseMoved
        mpEliminar1.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlEliminarRMouseMoved

    private void mlEliminarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mlEliminarRMouseClicked

    private void mlEliminarRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlEliminarRMouseExited
        mpEliminar1.setBackground(new Color(121,180,239));
    }//GEN-LAST:event_mlEliminarRMouseExited

    private void mlModificarRMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarRMouseMoved
        mpModificar1.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlModificarRMouseMoved

    private void mlModificarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mlModificarRMouseClicked

    private void mlModificarRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlModificarRMouseExited
        mpModificar1.setBackground(new Color(121,180,239));
    }//GEN-LAST:event_mlModificarRMouseExited

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

    }//GEN-LAST:event_mlGenInfoHMouseClicked

    private void mlGenInfoHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoHMouseExited
        mpGenInfoH.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlGenInfoHMouseExited

    private void mlGenInfoIngMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoIngMouseMoved
        mpGenInfoIng.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mlGenInfoIngMouseMoved

    private void mlGenInfoIngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoIngMouseClicked
        
    }//GEN-LAST:event_mlGenInfoIngMouseClicked

    private void mlGenInfoIngMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlGenInfoIngMouseExited
        mpGenInfoIng.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mlGenInfoIngMouseExited

    private void mostrarHMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarHMouseMoved
        mpMostrarH.setBackground(new Color(86, 136, 187));
    }//GEN-LAST:event_mostrarHMouseMoved

    private void mostrarHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarHMouseClicked
        jMenu.setSelectedIndex(1); 
    }//GEN-LAST:event_mostrarHMouseClicked

    private void mostrarHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarHMouseExited
        mpMostrarH.setBackground(new Color(121, 180, 239));
    }//GEN-LAST:event_mostrarHMouseExited

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
    private javax.swing.JButton bBuscarMH;
    private javax.swing.JButton bEliminarC;
    private javax.swing.JButton bagregar;
    private javax.swing.JPanel bg;
    private javax.swing.JButton bmodificarCH;
    private javax.swing.JPanel bmodih;
    private javax.swing.ButtonGroup botonesAgregarH;
    private javax.swing.JRadioButton cBaseC;
    private javax.swing.JRadioButton cBaseCH;
    private javax.swing.JRadioButton cMiembroC;
    private javax.swing.JRadioButton cMiembroCH;
    private javax.swing.JPanel cerrarses;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel flecha;
    private javax.swing.JTextField iapellidoC;
    private javax.swing.JTextField iapellidoCH;
    private javax.swing.JTextField icodeMC;
    private javax.swing.JTextField icodigoMH;
    private javax.swing.JTextField idniC;
    private javax.swing.JTextField idniCH;
    private javax.swing.JLabel imgMenuPrinvipal;
    private javax.swing.JLabel imgpersona;
    private javax.swing.JTextField inombreC;
    private javax.swing.JTextField inombreCH;
    private javax.swing.JTextField inumHabC;
    private javax.swing.JTextField inumHabCH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTabbedPane jMenu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jimagenModificarHab;
    private javax.swing.JTable jtableEliminaCliente;
    private javax.swing.JTable jtableHabitaciones;
    private javax.swing.JTable jtableHuespedes;
    private javax.swing.JLabel lapellidoC;
    private javax.swing.JLabel lapellidoCH;
    private javax.swing.JLabel lcodeMC;
    private javax.swing.JLabel lcodigoMH;
    private javax.swing.JLabel ldniC;
    private javax.swing.JLabel ldniCH;
    private javax.swing.JLabel lexit;
    private javax.swing.JLabel lhabitacionC;
    private javax.swing.JLabel lhabitacionCH;
    private javax.swing.JLabel lminus;
    private javax.swing.JLabel lnombreC;
    private javax.swing.JLabel lnombreCH;
    private javax.swing.JLabel lpEmpleados;
    private javax.swing.JLabel lpHabitaciones;
    private javax.swing.JLabel lpReportes;
    private javax.swing.JLabel lpaseCliente;
    private javax.swing.JLabel lpaseClienteH;
    private javax.swing.JLabel lrolprofile;
    private javax.swing.JLabel luserprofile;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menuimagen;
    private javax.swing.JLabel mlAgregar;
    private javax.swing.JLabel mlEliminar;
    private javax.swing.JLabel mlEliminarR;
    private javax.swing.JLabel mlGenInfoH;
    private javax.swing.JLabel mlGenInfoIng;
    private javax.swing.JLabel mlMenu;
    private javax.swing.JLabel mlModificar;
    private javax.swing.JLabel mlModificarR;
    private javax.swing.JLabel mlregistrarR;
    private javax.swing.JLabel mostrarH;
    private javax.swing.JPanel mpAgregar;
    private javax.swing.JPanel mpEliminar;
    private javax.swing.JPanel mpEliminar1;
    private javax.swing.JPanel mpGenInfoH;
    private javax.swing.JPanel mpGenInfoIng;
    private javax.swing.JPanel mpMenu;
    private javax.swing.JPanel mpModificar;
    private javax.swing.JPanel mpModificar1;
    private javax.swing.JPanel mpMostrarH;
    private javax.swing.JPanel mpRegistrarR;
    private javax.swing.JPanel pAgregar;
    private javax.swing.JPanel pBuscarC;
    private javax.swing.JPanel panelPEmpleados;
    private javax.swing.JPanel panelPHabitaciones;
    private javax.swing.JPanel panelPReportes;
    private javax.swing.JPanel peliminarC;
    private javax.swing.JPanel peliminarHuesped;
    private javax.swing.JPanel perfilmenu;
    private javax.swing.JPanel pexit;
    private javax.swing.JPanel pmenuPrincipal;
    private javax.swing.JPanel pminus;
    private javax.swing.JPanel pmodificarHuesped;
    private javax.swing.JPanel pmostrarH;
    private javax.swing.JPanel pregistratHuesped;
    // End of variables declaration//GEN-END:variables
}
