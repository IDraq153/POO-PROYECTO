package Code;

public class Tour extends Servicio {

    private String dest;

    //CONSTRUCTOR
    public Tour(String nomServicio, float precServicio, int cantSerDisponibles) {
        super(nomServicio, precServicio, cantSerDisponibles);
        this.dest = "";
    }

    //METODO
    @Override
    public float CalcularPrecioFinal() {
        return this.precServicio + 10;
    }    
    
    //GETTERS AND SETTERS
    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
