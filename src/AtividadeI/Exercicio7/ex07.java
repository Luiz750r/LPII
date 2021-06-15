package AtividadeI.Exercicio7;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        int[] vet = new int[10];
        int i, n = 0;
        Scanner into = new Scanner(System.in);
        for(i = 0; i<10;i++){

            System.out.println("Digite um número: ");

            vet[i] = into.nextInt();
        }
        System.out.println("Digite um número para verificação em vetor");
        int num = into.nextInt();
        boolean test = false;
        for(i=0;i<10;i++){
            if(num==vet[i]){

                System.out.println("Encontrou "+num+" na posição "+i+" do Vetor");
                test = true;
            }
        }
        if(!test){

            System.out.println("Numero nao encontrado no Vetor");
        }

    }
}
