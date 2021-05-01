import java.util.Scanner;

public class Calculo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, x;

        System.out.println("Insira o valor de a: ");
        a = sc.nextDouble();

        System.out.println("Insira o valor de b: ");
        b = sc.nextDouble();

        System.out.println("Insire o valor de c: ");
        c = sc.nextDouble();

        x = (-b + Math.sqrt(b * 2 - -4 * a * c)) / (2*a);

        System.out.println("Resultado é: " + x);
    }
}
