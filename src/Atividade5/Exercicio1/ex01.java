package Atividade5.Exercicio1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ex01 {
    public static void main(String[] args) {

        Scanner into = new Scanner(System.in);

        String num;
        String verify="(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})";

        System.out.println("Digite um numero de telefone:  ");
        num = into.nextLine();

        Pattern padrao = Pattern.compile(verify);
        Matcher match = padrao.matcher(num);

        if(match.find()==true){
            System.out.println("Esta nos padroes");
        } else
            System.out.println("Nao identificado");


    }
}
