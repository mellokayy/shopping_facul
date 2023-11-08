public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            Data data, boolean produtosImportados, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, estoqueProdutos);
        this.setProdutosImportados(produtosImportados);
    }

    public Vestuario() {
        
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Vestuario [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios
                + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + ", endereco=" + endereco + ", dataFundacao=" + dataFundacao
                + ", produtosImportados=" + produtosImportados + "]";
    }

}
