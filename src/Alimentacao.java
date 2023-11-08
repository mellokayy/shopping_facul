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
        // this.setEstoqueProdutos(new Produto[estoqueProdutos]);
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Cosmetico [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios
                + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + ", endereco=" + endereco + ", dataFundacao=" + dataFundacao
                + ", dataAlvara=" + dataAlvara + "]";
    }

    @Override
    public void criarLoja(Scanner scanner) {

        System.out.println("\nCriando uma loja de Alimentação");

        System.out.print("Digite o nome da Loja: ");
        scanner.nextLine();
        this.setNome(scanner.nextLine());

        System.out.print("Digite a quantidade de funcionários da Loja: ");
        this.setQuantidadeFuncionarios(scanner.nextInt());

        System.out.print("Digite o salário base dos funcionários da Loja: ");
        this.setSalarioBaseFuncionario(scanner.nextFloat());

        System.out.println("Digite o endereço da sua Loja: ");
        endereco.criarEndereco(scanner);

        System.out.print("Digite a data de criação da loja (dd/MM/aaaa): ");
        dataFundacao.criarData(scanner);

        System.out.println("Digite a quantidade máxima de produtos no estoque: ");
        // this.setEstoqueProdutos(scanner.nextInt());



    }
}
