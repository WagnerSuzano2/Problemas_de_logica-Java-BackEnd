package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioSequenciaCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x =-1;
        while (x != 0) {
            x = sc.nextInt();
            if (x == 0) break;

            for (int i = 1; i <= x; i++) {
                if (i == x) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
