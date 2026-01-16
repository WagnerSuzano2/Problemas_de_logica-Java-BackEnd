package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAreaCirculo {
    public static void main(String args[]){
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double area = Math.PI*Math.pow(raio,2);

        System.out.printf("AREA = %.4f%n", area);
        sc.close();
    }
}
