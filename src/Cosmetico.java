public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            Data data, int estoqueProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, estoqueProdutos);
        this.setTaxaComercializacao(taxaComercializacao);
    }

    public Cosmetico() {
        
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios
                + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + ", endereco=" + endereco + ", dataFundacao=" + dataFundacao
                + ", taxaComercializacao=" + taxaComercializacao + "]";
    }

}
