package Code;

public class Relax extends Servicio {

    private boolean incAromaTerap;

    //CONSTRUCTOR
    public Relax(String nomServicio, float precServicio, int cantSerDisponibles) {
        super(nomServicio, precServicio, cantSerDisponibles);
        this.incAromaTerap = false;
    }
    
    //METODOS
    @Override
    public float CalcularPrecioFinal() {
        float precio = this.precServicio;
        if (this.incAromaTerap == true) {
            precio+=30;
        }
        return precio;
    }    
    
    //GETTERS AND SETTERS
    public boolean isIncAromaTerap() {
        return incAromaTerap;
    }

    public void setIncAromaTerap(boolean incAromaTerap) {
        this.incAromaTerap = incAromaTerap;
    }
}
