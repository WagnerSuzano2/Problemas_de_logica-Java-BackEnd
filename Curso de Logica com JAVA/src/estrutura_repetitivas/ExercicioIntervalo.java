package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int in = 0;
        int out = 0;


        for (int i = 1; i <= x; i++) {
            int y = sc.nextInt();
            if (y>=10 && y<=20) {
                in++;
            }else{
                out++;
            }
        }
        System.out.printf("in: %d%n",in);
        System.out.printf("out: %d%n",out);

        sc.close();
    }
}
