package AtividadeI.Exercicio5;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        int[] vetLOT = new int[6];
        int[][] vet2 = new int[5][8];

        int i,j,count = 0;

        Scanner into = new Scanner(System.in);

        for (i=0;i<6;i++){

            System.out.printf("digite o numero da loteria: ");

            vetLOT[i] = into.nextInt();
        }


        for(i=0;i<6;i++){
            for(j=0;j<6;j++){

                System.out.printf("digite um valor da aposta: ");

                vet2[i][j] = into.nextInt();

                if(vetLOT[i] == vet2[i][j]){
                    count++;
                }

            }

        }
        for(i=0;i<6;i++){

            System.out.printf("%d - ", vetLOT[i]);
        }

        System.out.println("Vencedor: " +count);

    }
}
