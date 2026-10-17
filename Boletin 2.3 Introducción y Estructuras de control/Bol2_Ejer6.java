import java.util.Scanner;

public class Bol2_Ejer6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println(
                    "Menu\n1.Cuadrado de un numero Real\n2.Inverso de un numero\n3.Raiz cuadrada de un numero\n4.Operacion AND\n5.Operacion OR\n6.Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dime un numero:");
                    double num = sc.nextDouble();
                    double cuadrado = num * num;
                    System.out.printf("%.2f%n", cuadrado);
                    break;
                case 2:
                    double num2;
                    double inverso;
                    do {
                        System.out.println("Dime un numero");
                        num2 = sc.nextDouble();
                        inverso = 1.0 / num2;
                        if (num2 > 0) {
                            System.out.printf("%.4f%n", inverso);
                        } else {
                            System.out.println("El numero debe ser mayor que 0!");
                        }
                    } while (num2 == 0);
                    break;
                case 3:
                    double num3;
                    do {
                        System.out.println("Dime un numero");
                        num3 = sc.nextDouble();
                        if (num3 >= 0) {
                            double cuadrada = Math.sqrt(num3);
                            System.out.printf("%.3f%n", cuadrada);
                        } else {
                            System.out.println("El numero debe ser Positivo o 0!");
                        }
                    } while (num3 < 0);
                    break;
                case 4:
                    System.out.println("Dime un numero:");
                    int num4 = sc.nextInt();
                    System.out.println("Dime otro numero:");
                    int num5 = sc.nextInt();

                    int resulAnd = num4 & num5;
                    System.out.printf("%X%n", resulAnd);
                    break;
                case 5:
                    System.out.println("Dime un numero:");
                    int num6 = sc.nextInt();
                    System.out.println("Dime otro numero:");
                    int num7 = sc.nextInt();

                    int resulOr = num6 | num7;
                    System.out.printf("%X%n", resulOr);

                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("La opcion no es valida!");
                    break;
            }
        } while (opcion != 6);
    }
}
//