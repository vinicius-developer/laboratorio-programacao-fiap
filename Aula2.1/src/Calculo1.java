import java.util.Scanner;

public class Calculo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
          Sempre quando não temos certeza sobre
        * qual será o conteudo inputado demover utilizar double
        */

        double a,b,c,x;

        System.out.println("insira o valor de A");
        a = sc.nextDouble();

        System.out.println("insira o valor de b");
        b = sc.nextDouble();

        System.out.println("Insire o valor de c");
        c = sc.nextDouble();

        /*  */
        x = ( - b - b * b * b - 4 * a * c + 2 * a * a) / ( 2 * a / (( b + 1) * ( b + 1)));

        System.out.println("valor da x é " + x );

    }
}
