package Code;

public class GestionSistema {

    private GestionHabitacion GH;
    private GestionServicio GS;
    private GestionPersona GP;

    public GestionSistema() {
        GH = new GestionHabitacion();
        GS = new GestionServicio();
        GP = new GestionPersona();
        
        CargarDatosIniciales();
    }
    
    private void CargarDatosIniciales() {
        Administrador adm = new Administrador("DARIO", "RUA", "ADMIN", "60789650", "Dar123", "123");
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
        GP.IngresarE(adm); 
        GP.IngresarE(refR);
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
}
