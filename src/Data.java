import java.util.Scanner;

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

    public Data() {

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

    public void criarData(Scanner scanner) {
        String data = scanner.next();
        String[] dataSeparada = data.split("/");
        this.setDia(Integer.parseInt(dataSeparada[0]));
        this.setMes(Integer.parseInt(dataSeparada[1]));
        this.setAno(Integer.parseInt(dataSeparada[2]));

    }

    public int compareTo(Data data) {
        if (this.ano < data.getAno()) {
            return -1;
        } else if (this.ano > data.getAno()) {
            return 1;
        } else {
            if (this.mes < data.getMes()) {
                return -1;
            } else if (this.mes > data.getMes()) {
                return 1;
            } else {
                if (this.dia < data.getDia()) {
                    return -1;
                } else if (this.dia > data.getDia()) {
                    return 1;
                } else {
                    return 0; // As datas são iguais
                }
            }
        }
    }

}