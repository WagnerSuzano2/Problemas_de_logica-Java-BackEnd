package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioImpostoRenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salario: ");
        double salario = sc.nextDouble();
        double imposto = 0.00;
        if (salario <= 2000.00) {
            System.out.println("Isento");
        }
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else if (salario <= 4500.00) {
            imposto = 80.00 + (salario - 3000.00) * 0.18;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else {
            imposto = 80.00 + 270.00 + (salario - 4500.00) * 0.28;
            System.out.printf("R$ %.2f%n", imposto);
        };

        sc.close();
    }
}
