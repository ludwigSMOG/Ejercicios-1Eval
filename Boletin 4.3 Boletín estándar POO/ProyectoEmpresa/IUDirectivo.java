import java.util.Scanner;

public class IUDirectivo {
    private Directivo directivo;

    public void pedir() {
        Scanner sc = new Scanner(System.in);

        System.out.println("dime un nombre:");
        String nombre = sc.nextLine();
        directivo.setNombre(nombre);
        System.out.println("dime apellido:");
        String apellidos = sc.nextLine();
        directivo.setApellidos(apellidos);
        System.out.println("dime edad:");
        int edad = sc.nextInt();
        directivo.setEdad(edad);
        sc.nextLine();//consumimos el Salto de Linea pendiente...
        System.out.println("dime dni:");
        String dni = sc.nextLine();
        directivo.setDni(dni);
        System.out.println("dime nombre departamento:");
        String nombreDepart = sc.nextLine();
        directivo.setNombreDepart(nombreDepart);
        System.out.println("dime porcentaje de Beneficios:");
        double beneficios = sc.nextDouble();
        directivo.setBeneficios(beneficios);
    }

    public void mostrar() {
        System.out.println("Nombre: " + directivo.getNombre());
        System.out.println("Apellidos: " + directivo.getApellidos());
        System.out.println("Edad: " + directivo.getEdad());
        System.out.println("DNI: " + directivo.getDni());
        System.out.println("Nombre Departamento: " + directivo.getNombreDepart());
        System.out.println("Porcentaje beneficios: " + directivo.getBeneficios() + "%");
    }

    public IUDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }
}
