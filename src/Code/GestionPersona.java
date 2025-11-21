package Code;

import javax.swing.JOptionPane;

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
        } else {
            JOptionPane.showMessageDialog(null, "Numero de Empleados maximo alcanzado");
        }
    }

    public void EliminarE(String dni) {
        boolean Noencontro = false;
        for (int i = 0; i < conta; i++) {
            if (dni.equalsIgnoreCase(arregloPersona[i].getDni())) {
                for (int j = i; j < conta - 1; j++) {
                    arregloPersona[j] = arregloPersona[j + 1];
                }
                arregloPersona[conta - 1] = null;
                conta--;
                Noencontro = false;
                break;

            } else {
                Noencontro = true;
            }
        }
        if (Noencontro == true) {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado");
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
