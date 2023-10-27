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
                    //Loja lojaTeste = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, null, null);
                    
                    break;
                case 2:
                    System.out.println("Criando um objeto");

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
