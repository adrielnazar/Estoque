package Estoque;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    // Adicionar produto ao estoque
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    // Remover produto pelo ID
    public void removerProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(produto);
                System.out.println("Produto removido: " + produto.getNome());
                return;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado.");
    }

    // Listar todos os produtos no estoque
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    // Atualizar quantidade de um produto
    public void atualizarQuantidade(int id, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade do produto " + produto.getNome() + " atualizada para " + novaQuantidade);
                return;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado.");
    }
}
