import java.util.Scanner;

public class Extra02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Escreva um programa que que leia o nome
		 * a altura o peso de um paciente. Em seguida
		 * imprima no vídeo o se IMC */
		
		Scanner sc = new Scanner(System.in);
		
		/* Para declarar um string, por não ser um tipo 
		 * primitivo de Java nós precisamos chamar uma
		 * classe do Java e por ser uma classe ela possui
		 * a primera letra em maiuscula*/
		String nome;
		
		float peso, altura;
		
		System.out.println("É informe o nome");
		/* Esse comando é usado somente para string mas
		 * ele pega somente a primeira palavra ou tudo antes
		 * do primeiro espaço*/
		//nome = sc.next();
		
		/* Esse é o comando usado para armazenar uma frase
		 * Então com ele sim conseguimos armazenar palavra e 
		 * espaços 
		 * */
		nome = sc.nextLine();
		
		
		
		System.out.println(nome);
		
		
	}

}
