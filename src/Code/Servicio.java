package Code;

public abstract class Servicio {

    protected String nomServicio, tipo;
    protected float precServicio;
    protected int cantSerDisponibles;

    //METODOS
    public Servicio(String nomServicio, float precServicio, int cantSerDisponibles) {
        this.nomServicio = nomServicio;
        this.precServicio = precServicio;
        this.cantSerDisponibles = cantSerDisponibles;
        this.tipo = "";
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
