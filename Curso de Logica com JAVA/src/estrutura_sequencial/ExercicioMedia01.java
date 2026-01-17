package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMedia01 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a Primeira Nota do aluno: ");
        double notaA = sc.nextDouble();

        System.out.print("Digite a Segunda Nota do aluno: ");
        double notaB = sc.nextDouble();

        double media = ((notaA * 3.5) + (notaB * 7.5)) / 11.0;

        System.out.printf("MEDIA = %.5f%n", media);
        sc.close();
    }
}
