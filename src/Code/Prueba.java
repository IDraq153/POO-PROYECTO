package Code;

public class Prueba {

    public static void main(String[] args) {
        Administrador a1 = new Administrador("Manolo", "Sanchez", "Administrador", "606060", "Manolito", "123");
        Recepcionista r1 = new Recepcionista("Cintia", "Mante", "Recepcionista", "1234556", "Cintii", "1234");
        
        GestionPersona g1 = new GestionPersona();
        
        g1.IngresarE(a1);
        g1.IngresarE(r1);
        g1.ModificarE("Manolo");
    }
}
