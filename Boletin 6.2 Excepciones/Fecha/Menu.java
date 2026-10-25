import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag;
        do {
            flag = false;
            try {
                System.out.println("Dime un dia:");
                int dia = sc.nextInt();
                System.out.println("Dime Mes:");
                int mes = sc.nextInt();
                System.out.println("Dime Año:");
                int año = sc.nextInt();
        
                Fecha f1 = new Fecha(dia, mes, año);
                System.out.println(f1.fechaFormateada(true));
                
                System.out.println("");
        
                System.out.println("Dime un dia:");
                int dia2 = sc.nextInt();
                System.out.println("Dime Mes:");
                int mes2 = sc.nextInt();
                System.out.println("Dime Año:");
                int año2 = sc.nextInt();
                Fecha f2 = new Fecha(dia2, mes2, año2);
                System.out.println(f2.fechaFormateada(false));
        
                System.out.println(Fecha.diferenciaFechas(f1, f2));
            } catch (IllegalArgumentException e) {
                System.out.println("Error, el dato no es valido!");
                sc.nextLine();
                flag = true;
            } catch (InputMismatchException ee){
                System.out.println("Error, valor no valido!");
                sc.nextLine();
                flag = true;
            }

        } while (flag);

    }
}
