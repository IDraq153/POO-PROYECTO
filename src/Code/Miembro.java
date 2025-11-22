package Code;

import java.util.Random;

public class Miembro extends Huesped {
    //CONSTRUCTOR
    public Miembro(String nom, String apell, String pase, int dni, int numH) {
        super(nom, apell, pase, dni, numH);
    }
    //METODOS
    @Override
    public void generarCodigo() {
        Random rand = new Random();
        int num;
        do {num = rand.nextInt(100,1000);
        } while (num % 2 != 0);
        this.code = "M"+String.valueOf(num);
    }    
}
