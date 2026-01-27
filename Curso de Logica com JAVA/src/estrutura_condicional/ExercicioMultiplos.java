package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMultiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.print("São Multiplos");
        }else{
            System.out.print("Não São Multiplos");
        }

        sc.close();
    }
}
