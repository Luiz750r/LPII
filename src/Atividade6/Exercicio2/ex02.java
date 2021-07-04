package Atividade6.Exercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class ex02 {
    public static void main(String[] args) {

        ArrayList<String> nomeslist = new ArrayList<String>();

        nomeslist.add("carlos");
        nomeslist.add("charles");
        nomeslist.add("maria");
        nomeslist.add("paula");
        nomeslist.add("fernando");
        nomeslist.add("pedro");
        nomeslist.add("junior");
        nomeslist.add("eduardo");
        nomeslist.add("douglas");
        nomeslist.add("andre");

        Collections.sort(nomeslist);

        int i;

        for (i=0;i<nomeslist.size();i++) {
            System.out.print("Nome"+i+": " +nomeslist.get(i));
        }

    }
}

