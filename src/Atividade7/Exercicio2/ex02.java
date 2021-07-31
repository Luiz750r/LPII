package Atividade7.Exercicio2;

import java.util.ArrayList;

public class ex02 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> remover = new ArrayList<Integer>();

        num.add(4);
        num.add(6);
        num.add(4);
        num.add(2);
        num.add(7);
        num.add(6);
        num.add(7);
        num.add(9);
        num.add(5);
        num.add(3);

        for(int i : num){
            if((i%2)==0){
                System.out.println(i);
                remover.add(i);
            }
        }
        for (Integer i : remover) {
            num.remove(i);
        }

        for(int i : num){
            System.out.print("Numero: " + i);
        }

    }
}
