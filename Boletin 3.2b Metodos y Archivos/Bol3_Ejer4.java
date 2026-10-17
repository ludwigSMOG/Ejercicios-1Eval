import java.util.Scanner;

public class Bol3_Ejer4 {
    public static boolean bisiesto(int anho) {

        return ((anho % 4 == 0 && anho % 100 != 0) || anho % 400 == 0);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anhos;
        do {
            System.out.println("Dime años:");
            anhos = sc.nextInt();
            if (anhos != 0) {
                System.out.println(bisiesto(anhos));
            } else {
                System.out.println("saliendo del programa...");
            }
        } while (anhos != 0);

    }
}
