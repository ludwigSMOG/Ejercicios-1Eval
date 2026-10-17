public class Directivo {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String nombreDepart;
    private double beneficios;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }

    public void setNombreDepart(String nombreDepart) {
        this.nombreDepart = nombreDepart.toUpperCase();
    }
    public String getNombreDepart() {
        return "\"" + nombreDepart + "\"";
    }
    
    public void setBeneficios(double beneficios) {
        if (beneficios>=0 && beneficios<=100) {
            this.beneficios = beneficios; 
        }else{
            this.beneficios = 0;
        }
    }
    public double getBeneficios() {
        return beneficios;
    }

    public Directivo(String nombre, String apellidos, int edad, String dni, String nombreDepart, double beneficios){
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setEdad(edad);
        this.setDni(dni);
        this.setNombreDepart(nombreDepart);
        this.setBeneficios(beneficios);
    }

    public Directivo() {
        this("", "", 0, "", "", 0);
    }

    public double dineroGlobal(double beneficioGlobal){
        if (beneficioGlobal < 0) {
            return 0;
        }
        return getBeneficios() * beneficioGlobal / 100;
    }

}
