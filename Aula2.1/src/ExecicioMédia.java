import java.util.Scanner;

public class ExecicioMédia {

    public static void main(String[] args) {
        /* Reveserva de espaço em memória */
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        /* entrada de dados */
        System.out.println("Informe o primeiro numero");
        a = sc.nextDouble();

        System.out.println("Informe o segundo numero");
        b = sc.nextDouble();

        System.out.println("Informe o terceiro numero");
        c = sc.nextDouble();

        /* Processamento de dados */
        double result = ( a + b + c ) / 3;

        /* Saída de dados */
        System.out.println("Média é igual a:" + result);

        /* Quando a váriavel é double todas os tipos "menores" podem ser armazenados dentro delas */

        /* No padrão em inglês os valores são separados por . ou invés de , */


        /*
            Existem erros de sintaxe que são erros da escrita
            E erros de lógica que são erros que você não soube codificar

            ORDEM DE IMPORTANCIA DOS OPERADORES


            parentese,
            potenciação, raiz

            divisão ou multiplicação
            soma ou subtração

            Operações aritméticas são mais pesadas, pois o compilador precisa
            ficar chekando os operadores para decidir qual deve ser feiro primeiro

            Linearizar se trata de tranformar um operação
        */
    }

}
