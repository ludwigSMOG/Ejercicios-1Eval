import java.util.Scanner;

public class Basico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos a mi superprograma v1.0");

        System.out.println("\nDime tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Te llamas: " + nombre);

        System.out.println("\nDime tu direccion:");
        String direccion = sc.nextLine();
        System.out.println("Tu direccion es: " + direccion);

        System.out.println("\nDime tu edad:");
        int edad = sc.nextInt();
        System.out.println("Tienes: " + edad + " años");

        System.out.println("\nTe llamas " + nombre + " vives en " + direccion + " y tienes: " + edad + " años");
    }
}
