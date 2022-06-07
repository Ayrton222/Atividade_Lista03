package Lista02;

import java.util.Scanner;

public class Atividade12 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		  int[][]mat = new int[3][5];
		  int  i, j, cont, cont2;
		  float somapar, somaimpar;
		  float mediaLinhas,mediaColunas, total;
		  somaimpar = 0;
		  somapar = 0;
		  cont = 0;
		  cont2 = 0;
		  
		  for(i = 0; i < 3; i++){     
		    for(j = 0; j < 5; j++){
		      System.out.println("Digite um numero inteiro: ");
		      mat[i][j] = scan.nextInt();
		      
		      if (mat[i][j] % 2 == 0) {    
		         somapar = somapar + mat[i][j];
		         cont2 = cont2 + 1;      
		      }else {
		        somaimpar = somaimpar + mat[i][j];
		        cont = cont + 1;
		      }
		    }
		  }
		   mediaLinhas = somaimpar/cont;
		   mediaColunas = somapar/cont2;
		   total = mediaColunas - mediaLinhas;

//		    mediaLinhas = somaimpar/3;
//		    mediaColunas = somapar/5;
//		    total = mediaColunas - mediaLinhas;
		   System.out.println("O total da diferença das colunas pares e linhas impares são: " + total);
		}
	}


