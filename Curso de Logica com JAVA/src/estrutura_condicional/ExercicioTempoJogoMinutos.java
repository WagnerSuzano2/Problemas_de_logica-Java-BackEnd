package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTempoJogoMinutos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hInicial = sc.nextInt();
        int mInicial = sc.nextInt();
        int hFinal = sc.nextInt();
        int mFinal = sc.nextInt();

        int inicioTotal = hInicial * 60 + mInicial;
        int fimTotal = hFinal * 60 + mFinal;

        int duracaoEmMinutos = fimTotal - inicioTotal;

        if (duracaoEmMinutos <= 0) {
            duracaoEmMinutos += 24 * 60;
        }

        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        sc.close();
    }
}
