public class Produto {
    private String nome;
    private float preco;
    private Data dataValidade;

    public Produto(String nome, float preco, Data dataValidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setDataValidade(dataValidade);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
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
        return "Produto [nome=" + nome + ", preco=" + preco + "]";
    }

    public boolean estaVencido(Data data) {
        return true;
    }
}
