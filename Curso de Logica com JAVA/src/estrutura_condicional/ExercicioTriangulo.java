package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTriangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor do triangulo: ");
        double a = sc.nextDouble();
        System.out.println("Digite o segundo valor do triangulo: ");
        double b = sc.nextDouble();
        System.out.println("Digite o terceiro valor do triangulo: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = ((a + b) * c) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }


        sc.close();
    }
}
