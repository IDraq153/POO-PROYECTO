package Code;

import javax.swing.JOptionPane;

public class GestionServicio {

    private Servicio[] arregloS;
    private int contaS;

    //CONSTRUCTOR
    public GestionServicio() {
        arregloS = new Servicio[30];
        contaS = 0;
    }

    //METODOS
    public void IngresarServicio(Servicio ref) {
        if (contaS < arregloS.length) {
            arregloS[contaS] = ref;
            contaS++;
        } else {
            JOptionPane.showMessageDialog(null, "Maximo de servicios registrados");
        }
    }

    public void EliminarServicio(String nombre) {
        boolean noencontro = false;
        for (int i = 0; i < contaS; i++) {
            if (arregloS[i].getNomServicio().equalsIgnoreCase(nombre)) {
                for (int j = i; j < contaS - 1; j++) {
                    arregloS[j] = arregloS[j + 1];
                }
                arregloS[contaS - 1] = null;
                contaS--;
                noencontro = false;
                break;
            } else{
                noencontro = true;
            }
        }
        if (noencontro == true) {
            JOptionPane.showMessageDialog(null, "Servicio no encontrado"); 
        }
    }

    //GETTERS AND SETTERS
    public Servicio[] getArregloS() {
        return arregloS;
    }

    public void setArregloS(Servicio[] arregloS) {
        this.arregloS = arregloS;
    }

    public int getContaS() {
        return contaS;
    }

    public void setContaS(int contaS) {
        this.contaS = contaS;
    }
}
