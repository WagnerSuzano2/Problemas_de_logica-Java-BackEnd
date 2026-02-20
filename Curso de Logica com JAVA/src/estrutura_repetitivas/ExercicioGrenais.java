package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioGrenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =0;
        int inter =0;
        int gremio =0;
        int empates =0;
        int interVitoria =0;
        int gremioVitoria =0;
        int grenais = 0;

        while(x != 2){
            inter = sc.nextInt();
            gremio = sc.nextInt();
            if(inter >gremio){
                interVitoria++;
            }else if(inter < gremio){
                gremioVitoria++;
            }else{
                empates++;
            }
            grenais++;
            System.out.println("Novo Grenal 1-Sim ou 2-Não?");
            x = sc.nextInt();
        }

        System.out.printf("Grenais totais: %d%n", grenais);
        System.out.printf("Inter: %d%n", interVitoria);
        System.out.printf("Gremio: %d%n", gremioVitoria);
        System.out.printf("Empates: %d%n", empates);
        if(interVitoria>gremioVitoria){
            System.out.println("Inter ganhou mais jogos");
        }else if(interVitoria<gremioVitoria){
            System.out.println("Gremio ganhou mais jogos");
        }else{
            System.out.println("Não houver vencedor");
        }
        sc.close();
    }
}
