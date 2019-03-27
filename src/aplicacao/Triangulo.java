package aplicacao;

import java.util.Locale;

import java.util.Scanner;

import entidades.TrianguloObj;

public class Triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xa,xb,xc;
		System.out.println("Entre os Tres Lados do primeiro Triangulo : ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		TrianguloObj x = new TrianguloObj(xa,xb,xc);
		double area1=x.CalculaArea();
		System.out.println("A area do Primeiro Tringulo é " + area1);
		
		System.out.println("Entre os Tres Lados do Segundo Triangulo : ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		TrianguloObj y = new TrianguloObj(xa,xb,xc);
		double area2 = y.CalculaArea();
		
		System.out.println("A area do Segundo Tringulo é " + area2);
	
		if (area1>area2) {
			System.out.println("Maior Area e do Triangulo 1");}
		else {
			System.out.println("Maior Area e do Triangulo 2");}
		
		System.out.println("Fim do Programa");
		System.out.println();
		
		sc.close();
		}
}

