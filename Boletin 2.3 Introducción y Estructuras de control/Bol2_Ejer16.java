import java.util.Scanner;

public class Bol2_Ejer16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuanto asteriscos deseas dibujar?");

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("1.Dibujar Diagonal de IZQ a DERECH\n2.Dibujar Diagonal de DERECH a IZQ");
        int opcion = sc.nextInt();
        char aste = '*';
        char tabu = ' ';
        if (opcion == 1) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.printf("%c", tabu);
                }
                System.out.printf("%c%n", aste);
            }
        } else if (opcion == 2) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - i - 1; j++) {
                    System.out.printf("%c", tabu);
                }
                System.out.printf("%c%n", aste);
            }
        } else {
            System.out.println("opcion no valida!");
        }
    }

}
