package estrutura_repetitivas;

import java.util.Scanner;

public class ExercicioSenhaFixa {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "2002";
        String tentativa = "";

        while (!tentativa.equals(senhaCorreta)) {
            System.out.println("Digite a senha: ");
            tentativa = sc.next();

            if (!tentativa.equals(senhaCorreta)) {
                System.out.println("Senha Invalida");
            }
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
