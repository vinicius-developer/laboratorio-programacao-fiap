import java.util.Scanner;

public class Exec {
    public static void main(String[] args) throws Exception {

        /*
            Algoritmo para saber se a medidas do triangulo 
            é igual a um triangulo
        */

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("insira o primeiro lado do tringulo");
        a = sc.nextDouble();

        System.out.println("Insira o segundo lado do tringulo");
        b = sc.nextDouble();

        System.out.println("Insira o terceiro lado do tringulo");
        c = sc.nextDouble();


        if( a + b > c && a + c > b && b + c > a) {
            System.out.println("Esse valores coresponde da um triangulo");
        } else {
            System.out.println("Esse valor não corresponde a um triangulo");
        }


    }
}
