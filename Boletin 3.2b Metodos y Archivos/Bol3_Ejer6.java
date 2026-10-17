import java.util.Scanner;

public class Bol3_Ejer6 {

    //EJERCICIO 6 A
    public static double potencia(double base, int expo) {

        double resultado = 1;

        if (expo < 0) {
            base = 1 / base;
            expo = -expo;
        }

        for (int i = 0; i < expo; i++) {
            resultado = resultado * base;
        }

        return resultado;
    }

    //EJERCICIO 6 B
    public static void primerasPoten(int n, double a) {

        for (int i = 0; i < n; i++) {
            double resultado = potencia(a, i);

            System.out.print(resultado);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.err.println("");
    }

    //EJERCICIO 6 C
    public static double progresion(double x, int n){

        double acu = 0;
        for (int i = 0; i <= n; i++) {
            acu+= potencia(x, i);
        }
        return acu;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Potencia de 2 elevado a 4: " + potencia(2, 4));
        System.out.println("Potencia de 2 elevado a -3: " + potencia(2, -3));

        System.out.println("Las primeras 4 potencias de 2:");
        primerasPoten(4, 2);

        System.out.println(progresion(2, 4));
    }
}