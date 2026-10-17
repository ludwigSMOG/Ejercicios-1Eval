import java.awt.RadialGradientPaint;
import java.util.Scanner;

public class Bol3_Ejer9 {

    public static double areaRectanguloTriangulo(double base, double altura, boolean flag) {
        if (flag) {
            return base * altura;
        } else {
            return base * altura / 2;
        }
    }

    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double base;
        double altura;
        do {
            System.out.println(
                    "Menu:\n1.Area del Triangulo.\n2.Area de un Rectangulo.\n3.Area de un cuadrado.\n4.Area de un Circulo\n5.Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:// True->Area Rectangulo False->Triangulo
                    System.out.println("Dime la base:");
                    base = sc.nextDouble();
                    System.out.println("Dime la altura:");
                    altura = sc.nextDouble();
                    System.out.println(areaRectanguloTriangulo(base, altura, true));
                    break;
                case 2:
                    System.out.println("Dime la base:");
                    base = sc.nextDouble();
                    System.out.println("Dime la altura:");
                    altura = sc.nextDouble();
                    System.out.println(areaRectanguloTriangulo(base, altura, false));
                    break;
                case 3:
                    System.out.println("Dime el cuadrado:");
                    base = sc.nextDouble();
                    System.out.printf("%.1f\n", areaRectanguloTriangulo(base, base, true));
                    break;
                case 4:
                    System.out.println("Dime el radio:");
                    base = sc.nextInt();
                    System.out.printf("%.4f\n", areaCirculo(base));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida!");
                    break;
            }
        } while (opcion != 5);
    }
}
