package br.com.generation.matriz;

import java.util.Scanner;

public class PreencherMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] matriz =new double[3][3];
		double soma = 0.0, somaDiagonal = 0.0;
				
		System.out.print("Digite os Valores da matriz: \n");
		
		for(int l = 0; l < matriz.length; l++) { //linhas
			
			for(int c = 0; c < matriz.length; c++) { //colunas
				matriz[l][c] = entrada.nextDouble();
				soma = soma + matriz[l][c];
				somaDiagonal = matriz[0][0]+matriz[1][1]+matriz[2][2];
			
			}
			System.out.print("\n");
		}

		System.out.print("A soma das matrizes é igual a: " + soma);
		System.out.print("\nSoma no diagonal: " + somaDiagonal);

	}

}
