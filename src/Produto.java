import java.util.Scanner;

public class Produto {
    protected String nome;
    protected double preco;
    protected Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setDataValidade(dataValidade);

    }

    public Produto() {
        this.dataValidade = new Data();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", dataValidade=" + dataValidade + "]";
    }

    public boolean estaVencido(Data data) {
        if (this.dataValidade.compareTo(data) > 0) {
            System.out.println("PRODUTO NÃO VENCIDO\n");
            return false;
        } else {
            System.out.println("PRODUTO VENCIDO \n");
            return true;
        }
    }

    public void criarProduto(Scanner scanner) {

        System.out.print("Digite o nome do produto: ");
        scanner.nextLine();
        this.setNome(scanner.nextLine());

        System.out.print("Digite o preço do produto: ");
        this.setPreco(scanner.nextDouble());

        System.out.print("Digite a data de validade do produto (dd/MM/aaaa): ");
        dataValidade.criarData(scanner);
    }

    public void statusProduto() {
        System.out.println("=========================================");
        System.out.println("Informações do produto criado:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preço: " + this.getPreco());
        System.out
                .println("Data de validade: " + this.getDataValidade().getDia() + "/" + this.getDataValidade().getMes()
                        + "/" + this.getDataValidade().getAno());
        System.out.println("=========================================\n");
    }

}
