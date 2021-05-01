import java.util.Scanner;

public class Calculo2 {
    public static void main(String[] args) {
        /*
          o java não possui operador gráfico para potência
          mas tem uma funcção
          Math.pow(base,expoente)

          também não possui se a raiz for diferente de quadrada e cubica

          Raiz quadrada: Math.sqrt(numero)

          Outras raizes é necessário converter para potência ou seja se pedir
          para fazer a raiz quadrade de 7

          Math.pow(base, 1.0/7)

          Math.pow(base, (double) 1/7)
        */

        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("Insira o valor de x");
        x = sc.nextDouble();

        y = Math.pow(x, (double) 1/3) + Math.pow(Math.pow((x+2), 3), (double) 1/5);

        System.out.println(y);
    }
}
