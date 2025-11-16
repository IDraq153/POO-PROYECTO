package Code;

public class Empleado {

    protected String nombre, apellido, rol, dni, user, contra;

    //CONSTRUCTOR
    public Empleado(String nombre, String apellido, String rol, String dni, String user, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.dni = dni;
        this.user = user;
        this.contra = contra;
    }

    //GETTERS && SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
