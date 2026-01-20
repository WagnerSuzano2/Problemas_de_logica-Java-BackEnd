package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();

        double trianguloRentagulo = (valor1*valor3)/2;
        double areaCirculo = Math.pow(valor3,2)*Math.PI ;
        double areaTrapezio = ((valor1+valor2)*valor3)/2;
        double areaQuadrado = Math.pow(valor2,2);
        double areaRentangulo = valor1*valor2;

        System.out.printf("Valor do Triangulo Rentâgulo: %.3f%n",trianguloRentagulo);
        System.out.printf("Valor do Circulo: %.3f%n",areaCirculo);
        System.out.printf("Valor do Trapezio: %.3f%n",areaTrapezio);
        System.out.printf("Valor do Quadrado: %.3f%n",areaQuadrado);
        System.out.printf("Valor do Rentagulo: %.3f%n",areaRentangulo);

        sc.close();
    }
}
