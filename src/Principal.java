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
                    Loja lojaTeste = new Loja(null, 0, 0, null, 0, 0, 0);
                    lojaTeste.criarLoja(scanner);
                    System.out.println("Loja " + lojaTeste.getNome() + " criada!\n");

                    lojaTeste.status();

                    break;
                case 2:
                    System.out.println("Criando um produto");
                    Produto produtoTeste = new Produto(null, 0, 0, 0, 0);
                    produtoTeste.criarProduto(scanner);
                    produtoTeste.estaVencido(20, 10, 2023);

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
