package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioConversaoTempo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os segundos: ");
        int n = sc.nextInt();

        int horas = n / 3600;

        int resto = n % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        sc.close();
    }
}
