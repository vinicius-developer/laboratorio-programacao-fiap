import java.util.Scanner;

/*

    Estrutura de um programa em Java

    public é um funcionamento de um relacionamento entre arquivos

    Classe é o que engloba nossa estrutura primeira letra sempre maiuscula
    e mesmo nome do arquivo

    {} representa um bloca de código

*/
public class Variaveis {
    /*
    * Na programação orienteda objetos nem sempre
    * esse bloco é necessário
    *
    * main é o coração da nossa aplicação
    * todo o código é feito aí dentro
    */
    public static void main(String[] args) {

        /* Declaração de várieis */

        /* Java é uma lingem que obriga a declaração da variavel */

        /* Quanto mais limitado a maquina que irá rodar o programa mais cuidado
        * devemos ter uma declaração de váriavel mais otimizadada */

        /* Declarar uma várivel é o momento de que declaramos que a várivel irá
        * existir no sistema
        *  */

        /* Alguma declarações de váriaveis exemplo */

        int idade;

        /* Sempre teremos ; no final da linha, só não na declaração de bloco */

        double media;

        /* Não utiliza espaço nem acentuação na declaração de várivao */

        /* A execução de um código é sempre de cima para baixo */

        /* váriaveis de mesmo tipo também podem ser declaradas na mesma linha */

        int x,y;

        /* Contantes espaços de memória que não se altera derante a execução do programa */

        /* É possivel cria uma contante que pode se tornar variável */

        /* Como armazenamos dados dentro de váriaveis? */

        /* Para isso nos utilizamos operadores esse operadores
        * são simbolos gráficos que realizam operações
        *
        *  temos grupos de operadores
        *
        *  1. Atribuição
        *  2. Aritméticos
        *  3. Ralacionais
        *  4: Lógicos
        *
        *  Exemplo de simbolos de atribuição em java
        *
        *  "=" (igual) esse sibolo armazena um dado em uma variavel
        *
        *   o armazenamento sempre é feito da seguinte forma nomeVariavel = valor
        *
        *  */

        idade = 10;

        /* tamém podemos atribuir valores durante a declaração */

        int teste = 17;

        /* E podemos sobreescrever um valor de váriavel */

        idade = 11;

        /* Idade passou a valer 11 e não 10 */

        /* Lembrando que os valores antes de ser armazenado nos espaços de memória
        * ele é convertido e armazenado em binário */

        media = 9.5;

        /* Linguagens de programação sempre seguem o padrão americano entao para
        * numeros com pontos flutuantes sempre ponto */

        /* Uma das formas de fazer a impressão de saída de dados no console é da
        * sequinte forma */

        /* A Saida de dados é pegar algo interno no programa e imprimir no console
        *  ou regitrar em outro lugar*/

        System.out.println(idade);

        /* o println imprime sempre quebra a linha, ja o print não */

        //System.out.print(idade);

        /* Para fazermos concateção em Java fazemos da sequinte forma */

        System.out.println("A minha idade é: " + idade);

        /* Lembrado que concateção é a junção de uma várivel com uma String */

        System.out.println("A minha média é: " + media);

        /* "" representa uma strign e '' representa uma caracter */



    }
}
