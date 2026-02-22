package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("NULL");
            } else {
                if (y % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }

                if (y > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }

        sc.close();
    }
}
