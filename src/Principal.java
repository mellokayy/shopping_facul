import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar uma loja");
            System.out.println("2. Criar um produto");
            System.out.println("3. Sair");

            System.out.print("Digite o número da opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Loja lojaTeste = new Loja(null, 0, 0, null, 1, 10, 2023);
                    // lojaTeste.criarLoja();

                    break;
                case 2:
                    System.out.println("Criando um produto");
                    Produto produtoTeste = new Produto("Sabonete", 2.5f, 10, 10, 2024);
                    Data data = new Data(27, 10, 2023);
                    produtoTeste.estaVencido(data);
                    break;

                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
