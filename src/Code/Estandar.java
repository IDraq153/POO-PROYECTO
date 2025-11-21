package Code;

public class Estandar extends Habitacion {    
    //CONSTRUCTOR
    public Estandar(int capMax, String tipoHabi, String estado, float precNoche) {
        super(capMax, tipoHabi, estado, precNoche);
    }

    //METODOS
    @Override
    public void CalcularPrecio(int cantP, int numD) {
    }
}
