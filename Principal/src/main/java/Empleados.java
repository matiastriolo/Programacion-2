
public class Empleados {

    private String dni = "40.926.149";
    private String nom = "Matias";
    private String apellido = "Triolo";
    private String domicilio = "Guayaquil 282, Dorrego Guaymallen";
    private String nacimiento = "1998/02/05";
    private Double sueldo = 50000.01;

    public Empleados() {
    }

    public Empleados(String dni, String nom, String apellido, String domicilio, String nacimiento, Double sueldo) {
        this.dni = dni;
        this.nom = nom;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.nacimiento = nacimiento;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
