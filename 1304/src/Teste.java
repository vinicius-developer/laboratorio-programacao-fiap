import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {

        int a = 2;
        int b = 7;
        int c = 4;
        int x;

        x = a % b;
        x = c % b;
        x = c % x;

        System.out.println(x);
    }


}
