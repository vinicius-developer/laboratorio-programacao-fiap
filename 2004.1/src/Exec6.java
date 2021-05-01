import java.util.Scanner;

public class Exec6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int v1, v2, v3;

        System.out.println("Insira o primeiro valor");
        v1 = sc.nextInt();

        System.out.println("Insira o segundo valor");
        v2 = sc.nextInt();

        System.out.println("Insira o teceiro valor");
        v3 = sc.nextInt();

        if(v1 != v2 && v1 != v3 && v2 != v1 && v2 != v3 && v3 != v1 && v3 != v2){

            if(v1 < v2 && v1 < v3) 
                System.out.println("O menor numero é " + v1);
            else if(v2 < v1 && v2 < v3) 
                System.out.println("O menor numero é " + v2);    
            else if(v3 < v1 && v3 < v2)
                System.out.println("O menor numero é " + v3);    

        } else {
            System.out.println("Há numero iguais parabéns");
        }

        sc.close();
    }

}
