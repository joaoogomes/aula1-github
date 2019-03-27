package aplicacao;

import java.util.Scanner;

import entidades.ContaObj;

public class Conta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre o Numero da Conta :");
		int conta = sc.nextInt();
		
		System.out.println("Entre o Nome Cliente   :");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Entre o Saldo da Conta :");
		Double saldo = sc.nextDouble();

		ContaObj conta1 = new ContaObj(conta ,nome, saldo);
		
		System.out.println("Entre o Valor Deposito  :");
		Double vdeposito = sc.nextDouble();
		conta1.deposito(vdeposito);
		
		System.out.println("Entre o Valor saque     :");
		Double vsaque = sc.nextDouble();
		conta1.saque(vsaque);
		
		System.out.println("Entre o Valor 2 saque   :");
		vsaque = sc.nextDouble();
		conta1.saque(vsaque);
		
		System.out.println("Vamos fazer uma transferencia"); 
		System.out.println("Entre o Numero da Conta Destino :");
		conta = sc.nextInt();
		
		System.out.println("Entre o Nome Cliente   :");
		sc.nextLine();
		nome = sc.nextLine();
		
		ContaObj conta2 = new ContaObj(conta, nome , 0);
		
		System.out.println("Entre o Valor da Transferencia     :");
		vsaque = sc.nextDouble();
		conta1.transferePara(conta2, vsaque);
		
		System.out.println("Entre o Valor da Transferencia     :");
		vsaque = sc.nextDouble();
		conta1.transferePara(conta2, vsaque);
		
		sc.close();

	}
}
