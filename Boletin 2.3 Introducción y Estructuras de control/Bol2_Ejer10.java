import java.util.Scanner;

public class Bol2_Ejer10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero:");
        int num1 = sc.nextInt();
        System.out.println("Dime otro numero:");
        int num2 = sc.nextInt();

        int numExtra = 0;

        numExtra = num1;
        num1 = num2;
        num2 = numExtra;

        System.out.println("Los valores son: " + num1 + " y " + num2);
    }
}
