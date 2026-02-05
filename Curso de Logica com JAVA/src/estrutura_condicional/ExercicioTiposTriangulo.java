package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTiposTriangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("Digite o lado A do triangulo: ");
        double a = sc.nextDouble();
        System.out.print("Digite o lado B do triangulo: ");
        double b = sc.nextDouble();
        System.out.print("Digite o lado C do triangulo: ");
        double c = sc.nextDouble();

        if (a < b) { double temp = a; a = b; b = temp; }
        if (a < c) { double temp = a; a = c; c = temp; }
        if (b < c) { double temp = b; b = c; c = temp; }

        if (a >= (b + c)) {
            System.out.println("NÃO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}
