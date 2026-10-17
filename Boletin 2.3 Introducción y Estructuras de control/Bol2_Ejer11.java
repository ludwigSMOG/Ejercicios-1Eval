public class Bol2_Ejer11 {
    
    public static void main(String[] args) {
        int num = 0;
        int suma = 0;

        while (suma <= 10000) {
            num++;
            suma+=num;
        }

        System.out.println("El numero es: " + num);
        System.out.println("La suma es: " + suma);
    }
}
