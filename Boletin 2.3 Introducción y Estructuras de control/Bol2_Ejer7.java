import java.util.Scanner;

public class Bol2_Ejer7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int suma = 0;
        double media;
        int cont = 0;
        System.out.println("0.Salir del programa");
        do {
            System.out.println("Dime numeros:");
            opcion = sc.nextInt();
            // evitamos sumar y contar el 0
            if (opcion != 0) {
                suma += opcion;
                cont++;
            }
        } while (opcion != 0);

        if (cont > 0) {
            media = (double) suma / cont;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No hay numeros");
        }
    }
}
//