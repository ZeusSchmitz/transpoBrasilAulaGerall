package br.com.cursojava.aula002;

import java.util.Scanner;

public class ResultadoMedia {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota");
		nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota");
		nota3 = Double.parseDouble(teclado.nextLine());
		media = ((nota1 + nota2 + nota3)/3);
		if(media<7)
			System.out.println("Reprovado");
		else
			System.out.println("Aprovado");
		
		teclado.close();
	}

}
