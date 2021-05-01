import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        /* Declare duas váriaveis do tipo inteiro e chame
        * elas valor1 e valor2  */

        /* Lembrando que váriaveis não pode usar numero com primeiro caracter
        * e não se pode usar espaço */

        int valor1, valor2;

        System.out.print("Informe o primeiro valor: ");

        /* Vamos fazer agora uma forma de fazer a entrada de dados */

        /* Aqui declaramos uma váriavel com o tipo Scanner
        * e fizemos alguma uma coisa chamada instaciar uma classe
        *
        * isso significa básicamente que nossa váriavel agora se tranformou
        * na classe Scanner e todos os métodos o propridades da classe
        * agora podem ser acessados atráves da várivel
        *
        * Uma classe não é um tipo primitivo é uma tipo de dados criado na
        * linguagem
        *
        * A classe Scanner tem sempre a função de ligar algo com o meu computador
        *
        * new tem haver com orientação a objeto
        * */

        /* System.in quer dizer que vamos fazer a entrada de dados com o teclado
        *  Poderia ser um computador outro dispositivo
        *  */

        Scanner sc = new Scanner(System.in);

        /* Como o numero vai ser introduzido pelo usuário iremos utilizar agora
        *  nossa várivel que possui a classe Scanner ou seja sc */

        /*
        *  E vamos utilizar a função nextInt pois queremos receber valores inteiros
        *
        *  Existem um comando para cada tipo
        * */

        valor1 = sc.nextInt();

        System.out.print("Informe o segundo valor: ");

        valor2 = sc.nextInt();

        /* Vamos ver agora operador aritméticos
        *  Operadores aritméticos são usado para fazer
        *  operações básicas da matemática, são eles:
        *
        *  operadores binarios (trabalham com dois valores)
        *  adição = +
        *  subtração = -
        *  multiplicação = *
        *  divisão = /
        *  resto da divisão = %
        *  */

        /* Vamos supor que queremos fazer a adição dos valores introduzidos
        * pelo usuário */

        /* Podemos salvar o valor da soma em uma várivel */

        int resultado = valor1 + valor2;

        //System.out.print(resultado);

        /* Também podemos imprimir já fazendo a soma */

        System.out.print(valor1 + valor2);

        /* As duas opçoes tem o mesmo resultado */

        /* é possível fazer todoas as operações basicas dessa forma
        * só mudando o operador */

        System.out.println(valor1 - valor2);

        System.out.println(valor1 * valor2);

        /* Repare que por ser dois numeros inteiros ele dá probleminha
        *  Se eu faço operação com inteiros e resultado é inteiro
        *
        *
        *  Se eu fizer operações com tipos misto, sempre o maior tipo
        *  envolvido irá se sobre sair
        *
        *  tipoigual operação tipoigual = tipoigual
        *
        *  tipomaior operação tipomenor = tipomaior
        *
        *  tipomenor operação tipomaior = tipomaior
        *  */

        System.out.println(valor1 / valor2);

        /* Lembrando que também poderia ser feito da seguinte forma */

        System.out.println(" Fazendo internamente de outra forma ");

        resultado = valor1 - valor2;

        System.out.println(resultado);

        resultado = valor1 * valor2;

        System.out.println(resultado);

        resultado = valor1 / valor2;

        System.out.println(resultado);

        /* Todas as linguagens criadas a partir da linguagem C tem o oprador ternário */



    }
}
