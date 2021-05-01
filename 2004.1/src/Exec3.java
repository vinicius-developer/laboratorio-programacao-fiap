import java.util.Scanner;

public class Exec3 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String faculadade;

        System.out.println("Em qual faculdade você estuda? ");
        faculadade = sc.nextLine();

        /* 
            Pela string ser não ser um tipo primitivo da linguagem
            precisamos utilizar o método disponível na classe
            string equals() e invés de utilizar ==

            Todas as vezes que o tipo da váriavel for uma classe
            o invés de um tipo primitivo nós utilizamos o 
            equals()

            também utulizamos toLowerCase para deixar todas 
            as letras em minusculo antes de comparar

            mas tabém podemos usar o equalsIgnoreCase()
            para ignorar se a letra é minuscula ou maiuscula

        */

        if(faculadade.equalsIgnoreCase("fiap")) {
            System.out.println("Nossa parabéns");
        } else {
            System.out.println("Poxa que triste");
        }

        sc.close();
    }

}
