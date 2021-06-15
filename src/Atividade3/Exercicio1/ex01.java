package Atividade3.Exercicio1;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner into = new Scanner(System.in);
        System.out.println("digite um nome: ");
        String nome = into.nextLine();
        System.out.println("Numero de caracteres da string = "+nome.length()+" em maiusculo" +nome.toUpperCase());

        int tot_vogais=0,i,j;
        char vogais[]= {'a','e','i','o','u'};


         for(i=0;i<nome.length();i++){
             char v=nome.toLowerCase().charAt(i);
             for(j=0;j<vogais.length;j++){
                  if(vogais[j] == v){
                      tot_vogais = tot_vogais + 1;
             }
             }
         }
        System.out.println("o total de vogais é: "+tot_vogais);

         if(nome.toUpperCase().startsWith("UNI")) {
            System.out.println("inicia com UNI\n");
        }else{
            System.out.println("nao inicia com a palavra UNI\n");
        }

        if(nome.toUpperCase().endsWith("RIO")){
            System.out.println("termina com a palavra RIO\n");
        }else{
            System.out.println("nao termina com a palavra RIO\n");
        }
    }
}
