public class Geometria {

    private boolean figura;
    private double altura;
    private double base;

    public void setAltura(double altura) throws IllegalArgumentException {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("La altura no es valida!");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) throws IllegalArgumentException {
        if (base > 0) {
            this.base = base;
        } else {
            throw new IllegalArgumentException("La base es Negativa!");
        }
    }

    public double getBase() {
        return base;
    }

    public boolean getFigura() {
        return figura;
    }

    // constructor vacio
    public Geometria() {
        this.figura = false;
        this.setAltura(2);
        this.setBase(2);
    }

    public Geometria(double altura, double base) throws IllegalArgumentException {
        this.figura = false;
        this.setAltura(altura);
        this.setBase(base);
    }// constructor de triangulo

    public Geometria(boolean figura, double altura, double base)  throws IllegalArgumentException{
        this.figura = figura;
        this.setAltura(altura);
        this.setBase(base);
    }

    public double area() {
        if (figura) {// Rectangulo
            return base * altura;
        } else {// Triangulo
            return base * altura / 2;
        }
    }

    public double perimetro() {

        if (figura) {
            return 2 * base + 2 * altura;
        } else {
            return base + altura + diagonal();
        }
    }

    public double diagonal() {
        return Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2)));
    }

    public String tipo(boolean figura) {
        if (figura) {
            return "Rectangulo";
        }
        return "Triangulo";
    }

}
