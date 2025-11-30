package Code.Habitacion;

import Code.Habitacion.Habitacion;

public class Estandar extends Habitacion {    
    //CONSTRUCTOR
    public Estandar(int capMax, String tipoHabi, String estado, float precNoche) {
        super(capMax, tipoHabi, estado, precNoche);
    }
    
    //METODOS
    @Override
    public void calcularPrecio() {
        this.precNoche = this.precNoche*1.05f; 
    }
}
