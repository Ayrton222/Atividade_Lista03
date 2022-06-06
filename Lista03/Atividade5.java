package Lista02;

public class Atividade5 {
	
	public static void main(String[] args) {
		
		String caracter, hexa;
			System.out.println("Tabela ASCII de 0 a 127: ");
			
			for(int a=0; a <127; a++){
				
				hexa = Integer.toHexString(a);
				caracter = new Character((char)a).toString();
				System.out.println("Decimal: " + a + 
						" " +
						"Hexadecimal: " + hexa +
						" " +
						"Caractere: " + caracter);
			}
	}

}
