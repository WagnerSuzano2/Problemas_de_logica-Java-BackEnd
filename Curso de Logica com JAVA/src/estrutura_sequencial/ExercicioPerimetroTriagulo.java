package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPerimetroTriagulo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a Base do triangulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a Altura do triangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = (base + altura)*2.0;
        double diagonal = Math.sqrt(Math.pow(base,2.0)+Math.pow(altura,2.0));

        System.out.printf("AREA = %.4f%n",area);
        System.out.printf("PERIMENTRO = %.4f%n",perimetro);
        System.out.printf("DIAGONAL = %.4f%n",diagonal);
        sc.close();
    }
}
