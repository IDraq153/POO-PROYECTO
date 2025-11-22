package Code;

import javax.swing.JOptionPane;

public class GestionHuesped {

    private Huesped[] arregloC;
    private int contaC;

    public GestionHuesped() {
        arregloC = new Huesped[50];
        contaC = 0;
    }

    public void IngresarHuesped(Huesped ref) {
        if (contaC < arregloC.length) {
            arregloC[contaC] = ref;
            contaC++;
        } else {
            JOptionPane.showMessageDialog(null, "Aforo maximo alcanzado");
        }
    }

    public void EliminarHuesped(String code) {
        boolean noencontro = false;
        for (int i = 0; i < contaC; i++) {
            if (arregloC[i].getCode().equalsIgnoreCase(code)) {
                for (int j = i; j < contaC - 1; j++) {
                    arregloC[j] = arregloC[j + 1];
                }
                arregloC[contaC - 1] = null;
                contaC--;
                noencontro = false;
            } else {
                noencontro = true;
            }
        }
        if (noencontro == true) {
            JOptionPane.showMessageDialog(null, "Huesped no encontrado");
        }
    }

    public Huesped[] getArregloC() {
        return arregloC;
    }

    public void setArregloC(Huesped[] arregloC) {
        this.arregloC = arregloC;
    }

    public int getContaC() {
        return contaC;
    }

    public void setContaC(int contaC) {
        this.contaC = contaC;
    }
}
