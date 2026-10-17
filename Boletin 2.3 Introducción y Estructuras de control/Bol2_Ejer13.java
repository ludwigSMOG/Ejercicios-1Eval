import java.util.Scanner;

public class Bol2_Ejer13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero:");
        int num = sc.nextInt();
        int suma = 0;
        int suma2 = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("Numeros pares: " + suma);
        suma = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        System.out.println("Numeros impares: " + suma);
        System.out.println();
        suma = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                suma += i;
            } else {
                suma2 += i;
            }
        }
        System.out.println("Numeros pares: " + suma);
        System.out.println("Numeros impares: " + suma2);
    }
}
