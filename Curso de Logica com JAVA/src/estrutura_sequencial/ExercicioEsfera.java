package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEsfera {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Valor do Raio:");
        double raio = sc.nextDouble();

        double volume = ((4/3.0)*Math.PI*Math.pow(raio,3));

        System.out.printf("O volume da esfera é de: %.3f%n", volume);

        sc.close();
    }
}
