import java.util.Scanner;

public class Bol2_Ejer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero:");
        int num1 = sc.nextInt();
        System.out.println("Dime otro numero:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor que " + num2);
        } else if (num2 > num1) {
            System.out.println("El numero " + num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los dos numeros son iguales!");
        }

        if (num1 > 0) {
            System.out.println("El numero es Positivo!");
        } else {
            System.out.println("El numero NO es Positivo!");
        }

        if (num2 % 2 == 0) {
            System.out.println("El numero es Par!");
        } else {
            System.out.println("No es Par!");
        }

        if (num1 > 1 && num1 < 10) {
            System.out.println("El numero " + num1 + " esta dentro del Rango!");
        } else {
            System.out.println("Fuera de Rango!");
        }

        if (num2 < 1 || num2 > 100) {
            System.out.println("El numero " + num2 + " esta fuera del rango!");
        } else {
            System.out.println("Fuera de Rango!");
        }

        if (num1 != 0 && num2 != 0 && num1 % num2 == 0) {
            System.out.println("El numero " + num1 + " es multiplo entre " + num2);
        } else if (num1 != 0 && num2 != 0 && num2 % num1 == 0) {
            System.out.println("El numero " + num2 + " es multiplo entre " + num1);
        } else {
            System.out.println("Los numeros NO son Multiplos!");
        }
    }
}
