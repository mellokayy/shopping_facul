import java.util.Scanner;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private float salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataCriacao;

    public Loja(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            int dia, int mes, int ano) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setSalarioBaseFuncionario(salarioBaseFuncionario);
        this.setEndereco(endereco);
        this.setDataCriacao(dia, mes, ano);
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setSalarioBaseFuncionario(-1);
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

    public Data getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(int dia, int mes, int ano) {
        this.dataCriacao = new Data(dia, mes, ano);
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

    public void criarLoja() {
        System.out.println("Criando uma loja");
        Scanner scannerLoja = new Scanner(System.in);

        System.out.print("Digite o nome da Loja: ");
        this.setNome(scannerLoja.nextLine());

        System.out.print("Digite a quantidade de funcionários da Loja: ");
        this.setQuantidadeFuncionarios(scannerLoja.nextInt());

        System.out.print("Digite o salário base dos funcionários da Loja: ");
        this.setSalarioBaseFuncionario(scannerLoja.nextFloat());

        System.out.println("Digite o endereço da sua Loja: ");
        Endereco endereco = new Endereco(null, null, null, null, null, null, null);
        endereco.criarEndereco();

        System.out.print("Digite a data de criação da loja (dd/MM/aaaa): ");

        // this.setDataCriacao();

        // // ARRUMAR - NÃO FUNCIONA
        // System.out.print("Digite a data de criação da loja (dd/MM/aaaa): ");
        // String data = scannerLoja.nextLine();
        // String[] dataSeparada = data.split("/");

        // this.setDataCriacao(Integer.parseInt(dataSeparada[0]),
        // Integer.parseInt(dataSeparada[1]),
        // Integer.parseInt(dataSeparada[2]));

        scannerLoja.close();

    }

}