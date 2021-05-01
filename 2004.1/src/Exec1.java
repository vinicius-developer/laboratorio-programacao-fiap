import java.util.Scanner;

public class Exec1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double conta;
        int dias;

        System.out.println("Insira a quantidade de dias que você permaneceu no quarto");
        dias = sc.nextInt();
        
        if (dias > 15) {
        
            conta = 250 * dias + 36 * 15.50;

        } else {

            if(dias == 15) {

                conta = 250 * dias + 36 * dias;

            } else {

                conta = 250 * dias + 58 * dias;

            }
            
        } 


        System.out.printf("%.2f", conta);


        sc.close();
    }

}
