public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            Data data, int estoqueProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, estoqueProdutos);
        this.setSeguroEletronicos(seguroEletronicos);
    }

    public Informatica() {
        
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Cosmetico [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios
                + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + ", endereco=" + endereco + ", dataFundacao=" + dataFundacao
                + ", seguroEletronicos=" + seguroEletronicos + "]";
    }

}
