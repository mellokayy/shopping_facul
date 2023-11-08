public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            Data data, int estoqueProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, estoqueProdutos);
        this.setMetaVendas(metaVendas);
    }

    public Bijuteria() {
        this.setEndereco(new Endereco());
        this.setDataFundacao(new Data());
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Cosmetico [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios
                + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + ", endereco=" + endereco + ", dataFundacao=" + dataFundacao
                + ", metaVendas=" + metaVendas + "]";
    }

}
