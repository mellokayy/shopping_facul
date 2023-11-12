import java.util.Scanner;

public class Cosmetico extends Loja {
    private float taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            Data data, int estoqueProdutos, float taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, estoqueProdutos);
        this.setTaxaComercializacao(taxaComercializacao);
    }

    public Cosmetico() {

    }

    public float getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(float taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public void criarLoja(Scanner scanner) {
        super.criarLoja(scanner);

        System.out.print("Taxa de comercialização: ");
        this.setTaxaComercializacao(scanner.nextFloat());
    }

    @Override
    public void statusLoja() {
        super.statusLoja();
        System.out.println("Taxa de comercializacao: " + this.getTaxaComercializacao());
    }

    @Override
    public String toString() {
        return "Cosmetico\n taxa Comercializacao: " + taxaComercializacao + super.toString();
    }

}
