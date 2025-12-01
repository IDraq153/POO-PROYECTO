package Code.Servicio;

public class Relax extends Servicio implements Facturable {

    private boolean incAromaTerap;

    //CONSTRUCTOR
    public Relax(String nomServicio, float precServicio, int cantSerDisponibles) {
        super(nomServicio, precServicio, cantSerDisponibles);
        this.incAromaTerap = true;
    }
    
    //METODOS
    @Override
    public void CalcularPrecioFinal() {
        if (this.incAromaTerap == true) {
            this.precServicio+=30;
        }
    }    
    
    //GETTERS AND SETTERS
    public boolean isIncAromaTerap() {
        return incAromaTerap;
    }

    public void setIncAromaTerap(boolean incAromaTerap) {
        this.incAromaTerap = incAromaTerap;
    }
}
