package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIdadeDias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int anos = n / 365;
        int resto = n % 365;

        int meses = resto / 30;

        int dias = resto % 30;

        System.out.printf("%d ano(s)%n", anos);
        System.out.printf("%d mes(es)%n", meses);
        System.out.printf("%d dia(s)%n", dias);

        sc.close();
    }
}
