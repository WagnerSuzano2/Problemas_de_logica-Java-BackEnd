package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) {
            int soma = 0;
            int count = 0;

            if (x % 2 != 0) {
                x++;
            }

            while (count < 5) {
                soma += x;
                x += 2;
                count++;
            }

            System.out.println(soma);

            x = sc.nextInt();
        }


        sc.close();
    }
}
