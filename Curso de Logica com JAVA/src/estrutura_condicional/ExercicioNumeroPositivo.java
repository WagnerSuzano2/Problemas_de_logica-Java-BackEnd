package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumeroPositivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();
            if (valor > 0) {
                positivos++;
            }
        }
        System.out.println(positivos + " valores positivos");

        sc.close();
    }
}
