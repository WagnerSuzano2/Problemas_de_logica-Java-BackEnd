package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioPUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < x; i++) { // Roda N vezes (exatamente as linhas pedidas)
            for (int j = 1; j <= 4; j++) { // Roda 4 vezes para cada linha
                soma++;
                if (soma % 4 == 0) {
                    System.out.println("PUM"); // O quarto elemento quebra a linha
                } else {
                    System.out.print(soma + " "); // Os outros três ficam na mesma linha
                }
            }
        }

        sc.close();
    }
}
