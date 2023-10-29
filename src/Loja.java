import java.util.Scanner;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private float salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            int dia, int mes, int ano) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setSalarioBaseFuncionario(salarioBaseFuncionario);
        this.setEndereco(endereco);
        this.setDataFundacao(dia, mes, ano);
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setSalarioBaseFuncionario(-1);
    }

    public Loja() {
        this.endereco = new Endereco();
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

    public void setDataFundacao(int dia, int mes, int ano) {
        this.dataFundacao = new Data(dia, mes, ano);
    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + "]";
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
        String data = scanner.next();
        String[] dataSeparada = data.split("/");
        this.setDataFundacao(Integer.parseInt(dataSeparada[0]), Integer.parseInt(dataSeparada[1]),
                Integer.parseInt(dataSeparada[2]));

    }

    public void status() {
        System.out.println("=========================================");
        System.out.println("Informações da loja criada:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Quantidade de funcionários: " + this.getQuantidadeFuncionarios());
        System.out.println("Salário base " + this.getSalarioBaseFuncionario());
        System.out.println("Endereço: " + endereco.enderecoCompleto());
        System.out.println("Data de criação: " + this.getDataFundacao().getDia() + "/" + this.getDataFundacao().getMes()
                + "/" + this.getDataFundacao().getAno()); // arrumar
        System.out.println("=========================================\n");

    }

}