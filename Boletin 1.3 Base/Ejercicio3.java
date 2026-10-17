import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero Real:");
        double num = sc.nextDouble();
        System.out.println("Dime otro numero Real:");
        double num2 = sc.nextDouble();

        double suma = num + num2;
        double resta = num - num2;
        double multiplicacion = num * num2;
        double division = num / num2;
        double resto = num % num2;
        System.out.println("La suma total es: " + suma);
        System.out.println("La resta total es: " + resta);
        System.out.println("La multiplicacion total es: " + multiplicacion);
        System.out.println("La division total es: " + division);
        System.out.println("La resto total es: " + resto);
    }
}
