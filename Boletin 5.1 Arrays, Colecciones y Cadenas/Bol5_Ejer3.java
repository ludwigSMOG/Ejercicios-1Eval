import java.util.ArrayList;

public class Bol5_Ejer3 {

    public static ArrayList<Integer> aleatorios(int n) {
        ArrayList<Integer> cole = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cole.add((int) (Math.random() * 4001) + 1000);
        }
        return cole;
    }

    public static void elementos(ArrayList<Integer> cole) {
        for (Integer integer : cole) {
            System.out.print(integer + " ");
        }
    }

    public static int maximo(ArrayList<Integer> cole) {
        int maximo = cole.get(0);
        for (int i = 0; i < cole.size(); i++) {
            if (cole.get(i) > maximo) {
                maximo = cole.get(i);
            }
        }
        return maximo;
    }

    public static int minimo(ArrayList<Integer> cole) {
        int minimo = cole.get(0);
        for (Integer integer : cole) {
            if (integer < minimo) {
                minimo = integer;
            }
        }
        return minimo;
    }

    public static boolean intercambio(ArrayList<Integer> cole, int a, int b) {
        int nuevo = cole.get(0);
        if (a >= 0 && b >= 0 && a < cole.size() && b < cole.size()) {
            nuevo = cole.get(a);
            cole.set(a, cole.get(b));//
            cole.set(b, nuevo);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> cole = aleatorios(10);
        System.out.println("");
        elementos(cole);
        System.out.println("");
        System.out.println("maximo: " + maximo(cole));
    }
}
