package Atividade5.Exercicio2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ex02 {
    public static void main(String[] args) {

        Scanner into = new Scanner(System.in);

        String url;
        String verify = "^(((https?|ftp)://)?([\\w\\-.])+(\\.)([\\w]){2,4}([\\w/+=%&_.~?\\-]*))*$";

        System.out.println("Digite a URL: ");

        url = ler.nextLine();

        Pattern padrao = Pattern.compile(verify);

        Matcher match = padrao.matcher(url);

        if (match.find() == true) {
            System.out.println("***URL valida***");
        } else
            System.out.println("***URL invalida***");
    }
}
