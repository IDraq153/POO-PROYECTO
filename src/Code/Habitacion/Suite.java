package Code.Habitacion;

import Code.Habitacion.Habitacion;

public class Suite extends Habitacion {    
    //CONSTRUCTOR
    public Suite(int capMax, String tipoHabi, String estado, float precNoche) {
        super(capMax, tipoHabi, estado, precNoche);
    }
    //METODOS
    @Override
    public void calcularPrecio() {
        this.precNoche = this.precNoche*1.15f;
    }
}
