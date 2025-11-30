package Code.Servicio;

import Code.Servicio.Servicio;
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
    public float buscarPrecioServicio(String nom){
        float prec = 0;
        for (int i = 0; i < contaS; i++) {
            if (arregloS[i].getNomServicio().equalsIgnoreCase(nom)) {
                if (arregloS[i].getCantSerDisponibles() <= 0) {
                    JOptionPane.showMessageDialog(null, "No hay cupos disponibles");
                } else {
                    arregloS[i].setCantSerDisponibles(arregloS[i].getCantSerDisponibles()-1);
                    prec = arregloS[i].getPrecServicio();
                    JOptionPane.showMessageDialog(null, "Importe actualizado");
                    break;                    
                }
            }
        }
        return prec;
    }
    
    public int buscarPoServicio(String nombre) {
        for (int i = 0; i < contaS; i++) {
            if (arregloS[i].getNomServicio().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        JOptionPane.showMessageDialog(null, "Servicio no encontrado");
        return -1;
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
