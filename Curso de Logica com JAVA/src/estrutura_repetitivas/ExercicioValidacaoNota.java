package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioValidacaoNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0.0;
        int notasValidasencontradas = 0;

        while (notasValidasencontradas < 2) {
            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                notasValidasencontradas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / 2.0;
        System.out.printf("media = %.2f%n", media);
        sc.close();
    }
}
