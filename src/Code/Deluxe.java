package Code;

public class Deluxe extends Habitacion {    
    //CONSTRUCTOR
    public Deluxe(int capMax, String tipoHabi, String estado, float precNoche) {
        super(capMax, tipoHabi, estado, precNoche);
    }

    //METODOS
    @Override
    public void CalcularPrecio(int cantP, int numD) {
    }
}
