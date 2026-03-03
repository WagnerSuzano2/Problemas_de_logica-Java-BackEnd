package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioPUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 1; j <= 4; j++) {
                soma++;
                if (soma % 4 == 0) {
                    System.out.println("PUM");
                } else {
                    System.out.print(soma + " ");
                }
            }
        }

        sc.close();
    }
}
