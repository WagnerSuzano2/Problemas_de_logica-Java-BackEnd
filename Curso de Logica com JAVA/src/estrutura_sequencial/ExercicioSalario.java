package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSalario {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero do funcionario: ");
        int numeroFuncionario = sc.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHoras = sc.nextDouble();

        double salario = valorHoras * horasTrabalhadas;

        System.out.println("Numero do Funcionario: " + numeroFuncionario);
        System.out.printf("Salario do Funcionario = U$ %.2f", salario);

        sc.close();
    }
}
