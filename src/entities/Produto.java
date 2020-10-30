package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotalEstoque() {
		return preco * quantidade;
		
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void saidaProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quantidade 
				+ " unidades, Total: $ " 
				+ String.format("%.2f", valorTotalEstoque());

		
	}
	
}

