package br.com.generation.matriz;

import java.util.Random;

public class SomaMatriz {

	public static void main(String[] args) {
		
		Random random= new Random();
		int n1[][]=new int[4][6], n2[][]=new int[4][6], m1[][]= new int[4][6], m2[][]=new int[4][6];
        
		
	    for(int l=0; l<4; l++){
	        for(int c=0; c<6; c++){
	            n1[l][c]=random.nextInt(100);
	        }
	    }
	    for(int i=0; i<4; i++){
	        for(int j=0; j<6; j++){
	            n2[i][j]=random.nextInt(100);
	        }
	
	    }
	    System.out.println("a soma é:");
	    for(int a = 0; a < 4; a++) { 
	        for(int b = 0; b < 6; b++) {
	        	m1[a][b] = n1[a][b] + n2[a][b];
	        	System.out.print(m1[a][b]+"| ");
            }
	    }
	    System.out.println();
	    System.out.println("a subtração é: ");
	    for(int a2 = 0; a2 < 4; a2++) { 
	        for(int b2 = 0; b2 < 6; b2++) {
	        	m2[a2][b2] = n1[a2][b2] - n2[a2][b2];
	        	System.out.print(m2[a2][b2]+"| ");
            }
	    }

	}

}


