package Lista02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Atividade02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Converter decimal para hexa
		
		int decimal;
		System.out.println("Entre com um numero decimal: ");
		decimal = scan.nextInt();
		System.out.print(Integer.toHexString( 0x10 | decimal).substring(1).toUpperCase());
		
		//Converter para octal
	
		System.out.println("\nEntra com o numero");
		int numero = scan.nextInt();
		//Para armazenar uma boa quantidade de caracter
		StringBuffer buf = new StringBuffer();
		
		while(numero !=0){
			int digit = numero % 8;
			buf.append(digit)	;
			numero = numero/8;
		}
		buf.reverse();
		System.out.println(buf);
		
		
		
		
	}
	

}
