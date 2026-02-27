package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioQuadradoAoCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= 3; j++){
                if(j==1){
                    System.out.print(i+" ");
                } else if (j==2) {
                    System.out.print(i*i+" ");
                }else {
                    System.out.println(i*i*i);
                }
            }
        }

        sc.close();
    }
}
