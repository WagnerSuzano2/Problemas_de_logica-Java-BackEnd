package estrutura_condicional;

import java.util.Scanner;

public class ExercicioParesImparesPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (x > 0) {
                positivos++;
            } else if (x < 0) {
                negativos++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

        sc.close();
    }
}
