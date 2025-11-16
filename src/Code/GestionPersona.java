package Code;

public class GestionPersona {

    private Empleado[] arregloPersona;
    private int conta;

    //CONSTRUCTOR
    public GestionPersona() {
        arregloPersona = new Empleado[50];
        conta = 0;
    }

    //METODOS
    public void IngresarE(Empleado ref) {
        if (conta < arregloPersona.length) {
            arregloPersona[conta] = ref;
            conta++;
        } else {System.out.println("No hay espacio");}
    }
    
    public void ModificarE(String ref) {
        for (int i = 0; i < conta; i++) {
            if (arregloPersona[i].getNombre().equals(ref)) {
                System.out.println("Cambio");
            }
        }
    }

    //GETTERS && SETTERS
    public Empleado[] getArregloPersona() {
        return arregloPersona;
    }

    public void setArregloPersona(Empleado[] arregloPersona) {
        this.arregloPersona = arregloPersona;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
