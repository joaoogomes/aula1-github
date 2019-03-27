package entidades;

import java.text.NumberFormat;

public class ContaObj {
	private int conta;
	private String nome;
	private double saldo;

	public ContaObj(int conta, String nome, double saldo) {
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
		System.out.println(this);
	}

	public String toString() {
		String res = "Dados  da Conta :";
		res += "\nNumero da Conta :" + this.conta;
		res += "\nNome do Cliente :" + this.nome;
		res += "\nValor Saldo Atual : ";
		res += NumberFormat.getCurrencyInstance().format(this.saldo);
		return res;
	}

	public void deposito(double vdeposito) {
		this.saldo += vdeposito;
		System.out.printf("Valor Saldo Atualizado %.2f%n", this.saldo);
	}

	public boolean saque(double vsaque) {
		double novoSaldo = this.saldo - (vsaque + 5);
		if (novoSaldo < 0) {
			System.out.println("Limite insuficiente");
			return false;
		} else {
			this.saldo = novoSaldo;
			System.out.printf("Valor Saldo Atualizado %.2f%n", this.saldo);
			return true;
		}
	}

	public void transferePara(ContaObj destino, double vTransferencia) {
		if (!this.saque(vTransferencia)) {
			System.out.println("Transferencia não efetuada");
		} else {
			destino.deposito(vTransferencia);
		}
	}

}