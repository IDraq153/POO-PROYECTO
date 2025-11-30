package Code.Servicio;

public class Parking extends Servicio {
    
    public Parking() {
        super("Parking", 0f, 999);
    }
    
    public void redEspacio(){
        this.cantSerDisponibles--;
    }
}
