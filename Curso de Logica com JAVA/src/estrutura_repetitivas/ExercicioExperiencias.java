package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioExperiencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coelhos =0;
        int sapos =0;
        int ratos =0;
        int total=0;
        int x = sc.nextInt();


        for(int i=1;i<=x;i++){
            int y = sc.nextInt();
            char z = sc.next().charAt(0);
            total+=y;
            switch(z){
                case 'C':
                    coelhos+=y;
                    break;
                case 'S':
                    sapos+=y;
                    break;
                case 'R':
                    ratos+=y;
                    break;
            }
        }
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        double mediasapos = (double) sapos/total*100;
        double mediacoelhos = (double) coelhos/total*100;
        double mediaratos = (double) ratos/total*100;

        System.out.printf("Percentual de coelhos: %.2f %%%n", mediacoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", mediaratos);
        System.out.printf("Percentual de sapos: %.2f %%%n", mediasapos);


        sc.close();
    }
}
