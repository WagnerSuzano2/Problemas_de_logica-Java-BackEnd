package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int soma = 0;
        int count = 0;


        while(idade>=0){
            soma += idade;
            count++;
            idade = sc.nextInt();
        }
        if(count>0){
            double media = (double)soma/count;
            System.out.printf("Media: %.2f%n",media);
        }else{
            System.out.print("Inpossivel calcular");
        }

        sc.close();
    }
}
