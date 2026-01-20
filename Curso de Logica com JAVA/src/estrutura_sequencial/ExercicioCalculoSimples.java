package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalculoSimples {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Codigo da primeira peça: ");
        int codigo1 = sc.nextInt();

        System.out.print("Digite a quantidade da primeira peças: ");
        int quantidade1 = sc.nextInt();

        System.out.print("Digite o valor unitario da primeira peça: ");
        double valorUnitario1 = sc.nextDouble();

        System.out.print("Digite o Codigo da segunda peça: ");
        int codigo2 = sc.nextInt();

        System.out.print("Digite a quantidade da segunda peça: ");
        int quantidade2 = sc.nextInt();

        System.out.print("Digite o valor unitario da segunda peça: ");
        double valorUnitario2 = sc.nextDouble();

        double totalPagar = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2);

        System.out.printf("O valor total da compra é de: R$ %.2f", totalPagar);

        sc.close();
    }
}
