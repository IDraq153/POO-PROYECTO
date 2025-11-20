package Code;

public class Habitacion {

    private int num, capMax;
    private float precNoche;
    private String tipoHabi, estado;

    //CONSTRUCTOR
    public Habitacion(int num, int capMax, float precNoche, String tipoHabi, String estado) {
        this.num = num;
        this.capMax = capMax;
        this.precNoche = precNoche;
        this.tipoHabi = tipoHabi;
        this.estado = estado;
    }

    //GETTERS AND SETTERS
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public float getPrecNoche() {
        return precNoche;
    }

    public void setPrecNoche(float precNoche) {
        this.precNoche = precNoche;
    }

    public String getTipoHabi() {
        return tipoHabi;
    }

    public void setTipoHabi(String tipoHabi) {
        this.tipoHabi = tipoHabi;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
