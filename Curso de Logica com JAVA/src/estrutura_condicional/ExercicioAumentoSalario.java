package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAumentoSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salario:");
        double salario = sc.nextDouble();
        double novoSalario = 0;
        double reajuste =0;
        int porcentagem = 0;

        if(salario>0 && salario<=400.00){
            reajuste = salario*0.15;
            novoSalario = salario+reajuste;
            porcentagem = 15;
        }else if(salario>=400.01 && salario<=800.00){
            reajuste = salario*0.12;
            novoSalario = salario+reajuste;
            porcentagem = 12;
        }else if(salario>=800.01 && salario<=1200.00){
            reajuste = salario*0.10;
            novoSalario = salario+reajuste;
            porcentagem = 10;
        }else if(salario>=1200.01 && salario<=2000.00){
            reajuste = salario*0.07;
            novoSalario = salario+reajuste;
            porcentagem = 7;
        }else{
            reajuste = salario*0.04;
            novoSalario = salario+reajuste;
            porcentagem = 4;
        }

        System.out.printf("Novo salario: %.2f%n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n",reajuste);
        System.out.printf("Em percentual: %d %%%n", porcentagem);

        sc.close();
    }
}
