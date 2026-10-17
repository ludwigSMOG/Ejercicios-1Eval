import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre de una Pelicula:");
        String pelicula = sc.nextLine();

        System.out.println("En que año se hizo:");
        int anho = sc.nextInt();

        System.out.println("Puntuacion:");
        double puntuacion = sc.nextDouble();

        System.out.println("Pelicula: " + pelicula + "\n\tAño: " + anho + "\n\tPuntuacion: " + puntuacion);
    }
}
