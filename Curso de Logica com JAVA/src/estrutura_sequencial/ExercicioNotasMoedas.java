package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNotasMoedas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        int centavos = (int) (n * 100.0 + 0.5);

        System.out.println("NOTAS:");

        int notas = centavos / 10000;
        System.out.printf("%d nota(s) de R$ 100.00%n", notas);
        centavos %= 10000;

        notas = centavos / 5000;
        System.out.printf("%d nota(s) de R$ 50.00%n", notas);
        centavos %= 5000;

        System.out.println("MOEDAS:");

        int moedas = centavos / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n", moedas);
        centavos %= 100;

        moedas = centavos / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", moedas);
        centavos %= 50;

        System.out.printf("%d moeda(s) de R$ 0.01%n", centavos);

        sc.close();
    }
}
