import java.util.Scanner;

public class IUEmpleado {

    public Empleado empleado;

    public void pedir() {
        Scanner sc = new Scanner(System.in);

        System.out.println("dime un nombre:");
        String nombre = sc.nextLine();
        empleado.setNombre(nombre);
        System.out.println("dime apellido:");
        String apellidos = sc.nextLine();
        empleado.setApellidos(apellidos);
        System.out.println("dime edad:");
        int edad = sc.nextInt();
        empleado.setEdad(edad);
        sc.nextLine();//
        System.out.println("dime dni:");
        String dni = sc.nextLine();
        empleado.setDni(dni);
        System.out.println("dime salario:");
        double salario = sc.nextDouble();
        empleado.setSalarioAnual(salario);
    }

    public void mostrar() {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellidos: " + empleado.getApellidos());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Salario: " + empleado.getSalarioAnual());
        System.out.println("IRPF: " + empleado.getIrpf() + "%");
        System.out.println("Impuestos: " + empleado.impuestos() + " euros.");
    }

    public void mostrar(int dato) {
        switch (dato) {
            case 1:
                System.out.println("Nombre: " + empleado.getNombre() + " Apellidos: " + empleado.getApellidos());
                break;
            case 2:
                System.out.println("Edad: " + empleado.getEdad());
                break;
            case 3:
                System.out.println("DNI: " + empleado.getDni());
                break;
            case 4:
                System.out.println("Salario: " + empleado.getSalarioAnual() + " IRPF: " + empleado.getIrpf() + "%");
                break;
            case 5:
                System.out.println("Impuestos: " + empleado.impuestos() + " euros.");
                break;

            default:
                System.out.println("Campo no valido...");
                break;
        }
    }

    public IUEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
