public class Bol2_Ejer12 {

    public static void main(String[] args) {

        System.out.println("NUMEROS DEL 50 AL 100");
        for (int i = 50; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nINVERSO DEL 100 AL 50");
        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nNUMEROS PARES DEL 20 AL 0");
        for (int i = 20; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nNUMEROS IMPARES DEL 90 AL 130");
        for (int i = 90; i <= 130; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nMULTIPLOS DE 5 ENTRE 70 AL 25");
        for (int i = 70; i >= 25; i--) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
