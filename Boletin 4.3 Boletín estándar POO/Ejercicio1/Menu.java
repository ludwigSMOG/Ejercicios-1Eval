import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Geometria rectangulo = new Geometria(true, 5, 5);
        Geometria triangulo = new Geometria();

        System.out.println("Dime la base:");
        double base = sc.nextDouble();
        System.out.println("Dime la altura:");
        double altura = sc.nextDouble();

        triangulo.setAltura(altura);
        triangulo.setBase(base);

        System.out.println("Rectangulo");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Area: " + rectangulo.area());
        System.out.println("Perimetro: " + rectangulo.perimetro());
        System.out.println("Diagonal: " + rectangulo.diagonal());

        System.out.println("\nTriangulo");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Area: " + triangulo.area());
        System.out.println("Perimetro: " + triangulo.perimetro());
        System.out.println("Hipotenusa: " + triangulo.diagonal());

    }
}
