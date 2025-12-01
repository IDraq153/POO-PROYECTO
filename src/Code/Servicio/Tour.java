package Code.Servicio;

public class Tour extends Servicio implements Facturable {

    private String dest;

    //CONSTRUCTOR
    public Tour(String nomServicio, float precServicio, int cantSerDisponibles) {
        super(nomServicio, precServicio, cantSerDisponibles);
        this.dest = "";
    }

    //METODO
    @Override
    public void CalcularPrecioFinal() {
        this.precServicio += 10; 
    }    
    
    //GETTERS AND SETTERS
    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
