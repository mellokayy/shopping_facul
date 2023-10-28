import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    private String nome;
    private float preco;
    private Data dataValidade;

    public Produto(String nome, float preco, int dia, int mes, int ano) {
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
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

    // criar aqui
    public boolean estaVencido(Data data) throws ParseException {

        String dataProduto = this.dataValidade.getDia() + "/" + this.dataValidade.getMes() + "/"
                + this.dataValidade.getAno();

        String dataEntrada = data.getDia() + "/" + data.getMes() + "/" + data.getAno();

        Date start = new SimpleDateFormat("dd/MM/yyyy")
                .parse(dataProduto.toString());
        Date end = new SimpleDateFormat("dd/MM/yyyy")
                .parse(dataEntrada.toString());

        if (start.compareTo(end) > 0) {
            System.out.println("Produto ainda não venceu \n");
            return false;

        } else{
            System.out.println("Produto venceu \n");
            return true;
        }
            
        
    }
}
