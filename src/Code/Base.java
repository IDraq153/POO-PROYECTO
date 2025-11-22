package Code;

import java.util.Random;

public class Base extends Huesped {
    //CONSTRUCTOR
    public Base(String nom, String apell, String pase, int dni, int numH) {
        super(nom, apell, pase, dni, numH);
    }
    //METODOS
    @Override
    public void generarCodigo() {
        Random rand = new Random();
        int num = rand.nextInt(100,1000);
        this.code = "B"+String.valueOf(num);
    }
}
