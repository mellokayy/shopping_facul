import java.util.Arrays;
import java.util.Scanner;

public class Shopping {
    protected String nome;
    protected Endereco endereco;
    protected Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int lojas) {
        this.setNome(nome);
        this.setEndereco(new Endereco());
        this.setLojas(new Loja[lojas]);
    }

    public Shopping() {
        this.setEndereco(new Endereco());
        this.setLojas(new Loja[0]);
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

    public int quantidadeLojasPorTipo(String lojaTipo) {
        int quantidadeLojas = 0;

        for (Loja loja : lojas) {
            if (lojaTipo.equalsIgnoreCase("Alimentacao") && loja instanceof Alimentacao) {
                quantidadeLojas += 1;
            } else if (lojaTipo.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria) {
                quantidadeLojas += 1;
            } else if (lojaTipo.equalsIgnoreCase("Cosmetico") && loja instanceof Cosmetico) {
                quantidadeLojas += 1;
            } else if (lojaTipo.equalsIgnoreCase("Informatica") && loja instanceof Informatica) {
                quantidadeLojas += 1;
            } else if (lojaTipo.equalsIgnoreCase("Vestuario") && loja instanceof Vestuario) {
                quantidadeLojas += 1;
            }
        }

        if (quantidadeLojas > 0) {
            return quantidadeLojas;
        } else {
            return -1;
        }

    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0.0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;

                if (lojaInformatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCara = lojaInformatica;
                }
            }
        }

        return lojaMaisCara;
    }

    public void criarShopping(Scanner scanner) {
        System.out.println("Digite as informações do Shopping!");

        System.out.print("Nome: ");
        this.setNome(scanner.nextLine());

        System.out.println("Endereço: ");
        endereco.criarEndereco(scanner);

        System.out.print("Quantidade máxima de lojas: ");
        this.setLojas(new Loja[scanner.nextInt()]);
    }

    public void statusShopping() {
        System.out.println("=========================================");
        System.out.println("Informações do shopping:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco().enderecoCompleto());
        System.out.print("Lojas: ");
        if (getLojas() != null) {
            for (int i = 0; i < getLojas().length; i++) {
                if (getLojas()[i] != null) {
                    System.out.print(getLojas()[i].getNome() + ", ");
                }
            }
        }
        System.out.println("\n=========================================\n");

    }

    public void adicionaProdutoEmLoja(String lojaInsereProduto, Scanner scanner) {
       //socorro
    }

    // Verificar a possibilidade de tirar o array to string
    @Override
    public String toString() {
        return "Shopping\n nome: " + nome + "\nendereco: " + endereco + "\nlojas: " + Arrays.toString(lojas);
    }

}
