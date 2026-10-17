public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
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

    public Fecha() {
        this.setDia(5);
        this.setMes(12);
        this.setAño(2000);
    }

    public Fecha(int dia, int mes, int año) {
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
            mesName = meses[mes-1];
            return "\"" + dia + " de " + mesName + " de " + año + "\"";
        }
    }

    public static int diferenciaFechas(Fecha f1, Fecha f2) {
        return f1.getAño() - f2.getAño();
    }
}
