package aplicacao;

import java.util.Scanner;

import entidades.Quartos;

public class AlocaQuarto {

	public String nome;
	public String email;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Entre Qtd Quartos Alugados: ");
			int x = sc.nextInt();
			Quartos[] vetor = new Quartos[10];
			int i = 0;
			int numero;
			String nome;
			String email;
			for (i = 0; i < x; i++) {
				System.out.println("Entre o Quart,nome,email :");
				numero = sc.nextInt();
				nome = sc.next();
				email = sc.next();
				vetor[numero] = new Quartos(nome, email);
			}
			for (i = 0; i < 10; i++) {
				if (vetor[i] != null) {
					System.out.println("Dados do Cliente");
					System.out.println("Quarto " + i);
					System.out.println("Nome " + vetor[i].getNome());
					System.out.println("Email " + vetor[i].getEmail());
									}
			}
			System.out.println(vetor[0]);
		} finally {

			sc.close();
		}

	}

}
