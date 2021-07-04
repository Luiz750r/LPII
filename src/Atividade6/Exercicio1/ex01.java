package Atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner into = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int i = 0, c = 0;
        while (true) {

            System.out.print("Digite um nome:  ");

            String nome = into.nextLine();

            if (nome.equals("")) {
                break;
            } else {
                lista.add(nome);
                c = c + 1;
            }
            for (i = 0; i < c; i++) {
                System.out.println("Nome: " + lista +);
            }
        }
    }
}