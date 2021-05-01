import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valorInserido, primeiro, ultimo, soma;
		
		System.out.println("Insira um valor de 4 digitos");
		valorInserido = sc.nextInt();
		
		if(valorInserido > 999 && valorInserido < 10000) {
				
			primeiro = valorInserido / 1000;
			
			ultimo = valorInserido % 10;
			
			soma = primeiro + ultimo;
			
			System.out.println("A soma do primeiro e ultimo numero é: " + soma);
			
		} else {
			System.out.println("Este numero possui mais ou menos que quatro digitos");
		}
			
		sc.close();

	}

}
