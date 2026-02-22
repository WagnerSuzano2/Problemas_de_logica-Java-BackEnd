package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        do{
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double farenheit = celsius * 1.8 + 32;
            System.out.println("Farenheit: " + farenheit);
            System.out.print("Deseja repetir (s/n)? ");
             resp = sc.next().charAt(0);

        }while (resp != 'n');



        sc.close();
    }
}
