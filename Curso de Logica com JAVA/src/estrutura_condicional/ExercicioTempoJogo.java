package estrutura_condicional;

import java.util.Scanner;

public class ExercicioTempoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();

        int duracao;

        if (horaFim > horaInicio) {
            duracao = horaFim - horaInicio;
        }
        else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        sc.close();
    }
}