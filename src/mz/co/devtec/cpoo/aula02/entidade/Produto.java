package mz.co.devtec.cpoo.aula02.entidade;

public class Produto {
	
	public String codigo, designacao;
	public double quantidadeEmStock, precoDeCompra, precoVenda;
	
	
	public void adicionarProdutos(double quantidadePorAdicionar) {
		
		quantidadeEmStock +=quantidadePorAdicionar;
	}
	
	public void removerProdutos(double quantidadePorRemover) {
		
		quantidadeEmStock -=quantidadePorRemover;
	}
	
	public double totalEquivalenteNoStock() {
		
		return precoVenda * quantidadeEmStock;
	}
	
	
}
