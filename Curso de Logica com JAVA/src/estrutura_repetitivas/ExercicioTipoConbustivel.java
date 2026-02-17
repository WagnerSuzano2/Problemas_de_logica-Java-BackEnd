package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioTipoConbustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 4) {
            codigo = sc.nextInt();

            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Codigo invalido");
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
