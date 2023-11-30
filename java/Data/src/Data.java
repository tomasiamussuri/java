public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if (getMes() == 2 && (getDia() == 28 || getMes() == 2 && getDia() == 29)) {
            this.dia = dia;
        } else if ((getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11) && getDia() == 30) {
            this.dia = dia;
        } else if ((getMes() == 1 || getMes() == 3 || getMes() == 5 || getMes() == 7 || getMes() == 8 || getMes() == 10 || getMes() == 12) && getDia() == 31) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido, tente novamente!");
        }
    }
    /*
    public void setDia(int dia) {
        if (getMes() == 2) {
            if (getDia() == 28 || getDia() == 29) {
                this.dia = dia;
            } else {
                System.out.println("Dia inválido, tente novamente!");
            }
        } else if (getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11) {
            if(getDia() == 30) {
                this.dia = dia;
            } else {
                System.out.println("Dia inválido, tente novamente!");
            }
        } else {
            if (getDia() == 31) {
                this.dia = dia;
            } else {
                System.out.println("Dia inválido, tente novamente!");
            }
        }
    }
    */
    //if(dia > 0 && dia <= 31){
    //    this.dia = dia;
    //} else {
    //    System.out.println("Dia inválido, tente novamente!");
    //}
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        } else {
            System.out.println("Mês inválido, tente novamente!");
        }

    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if(ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido, tente novamente!");
        }
    }

    public void verificarData() {
        if (getDia() == 25 && getMes() == 12) {
            System.out.println("---------- NATAL ----------");
            System.out.println("Data: " + getDia() + "/" + getMes() + "/" + getAno());
        } else {
            System.out.println("A data informada não é natal.");
        }

    }

}