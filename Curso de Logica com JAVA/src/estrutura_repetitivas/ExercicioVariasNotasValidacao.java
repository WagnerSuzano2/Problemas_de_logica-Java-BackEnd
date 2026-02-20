package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVariasNotasValidacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int novoCalculo;

        do {
            double soma = 0.0;
            int notasValidas = 0;

            while (notasValidas < 2) {
                double nota = sc.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    soma += nota;
                    notasValidas++;
                } else {
                    System.out.println("nota invalida");
                }
            }

            double media = soma / 2.0;
            System.out.printf("media = %.2f%n", media);

            System.out.println("novo calculo (1-sim 2-nao)");
            novoCalculo = sc.nextInt();

            while (novoCalculo < 1 || novoCalculo > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = sc.nextInt();
            }

        } while (novoCalculo != 2);

        sc.close();
    }
}
