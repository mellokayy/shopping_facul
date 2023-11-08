import java.util.Arrays;

public class Shopping {
    protected String nome;
    protected Endereco endereco;
    protected Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int lojas) {
        this.setNome(nome);
        this.setEndereco(new Endereco());
        this.setLojas(new Loja[lojas]);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja lojas) {
        for (int i = 0; i < getLojas().length; i++) {
            if (this.getLojas()[i] == null) {
                this.getLojas()[i] = lojas;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String lojas) {
        for (int i = 0; i < getLojas().length; i++) {
            if (this.getLojas()[i] != null && getLojas()[i].getNome().equals(lojas)) {
                this.getLojas()[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;

        for (Loja loja : lojas) {
            if (loja.getTipo().equalsIgnoreCase(tipo)) {
                count++;
            }
        }

        if (count > 0) {
            return count;
        } else {
            return -1;
        }
    }

    public Loja lojaSeguroMaisCaro() {
        Loja lojaMaisCara = null;
        double valorSeguroMaisCaro = 0.0;

        for (Loja loja : lojas) { // Substitua "listaDeLojas" pelo nome da sua lista de lojas
            if (loja.getTipo().equalsIgnoreCase("Informatica")) {
                double valorSeguro = loja.getValorSeguroEletronicos();
                if (valorSeguro > valorSeguroMaisCaro) {
                    valorSeguroMaisCaro = valorSeguro;
                    lojaMaisCara = loja;
                }
            }
        }

        return lojaMaisCara;
    }

    @Override
    public String toString() {
        return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
    }

}
