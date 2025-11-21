package Code;

public class Limpieza extends Servicio {

    private boolean esExpress;

    //CONSTRUCTOR
    public Limpieza(String nomServicio, float precServicio, int cantSerDisponibles) {
        super(nomServicio, precServicio, cantSerDisponibles);
        this.esExpress = false;
    }

    //METODOS
    @Override    
    public float CalcularPrecioFinal() {
        float precio = this.precServicio;
        if (esExpress == true) {
            precio += this.precServicio*0.2f;
        }
        return precio;
    }

    //GETTERS AND SETTERS
    public boolean isEsExpress() {
        return esExpress;
    }

    public void setEsExpress(boolean esExpress) {
        this.esExpress = esExpress;
    }
}
