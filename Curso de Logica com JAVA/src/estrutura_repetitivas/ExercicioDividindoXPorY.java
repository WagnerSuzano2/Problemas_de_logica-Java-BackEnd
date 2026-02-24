package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDividindoXPorY {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            if (n2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = (double) n1 / n2;
                System.out.printf("%.1f%n", resultado);
            }
        }

        sc.close();
    }
}
