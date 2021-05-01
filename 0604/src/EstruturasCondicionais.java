
public class EstruturasCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* 
		 * Uma das partes primodiais da programação
		 * é a estrutura de decisão, esse tipo de estrutura
		 * possui um quantidade grandissima de nomes, mas
		 * a lógica é a mesma sempre. 
		 * 
		 * Bom base em um teste lógico ou seja verdadeiro ou
		 * falso programa decide qual parte do código será 
		 * executada ou não.
		 * 
		 * */
		
		//Exemplo
		
		
		if(true) {
			System.out.println("O teste lógico é verdadeiro");
		}
		
		if(false) {
			System.out.println("O teste lógico é verdadeiro");
		}
		
		/* 
		 * No java diferente de alguma linguagens de programação os 
		 * testes lógicos precisa resultar em verdeiro ou falso
		 * não pode ser 0, 5, "sim", "true" é necessário que seja um
		 * valor booleano verdadeiro ou falso.
		 * 
		 * */
		
		/*
		 * Para ajudar nesses testes lógicos temos todo um conjunto de 
		 * operadores voltatos somente para isso, são eles os operadores
		 * relacionais. 
		 * 
		 * maior: >
		 * menor: <
		 * maior ou igual: >=
		 * menor ou igual: <=
		 * 
		 * Normalmente esse opradores são iguais, mas em algumas linguagens
		 * de programação o simbolo de iguldade ou diferença pode variar
		 * 
		 * igualdade: ==
		 * diferença: !=
		 * 
		 * Basicamente você pode ter dois itens esses itens vão utilizar os
		 * operadores relacionais, fazer um teste lógico e for verdadeiro
		 * executara os o bloo de código, se não ele não executará 
		 *  */
		
		if(5 > 3) {
			System.out.println("O teste lógico nesse caso é verdadeiro");
		}
		
		if(2 > 5) {
			System.out.println("O teste lógico nesse caso é falso");
		}
		
		if(2 < 5) {
			System.out.println("O teste lógico nesse caso é verdeiro");
		}
		
		if(2 == 5) {
			System.out.println("O teste lógico nesse caso é falso");
		}
		
		/*
		 * Nesse caso nós só utilizamos o if, mas existem duas formas 
		 * de implementar essa esse if  
		 * 
		 * que irá ajudar para excutar teste lógicos são eles
		 * 
		 * if else e else if
		 * 
		 *  */
		
		
		if (2 == 5) {
			System.out.println("O teste lógico nesse caso é verdeiro");
		} else {
			System.out.println("O teste lógico nesse caso é falso");
		}
		
		/*
		 * O programa entrará no bloco de código else caso if seja 
		 * vedadeiro e torna o cógigo mais perfomático
		 *  */
		
		
		if (2 == 5) {
			System.out.println("O teste lógico nesse caso é verdeiro");
		} else if(2 == 4) {
			System.out.println("O teste lógico nesse caso é verdeiro");
		}
		
		
		/* 
		 * Esse caso chamaos de else if ele pode estar ali e caso
		 * o teste não seja verdadeito podemos ele não entrará em nenhum dos
		 * dois blocos, também podemos encadear mais else if o quanto for necessário
		 * e podemos também finalizar o código com o else 
		 *  */
		
		
		/*
		 * No ja caso o if possua somenta um linha podemos abstrair 
		 * as chaves
		 *  */
		
		if(5 == 5)
			System.out.println("Essse teste lógico é verdadeiro");
		
		/*
		 * Em alguns cassos precisaremos fazer executar
		 * dois testes lógicos durante um if e para isso nós utilizamos 
		 * os operadores lógicos 
		 * 
		 *  || OU
		 *  && E
		 *  ^ OU Esclusivo
		 *  ! CONTRÀRIO
		 *  
		 *  Ele fará um combinação dos valres que no final chegará a
		 *  verdadeiro ou false
		 *  
		 *  Esse é o ultimo grupo de operadores 
		 *  
		 *  São eles
		 *  
		 *  Atribuição: =
		 *  Aritiméticos: +, -, /, *, %
		 *  Relacionais: ==, !=, >, <, >=, <=
		 *  Lógicos: ||, &&, !, 
		 */
		
		/* 
		 * Para fazer o operador 
		 * 
		 * >=
		 * 
		 * <=
		 * 
		 * A maquina por de baixo dos panos faz um perador ou
		 * 
		 * 
		 * */
		
		
		
		
	}

}
