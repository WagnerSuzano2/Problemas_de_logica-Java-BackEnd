package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDiferenca {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Primeiro valor: ");
        int  primeiroValor = sc.nextInt();
        System.out.print("Digite o Segundo valor: ");
        int segundoValor = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int terceiroValor = sc.nextInt();
        System.out.print("Digite o quarto valor: ");
        int quartoValor = sc.nextInt();

        int diferenca = (primeiroValor*segundoValor)-(terceiroValor*quartoValor);

        System.out.println("Diferença: "+diferenca);
        sc.close();
    }
}
