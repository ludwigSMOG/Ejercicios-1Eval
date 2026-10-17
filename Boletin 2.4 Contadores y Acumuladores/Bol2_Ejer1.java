import java.util.ArrayList;
import java.util.Scanner;

public class Bol2_Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CONTADORES

        //EJERCICIO 1
        System.out.println("Numeros del 1 al 100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        
        //EJERCICIO 2
        System.out.println("");
        System.out.println("Numeros del 100 al 1");
        for (int i = 100; i > 0; i--) {
            System.out.print(i + " ");
        }
        
        //EJERCICIO 3
        System.out.println("Numeros del 1 al 100");
        for (int i = 1; i <= 100; i+=2) {
            if (i%2!=0) {
                System.out.println("Los Numeros Impares: " + i);
            }
        }

        //EJERCICIO 4
        System.out.println("");
        System.out.println("Numeros del 100 al 150");
        for (int i = 100; i <= 150; i += 5) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        
        //EJERCICIO 5
        System.out.println("");
        System.out.println("Tabla de Multiplicar");
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        int multi = 0;
        for (int i = 1; i <= 10; i++) {
            multi = num * i;
            System.out.println(multi);
        }
        
        //EJERCICIO 6
        ArrayList<Integer> cole = new ArrayList<>();
        int numeros;
        int cont = 0;
        do {
            System.out.println("Dime numeros: 0.Salir");
            numeros = sc.nextInt();
            if (numeros!=0) {
                cole.add(numeros);
                cont++;    
            }
        } while (numeros!=0);
        System.out.println("El total de numeros fue: " + cont);
        System.out.println("Los numeros son el: ");
        for (int i = 0; i < cole.size(); i++) {
            System.out.printf("%d " , cole.get(i));
        }

        //EJERCICIO 7
        System.out.println("");
        ArrayList<Integer> posi = new ArrayList<>();
        ArrayList<Integer> nega = new ArrayList<>();
        int numeros2;
        int cont2 = 0;
        do {
            System.out.println("Dime numeros: 0.Salir");
            numeros2 = sc.nextInt();
            if (numeros2!=0 && numeros2>0) {
                posi.add(numeros2);
                cont2++;    
            }else if(numeros2!=0 && numeros2<0){
                nega.add(numeros2);
                cont2++;
            }
        } while (numeros2!=0);
        System.out.println("El total de numeros fue: " + cont2);
        System.out.println("Los numeros Positivos fueron: ");
        for (int i = 0; i < posi.size(); i++) {
            System.out.printf("%d " , posi.get(i));
        }
        System.out.println("");
        System.out.println("Los numeros Negativos fueron: ");
        for (int i = 0; i < nega.size(); i++) {
            System.out.printf("%d", nega.get(i));
        }

        //EJERCICIO 8
        int canti = 0;
        int conta = 0;
        int contar = 0;
        String texto = "JAVA";
        String palabras = "";
        System.out.println("");
        System.out.println("Cuantas palabras deseas introducir?");
        canti = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("Dime palabras:");
            palabras = sc.nextLine();
            if (palabras.equals(texto)) {
                contar++;
            }
            conta++;
        } while (conta<canti);
        System.out.println("Ha escrito JAVA un total de: " + contar);
    }
}
//retorno de carro al pedir datos

