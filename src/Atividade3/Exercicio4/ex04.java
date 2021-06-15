package Atividade3.Exercicio4;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        String frase;
        Scanner into = new Scanner(System.in);
        int i=0,letras=0;

        System.out.println("escreva uma frase");
        frase = into.nextLine();
        for(i=0;i<frase.length();i++){
            if(frase.charAt(i)!=' ')
                letras++;
        }
        System.out.println("numero de caracteres:" +letras );
    }
}
