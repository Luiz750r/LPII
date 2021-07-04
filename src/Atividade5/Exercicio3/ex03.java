package Atividade5.Exercicio3;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ex03 {
    public static void main(String[] args) {
        Scanner into = new Scanner(System.in);

        String senha;
        String verificar = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";

        System.out.println("Digite sua senha: ");

        senha = into.nextLine();

        Pattern padrao = Pattern.compile(verify);

        Matcher match = padrao.matcher(senha);

        if (match.find() == true) {
            System.out.println("Padrao de senha aceito");
        } else
            System.out.println("Padrao de senha nao aceito");
    }
}
