import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            Na maioria das linguagens de programação existem o operador resto da divisão
            que é o numero que sobra da divisão
            O resto não continua na divisão real.
        */

        /*
        *  Na maioria das linguagens de programação esse operador é representado por %,
        *  mas em alguma linguagens de programação pode ser representado por MOD
         */

        //System.out.println(10 % 2);

        /*
        *  O resultado do exemplo acima dá 0
        */

        //System.out.println(9 % 4);

        /*
         *  O resultado do exemplo acima dá 1
         */

        //System.out.println(5 % 72);

        /*
            O resultado desse resto é 5 pq 5 não é divisivel
            por 72
         */

        /*
        *   Trabalhamos muito com isso em matemática modular que é usada em
        *   criptografia
        *
        *   Pode ser usado também para descobrir se uma numero é par ou impar
        *
        *   Um numero sempre é par se divido por dois ele é igual a 0
        *
        *   NORMALMENTE UTILIZAMOS PARA NUMEROS INTEIROS
        *
        *   Tambem podemos utilizar para descobrir se um ano é bisexto ou não
        *
        *   Também podemos utilizar para converter para numeros binários
        *
        *   Qualquer numero divido por dois vai dar resto 0 ou 1
        *
        *   Como tranformar em binário
        *  */



        int dec = sc.nextInt();
        String bin = "";

        do {
           bin += Integer.toString(dec % 2);
           dec = dec / 2;
        }while (dec > 1);

        System.out.println(bin);


        /*
         *   Quando nós fazemos uma divisão com dois numero inteiros ele íra gerar numeros
         *   inteiros o problema não é da várivel que recebe e sim dos numeros interos
         *   que estamos usado para fazer a divisão.
         *
         *   int / int = int
         *
         *   double / int = sempre o resultado nesse caso é o maior tipo na operação
         *   o maior inteiro é o que aguente mais espaço;
         *
         *
         *   Uma das soluções para isso é trocar as váriaveis para double, mas isso
         *   faz com que mais memória seja ocupada na memória.
         *
         *   Podemos fazer a conversão de tipos (kasting|kast)
         * */

//        int valor1 = 30, valor2 = 14;
//        double quociente;
//
//        quociente = (double) valor1 / valor2;
//                    /*kast*/
//        System.out.println(quociente);


//
//
//        double a, b, c;
//
//        a = sc.nextDouble();
//
//        b = sc.nextDouble();
//
//        c = sc.nextDouble();
//
//        double result = ( a + b + c ) / 3;
//
//        System.out.println(result);

    }
}
