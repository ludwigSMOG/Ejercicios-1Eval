import java.util.Scanner;

public class Bol2_Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero:");
        int num1 = sc.nextInt();

        System.out.println("Dime un numero real:");
        double num2 = sc.nextDouble();

        System.out.println();
        System.out.printf("Numero decimal: %d%n", num1);
        System.out.printf("Numero Octal: %05o%n", num1);
        System.out.printf("Numero Hexadecimal: %X%n", num1);
        System.out.println();// %x letras minus, %X letras Mayusc
        System.out.printf("Numero Real: %7.3f%n", num2);

        System.out.println();
        switch (num1) {
            case 1:
                System.out.println("Lunes");

                break;
            case 2:
                System.out.println("Martes");

                break;
            case 3:
                System.out.println("Miercoles");

                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");

                break;
            case 6:
                System.out.println("Sabado");

                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Dia no valido!");
                break;
        }

    }
}
