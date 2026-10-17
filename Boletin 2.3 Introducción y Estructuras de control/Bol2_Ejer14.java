import java.util.Scanner;

public class Bol2_Ejer14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entre el 1 y 100:");
        int num = sc.nextInt();

        for (int i = 0; i < 20; i++) {
            System.out.println("");
        }
        int cont = 0;
        do {
            for (int i = 5; i >= 1; i--) {
                System.out.println("Adivina el numero\nTienes " + i + " intentos.");
                int num2 = sc.nextInt();

                if (num2 == num) {
                    System.out.println("Adivinaste el numero!");
                } else if (i == 1) {
                    System.out.println("Se te acabaron los intentos!");
                } else {
                    System.out.println("Sigue probando...");
                }
                cont++;
            }
        } while (cont < 5);
    }
}
