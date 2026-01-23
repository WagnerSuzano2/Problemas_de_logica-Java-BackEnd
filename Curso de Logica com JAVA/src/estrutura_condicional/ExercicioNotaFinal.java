package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do primeiro semestre:");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota do segundo semestre:");
        double nota2 = sc.nextDouble();

        double total  = nota1 + nota2;
        if(total<60){
            System.out.printf("Nota Final: %.1f%n",total);
            System.out.print("REPROVADO");

        }else{
            System.out.printf("Nota Final: %.1f%n",total);
            System.out.print("APROVADO");
        }

        sc.close();
    }
}
