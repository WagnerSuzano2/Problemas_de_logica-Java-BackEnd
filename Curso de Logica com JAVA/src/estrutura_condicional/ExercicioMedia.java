package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMedia {
    public  static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        double num3 = sc.nextDouble();
        System.out.print("Digite o quarto numero: ");
        double num4 = sc.nextDouble();

        double media = (num1*2+num2*3+num3*4+num4*1)/10;
        if(media>=7.0){
            System.out.printf("Media: %.1f%n",media);
            System.out.println("Aluno Aprovado");
        }else if(media>=5.0 && media<=6.9){
            System.out.printf("Media: %.1f%n",media);
            System.out.println("Aluno em Exame.");
            System.out.print("Digite a nota do exame do aluno: ");
            double notaExame = sc.nextDouble();
            double mediaFinal = (notaExame + media)/2;
            if(mediaFinal>=5.0){
                System.out.println("Aluno Aprovado");
                System.out.printf("Media Final: %.1f%n",mediaFinal);
            }else{
                System.out.println("Aluno Reprovado");
            };
        }else{
            System.out.println("Aluno Reprovado");
        }

        sc.close();
    }
}
