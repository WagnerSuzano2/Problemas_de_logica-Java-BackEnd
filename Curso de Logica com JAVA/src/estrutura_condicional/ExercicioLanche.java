package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioLanche {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Código: ");
        int codigo = sc.nextInt();
        System.out.print("Digite a Quantidade: ");
        int quantidade = sc.nextInt();

        double precoTotal = 0.0;

        switch (codigo){
            case 1:
                precoTotal = 4.00 * quantidade;
                break;
            case 2:
                precoTotal = 4.50 * quantidade;
                break;
            case 3:
                precoTotal = 5.00 * quantidade;
                break;

            case 4:
                precoTotal = 2.00 * quantidade;
                break;

            case 5:
                precoTotal = 1.50 * quantidade;
                break;
        }
        System.out.printf("Total: R$%.2f%n", precoTotal);

        sc.close();
    }
}
