import java.util.Scanner;

public class Bol2_Ejer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero:");

        int num1 = sc.nextInt();
        int suma = 0;
        if (num1>0) {
            for (int i = 1; i <= num1; i++) {
                suma+=i;
                System.out.println(suma + " ");
            }
        }else{
            System.out.println("El numero es Negativo o 0");
        }
    }
}
