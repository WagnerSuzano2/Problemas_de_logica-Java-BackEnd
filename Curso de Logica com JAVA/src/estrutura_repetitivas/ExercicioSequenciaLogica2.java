package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioSequenciaLogica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma=0;

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                soma++;
                if (soma > y) break;
                if (soma % x == 0) {
                    System.out.println(soma);
                } else {
                    System.out.print(soma + " ");
                }
            }
            if (soma >= y) break;
        }

        sc.close();
    }
}
