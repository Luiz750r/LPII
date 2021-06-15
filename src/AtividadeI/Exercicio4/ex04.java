package AtividadeI.Exercicio4;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        int[] vet = new int[20];
        int[] vet2 = new int[20];
        int i;

        Scanner into = new Scanner(System.in);

        for(i = 0; i < 20; i++){

            System.out.println("Digite um número: ");

            vet[i] = into.nextInt();

            System.out.println("pos "+i+": "+vet[i]);
        }

        for(i = 0; i < 20; i++){

            vet2[i] = vet[19-i];
        }
        System.out.println("Vetor = " +vet2[i]);

    }
}
