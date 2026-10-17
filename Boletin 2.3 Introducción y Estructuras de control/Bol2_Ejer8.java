import java.util.Scanner;

public class Bol2_Ejer8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Quieres seguir? 1.Repetir 0.Salir");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Dime un numero:");
                int num1 = sc.nextInt();
                System.out.println("Dime otro numero:");
                int num2 = sc.nextInt();
                System.out.println("Dime otro numero:");
                int num3 = sc.nextInt();
                if (num1 >= num2 && num1 >= num3) {
                    System.out.println("El numero mayor de los 3 es " + num1);
                } else if (num2 >= num1 && num2 >= num3) {
                    System.out.println("El numero mayor de los 3 es " + num2);
                } else {
                    System.out.println("El numero mayor de los 3 es " + num3);
                }
            } else {
                System.out.println("Saliendo del programa...");
            }

        } while (opcion != 0);
    }
}
