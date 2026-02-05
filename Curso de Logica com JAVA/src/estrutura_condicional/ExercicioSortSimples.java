package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSortSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int n3 = sc.nextInt();

        int a = n1, b = n2, c = n3;
        int temp;

        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (b > c) { temp = b; b = c; c = temp; }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);


        sc.close();
    }
}
