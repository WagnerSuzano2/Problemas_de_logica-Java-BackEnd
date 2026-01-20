package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOMaior {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor:");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor:");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro valor:");
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorFinal = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.printf("O maior valor é: %d%n", maiorFinal);
        sc.close();
    }
}
