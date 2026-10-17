import java.util.Scanner;

public class Bol2_Ejer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ACUMULADORES

        // EJERCICIO 1
        int acu = 0;
        for (int i = 1; i <= 100; i++) {
            acu += i;
        }
        System.out.println("La suma Total de 1 al 100: " + acu);

        // EJERCICIO 2
        System.out.println("Dime un numero:");
        int num = sc.nextInt();
        int acu2 = 0;
        for (int i = 1; i <= num; i++) {
            acu2 += i;
        }
        System.out.println("La suma de los Numeros: " + acu2);

        // EJERCICIO 3
        int acu3 = 0;
        for (int i = 1; i <= 100; i += 2) {
            if (i % 2 != 0) {
                acu3 += i;
            }
        }
        System.out.println("La Suma de los Numeros Impares: " + acu3);

        // EJERCICIO 4
        int acu4 = 0;
        for (int i = 100; i <= 150; i += 5) {
            if (i % 5 == 0) {
                acu4 += i;
            }
        }
        System.out.println("La Suma de los Numeros Multiplos de 5 son: " + acu4);

        // EJERCICIO 5
        int acu5 = 1;
        System.out.println("Dime un numero:");
        int num2 = sc.nextInt();
        for (int i = 1; i <= num2; i++) {
            acu5 *= i;
        }
        System.out.println("La Multiplicacion total es: " + acu5);

        // EJERCICIO 6
        System.out.println("Dime cuantos numeros deseas sumar?");
        int num3 = sc.nextInt();
        int suma = 0;
        int conta = 0;
        do {
            System.out.println("Dime los numeros a sumar:");
            int num4 = sc.nextInt();
            suma += num4;
            conta++;
        } while (conta < num3);
        System.out.println("La Suma Total es: " + suma);

        // EJERCICIO 7
        System.out.println("Dime un numero Inicial:");
        int inicial = sc.nextInt();
        System.out.println("Dime un numero Final:");
        int fin = sc.nextInt();
        int acuPares = 0;
        int acuImpares = 0;
        for (int i = inicial; i <= fin; i++) {
            if (i % 2 == 0) {
                acuPares += i;
            } else if (i % 2 != 0) {
                acuImpares += i;
            } else {
                System.out.println("Numero no validos!");
            }
        }
        System.out.println("La suma de los Pares es: " + acuPares);
        System.out.println("La suma de los Impares es: " + acuImpares);
    }
}
