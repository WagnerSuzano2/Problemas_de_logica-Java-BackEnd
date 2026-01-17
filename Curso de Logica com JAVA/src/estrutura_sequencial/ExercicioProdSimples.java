package estrutura_sequencial;

import java.util.Scanner;

public class ExercicioProdSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor inteiro: ");
        int A = sc.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int B = sc.nextInt();
        int PROD = A*B;
        System.out.println("PROD = " + PROD);
        sc.close();
    }
}
