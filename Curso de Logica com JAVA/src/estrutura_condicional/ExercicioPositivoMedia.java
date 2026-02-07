package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPositivoMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        double somaPositivos = 0.0;

        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();

            if (valor > 0) {
                positivos++;
                somaPositivos += valor;
            }
        }

        System.out.println(positivos + " valores positivos");

        if (positivos > 0) {
            double media = somaPositivos / positivos;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
