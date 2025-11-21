package Code;

public abstract class Servicio {

    protected String nomServicio;
    protected float precServicio;
    protected int cantSerDisponibles;

    //METODOS
    public Servicio(String nomServicio, float precServicio, int cantSerDisponibles) {
        this.nomServicio = nomServicio;
        this.precServicio = precServicio;
        this.cantSerDisponibles = cantSerDisponibles;
    }
    
    //METODOS
    public abstract float CalcularPrecioFinal();
    
    //GETTERS AND SETTERS
    public String getNomServicio() {
        return nomServicio;
    }

    public void setNomServicio(String nomServicio) {
        this.nomServicio = nomServicio;
    }

    public float getPrecServicio() {
        return precServicio;
    }

    public void setPrecServicio(float precServicio) {
        this.precServicio = precServicio;
    }   

    public int getCantSerDisponibles() {
        return cantSerDisponibles;
    }

    public void setCantSerDisponibles(int cantSerDisponibles) {
        this.cantSerDisponibles = cantSerDisponibles;
    }
}
