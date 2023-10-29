import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // System.out.println("Escolha uma opção:");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");

            System.out.print("Digite o número da opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Loja lojaTeste = new Loja();

                    lojaTeste.criarLoja(scanner);
                    System.out.println("Loja " + lojaTeste.getNome() + " criada!\n");
                    System.out.println(lojaTeste.getEndereco());
                    System.out.println(lojaTeste.getDataFundacao());
                    lojaTeste.statusLoja();

                    break;
                case 2:
                    System.out.println("Criando um produto");
                    Produto produtoTeste = new Produto();
                    produtoTeste.criarProduto(scanner);

                    // produtoTeste.statusProduto();
                    produtoTeste.estaVencido(new Data(10, 11, 2023));

                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
