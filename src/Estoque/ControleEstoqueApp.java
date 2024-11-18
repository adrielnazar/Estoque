package Estoque;

import java.util.Scanner;

public class ControleEstoqueApp {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nControle de Estoque");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Atualizar Quantidade");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID do Produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(id, nome, quantidade, preco);
                    estoque.adicionarProduto(produto);
                    break;

                case 2:
                    System.out.print("ID do Produto a remover: ");
                    int idRemover = scanner.nextInt();
                    estoque.removerProduto(idRemover);
                    break;

                case 3:
                    estoque.listarProdutos();
                    break;

                case 4:
                    System.out.print("ID do Produto: ");
                    int idAtualizar = scanner.nextInt();
                    System.out.print("Nova Quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    estoque.atualizarQuantidade(idAtualizar, novaQuantidade);
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
