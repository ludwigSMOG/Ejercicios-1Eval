public class Bol5_Ejer4 {
    
    public static void muestraEnLinea(String cadena){
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    public static String subCadena(String cadena, int posi, int canti){
        if (posi>=0 && posi<cadena.length()) {
            return cadena.substring(posi, canti);
        }
        return " ";
    }

    public static void muestraCentrado(String cadena){
        System.out.printf("%80s", cadena);
    }

    public static char [] cadenaAVector(String cadena){
        char [] nuevo = new char[cadena.length()];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo[i] = cadena.charAt(i);
        }
        return nuevo;
    }

    public static String alReves(String cadena){
        String cade = "";
        for (int i = cadena.length() -1; i >= 0; i--) {
            cade += cadena.charAt(i);
        }
        return cade;
    }

    public static String pasoAMayusculas(String cadena, String cadena2, String cadena3){
        return cadena.concat(cadena2).concat(cadena3).toUpperCase().replace("_", " ");

    }
    public static void main(String[] args) {
        muestraEnLinea("Holaa");
        System.out.println("");
        String cade= subCadena("Buenas", 0, 3);
        System.out.println(cade);
        System.out.println("");
        muestraCentrado("Ludwig");
        System.out.println("");
        char [] caden = cadenaAVector("Evans");
        System.out.println(caden);
        System.out.println("");
        String cadena = alReves("Holabuenas");
        System.out.println(cadena);
        System.out.println("");
        String can = pasoAMayusculas("Hola", "_que tal", "_estas?");
        System.out.println(can);
    }
}
