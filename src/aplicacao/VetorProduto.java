package aplicacao;

import java.util.Scanner;

public class VetorProduto {
	public String nome[];
	public int quantidade[];

	public static void main(String[] args) {
		VetorProduto tabela = new VetorProduto();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Entre Quantidade de Produtos : ");
			int x = sc.nextInt();
			tabela.nome = new String[x];
			tabela.quantidade = new int[x];
			int i = 0;
			for (i = 0; i < x; i++) {
				System.out.println("Entre o nome do Produto :");

				tabela.nome[i] = sc.nextLine();
				tabela.nome[i] = sc.nextLine();

				System.out.println("Entre a qtd do Produto :");

				tabela.quantidade[i] = sc.nextInt();
			}
		} finally {
			sc.close();
		}
		
	}

}
