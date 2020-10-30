package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();
		System.out.println("Enter Dados Produto: ");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no Estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println();
		System.out.println("Dados Produto: " + produto);

		System.out.println();
		System.out.println("Número de Produtos adicionado no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);

		System.out.println();
		System.out.println("Atualizar dados: " + produto);

		System.out.println();
		System.out.println("Número de Produtos saindo do estoque: ");
		quantidade = sc.nextInt();
		produto.saidaProdutos(quantidade);

		System.out.println();
		System.out.println("Atualizar dados: " + produto);

		sc.close();
	}

}
