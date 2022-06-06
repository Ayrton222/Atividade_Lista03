package Lista02;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();
		
		if(num1<num2){
			System.out.println("O primeiro valor é menor do que o segundo valor \n");
			System.out.println("Ordem crescente: ");
			for(int i=num1; i<num2; i++){
				System.out.print(" "+ i);
			}
	
			System.out.println("\nOrdem decrescente:");
			for(int i=num2; i >num1; i--){
				System.out.print(" " + i);
			}
		}else if(num1 == num2){
			System.out.println("Os valores sao iguais!");
		}
	}
}
