import java.util.Scanner;

public class Exec2 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    

        /*
            No java a String é uma estrutura de dados que 
            e não um tipo primitivo, por isso ele é uma classe
            e utilizamos ele com a primeira letra maiuscula
        */
        String nome;
        int idade;
        /*  
            Para armazenar valores vindos do teclado em uma 
            váriavel do tipo string podemos fazer de duas forma


            com o método next 
            e o nextLine

            a diferença entre os dois é que o next armazena 
            somente a primeira palavra 

            já o next line consegue armazernar valores mesmo com
            espaço

            então o next seria mais para só palavras

            já o nextLine para frases digamos assim.

            No caso a baixo nos enserimos primeiramente o nome 
            antes da idade 
            
            se nós fizermos o inverso acontece um comportamento 
            estranho
            
            isso acontece pq quando nós inserimos o primeiro valor
            como numeros e depois apertar enter para 

            o computador irá pegra o numero e deixar o caractere 
            enter isso faz com que o valor enter seja jogado na string

            isso fará com que não consigamos digitar para ocupar a string

            para resolver isso utilizamos um método para pegar esse caracter 
            e jogar fora pode ser o next ou o nextLine

        */
        System.out.println("Qual a sua idade?");
        idade = sc.nextInt();
        sc.next(); // ou também pode ser usado o nextLine
        

        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        
        sc.close();
    }

}
