package Atividade4.Exercicio1;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner into = new Scanner(System.in);

        System.out.println("digite uma string");
        String frase = into.nextLine();

        String[] palavras = frase.split(" ");

        for (int i = palavras.length - 1; i >= 0; i--) {
            System.out.print(palavras[i]);

        }
    }
}
