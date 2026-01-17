package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaPessoas {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();

        sc.nextLine(); // Limpeza de buffer: consome o "Enter" que sobrou do nextInt()

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        double media = (idade1+idade2)/2.0;

        System.out.printf("A idade Media de %s e %s é de %.1f anos %n",nome1,nome2,media);

        sc.close();
    }
}
