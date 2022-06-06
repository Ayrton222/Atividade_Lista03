package Lista02;

import java.util.Scanner;

public class Ativdade01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int metros;
		
		System.out.println("Informe a medida em metros");
		metros = scan.nextInt();
		
		//Converter para decimetros
		 
		 int decimetros;
		 decimetros = metros * 10;
		 System.out.println("A medida em decimetros é: " + decimetros);
		
		//Convert metros em centimetros
		
		int centimetros;
		centimetros = metros * 100;
		System.out.println("A medida em centimetros é: " + centimetros);
	
		//Converter em milimetros
	 
		int milimetros;
		milimetros = metros * 1000;
		System.out.println("A medida em milimetros é: " + milimetros);
	 
	
	}

}
