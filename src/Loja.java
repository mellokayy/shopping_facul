import java.util.Scanner;

public class Loja {
    protected String nome;
    protected int quantidadeFuncionarios;
    protected float salarioBaseFuncionario;
    protected Endereco endereco;
    protected Data dataFundacao;
    protected Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            Data data, int estoqueProdutos) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setSalarioBaseFuncionario(salarioBaseFuncionario);
        this.setEndereco(endereco);
        this.setDataFundacao(data);
        this.setEndereco(new Endereco());
        this.setDataFundacao(new Data());
        this.setEstoqueProdutos(new Produto[estoqueProdutos]);
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data data, int estoqueProdutos) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setSalarioBaseFuncionario(-1);
        this.setEndereco(new Endereco());
        this.setDataFundacao(new Data());
        this.setEstoqueProdutos(new Produto[estoqueProdutos]);
    }

    public Loja() {
        this.setEndereco(new Endereco());
        this.setDataFundacao(new Data());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public float getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(float salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data data) {
        this.dataFundacao = data;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public float gastosComSalario() {
        float valorGastoSalario = 0;
        if (this.getSalarioBaseFuncionario() == -1) {
            return -1;
        } else {
            valorGastoSalario = this.getSalarioBaseFuncionario() * this.getQuantidadeFuncionarios();
            return valorGastoSalario;
        }
    }

    public char tamanhoDaLoja() {
        if (this.getQuantidadeFuncionarios() < 10) {
            return 'P';
        } else if (this.getQuantidadeFuncionarios() >= 10 && this.getQuantidadeFuncionarios() <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public void criarLoja(Scanner scanner) {

        System.out.println("Criando uma loja");

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

    }

    public void statusLoja() {
        System.out.println("=========================================");
        System.out.println("Informações da loja criada:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Quantidade de funcionários: " + this.getQuantidadeFuncionarios());
        System.out.println("Salário base " + this.getSalarioBaseFuncionario());
        System.out.println("Endereço: " + this.getEndereco().enderecoCompleto());
        System.out.println("Data de criação: " + this.getDataFundacao().getDia() + "/" + this.getDataFundacao().getMes()
                + "/" + this.getDataFundacao().getAno());
        System.out.println("=========================================\n");

    }

    public void imprimeProdutos() {
        System.out.println(getEstoqueProdutos());
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < getEstoqueProdutos().length; i++) {
            if (this.getEstoqueProdutos()[i] == null) {
                this.getEstoqueProdutos()[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < getEstoqueProdutos().length; i++) {
            if (this.getEstoqueProdutos()[i] != null && getEstoqueProdutos()[i].getNome().equals(nomeProduto)) {
                this.getEstoqueProdutos()[i] = null;
                return true;
            }
        }
        return false;
    }

    public String getTipo() {
        return null;
    }

    public double getValorSeguroEletronicos() {
        return 0;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + ", endereco=" + endereco + ", dataFundacao=" + dataFundacao + "]";
    }

}