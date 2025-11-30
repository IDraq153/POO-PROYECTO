package Code.Habitacion;

import Code.Habitacion.Habitacion;
import javax.swing.JOptionPane;

public class GestionHabitacion {

    private Habitacion[] arregloHab;
    private int contaH;

    //CONSTRUCTOR
    public GestionHabitacion() {
        arregloHab = new Habitacion[50];
        contaH = 0;
    }

    //METODOS
    public void IngresarHab(Habitacion ref) {
        int nuevoNum = this.contaH + 1;
        ref.setNum(nuevoNum);
        if (contaH < arregloHab.length) {
            if (ref.getCapMax() > 0) {
                if (ref.getCapMax() <= 5) {
                    arregloHab[contaH] = ref;
                    contaH++;
                } else {JOptionPane.showMessageDialog(null, "Numero de personas demasiado alto");}
            } else {JOptionPane.showMessageDialog(null, "No numeros negativos");}
        } else {JOptionPane.showMessageDialog(null, "Maximo de habitaciones registradas");}
    }
    
    public int BuscarHab(int num) {
        for (int i = 0; i < contaH; i++) {
            if (num == arregloHab[i].getNum()) {
                return i;
            }
        }
        JOptionPane.showMessageDialog(null, "Habitacion no encontrada"); 
        return -1;
    }

    public void EliminarHab(int num) {
        boolean Noencontro = false;
        for (int i = 0; i < contaH; i++) {
            if (arregloHab[i].getNum() == num) {
                for (int j = i; j < contaH - 1; j++) {
                    arregloHab[j] = arregloHab[j + 1];
                }
                arregloHab[contaH - 1] = null;
                contaH--;
                Noencontro = false;
                break;
            } else {Noencontro = true;}
        }
        if (Noencontro == true) {
            JOptionPane.showMessageDialog(null, "Habitacion no encontrada");
        }
    }

    //GETTERS AND SETTERS
    public Habitacion[] getArregloHab() {
        return arregloHab;
    }

    public void setArregloHab(Habitacion[] arregloHab) {
        this.arregloHab = arregloHab;
    }

    public int getContaH() {
        return contaH;
    }

    public void setContaH(int contaH) {
        this.contaH = contaH;
    }
}
