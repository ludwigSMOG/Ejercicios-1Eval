import java.util.Scanner;

public class Bol2_Ejer5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double celsius;
        double resultado;
        do {
            System.out.println("Menu:\n1.Convertir a Farenheit\n2.Convertir a Kelvin\n3.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dime los grados Celsius: ");
                    celsius = sc.nextDouble();
                    resultado = 1.8 * celsius + 32;

                    System.out.printf("La temperatura en Fahrenheit: %.2f°F%n", resultado);
                    break;
                case 2:
                    System.out.println("Dime los grados Celsius: ");
                    celsius = sc.nextDouble();
                    resultado = celsius + 273.15;

                    System.out.printf("La temperatura en Kelvin: %.2fK%n", resultado);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida!");
                    break;
            }

        } while (opcion != 3);
    }
}
