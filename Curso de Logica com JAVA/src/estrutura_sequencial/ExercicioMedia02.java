package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMedia02 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Primeira Nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a Segunda Nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a Terceira Nota: ");
        double nota3 = sc.nextDouble();

        double media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
        System.out.printf("MEDIA = %.1f%n", media);

        sc.close();
    }
}
