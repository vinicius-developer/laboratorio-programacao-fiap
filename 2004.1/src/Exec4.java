import java.util.Scanner;

public class Exec4 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, genero;
        double altura, pesoIdeal;

        System.out.println("Insira o seu nome: ");
        nome = sc.nextLine();


        System.out.println("Insira a sua altura");
        altura = sc.nextDouble();

        System.out.println("Insira o seu genero Feminino ou Masculino");
        genero = sc.next();


        if(genero.equalsIgnoreCase("Masculino")) {
            pesoIdeal = 72.7 * altura - 58;
            System.out.println(nome + " Seu peso ideal é: " + pesoIdeal);

        } else if(genero.equalsIgnoreCase("Feminino")){
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println(nome + " Seu peso ideal é: " + pesoIdeal);

        } else {
            System.out.println("Sinto muito não consegui decifrar o genero");
        }


    }

    
}
