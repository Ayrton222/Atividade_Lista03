package Lista02;

import java.util.Scanner;

public class Atividade10 {
	
	public static void main(String[] args) {
		 int n1, i;
	     double vet[] = new double[10];
	    Scanner scan = new Scanner(System.in);
	
	        for(i = 0; i < vet.length; i++){
	            System.out.println("DIGITE UM VALOR PARA A "+i+"° DO VETOR: ");
	            vet[i] = scan.nextFloat();
	        }
	
	        System.out.println("OS VALORES DIGITADOS PARA O VETOR É: \n");
	        for(i = 0; i < vet.length; i++){
	            System.out.println(String.format("%.2f", vet[i]));
	        }
	}

}
