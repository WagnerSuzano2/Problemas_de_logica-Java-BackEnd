package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioSequenciaLogica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= 2; j++) {
                    int quadrado = i * i;
                    int cubo = i * i * i;
                    if (j == 1) {
                        System.out.printf("%d %d %d%n", i, quadrado, cubo);
                    }else if (j == 2) {
                        System.out.printf("%d %d %d%n", i, quadrado+1, cubo+1);
                    }
            }
        }
        sc.close();
    }
}
