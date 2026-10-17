import java.time.LocalDateTime;
import java.time.Year;

public class Ventas {

    public int[] vector = new int[12];

    private int año;

    public void setAño(int año) {
        int anoActual = 2026;
        if (año < 2026) {
            this.año = año;
        } else {
            año = anoActual - 1;
        }
    }

    public int getAño() {
        return año;
    }

    public Ventas(int año) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 999);
        }
        setAño(año);
    }

    public Ventas(int[] vector, int año) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 999);
        }
        setAño(año);
    }

    public static int media(int[] vector) {
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma / vector.length;
    }

    public void grafica(){
        int numeroBloques;
        System.out.println("Año " + getAño() + ":");
        for (int i = 0; i < vector.length; i++) {
            numeroBloques = vector[i]/100;
            System.out.printf("Mes %2d %4s): " , i +1, "(" + vector[i]);
            for (int j = 0; j < numeroBloques; j++) {
                System.out.printf("%s", "#");
            }
            System.out.println();
        }
    }
}
