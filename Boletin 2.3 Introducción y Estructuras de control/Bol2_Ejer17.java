import java.util.Scanner;

public class Bol2_Ejer17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cantidad:");
        int canti = sc.nextInt();
        char aste = '*';
        for (int i = 0; i < canti; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%c", aste);
            }
            System.out.printf("%c%n", aste);
        }
        System.out.println("Piramide");
        for (int i = 0; i < canti; i++) {
            for (int j = 0; j < canti - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// utilizamos el -1 porque i empieza en 0
// y queremos que la primera fila tenga num - 1 espacios.
