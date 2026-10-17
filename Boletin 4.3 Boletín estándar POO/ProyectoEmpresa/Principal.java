import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Directivo dire1 = new Directivo(
                "Ludwig", "Montano", 25, "54430949T",
                "Informatica", 50);

        Empleado emple1 = new Empleado(
                "Pepe", "Gonzales", 35, "54430949A", 1000);

        Empleado emple2 = new Empleado(
                "Paco", "Prado", 40, "54430949B", 1000);

        Empresa empresa = new Empresa(1000, dire1, emple1, emple2);

        int opcion = 0;

        do {
            System.out.println("\nMenu");
            System.out.println("1.Ver datos empleados");
            System.out.println("2.Ver datos directivo");
            System.out.println("3.Modificar datos");
            System.out.println("4.Pagar");
            System.out.println("5.Cobrar");
            System.out.println("6.Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    verDatosEmpleados(empresa);
                    break;

                case 2:
                    empresa.verDatosDirectivo();
                    break;

                case 3:
                    modificarDatos(empresa);
                    break;

                case 4:
                    empresa.pagar();
                    break;

                case 5:
                    System.out.println("Introduce la cantidad:");
                    double cantidad = sc.nextDouble();
                    empresa.cobrar(cantidad);
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 6);

        sc.close();
    }

    // 1 creamos al empleado
    // 2 entregamos ese empleado a IUEmpleado

    public static void verDatosEmpleados(Empresa empresa) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nVer datos Empleados:");
            System.out.println("1.Ver todos los datos");
            System.out.println("2.Ver un dato de ambos empleados");
            System.out.println("3.Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    empresa.mostrarEmpleados();
                    break;

                case 2:
                    System.out.println("1.Nombre y apellidos");
                    System.out.println("2.Edad");
                    System.out.println("3.DNI");
                    System.out.println("4.Salario e IRPF");
                    System.out.println("5.Impuestos");

                    int dato = sc.nextInt();
                    empresa.mostrarDatoEmpleados(dato);
                    break;

                case 3:
                    System.out.println("Volviendo al menu principal...");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 3);
    }
    public static void modificarDatos(Empresa empresa) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nModificar datos:");
            System.out.println("1.Modificar directivo");
            System.out.println("2.Modificar empleado 1");
            System.out.println("3.Modificar empleado 2");
            System.out.println("4.Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    empresa.modificarDirectivo();
                    break;

                case 2:
                    empresa.modificarEmpleado1();
                    break;

                case 3:
                    empresa.modificarEmpleado2();
                    break;

                case 4:
                    System.out.println("Volviendo al menu principal...");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 4);
    }

     // Empleado empleado01 = new Empleado();
        // IUEmpleado vista = new IUEmpleado(empleado01);

        // vista.pedir();
        // vista.mostrar();

        // Directivo directivo = new Directivo();
        // IUDirectivo vistaD = new IUDirectivo(directivo);

        // vistaD.pedir();
        // vistaD.mostrar();

        // System.out.println(directivo.dineroGlobal(100));
}
