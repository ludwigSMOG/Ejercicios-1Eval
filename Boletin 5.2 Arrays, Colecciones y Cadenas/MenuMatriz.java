import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz matriz = new Matriz(5);
        int opcion = 0;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.println("Menu:");
                System.out.println("\n1.Mostrar matriz.");
                System.out.println("\n2.Mostrar suma de todos los elementos.");
                System.out.println("\n3.Mostrar suma de la Diagonal.");
                System.out.println("\n4.Mostrar suma de los elementos salvo diagonal.");
                System.out.println("\n5.Mostrar suma de elementos de una fila: la fila la escoge el usuario.");
                System.out.println("\n6.Mostrar matriz sin una fila: la fila la escoge el usuario.");
                System.out.println("\n7.Salir.");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        Matriz.tabla(matriz.matriz);
                        break;
                    case 2:
                        System.out.println(matriz.suma());
                        break;
                    case 3:
                        System.out.println(matriz.suma(true));
                        break;
                    case 4:
                        System.out.println(matriz.suma(false));
                        break;
                    case 5:
                        System.out.println("Dime fila para sumar: ");
                        int fila = sc.nextInt();
                        System.out.println(matriz.suma(fila));
                        break;
                    case 6:
                        System.out.println("Dime una fila: ");
                        int fila2 = sc.nextInt();
                        int[][] matriz2 = matriz.borraFila(fila2);
                        Matriz.tabla(matriz2);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Error, el dato no es valido.");
                        break;
                }
            } catch (InputMismatchException e) {
                flag = true;
                System.out.println("Error, dato no valido");
                sc.nextLine();
            }
        } while (opcion != 7);
    }
}
