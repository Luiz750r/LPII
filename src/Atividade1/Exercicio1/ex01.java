#include <stdio.h>

        int main (){

        int vet[19], contador=0;


        for(int i=0; i<20; i++){
        printf("Insira um valor inteiro: \n");
        scanf("%d", &vet[i]);
        }

        for(int j=0; j<20; j++){

        if(vet[j] %2 == 0){
        contador++;
        }
        }

        printf("valores pares %d ", count);
        }