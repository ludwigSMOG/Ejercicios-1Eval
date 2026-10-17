public class Empresa {
    private double ganancias;
    private Directivo directivo;
    private Empleado empleado1;
    private Empleado empleado2;

    private IUDirectivo vistaDirectivo;
    private IUEmpleado vistaEmpleado1;
    private IUEmpleado vistaEmpleado2;

    public void setGanacias(double ganancias) {
        this.ganancias = ganancias;
    }

    public double getGanacias() {
        return ganancias;
    }

    public Empresa(Directivo directivo, Empleado empleado1, Empleado empleado2) {
        this.directivo = directivo;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;

        this.vistaDirectivo = new IUDirectivo(directivo);
        this.vistaEmpleado1 = new IUEmpleado(empleado1);
        this.vistaEmpleado2 = new IUEmpleado(empleado2);
    }

    public Empresa(double ganancias, Directivo directivo, Empleado empleado1, Empleado empleado2) {
        this(directivo, empleado1, empleado2);
        this.setGanacias(ganancias);
    }

    public void mostrarEmpleados() {
        vistaEmpleado1.mostrar();
        vistaEmpleado2.mostrar();
    }

    public void mostrarDatoEmpleados(int dato) {
        vistaEmpleado1.mostrar(dato);
        vistaEmpleado2.mostrar(dato);
    }

    public void verDatosDirectivo() {
        vistaDirectivo.mostrar();

        System.out.println(directivo.dineroGlobal(ganancias));
    }

    public void modificarDirectivo() {
        vistaDirectivo.pedir();
    }

    public void modificarEmpleado1() {
        vistaEmpleado1.pedir();
    }

    public void modificarEmpleado2() {
        vistaEmpleado2.pedir();
    }

    public void pagar() {
        System.out.printf("Ganancias antes del cobro: %.2f euros%n", ganancias);

        ganancias -= empleado1.getSalarioAnual();
        ganancias -= empleado2.getSalarioAnual();

        System.out.printf("Ganancias despues del cobrar: %.2f euros%n", ganancias);
    }

    public void cobrar(double cantidad) {
        System.out.printf("Ganancias antes de cobro: %.2f euros%n", ganancias);

        ganancias += cantidad;

        System.out.printf("Ganancias despues del cobbbrar: %.2f euros%n", ganancias);
    }
}
