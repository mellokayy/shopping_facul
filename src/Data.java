public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (ano >= 0 && mes >= 1 && mes <= 12) {
            int diasNoMes = 31;

            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasNoMes = 30;
            } else if (mes == 2) {
                if (verificaAnoBissexto()) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }

            }

            if (dia >= 1 && dia <= diasNoMes) {
                this.setDia(dia);
                this.setMes(mes);
                this.setAno(ano);
            } else {
                this.setDia(1);
                this.setMes(1);
                this.setAno(2000);
            }

        }

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto() {
        if (this.getAno() % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Data outraData) {
        if (this.ano < outraData.ano) {
            return -1;
        } else if (this.ano > outraData.ano) {
            return 1;
        } else {
            if (this.mes < outraData.mes) {
                return -1;
            } else if (this.mes > outraData.mes) {
                return 1;
            } else {
                if (this.dia < outraData.dia) {
                    return -1;
                } else if (this.dia > outraData.dia) {
                    return 1;
                } else {
                    return 0; // As datas são iguais
                }
            }
        }
    }

}