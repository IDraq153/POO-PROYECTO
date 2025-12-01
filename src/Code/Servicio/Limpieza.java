package Code.Servicio;

import Code.Servicio.Servicio;

public class Limpieza extends Servicio implements Facturable {

    private boolean esExpress;

    //CONSTRUCTOR
    public Limpieza(String nomServicio, float precServicio, int cantSerDisponibles) {
        super(nomServicio, precServicio, cantSerDisponibles);
        this.esExpress = true;
    }

    //METODOS
    @Override    
    public void CalcularPrecioFinal() {
        if (esExpress == true) {
            this.precServicio+=20;
        }
    }

    //GETTERS AND SETTERS
    public boolean isEsExpress() {
        return esExpress;
    }

    public void setEsExpress(boolean esExpress) {
        this.esExpress = esExpress;
    }
}
