package Code;

public abstract class Habitacion {

    private int num, capMax, cantP, numD;
    private float precNoche;
    private String tipoHabi, estado;

    //CONSTRUCTOR
    public Habitacion(int capMax, String tipoHabi, String estado, float precNoche) {
        this.cantP = 0;
        this.numD = 0;
        this.num = 0;
        this.capMax = capMax;
        this.precNoche = precNoche;
        this.tipoHabi = tipoHabi;
        this.estado = estado;
    }

    //METODOS
    public abstract void CalcularPrecio(int cantP, int numD);

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

    public int getCantP() {
        return cantP;
    }

    public void setCantP(int cantP) {
        this.cantP = cantP;
    }

    public int getNumD() {
        return numD;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }
}
