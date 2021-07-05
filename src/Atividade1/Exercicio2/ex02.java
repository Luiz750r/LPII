#include <stdio.h>

        int main (){

        int vet[10], vet2[10], vet3[10];

        int i=0;

        for(i=0; i<10; i++){

        printf("digite um numero V1: ");
        scanf("%d", &vet[i]);
        }

        for(i=0;i<10;i++){

        printf("digite um numero V1: ");
        scanf("%d", &vet2[i]);
        }

        for(i=0;i<10;i++){
        vet3[i]=vet[i] * vet2[i];
        }

        for(i=0;i<10;i++){
        printf("vetor resultante: %d \n"vet3[i]);
        }
        }
