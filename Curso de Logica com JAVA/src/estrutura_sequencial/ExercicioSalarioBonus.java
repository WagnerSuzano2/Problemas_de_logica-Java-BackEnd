package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSalarioBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Vendedor: ");
        String nomeVendedor = sc.nextLine();

        System.out.print("Digite o salario fixo do Vendedor: ");
        double salarioVendedor = sc.nextDouble();

        System.out.print("Digite o montante total de vendas do Vendedor: ");
        double vendasVendedor = sc.nextDouble();

        double total =  salarioVendedor +(vendasVendedor*0.15);

        System.out.printf("O salario total do %s e de = R$ %.2f",nomeVendedor,total);

        sc.close();
    }
}
