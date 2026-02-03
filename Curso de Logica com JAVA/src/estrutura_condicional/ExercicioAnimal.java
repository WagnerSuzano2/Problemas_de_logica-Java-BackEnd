package estrutura_condicional;

import java.util.Scanner;

public class ExercicioAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String etapa1 = sc.nextLine();
        System.out.println("Digite a segunda palavra: ");
        String etapa2 = sc.nextLine();
        System.out.println("Digite a terceira palavra: ");
        String etapa3 = sc.nextLine();

        if (etapa1.equals("vertebrado")) {
            if (etapa2.equals("ave")) {
                if (etapa3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (etapa3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (etapa2.equals("inseto")) {
                if (etapa3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (etapa3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}