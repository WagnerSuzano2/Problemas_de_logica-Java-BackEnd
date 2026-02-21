package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioTabuada {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0; i<=10; i++){
            System.out.printf("%d x %d = %d%n", i, x, i * x);
        }

        sc.close();
    }
}
