package main;

import controllers.ProdutoController;

public class Main {
	public static void main(String[] args) {
//criando um objeto da classe controller:
		ProdutoController produtoController = new ProdutoController();
//executando o método para cadastrar o produto
		produtoController.cadastrarProduto();
	}
}