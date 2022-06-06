package Lista02;

public class Atividade09 {
	
	public static void main(String[] args) {
		
		 int arr[] = new int[] {10,10,10,10};
	        int sum = 0;
	        int div=0;
	        for (int i = 0; i < arr.length; i++) {
	            sum= sum +arr[i];
	            div = sum/4;
	        }
	        System.out.println("A media das nota é: = "+div);
	}
}
