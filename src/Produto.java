import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, int dia, int mes, int ano) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setDataValidade(dia, mes, ano);

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

    public void setDataValidade(int dia, int mes, int ano) {
        this.dataValidade = new Data(dia, mes, ano);
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + "]";
    }

    public boolean estaVencido(int dia, int mes, int ano) {
        if (this.dataValidade.compareTo(dia, mes, ano) > 0) {
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

        System.out.print("Digite o valor do produto: ");
        this.setPreco(scanner.nextDouble());

        System.out.print("Digite a data de validade do produto (dd/MM/aaaa): ");
        String data = scanner.next();
        String[] dataSeparada = data.split("/");
        this.setDataValidade(Integer.parseInt(dataSeparada[0]), Integer.parseInt(dataSeparada[1]),
                Integer.parseInt(dataSeparada[2]));
    }

}
