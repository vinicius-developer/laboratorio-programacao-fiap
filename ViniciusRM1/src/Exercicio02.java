import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Insira o valor de b");
		b = sc.nextDouble();
		
		System.out.println("Insira o valor de c");
		c = sc.nextDouble();
		
		a = b * Math.sqrt(1 + Math.pow(c/b, 2));
		
		System.out.printf("O valor de a é: " + a);
		
		sc.close();
		
	}

}
