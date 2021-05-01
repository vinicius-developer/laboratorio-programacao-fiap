import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, X1, X2, X3, X4;
		
		/* Algoritmo para contar notas no caixa eletronico */
		
		System.out.println("Insira o numero");
		 n = sc.nextInt();
		 
		 X1 = n / 100; // Pega os primeiros dois digitos do numero
		 
		 X2 = n % 100 / 10; // Pega o terceiro digito do numero
		 
		 X3 = n % 10; // Pega o ultimo digito do nuemro
		
		 X4 = X1 + X2 + X3;
		 
		 System.out.println("o valor final é " + X4);
		 
		 sc.close();
	}
}
