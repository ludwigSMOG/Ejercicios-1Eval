import java.util.Scanner;

public class Bol2_Ejer15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero:");
        long num = sc.nextLong();
        long facto = 1;

        for (long i = num; i >= 1; i--) {
            facto *= i;
        }
        System.out.println("El numero factorial es " + facto);

        System.out.println("");
        facto = 1;
        long cont = num;
        do {
            facto *= cont;
            cont--;
        } while (cont >= 1);
        System.out.println("El numero factorial es " + facto);

        System.out.println("");
        facto = 1;
        cont = num;
        while (cont >= 1) {
            facto *= cont;
            cont--;
        }
        System.out.println("El numero factorial es " + facto);
    }
}
