import java.util.Scanner;

public class Bol2_Ejer9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int cont = 0;
        int maximo = 0;
        System.out.println("Cuantos numeros deseas introducir?");
        opcion = sc.nextInt();
        do {
            System.out.println("Introduce numero:");
            int num = sc.nextInt();
            maximo = num;//obtengo el primero como maximo
            if (num > maximo) {
                maximo = num;
            }
            cont++;
        } while (cont < opcion);
        System.out.println("El numero maximo introducidos es el " + maximo);
    }
}
//