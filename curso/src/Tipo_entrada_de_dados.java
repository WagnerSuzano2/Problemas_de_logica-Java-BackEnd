import java.util.Scanner;

public class Tipo_entrada_de_dados {
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
