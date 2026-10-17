import java.util.Scanner;

public class Bol3_Ejer1 {

    // EJERCICIO 1
    // VOID -> No devuelvo nada.
    public void saludo() {
        System.out.println("Ejercicio 1");
        System.out.print("HOLA");
    }

    // EJERCICIO 2
    public void saludo10() {
        System.out.println("\nEjercicio 2");
        String saludo = "HOLA";
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s ", saludo);
        }
    }

    // EJERCICIO 3

    public void variosSaludos(int num) {
        System.out.print("\nEjercicio 3 A\n");
        for (int i = 0; i < num; i++) {
            System.out.print("HOLA");
        }
    }

    public void pintaMensaje(String msg) {
        System.out.print("\nEjercicio 3 B\n");
        System.out.print(msg);
    }

    // EJERCICIO 4
    public void pintaMensaje10(String msg) {
        System.out.print("\nEjercicio 4\n");
        for (int i = 1; i <= 10; i++) {
            System.out.print(msg + " ");
        }
    }

    // EJERCICIO 5
    public void pintaVariosMensajes(String msg, int n) {
        System.out.print("\nEjercicio 5\n");
        for (int i = 0; i < n; i++) {
            System.out.print(msg + " ");
        }
    }

    // EJERCICIO 6
    public int suma20() {
        System.out.print("\nEjercicio 6\n");
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }
        return sum;
    }
    
    // EJERCICIO 7
    public int sumaN(int n){
        int sum = 0;
        System.out.print("Ejercicio 7\n");
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        return sum;
    }

    // EJERCICIO 8
    public int pideNumero(String msg){
        Scanner sc = new Scanner(System.in);

        System.out.println(msg);
        System.out.print("Dime el numero:");
        int num = sc.nextInt();
        System.out.print("El doble de " + num + " es: ");
        return (int)Math.pow(num, 2);
    }

    public static void main(String[] args) {
        Bol3_Ejer1 ejer1 = new Bol3_Ejer1();
        ejer1.saludo();
        ejer1.saludo10();
        ejer1.variosSaludos(5);
        ejer1.variosSaludos(2);
        ejer1.pintaMensaje("Adios");
        ejer1.pintaMensaje10("Adios");
        ejer1.pintaVariosMensajes("Adios", 3);
        System.out.println(ejer1.suma20());
        System.out.println(ejer1.sumaN(5));
        System.out.println(ejer1.pideNumero("dime un numero y te dire el doble..."));
    }

}
