public class Ejercicio1 {

    public static int[][] aleatorios(int n, int m) {

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 16) + 10;
            }
        }
        return matriz;
    }

    public static void muestraMatriz(int[][] matriz) {
        System.out.printf("%4s", "");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("%4d", i + 1);
        }
        System.out.println("");

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%4c", (char) (i + 65));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static int maximo(int[][] matriz) {

        int maximo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }
        return maximo;
    }

    public static int minimo(int[][] matriz) {
        int minimo = matriz[0][0];

        for (int[] is : matriz) {
            for (int is2 : is) {
                if (is2 < minimo) {
                    minimo = is2;
                }
            }
        }
        return minimo;
    }

    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int i = 0; i < matriz[fila].length; i++) {
            suma += matriz[fila][i];
        }
        return suma;
    }

    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static int diagonal(int[][] matriz, boolean flag) {
        int suma = 0;
        if (flag) {
            for (int i = 0; i < matriz.length && i < matriz[0].length; i++) {// filas y column NO supera las filas
                                                                             // columnas // columnas
                suma += matriz[i][i];
            }
        } else {
            for (int i = 0; i < matriz.length && i < matriz[0].length; i++) {
                suma += matriz[i][matriz[i].length - 1 - i];
            }
        }
        return suma;
    }

    public static boolean intercambiaFilas(int[][] matriz, int fila1, int fila2) {

        if (fila1 < 0 || fila2 < 0
                || fila1 >= matriz.length || fila2 >= matriz.length) {
            return false;
        }

        for (int j = 0; j < matriz[fila1].length; j++) {
            int aux = matriz[fila1][j];
            matriz[fila1][j] = matriz[fila2][j];
            matriz[fila2][j] = aux;
        }

        return true;
    }

    public static boolean intercambi(int[][] matriz, int num, int num2) {

        if (num < 0 || num2 < 0
                || num >= matriz[0].length || num2 >= matriz[0].length) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            int aux = matriz[i][num];
            matriz[i][num] = matriz[i][num2];
            matriz[i][num2] = aux;
        }

        return true;
    }

    public static int dato(int[][] matriz, int num) {
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static double[] cole(int[][] matriz) {
        int suma;
        double[] vector = new double[matriz.length];// filas
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            vector[i] = (double) suma / matriz[i].length;
        }
        return vector;
    }

    public static double[][] matrizBi(int fila, int column) {
        double[][] matriz = new double[fila][column];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) Math.random() * 11;
            }
        }
        return matriz;
    }

    public static void mostrarArray(double[][] matriz) {

        System.out.printf("%4s", "");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("%4.2f", (i + 1));
        }
        System.out.println("");

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%4.2f", i + 1);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4.2f", matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static void mostrar(double[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%-4.2f", i);
            }
            System.out.printf("%-4.2f", i);
        }

        System.out.printf("%4s", "");

        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("%-4.2f", i);
        }
    }

    public static void mostrarConNombres() {

        String[] filas = { "España", "Francia", "Alemania" };
        String[] columnas = { "Ventas", "Gastos", "Beneficios" };

        double[][] matriz = matrizBi(filas.length, columnas.length);

        System.out.printf("%-8s", "");

        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i].length() > 6) {
                System.out.printf("%-8s", columnas[i].substring(0, 6));
            } else {
                System.out.printf("%-8s", columnas[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            if (filas[i].length() > 6) {
                System.out.printf("%-8s", filas[i].substring(0, 6));
            } else {
                System.out.printf("%-8s", filas[i]);
            }
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%-8.3f", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = Ejercicio1.aleatorios(3, 2);
        Ejercicio1.muestraMatriz(matriz);

        System.out.println(maximo(matriz));
        System.out.println(minimo(matriz));

        System.out.println(sumaFila(matriz, 2));
        System.out.println(sumaColumna(matriz, 1));

        System.out.println(Ejercicio1.diagonal(matriz, true));
        System.out.println(Ejercicio1.diagonal(matriz, false));

        System.out.println(Ejercicio1.intercambiaFilas(matriz, 0, 1));
        System.out.println(Ejercicio1.intercambi(matriz, 0, 1));

        System.out.println(Ejercicio1.dato(matriz, 5));

        double[] vector = cole(matriz);
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        mostrarConNombres();
    }
}
