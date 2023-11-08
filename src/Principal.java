import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            Shopping shopping = new Shopping("Teste Shopping", new Endereco(), 10);

            // System.out.println("Escolha uma opção:");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");

            System.out.print("Digite o número da opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    do {
                        System.out.println("\n(1) Alimentação");
                        System.out.println("(2) Bijuteria");
                        System.out.println("(3) Cosmetico");
                        System.out.println("(4) Informatica");
                        System.out.println("(5) Vestuario");
                        System.out.println("(6) Voltar");
                        System.out.print("Selecione a categoria desejada:");

                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                Alimentacao a1 = new Alimentacao();
                                a1.criarLoja(scanner);
                                shopping.insereLoja(a1);

                                System.out.println("Loja " + a1.getNome() + " criada!\n");

                                a1.statusLoja();
                                
                                break;
                            case 2:
                                Bijuteria b1 = new Bijuteria();
                                b1.criarLoja(scanner);
                                System.out.println("Loja " + b1.getNome() + " criada!\n");

                                b1.statusLoja();
                                break;
                            case 3:
                                Cosmetico c1 = new Cosmetico();
                                c1.criarLoja(scanner);
                                System.out.println("Loja " + c1.getNome() + " criada!\n");

                                c1.statusLoja();
                                break;
                            case 4:
                                Informatica i1 = new Informatica();
                                i1.criarLoja(scanner);
                                System.out.println("Loja " + i1.getNome() + " criada!\n");

                                i1.statusLoja();
                                break;
                            case 5:
                                Vestuario v1 = new Vestuario();
                                v1.criarLoja(scanner);
                                System.out.println("Loja " + v1.getNome() + " criada!\n");

                                v1.statusLoja();
                                break;

                            case 6:
                                System.out.println("Voltando...");
                                break;

                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    } while (opcao != 6);
                    shopping.toString();

                    break;
                case 2:
                    System.out.println("Criando um produto");
                    Produto produtoTeste = new Produto();
                    produtoTeste.criarProduto(scanner);

                    // produtoTeste.statusProduto();
                    produtoTeste.estaVencido(new Data(10, 11, 2023));

                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
