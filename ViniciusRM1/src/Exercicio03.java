import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pao, broa;
		
		double precoPao, precoBroa, total, poupanca;
		
		System.out.println("Insira a quantidade de pãezinhos");
		pao = sc.nextInt();
		
		System.out.println("Insira a quantidade de broas");
		broa = sc.nextInt();
		
		precoPao = pao * 0.12;
		
		precoBroa = broa * 1.50;
		
		total = precoBroa + precoPao;
		
		poupanca = total / 10;	
		
		System.out.printf("%nO total vendido é R$%.2f", total);
		System.out.printf("%nO total da poupança é R$%.2f", poupanca);
		
		sc.close();
		
	}

	
}
