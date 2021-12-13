package br.com.generation.vetores;

public class Dadomedia {

	static double getRandomInt(double min ,double max){
		
		min = Math.ceil(min);
		max = Math.floor(max);
		return Math.floor(Math.random() * (max - min)) + min;	
	}
	
	
	public static void main(String[] args) {
	
				double media =0.0, soma = 0.0;
				double [] dados = new double[10];
				int i, count = 0 ;
				double maiorDado = 0;

				for(i = 0; i < dados.length; i++){	
					dados[i] = getRandomInt(1,7);
					if(dados[i] > maiorDado){
						maiorDado = dados[i];	
					}
					soma = soma+dados[i];
					media=soma/10;
					
					
				}
				for(i = 0; i < dados.length; i++){	
					System.out.println(dados[i]+ ", ");	
					if(maiorDado == dados[i]){
						count++;
					}
				}
				System.out.println("\nO maior dado é: " + maiorDado);
				System.out.println("\nA quantidade de vezes que caiu o mesmo valor é de: " + count);
				System.out.println("\nA media é "+ media);
				
		
	}

}
