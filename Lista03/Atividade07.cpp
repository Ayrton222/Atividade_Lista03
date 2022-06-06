#include <stdio.h>  

int main(){

int maior, menor;
int i;
int a;
int valor[10];
maior=valor[0];

for(a =0; a < 10; a++){
	printf("Digite o %i valor: ", a);
	scanf("%i",&valor[a]);
}

for(i=1;i<=9;i++){
	if(valor[i]>maior){
	
		maior = valor[i];
		}
	}
for(i=1;i<=9;i++){
	if(valor[i]<menor){
		
		menor = valor[i];
		}
	}
	printf("Maior valor:  %d\n",maior);
	printf("Menor valor:  %d\n",menor);
}
