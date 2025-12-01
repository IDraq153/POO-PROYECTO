package Code;

import Code.Empleado.Administrador;
import Code.Empleado.GestionPersona;
import Code.Empleado.Recepcionista;
import Code.Habitacion.Deluxe;
import Code.Habitacion.Estandar;
import Code.Habitacion.GestionHabitacion;
import Code.Habitacion.Suite;
import Code.Huesped.GestionHuesped;
import Code.Servicio.GestionServicio;
import Code.Servicio.Tour;

public class GestionSistema {

    private GestionHabitacion GH;
    private GestionServicio GS;
    private GestionPersona GP;
    private GestionHuesped GC;

    public GestionSistema() {
        GH = new GestionHabitacion();
        GS = new GestionServicio();
        GP = new GestionPersona();
        GC = new GestionHuesped();
        
        CargarDatosIniciales();
    }
    
    //SOBRECARGA DE METODOS
    public void modificarDatos(int numH, int nuevoC, float nuevoP, String est, String tipo) {
        GH.modificarDatos(numH, nuevoC, nuevoP, est, tipo); 
    }

    public void modificarDatos(String nom, float nuevoPrecio, int nuevaCant, String nuevoTipo, String nomF) {
        GS.modificarDatos(nom, nuevoPrecio, nuevaCant, nuevoTipo, nomF); 
    }
    
    public void modificarDatos(String dniB, String nuevoNom, String nuevoAp, String nuevoDni, String nuevoUser, String nuevoPass, String rol) {
        GP.modificarDatos(dniB, nuevoNom, nuevoAp, nuevoDni, nuevoUser, nuevoPass, rol);
    }
    
    private void CargarDatosIniciales() {
        
        // Más administradores
        Administrador adm = new Administrador("DARIO", "RUA", "ADMIN", "60789650", "Dar123", "123");
        Administrador adm2 = new Administrador("JOSE", "MORALES", "ADMIN", "70894512", "JoseM", "adm456");
        Administrador adm3 = new Administrador("LAURA", "SALAS", "ADMIN", "79831245", "LauS", "admin789");
        // Más recepcionistas
        Recepcionista refR = new Recepcionista("MARIA", "MENDA", "REC", "8313912", "Mar12", "153");
        Recepcionista rec2 = new Recepcionista("PATRICIA", "GONZALES", "REC", "65123987", "PatG", "rec321");
        Recepcionista rec3 = new Recepcionista("CARLOS", "DIAZ", "REC", "70981234", "CarlD", "recep987");        
        
        //HABITACIONES
        Estandar est1 = new Estandar(2, "EST", "DISPONIBLE", 40);
        Estandar est2 = new Estandar(2, "EST", "DISPONIBLE", 40);
        Estandar est3 = new Estandar(3, "EST", "DISPONIBLE", 45);
        
        Deluxe del1 = new Deluxe(3, "DEL", "DISPONIBLE", 60);
        Deluxe del2 = new Deluxe(3, "DEL", "DISPONIBLE", 60);
        Deluxe del3 = new Deluxe(4, "DEL", "DISPONIBLE", 70);
        
        Suite sui1 = new Suite(5, "SUI", "DISPONIBLE", 100);
        Suite sui2 = new Suite(5, "SUI", "DISPONIBLE", 100);
        Suite sui3 = new Suite(5, "SUI", "DISPONIBLE", 120);

        Tour sref1 = new Tour("IcaTour", 50, 15);
        sref1.setTipo("Tour"); 
        Deluxe ref2 = new Deluxe(3, "DEL", "DISPONIBLE", 60);
        Suite ref3 = new Suite(5, "SUI", "DISPONIBLE", 100);
        GH.IngresarHab(est1);
        GH.IngresarHab(est2);
        GH.IngresarHab(est3);
        GH.IngresarHab(del1);
        GH.IngresarHab(del2);
        GH.IngresarHab(del3);
        GH.IngresarHab(sui1);
        GH.IngresarHab(sui2);
        GH.IngresarHab(sui3);
        GH.IngresarHab(ref2);
        GH.IngresarHab(ref3);
        GP.IngresarE(adm); 
        GP.IngresarE(adm2); 
        GP.IngresarE(adm3); 
        GP.IngresarE(refR);
        GP.IngresarE(rec2);
        GP.IngresarE(rec3);
        GS.IngresarServicio(sref1);
    }
    
    public GestionHabitacion getGH() {
        return GH;
    }

    public void setGH(GestionHabitacion GH) {
        this.GH = GH;
    }

    public GestionServicio getGS() {
        return GS;
    }

    public void setGS(GestionServicio GS) {
        this.GS = GS;
    }

    public GestionPersona getGP() {
        return GP;
    }

    public void setGP(GestionPersona GP) {
        this.GP = GP;
    }

    public GestionHuesped getGC() {
        return GC;
    }

    public void setGC(GestionHuesped GC) {
        this.GC = GC;
    }
}
