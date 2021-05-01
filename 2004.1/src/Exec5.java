import java.util.Scanner;

public class Exec5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.println("Insira o valor de a: ");
        a = sc.nextDouble();

        if(a == 0) 
            System.out.println("a precisar ser um numero diferente de 0"); 
        else {

            System.out.println("Insira o valor de b: ");
            b = sc.nextDouble();
    
            System.out.println("Insira o valor de c: ");
            c = sc.nextDouble();
    
    
            delta = Math.pow(b, 2) - 4 * a * c;
    
            if(delta < 0) 
                 System.out.println("Delta nesse caso é negativo");  
            else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
    
                x2 = (-b - Math.sqrt(delta)) / (2 * a);


                System.out.println("Seu valoe de delta é: " + delta);
                System.out.println("x1 é igual a: " + x1 + " e x2 é igual a: " + x2);
            }      
        }

        sc.close();
    }
}
