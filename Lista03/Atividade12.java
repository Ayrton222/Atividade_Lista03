package Lista02;

import java.util.Scanner;

public class Atividade12 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
	  double[][] A= new double [5][3];
	  int  i, j, cont;
	  double somapar, somaimpar;
	  double media;
	  
	  somaimpar = 0;
	  somapar = 0;
	  cont = 0;
	  
	  
	  for(i = 0; i < 5; i++){      /* percorre as linhas da Matriz */
	    for(j = 0; j < 3; j++){
	      System.out.println("\nDigite um numero inteiro: ");
	      	A[i][j] = scan.nextFloat();
	    }
	  }
	  
	  
	  for(i = 0; i < 5; i++){      /* percorre as linhas da Matriz */
	    for(j = 0; j < 3; j++){      /* percorre as colunas da Matriz */
	      if (j % 2 == 0) {     /* colunas pares */
	         somapar= somapar + A[i][j];
	         cont = cont + 1;   /* conta o número de elementos */
	      }else {
	        somaimpar = somaimpar + A[i][j];
	      }
	    }
	   }
	   media = somaimpar/cont;

	   System.out.println("\nA soma dos valores das colunas impares e " + somaimpar);
	   System.out.println("\nA media dos valores das colunas pares e " + media);

	}

}
