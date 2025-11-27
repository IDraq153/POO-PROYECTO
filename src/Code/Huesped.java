package Code;

public abstract class Huesped {

    protected String nom, apell, pase, code, est;
    protected int dni, numH, diaSal;
    protected float cuentaC;

    //CONSTRUCTOR
    public Huesped(String nom, String apell, String pase, int dni, int numH) {
        this.nom = nom;
        this.apell = apell;
        this.pase = pase;
        this.dni = dni;
        this.numH = numH;
        this.cuentaC = 0;
        diaSal = 0;
        est = "";
    }

    //METODOS
    public abstract void calcularImporte(float prec, int dias);
    
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

    public float getCuentaC() {
        return cuentaC;
    }

    public void setCuentaC(float cuentaC) {
        this.cuentaC = cuentaC;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public int getDiaSal() {
        return diaSal;
    }

    public void setDiaSal(int diaSal) {
        this.diaSal = diaSal;
    }
    
}
