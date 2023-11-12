import java.util.Scanner;

public class Informatica extends Loja {
    private float seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            Data data, int estoqueProdutos, float seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, estoqueProdutos);
        this.setSeguroEletronicos(seguroEletronicos);
    }

    public Informatica() {

    }

    public float getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(float seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public void criarLoja(Scanner scanner) {
        super.criarLoja(scanner);

        System.out.print("Valor do seguro de eletronicos: ");
        this.setSeguroEletronicos(scanner.nextFloat());
    }

    @Override
    public void statusLoja() {
        super.statusLoja();
        System.out.println("Valor do seguro: " + this.getSeguroEletronicos());
    }

    @Override
    public String toString() {
        return "Informatica\n seguro Eletronicos: " + seguroEletronicos + super.toString();
    }

}
