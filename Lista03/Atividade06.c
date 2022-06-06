#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	float preco;
	
	printf("Entre com o preco: ");
	scanf("%f",&preco);
	
	if(preco < 100){
		
		preco = preco * 1.1;
	}else{
	preco = preco * 1.2;
	}
	
	printf("Preco com inflacao: %.2f", preco);
}
