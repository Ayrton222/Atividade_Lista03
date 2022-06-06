package Lista02;

import java.util.Arrays;
import java.util.Random;

public class Atividade08 {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
		     numeros[i] = new Random().nextInt(60) + 1;
		     }
		
		Arrays.sort(numeros); 
		System.out.println(Arrays.toString(numeros));
	}
}
