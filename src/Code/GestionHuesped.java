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

    public void registrarConsumo(String cod, float prec) {
        for (int i = 0; i < contaC; i++) {
            if (arregloC[i].getCode().equalsIgnoreCase(cod)) {
                float suma = arregloC[i].getCuentaC();
                suma += prec;
                arregloC[i].setCuentaC(suma);
                break;
            }
        }
    }

    public int buscarNumHabitacionHuesped(String code) {
        int numH = 0;
        for (int i = 0; i < contaC; i++) {
            if (arregloC[i].getCode().equalsIgnoreCase(code)) {
                numH = arregloC[i].getNumH() - 1;
                return numH;
            }
        }
        return -1;
    }

    public int buscarPosHuesped(String code) {
        int i = 0;
        boolean noencontro = false;
        for (int j = 0; j < contaC; j++) {
            if (arregloC[j].getCode().equalsIgnoreCase(code)) {
                i = j;
                noencontro = false;
                return i;
            } else {
                noencontro = true;
            }
        }
        if (noencontro == true) {
            JOptionPane.showMessageDialog(null, "Huesped no encontrado");
        }
        return -1;
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

    public void EliminarReservacion(String code) {
        boolean noeonctro = false;
        for (int i = 0; i < contaC; i++) {
            if (arregloC[i].getCode().equalsIgnoreCase(code) && arregloC[i].getEst().equalsIgnoreCase("R")) {
                arregloC[i].setEst("");
                noeonctro = false;
                break;
            } else {
                noeonctro = true;
            }
        }
        if (noeonctro == true) {
            JOptionPane.showMessageDialog(null, "El usuario no tiene reservacion o no fue encontrado");
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
