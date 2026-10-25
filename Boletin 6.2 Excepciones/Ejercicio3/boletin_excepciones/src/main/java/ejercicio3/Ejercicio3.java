
package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

  public static int numeros(String msg, int min, int max) throws IllegalArgumentException {
    Scanner sc = new Scanner(System.in);
    boolean flag;
    int numero = 0;
    if (min >= max || msg.equals("") || msg == null) {
      throw new IllegalArgumentException("Error el dato no es valido!");
    }

    do {
      flag = false;
      try {

        System.out.println(msg + " dentro del rango: " + min + " - " + max);
        numero = sc.nextInt();

        if (numero < min || numero > max) {
          System.out.println("Error, el dato no esta en el rango");
          flag = true;
        }
      } catch (InputMismatchException ee) {
        System.out.println("Error, el dato no es un Numero!");
        sc.nextLine();
        flag = true;
      }
    } while (flag);
    return numero;
  }

  public static double reales(String msg, double min, double max)
      throws IllegalArgumentException {
    Scanner sc = new Scanner(System.in);
    boolean flag;
    double numero = 0;

    if (min >= max || msg == null || msg.isEmpty()) {
      throw new IllegalArgumentException(
          "Error, los parametros no son validos!");
    }

    do {
      flag = false;

      try {
        System.out.println(msg + " dentro del rango " + min + " : " + max);
        numero = sc.nextDouble();

        if (numero < min || numero > max) {
          System.out.println("Error, el numero esta fuera del rango");
          flag = true;
        }

      } catch (InputMismatchException e) {
        System.out.println("Error, debes introducir un numero real");
        sc.nextLine();
        flag = true;
      }

    } while (flag);

    return numero;
  }

  public static void main(String[] args) {
    int numer = numeros("Dime un dato", 1, 5);
    System.out.println(numer);

    double nume = reales("Dime un dato", 1, 5);
    System.out.println(nume);
  }
}
