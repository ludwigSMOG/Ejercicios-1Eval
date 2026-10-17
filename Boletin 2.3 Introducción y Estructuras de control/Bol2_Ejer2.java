public class Bol2_Ejer2 {

    public static void main(String[] args) {
        System.out.println("WHILE");
        int cont = 0;
        while (cont < 20) {
            cont++;
            System.out.print(cont + " ");
        }
        // 1º comprueba

        System.out.println("\nDO-WHILE");
        cont = 0;
        do {
            cont++;
            System.out.print(cont + " ");
        } while (cont < 20);
        // comprueba despues 2º

        System.out.println("\nFOR");
        cont = 0;
        for (int i = 1; i <= 20; i++) {
            cont++;
            System.out.print(cont + " ");
        }

        System.out.println("\nNumeros Pares");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.printf("%5d%n", i);
            }
        }
    }
}
