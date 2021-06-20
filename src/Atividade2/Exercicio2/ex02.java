package AtividadeI.Exercicio2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[10];

        int i;

        Scanner into = new Scanner(System.in);

        for(i = 0; i < 10; i++){

            System.out.println("Digite um numero inteiro para o vetor 1: ");

            vet1[i] = into.nextInt();

            System.out.println("Digite um numero inteiro para o vetor 2: ");

            vet2[i] = into.nextInt();

            vet3[i] = vet1[i]*vet2[i];
        }

        for(i = 0; i < 10; i++){

            System.out.printf("Vetor1 %d x Vetor2 %d = %d", vet1[i], vet2[i], vet3[i]);

        }

    }
}
