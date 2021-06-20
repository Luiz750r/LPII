package Atividade4.Exercicio2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner into = new Scanner(System.in);

        System.out.println("digite uma string");
        String frase = into.nextLine();

        StringBuilder palavrasBuilder = new StringBuilder(frase.length());

        String palavrasString = "";
        String[] palavrasVetor = frase.split(" ");

        for (int i = palavrasVetor.length - 1; i >= 0; i--) {
            palavrasBuilder.append(palavrasVetor[i]).append(' ');
            palavrasString += palavrasVetor[i] + ' ';
        }

        System.out.println("" + palavrasBuilder.toString());

    }
}
