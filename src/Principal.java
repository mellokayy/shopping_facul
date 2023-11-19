import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("=========================================");
        System.out.println("Gerenciador de Shopping");
        System.out.println("=========================================\n");
        Shopping shopping = new Shopping();
        shopping.criarShopping(scanner);
        System.out.println("\n=========================================");

        do {
            System.out.println("\n(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) outras opções de gerenciamento");
            System.out.println("(4) sair");

            System.out.print("Digite o número da opção desejada: ");
            opcao = scanner.nextInt();

            System.out.println("\n=========================================");

            switch (opcao) {
                case 1:
                    int opcaoLoja;
                    do {
                        System.out.println("\n(1) alimentacao");
                        System.out.println("(2) bijuteria");
                        System.out.println("(3) cosmetico");
                        System.out.println("(4) informatica");
                        System.out.println("(5) vestuario");
                        System.out.println("(6) voltar");
                        System.out.print("selecione a categoria desejada: ");
                        opcaoLoja = scanner.nextInt();

                        Loja loja = null;

                        switch (opcaoLoja) {
                            case 1:
                                loja = new Alimentacao();
                                break;
                            case 2:
                                loja = new Bijuteria();
                                break;
                            case 3:
                                loja = new Cosmetico();
                                break;
                            case 4:
                                loja = new Informatica();
                                break;
                            case 5:
                                loja = new Vestuario();
                                break;
                            case 6:
                                System.out.println("Voltando...");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }

                        if (loja != null) {
                            loja.criarLoja(scanner);
                            if (shopping.insereLoja(loja)) {
                                System.out.println("Loja " + loja.getNome() + " criada!\n");
                                loja.statusLoja();
                            } else {
                                System.out.println("Loja não adicionada.");
                            }

                        }
                    } while (opcaoLoja != 6);
                    break;

                case 2:
                    System.out.print("Digite o nome da loja que deseja inserir o produto: ");
                    String lojaInsereProduto = scanner.nextLine();
                    lojaInsereProduto = scanner.nextLine();
                    shopping.adicionaProdutoEmLoja(lojaInsereProduto, scanner);

                    break;
                case 3:
                    int opcaoGerenciamento;
                    do {
                        System.out.println("\n(1) quantidade de lojas criadas");
                        System.out.println("(2) remover loja");
                        System.out.println("(3) loja seguro mais caro (informática)");
                        System.out.println("(4) voltar");
                        System.out.print("Selecione a categoria desejada: ");
                        opcaoGerenciamento = scanner.nextInt();

                        switch (opcaoGerenciamento) {
                            case 1:
                                scanner.nextLine();
                                System.out.print("Digite o nome do tipo de loja:");
                                String lojaTipo = scanner.nextLine();
                                int quantidadeLojas = shopping.quantidadeLojasPorTipo(lojaTipo);

                                if (quantidadeLojas > 0) {
                                    System.out
                                            .println("A quantidade de lojas do tipo selecionado é: " + quantidadeLojas);
                                } else {
                                    System.out.println("Não existem lojas do tipo selecionado.");
                                }

                                break;

                            case 2:
                                scanner.nextLine();
                                System.out.print("Digite o nome da loja que deseja remover:");
                                String lojaNome = scanner.nextLine();
                                boolean lojaRemovida = shopping.removeLoja(lojaNome);

                                if (lojaRemovida) {
                                    System.out.println("A loja foi removida com sucesso!");
                                } else {
                                    System.out.println("A loja não foi removida: Nome não encontrado!");
                                }

                            case 3:
                                if (shopping.quantidadeLojasPorTipo("Informatica") > 0) {
                                    System.out.println("A loja que possui o seguro mais caro é: ");
                                    shopping.lojaSeguroMaisCaro().statusLoja();

                                } else {
                                    System.out.println("Não existem lojas desse tipo!");
                                }

                            case 4:
                                System.out.println("Voltando...");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    } while (opcaoGerenciamento != 4);

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 4);

        scanner.close();

        shopping.statusShopping();
    }
}
