public class Bol5_Ejer2 {

    public static char[][] aleatorios(int n, int m) {
        char[][] tabla = new char[n][m];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (char) (int) ((Math.random() * 26) + 65);
            }
        }
        return tabla;
    }

    public static void mostrar(char[][] tabla) {
        System.out.printf("%4s", "");
        for (int i = 0; i < tabla[0].length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("");

        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%4d", i);
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%4c", tabla[i][j]);
            }
            System.out.println("");
        }
    }

    public static int maximo(int[][] tabla) {
        int maximo = tabla[0][0];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] > maximo) {
                    maximo = tabla[i][j];
                }
            }
        }
        // System.out.println((char)maximo);
        return maximo;
    }

    public static int minimo(int[][] tabla) {
        int minimo = tabla[0][0];

        for (int[] fila : tabla) {
            for (int caracter : fila) {
                if (caracter < minimo) {
                    minimo = caracter;
                }
            }
        }
        // System.out.println((char)minimo);
        return minimo;
    }

    public static boolean intercambio(char[][] tabla, int c1, int c2, int f1, int f2) {
        char nuevo;
        if (c1 >= 0 && c2 >= 0 && f1 >= 0 && f2 >= 0 && f1 < tabla.length && f2 < tabla.length && c1 < tabla[0].length
                && c2 < tabla[0].length) {
            nuevo = tabla[c1][f1];
            tabla[c1][f1] = tabla[c2][f2];
            tabla[c2][f2] = nuevo;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] tabla = aleatorios(3, 3);
        char[][] tabla2 = aleatorios(4, 3);
        char[][] tabla3 = aleatorios(3, 4);
        mostrar(tabla);
        System.out.println();
        mostrar(tabla2);
        System.out.println();
        mostrar(tabla3);
        System.out.println();
        System.out.println(intercambio(tabla3, 0, 0, 0, 1));
        mostrar(tabla3);
        
    }
}
