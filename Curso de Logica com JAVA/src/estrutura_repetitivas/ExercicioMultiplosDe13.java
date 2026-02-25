package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioMultiplosDe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maior,menor;
        int soma =0;

        if (x > y) {
            maior = x;
            menor = y;
        }else {
            maior = y;
            menor = x;
        }
        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0) {
                soma = i+soma;
            }
        }
        System.out.println(soma);
        sc.close();
    }
}
