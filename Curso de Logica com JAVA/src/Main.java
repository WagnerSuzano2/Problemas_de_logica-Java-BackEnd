import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int y =32;
            double x = 10.23233;
               System.out.println(x);
            // System.out.println(y);
            // System.out.println("Bom dia");
            System.out.printf("%.4f%n",x);
            Locale.setDefault(new Locale("en","US"));
            System.out.printf("%.4f%n",x);

            System.out.println("Resultado = "+ x +" Metros");

    }
}