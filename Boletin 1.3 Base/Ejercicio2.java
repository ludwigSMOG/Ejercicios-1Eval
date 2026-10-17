import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido!\n");

        System.out.println("Dime un numero:");
        int num = sc.nextInt();
        System.out.println("Dime otro numero:");
        int num2 = sc.nextInt();

        int suma = num + num2;

        System.out.println("El Total de la Suma es: " + suma);
    }
}
