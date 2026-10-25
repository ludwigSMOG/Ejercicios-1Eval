public class Matriz {
    public int[][] matriz;

    public Matriz(int num) {
        this.matriz = new int[num][num];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void tabla(int[][] matriz) {

        System.out.printf("%4s", "");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("");

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%4d", i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public int suma(boolean flag) {
        int diagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagonal += matriz[i][i];
        }

        if (flag) {
            return diagonal;
        }else{
            return suma() - diagonal;
        }

    }

    public int suma(int fila){
        int suma = 0;

        if (fila>=0 && fila<matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[fila][i];
            }  
        }else{
            return -1;
        }
        return suma;
    }

    public int[][] borraFila(int filaABorrar) {

        if (filaABorrar < 0 || filaABorrar >= matriz.length) {
            return matriz;
        }

        int[][] nuevaMatriz = new int[matriz.length - 1][matriz[0].length];
        int filaNueva = 0;
        for (int filaOriginal = 0; filaOriginal < matriz.length; filaOriginal++) {
            if (filaOriginal != filaABorrar) {
                for (int columna = 0; columna < matriz[filaOriginal].length; columna++) {
                    nuevaMatriz[filaNueva][columna] = matriz[filaOriginal][columna];
                }
                filaNueva++;
            }
        }
        return nuevaMatriz;
    }

    public static void main(String[] args) {
        // int[][] prueba = new int[3][4];
        Matriz matriz = new Matriz(5);
        tabla(matriz.matriz);
    }
}
