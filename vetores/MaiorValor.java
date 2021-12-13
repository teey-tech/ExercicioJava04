package br.com.generation.vetores;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[] valores = new double[5];
		
		double maior = 0.0, valor = 0.0;
		
		int i;
		
		System.out.println("Digite os 5 valores: ");
		for(i = 0; i < valores.length; i++) {
			valores[i] = entrada.nextDouble();
			if(valores[i] > maior) {
				maior = valores[i];
			}
		}
		System.out.print("Os valores digitados são ");
		for(i = 0; i < valores.length; i++) {
			System.out.print(valores[i]+ " | ");
		}
		System.out.println("O maior número é: "+ maior);

	}

}
