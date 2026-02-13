package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioCrescenteeDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int y = sc.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }



        sc.close();
    }
}
