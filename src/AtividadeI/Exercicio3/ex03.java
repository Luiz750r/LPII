package AtividadeI.Exercicio3;

import java.util.Scanner;


public class ex03 {
    public static void main(String[] args) {

        int[] vet = new int[10];

        int i, menor = 10000000, pos = 0;

        Scanner into = new Scanner(System.in);

        for(i = 0; i < 10; i++){

            System.out.println("Digite um numero inteiro: ");

            vet[i] = into.nextInt();

            if(vet[i] < menor){

                menor = vet[i];
                pos = i;
            }
        }
        System.out.println("O menor elemento do vetor é "+ menor + " e sua posição eh: " + pos);

    }
}
