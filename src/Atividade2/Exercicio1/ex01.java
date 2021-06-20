package AtividadeI.Exercicio1;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        int[] vet = new int[20];
        int i, par = 0;

        Scanner into = new Scanner(System.in);

        for(i=0;i<20;i++){

            System.out.println("Digite um Numero: ");

            vet[i] = into.nextInt();

            if(vet[i]%2==0){

                par++;
            }
        }

        System.out.println("Existem" +par+ " Numeros pares no Vetor");

    }
}
