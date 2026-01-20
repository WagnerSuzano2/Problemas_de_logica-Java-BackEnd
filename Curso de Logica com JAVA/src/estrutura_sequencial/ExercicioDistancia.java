package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDistancia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();

        int tempoMinutos = distancia * 2;

        System.out.println(tempoMinutos + " minutos");

        sc.close();
    }
}
