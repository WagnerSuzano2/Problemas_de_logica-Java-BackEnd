package estrutura_sequencial;

import java.util.Scanner;

public class ExercicioSoma {
    public static void main(String[] args) {
        int A,B,X;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        A = sc.nextInt();

        System.out.println("Digite novamente um valor inteiro: ");
        B= sc.nextInt();

        X = A+B;
        System.out.println("X = "+X);

        sc.close();
    }
}
