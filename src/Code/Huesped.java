package Code;

public abstract class Huesped {

    protected String nom, apell, pase, code;
    protected int dni, numH;

    //CONSTRUCTOR
    public Huesped(String nom, String apell, String pase, int dni, int numH) {
        this.nom = nom;
        this.apell = apell;
        this.pase = pase;
        this.dni = dni;
        this.numH = numH;
    }

    //METODOS
    public abstract void generarCodigo();
    
    //GETTERS AND SETTERS
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getPase() {
        return pase;
    }

    public void setPase(String pase) {
        this.pase = pase;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumH() {
        return numH;
    }

    public void setNumH(int numH) {
        this.numH = numH;
    }
}
