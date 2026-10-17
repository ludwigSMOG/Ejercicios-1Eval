public class Bol5_Ejer1 {

    public static int[] aleatorios(int num) {
        int[] vector = new int[num];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 4001) + 1000;
        }
        return vector;
    }

    public static void enteros(int[] vector) {
        for (int i : vector) {
            System.out.print(i + " ");
        }
    }

    public static int maximo(int[] vector) {
        int maximo = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    public static int minimo(int[] vector) {
        int minimo = vector[0];

        for (int i : vector) {
            if (i<minimo) {
                minimo = i;
            }
        }
        return minimo;
    }

    public static boolean intercambia(int [] vector, int a, int b){
        int inter;
        if (a>0 && b>0 && a<=vector.length && b<=vector.length ) {
            //System.out.println(vector[a]+ " " + vector[b]);
            inter=vector[a];
            vector[a] = vector[b];
            vector[b] = inter; 
            //System.out.println(vector[a]+ " " + vector[b]);
            //for (int i = 0; i < vector.length; i++) {
            //    System.out.print(vector[i] + " ");
            //}
            return true;
        }
        return  false;
    }
    public static void main(String[] args) {
        // String [] vector = new String[10];
        int[] vector = aleatorios(5);
        enteros(vector);

        System.out.println("");
        System.out.println("Maximo: " + maximo(vector));
        System.out.println("Minimo: " + minimo(vector));
        System.out.println(intercambia(vector, 2, 4));
    }
}
