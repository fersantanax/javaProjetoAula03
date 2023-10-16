package interfaces;

import entities.Produto;

/*
* Interface para abstração dos métodos
* de repositório de produtos
*/
public interface ProdutoRepository {
	/*
	 * Métodos abstratos
	 */
	void exportarDados(Produto produto);
}