package introducao_java;

import java.util.Scanner;

public class TipoEntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x + " " + y + " " + z);

        sc.close();
    }
}
