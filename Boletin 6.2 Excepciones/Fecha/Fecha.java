public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public void setDia(int dia) throws IllegalArgumentException {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Error, el dia no es valido!");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) throws IllegalArgumentException {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Error, el mes no es valido!");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public Fecha() throws IllegalArgumentException {
        this.setDia(5);
        this.setMes(12);
        this.setAño(2000);
    }

    public Fecha(int dia, int mes, int año) throws IllegalArgumentException {
        this.setDia(dia);
        this.setMes(mes);
        this.setAño(año);
    }

    public String fechaFormateada(boolean flag) {
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        String mesName = "";
        if (flag) {
            return "\"" + dia + "/" + mes + "/" + año + "\"";
        } else {
            mesName = meses[mes - 1];
            return "\"" + dia + " de " + mesName + " de " + año + "\"";
        }
    }

    public static int diferenciaFechas(Fecha f1, Fecha f2) {
        return f1.getAño() - f2.getAño();
    }
}
