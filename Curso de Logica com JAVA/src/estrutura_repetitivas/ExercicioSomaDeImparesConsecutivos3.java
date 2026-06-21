package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioSomaDeImparesConsecutivos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        for (int i = 1; i <= z; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;

            if (x % 2 == 0) {
                x++;
            }

            for (int j = 1; j <= y; j++) {
                soma += x;
                x += 2;
            }

            System.out.println(soma);
        }
        sc.close();
    }
}
