package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioSomaImparesConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = 0;
        int min, max;
        if(x>y){
            min = y;
            max = x;
        }else{
            min = x;
            max = y;
        }

        for(int i= min+1; i<=max; i++){
            if(i%2 != 0){
                soma+=i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
