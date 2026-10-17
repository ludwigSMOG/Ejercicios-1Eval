import java.util.Scanner;

public class Bol3_Ejer3 {
    public static double pedirDato(String texto) {
        Scanner sc = new Scanner(System.in);
        double num;
        do {
            System.out.println(texto);
            num = sc.nextDouble();
            // if (num > 0) {
            // return num;
            // }
        } while (num <= 0);
        return num;
    }

    public static double superficieCilindro(double radio, double altura) {

        return 2 * Math.PI * radio * altura;
    }

    public static void mostrarDato(String cadena, double num) {
        System.out.printf("%s %.3f", cadena, num);
    }

    public static void main(String[] args) {
        double radio = pedirDato("Introduce el radio del cilindro:");

        double altura = pedirDato("Introduce la altura del cilindro:");

        double superficie = superficieCilindro(radio, altura);
        mostrarDato("El area del cilindro es de: ", superficie);
    }
}
