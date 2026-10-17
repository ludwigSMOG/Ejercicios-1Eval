public class Bol5_Ejer0 {
    public static void main(String[] args) {
        String frase = "Jar-Jar is the Big Boss";

         System.out.println(frase.length());//longitud -> 23
        
        System.out.println(frase.charAt(0));//1ºPosi
        System.out.println(frase.charAt(frase.length()-1));//Ultima posi.

        //System.out.println(frase.charAt(100));
        //La cadena no tiene tantos caracteres por eso lanza la Excepcion -> StringIndexOutOfBoundsException
        String frase2 = frase.toUpperCase();

        System.out.println(frase2.equals(frase));
        System.out.println(frase.equalsIgnoreCase(frase2));
        //El resultado es false al intentar comparar distinguiendo minus y mayus.
        //La segunda devuelve true porque si son iguales ignorando Minusculas y Mayusculas.
        
        System.out.println(frase.toLowerCase());

        System.out.println((frase.endsWith("Boss")));
        System.out.println((frase.endsWith("Jar")));

        System.out.println(frase.startsWith("Boss"));
        System.out.println(frase.startsWith("Jar"));

        System.out.println(frase.indexOf("Jar"));//1º Aparicion de Jar
        System.out.println(frase.lastIndexOf("Jar"));//Ultima aparicion

        String frase3 = frase2.substring(7,15);//15 porque SubString no incluye el ultimo.
        System.out.println(frase3);
        System.out.println(frase3.trim());

        String [] frase4 = frase.split("[- ]");

        for (int i = 0; i < frase4.length; i++) {
            System.out.printf("%3.3s ", frase4[i]);
        }
    }
}
