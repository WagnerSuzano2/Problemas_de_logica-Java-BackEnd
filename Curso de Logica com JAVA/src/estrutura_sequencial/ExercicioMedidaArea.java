package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMedidaArea {
    public static void main(String[] args) {
        double largura, comprimento, metroQuadrado, area, preco;

        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura: ");
        largura = sc.nextDouble();

        System.out.println("Digite a comprimento: ");
        comprimento = sc.nextDouble();

        System.out.println("Digite a metro quadrado: ");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;
        System.out.printf("Area: %.2f%n",area);
        System.out.printf("Preco: %.2f%n",preco);
        sc.close();
    }
}
