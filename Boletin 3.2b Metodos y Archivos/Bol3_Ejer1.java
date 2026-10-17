import java.util.Scanner;

public class Bol3_Ejer1 {

    public static void espacios(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("");
        }
    }

    public static boolean par(int num) {
        return num % 2 == 0;
    }

    public static char letra(int num) {
        return num >= 0 ? 'P' : 'N';
    }// TERNARIA

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dime tu nombre:");
        String nombre = sc.nextLine();

        espacios(5);

        System.out.println("Dime un numero:");
        int num = sc.nextInt();
        System.out.printf("Hola \"%s\" tu número %d es %s y %c.",
                nombre.substring(0, 1).toUpperCase() + nombre.substring(1), num, par(num) ? "par" : "impar",
                letra(num));
        // EJERCICIO 2 ARCHIVOS
    }
}
