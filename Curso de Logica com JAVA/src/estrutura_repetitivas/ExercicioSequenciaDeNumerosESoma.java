package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioSequenciaDeNumerosESoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x <= 0 || y <= 0) break;

            int maior, menor;
            if (x > y) {
                maior = x;
                menor = y;
            } else {
                maior = y;
                menor = x;
            }

            int soma = 0;
            for (int i = menor; i <= maior; i++) {
                soma += i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + soma);
        }
        sc.close();
    }
}
