import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Menu: 1.Repetir 2.Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Dime un numero:");
                int num1 = sc.nextInt();
                System.out.println("Dime otro numero:");
                int num2 = sc.nextInt();
                int division;
                if (num1 > num2 && num2 > 0) {
                    division = num1 / num2;
                    System.out.println("El numero " + num1 + " es mayor.");
                    System.out.println("La division es: " + division);
                } else if (num2 > num1) {
                    division = num2 / num1;
                    System.out.println("El numero " + num2 + " es mayor.");
                    System.out.println("La division es: " + division);
                } else if (num2 == 0) {
                    System.out.println("El numero es 0, intentalo de nuevo...");
                }
            } else {
                System.out.println("Saliendo del programa...");
            }
        } while (opcion == 1);
    }
}
