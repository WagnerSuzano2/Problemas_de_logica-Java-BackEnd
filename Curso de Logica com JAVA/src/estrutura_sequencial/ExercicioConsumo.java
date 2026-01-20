package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioConsumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distancia pecorrida:");
        int distancia = sc.nextInt();
        System.out.print("Digite a quantidade de gasolina:");
        double gasolina = sc.nextDouble();

        double consumoMedio = distancia/gasolina;

        System.out.printf("Consumo medio por km: %.3f%n",consumoMedio);

        sc.close();
    }
}
