package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTesteSelecao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ( (b>c&& d>a) && ((c+d)>(b+a)) && (c>0 && d>0) && (a%2 == 0) ) {
            System.out.print("Valores aceitos");
        }else{
            System.out.print("Valores não aceitos");
        };

        sc.close();
    }
}
