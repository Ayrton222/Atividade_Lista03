package Lista02;

import java.util.Scanner;

public class Atividade03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Soma de dois numeros
		
		int num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();
		
		int soma;
		
		soma = num1 + num2;
		
		System.out.println("A soma de: " + num1 + " + " + num2 +  " é:" + " = " + soma);
		
		//Quadrado/produto do numero
		
		int produto;
		
		produto = num1 * (num2 * num2);
		
		System.out.println("O produto pelo do primeiro numero e o quadrado do segundo numero é: \n" + produto);
		
		//Quadrado do primeiro numero
		
		int quadrado;
		
		quadrado = num1 * num1;
		
		System.out.println("O Quadrado do primeiro numero é: " + quadrado);
		
		//Raiz e quadrado
		
		int quadrado2;
		quadrado2 = num2 * num2;
		int resultado;
		resultado = quadrado + quadrado2;
	
		System.out.println("O resultado da soma dos quadrados é: " + resultado);
		System.out.println("O resultado da raiz quadrada da soma dos quadrados é: " + Math.sqrt(resultado));
		
		//Seno
		
		System.out.println(" A seno da diferença do primeiro numero pelo segundo é: " + Math.sin(num1 - num2));

		//Modulo 
		
		System.out.println("O modulo do primeiro numero é: " + Math.abs(num1));
	}

}
