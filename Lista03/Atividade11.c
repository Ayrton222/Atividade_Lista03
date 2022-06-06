#include<stdio.h>
int main()
{
 int valor[10], i, refe, conta=0, menores=0, iguais=0;

 for(i=0; i<10; i++)
 {
 printf("Qual o %do valor?\n ", i+1);
 scanf("%d", &valor[i]);
 }
 printf("\nEntre com o valor de referencia:\n");
 scanf("%d", &refe);

 for(i=0; i<10; i++){
 
 if(valor[i] ==refe)
 iguais++;
}
 if(iguais>0)
 printf("\nExistem %d valores iguais ao da referencia\n", iguais);
 else
 printf("\nNao existem valores iguais ao da referencia\n");

 getch(); 
}
