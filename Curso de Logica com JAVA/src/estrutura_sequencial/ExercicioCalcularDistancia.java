package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalcularDistancia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro do Eixo X: ");
        double x1 = sc.nextDouble();
        System.out.println("Digite o primeiro do Eixo Y: ");
        double y1 = sc.nextDouble();
        System.out.println("Digite o Segundo valor do Eixo X: ");
        double x2 = sc.nextDouble();
        System.out.println("Digite o Segundo valor do Eixo Y: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.printf("Distancia: %.4f%n",distancia);
        sc.close();
    }
}
