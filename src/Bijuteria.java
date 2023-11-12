import java.util.Scanner;

public class Bijuteria extends Loja {
    private float metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco,
            Data data, int estoqueProdutos, float metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, estoqueProdutos);
        this.setMetaVendas(metaVendas);
    }

    public Bijuteria() {
        this.setEndereco(new Endereco());
        this.setDataFundacao(new Data());
    }

    public float getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(float metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public void criarLoja(Scanner scanner) {
        super.criarLoja(scanner);
        
        System.out.print("Meta de vendas: ");
        this.setMetaVendas(scanner.nextFloat());
    }

    @Override
    public void statusLoja() {
        super.statusLoja();
        System.out.println("Meta de vendas: " + this.getMetaVendas());
    }

    @Override
    public String toString() {
        return "Bijuteria\n meta Vendas: " + metaVendas + super.toString();
    }

}
