package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOMenor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.printf("MENOR: %d%n", a);
        }else{
            if (b < c) {
                System.out.printf("MENOR: %d%n", b);
            }else {
                System.out.printf("MENOR: %d%n", c);
            }
        };


        sc.close();
    }
}
