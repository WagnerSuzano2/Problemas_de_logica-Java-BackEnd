package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        double soma = 0.0;
        int count = 0;

        while (idade >= 0) {
            soma += idade;
            count++;
            idade = sc.nextInt();
        }

        if (count > 0) {
            double media = soma / count;
            System.out.printf("%.2f%n", media);
        } else {
            System.out.println("impossivel calcular");
        }

        sc.close();
    }
}
