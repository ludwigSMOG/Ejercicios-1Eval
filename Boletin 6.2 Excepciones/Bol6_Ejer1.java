import java.util.InputMismatchException;
import java.util.Scanner;

public class Bol2_Ejer5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double celsius;
        double resultado;
        do {
            try {

                System.out.println("Menu:\n1.Convertir a Farenheit\n2.Convertir a Kelvin\n3.Salir");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        boolean flag;
                        do {
                            flag = false;
                            try {
                                System.out.println("Dime los grados Celsius: ");
                                celsius = sc.nextDouble();
                                resultado = 1.8 * celsius + 32;

                                System.out.printf("La temperatura en Fahrenheit: %.2f°F%n", resultado);
                            } catch (InputMismatchException e) {
                                System.out.println("Error el dato No es Numero!");
                                sc.nextLine();
                                flag = true;
                            }
                        } while (flag);
                        break;
                    case 2:
                        boolean flag2;
                        do {
                            flag2 = false;
                            try {
                                System.out.println("Dime los grados Celsius: ");
                                celsius = sc.nextDouble();
                                resultado = celsius + 273.15;
    
                                System.out.printf("La temperatura en Kelvin: %.2fK%n", resultado);
                            } catch (InputMismatchException e) {
                                System.out.println("Error el dato No es Numero!");
                                sc.nextLine();
                                flag2 = true;
                            }
                        } while (flag2);
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion no valida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, el dato no es un Numero!");
                sc.nextLine();
                opcion = 0;
            }

        } while (opcion != 3);
    }
}
