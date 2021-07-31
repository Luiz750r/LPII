package Atividade7.Exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        ArrayList<String> agenda = new ArrayList<String>();
        Scanner into = new Scanner(System.in);

        boolean stop = false;

        while (!stop) {

            System.out.print("\nDigite uma opção / 1-cadastrar, 2-listar, 3-remover: ");

            int opcao = into.nextInt();

            if(opcao==1){

                System.out.print("Digite o nome: ");
                String nome = into.nextLine();

                System.out.print("Digite o telefone: ");
                String telefone = into.nextLine();

                agenda.add(nome+";"+telefone);

            } else if(opcao==2){

                Collections.sort(agenda);

                for (String s : agenda) {

                    String[] aux = s.split(";");

                    System.out.print("\nNome: "+aux[0] + " / Telefone: " + aux[1]);
                }
            } else if(opcao==3){

                System.out.print("\nInforme o indice: ");
                int index = into.nextInt();
                agenda.remove(agenda.get(index));

            }
        }
    }
}
