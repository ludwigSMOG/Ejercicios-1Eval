import java.util.Scanner;

public class Bol3_Ejer8 {
    public static boolean primos(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Dime un numero:");
            num = sc.nextInt();
            
            if (num > 2) {
                for (int i = 2; i <= num; i++) {
                    System.out.print(i);
                    System.out.println(primos(i));
                }
            } else {
                System.out.println("El numero debe ser mayor que 2.");
            }
        } while (num<=2);
    }
    //AMPLIAR
}
