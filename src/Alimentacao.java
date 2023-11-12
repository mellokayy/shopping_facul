import java.util.Scanner;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            Data data, Data dataAlvara, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, estoqueProdutos);
        this.setDataAlvara(new Data());
    }

    public Alimentacao() {
        this.setDataAlvara(new Data());
        this.setEndereco(new Endereco());
        this.setDataFundacao(new Data());
        this.setEstoqueProdutos(new Produto[0]);
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public void criarLoja(Scanner scanner) {
        super.criarLoja(scanner);

        System.out.print("Data de expedição do alvara (dd/MM/aaaa): ");
        dataAlvara.criarData(scanner);
    }

    @Override
    public void statusLoja() {
        super.statusLoja();
        System.out.println("Data do alvara: " + this.getDataAlvara().getDia() + "/" + this.getDataAlvara().getMes()
                + "/" + this.getDataAlvara().getAno());
    }

    @Override
    public String toString() {
        return "Alimentacao\n data Alvara: " + dataAlvara + super.toString();
    }

}
